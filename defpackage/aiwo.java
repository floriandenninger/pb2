package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiwo {
    final /* synthetic */ aiwq a;

    public aiwo(aiwq aiwqVar) {
        this.a = aiwqVar;
    }

    public final aign a() {
        return this.a.n;
    }

    public final ajbl b() {
        return this.a.s();
    }

    public final void c(boolean z) {
        aiwq aiwqVar = this.a;
        aixg aixgVar = aiwqVar.k;
        if (aixgVar != null) {
            ahbj.z(aixgVar.a, 0L);
            if (!ahbj.B(aiwqVar.s())) {
                aixgVar.a.i().g();
            }
            aiwq.ay(aigj.ENDED, aixgVar.a);
        }
        final int i = 1;
        if (aiwqVar.j != null || aifk.g(aiwqVar.e)) {
            aiwqVar.Q();
            if (z) {
                ajbf o = aiwqVar.i.a.o();
                ajbd ajbdVar = o.f;
                if (ajbdVar != null) {
                    final wqe wqeVar = ajbdVar.c;
                    wqeVar.getClass();
                    final int i2 = 0;
                    o.a(new Runnable() { // from class: ajav
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (i2 != 0) {
                                wqeVar.a.i();
                            } else {
                                ((wtq) wqeVar.a).a.k(new wxd("Internal media error"));
                            }
                        }
                    });
                }
            } else {
                ajbf o2 = aiwqVar.i.a.o();
                ajbd ajbdVar2 = o2.f;
                if (ajbdVar2 != null) {
                    final wqe wqeVar2 = ajbdVar2.c;
                    wqeVar2.getClass();
                    o2.a(new Runnable() { // from class: ajav
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (i != 0) {
                                wqeVar2.a.i();
                            } else {
                                ((wtq) wqeVar2.a).a.k(new wxd("Internal media error"));
                            }
                        }
                    });
                }
            }
            if (aifk.g(aiwqVar.e)) {
                aiwqVar.ap(aiwqVar.i);
                aiwqVar.ag(aiwqVar.p ? aign.ENDED : aign.READY);
                return;
            }
            return;
        }
        if (ahbj.B(aiwqVar.s()) || aiwq.r.a) {
            return;
        }
        aiwq.r.a = true;
        afsi.b(2, 10, "got onInterstitialVideoEnded without a savedContentVideoState. This should not happen");
    }

    public final void d(aign aignVar) {
        this.a.ag(aignVar);
    }

    public final void e(ajbl ajblVar, int i, long j, long j2, long j3, long j4) {
        this.a.ax(ajblVar, i, j, j2, j3, j4);
    }

    public final void f(int i) {
        this.a.q = i;
    }

    public final void g(ajbl ajblVar, int i) {
        this.a.av(ajblVar, i, 0);
    }

    public final void h(aigr aigrVar) {
        this.a.aw(aigrVar, 4);
    }
}
