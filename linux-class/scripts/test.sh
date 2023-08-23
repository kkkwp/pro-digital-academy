#!/bin/bash


you="father"
myage=26
fatherage=58

if [ "${you}" = "father" ]; then
	echo "나이차는 $(( $fatherage - $myage ))"
else
	echo "내 나이는 $myage"
fi
