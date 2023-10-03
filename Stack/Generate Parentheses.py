n = 3

def solution(n):
    res = []
    stack = []

    def backtracking(openN, closeN):
        # print(openN, closeN)
        # print(stack)
        if openN == closeN == n:
            print(stack)
            res.append("".join(stack))

        if openN < n:
            stack.append("(")
            print("PUSH1",stack)
            backtracking(openN + 1, closeN)
            stack.pop()
            print("POP1",stack)

        if closeN < openN:
            stack.append(")")
            print("PUSH2",stack)
            backtracking(openN, closeN + 1)
            stack.pop()
            print("POP2",stack)


    backtracking(0,0)
    return res

print(solution(n))