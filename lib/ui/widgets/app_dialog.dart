import 'package:flutter/material.dart';

class AppDialog extends StatelessWidget {
  final String content;
  final String title;
  final VoidCallback onPressed;
  const AppDialog(
      {Key? key,
      required this.content,
      required this.title,
      required this.onPressed})
      : super(key: key);
  @override
  Widget build(BuildContext context) {
    return AlertDialog(
      title: Text(title),
      content: Text(content),
      actions: [TextButton(onPressed: onPressed, child: const Text("Ok"))],
    );
  }
}
