package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bza extends abf {
    public final Throwable a;

    public bza(Throwable th) {
        this.a = th;
    }

    public final String toString() {
        return String.format("FAILURE (%s)", this.a.getMessage());
    }
}
