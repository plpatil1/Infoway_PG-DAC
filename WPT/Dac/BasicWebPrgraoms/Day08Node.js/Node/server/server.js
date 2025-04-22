import http from 'http';

let myserver = http.createServer((req, res) => {
    if (req.url == "/") {
        res.write("Default Page");
        res.end();
    }
    if(req.url=="/home"){
        res.write("Home Page");
        res.end;
    }
    if(req.url=="/about"){
        res.write("Service Page");
        res.end();
    }
    if(req.url=="/gallary"){
        res.write("Gallary Page");
        res.end();
    }
    if(req.url=="/contact"){
        res.write("Contact Page");
        res.end();
    }
    if(req.url=="/help"){
        res.write("Help Page");
        res.end();
    }
    if(req.url=="/login"){
        res.write("Login Page");
        res.end();
    }
    if(req.url=="/signup"){
        res.write("Signup Page");
        res.end();
    }
});

myserver.listen(5000,()=>{
    console.log("Server Started on localhost:5000");
})