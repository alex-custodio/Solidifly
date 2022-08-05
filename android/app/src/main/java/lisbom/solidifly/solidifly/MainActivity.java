package lisbom.solidifly.solidifly;

import androidx.annotation.NonNull;

import java.util.Map;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;

public class MainActivity extends FlutterActivity {
    private static String name;
    private static String age;
    private static String privateKey;
    private static final String CHANNEL = "com.lisbom/java";

    public static void main(String[] args) {
        try {
            new Transaction();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine){
        super.configureFlutterEngine(flutterEngine);
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), CHANNEL)
                .setMethodCallHandler(
                        (call, result) -> {
                            final Map<String, String> arg = call.arguments();
                            name = arg.get("name");
                            age = arg.get("age");
                            privateKey = arg.get("privateKey");
                            if (call.method.equals("getPublicKey")){
                                System.out.println(name);
                                System.out.println(age);
                                System.out.println(privateKey);
                            }else{
                                System.out.println("not done");
                            }
                        }

                );
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), CHANNEL)
                .setMethodCallHandler(
                        (call, result) -> {
                            if (call.method.equals("getContractAddress")){
                                System.out.println(name);
                                System.out.println(age);
                                System.out.println(privateKey);
                            }else{
                                System.out.println("not done");
                            }
                        }

                );
    }
}
