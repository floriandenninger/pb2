package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axao extends Exception {
    public final axan a;

    public axao(axan axanVar, String str) {
        this(axanVar, str, null);
    }

    public final boolean a() {
        return this.a.g;
    }

    public axao(axan axanVar, String str, Throwable th) {
        super(str, th);
        this.a = axanVar;
    }

    public axao(axan axanVar, Throwable th) {
        this(axanVar, null, th);
    }
}
