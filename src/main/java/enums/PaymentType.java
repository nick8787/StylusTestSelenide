package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PaymentType {
    CRYPTO_CURRENCY_PAYMENT("Оплата криптовалютою"),
    CASH_ON_DELIVERY_PAYMENT("Готівкою при отриманні"),
    THREE_PARTS_PRIVATBANK_PAYMENT("Оплата 3 частинами від ПриватБанку"),
    SIX_PARTS_SPORTBANK_PAYMENT("Оплата 6 частинами від Sportbank"),
    SIX_PARTS_PUMB_PAYMENT("Оплата 6 частинами від ПУМБ"),
    NON_CASH_WITH_PDV_PAYMENT("Безготівковий розрахунок з ПДВ"),
    CARD_ON_WEBSITE_PAYMENT("Оплата карткою на сайті +4%"),
    NON_CASH_WITHOUT_PDV_PAYMENT("Безготівковий розрахунок без ПДВ +5%");

    private final String type;
}
