import {Project} from "/js/folders/project.js";

//Creating zip object
var zip = new JSZip();

//Generating project to download
$("#generate-project-button").click(function () {
    console.log("BOTON PULSADO")
    //get form and transform it into map
    let map = createMap($("#project-data-form").serializeArray());
    let list = getpackageList();

    try {
        //Creating project
        let project = new Project(map, list, zip);
        project.buildProject();

        //Descargamos el proyecto 
        project.getProject().generateAsync({type:"blob"}).then(function (blob) { 
            saveAs(blob, project.getName());                          
        }, function (err) {
            jQuery("#generate-project-button").text(err);
        });

        //Show sucessfully modal
        $('#download-project-ok').modal('show')
    } catch (error) {
        console.log(error)
        $('#download-project-bad').modal('show')
    }
})


function createMap(form) {
    let formMap = new Map();
    form.forEach(element => {
        formMap.set(element.name, element.value.trim())
    });
    return formMap;
}

function getpackageList() {
    let list = new Array();
    
    $(".pkg-card").each(function () {
        let pkg = $(this).children().attr('id');
        let id = pkg.substr(pkg.length - 1);
        list.push(id);
    })

    return list;
}

$(function () {
    $('[data-toggle="tooltip"]').tooltip()
  })
  
console.log("HELLO CURIOUS USER!!")