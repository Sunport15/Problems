#include <iostream>
#include <string>
using namespace std;

bool isPalindrome(string str)
{
    int j = str.length() - 1;

    for (int i = 0; i < j; i++, j--)
    {
        if (str[i] != str[j])
        {
            return false;
        }
    }

    return true;
}

int main()
{
    string words[5] = {"mom", "radar", "level", "hello", "one"};
    for (int i = 0; i < 5; i++)
    {
        if (isPalindrome(words[i]))
        {
            cout << words[i] << " -> Palindrome" << endl;
        }
        else
        {
            cout << words[i] << " -> Not a Palindrome" << endl;
        }
    }

    return 0;
}