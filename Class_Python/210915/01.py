#temp1 = [n*3 for n in range(5) if n % 2 == 0]
temp1 = []
for n in range(5):
    if(n%2==0):
        temp1.append(n*3)
print (type(temp1), temp1)

#temp1 = ['even' if n % 2==0 else 'odd' for n in range(5)]
temp1 = []
for n in range(5):
    if(n%2==0):
        temp1.append('even')
    else:
        temp1.append('odd')
print (type(temp1), temp1)

names = ['aa', 'bb', 'cc']
score = [95, 35, 78, 65, 40]
temp = dict(zip(names, score))
print (type(temp), temp)

temp = {names[n]:score[n] for n in range(len(names))}
print (type(temp), temp)

temp1 = {names[n]: 'pass' if score[n] > 40 else 'fail' for n in range(len(names))}
print (type(temp1), temp1)
temp2 = {key : 'pass' if value >= 60 else 'fail' for key, value in temp.items()}
print (type(temp2), temp2)



# n = 0
# for i in range(60):
#     n += 80
#     print('%2s : %02d:%02d, %02d:%02d'% (i, n // 60, n%60, (n-10) // 60, (n-10)%60))