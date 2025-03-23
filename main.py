# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

import numpy as np
import tkinter as tk
from tkinter import *
import matplotlib.pyplot as plt
import math

def colorConvert(num):
    return "gray" + str(int(num*100))

def spike(max, gain, base):
    r = np.array([base])
    dt = 0.1
    t=np.array([0])
    baseTime=30
    falling = np.array([1])
    for step in range(1, int(100/dt)):
        print("step: " + str(step))
        t=np.append(t, [t[step-1]+dt])
        print("t: " + str(t[step]))
        print("times: " + str(len(t)))
        next = r[step - 1]
        print("relative distance: " + str((max - r[step-1]) < 0.1 * max))
        print("actual rd value: " + str ((max - r[step-1])) + ", value: " + str(0.1 * max))
        print("falling greater: " + str(falling[step-1] > -1))
        if ((max - r[step-1]) < 0.1 * max) & (falling[step-1] > -1):
            nextFalling = falling[step-1] - 1 / 100
            falling = np.append(falling, nextFalling)
            print("falling: " + str(falling[step]))
        else:
            falling = np.append(falling, [falling[step-1]])
            print("falling: " + str(falling[step]))
        next = next + falling[step-1] * (gain * ((max-r[step-1])) * math.log2(r[step-1]+1.0001))
        next = next + (gain * (0.01-r[step-1])/100)
        r = np.append(r, [next])
        print("value: " + str(r[step]))
        print("values: " + str(len(r)))

    plt.plot(t,r)
    plt.show()

def submit():
    h = height_var.get()
    l = layers_var.get()
    print("height: " + str(h))
    canvas = Canvas(root, width=500, height=400, bg="white")
    canvas_label = tk.Label(root, text='height: ' + str(h) + ", layers: " + str(l), font=('calibre', 10))
    print("test")
    # dmatrix = np.random.rand(h, l)
    dmatrix = np.zeros([h, l])
    print(dmatrix)
    for x in range(l):
        for y in range(h):
            print("about to print square " + str(x) + ", " + str(y))
            color = colorConvert(dmatrix[y][x])
            canvas.create_rectangle((x * 15) + 10, (y * 15) + 10, (x * 15) + 20, (y * 15) + 20, fill=color)
            print(str(x) + ", " + str(y) + ", color: " + color + ", value: " + str(dmatrix[y][x]))
    def clear():
        canvas.destroy()
        clr_btn.destroy()
        canvas_label.destroy()
    clr_btn = tk.Button(root, text='Clear', command=clear)
    clr_btn.pack()
    canvas_label.pack()
    canvas.pack()
    clr_btn.pack()
    # display matrix

# poisson distribution for first prototype must be 0.02 per 10ms
# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    root = tk.Tk()

    # creating variables
    height_var = tk.IntVar()
    layers_var = tk.IntVar()
    branchRatio = tk.IntVar()

    # scroll wheel
    scrollbar = Scrollbar(root, orient='vertical')

    # settings for window
    root.title("test")
    label = tk.Label(root, text='new window')
    root.geometry("600x400")
    height_label = tk.Label(root, text='height', font=('calibre', 10, 'bold'))
    height_entry = tk.Entry(root, textvariable=height_var, font=('calibre', 10, 'normal'))
    layers_label = tk.Label(root, text='layers', font=('calibre', 10, 'bold'))
    layers_entry = tk.Entry(root, textvariable=layers_var, font=('calibre', 10, 'normal'))
    sub_btn = tk.Button(root, text='Submit', command=submit)

    # displaying everything
    label.pack()
    height_label.pack()
    height_entry.pack()
    layers_label.pack()
    layers_entry.pack()
    sub_btn.pack()

    # test
    print("y")

    root.mainloop()
    # test
