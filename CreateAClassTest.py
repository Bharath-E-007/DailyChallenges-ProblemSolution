class Test:
    def __init__(self, testname, testduration):  # Fixed constructor method name
        self.testname = testname
        self.testduration = testduration

    def getName(self):
        return self.testname

    def getDuration(self):
        return self.testduration

testiname = input().strip()
testiduration = int(input().strip())
test2name = input().strip()
test2duration = int(input().strip())

test1 = Test(testiname, testiduration)
test2 = Test(test2name, test2duration)

print(f"{test1.getName()} + {test2.getName()}")  # Improved string concatenation
print(test1.getDuration() + test2.getDuration())