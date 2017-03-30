# 피보나치 수열에서 4백만 이하이면서 짝수인 항의 합


result = [1, 2]


def problem2():
    while True:
        num = result[-1] + result[-2]
        if num > 4000000: break
        else: result.append(num)
    return result

print(sum(i for i in problem2() if i % 2 == 0))
