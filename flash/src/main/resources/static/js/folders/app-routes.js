import {Routes} from "../files/welcome-page/routes.js"

export class AppRoutes{
  name = "routes"

  helloRoutes = new Routes();

  getName(){
    return this.name;
  }

  buildFolder(zip){
    this.folder = zip.folder(this.name);
    //init file
    this.folder.file("__init__.py", "");
    //controller file
    this.folder.file(this.helloRoutes.getName(), this.helloRoutes.getContent());
  }

}