#!/usr/bin/env python3
#Program to display cats

import requests
import textwrap
from tkinter import *
from io import BytesIO
from PIL import Image, ImageTk

class MainWindow(Frame):
    def __init__(self, master=None):
        self.Catpic_cycle = 0

        Frame.__init__(self, master)
        self.pack()
        self.create_self()
        self.newcat()

#Creates main window and widgets for it
    def create_self(self):
        self.master.title('cat script')

        self.menu_bar = Menu(self)

        self.file_menu = Menu(self.menu_bar, tearoff=0)
        self.file_menu.add_command(label='herro!', command=self.herro)
        self.file_menu.add_command(label='about', command=self.about)
        self.menu_bar.add_cascade(label='File', menu=self.file_menu)
  
        self.menu_bar.add_command(label='Settings', command=self.open_settings)

        self.master.config(menu=self.menu_bar)

        self.main_w = Canvas(self)
        self.main_w.pack()

#FIXME Doesn't display button if the Y dimension is smaller than the picture
#possibly related to MainWindow.newcat()
        self.next_b = Button(self, text='Next Kitty Cat!',
                command=self.newcat)
        self.next_b.pack(fill='both', expand=1) 

#Displays a new cat every time called
    def newcat(self):
        Catpic_width = 0
        Catpic_height = 0

#Downloads jpg of a cat as a binary stream and then converts it into something
#that tkinter can use NOTE I need to figure out how to make the picture sizes
#something that always displays nicely on the screen
        URL = 'http://www.thecatapi.com/api/images/get?size=med&type=jpg'
        raw_catpic = Image.open(BytesIO(requests.get(URL).content))
        Catpic_width, Catpic_height = raw_catpic.size
        catpic = ImageTk.PhotoImage(raw_catpic)
        self.main_w.config(width=Catpic_width, height=Catpic_height)
        self.main_w.create_image(Catpic_width/2, Catpic_height/2, image=catpic)
        self.main_w.image = catpic

#Place holder for whatever needs a placeholder setting
    def herro(self):
        print('Herro!')

#About section of file, in form of popup
    def about(self):
        self.about_top = Toplevel()
        self.about_top.title = 'About Cat Script'
        
        self.about_message = ("Cat Scripts is an open source cat viewer "
        "powered by The Cat API and developed by Isaac O'Hern.")
        self.about_show = Message(self.about_top, text=self.about_message)
        self.about_show.pack()

        self.about_exit = Button(self.about_top, text='exit',
                command=self.about_top.destroy)
        self.about_exit.pack()

    def open_settings(self):
        self.settings_popup = Settings(self)
        print(self.Catpic_cycle)

#XXX Settings, next thing to work on
class Settings(Toplevel):
    def __init__(self, master=None):

        Toplevel.__init__(self, master)
        self.create_settings()
        print('Settings Work')

    def create_settings(self):
        self.settings_w = Canvas(self, width=512, height=512)
        self.settings_w.pack()

        self.Catpic_cycle_check = Checkbutton(self.settings_w,
                text='Autocycle pictures', variable=self.master.Catpic_cycle)
        self.Catpic_cycle_check.pack()

        self.herro_label = Label(self.settings_w, text='Herro!')
        self.herro_label.pack()

#Works as main function of program
if __name__ == '__main__':
    root = Tk()
    catapp = MainWindow(master=root)
    catapp.mainloop()
