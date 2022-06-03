import { AppController } from "./app-controllers.js";
import { AppRoutes } from "./app-routes.js";
import { AppTemplates } from "./app-templates.js";

export class App{
  
  name = "app";
  //Folder
  appController = new AppController();
  appRoutes = new AppRoutes();
  appTemplate = new AppTemplates();

  getName(){
    return this.name;
  }

  buildFolder(zip){
    this.folder = zip.folder(this.name);
    //Static folder
    this.folder.folder("static");
    //Templates folder
    this.appTemplate.buildFolder(this.folder);
    //Models folder
    this.folder.folder("models").file("__init__.py", "");
    //Service folder
    this.folder.folder("services").file("__init__.py", "");
    //Routes folder
    this.appRoutes.buildFolder(this.folder);
    //Controller folder
    this.appController.buildFolder(this.folder);
    //__init__.py file
    this.folder.file("__init__.py", this.getInitFile());

  }

  getInitFile(){
    return `import os

from flask import Flask
#from flask_sqlalchemy import SQLAlchemy
#from flask_migrate import Migrate

from config.config import config, template_dir, static_dir
from app.routes.hello_routes import hello_blueprint, error_handling_blueprint

#db = SQLAlchemy()
#migrate = Migrate()

def create_app(config_name = 'default'):
    app = Flask(__name__, template_folder=template_dir, static_folder=static_dir)
    app.config.from_object(config[config_name])

    #creamos la instancia de SQLAlchemy
    #db.init_app(app)

    #Remember to import your models just before initialize Migrate
    #from app.models.user_model import UserModel
    #migrate.init_app(app, db)

    #Register your blueprints
    app.register_blueprint(hello_blueprint, url_prefix="/")
    app.register_blueprint(error_handling_blueprint)
    
    return app`;
  }
}
