const prompt = require("prompt-sync")()

const userInput = Number(prompt("Enter the price of items: "))

let taxOnItem = (10/100) * userInput
let taxAdded = taxOnItem + userInput

console.log("The tax added is: " + taxAdded)
