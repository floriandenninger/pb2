package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayui extends ayph {
    final aypk a;
    final long b;
    final TimeUnit c;
    final ayqi d;

    public ayui(aypk aypkVar, long j, TimeUnit timeUnit, ayqi ayqiVar) {
        this.a = aypkVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayqiVar;
    }

    @Override // defpackage.ayph
    protected final void V(aypi aypiVar) {
        this.a.U(new ayuh(aypiVar, this.b, this.c, this.d));
    }
}
