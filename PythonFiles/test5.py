import requests
import bs4 
import jieba.analyse
from bs4 import BeautifulSoup
import nltk
from nltk.text import TextCollection
from nltk.tokenize import word_tokenize

nltk.download('punkt')
if __name__ == '__main__':
    url = 'http://district.ce.cn/newarea/roll/202201/24/t20220124_37282544.shtml'#设置url
    header = {"User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36 Edg/106.0.1370.52"}
    #设置浏览器header

    req = requests.get(url=url,headers = header)
    req.encoding = 'gbk'
    html = req.text
    bes = BeautifulSoup(html,"lxml")
    texts = bes.find("div", id = "articleText")#爬取标签为div，id为articleText的全部内容
    # print(texts)
    # print("endl")
    texts_list = texts.text.split("\xa0"*4)
    # text='关键词是能够表达文档中心内容的词语，常用于计算机系统标引论文内容特征、信息检索、系统汇集以供读者检阅。关键词提取是文本挖掘领域的一个分支，是文本检索、文档比较、摘要生成、文档分类和聚类等文本挖掘研究的基础性工作'
    # keywords=jieba.analyse.extract_tags(text, topK=5, withWeight=False, allowPOS=())
    # print(keywords)
    # sents=[word_tokenize(sent) for sent in texts_list]
    # sent=word_tokenize(texts_list[0])
    # print(sent) 
    corpus=jieba.lcut(texts_list[0])
    corpus=TextCollection(corpus)  #构建语料库
    print(corpus) 

    tf=corpus.tf('农村',corpus)    # 1/12
    print(tf)

    # #计算语料库中"one"的idf值
    # idf=corpus.idf('农村')      #log(3/1)
    # print(idf)
    
    # #计算语料库中"one"的tf-idf值
    # tf_idf=corpus.tf_idf('农村',corpus)
    # print(tf_idf)
    # print(texts_list)
    # tfidf_vec = TfidfVectorizer()
    # tfidf_matrix = tfidf_vec.fit_transform(texts_list)
    # print(tfidf_matrix)
    # # 使用 get_feature_names() 得到不重复的单词
    # print(tfidf_vec.get_feature_names())

    # # 得到每个单词对应的 ID
    # print(tfidf_vec.vocabulary_)