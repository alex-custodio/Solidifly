package lisbom.solidifly.solidifly;


import androidx.annotation.NonNull;

import java.math.BigInteger;
import java.util.HashMap;
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
    private static String PK="";
    private static String contractAddress="";
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


                            if (call.method.equals("getPrivateKey")){
                                new Thread(new Runnable(){

                                    @Override
                                    public void run() {
                                        //PK = "639290ce3612ffbbf4e0dd0cf9a1c88371bccfb6889e1ded87ed2ca4ba3af796";
                                        PK = "8930d3629c0ba7b390b0ebbc02fe336cff6594362f2443514c9c6dd35930c764";
                                        Web3j web3j = Web3j.build(new HttpService("HTTP://192.168.100.15:7545"));
                                        try {
                                            Credentials credentials = Credentials.create(PK);

                                            Human contract = Human.deploy(web3j, credentials, new DefaultGasProvider()).send();
                                            contract.setAge(new BigInteger(age)).send();
                                            contract.setName(name).send();
                                            
                                            contractAddress = contract.getContractAddress();
                                            
                                            result.success(credentials.getAddress() + "-" + contractAddress);
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }

                                    }
                                }).start();
                                


                                //System.out.print("getCredentialsFromPrivateKey.getAddress");
                            }else{
                                System.out.println("not done");
                            }
                        }

                );


    }
    //public String getSmartContractAddress(){
    //    return MainActivity.contractAddress;
    //}
    public String getPrivateKey(){
        return PK;
    }


}
