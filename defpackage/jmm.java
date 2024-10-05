package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jmm {
    public final azrw a;
    public final Executor b;
    public final jtv c;
    public final axzg d;
    private final jtt e;

    public jmm(azrw azrwVar, jtt jttVar, Executor executor, jtv jtvVar, axzg axzgVar, byte[] bArr, byte[] bArr2) {
        this.a = azrwVar;
        this.e = jttVar;
        this.b = executor;
        this.c = jtvVar;
        this.d = axzgVar;
    }

    public final jub a() {
        jub a = ((juc) this.a.get()).a();
        a.k();
        a.a = this.e.a(false);
        return a;
    }
}
