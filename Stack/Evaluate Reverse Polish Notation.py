tokens = ["18"]

def solution(tokens):
    stack = []
    for token in tokens:
        if token in ["+", "-", "*", "/"]:
            num_2 = stack.pop()
            num_1 = stack.pop()
            stack.append(int(eval(f"{num_1}{token}{num_2}")))
        else:
            stack.append(token)
    print(stack)
    return int(stack.pop())

solution(tokens)