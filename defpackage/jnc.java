package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jnc implements jmu {
    private final agpr a;
    private final Executor b;

    public jnc(agpr agprVar, Executor executor) {
        this.a = agprVar;
        this.b = executor;
    }

    @Override // defpackage.jmu
    public final anhy a(jmt jmtVar) {
        return anfq.h(anht.q(this.a.a((agnv) jmtVar.b())), new icu(13), this.b);
    }

    @Override // defpackage.jmu
    public final anhy b(jmt jmtVar) {
        return this.a.b((agnv) jmtVar.b());
    }

    @Override // defpackage.jmu
    public final anhy c(jmt jmtVar) {
        return this.a.c((agnv) jmtVar.b());
    }

    @Override // defpackage.jmu
    public final anhy d(jmt jmtVar) {
        return this.a.d((agnv) jmtVar.b());
    }
}
