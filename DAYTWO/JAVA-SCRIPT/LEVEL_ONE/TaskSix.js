const prompt = require("prompt-sync")()

let width = Number(prompt("Enter your width: "))
let length = Number(prompt("Enter your length: "))
let area = width * length;
console.log("The area is: " + area);
