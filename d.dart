import 'dart:convert';
import 'dart:io';

void main() {
  Socket s;


  Socket.connect('127.0.0.1', 9952).then((value) {
    s = value;
    s.listen((event) {
      print(ascii.decode(event));
    });
    s.writeln('pc');
  });
}
