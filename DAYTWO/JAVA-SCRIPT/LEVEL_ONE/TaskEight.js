const prompt = require("prompt-sync")()

const userInput = Number(prompt("Enter your number to get its Square: "))
console.log("The square is: " + userInput*userInput)
