class Car:
    count = 0;
    def __init__(self):
        self.count += 1
        self.color = 0xff0000
        self.wheel_size = 16
        self.displacement = 2000

    def forword(self):
        print('{0}가 앞으로 전진'.format(self.name))

    def backword(self):
        pass

    def turn_left(self):
        pass

    def turn_right(self):
        pass

    # @staticmethod
    # def carinfo(self):
    #     self.name = '붕붕이'
    #     print('wheel_size : {0}, displacement : {1}, name : {2} price : {3}'
    #           .format(self.wheel_size, self.displacement, self.name, self.price))

    @classmethod
    def carinfo(cls):
        print('차량수 : {0}'.format(cls.count))

mycar = Car()
mycar1 = Car()
# mycar.forword()
# mycar.price = 100000
mycar.carinfo()
# mycar.forword()