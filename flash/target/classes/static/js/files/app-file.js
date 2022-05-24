export class AppFile{
  
  getName(){
    return "app.py";
  }

  getContent(){
    return `import os

from app import create_app

#Remember to set your ENV variable 
app = create_app(os.getenv('FLASK_ENV'))

if __name__ == '__main__':
    app.run()
    `;
  }
}