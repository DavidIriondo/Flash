import { AppFile } from "../files/app-file.js";
import { Requirements } from "../files/requirements.js";
import {App} from "./app.js"
import { Config } from "./config.js";

export class Project{ 

  constructor(name, zip){
    this.name = name;
    this.zip = zip;
  }

  //Folder
  appFolder = new App();
  configFolder = new Config(this.zip);
  //Files
  appFile = new AppFile();
  requirements = new Requirements();

  buildProject(){
    //Creating app folder
    this.appFolder.buildFolder(this.zip);
    //Creating migrations folder
    this.zip.folder("migrations");
    //Creating test folder
    this.zip.folder("tests");
    //Creating config folder
    this.configFolder.buildFolder(this.zip);
    //Creating db folder
    this.zip.folder("db");
    //Creating app file
    this.zip.file(this.appFile.getName(), this.appFile.getContent());
    //Creating requirements file
    this.zip.file(this.requirements.getName(), this.requirements.getContent());    
  }

  getProject(){
    return this.zip;
  }

  setName(name){
    this.name = name;
  }

  getName(){
    return this.name;
  }
}

