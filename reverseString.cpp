#include <bits/stdc++.h>
using namespace std;
 
// Function to reverse a string
/*void reverseStr(string& str)
{
    int n = str.length();
 
    // Swap character starting from two
    // corners
    for (int i = 0; i < n / 2; i++)
        swap(str[i], str[n - i - 1]);
}*/

void swapp(char &s,char &s1){
    char temp;
    temp=s;
    s=s1;
    s1=temp;
}
 
void reverseStr(string& str)
{
    int n = str.length();
 
    // Swap character starting from two
    // corners
    for (int i = 0; i < n / 2; i++)
        swapp(str[i], str[n - i - 1]);
}
 
// Driver program
int main()
{
    string str = "sunidhi";
    reverseStr(str);
    cout << str;
    return 0;
}