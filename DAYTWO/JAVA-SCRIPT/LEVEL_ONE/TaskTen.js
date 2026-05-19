const prompt = require("prompt-sync")()


let averageOfnumbers = 0;
let sumOfNumbers = 0;
let count = 0;

let index = 0;
for (;index < 3; index++){
const userInput = Number(prompt("Enter your number: "))
count += 1;
sumOfNumbers += userInput;
averageOfnumbers = sumOfNumbers / count;
}
console.log("The average is: " + averageOfnumbers);
