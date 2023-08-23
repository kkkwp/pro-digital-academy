#!/bin/bash

num=5
if (( ${num} > 3 )); then
	echo "number is greater than 3"
else
	echo "number is not greater than 3"
fi

str="test"
if [ "${str}" = "test" ]; then
	echo "str is test"
else
	echo "str is not test"
fi
