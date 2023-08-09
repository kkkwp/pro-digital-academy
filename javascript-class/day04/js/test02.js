document.getElementById('btn').addEventListener('click', () => {
    const eleirum = document.getElementById('irum');
    const eleage = document.getElementById('age');
    let irum = eleirum.value;
    let age = eleage.value;

    let result = '';
    try {
        if (isNaN(age))
            throw new Error("나이는 숫자이어야 합니다.");
        if (age < 0)
            throw new Error("나이는 0보다 커야 합니다.");
        document.getElementById('result').innerHTML = `이름: ${irum}, 나이: ${age}`;
    } catch (e) {
        console.log(e)
    } finally {
        console.log('done');
    }

    eleirum.value = '';
    eleage.value = '';
});
