package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akxt implements afwx {
    final /* synthetic */ List a;
    final /* synthetic */ akxw b;

    public akxt(akxw akxwVar, List list) {
        this.b = akxwVar;
        this.a = list;
    }

    @Override // defpackage.cnk
    public final void kY(final cnq cnqVar) {
        zga.f("UploadFeedbackPoller", "onErrorResponse", cnqVar);
        ScheduledExecutorService scheduledExecutorService = this.b.d;
        final List list = this.a;
        scheduledExecutorService.execute(new Runnable() { // from class: akxs
            @Override // java.lang.Runnable
            public final void run() {
                akxt akxtVar = akxt.this;
                List<akxv> list2 = list;
                cnq cnqVar2 = cnqVar;
                akxw akxwVar = akxtVar.b;
                list2.getClass();
                for (akxv akxvVar : list2) {
                    akxv akxvVar2 = new akxv(akxvVar.a, akxvVar.b, akxvVar.c, 5000 + akxwVar.b.c(), akxvVar.e, akxvVar.f + 1);
                    if (akxvVar2.f > 3) {
                        Iterator it = akxwVar.f.iterator();
                        while (it.hasNext()) {
                            ((akxu) it.next()).f(akxvVar2.c, cnqVar2);
                            akxwVar.e(akxvVar2.b, akxvVar2.c);
                        }
                    } else {
                        akxwVar.e.add(akxvVar2);
                    }
                }
                akxwVar.g();
            }
        });
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        final asdu asduVar = (asdu) obj;
        this.b.d.execute(new Runnable() { // from class: akxr
            @Override // java.lang.Runnable
            public final void run() {
                akxt akxtVar = akxt.this;
                asdu asduVar2 = asduVar;
                akxw akxwVar = akxtVar.b;
                asduVar2.getClass();
                for (asea aseaVar : asduVar2.c) {
                    if (aseaVar.b == 64128279) {
                        akxwVar.d((avtu) aseaVar.c);
                    }
                }
                for (aulp aulpVar : asduVar2.d) {
                    if (aulpVar.pY(avtu.b)) {
                        akxwVar.d((avtu) aulpVar.pX(avtu.b));
                    }
                }
                akxwVar.g();
            }
        });
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
