package defpackage;

import com.google.protos.youtube.api.innertube.ChannelHandleValidationResultRendererOuterClass;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eqr implements Runnable {
    final /* synthetic */ eqt a;

    public eqr(eqt eqtVar) {
        this.a = eqtVar;
    }

    public final boolean a() {
        return this == this.a.m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d.post(new Runnable() { // from class: eqq
            @Override // java.lang.Runnable
            public final void run() {
                eqr.this.a.f(new eqs(3, null));
            }
        });
        String obj = this.a.h.getText().toString();
        eqt eqtVar = this.a;
        aavf aavfVar = eqtVar.c;
        aprv aprvVar = eqtVar.j;
        String str = aprvVar.e;
        String str2 = aprvVar.f;
        aavc aavcVar = new aavc(aavfVar.f, aavfVar.a, null, null, null);
        aavcVar.a = obj;
        aavcVar.b = str;
        aavcVar.c = str2;
        eqt eqtVar2 = this.a;
        aavf aavfVar2 = eqtVar2.c;
        Executor executor = eqtVar2.f;
        if (aavfVar2.c == null) {
            aavfVar2.c = new aave(aavfVar2.b, aavfVar2.e);
        }
        eqtVar2.n = aavfVar2.c.b(aavcVar, executor);
        ynl ynlVar = new ynl() { // from class: eqp
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj2) {
                eqs b;
                eqr eqrVar = eqr.this;
                asef asefVar = (asef) obj2;
                if (eqrVar.a()) {
                    eqt eqtVar3 = eqrVar.a;
                    aulq aulqVar = asefVar.c;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    apqf apqfVar = (apqf) aulqVar.pX(ChannelHandleValidationResultRendererOuterClass.channelHandleValidationResultRenderer);
                    int aD = anaf.aD(apqfVar.b);
                    if (aD == 0) {
                        aD = 1;
                    }
                    int i = aD - 1;
                    if (i == 1) {
                        b = eqs.b();
                    } else if (i == 2 || i == 3 || i == 4) {
                        aqyg aqygVar = apqfVar.c;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                        b = eqs.a(aqygVar);
                    } else {
                        b = eqs.c();
                    }
                    eqtVar3.f(b);
                }
            }
        };
        ynk ynkVar = new ynk() { // from class: eqo
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                eqr eqrVar = eqr.this;
                if (eqrVar.a()) {
                    eqrVar.a.f(eqs.c());
                }
            }
        };
        eqt eqtVar3 = this.a;
        ynm.l(eqtVar3.n, eqtVar3.e, ynkVar, ynlVar, anij.a);
    }
}
