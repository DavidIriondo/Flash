import {Web} from "../files/welcome-page/web.js"

export class AppTemplates{
  name = "templates"

  helloHtml = new Web();

  getName(){
    return this.name;
  }

  buildFolder(zip){
    this.folder = zip.folder(this.name);

    //html file
    this.folder.file(this.helloHtml.getName(), this.helloHtml.getContent());
  }

}