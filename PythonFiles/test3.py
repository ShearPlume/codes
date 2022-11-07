from snownlp import SnowNLP#导入SnowNLP包
import numpy as np
text = open('lyrics/玫瑰少年.txt', mode="r", encoding='utf-8').read()#打开歌词文件
y = []
attitude=[]
high=0
low=0
mid=0
s = SnowNLP(text)#对歌词进行处理
print(s.words)
sentence = s.sentences
avg=0
for sentence_1 in s.sentences:#对每句歌词分别打分
    print(sentence_1)
    s1 = SnowNLP(sentence_1)
    score = s1.sentiments
    if(score>0.7):#分数大于0.7认为是积极
        attitude.append(2.0)#积极情感贡献分为2.0
        high+=1
    elif(score<0.5):#分数小于0.5认为是消极
        attitude.append(0.0)#消极情感贡献分为0.0
        low+=1
    else:#分数介于0.5到0.7之间认为是中性
        attitude.append(1.0)#中性情感贡献分为1.0
        mid+=1
    y.append(score)#将分数加入分数列表
    avg+=score

print(y)#输出全部分数
print("avg: ")
print(avg/len(y))#输出平均分数
print("high percentage: ")
print(high/len(y))#输出高分分数
print("middle percentage: ")
print(mid/len(y))#输出中分分数
print("low percentage: ")
print(low/len(y))#输出低分占比
print("avg emotion score: ")
print(np.mean(attitude))