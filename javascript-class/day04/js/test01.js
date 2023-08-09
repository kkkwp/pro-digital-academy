let irums = ['홍', '김', '이', '박', '나'];

document.getElementById('view_btn').onclick = () => {

    // forEach
    let result1 = '';
    irums.forEach((irum) => {
        result1 += `<li>${irum}</li>`
    });
    document.getElementById('result').innerHTML = result1;

    // map
    let result2 = irums.map(irum => `<li>${irum}</li>`);
    document.getElementById('result').innerHTML = result2.join('');
}