temperatures = [73,74,75,71,69,72,76,73]

def solution(temperatures):
    res = [0 for _ in temperatures]
    stack = [] # store pair (index,temp)
    for index,temp in enumerate(temperatures):
        while stack and temp > stack[-1][1]:
            i, t = stack.pop()
            res[i] = index - i
        stack.append((index, temp))
    return(res)

print(solution(temperatures))