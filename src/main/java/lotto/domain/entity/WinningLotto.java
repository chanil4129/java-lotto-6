package lotto.domain.entity;

import java.util.List;
import lotto.domain.util.validator.WinningLottoValidator;

public class WinningLotto extends Lotto {
    private final Integer bonusNumber;

    public WinningLotto(List<Integer> numbers, Integer bonusNumber) {
        super(numbers);
        WinningLottoValidator.validate(numbers, bonusNumber);
        this.bonusNumber = bonusNumber;
    }
}
