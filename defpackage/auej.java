package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum auej implements aonq {
    POST_IMPRESSION_EVENT_TYPE_UNKNOWN(0),
    POST_IMPRESSION_EVENT_TYPE_ENTER(1),
    POST_IMPRESSION_EVENT_TYPE_LEAVE(2);

    public final int d;

    auej(int i) {
        this.d = i;
    }

    public static aons a() {
        return atxj.p;
    }

    public static auej b(int i) {
        if (i == 0) {
            return POST_IMPRESSION_EVENT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return POST_IMPRESSION_EVENT_TYPE_ENTER;
        }
        if (i != 2) {
            return null;
        }
        return POST_IMPRESSION_EVENT_TYPE_LEAVE;
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
