import {ConfigFile} from "../files/config-file.js";

export class Config{
  
  name = "config";

  getName(){
    return this.name;
  }

  buildFolder(zip, map){
    this.configFile = new ConfigFile(this.map)
    this.folder = zip.folder(this.name);
    this.folder.file(this.configFile.getName(), this.configFile.getContent(map));//Building config file
    this.folder.file("__init.py__", "");//Building __init__ file
  }
}
