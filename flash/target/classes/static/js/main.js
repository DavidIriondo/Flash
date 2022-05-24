import {Project} from "/js/folders/project.js";

//Creating zip object
var zip = new JSZip();

//Creating project
let project = new Project("demo", zip);
project.buildProject();

//Generating project to download
jQuery("#blob").on("click", function () {
    console.log("BOTON PULSADO")
    project.getProject().generateAsync({type:"blob"}).then(function (blob) { // 1) generate the zip file
        saveAs(blob, project.getName());                          // 2) trigger the download
    }, function (err) {
        jQuery("#blob").text(err);
    });
});


console.log("HELLO CURIOUS USER!!")