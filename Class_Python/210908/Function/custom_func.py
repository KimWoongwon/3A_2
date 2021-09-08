import random

def duplicates(list):
    return len(list) != len(set(list))

def SetRandomList():
    list = random.sample(range(0,10), 3)
    return list