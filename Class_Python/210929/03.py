# score = 95
# assert score <= 100, '점수는 100이하여야 합니다.'
# print(score)


list = [1,3,6,8,3.14,9,11]
def test(t):
    assert type(t) is int, '정수가 아닌 값이 있습니다.'
    print(t)

try:
    for i in list:
        test(i)
except AssertionError as err:
    print('정수에러 Message : {0}'.format(err))

print("프로그램종료")

