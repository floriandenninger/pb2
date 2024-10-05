package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class azwc {
    public final Throwable b;
    public final azvj c;

    public azwc(Throwable th, boolean z) {
        this.b = th;
        this.c = azth.m(z);
    }

    public final boolean a() {
        return this.c.b();
    }

    public final String toString() {
        return azth.g(this) + '[' + this.b + ']';
    }

    public /* synthetic */ azwc(Throwable th) {
        this(th, false);
    }
}
