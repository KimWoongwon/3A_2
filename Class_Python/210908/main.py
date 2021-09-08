from Function import custom_func

print("------야구게임------")

answer = custom_func.SetRandomList()
user = []
strike = 0
ball = 0
out = 0
print(answer)

while True:
    for i in range(0,3):
        temp = input("숫자를 입력하세요 : ")
        if temp != "":
            a = int(temp)
            user.append(a)
        else:
            continue

    print(user)

    if custom_func.duplicates(user):
        continue

    if len(user) == len(answer):
        for i in range(0,3):
            if answer.count(user[i]) == 0:
                out+=1
            elif answer.index(user[i]) == i:
                strike+=1
            else:
                ball+=1
        print("Strike : {} ball : {} out : {}".format(strike, ball, out))
    else:
        print("정상적인 숫자 입력이 아닙니다. 재시도 해주세요")


    if strike == len(answer):
        print("You Win!!")
        break
    else:
        user.clear()
        strike = 0
        ball = 0
        out = 0