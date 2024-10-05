package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayvx extends ayvs {
    final int c;
    final Callable d;

    public ayvx(aypn aypnVar, int i, Callable callable) {
        super(aypnVar);
        this.c = i;
        this.d = callable;
    }

    @Override // defpackage.aypn
    public final void ac(banw banwVar) {
        int i = this.c;
        if (i == 1) {
            this.b.aa(new ayvu(banwVar, this.d));
        } else if (i <= 0) {
            this.b.aa(new ayvw(banwVar, i, this.d));
        } else {
            this.b.aa(new ayvv(banwVar, i, this.d));
        }
    }
}
