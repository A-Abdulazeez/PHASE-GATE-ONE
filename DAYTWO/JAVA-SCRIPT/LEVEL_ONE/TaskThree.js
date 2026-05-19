const prompt = require("prompt-sync")()

let sum = 0;
let index = 0;
for (;index < 2; index++){
let userInput = Number(prompt("Enter a Number: "))
sum += userInput;
}
console.log("The sum is: " + sum);
