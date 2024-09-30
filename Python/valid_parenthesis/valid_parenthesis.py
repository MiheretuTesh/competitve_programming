def valid_parentheses(s):
    stack = []
    open_brackets = ['(', '{', '[']
    close_brackets = [")", "}", "]"]

    for i in range(len(s)):
        if(s[i] in open_brackets):
            stack.append(s[i]);
        elif(s[i] in close_brackets):
            matching_bracket = open_brackets[close_brackets.index(s[i])]

            if(len(stack)==0 or stack.pop() != matching_bracket):
                return False;
    if(len(stack)==0):
        return True;


print(valid_parentheses("()"))
print(valid_parentheses("()[]{}"))
print(valid_parentheses("(]"))
print(valid_parentheses("([)]"))