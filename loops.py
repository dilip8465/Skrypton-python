print("my name is {} and age is {}".format("dilip",22))
def sample(*args):
    for i in range(len(args)):
        print(args[i])
sample("dilip","kumar","chilukuri")