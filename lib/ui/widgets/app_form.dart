import 'package:flutter/material.dart';
import 'package:solidifly/utils/constantes.dart';

class AppForm extends StatefulWidget {
  final String hintText;

  const AppForm({
    Key? key,
    required this.hintText,
  }) : super(key: key);

  @override
  State<AppForm> createState() => _AppFormState();
}

class _AppFormState extends State<AppForm> {
  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.only(left: 30.0, right: 30.0, top: 70.0),
      child: TextFormField(
        decoration: InputDecoration(
          border: const OutlineInputBorder(
              borderRadius: BorderRadius.all(Radius.circular(20)),
              ),
          hintText: widget.hintText,
          
          contentPadding:
              const EdgeInsets.symmetric(vertical: 25, horizontal: 15),
          fillColor: fieldBackgroudColor,
          filled: true,

        ),
      ),
    );
  }
}
