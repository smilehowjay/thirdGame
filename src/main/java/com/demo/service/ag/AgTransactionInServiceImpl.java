package com.demo.service.ag;

import com.demo.constanins.annotation.ThirdGameHandler;
import com.demo.pojo.request.ThirdGameRequest;
import com.demo.pojo.response.ForwardResponse;
import com.demo.pojo.response.TransactionInResponse;
import com.demo.service.common.ThirdGameMethodService;

import static com.demo.constanins.ActionType.FORWARD;
import static com.demo.constanins.ActionType.TRANSACTION_IN;
import static com.demo.constanins.ThirdGameFirm.AG;

@ThirdGameHandler(gameFirm = AG, actionType = TRANSACTION_IN)
public class AgTransactionInServiceImpl implements ThirdGameMethodService<TransactionInResponse> {
    @Override
    public TransactionInResponse action(ThirdGameRequest request) {
        return null;
    }
}
