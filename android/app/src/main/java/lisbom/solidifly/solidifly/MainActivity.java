package lisbom.solidifly.solidifly;


import androidx.annotation.NonNull;

import java.util.Map;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;

import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.DefaultGasProvider;

public class MainActivity extends FlutterActivity {
    private static String name;
    private static String age;
    private static String privateKey;
    private static final String CHANNEL = "com.lisbom/java";
    
    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine)  {
        super.configureFlutterEngine(flutterEngine);
        
        //System.out.print(contractAddress);
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), CHANNEL)
                .setMethodCallHandler(
                        (call, result) -> {
                            final Map<String, String> arg = call.arguments();
                            name = arg.get("name");
                            age = arg.get("age");

                            privateKey = arg.get("privateKey");

                            new Thread(new Runnable(){
                                @Override
                                public void run() {
                                    String PK = "";
                                    Web3j web3j = Web3j.build(new HttpService("HTTP://192.168.100.15:7545"));
                                    try {
                                        String contractAddress = Human.deploy(web3j, Credentials.create(PK), new DefaultGasProvider()).send().getContractAddress();
                                    } catch (Exception e) {
                                        System.out.print("kkkkkkkkkkkk");
                                        e.printStackTrace();
                                    }
                                }
                            }).start();
                            if (call.method.equals("getPublicKey")){

                                System.out.println("name Java: " + name);
                                result.success(getPublicKey());
                                //System.out.print("getCredentialsFromPrivateKey.getAddress");
                            }else{
                                System.out.println("not done");
                            }
                        }

                );


    }
    //public static Credentials getCredentialsFromPrivateKey(){
    ///    return Credentials.create(privateKey);
    //}
    //public String getSmartContractAddress(){
    //    return MainActivity.contractAddress;
    //}
    public String getPublicKey(){
        return "publicKey";
    }


}
