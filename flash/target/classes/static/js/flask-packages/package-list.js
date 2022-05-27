import {REST_DOMAIN, REST_PACKAGES} from "../constants/rest-constants.js"

export function packageList(){

  axios({
      method : "GET",
      url : REST_PACKAGES,
      baseURL : REST_DOMAIN,
  })
  .then(r => {
    console.log(r.data)
    window.localStorage.setItem('package-list', JSON.stringify(r.data))
    printPackages(r.data)
    printSelectedPackages(r.data)
  })
  .catch(e => {console.log(e)})
}   

function printPackages(packageList) {
  console.log("CARGANDO LOS DATOS")
  packageList.forEach(element => {
          $("#packages-options-container").append(
            `<div class="card shadow-sm card-hover mt-1 " id="package-option-${element.id}">
            <div class="card-body">
                <h5 class="card-title">${element.name}</h5>
                <div class="d-flex justify-content-between">
                    <p class="card-text mr-2 text-truncate">
                        ${element.description}
                    </p>
                </div>
            </div>
        </div>`
          )
  });
}

function printSelectedPackages(packageList) {
  
  packageList.forEach(element => {
    let packageID = "#package-option-"+element.id;
    let packageName = element.name;
    let packageDescription = element.description;

    //PACKAGES OPTIONS
    $("#packages-options-container").on('click', packageID,  function name() {
    console.log("Has seleccionado el paquete " + packageName);

    //Add desactivate style
    $(packageID).removeClass("card-hover");
    $(packageID).addClass("card-desactivated");  
    
    //If this package has not been added to selected packages container then it does
    if(!$(packageID).hasClass("pkg-selected")){
        //Add option to packages container
        $("#packages-container").append(
          `<div class="card shadow-sm mt-1 pkg-card">
          <div class="card-body" id="package-selected-${element.id}">
              <h5 class="card-title">${packageName}</h5>
              <div class="d-flex justify-content-between">
                  <p class="card-text mr-2 mb-0 text-truncate">
                    ${packageDescription}
                  </p>
                  <p class="mb-0" id="dlt-btn-${element.id}">
                      <i class="fas fa-times-circle red-flash-c btn-pkg-delete"></i>
                  </p>
              </div>
          </div>
      </div>   `
        )
        
    //Add class to know if has been selected or not 
    $(packageID).addClass("pkg-selected");
    }else{
      alert("Package already added :)")
    }
   })

    let packageSelecteId = "#package-selected-" + element.id;
    let deleteButtonId = "#dlt-btn-" + element.id;

    //PACKAGES SELECTED
    $("#packages-container").on('click', deleteButtonId,  function name() {
  
      console.log("Has eliminado el paquete de " + packageName);
    
      //Eliminate package div
      $(packageSelecteId).parent().remove();
  
  
      //Descativate option
      $(packageID).removeClass("card-desactivated");
      //Add desactivate style
      $(packageID).addClass("card-hover");
      //Remove boolean class
      $(packageID).removeClass("pkg-selected");
  
    })



  });

  
}
