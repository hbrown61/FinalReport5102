def is_palindrome(str1):
    reverse = str1[::-1]
    print("Your word reversed is: ", reverse)
    if str1 == reverse:
        return True
    else:
        return False


word = input("Enter a word or phrase: ")
print("Palindrome?", is_palindrome(word))

