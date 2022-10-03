const demoArray = [
  { id: 1, msg: "This" },
  { id: 2, msg: "is" },
  { id: 3, msg: "for" },
  { id: 4, msg: "learning" },
  { id: 5, msg: "purpose" },
];

// using forEach to print the message and display it as a whole string
const tempArray = [];
const joinedMessage = demoArray.forEach((el) => tempArray.push(el.msg));
console.log(tempArray.toString().replaceAll(",", " "));

// using map to print the message and display it as a whole string
const _joinedMessage = demoArray.map((el) => el.msg);
console.log(_joinedMessage.toString().replaceAll(",", " "));

// Notice one important difference =>  .map() returns the results in an array but .forEach() returns the current elements thatswhy we need to store it in a separate variable
