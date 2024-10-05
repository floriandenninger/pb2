package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abvu {
    public final /* synthetic */ abwy a;
    public final /* synthetic */ int b;
    public final /* synthetic */ absi c;

    public /* synthetic */ abvu(abwy abwyVar, int i, absi absiVar) {
        this.a = abwyVar;
        this.b = i;
        this.c = absiVar;
    }

    public final void a() {
        final abwy abwyVar = this.a;
        final int i = this.b;
        final absi absiVar = this.c;
        if (abwyVar.d.d()) {
            abwyVar.j.i(new abwe(abwyVar, 0), new abso() { // from class: abvx
                @Override // defpackage.abso
                public final void a(int i2) {
                    abwy abwyVar2 = abwy.this;
                    absi absiVar2 = absiVar;
                    int i3 = i;
                    if (abwyVar2.d.d()) {
                        if (i2 == 0) {
                            abwyVar2.T = abwyVar2.h.d();
                            abwyVar2.U = absiVar2.a();
                            abwyVar2.s.postDelayed(abwyVar2.u, 3000L);
                        } else {
                            if (i2 == 2 || i2 == 7 || i2 == 8) {
                                StringBuilder sb = new StringBuilder(68);
                                sb.append("Capture pipeline not configured properly for SpeedTest - ");
                                sb.append(i2);
                                zga.b(sb.toString());
                                abwyVar2.l(i3);
                                return;
                            }
                            StringBuilder sb2 = new StringBuilder(37);
                            sb2.append("Error starting SpeedTest: ");
                            sb2.append(i2);
                            zga.b(sb2.toString());
                            abwyVar2.a();
                        }
                    }
                }
            });
        }
    }
}
