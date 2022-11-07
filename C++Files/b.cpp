#include <iostream>
#include <algorithm>
#include <cstring>
#include <cmath>

using namespace std;

int main()
{
    string s;
    string out="";
    cin>>s;
    int len=0;
    int maxlen=0;
    int repeattimes=0;
    int maxrepeattimes=0;
    string temp;
    // cout<<s.substr(0,3);
    for(int i=1;i<(int)(s.length()/2);i++)//i是当前检测子串长度
    {
        for(int j=0;j<s.length()-i;j+=i)
        {
            repeattimes=0;
            string temp1=s.substr(j,i);
            string temp2=s.substr(j+i,i);
            int k=j;
            while(s.substr(k,i)==s.substr(k+i,i))
            {
                repeattimes++;
                k+=i;
            }
            if(maxrepeattimes<=repeattimes)
            {
                if(maxrepeattimes==repeattimes)
                {
                    if(maxlen<=i)
                    {
                        if(maxlen==i)
                        ;
                        else
                        {
                            maxlen=i;
                            out=s.substr(j,i);
                            continue;
                        }
                    }
                }
                else{
                    maxrepeattimes=repeattimes;
                    maxlen=i;
                    out=s.substr(j,i);
                    continue;
                }
            }
        }    
    }
     cout<<out<<endl;
    
    


}

// {
//         int num;
//     cin>>num;
//     int stakes[num];
//     int distances[num-1];
//     for(int i=0;i<num;i++)
//     {
//         cin>>stakes[i];
//         if(i>=1)
//         {
//             distances[i-1]=stakes[i]-stakes[i-1];
//         }
        
//     }
//     int longest=0;
//     int temp=0;
//     int jump=0;
//     for(int i=0;i<num-1;i++)
//     {
//         int j=i;
//         temp=distances[j];//最多跨越距离
//         if(jump+1<distances[i])
//         {
//             longest=stakes[i];
//             cout<<longest<<endl;
//             return 0;
//         }
//         else{//下一次跳至少能达到下一个木桩
//             while(jump+1>=temp)
//             {
//                 j+=1;
//                 temp+=distances[j];
//             }
//             temp-=distances[j];
//             if(temp==jump+1)
//                 jump++;
//             else if(temp==jump)
//                 ;
//             else if(temp==jump-1)
//                 jump--;
//             if(j>i+1)
//             i=j-1;
//             // i=j+1;
//             // i=j-1;
            
//         }

        
//     }
    

//     return 0;
// }