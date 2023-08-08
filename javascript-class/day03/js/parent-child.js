class Man {
    constructor(irum, age) {
        console.log('constructor');
        this._irum = irum;
        this._age = age;
    }

    get irum() {
        console.log('getter irum');
        return this.irum;
    }

    set irum(irum) {
        console.log('setter irum');
        this._irum = irum;
    }

    get age() {
        console.log('getter age');
        return this.age;
    }

    set age(age) {
        console.log('setter age');
        this._age = age;
    }
}
let m1 = new Man('hong', 20);
console.log(m1.age);

class P1 {
    constructor(age) {
        this._age = age;
    }
    prt = () => {
        console.log('P1-prt method');
    }
}

class C1 extends P1 {
    constructor(irum, age) {
        super(age);
        this._irum = irum;
    }
    show = () => {
        console.log('C1 show method');
    }
}

let ins1 = new P1('hong', 20);
ins1.prt();
// ins1.show(); // 메서드 선언 안 됨!!

let ins2 = new C1('hong', 20);
ins2.prt();
ins2.show();