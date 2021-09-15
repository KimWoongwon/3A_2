t = [1,5,7,33,39,52]
e = enumerate(t)
print(type(e.__iter__()))
print(e.__next__())
print(e.__next__())
print(e.__next__())
print(e.__next__())


# for i, v in e:
#     print('index : {0} value : {1}'.format(i,v))