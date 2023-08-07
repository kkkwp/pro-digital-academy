// 반복문 - for
for (let i = 10; i < 15; i += 2) {
    console.log('i:' + i);
}

// iterable
let arr = ['a1', 'a2', 'a3'];
console.log(arr);
console.log(arr[0]);
console.log(arr[1]);
console.log(arr[2]);

// for, for-of, forEach
console.log('=================');
for (let i = 0; i < arr.length; i++) {
    console.log(arr[i]);
}

console.log('=================');
for (let item of arr) {
    console.log(item);
}

console.log('=================');
arr.forEach(item => {
    console.log(item);
});

// for-in
let man = {
    irum: '홍길동',
    age: 20,
    addr: '서울',
};
console.log(typeof man, man); // object
console.log(man.irum); // 홍길동
console.log(man.age); // 20
console.log(man.addr); // 서울

for (let key in man) {
    console.log(key); // irum, age, addr(속성)
}

console.log('==== 배열에는 in을 사용하지 말자 ====');
for (let index in arr) {
    console.log(index); // 0 1 2
}

// 문자열에서 for-of
let data = 'hello, javascript!';
console.log(data[1]);
// data[1] = 'r';
// console.log(data);

for (let item of data) {
    console.log(item);
}

// 반복문 - while
// while 문: 참일 동안
// 1...5까지 출력하시오.
let i = 0;
while (i < 5) {
    i++;
    console.log(i);
}

// 10 8 6 4 2
let j = 10;
while (j > 0) {
    console.log(j);
    j -= 2;
}

// 1 2 3 4
let k = 1;
while (true) {
    console.log(k);
    k++;
    if (k == 5) break;
}

// 1 2 4 5 7 8
for (let i = 1; i < 10; i++) {
    if (i % 3 == 0) continue;
    console.log(i);
}

// 1 2 4 5 7 8 10
let l = 0;
while (l < 10) {
    l++;
    if (l % 3 == 0) continue;
    console.log(l);
}

let sungjuckarr = [60, 90, 70, 100, 75];
sungjuckarr.forEach(function (item) {
    console.log(item);
});
