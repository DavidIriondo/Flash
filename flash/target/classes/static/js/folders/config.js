import {ConfigFile} from "../files/config-file.js";

export class Config{
  
  name = "config";

  configFile = new ConfigFile()

  getName(){
    return this.name;
  }

  buildFolder(zip){
    this.folder = zip.folder(this.name);
    this.folder.file(this.configFile.getName(), this.configFile.getContent());//Building config file
    this.folder.file("__init.py__", "");//Building __init__ file
  }
}
