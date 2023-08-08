// 구조분해할당
// 배열이나 객체 속성을 해체해서 개별 변수에 담는 것
let [a, b] = [10, 20];
console.log('a:', a); // a: 10
console.log('b:', b); // b: 20

let [t1, t2, ...t3] = [100, 200, 300, 400];
console.log(t1); // 100
console.log(t2); // 200
console.log(t3); // [300, 400]

let [su1, su2] = [100, 200];
console.log(`su1: ${su1}, su2: ${su2}`); // su1: 100, su2: 200
[su2, su1] = [su1, su2];
console.log(`su1: ${su1}, su2: ${su2}`); // su1: 200, su2: 100

let man = {
    irum: 'hong',
    age: 20,
    addr: 'seoul',
};

let { irum, age, addr } = man;
console.log(`irum: ${irum}, age: ${age}, addr: ${addr}`); // irum: hong, age: 20, addr: seoul

let [a1, a2, a3] = [10, 20];
console.log(a1); // 10
console.log(a2); // 20
console.log(a3); // undefined

let [p1 = 10, p2 = 10, p3 = 10] = [1, 2];
console.log(p1, p2, p3); // 1 2 10

let [i, , j] = ['test1', 'test2', 'test3', 'test4'];
console.log(i, j); // test1 test3

let [k1, ...k2] = ['test1', 'test2', 'test3', 'test4'];
console.log(k1); // test1
console.log(k2); // ['test2', 'test3', 'test4']