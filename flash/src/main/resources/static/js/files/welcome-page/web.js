export class Web{
  
  getName(){
    return "hello.html";
  }

  getContent(){
    return`<!DOCTYPE html>
<html lang="en" class="h-100">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta name="Description" content="Enter your description here"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<title>Flash project</title>
</head>
<body class="h-100">
  <div class="container-flow bg-primary text-white h-100">
      <div class="container text-center h-100 d-flex flex-column justify-content-center">
          <div class="">
              <p class="display-4 font-weight-bold" id="title">Welcome to your Flask project, made it with Flash!</p>
              <p class="" id="subtitle">For more information about the project structure, visit our web page</p>
              <button type="button" class="btn btn-light btn-lg">Go to Flash <span>🚀</span></button>
          </div>
      </div>
  </div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.10.4/gsap.min.js" integrity="sha512-VEBjfxWUOyzl0bAwh4gdLEaQyDYPvLrZql3pw1ifgb6fhEvZl9iDDehwHZ+dsMzA0Jfww8Xt7COSZuJ/slxc4Q==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.1/umd/popper.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.min.js"></script>
<script>
  gsap.from("#title", {
  opacity: 0, 
  x: -200, 
  duration: 1
  });

  gsap.from("#subtitle", {
  opacity: 0, 
  x: 200, 
  duration: 1
  });
</script>
</body>
</html>`;
  }
}