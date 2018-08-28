s = input().replace(' ','').lower() # input-constraints {a-z, A-Z, space}
letter_set = set(s)
print('pangram' if len(letter_set) == 26 else 'not pangram')


#--------------------------------------------------------------------------------------------------------------------------

from collections import Counter
s = input().lower()
s_char_set = Counter(s)
s_char_set.pop(' ', None)

print('pangram' if len(s_char_set) == 26 else 'not pangram')


#--------------------------------------------------------------------------------------------------------------------------

from collections import defaultdict

s = input().lower()
char_dict = defaultdict(lambda:0)

for char in s:
    char_dict[char] += 1

char_dict.pop(' ',None)

print('pangram' if len(char_dict) == 26 else 'not pangram')
