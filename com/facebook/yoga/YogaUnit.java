package com.facebook.yoga;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum YogaUnit {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);

    public final int e;

    YogaUnit(int i) {
        this.e = i;
    }

    public static YogaUnit a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return POINT;
        }
        if (i == 2) {
            return PERCENT;
        }
        if (i == 3) {
            return AUTO;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unknown enum value: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
