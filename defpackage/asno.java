package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum asno implements aonq {
    LIKE(0),
    DISLIKE(1),
    INDIFFERENT(2);

    public static final aonr d = new ancw(2);
    public final int e;

    asno(int i) {
        this.e = i;
    }

    public static aons a() {
        return asje.m;
    }

    public static asno b(int i) {
        if (i == 0) {
            return LIKE;
        }
        if (i == 1) {
            return DISLIKE;
        }
        if (i != 2) {
            return null;
        }
        return INDIFFERENT;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
