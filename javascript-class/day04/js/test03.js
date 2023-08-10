let layoutImgs = document.getElementsByClassName('layout');

for (let img of layoutImgs) {
    img.addEventListener('mouseover', function () {
        for (let i = 0; i < layoutImgs.length; i++) {
            layoutImgs[i].style.border = '';
        }
        this.style.border = '3px solid red';

        let v = document.getElementById('view');
        // console.log(v.getAttribute('src'));
        // console.log(v.getAttribute('alt'));
        v.setAttribute('src', this.src);
        v.setAttribute('alt', this.alt);
    });
}