#!/bin/bash
#alias ll
# http://ryanstutorials.net/bash-scripting-tutorial/bash-arithmetic.php
# http://geeksforgeeks.org/expr-command-in-linux-with-examples/
# echo ${i:= 0}
# i=`expr $i + 1`
date 

# -F: 구분자를 \t으로 설정
# -v: 외부 변수 i를 사용
awk -F '\t' -v i=$i '$1 == i { print $1 "번째 게임 [" $2 "], 주어진 시간은 " $3 "분입니다." }' ~/cron_new/etc/game.rc
awk -v i=$i '$1 == i { print $1 "번째 게임의 생존자는 " $2 "명입니다." }' ~/cron_new/etc/result_game.txt
