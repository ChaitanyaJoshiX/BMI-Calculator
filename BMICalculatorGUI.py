"""
BMI Calculator in Python with EasyGUI.
User enters height (cm) and weight (kg).
Program returns BMI.
"""
from easygui import *

def TypeBMI(bmi):
    typebmi = ""
    if bmi <= 18.4:
        typebmi = "You are underweight"
        return typebmi

    elif bmi > 18.4 and bmi < 25.0:
        typebmi = "You have a normal weight"
        return typebmi

    elif bmi > 25.0 and bmi <30.0:
        typebmi = "You are overweight"
        return typebmi

    elif bmi > 30.0:
        typebmi = "You are obese"
        return typebmi

    else:
        typebmi = "Invalid input"
        return typebmi

def YourBMI(height, weight):
    bmi = weight/(height*height)
    return bmi

message = "Welcome to the BMI Calculator!"
title = "BMI Calculator"
button = "Start"
msgbox(message, title, button) # Displaying Welcome message.

message = "Enter the height and weight"
title = "User Input"
detaillist = ["Height (cm)", "Weight (kg)"]
defaultlist = ["", ""]
userlist = multenterbox(message, title, detaillist, defaultlist) # Takes height and weight as input.

height = float(userlist[0])
height = height/100
weight = float(userlist[1])
bmi = YourBMI(height, weight)
bmi = round(bmi,2)
typebmi = TypeBMI(bmi)

title = "Result"
message = "\tResult\nYour BMI = " + str(bmi) + "\n" + typebmi
msgbox(message, title)
