#include <iostream>
#include <algorithm>
#include <cstring>
#include <cmath>

using namespace std;

int drinkcount = 0;

void BottlesforDrink()
{
    int bottles;
    while (1)
    {
        cin >> bottles;
        if (bottles == 0)
            return;
        cout << (bottles + bottles / 2) / 3 << endl;
    }
}

void deletenums()
{
    int n;
    int c;
    while (cin >> n)
    {
        int *nums = new int[n];
        for (int i = 0; i < n; i++)
        {
            cin >> c;
            nums[i] = c;
        }
        sort(nums, nums + n);
        for (int i = 0; i < n; i++)
        {
            if (nums[i] != nums[i + 1])
                cout << nums[i] << endl;
        }
    }
}

void output0x()
{
    string s;
    while (cin >> s)
    {
        int out = 0;
        s.erase(0, 2);
        for (int i = 0; i < s.length(); i++)
        {
            if ((int)s[i] >= 65 && (int)s[i] <= 70)
            {
                out += ((int)s[i] - 55) * pow(16, s.length() - i - 1);
            }
            else
            out+=((int)s[i] - 48) * pow(16, s.length() - i - 1);
        }
        cout << out << endl;
    }
    // cin >> s;
}

int main()
{

    // cout<<a[3];
    // BottlesforDrink();
    // deletenums();
    output0x();
}
