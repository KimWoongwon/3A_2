def flunk1(s):
    return s<60
def flunk2(s):
    return str(s[0]).isalpha()
def flunk3(s):
    return type(s[0]) == str

score1 = [95,35,68,48,85,95]
print('=== flunk1 ===')
f = filter(flunk1, score1)
for n in f:
     print(n)
# print(type(flunk), flunk)
# f1 = f.__next__()
# print(type(f1), f1)
# for n in f:
#     print(n)

score2 = [('aa', 1), ('bb', 2), ('100', 200), (10, 20)]
f = filter(flunk2, score2)
print('=== flunk2 ===')
for n in f:
     print(n)
print('=== flunk3 ===')
f = filter(flunk3, score2)
for n in f:
     print(n)
