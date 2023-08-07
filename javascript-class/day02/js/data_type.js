"use strict"

// let vs var
// let: hoisting + 초기화 안 됨 -> compile error
// var: hoisting + 초기화(undefined)
a = 20;
console.log('a', a); // 20
var a = undefined;
console.log('a', a); // undefined
// let a = 20; // Uncaught SyntaxError: Identifier 'a' has already been declared

// let, const은 block scope
let b = 30;
{
    let b = 10;
    console.log('block-b', b); // 10
}
console.log('global-b', b); // 30

var su = 100;
{
    var su = 10;
    console.log('block-su', su); // 10
}
console.log('global-su', su); // 10

for (let i = 1; i < 3; i++) {
    console.log(i);
}
// console.log('i...', i);

// Boolean
let tf = '';
if (tf)
    console.log('true');
else
    console.log('false'); // 0, null, nan

// 함수
let fn = function () {
    console.log('function!!!');
};
fn();

// 배열
let arr = [10, 20, 30];
console.log(arr.length); // 3;
for (let i = 0; i < arr.length; i++) {
    console.log(arr[i]);
}
console.log(typeof fn); // function
console.log(typeof (fn)); // function
console.log(typeof arr); // object
console.log(typeof (arr)); // object

// 객체
let person = {};
console.log(typeof person); // object
console.log(Array.isArray(arr)); // true
console.log(Array.isArray(person)); // false

// 데이터 형변환
let c = '10';
let d = 20;
let e = c + d;
console.log(typeof e, e); // string 1020
console.log(typeof (10 / 2), 10 / 2); // number 5
console.log(typeof ('10' / 2), '10' / 2); // number 5
console.log(typeof ('a' / 2), 'a' / 2); // number NaN
// 숫자형: parseInt parseFloat Number
console.log(Boolean(''), Boolean(' ')); // false true
console.log(Boolean(0), Boolean('0')); // false true
console.log(Number('10'), Number('aa'), Number(null), Number(undefined)); // 10 NaN 0 NaN
console.log(String(0)); // 0

// 출력
let name = 'hong gil dong';
let jumsu = 100;
console.log('name: ' + name + ', jumsu: ' + jumsu);
console.log('name: ', name, ', jumsu: ', jumsu);
console.log(`name: ${name}, jumsu: ${jumsu}`);