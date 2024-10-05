package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum xfn {
    PRE_ROLL(1, "Preroll"),
    MID_ROLL(2, "Midroll"),
    POST_ROLL(3, "Postroll");

    public final int d;
    private final String f;

    xfn(int i, String str) {
        this.d = i;
        this.f = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f;
    }
}
