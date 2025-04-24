
require('dotenv').config();
const mysql = require('mysql');

const port = process.env.PORT;
const host = process.env.HOST; 
const userr = process.env.USER; 
const db = process.env.DATABASE; 
const pass = process.env.PASSWORD; 

const connections = mysql.createConnection({

    host:host,
    user:userr,
    password:pass,
    database:db

});

connections.connect((error)=>{
    if(error) throw error;
 console.log("DataBase Conneced Sucessfully");
});

module.exports = connections;