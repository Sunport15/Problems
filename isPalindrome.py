def isPalindrome(s):
    return s == s[::-1]
s=input("Enter a word to check if palindrome : ")
if isPalindrome(s):
    print("Yes it is a palindrome")
else:
    print("No it is not a palindrome")
