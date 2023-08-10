"use strict"

let myinput = document.getElementById('myinput');

const searchfn = (e) => {
    e.preventDefault();
    let inputvalue = e.target.value;
    let ele_li = document.getElementsByTagName('li');
    [...ele_li].forEach(item => {
        let ele_a = item.getElementsByTagName('a')[0];
        let a_content = ele_a.textContent;
        if (a_content.indexOf(inputvalue) > -1) {
            item.style.display = "";
        } else {
            item.style.display = "none";
        }
    });
};

myinput.addEventListener('input', searchfn);