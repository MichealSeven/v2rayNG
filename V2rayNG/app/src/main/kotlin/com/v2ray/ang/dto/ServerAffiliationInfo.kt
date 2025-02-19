package com.v2ray.ang.dto

data class ServerAffiliationInfo(var testDelayMillis: Long = 0L , var guid: String = "") {
    fun getTestDelayString(): String {
        if (testDelayMillis == 0L) {
            return ""
        }
        return testDelayMillis.toString() + "ms"
    }
}
