// 증감연산자
// ++(증가연산), --(감소연산)
// let x = 20;
// let y = ++x; (전위연산)
// let z = x++; (후위연산)
let f = 10;
let g = ++f;
console.log(`f:${f}, g:${g}`); // f:11, g:11

let h = 10;
let i = h++;
console.log(`h:${h}, i:${i}`); // h:11, i:10

// 산술연산자
let t1 = 10;
let t2 = 3;
console.log(t1 + t2); // 13
console.log(t1 * t2); // 30
console.log(t1 / t2); // 3.3333333333333335
console.log(t1 % t2); // 1
console.log(t1 ** t2); // 1000

// 연결연산자
console.log('aa' + 10); // aa10
console.log(10 + 20 + 'aa'); // 30aa
console.log('aaa' + 10 + 20); // aaa1020

// 비교연산자
console.log(10 >= 10); // true
let j = 10;
let k = '10';
console.log(typeof j, typeof k); // number string
console.log(j == k); // true
console.log(j === k); // false

let m1 = { name: 'hong', age: 20 };
let m2 = m1;
let m3 = { name: 'hong', age: 20 };
console.log(m1 == m2, m1 === m2); // true true
console.log(m1 == m3, m1 === m3); // false false

console.log(null == undefined); // true
console.log(null === undefined); // false
console.log(false == ''); // true
console.log(false == 0); // true
console.log(false === 0); // false

// 복합 대입연산자
// a += 10;
// a = a + 10;
let l = 10;
console.log(l); // 10
l += 30;
console.log(l); // 40
l /= 4;
console.log(l); // 10

let l1 = 10;
let l2 = 20;
let l3 = 4;
l3 *= l1 + l2;
console.log(l3); // 4 * (10 + 20) = 120

// 조건연산자
let max;
let su1 = 10;
let su2 = 20;
max = (su1 > su2) ? su1 : su2;
console.log(max); // 20

// 비트연산자
let m = 10;
console.log(m >> 2); // 2
console.log(m << 2); // 40

// 논리연산자
// 빵하고 우유하고 샐러드 and(&&)
// 빵이나 우유나 샐러드 or(||)
console.log(10 >= 10 && 10 !== 10); // true && false -> false
console.log(10 !== 10 && 10 >= 10); // false

console.log(10 >= 10 || 10 !== 10); // true
console.log(10 !== 10 || 10 >= 10); // false || true -> true