package com.facebook.yoga;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum YogaEdge {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);

    public final int j;

    YogaEdge(int i) {
        this.j = i;
    }

    public static YogaEdge a(int i) {
        switch (i) {
            case 0:
                return LEFT;
            case 1:
                return TOP;
            case 2:
                return RIGHT;
            case 3:
                return BOTTOM;
            case 4:
                return START;
            case 5:
                return END;
            case 6:
                return HORIZONTAL;
            case 7:
                return VERTICAL;
            case 8:
                return ALL;
            default:
                StringBuilder sb = new StringBuilder(31);
                sb.append("Unknown enum value: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
