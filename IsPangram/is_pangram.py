s = input().lower() # input-constraints {a-z, A-Z, space}

letter_set = set(s)

print('pangram' if len(letter_set) >= 26 else 'not pangram')
