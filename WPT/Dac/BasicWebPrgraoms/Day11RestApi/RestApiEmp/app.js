require('dotenv').config();
const express = require('express');
const connections = require('./db');
const bodyParser = require('body-parser');

const app = express();

const port = process.env.PORT;
const host = process.env.HOST;

app.use(bodyParser.urlencoded({extended:true}));
app.use(bodyParser.json);

app.get("/employee", (req,res,next)=>{
    // res.send("This is Employee Page");
    connections.query("SELECT * FROM emp", (error,result)=>{
      if(error) throw error;
      res.json(result);
    });
});

app.get("/employee/:id", (req,res,next)=>{
     connections.query(`SELECT * FROM emp WHERE id=${req.params.id}`, (error,result)=>{
        if(error) throw error;
        res.json(result);
     });
});

// app.delete("/employee", (req,res,next)=>{
//   connections.query("DELETE from emp", (error,result)=>{
//    if(error) throw error;
//    res.json("ALL Data DELETED ");
//   });
// });

app.delete("/employee/:id", (req,res,next)=>{
   connections.query(`DELETE from emp WHERE id=${req.params.id}`, (error,result)=>{
     if(error) throw error;
     res.json(`Data DELETED Where ID=${req.params.id}`);
   });
});

app.post("/employee", (req,res,next)=>{
    const {name,post,salary,location} = req.body;
    const sqlQuery = 'INSERT INTO emp(name,post,salary,location) VALUES(?,?,?,?)';
    connections.query(sqlQuery,[name,post,salary,location], (error,result)=>{
        if(error) throw error;
        res.json('INSERRTED DATA SUCESSFULLY!!!!');
    });
});

app.post("/employee/:id", (req,res,next)=>{

    const{name,post,salary,location} = req.body;
    const sqlQuery = `INSERT INTO emp(name,post,salary,location) VALUES(?,?,?,?) WHERE id=${req.params.id}`;
    connections.query(sqlQuery, [name,post,salary,location], (error,result)=>{
       if(error) throw error;
       res.json(`INSERTED DATA SUCESSFULLY WHERE id=${req.params.id}`);
    });
});

app.listen(port, ()=>{
console.log(`Server Started o: http://${host}:${port}`);
});
