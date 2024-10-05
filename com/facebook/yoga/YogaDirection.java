package com.facebook.yoga;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum YogaDirection {
    INHERIT(0),
    LTR(1),
    RTL(2);

    public final int d;

    YogaDirection(int i) {
        this.d = i;
    }

    public static YogaDirection a(int i) {
        if (i == 0) {
            return INHERIT;
        }
        if (i == 1) {
            return LTR;
        }
        if (i == 2) {
            return RTL;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unknown enum value: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
