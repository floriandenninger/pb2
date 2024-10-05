package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lwi implements akxu {
    final /* synthetic */ lwj a;

    public lwi(lwj lwjVar) {
        this.a = lwjVar;
    }

    @Override // defpackage.akxu
    public final void a(final String str, final String str2, final aufk aufkVar) {
        this.a.b.execute(new Runnable() { // from class: lwe
            @Override // java.lang.Runnable
            public final void run() {
                lwi lwiVar = lwi.this;
                String str3 = str;
                String str4 = str2;
                aufk aufkVar2 = aufkVar;
                goc b = lwiVar.a.b(str3, str4);
                if (b != null) {
                    b.n = aufkVar2.b;
                    aqyg aqygVar = aufkVar2.c;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    b.o = ajcq.b(aqygVar);
                    aqyg aqygVar2 = aufkVar2.d;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    b.p = ajcq.b(aqygVar2);
                    lwiVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.akxu
    public final void b(final String str, final String str2, final avgc avgcVar) {
        this.a.b.execute(new Runnable() { // from class: lwf
            @Override // java.lang.Runnable
            public final void run() {
                lwi lwiVar = lwi.this;
                String str3 = str;
                String str4 = str2;
                avgc avgcVar2 = avgcVar;
                goc b = lwiVar.a.b(str3, str4);
                if (b != null) {
                    avgg avggVar = avgcVar2.b;
                    if (avggVar == null) {
                        avggVar = avgg.a;
                    }
                    b.e = avggVar;
                    lwiVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.akxu
    public final void c(final String str, final String str2, final avsp avspVar) {
        this.a.b.execute(new Runnable() { // from class: lwg
            @Override // java.lang.Runnable
            public final void run() {
                apxf apxfVar;
                lwi lwiVar = lwi.this;
                String str3 = str;
                String str4 = str2;
                avsp avspVar2 = avspVar;
                goc b = lwiVar.a.b(str3, str4);
                if (b != null) {
                    if ((avspVar2.b & 2) != 0) {
                        apxfVar = avspVar2.d;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                    } else {
                        apxfVar = null;
                    }
                    b.t = apxfVar;
                    if ((avspVar2.b & 1) != 0) {
                        atdf atdfVar = avspVar2.c;
                        if (atdfVar == null) {
                            atdfVar = atdf.a;
                        }
                        if ((atdfVar.b & 1) != 0) {
                            atdf atdfVar2 = avspVar2.c;
                            if (atdfVar2 == null) {
                                atdfVar2 = atdf.a;
                            }
                            atdc atdcVar = atdfVar2.c;
                            if (atdcVar == null) {
                                atdcVar = atdc.a;
                            }
                            b.d = atdcVar;
                        }
                    } else {
                        b.d = null;
                    }
                    lwiVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.akxu
    public final void d(final String str, final String str2, final avuh avuhVar) {
        this.a.b.execute(new Runnable() { // from class: lwh
            @Override // java.lang.Runnable
            public final void run() {
                lwi lwiVar = lwi.this;
                String str3 = str;
                String str4 = str2;
                avuh avuhVar2 = avuhVar;
                goc b = lwiVar.a.b(str3, str4);
                if (b != null) {
                    b.d(avuhVar2);
                    lwiVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.akxu
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.akxu
    public final /* synthetic */ void f(String str, Exception exc) {
    }

    @Override // defpackage.akxu
    public final /* synthetic */ void g() {
    }
}
