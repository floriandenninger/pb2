package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azgl extends azfc {
    final long b;
    final TimeUnit c;
    final ayqi d;

    public azgl(ayqb ayqbVar, long j, TimeUnit timeUnit, ayqi ayqiVar) {
        super(ayqbVar);
        this.b = j;
        this.c = timeUnit;
        this.d = ayqiVar;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        this.a.aE(new azgk(new azqs(ayqdVar), this.b, this.c, this.d.a()));
    }
}
