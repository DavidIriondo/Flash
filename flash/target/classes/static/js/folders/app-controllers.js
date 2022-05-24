import { Controller } from "../files/welcome-page/controller.js";

export class AppController{
  name = "controllers"

  helloController = new Controller();

  getName(){
    return this.name;
  }

  buildFolder(zip){
    this.folder = zip.folder(this.name);
    //init file
    this.folder.file("__init__.py", "");
    //controller file
    this.folder.file(this.helloController.getName(), this.helloController.getContent());
  }

}