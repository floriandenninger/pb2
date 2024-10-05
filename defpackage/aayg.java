package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aayg extends aasw {
    private final afsy a;
    private final aasp b;
    private final aasp c;
    private final aasp g;

    public aayg(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = c(artt.a, aarmVar, aaxq.j, aaxf.r);
        this.c = c(artr.a, aarmVar, aaxq.i, aaxf.q);
        this.g = c(artv.a, aarmVar, aaxq.k, aaxf.s);
    }

    public final aayd a() {
        return new aayd(this.f, this.a.c(), null, null, null);
    }

    public final aaye b() {
        return new aaye(this.f, this.a.c(), null, null, null);
    }

    public final aayf d() {
        return new aayf(this.f, this.a.c(), null, null, null);
    }

    @Deprecated
    public final anhy e(aayd aaydVar) {
        return this.c.a(aaydVar);
    }

    public final anhy f(aayd aaydVar, Executor executor) {
        return this.c.b(aaydVar, executor);
    }

    @Deprecated
    public final anhy g(aaye aayeVar) {
        return this.b.a(aayeVar);
    }

    public final anhy h(aaye aayeVar, Executor executor) {
        return this.b.b(aayeVar, executor);
    }

    @Deprecated
    public final anhy i(aayf aayfVar) {
        return this.g.a(aayfVar);
    }

    public final anhy j(aayf aayfVar, Executor executor) {
        return this.g.b(aayfVar, executor);
    }
}
