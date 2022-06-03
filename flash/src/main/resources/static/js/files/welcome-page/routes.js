export class Routes{
  
  getName(){
    return "hello_routes.py";
  }

  getContent(){
    return`from flask import Blueprint

from app.controllers.hello_controller import welcome, handle_error

hello_blueprint = Blueprint("welcome_page", __name__)

error_handling_blueprint = Blueprint("error", __name__)

hello_blueprint.route("/", methods=['GET'])(welcome)

error_handling_blueprint.app_errorhandler(Exception)(handle_error)`;
  }
}