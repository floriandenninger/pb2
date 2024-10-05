package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azbl extends ayvs {
    final TimeUnit c;

    public azbl(aypn aypnVar, TimeUnit timeUnit) {
        super(aypnVar);
        this.c = timeUnit;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        this.b.aa(new azbk(banwVar, this.c));
    }
}
