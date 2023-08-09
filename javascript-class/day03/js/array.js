let arr1 = [];
let arr2 = new Array(3);
console.log(typeof arr1); // object
console.log(typeof arr2); // object
console.log(Array.isArray(arr1)); // true
console.log(Array.isArray(arr2)); // true

let len;
let arr = [];
len = arr.push('a1');
console.log(`len: ${len}, arr: ${arr}`); // len: 1, arr: a1
len = arr.push('a2');
console.log(`len: ${len}, arr: ${arr}`); // len: 2, arr: a1,a2