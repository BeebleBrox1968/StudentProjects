print("What operation do you want to do?")
operation = input()
print("Select your first number")
num1 = int(input())
print("Select your second number")
num2 = int(input())
if operation == "Addition":
    print("The sum is: " + str(num1 + num2))
elif operation == "Subtraction":
    print("The difference is: " + str(num1 - num2))
elif operation == "Multiplication":
    print("The product is: " + str(num1 * num2))
elif operation == "Division":
    print("The quotient is: " + str(num1 / num2))
else:
    print("You did not choose a valid operation")
