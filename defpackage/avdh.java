package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avdh implements aonq {
    UNKNOWN_EVENT_TAG(0),
    POST_INIT(1);

    public final int c;

    avdh(int i) {
        this.c = i;
    }

    public static aons a() {
        return avcl.g;
    }

    public static avdh b(int i) {
        if (i == 0) {
            return UNKNOWN_EVENT_TAG;
        }
        if (i != 1) {
            return null;
        }
        return POST_INIT;
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
