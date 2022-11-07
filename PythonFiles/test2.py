import requests
import bs4 
import jieba.analyse
from bs4 import BeautifulSoup
import nltk
from nltk.tokenize import RegexpTokenizer
from nltk.text import TextCollection
from nltk.tokenize import word_tokenize
from nltk.tokenize import sent_tokenize

def SplitSentence(content): #对中文段落进行分句
    tokenizer = RegexpTokenizer(".*?[。！？]") #就是以[]中的符号为标识分割的
    rst = tokenizer.tokenize(content)# list
    return rst

nltk.download('punkt')
if __name__ == '__main__':
    url = 'http://district.ce.cn/newarea/roll/202201/25/t20220125_37286708.shtml'#设置url
    header = {"User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36 Edg/106.0.1370.52"}
    #设置浏览器header

    req = requests.get(url=url,headers = header)
    req.encoding = 'gbk'
    html = req.text
    bes = BeautifulSoup(html,"lxml")
    texts = bes.find("div", id = "articleText")#爬取标签为div，id为articleText的全部内容
    texts = texts.text.split("\xa0"*4)
    sents=SplitSentence(texts[0])#对文本进行分句
    print(sents)#输出分句后的结果
    words=[jieba.lcut(sent) for sent in sents] #对每个句子进行分词
    print(words)  #输出分词后的结果
    corpus=TextCollection(words)  #构建语料库
    # print(corpus)  #输出语料库
    while 1:
        word=input("enter a word")
        #计算出现次数
        i=0
        for group in words:
            for item in group:
                if item==word:
                    i+=1
        print("times of : ",word," is: ",i)
        #计算词语出现在句子中的占比
        print("percentage of : ",word," is: ",i/len(words))
        #计算语料库中word的tf值
        tf=corpus.tf(word,corpus)    
        print("tf of : ",word,tf)        
        #计算语料库中word的idf值
        idf=corpus.idf(word)     
        print("idf of : ",word,idf)        
        #计算语料库中word的tf-idf值
        tf_idf=corpus.tf_idf(word,corpus)
        print("tf_idf of : ",word,tf_idf)