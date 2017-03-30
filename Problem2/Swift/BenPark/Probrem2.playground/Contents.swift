import Foundation

/*
 피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
 
 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?
*/

let fibSequence = sequence(state: (0, 1)) { (state: inout(Int, Int)) -> Int? in
    guard state.0 <= 4_000_000 else {
        return nil
    }
    let upcomingNumber = state.0
    state = (state.1, state.0 + state.1)
    return upcomingNumber
}

fibSequence.filter { $0 % 2 == 0 }.reduce(0, +)
// 4613732 맞나요?
