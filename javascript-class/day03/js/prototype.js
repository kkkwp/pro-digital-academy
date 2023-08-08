class Student {
    constructor(irum, age) {
        this.irum = irum;
        this.age = age;
    }
}

Student.prototype.prt = function () {
    console.log('prt!!!');
}

let ins1 = new Student("a1", 20);
let ins2 = new Student("a2", 10);
console.dir(ins1);
console.dir(ins2);
ins1.prt();
ins2.prt();