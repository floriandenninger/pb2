package defpackage;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abzf implements afwx {
    public final abxu a;
    private final Handler b;
    private final acra c;

    public abzf(Handler handler, acra acraVar, abxu abxuVar) {
        this.b = handler;
        this.c = acraVar;
        this.a = abxuVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.b.post(new abzd(this.a));
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        final arqr arqrVar = (arqr) obj;
        if (arqrVar != null) {
            this.c.D(new acqx(arqrVar.d));
        }
        if (arqrVar != null) {
            arqp arqpVar = arqrVar.c;
            if (arqpVar == null) {
                arqpVar = arqp.a;
            }
            if (arqpVar.b == 146983145) {
                this.b.post(new Runnable() { // from class: abze
                    @Override // java.lang.Runnable
                    public final void run() {
                        atfe atfeVar;
                        abzf abzfVar = abzf.this;
                        arqr arqrVar2 = arqrVar;
                        abxu abxuVar = abzfVar.a;
                        arqp arqpVar2 = arqrVar2.c;
                        if (arqpVar2 == null) {
                            arqpVar2 = arqp.a;
                        }
                        if (arqpVar2.b == 146983145) {
                            atfeVar = (atfe) arqpVar2.c;
                        } else {
                            atfeVar = atfe.a;
                        }
                        abxuVar.d(atfeVar);
                    }
                });
                return;
            }
        }
        this.b.post(new abzd(this.a));
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
