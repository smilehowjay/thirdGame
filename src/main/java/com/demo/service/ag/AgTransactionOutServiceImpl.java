package com.demo.service.ag;

import com.demo.constanins.annotation.ThirdGameHandler;
import com.demo.pojo.request.ThirdGameRequest;
import com.demo.pojo.response.TransactionInResponse;
import com.demo.pojo.response.TransactionOutResponse;
import com.demo.service.common.ThirdGameMethodService;

import static com.demo.constanins.ActionType.TRANSACTION_IN;
import static com.demo.constanins.ActionType.TRANSACTION_OUT;
import static com.demo.constanins.ThirdGameFirm.AG;

@ThirdGameHandler(gameFirm = AG, actionType = TRANSACTION_OUT)
public class AgTransactionOutServiceImpl implements ThirdGameMethodService<TransactionOutResponse> {
    @Override
    public TransactionOutResponse action(ThirdGameRequest request) {
        return null;
    }
}
