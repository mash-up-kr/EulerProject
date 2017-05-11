#_*_ coding: utf-8 _*_
""" 
1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면?
자연수: 1이상 양의 정수
3 또는 5의 배수 : 둘 중 하나로 나누어 떨어진다.  
모두 더한다.
"""
def problem1():
	return sum(filter(lambda x : x % 3 == 0 or x % 5 == 0, xrange(1,1000)))
if __name__ == "__main__":
	print(problem1())
