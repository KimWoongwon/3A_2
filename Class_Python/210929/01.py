str = '89점'

try:
    score = int(str)
    print(score)
except ValueError as err:
    print('예외가 발생했습니다. {0}'.format(err))
print('작업완료')