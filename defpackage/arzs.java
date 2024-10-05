package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum arzs implements aonq {
    CODE_DELIVERY_METHOD_UNKNOWN(0),
    CODE_DELIVERY_METHOD_TEXT(1),
    CODE_DELIVERY_METHOD_CALL(2);

    public final int d;

    arzs(int i) {
        this.d = i;
    }

    public static aons a() {
        return armv.s;
    }

    public static arzs b(int i) {
        if (i == 0) {
            return CODE_DELIVERY_METHOD_UNKNOWN;
        }
        if (i == 1) {
            return CODE_DELIVERY_METHOD_TEXT;
        }
        if (i != 2) {
            return null;
        }
        return CODE_DELIVERY_METHOD_CALL;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
