const path = require('path');


console.log("this is path module");
console.log(__dirname);
console.log(__filename);


console.log(path.basename(__dirname));
console.log(path.basename(__filename));
console.log(path.extname(__filename));
console.log(path.isAbsolute(__dirname));
console.log(path.isAbsolute(__filename));
console.log(path.isAbsolute("../"+__filename));
console.log(path.join("../public","media/images/hd"));

