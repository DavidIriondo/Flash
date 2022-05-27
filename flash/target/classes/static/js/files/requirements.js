export class Requirements{

  getName(){
    return "requirements.txt"
  }

  getContent(list){

    this.listTxt = new Array();

    const data = JSON.parse(window.localStorage.getItem('package-list'));

    list.forEach(element => {
      //Search data from full list of packages
      data.forEach(element2 => {
        //Loop list until find the id of the package
        if(element2.id == element){
          this.listTxt.push(element2.requirementName);
        }
      });

    });

    console.log(this.listTxt)

    return this.listTxt.join("\r\n");
  }
}