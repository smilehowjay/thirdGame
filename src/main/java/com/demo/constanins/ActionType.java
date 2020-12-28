package com.demo.constanins;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ActionType {
    FORWARD("forward"),
    GET_BALANCE("getBalance"),
    QUERY_BET_RECORD("queryBetRecord"),
    TRANSACTION_IN("TransactionIn"),
    TRANSACTION_OUT("TransactionOut");
    private String name;
}
