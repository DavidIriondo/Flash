import {REST_DOMAIN, REST_PACKAGES} from "../constants/rest-constants.js"

export function packageList(){

  axios({
      method : "GET",
      url : REST_PACKAGES,
      baseURL : REST_DOMAIN,
  })
  .then(r => {
    console.log(r.data)
    printPackages(r.data)
  })
  .catch(e => {console.log(e)})
}   


function printPackages(packageList) {
  console.log("CARGANDO LOS DATOS")
  packageList.forEach(element => {
          $("#packages-options-container").append(
            `<div class="card shadow-sm card-hover mt-1 ">
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
