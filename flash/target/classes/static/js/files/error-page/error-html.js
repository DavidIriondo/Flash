export class Error{
  
  getName(){
    return "error.html";
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
    <div class="container-flow bg-danger text-white h-100">
        <div class="container text-center h-100 d-flex flex-column justify-content-center">
            <div class="mb-5">
                <p class="display-4 font-weight-bold" id="title">ERROR</p>
                <p class="h1 font-weight-bold" id="title">SOMETHING WENT WRONG</p>
                <p>⚠️</p>
            </div>
        </div>
    </div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.1/umd/popper.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.min.js"></script>
<script>

</script>
</body>
</html>`;
  }
}