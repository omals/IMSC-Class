# -*- coding: utf-8 -*-
"""5_LabCycle_2.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/15f_wWfZzTlmE9QAqLL2s7UHFwfMSdyOb

5. Write a program to create a parent class, 3DShapes, with methods 
printVolume() and printArea(), which prints the Volume and Area,
respectively. Create classes Cylinder and Sphere by inheriting
3DShapes class. Using these child classes, calculate and print the
volume and area of a cylinder and sphere.
"""

#base class
class Shapes:
  _area=None
  _vol=None
  def printArea(self):
    print("The Area is ",self._area)
  def printVolume(self):
    print("The Volume is ",self._vol)
  
#derived class-1
class Cylinder(Shapes):
  def __init__(self,h,r):
    self.__rad=r
    self.__height=h
  def Area(self):
    self._area=2*3.14*self.__rad*(self.__rad+self.__height)
  def Volume(self):
    self._vol=3.14*self.__height*(self.__rad**2)

#derived class-2
class Sphere(Shapes):
  def __init__(self,r):
    self.__rad=r
  def Area(self):
    self._area=4*3.14*self.__rad**2
  def Volume(self):
    self._vol=(3/4)*3.14*(self.__rad**3)

#finding the values for cylinder
print("\tCYLINDER")
r1=int(input("enter the radius of cylinder "))
h1=int(input("enter the heigth of cylinder "))
cyl=Cylinder(h1,r1)
cyl.Area()
cyl.printArea()
cyl.Volume()
cyl.printVolume()

#finding the values for sphere
print("\n\tSHPERE")
r2=int(input("enter the radius of sphere "))
sph=Sphere(r2)
sph.Area()
sph.printArea()
sph.Volume()
sph.printVolume()