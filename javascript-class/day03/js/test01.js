document.getElementById('btn').onclick = function () {
    let elename = document.getElementById('irum');
    let name = elename.value;
    document.getElementById('result').innerHTML += `<li>${name}</li>`;
    elename.value = '';
}

/* clouser

const addname = (function () {
    let count = 0;
    let fn = function (name) {
        count++;
        return `${count} ${name}`;
    };
    return fn;
})();

document.getElementById('btn').onclick = function () {
    let elename = document.getElementById('irum');
    let name = elename.value;

    document.getElementById('result').innerHTML += addname(name) + "<br>";
}
*/