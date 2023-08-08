let a;

document.getElementById('start').addEventListener('click', () => {
    a = setInterval(() => {
        let now = new Date();

        let year = now.getFullYear();
        let month = now.getMonth() + 1;
        let date = now.getDate();
        let hour = now.getHours();
        let min = now.getMinutes();
        let sec = now.getSeconds();

        let result = `${year}.${month}.${date} ${hour}:${min}:${sec}`;
        document.getElementById('result').innerHTML = result;
    }, 1000);
});

document.getElementById('stop').addEventListener('click', () => {
    clearInterval(a);
});