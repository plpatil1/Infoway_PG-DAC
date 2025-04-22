import chalk from 'chalk';
import validator from 'validator';


// chalk module start here
console.log(chalk.bold.blue("this is use of chalk module"));
console.log(chalk.bold.underline.red("Infoway Ins"));

let err = chalk.underline.red;
let success = chalk.italic.underline.green;

const warning = chalk.hex('#FFA500');

console.log(err("This is Error Msg"));
console.log(success("You Did it Congrats!"));
console.log(warning("Himyaa Nit Rahaa!!!!"));

// chalk module ends here
console.log("=====================================");

// validator start here 
let str1="Advik";
let str2="Babuu";
console.log(validator.equals(str1,str2));
 str1="Babuu";
 str2="Babuu";
console.log(validator.equals(str1,str2));

let myemail = "p@gma.com";
console.log(validator.isEmail(myemail));

let data ="";
console.log(validator.isEmpty(data));
data ="PAwan";
console.log(validator.isEmpty(data));
// validator ends here 

console.log("==============================================");

