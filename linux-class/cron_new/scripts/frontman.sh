#!/bin/bash
#echo $#

# num.txt에서 숫자를 불러와서 새로운 숫자로 바꿔줌
current_num=$(cat ~/cron_new/scripts/num.txt)
new_num=$(( (current_num + 1) % 6 ))
"$new_num" > ~/cron_new/script/num.txt

func_key() {
	if [ "$key" == "-g" ]; then
		source ~/cron_ex/scripts/squid.sh
	elif [ "$key" == "-a" ]; then
        	source ~/cron_new/scripts/squid.sh
	else
        	# -a, -g가 아닌 값을 받은 경우
        	date
		echo "-a 또는 -g로 옵션을 주세요."
	fi
}

# 인자로 아무 것도 전달하지 않으면 0번째 게임, awk 방식으로 출력하기
if (( $# == 0 )); then 
	i=0
	key="-a"
	func_key
# 인자의 개수가 1개이면 메시지를 출력
elif (( $# == 1 )); then
	echo "input이 부족합니다."
else
	i="$2"
	key="$1"
	func_key
fi
