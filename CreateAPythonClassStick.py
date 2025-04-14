class Stick:
    def _init_(self, num):
        self.num = num

    def _add_(self, other):
        return Stick(self.num + other.num)

    def _str_(self):
        return f"Length: {self.num}"

# Input reading
nums = list(map(int, input().split()))
stick1 = Stick(nums[0])
stick2 = Stick(nums[1])

stick3 = stick1 + stick2
print(stick3)

