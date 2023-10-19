package baseball

import baseball.util.validateInputBaseBall
import camp.nextstep.edu.missionutils.Console
import camp.nextstep.edu.missionutils.Randoms

class BaseBallGame {

    fun pickBaseBallNumber(): List<Int> {
        val computerNumber = mutableListOf<Int>()
        while (computerNumber.size < BASEBALL_SIZE) {
            val randomNumber = Randoms.pickNumberInRange(1, 9)
            if (!computerNumber.contains(randomNumber)) {
                computerNumber.add(randomNumber)
            }
        }

        return computerNumber
    }

    private fun inputBaseBallNumber(): List<Int> {
        val inputBaseBallNumber = Console.readLine().map { it ->
            it.code - '0'.code
        }

        validateInputBaseBall(inputBaseBallNumber)
        return inputBaseBallNumber
    }

    companion object {
        const val BASEBALL_SIZE = 3
    }

}