package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aqmy implements aonq {
    REQUEST_TYPE_UNSPECIFIED(0),
    REQUEST_TYPE_FILTER_CHANGE(1),
    REQUEST_TYPE_EXPANSION(2);

    public final int d;

    aqmy(int i) {
        this.d = i;
    }

    public static aons a() {
        return aqkw.h;
    }

    public static aqmy b(int i) {
        if (i == 0) {
            return REQUEST_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return REQUEST_TYPE_FILTER_CHANGE;
        }
        if (i != 2) {
            return null;
        }
        return REQUEST_TYPE_EXPANSION;
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
