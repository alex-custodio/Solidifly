import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:solidifly/ui/provider/google_sign_in.dart';
import 'package:solidifly/ui/widgets/google_button.dart';
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
        color: mainColor,
        child: ListView(
          children: [
            Image.asset('assets/images/image 1.png'),
            GoogleButton(buttonName: "Sigin with google", onPressed: () {
             
             final provider = Provider.of
             <GoogelSignInProvider>(context, listen: false);
             provider.googleLogin();
             
            })
          ],
        ),
      ),
    );
  }
}
