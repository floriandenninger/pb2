package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aqnb implements aonq {
    REQUEST_TYPE_UNSPECIFIED(0),
    REQUEST_TYPE_LOADING(1);

    public final int c;

    aqnb(int i) {
        this.c = i;
    }

    public static aons a() {
        return aqkw.i;
    }

    public static aqnb b(int i) {
        if (i == 0) {
            return REQUEST_TYPE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return REQUEST_TYPE_LOADING;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
