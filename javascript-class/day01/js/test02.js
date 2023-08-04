console.log('hello');

/* 1.
    변수: let, var
    상수: const 
*/
const irum = "hong";
console.log('name', irum);
// irum = 'park!!';
// console.log('new name', irum);

/* 2.
    var: hoisting 발생 -> compile error 대신 undefined
    let: hoisting 발생하지 않아 compile error 발생
*/
console.log('a', a);
var a = 10;

var b;
console.log('b', b);
b = 10;
console.log('b', b);

console.log('===================')

su = 10;
console.log('su', su);
// var su; // su 10
// let su; // compile error

/* 3.
    typeof
*/
let a1 = 10;
let b1 = 'aaa';
let c = 10.2;
let d = 10 == 10;
let e = null;
let f;

console.log('a1', typeof a1); // number
console.log('b1', typeof b1); // string
console.log('c', typeof c); // number
console.log('d', typeof d); // boolean
console.log('e', typeof e); // object
console.log('f', typeof f); // undefined
console.log('10 / 0', 10 / 0); // Infinity
console.log('-10 / 0', -10 / 0); // -Infinity
console.log('"aa" / 10', 'aa' / 10); // NaN(not a number)

let t1 = []; // 배열
let t2 = {}; // 객체
let t3 = function () { // 함수
    console.log('function');
};
console.log('t1', typeof t1); // object
console.log('t2', typeof t2); // object
console.log('t3', typeof t3); // function

