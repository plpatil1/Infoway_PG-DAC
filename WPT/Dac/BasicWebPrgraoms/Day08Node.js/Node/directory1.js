import fs from 'fs';

// fs.mkdir("./newDir",(err,res)=> {
//     fs.writeFile("./newDir/filepaw.txt","Harshyaaa yashhyaa himyaaaaaaa",(err,res)=>{});
// });

fs.unlink('./newDir/filepaw.txt', (err,res)=> {
    fs.rmdir('./newDir', (err,res)=>{});
});