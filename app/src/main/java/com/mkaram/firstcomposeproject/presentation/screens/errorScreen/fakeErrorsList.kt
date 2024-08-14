package com.mkaram.firstcomposeproject.presentation.screens.errorScreen

val errorCodesReversed: Map<String, String> = mapOf(
    "400" to "BadRequest",
    "401" to "Unauthorized",
    "403" to "Forbidden",
    "404" to "NotFound",
    "405" to "MethodNotAllowed",
    "408" to "RequestTimeout",
    "409" to "Conflict",
    "410" to "Gone",
    "413" to "PayloadTooLarge",
    "415" to "UnsupportedMediaType",
    "429" to "TooManyRequests",
    "500" to "InternalServerError",
    "501" to "NotImplemented",
    "502" to "BadGateway",
    "503" to "ServiceUnavailable",
    "504" to "GatewayTimeout",
    "505" to "NetworkError"
)
