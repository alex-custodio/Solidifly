import 'package:flutter/material.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';

class GoogleButton extends StatelessWidget {
  final String buttonName;
  final VoidCallback onPressed;
  const GoogleButton({
    Key? key,
    required this.buttonName,
    required this.onPressed,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.only(left: 60.0, right: 60.0, top: 70.0),
      child: ElevatedButton.icon(
        style: ElevatedButton.styleFrom(
          primary: Colors.white,
          shape: const StadiumBorder(),
          padding: const EdgeInsets.symmetric(vertical: 15.0),
        ),
        icon: const FaIcon(FontAwesomeIcons.google, color: Colors.red),
        onPressed: onPressed,
        label: const Text(
          "Sign Up with Google",
          style: TextStyle(color: Colors.grey, fontSize: 20),
        ),
      ),
    );
  }
}
