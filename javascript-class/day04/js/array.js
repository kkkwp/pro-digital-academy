// concat
let arr1 = [10, 20, 30];
let arr2 = new Array(100, 200, 300);
let newArr = arr1.concat(arr2, ['t1', 't2']);
console.log(arr1); // [10, 20, 30]
console.log(newArr); // [10, 20, 30, 100, 200, 300, 't1', 't2']

// filter
let data = [10, 50, 40, 30, 100, 50];
let filter = data.filter((element) => {
    return element >= 40;
});
console.log(filter); // [50, 40, 100, 50]

// join
let arrName = ['hong', 'kim', 'lee'];
let join = arrName.join('');
console.log(join); // hongkimlee

// push
let arr = [];
arr.push("aaa");
arr.push("bbb");
arr.push("ccc");
console.log(arr, arr.length);

// forEach
arr.forEach(item => console.log(item));
console.log(arr.length);

// pop
let d1 = arr.pop();
console.log(`삭제한 요소: ${d1}, 전체 요소: ${arr}`);