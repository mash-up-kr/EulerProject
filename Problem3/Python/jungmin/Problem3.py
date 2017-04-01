# 600851475143의 소인수 중에서 가장 큰 수를 구하시오.


def problem3():
    result = []
    num = 600851475143
    for i in range(2, num):
        if num % i == 0:
            result.append(i)
            num /= i
            if num == 1:
                break
    return result

print(max(problem3()))
