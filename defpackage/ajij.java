package defpackage;

import android.content.DialogInterface;
import android.os.Looper;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajij implements swv, slt {
    public final slv a;
    public final axpg b;
    private final acra c;
    private final akcy d;

    public ajij(slv slvVar, axpg axpgVar, acra acraVar, akcy akcyVar) {
        this.a = slvVar;
        this.c = acraVar;
        this.b = axpgVar;
        this.d = akcyVar;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return auty.b;
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.swv
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ayph b(final auty autyVar, final swu swuVar) {
        final awos awosVar;
        if (!this.d.j()) {
            if ((autyVar.c & 1) == 0) {
                aqrd aqrdVar = autyVar.e;
                if (aqrdVar == null) {
                    aqrdVar = aqrd.a;
                }
                if ((aqrdVar.b & 1) == 0) {
                    aqrd aqrdVar2 = autyVar.e;
                    if (aqrdVar2 == null) {
                        aqrdVar2 = aqrd.a;
                    }
                    if ((aqrdVar2.b & 8) != 0) {
                        aqrd aqrdVar3 = autyVar.e;
                        if (aqrdVar3 == null) {
                            aqrdVar3 = aqrd.a;
                        }
                        if ((aqrdVar3.b & 4) != 0) {
                            g(autyVar, true);
                            sww swwVar = (sww) this.b.get();
                            aqrd aqrdVar4 = autyVar.e;
                            if (aqrdVar4 == null) {
                                aqrdVar4 = aqrd.a;
                            }
                            awnw awnwVar = aqrdVar4.e;
                            if (awnwVar == null) {
                                awnwVar = awnw.a;
                            }
                            return swwVar.b(awnwVar, swuVar);
                        }
                    }
                    return ayph.f();
                }
            }
            final sls a = slu.a();
            if (autyVar.g) {
                a.l = 2;
            } else {
                a.l = 3;
            }
            a.g = swuVar;
            if (autyVar.f) {
                a.b(1);
            }
            if ((autyVar.c & 64) != 0) {
                a.h = new DialogInterface.OnKeyListener() { // from class: ajih
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                        ajij ajijVar = ajij.this;
                        auty autyVar2 = autyVar;
                        swu swuVar2 = swuVar;
                        if (i != 4 || keyEvent.getAction() != 1) {
                            return false;
                        }
                        sww swwVar2 = (sww) ajijVar.b.get();
                        awnw awnwVar2 = autyVar2.h;
                        if (awnwVar2 == null) {
                            awnwVar2 = awnw.a;
                        }
                        swwVar2.b(awnwVar2, swuVar2).Q();
                        return true;
                    }
                };
            }
            a.i = this;
            a.j = this.c;
            aqrd aqrdVar5 = autyVar.e;
            if (aqrdVar5 == null) {
                aqrdVar5 = aqrd.a;
            }
            if ((aqrdVar5.b & 1) != 0) {
                aqrd aqrdVar6 = autyVar.e;
                if (aqrdVar6 == null) {
                    aqrdVar6 = aqrd.a;
                }
                awosVar = aqrdVar6.c;
                if (awosVar == null) {
                    awosVar = awos.a;
                }
            } else {
                awosVar = autyVar.d;
                if (awosVar == null) {
                    awosVar = awos.a;
                }
            }
            ayph t = ayph.t(new ayrm() { // from class: ajii
                @Override // defpackage.ayrm
                public final void a() {
                    ajij ajijVar = ajij.this;
                    auty autyVar2 = autyVar;
                    awos awosVar2 = awosVar;
                    sls slsVar = a;
                    ajijVar.g(autyVar2, false);
                    ajijVar.a.b(awosVar2, slsVar.a());
                }
            });
            return Looper.myLooper() == Looper.getMainLooper() ? t : t.E(ayqr.a());
        }
        return ayph.f();
    }

    @Override // defpackage.slt
    public void e() {
    }

    @Override // defpackage.slt
    public void f() {
    }

    public final void g(auty autyVar, boolean z) {
        this.c.d(acsb.b(16906), null, null);
        aqrd aqrdVar = autyVar.e;
        if (aqrdVar == null) {
            aqrdVar = aqrd.a;
        }
        if ((aqrdVar.b & 4) != 0) {
            aqrd aqrdVar2 = autyVar.e;
            if (aqrdVar2 == null) {
                aqrdVar2 = aqrd.a;
            }
            aomf aomfVar = aqrdVar2.d;
            ((acqq) this.c).D(new acqx(aomfVar));
            if (z) {
                this.c.u(new acqx(aomfVar), null);
            }
        }
    }
}
