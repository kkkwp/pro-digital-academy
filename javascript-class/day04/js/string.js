"use strict"

let email = "abc123@aaa.com";

let at = email.indexOf('@');
console.log(`email: ${email.slice(0, at)}, domain: ${email.slice(at + 1)}`);

let result = email.split('@');
console.log(`email: ${result[0]}, domain: ${result[1]}`);