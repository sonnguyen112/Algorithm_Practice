nums = [1,1,1,2,2,3]
k = 2

def solution(nums, k):
    count = {}
    for e in nums:
        count[e] = count.get(e, 0) + 1
    print(count)
    freq = [[] for i in range(len(nums) + 1)]
    for key,val in count.items():
        freq[val].append(key)
    print(freq)
    res = []
    for i in range(len(freq) - 1, -1, -1):
        for n in freq[i]:
            res.append(n)
            if len(res) == k:
                print(res)
                return res
solution(nums, 3)