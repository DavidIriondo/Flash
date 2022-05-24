export class Requirements{

  getName(){
    return "requirements.txt"
  }

  getContent(){
    return `alembic==1.7.7
click==8.1.3
colorama==0.4.4
Flask==2.1.2
Flask-Migrate==3.1.0
Flask-SQLAlchemy==2.5.1
greenlet==1.1.2
importlib-metadata==4.11.3
itsdangerous==2.1.2
Jinja2==3.1.2
Mako==1.2.0
MarkupSafe==2.1.1
SQLAlchemy==1.4.36
Werkzeug==2.1.2
zipp==3.8.0`;
  }
}