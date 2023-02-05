# Homework
Write a console application program that allows you to calculate the perimeters and areas of geometric shapes of different sizes.

The program should show the user a menu with various actions he can perform and prompting them to enter their choice:

```
1. Add new shape
2. List all shapes
3. Sum all circumferences
4. Sum all areas
5. Find the biggest circumference
6. Find the biggest area
7. Exit
```
After selecting a user, the corresponding operation will be performed and at the end the menu will be displayed again until the user selects the option `Exit`.

## Add new shape
If the user selects this option, a menu will be displayed that will allow them to select the type of shape they want to add:
```
1. Square
2. Rectangle
3. Circle
4. Right triangle
```
Depending on the type of form selected by the user, the system should ask him for the color of the form, as well as the dimensions of the desired form.

## List all shapes
If the user selects this option, they will be shown a list of all the shapes they have added (since the start of the program), one line for each shape. There is no need to save information between runs. For each shape, the type and corresponding dimensions will be displayed by shape type, for example:
```
Square: width=10, color=Red
Rectangle: width=20, height=30 , Color=White
Circle: r=12, color=Red
```

## Sum all circumferences / Sum all areas
If the user selects one of these options, the system will calculate the amount perimeters or sum of areas respectively and display the result to the user.

## Find the biggest circumference / Find the biggest circumference
If the user selects one of these options, they will be shown the details of the shape with the largest circumference or area, and the other line will show the size or area of the same shape. The shape details will be displayed in the same way as in the list of all shapes.

## Exit
Exit from the program.