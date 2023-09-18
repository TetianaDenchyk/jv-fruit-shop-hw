package core.basesyntax.service.strategy.impl;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.strategy.OperationHandler;

public class SupplyOperationHandler implements OperationHandler {

    @Override
    public void updateNumberOfFruit(FruitTransaction fruitTransaction) {
        Integer sumOfFruitAfterSupply = Integer.sum(
                Storage.STORAGE.get(fruitTransaction.getFruit()),
                fruitTransaction.getQuantity());
        Storage.STORAGE.put(fruitTransaction.getFruit(), sumOfFruitAfterSupply);
    }
}
