import copy
list0 = ['a', 'b']
list1 = [list0,2,3]
list2 = copy.deepcopy(list1)
list2[0][1] = 'c'
list2[1] = 10
print(list1, list2)