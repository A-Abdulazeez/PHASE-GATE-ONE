const prompt = require("prompt-sync")()
let userRadius = Number(prompt("Enter the radius of the circle "))

let circumference =  2 * 22/7 * userRadius
console.log("The circumference is: " + circumference)
