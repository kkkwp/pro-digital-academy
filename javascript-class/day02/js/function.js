// 함수 호출
function fn_move1() {
    console.log('fn_move-1');
    console.log('fn-move-2');
}
fn_move1();
console.log('======');
fn_move1();

function fn_move2(irum, age) {
    console.log(`name: ${irum}, age: ${age}`); // name: hong, age: 20
    console.log('움직입니다!!!')
}
fn_move2('hong', 20);

function get_su() {
    let su = 100;
    return su;
}
let su = get_su();
console.log(`값은 ${su}`); // 값은 100

// 두 개의 숫자를 입력 받아서 더하는 기능을 구현하시오.
let su1 = 10;
let su2 = 20;

function add(a, b) {
    return a + b;
}
let result = add(su1, su2); // add(10, 20);
console.log(`처리 결과는 ${result}`); // 처리 결과는 30

// call by value
function prt(arg) {
    console.log(arg, typeof arg);
}
prt(10); // 10 number

// call by reference
function prt2(arg) {
    console.log(arg, typeof arg);
};
let arr = [10, 20, 30];
prt2(arr); // Array(3) object

let irum = 'hong';
function prt3() {
    var test = 'hong';
    console.log(irum, test);
};
prt3(); // hong hong
//console.log(irum, test); // Uncaught ReferenceError: test is not defined

// 함수 표현식(익명 함수)
const prt4 = function () {
    console.log('prt');
};
prt4(); // prt

const prt5 = function (irum = 'hello', age = 0) {
    console.log('irum: ' + irum);
    console.log('age: ' + age);
};
prt5('hong', 20); // hong 20
prt5(); // hello 0

// rest parameter
const show = function (...irum) {
    for (let a of irum) {
        console.log(a);
    }
};
show('a1'); // a1
show('a1', 'a2'); // a1 a2

let arr1 = [10, 20, 30];
let arr2 = [100, 200, 300];
let arr3 = [arr1, arr2];
let arr4 = [...arr1, ...arr2];
console.log(arr3); // [[10, 20, 30], [100, 200, 300]]
console.log(arr4); // [10, 20, 30, 100, 200, 300]

// arrow function
let add1 = function (a, b) {
    return a + b;
};
let tot = add1(10, 20);

let prt6 = () => 'hong';
let res = prt6();
console.log(res); // hong

let prt7 = () => {
    console.log('test1');
    console.log('test2');
};
prt7();

let prt8 = (a, b) => {
    console.log(`a: ${a}, b: ${b}`);
};
prt8('test1', 'test2');

// call-back
let fn = function (a, b, t1) {
    console.log(a, b); // 10 20
    console.log(t1); // f (su1, su2) { };
    t1(a, b); // add function: 30
};
let add2 = function (su1, su2) {
    console.log('add function: ', su1 + su2);
};
fn(10, 20, add2);

[10, 20, 30,].forEach(function (item) {
    console.log(item);
});

[10, 20, 30,].forEach((item) => {
    console.log(item);
});
