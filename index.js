// 1. Variables and Data Types
let name = "Pawan"; // String
const age = 25; // Number
let isDeveloper = true; // Boolean

console.log(`Hello, my name is ${name} and I am ${age} years old.`);

// 2. Functions
function greet(userName) {
    return `Hello, ${userName}! Welcome to JavaScript.`;
}
console.log(greet(name));

// 3. Loops
for (let i = 1; i <= 5; i++) {
    console.log(`Count: ${i}`);
}

// 4. Arrays
let colors = ["Red", "Green", "Blue"];
colors.push("Yellow"); // Adding an element
console.log("Colors:", colors);

// 5. Objects
let person = {
    firstName: "Pawan",
    lastName: "Lekurwale",
    age: 25,
    profession: "Web Developer"
};
console.log("Person:", person);

// 6. DOM Manipulation (Change content on button click)
document.addEventListener("DOMContentLoaded", function() {
    let button = document.getElementById("changeText");
    let text = document.getElementById("displayText");

    button.addEventListener("click", function() {
        text.innerText = "Text Changed!";
    });
});
