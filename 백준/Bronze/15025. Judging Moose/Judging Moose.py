a, b = map(int, input().split(" "))
if a == b == 0:
    print("Not a moose")
elif a != b:
    print(f"Odd {max(a, b)*2}")
else:
    print(f"Even {b*2}")