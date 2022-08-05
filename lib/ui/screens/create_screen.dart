import 'package:flutter/material.dart';
import 'package:solidifly/ui/widgets/app_button.dart';
import 'package:solidifly/ui/widgets/app_form.dart';
import 'package:solidifly/utils/constantes.dart';

class CreateScreen extends StatelessWidget {
  const CreateScreen({
    Key? key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: PreferredSize(
        preferredSize: const Size.fromHeight(appBarSize),
        child: AppBar(
          title: const Center(
              child: Text(
            "Criar",
            style: TextStyle(fontSize: appBarFont),
          )),
          backgroundColor: mainColor,
          elevation: 0,
        ),
      ),
      body: ListView(
        children: [
          const AppForm(
            hintText: "Adicione o seu nome ao smart contract",
          ),
          const AppForm(
            hintText: "Adicione a sua idade no smart contract",
          ),
          const AppForm(
            hintText: "Adicione a sua chave privada ao smart contract",
          ),
          AppButton(buttonName: "Criar e fazer deploy", onPressed: () {}, buttonColor: backgroudColor,)
        ],
      ),
    );
  }
}
