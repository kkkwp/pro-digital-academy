"use strict"

// 얕은 복사
let a1 = [10, 20, 30];
let a2 = a1;
console.log(a1 === a2); // true

a1.forEach(item => {
    console.log(item); // 10 20 30
});
a2[1] = 100;
a1.forEach(item => {
    console.log(item); // 10 100 30
});

// 깊은 복사
let a = [10, 20, 30];
let newA = Object.assign([], a);
console.log(a === newA); // false

newA[1] = 100;
a.forEach(item => {
    console.log(item); // 10 20 30
});
newA.forEach(item => {
    console.log(item); // 10 100 30
});

// object.is: 두 객체가 같은지
let o1 = [10, 20, 30];
let o2 = [10, 20, 30];
console.log(o1 === o2); // false

let tf = Object.is(o1[0], o2[0]);
console.log(tf); // true