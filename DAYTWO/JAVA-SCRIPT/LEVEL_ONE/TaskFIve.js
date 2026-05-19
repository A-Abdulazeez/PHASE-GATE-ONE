const prompt = require("prompt-sync")()

let celsius = Number(prompt("Enter your temperature in celsius"))
let fahrenheit = celsius * (9/5) + 32;

console.log("The conversion in fahrenheit is: " + fahrenheit)
