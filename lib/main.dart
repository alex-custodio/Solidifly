import 'package:flutter/material.dart';
import 'package:firebase_core/firebase_core.dart';
import 'package:solidifly/utils/routes.dart';


Future main () async {
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp();

  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Solidifly',
      theme: ThemeData(
        scaffoldBackgroundColor: const Color(0xffffffff)
      ),
      initialRoute: "/home",
      routes: routes(),
    );
  }
}

