package ru.one.integrality.commons.models_contracts.order;

import lombok.Getter;

@Getter
public enum OrderStatus {
    EXECUTION_STATUS_NEW(0), //*Новая
    EXECUTION_STATUS_FILL(1), //исполрнено
    EXECUTION_STATUS_REJECTED(2), //*Отклонена
    EXECUTION_STATUS_CANCELLED(3), //*Отменена пользователем
    EXECUTION_STATUS_PARTIALLYFILL(4); //частично исполнена

    private int value;

    OrderStatus(int value) {
        this.value = value;
    }
}

