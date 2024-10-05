package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jbt implements akbl {
    final /* synthetic */ Runnable a;
    final /* synthetic */ jbu b;

    public jbt(jbu jbuVar, Runnable runnable) {
        this.b = jbuVar;
        this.a = runnable;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
        this.a.run();
        this.b.e = Optional.empty();
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
        jbu jbuVar = this.b;
        jbuVar.c.b(jbuVar.d.h);
        this.b.e = Optional.of((akby) obj);
    }
}
