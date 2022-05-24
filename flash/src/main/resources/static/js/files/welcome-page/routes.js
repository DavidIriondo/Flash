export class Routes{
  
  getName(){
    return "hello_routes.py";
  }

  getContent(){
    return`from flask import Blueprint

from app.controllers.hello_controller import welcome

hello_blueprint = Blueprint("welcome_page", __name__)

hello_blueprint.route("/", methods=['GET'])(welcome)`;
  }
}