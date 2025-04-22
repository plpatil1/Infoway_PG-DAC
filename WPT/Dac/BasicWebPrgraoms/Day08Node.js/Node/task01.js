function cube(num1){
    return `Cube of ${num1} : ${num1*num1*num1}`;
}
function areaofCircle(num1){
    return `Area of Circle : ${3.14*num1*num1}`;
}
function square(num1){
    return `Square is : ${num1*num1}`;
}
function iseveonOrOdd(num1){
   if(num1%2===0){
    return `${num1} is Even Number`;
   } else{
   return `${num1} is Odd Number`
   }
}
function fullName(fname,lname){
    return `FirstName: ${fname}, LastName: ${lname} = ${fname+" "+lname}`;
  }



module.exports = {cube, areaofCircle,square, iseveonOrOdd, fullName};