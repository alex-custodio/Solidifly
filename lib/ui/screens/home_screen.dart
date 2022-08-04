import 'package:flutter/material.dart';
import 'package:solidifly/utils/constantes.dart';


class HomeScreen extends StatelessWidget {
  const HomeScreen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: PreferredSize(
        preferredSize: const Size.fromHeight(appBarSize),
        child: AppBar(
          title: const Center(child: Text("Início", style: TextStyle(fontSize: appBarFont),)),
          backgroundColor: mainColor,
          elevation: 0,
        ),
      ),
      body: ListView(
        children: [
          Padding(
            padding: const EdgeInsets.all(8.0),
            child: Row(
              children: [
                Container(
                  height: 150,
                  width: 150,
                  decoration: BoxDecoration(
                      shape: BoxShape.circle, color: Colors.amber),
                ),
                Text("mdgsadgdasgasd"),
              ],
            ),
          ),
          Padding(
            padding:
                const EdgeInsets.only(top: 50, bottom: 30, left: 80, right: 80),
            child: Container(
              height: 50,
              width: 70,
              child: const Center(
                child: Text(
                  "Smart Contracts",
                  style: TextStyle(fontSize: 25, color: textColor),
                ),
              ),
              decoration: const BoxDecoration(
                  borderRadius: BorderRadius.all(Radius.circular(20)),
                  color: backgroudColor),
            ),
          ),
          const Padding(
            padding: EdgeInsets.only(left: 10.0, right: 10.0, bottom: 40.0),
            child: Text(
              "Crie e faça deply do seu smart contract de maneira interativa clicando no botão abaixo",
              style: TextStyle(fontSize: 20),
            ),
          ),
          ElevatedButton(
            child: const Icon(
              Icons.add,
              size: 40,
            ),
            onPressed: () {
              Navigator.of(context).pushNamed("/create");
            },
            style: ElevatedButton.styleFrom(
              fixedSize: const Size(60, 60),
              shape: const CircleBorder(),
              primary: addButtonColor,
            ),
          )
        ],
      ),
    );
  }
}
