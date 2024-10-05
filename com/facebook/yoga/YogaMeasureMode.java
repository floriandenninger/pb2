package com.facebook.yoga;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum YogaMeasureMode {
    UNDEFINED,
    EXACTLY,
    AT_MOST;

    public static YogaMeasureMode a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EXACTLY;
        }
        if (i == 2) {
            return AT_MOST;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unknown enum value: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
