import Foundation

/*
 10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.

 1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?
 */

struct MutipleOperator {
    
    private static var set = Set<Int>()
    
    static func sumOfMultiple(limit: Int, numbers: Int...) -> Int {
        numbers.forEach { num in
            (1..<limit)
                .filter { $0 % num == 0 }
                .forEach { multiplier in set.insert(multiplier)  }
        }
        return set.reduce(0, +)
    }
}

MutipleOperator.sumOfMultiple(limit: 1000, numbers: 3, 5)