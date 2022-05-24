export class Controller{
  
  getName(){
    return "hello_controller.py";
  }

  getContent(){
    return`from flask import render_template

import app

#Welcome page controller
def welcome():
    return render_template("hello.html")`;
  }
}