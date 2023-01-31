from ctypes.wintypes import *
from ctypes import  windll

windll.user32.RegisterHotKey(0x0000, 0, 4)
