const prompt = require("prompt-sync")()

let product = 1;
let index = 0;
for (;index < 2; index++){
let userInput = Number(prompt("Enter your number: "))
product *= userInput;
}
console.log("The product is: " + product);
