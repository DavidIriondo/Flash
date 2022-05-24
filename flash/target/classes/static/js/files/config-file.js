export class ConfigFile{
  
  getName(){
    return "config.py"
  }

  getContent(){
    return `import os

basedir = os.path.relpath("../db")

template_dir = os.path.realpath('app/templates')
static_dir = os.path.realpath('app/static')


class BaseConfig():
    SECRET_KEY = os.environ.get('SECRET_KEY') or ' 12345'
    SQLALCHEMY_TRACK_MODIFICATIONS = False

class DevelopmentConfig(BaseConfig):
    DEBUG = True
    SQLALCHEMY_DATABASE_URI = os.environ.get('DEV_DATABASE_URL') or 'sqlite:///' + os.path.join(basedir, 'data-development.sqlite')

    PROFILE = " * Developer profile activated"

class TestingConfig(BaseConfig):
    TESTING = True
    SQLALCHEMY_DATABASE_URI = os.environ.get('TEST_DATABASE_URL') or 'sqlite:///' + os.path.join(basedir, 'data-testing.sqlite')

    PROFILE = " * Testing profile activated"

class ProductionConfig(BaseConfig):
    SQLALCHEMY_DATABASE_URI = os.environ.get('DATABASE_URL') or 'sqlite:///' + os.path.join(basedir, 'data-production.sqlite')

    PROFILE = " * Production profile activated"


config = {
'development': DevelopmentConfig,
'testing': TestingConfig,
'production': ProductionConfig,

'default': DevelopmentConfig
}`
  }
}