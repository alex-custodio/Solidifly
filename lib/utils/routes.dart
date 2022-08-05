import 'package:flutter/material.dart';
import 'package:solidifly/login_state.dart';
import 'package:solidifly/ui/screens/create_screen.dart';
import 'package:solidifly/ui/screens/home_screen.dart';

Map<String, WidgetBuilder> routes() {
  final Map< String,WidgetBuilder> routes = <String, WidgetBuilder>{};

  routes["/login"] = (context) => const LoginState();
  routes["/home"] = (context) => const HomeScreen();
  routes["/create"] = (context) => const CreateScreen();
  //routes["/deploy"] = (context) => const DeployScreen();
  
  return routes;
}
