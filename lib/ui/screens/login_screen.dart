import 'package:flutter/material.dart';
import 'package:solidifly/utils/constantes.dart';


class LoginScreen extends StatefulWidget {
  const LoginScreen({Key? key}) : super(key: key);

  @override
  State<LoginScreen> createState() => _LoginScreenState();
}

class _LoginScreenState extends State<LoginScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        width: double.infinity,
        decoration: const BoxDecoration(
            color: mainColor,
            image: DecorationImage(
              image: AssetImage("assets/images/image 1.png"),
            )),
      ),
    );
  }
}
