#!/bin/bash

let a=5+4
echo $a #9

let "a=5+4"
echo $a #9

let a++
echo $a #10

let "a=4*5"
echo $a #20

let "a=$1+30"
echo $a # first command line argument + 30
