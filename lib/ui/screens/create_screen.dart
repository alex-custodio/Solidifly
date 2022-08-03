import 'package:flutter/material.dart';
import 'package:solidifly/ui/widgets/app_form.dart';
import 'package:solidifly/utils/constantes.dart';


class CreateScreen extends StatefulWidget {


  const CreateScreen({ Key? key, 
  }) : super(key: key);

  
  @override
  State<CreateScreen> createState() => _CreateScreenState();
}

class _CreateScreenState extends State<CreateScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: PreferredSize(
        preferredSize: const Size.fromHeight(appBarSize),
        child: AppBar(
          title: const Center(child: Text("Criar", style: TextStyle(fontSize: appBarFont),)),
          backgroundColor: mainColor,
          elevation: 0,
        ),
      ),
      body: ListView(
        children: const [
           AppForm(
              hintText: "Adicione o seu nome ao smart contract",
            
          ),
          AppForm(
            hintText: "Adicione a sua idade no smart contract",
          ),
          AppForm(
            hintText: "Adicione a sua chave privada ao smart contract",
          ),
        ],
      ),
    );
  }
}