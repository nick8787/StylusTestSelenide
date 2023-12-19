package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DeliveryStreet {
    KHRESHCHATYK_STREET("Khreshchatyk street 41"),
    SOBORNA_STREET("Soborna street 25"),
    RUSANIVSKA_EMBANKMENT("Rusanivska embankment 10/1");

    private final String type;
}
