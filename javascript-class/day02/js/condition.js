// 조건문 - if

// let kor = 85;
// if (kor >= 60)
//     console.log('합격');
// else
//     console.log('불합격');

// if (kor >= 90)
//     console.log('수');
// else if (kor >= 80)
//     console.log('우');
// else if (kor >= 70)
//     console.log('미');
// else if (kor >= 60)
//     console.log('양');
// else
//     console.log('가');

document.getElementById('btn').onclick = function () {
    let elekor = document.getElementById('kor');
    let eleeng = document.getElementById('eng');
    let elemath = document.getElementById('math');

    let kor = Number(elekor.value);
    let eng = Number(eleeng.value);
    let math = Number(elemath.value);

    let avg = (kor + eng + math) / 3;
    let result = '<li>평균점수: ' + avg;

    if (kor >= 90 && eng >= 90 && math >= 90)
        result = '<li>very good</li>';
    else if (kor >= 90 || eng >= 90 || math >= 90)
        result = '<li>good</li>';
    else
        result = '<li>bad</li>';

    document.getElementById('result').innerHTML = result;

    elekor.value = '';
    eleeng.value = '';
    elemath.value = '';
}

// 조건문 - switch
let su = 4;
let data = '';
switch (su) {
    case 5:
        data += '5';
    case 4:
        data += '4';
    case 3:
        data += '3';
    case 2:
        data += '2';
    case 1:
        data += '1';
        break;
    default:
        data += '나머지 경우';
}
console.log(data); // 4321

let degree = 'a';
switch (degree) {
    case 'a':
        console.log('a');
        break;
    case 'b':
        console.log('b');
        break;
    case 'c':
        console.log('c');
        break;
    default:
        console.log('the others');
}

/*
    숫자를 입력 받아서, 
    3으로 나누면 message = 3의 배수
    4 -> message = 나머지 값은 1
    5 -> message = 나머지 값은 2
*/
let a = Number(prompt('숫자를 입력하세요.', 0));
switch (a % 3) {
    case 0:
        alert('3의 배수');
        break;
    case 1:
        alert('나머지 값은 1');
        break;
    case 2:
        alert('나머지 값은 2');
        break;
}
