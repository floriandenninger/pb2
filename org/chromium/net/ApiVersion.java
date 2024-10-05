package org.chromium.net;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ApiVersion {
    private static final int API_LEVEL = 14;
    private static final String CRONET_VERSION = "95.0.4621.2";
    private static final String LAST_CHANGE = "c85e9916388c23a813d88f93d3778dc9fb64569e-refs/branch-heads/4621@{#3}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return "95.0.4621.2@c85e9916";
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 14;
    }
}
