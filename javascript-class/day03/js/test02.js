let arrinfo = [];

document.getElementById('add').addEventListener('click', () => {
    let eleirum = document.getElementById('irum');
    let eleage = document.getElementById('age');
    let irum = eleirum.value;
    let age = Number(eleage.value);

    let info = {
        irum: irum,
        age: age,
    };
    arrinfo.push(info);

    eleirum.value = '';
    eleage.value = '';
});

document.getElementById('all').addEventListener('click', () => {
    let result = arrinfo.map((item) => `<li>${item.irum}, ${item.age}</li>`);
    document.getElementById('result').innerHTML = result;
});