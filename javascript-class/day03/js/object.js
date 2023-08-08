"use strict"

// 객체 생성
// 1. Function 생성자 함수
const op = new Function("a", "b", "return a+b");
let result = op(10, 20);
console.log("result", result); // result 30

// 2. Object 생성자 함수
let person1 = new Object();
person1.name = '홍길동';
person1.age = 20;
person1.addr = '서울';
console.log(`name: ${person1.name}, age: ${person1.age}, addr: ${person1.addr}`);
console.log(person1);
console.log(typeof person1); // object
console.log(Array.isArray(person1)); // false

person1.prt = function () {
    console.log('prt function!!!');
}
console.log(person1);

// 3. 생성자 함수
function Man(irum, age) {
    this.irum = irum;
    this.age = age;
    this.prt = function () {
        console.log(`name: ${this.irum}, age: ${this.age}`);
    };
}
let m1 = new Man("hong", 20);
let m2 = new Man("park", 10);
console.log(m1);
console.log(m2);

console.log(m1.irum, m1.age); // hong 20
console.log(m1['irum'], m1['age']); // hong 20
m1.prt(); // name: hong, age: 20

// 4. 객체 리터럴
const p1 = {
    irum: 'hong',
    age: 20,
    addr: '서울',
};

const p2 = {
    irum: 'park',
    age: 10,
    addr: '경기',
};

console.log(typeof p1, p1); // object
console.log(typeof p2, p2); // object
console.log(p1.irum, p1.age, p1.addr); // hong 20 서울
console.log(p2['irum'], p2['age'], p2['addr']); // park 10 경기

// 5. 클래스
class Student {
    constructor(studentId, irum, age) {
        this.studentId = studentId;
        this.irum = irum;
        this.age = age;
    }
}
let s1 = new Student(1, 'hong', 20);
let s2 = new Student(2, 'park', 10);
console.log(s1, typeof s1);
console.log(s2, typeof s2);

// 속성 추가
s1.addr = '서울';
s1.sayHello = () => {
    console.log('안녕하세요');
};
console.log(s1);

// 속성 삭제
delete s1.age;
console.log(s1);

// 대괄호만 사용하는 경우
// 1. 여러 개의 속성으로 한 값을 정의
// s1.nick1 nick2 = 'eee'; // error
s1['nick1 nick2'] = 'test!!';
console.log(s1);
console.log(s1['nick1 nick2']); // test!!!

// 2. 런타임 시 결정되는 속성
let a = 'age';
const user = {
    name: 'hong',
    [a]: 20,
};
console.log(user); // {name: 'hong', age: 20}

// s1 객체 확인
console.log(s1);
for (let item in s1) {
    console.log(item); // studentId, irum, addr, sayHello, nick1 nick2
    console.log(s1[item]); // 1, hong, 서울, f, test!!
}