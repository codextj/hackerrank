s = input().replace(' ','').lower() # input-constraints {a-z, A-Z, space}
letter_set = set(s)
print('pangram' if len(letter_set) == 26 else 'not pangram')


#--------------------------------------------------------------------------------------------------------------------------
from collections import Counter
s = input().lower()
s_char_set = Counter(s)
s_char_set.pop(' ', None)

print('pangram' if len(s_char_set) == 26 else 'not pangram')
