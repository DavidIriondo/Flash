import { AppFile } from "../files/app-file.js";
import { Requirements } from "../files/requirements.js";
import {App} from "./app.js"
import { Config } from "./config.js";

export class Project{ 

  constructor(map, list, zip){
    this.map = map;
    this.list = list;
    this.name = map.get("project-name");
    this.zip = zip;
  }

  //Folder
  appFolder = new App();
  configFolder = new Config();
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
    this.configFolder.buildFolder(this.zip, this.map);
    //Creating db folder
    this.zip.folder("db");
    //Creating app file
    this.zip.file(this.appFile.getName(), this.appFile.getContent());
    //Creating requirements file
    this.zip.file(this.requirements.getName(), this.requirements.getContent(this.list));    
    //Creating readme file
    this.zip.file("README.txt", this.map.get("project-description"));  
  }

  getProject(){
    return this.zip;
  }

  setName(name){
    this.name = name;
  }

  setMap(map){
    this.map = map;
  }

  getName(){
    return this.name;
  }
}

