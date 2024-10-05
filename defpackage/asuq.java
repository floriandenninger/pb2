package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum asuq implements aonq {
    UNKNOWN(0),
    USER_AUTH(1),
    VISITOR_ID(2),
    PLUS_PAGE_ID(3),
    SPATULA_V1(4),
    SHERLOG_SESSION_ID(5);

    public final int g;

    asuq(int i) {
        this.g = i;
    }

    public static aons a() {
        return assi.p;
    }

    public static asuq b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return USER_AUTH;
        }
        if (i == 2) {
            return VISITOR_ID;
        }
        if (i == 3) {
            return PLUS_PAGE_ID;
        }
        if (i == 4) {
            return SPATULA_V1;
        }
        if (i != 5) {
            return null;
        }
        return SHERLOG_SESSION_ID;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
