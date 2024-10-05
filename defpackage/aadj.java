package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aadj {
    UNKNOWN(-1),
    AVAILABLE(0),
    STALE(1),
    EXPIRED(2),
    MISSING(3);

    public final int f;

    aadj(int i) {
        this.f = i;
    }
}
