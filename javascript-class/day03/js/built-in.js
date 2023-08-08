// number
document.getElementById('sum').addEventListener('click', () => {
    let su1 = document.getElementById('su1');
    let su2 = document.getElementById('su2');
    let result = Number(su1.value) + Number(su2.value);
    console.log(result);

    su1.value = '';
    su2.value = '';
});

console.log(Number.MAX_VALUE); // 1.7976931348623157e+308
console.log(Number.MIN_VALUE); // 5e-324

// tostring
let su1 = Number('10');
let data = su1.toString();
console.log(typeof su1, su1); // number 10
console.log(typeof data, data); // string 10

// date
// 2023.08.08 13:51:20
let now = new Date();

let year = now.getFullYear();
let month = now.getMonth() + 1;
let date = now.getDate();
let hour = now.getHours();
let min = now.getMinutes();
let sec = now.getSeconds();

let result = `${year}.${month}.${date} ${hour}:${min}:${sec}`;
console.log(result);