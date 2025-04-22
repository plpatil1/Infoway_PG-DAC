
 function addition(num1, num2){
    return  `Addition of  ${num1}+${num2} = ${num1+num2}`;
}
function substraction(num1, num2){
    return  `Substraction of  ${num1}-${num2} = ${num1-num2}`;
}
function multiplication(num1, num2){
    return  `Mutliplication of  ${num1}*${num2} = ${num1*num2}`;
}
function division(num1, num2){
    return  `Division of  ${num1}/${num2} = ${num1/num2}`;
}
module.exports = {addition, substraction, division, multiplication};

// let ans = addition(100,400);
// console.log(ans);
//  ans = substraction(400, 200);
//  console.log(ans);


