import time
import pyperclip
def delete_newline_char(message):
    """删除message字符串中的换行符和换行连字符"""
    message = message.replace('. \r\n', '*-')        
    message = message.replace('.\r\n', '*-') 
    message = message.replace('?\r\n', '-*')    
    message = message.replace('? \r\n', '-*')   
    # 把message中的所有正常换行'.\r\n'替换成'*-'
    message = message.replace('\r\n', ' ') 
    # 把message中的所有不想出现的'\r\n'替换成空格
    message = message.replace('\2', '')          
    # 删除单词中间的换行连字符
    message = message.replace( '*-','. \r\n')  
    message = message.replace( '-*','? \r\n') 
    # 把message中的所有正常换行还原
    return message
  
content = pyperclip.paste()     
# 把剪贴板的内容粘贴到变量content中
content = delete_newline_char(content)      
# 删除content中的换行符
pyperclip.copy(content)     
# 把content的内容复制到剪贴板
print("先复制再粘贴，对Deepl的Ctrl+c+c快捷键没用，但是你可以Ctrl+c+c后再Ctrl+a再Ctrl+v，效率差不多\n\n修改了一下程序，对复制文本里本身正确的以句号或问号结尾的换行不会删除了，只会删除错误的半句中途换行")
# delete_newline_char('the diverse population the perfect ecosystem for its headquarters.  (a) The Oceania Airlines management team are concerned about terrorist attacks in')
while True:  #每隔一秒查询一次剪贴板，如果剪贴板的内容有更新，则重复刚才的动作
    time.sleep(0.1)       
    # 暂停一秒钟
    content_tmp = pyperclip.paste()     
    # 获取剪贴板的内容
    if content_tmp != content:          
    # 如果剪贴板的内容有更新，重复刚才的动作
        content = content_tmp
        content = delete_newline_char(content)
        pyperclip.copy(content)    


