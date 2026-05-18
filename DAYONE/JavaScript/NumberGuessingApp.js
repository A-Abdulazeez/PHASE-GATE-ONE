// i dont know how to import random in js abeggg Mr E.O.B,i havent gone over it thats why


const prompt = require("prompt-sync")()

const randomGuess = rand.nextInt(100);
let count = 0; 
let userInput = 0;

while(true){
let userInput = prompt ("Enter a number: ")

if (userInput < 1 || userInput > 100){
System.out.println("Please enter a number between 1 and 100");
continue;
}
else{
count += 1;
if (randomGuess < userInput) {
console.log("lower - Try again");
}
if (randomGuess > userInput) {
console.log("Higher - Try again");
}
if (randomGuess == userInput || count == 5){
break;
}
}
}

console.log("============FINAL SUMMARY============");
console.log("The correct number is: " + randomGuess);
console.log("The number of attempts is: " + count);

if (randomGuess == userInput && count == 1) console.log("your rating is: Legendary");
else if (randomGuess == userInput && count == 2) console.log("your rating is: Excellent");
else if (randomGuess == userInput && count == 3 || count == 4) console.log("your rating is: Good");
else if (randomGuess == userInput && count == 5) console.log("your rating is: Close!");
else {
console.log("No win = Better luck");
}

console.log("=====================================");
