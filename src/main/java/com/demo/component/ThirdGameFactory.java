package com.demo.component;

import com.demo.constanins.ActionType;
import com.demo.constanins.ThirdGameFirm;
import com.demo.constanins.annotation.ThirdGameHandler;
import com.demo.service.common.ThirdGameMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class ThirdGameFactory {
    @Autowired
    private List<ThirdGameMethodService> thirdGameMethodServiceList;

    private static Map<ActionType, Map<ThirdGameFirm, ThirdGameMethodService>> actionMap = new HashMap<>();


    @PostConstruct
    public void init() {
        actionMap = thirdGameMethodServiceList.stream()
                .filter(bean -> bean.getClass().isAnnotationPresent(ThirdGameHandler.class))
                .collect(
                        Collectors.groupingBy(
                                bean -> bean.getClass().getAnnotation(ThirdGameHandler.class).actionType(),
                                Collectors.toMap(bean -> bean.getClass().getAnnotation(ThirdGameHandler.class).gameFirm(), Function.identity()))
                );
    }

    public ThirdGameMethodService getActionMap(ActionType actionType, ThirdGameFirm gameFirm) {
        return actionMap.get(actionType).get(gameFirm);
    }
}
