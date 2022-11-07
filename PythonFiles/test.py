import jieba
import jieba.analyse
import jieba.posseg

str_new='希望明天没有疫情'
sentence_seged=jieba.posseg.cut(str_new)
outstr=''
for x in sentence_seged:
    outstr=outstr+f'{x.word}/{x.flag}'
print(outstr)
