def half(s):
    return s/2

score = [95,35,68,48,85,95]
m = map(half, score)

for n in m:
    print(n)

m = list(map(half, score))
print(m)