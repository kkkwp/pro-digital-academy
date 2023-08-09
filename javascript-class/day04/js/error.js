try {
    let arr = new Array(-1);
} catch (e) {
    // console.log(e); // RangeError: Invalid array length
} finally {
    console.log('finally'); // finally
}

let a = 20;
try {
    if (a > 20)
        console.log('a가 20보다 크다.');
    else if (a == 20)
        throw new Error("20과 동일하다."); // Error: 20과 동일하다.
    else
        throw new Error("20보다 작다.");
} catch (e) {
    console.log(e);
} finally {
    console.log('end!!!');
}