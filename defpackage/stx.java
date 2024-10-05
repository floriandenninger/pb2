package defpackage;

import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class stx implements swv {
    private final axpg a;
    private final ayqi b;
    private final /* synthetic */ int c;

    public stx(axpg axpgVar, ayqi ayqiVar, int i) {
        this.c = i;
        this.a = axpgVar;
        this.b = ayqiVar;
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.swv
    public final aomu a() {
        return this.c != 0 ? awon.b : awpm.b;
    }

    @Override // defpackage.swv
    public final /* synthetic */ ayph b(Object obj, final swu swuVar) {
        ayph f;
        if (this.c == 0) {
            final awpm awpmVar = (awpm) obj;
            final sww swwVar = (sww) this.a.get();
            if ((awpmVar.c & 1) != 0) {
                awnw awnwVar = awpmVar.d;
                if (awnwVar == null) {
                    awnwVar = awnw.a;
                }
                swwVar.b(awnwVar, swuVar).Q();
            }
            if ((awpmVar.c & 2) != 0) {
                awnw awnwVar2 = awpmVar.e;
                if (awnwVar2 == null) {
                    awnwVar2 = awnw.a;
                }
                azit azitVar = new azit(swwVar.d(awnwVar2, swuVar, 1).E(this.b).N());
                ayrv ayrvVar = aynu.l;
                return azitVar.g(new ayrv() { // from class: stw
                    @Override // defpackage.ayrv
                    public final Object a(Object obj2) {
                        awpm awpmVar2 = awpm.this;
                        sww swwVar2 = swwVar;
                        swu swuVar2 = swuVar;
                        if (((aypx) obj2).b == null) {
                            if ((awpmVar2.c & 4) != 0) {
                                awnw awnwVar3 = awpmVar2.f;
                                if (awnwVar3 == null) {
                                    awnwVar3 = awnw.a;
                                }
                                return swwVar2.d(awnwVar3, swuVar2, 1);
                            }
                            return ayph.f();
                        }
                        if ((awpmVar2.c & 8) != 0) {
                            awnw awnwVar4 = awpmVar2.g;
                            if (awnwVar4 == null) {
                                awnwVar4 = awnw.a;
                            }
                            return swwVar2.d(awnwVar4, swuVar2, 1);
                        }
                        return ayph.f();
                    }
                });
            }
            return ayph.f();
        }
        awon awonVar = (awon) obj;
        if ((awonVar.c & 2) == 0) {
            f = ayph.f();
        } else {
            sww swwVar2 = (sww) this.a.get();
            awnw awnwVar3 = awonVar.e;
            if (awnwVar3 == null) {
                awnwVar3 = awnw.a;
            }
            f = swwVar2.d(awnwVar3, swuVar, 1);
        }
        float f2 = awonVar.d;
        if (f2 <= 0.0f) {
            return f;
        }
        double d = f2;
        Double.isNaN(d);
        ayph c = ayph.G((long) (d * 1000000.0d), TimeUnit.MICROSECONDS, this.b).c(f);
        return Looper.myLooper() == Looper.getMainLooper() ? c.B(ayqr.a()) : c;
    }
}
