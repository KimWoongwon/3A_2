print((lambda x:x*10)(3))

func = (lambda x:x*10)
print(func(3))

data1 = [1,2,3,4,5,6]
data2 = [17,36,11,25,9,16]
score = [95,35,68,48,85,95]
score2 = [('aa', 1), ('bb', 2), ('100', 200), (10, 20)]
target = ['   cat  ', '   tiger ', '   dog  ', '  snake ', 'aaaaaaaa', '        bb          ']
def my_key(s):
    return len(s.strip())

print('==== Lambda Sorted ====')
ls = sorted(score)
print(ls, score)
print()
ls = sorted(score, reverse=True)
print(ls, score)
print()
ls = sorted(target, key=my_key)
print(target)
print(ls)
print()
ls = sorted(target, key=(lambda s:len(s.strip())))
print(target)
print(ls)
print()

print('==== Lambda Filter ====')
f = list(filter(lambda x:x<60, score))
print(f)
print()
f = list(filter(lambda x:str(x[0]).isalpha(), score2))
print(f)
print()
f = list(filter(lambda x:type(x[0]) == str, score2))
print(f)
print()

print('==== Lambda Map ====')
m = list(map(lambda x:x*10 if x%2==0 else x, data1))
print(m)
print()

m = list(map(lambda x,y:x+y, data1, data2))
print(m)
print()

m = map(lambda x,y:x+y, data1, data2)
print(next(m))
print(next(m))
print(next(m))
print(next(m))
print(next(m))
print(next(m))
#print(next(m), "더이상 값이 없습니다.")
print()

print('==== Lambda Reduce ====')
from functools import reduce
r = reduce(lambda x,y:x+y, [1,2,3,4])
print(type(r), r)

r = reduce(lambda x,y:x+y, 'abcdefg')
print(type(r), r)
r = reduce(lambda x,y:y+x, 'abcdefg')
print(type(r), r)

