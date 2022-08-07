import 'package:flutter/material.dart';
class AppButton extends StatelessWidget {
  final String buttonName;
  final VoidCallback onPressed;
  final Color buttonColor;

  const AppButton({
    Key? key,
    required this.buttonName,
    required this.onPressed,
    required this.buttonColor,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.only(left: 30.0, right: 30.0, top: 70.0),
      child: ElevatedButton(
        child: Text(
          buttonName,
          style: const TextStyle(
            fontSize: 20.0,
          ),
        ),
        style: ElevatedButton.styleFrom(
          padding: const EdgeInsets.symmetric(horizontal: 40.0, vertical: 20.0),
          primary: buttonColor,
          shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(15),
          ),
        ),
        onPressed: onPressed,
      ),
    );
  }
}
