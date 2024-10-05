package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum axcf implements aonq {
    ADD_STICKER(1),
    ADD_TEXT(2);

    private final int d;

    axcf(int i) {
        this.d = i;
    }

    public static aons a() {
        return awwu.t;
    }

    public static axcf b(int i) {
        if (i == 1) {
            return ADD_STICKER;
        }
        if (i != 2) {
            return null;
        }
        return ADD_TEXT;
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
