package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aznw extends ayqj {
    final ayqm a;
    final long b;
    final TimeUnit c;
    final ayqi d;

    public aznw(ayqm ayqmVar, long j, TimeUnit timeUnit, ayqi ayqiVar) {
        this.a = ayqmVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayqiVar;
    }

    @Override // defpackage.ayqj
    protected final void aa(ayqk ayqkVar) {
        aznv aznvVar = new aznv(ayqkVar, this.b, this.c);
        ayqkVar.se(aznvVar);
        ayrz.i(aznvVar.b, this.d.c(aznvVar, this.b, this.c));
        this.a.Z(aznvVar);
    }
}
