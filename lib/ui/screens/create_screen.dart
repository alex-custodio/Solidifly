import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:solidifly/ui/widgets/app_button.dart';
import 'package:solidifly/ui/widgets/app_form.dart';
import 'package:solidifly/utils/constantes.dart';

class CreateScreen extends StatelessWidget {
  const CreateScreen({
    Key? key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final TextEditingController controllerName = TextEditingController();
    final TextEditingController controllerAge = TextEditingController();
    final TextEditingController controllerPrivateKey = TextEditingController();
    MethodChannel platform = const MethodChannel("com.lisbom/java");

    Map<String, String> getData() {
      final name = controllerName.text;
      final age = controllerAge.text;
      final privateKey = controllerPrivateKey.text;
      Map<String, String> data = {
        'name': name,
        'age': age,
        'privateKey': privateKey,
      };
      return data;
    }

    Future<void> sendDataToJava() async {
      var dataMap = getData();
      String publicKey = "";
      String contractAdress = "";
      try {
        publicKey = await platform.invokeMethod("getPublicKey", dataMap);
        //contractAdress = await platform.invokeMethod("getSmartContractAddress");
        print(publicKey);
        //print(contractAdress);
      } catch (e) {
        print(e);
      }
    }

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
          AppForm(
            hintText: "Adicione o seu nome ao smart contract",
            controller: controllerName,
          ),
          AppForm(
            hintText: "Adicione a sua idade no smart contract",
            controller: controllerAge,
          ),
          AppForm(
            hintText: "Adicione a sua chave privada ao smart contract",
            controller: controllerPrivateKey,
          ),
          AppButton(
            buttonName: "Criar e fazer deploy",
            onPressed: () {
              sendDataToJava();
              Navigator.of(context).pushNamed("/create");
            },
            buttonColor: backgroudColor,
          )
        ],
      ),
    );
  }
}
