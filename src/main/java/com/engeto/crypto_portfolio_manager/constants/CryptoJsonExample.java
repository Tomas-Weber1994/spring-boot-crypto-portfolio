package com.engeto.crypto_portfolio_manager.constants;

import java.util.HashMap;
import java.util.Map;

public class CryptoJsonExample {

    public static final Map<String, Object> CRYPTO_JSON_EXAMPLE_FORMAT;

    static {
        CRYPTO_JSON_EXAMPLE_FORMAT = new HashMap<>();
        CRYPTO_JSON_EXAMPLE_FORMAT.put("id", 246);
        CRYPTO_JSON_EXAMPLE_FORMAT.put("name", "Bitcoin");
        CRYPTO_JSON_EXAMPLE_FORMAT.put("symbol", "BTC");
        CRYPTO_JSON_EXAMPLE_FORMAT.put("quantity", 0.17);
    }
}
