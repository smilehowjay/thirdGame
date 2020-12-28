package com.demo.service.common;

import com.demo.pojo.request.ForwardRequest;
import com.demo.pojo.request.GetBalanceRequest;
import com.demo.pojo.request.QueryBetRecordRequest;
import com.demo.pojo.request.ThirdGameRequest;
import com.demo.pojo.request.TransactionInRequest;
import com.demo.pojo.request.TransactionOutRequest;
import com.demo.pojo.response.ForwardResponse;
import com.demo.pojo.response.GetBalanceResponse;
import com.demo.pojo.response.QueryBetRecordResponse;
import com.demo.pojo.response.TransactionInResponse;
import com.demo.pojo.response.TransactionOutResponse;

public interface ThirdGameService {
    ForwardResponse forward(ForwardRequest request);

    GetBalanceResponse getBalance(GetBalanceRequest request);

    TransactionInResponse transactionIn(TransactionInRequest request);

    TransactionOutResponse transactionOut(TransactionOutRequest request);

    QueryBetRecordResponse queryBetRecords(QueryBetRecordRequest request);
}
