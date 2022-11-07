#include <iostream>
using namespace std;

int main()
{
    int bottles;
    // cout<<"asdasd"<<endl;
    while(cin>>bottles)
    {
        if(bottles!=0)
        {
            cout<<((bottles+bottles/2)/3)<<endl;;
        }
        else
        break;
    }
}