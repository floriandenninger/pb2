package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azbj extends ayvs {
    final TimeUnit c;
    final ayqi d;

    public azbj(aypn aypnVar, TimeUnit timeUnit, ayqi ayqiVar) {
        super(aypnVar);
        this.c = timeUnit;
        this.d = ayqiVar;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        this.b.aa(new azbi(banwVar, this.c, this.d.a()));
    }
}
