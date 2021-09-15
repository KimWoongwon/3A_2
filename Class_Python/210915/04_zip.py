yoil = ['월', '화', '수', '목', '금', '토', '일']
food = ['갈비탕', '순대국', '파스타', '떡볶이', '칼국수', '해장국', '김밥']

menu = zip(yoil, food)
print(type(menu), menu)

m = menu.__next__()
print(type(m), m)