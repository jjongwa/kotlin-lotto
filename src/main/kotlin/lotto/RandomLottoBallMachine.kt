package lotto

class RandomLottoBallMachine : LottoBallMachine {
    override fun generate(): LottoLine {
        LOTTO_NUMBERS.shuffled().let {
            return LottoLine(it.subList(0, 6))
        }
    }

    companion object {
        private val LOTTO_NUMBERS: List<LottoBall> =
            (1..45)
                .map { LottoBall(it) }
                .toList()
    }
}
