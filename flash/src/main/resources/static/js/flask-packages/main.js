import {packageList} from "./package-list.js"

$(document).ready(function () {

  //get data
  packageList();

  //PACKAGE OPTION
  $("#package-option-1").click(function () {
    console.log("Has seleccionado el paquete de flask 1");

    //Descativate option
    $("#package-option-1").parent().removeClass("card-hover");
    //Add desactivate style
    $("#package-option-1").parent().addClass("card-desactivated");

    //Add option to packages container
    $("#packages-container").append(
      `<div class="card shadow-sm card-selected card-option">
      <div class="card-body" id="package-selected-1">
          <h5 class="card-title">Flask package 1</h5>
          <div class="d-flex justify-content-between">
              <p class="card-text mr-2 text-truncate">
                  Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                   Ut vestibulum vitae arcu vitae commodo. Aliquam felis metus, venenatis aliquam mi in,
                    tristique suscipit orci
              </p>
          </div>
      </div>
  </div>`
    )})

  //PACKAGE SELECTED
  $("#packages-container").on('click', "#package-selected-1",  function name() {

    console.log("Has eliminado el paquete de flask 1")
  
    //Eliminate package div
    $(this).parent().remove();


    //Descativate option
    $(this).parent().removeClass("card-desactivated");
    //Add desactivate style
    $(this).parent().addClass("card-hover");

  })
  
});