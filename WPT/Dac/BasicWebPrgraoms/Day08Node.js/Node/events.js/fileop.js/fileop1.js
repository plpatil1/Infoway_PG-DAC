import fs from 'fs';
// const fs = require('fs');



//read and write file Snychronously.
fs.writeFileSync("write.txt","Good Afternoon Sir!");
//read data synchronosuly
let readData = fs.readFileSync("./read1.txt","utf8" )
// console.log(readData);
// append data synchronously
// fs.appendFileSync("write.txt", "let's Start Practical ");\

//write file asnychronously
fs.writeFile("./write2.txt", "this is Node.js Session", (err, res)=>{

}
);
fs.readFile("./write.txt", "utf8", (err,res)=>{
// console.log(res);
fs.writeFile("./write3.txt",res,(err,res)=>{})
});

