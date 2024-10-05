package defpackage;

import android.view.View;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class smt implements swv {
    public final sml a;
    private final /* synthetic */ int b;

    public smt(sml smlVar, int i) {
        this.b = i;
        this.a = smlVar;
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.swv
    public final aomu a() {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? awrn.b : awrl.b;
        }
        return awrm.b;
    }

    @Override // defpackage.swv
    public final /* synthetic */ ayph b(Object obj, final swu swuVar) {
        int i = this.b;
        if (i == 0) {
            final awrm awrmVar = (awrm) obj;
            return ayph.t(new ayrm() { // from class: sms
                @Override // defpackage.ayrm
                public final void a() {
                    smt smtVar = smt.this;
                    awrm awrmVar2 = awrmVar;
                    final swu swuVar2 = swuVar;
                    final sml smlVar = smtVar.a;
                    String str = awrmVar2.c;
                    synchronized (smlVar.e) {
                        final smk smkVar = (smk) smlVar.a.get(str);
                        if (smkVar != null) {
                            ayqx ayqxVar = smkVar.b;
                            if (ayqxVar == null || ayqxVar.e()) {
                                long j = smkVar.a.e * 1000.0f;
                                smkVar.b = aypy.V(j, j, TimeUnit.MILLISECONDS, smlVar.c).ax(new ayrs() { // from class: smi
                                    @Override // defpackage.ayrs
                                    public final void a(Object obj2) {
                                        sml smlVar2 = sml.this;
                                        smk smkVar2 = smkVar;
                                        swu swuVar3 = swuVar2;
                                        sww swwVar = (sww) smlVar2.b.get();
                                        awnw awnwVar = smkVar2.a.f;
                                        if (awnwVar == null) {
                                            awnwVar = awnw.a;
                                        }
                                        swwVar.b(awnwVar, swuVar3).E(smlVar2.d).Q();
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        throw new syf("Cannot start a loop that has not been registered yet");
                    }
                }
            });
        }
        final byte[] bArr = null;
        if (i == 1) {
            final awrl awrlVar = (awrl) obj;
            return ayph.t(new ayrm(awrlVar, swuVar, bArr) { // from class: smm
                public final /* synthetic */ awrl a;
                public final /* synthetic */ swu b;

                @Override // defpackage.ayrm
                public final void a() {
                    smt smtVar = smt.this;
                    awrl awrlVar2 = this.a;
                    swu swuVar2 = this.b;
                    sml smlVar = smtVar.a;
                    if (awrlVar2 != null) {
                        int i2 = awrlVar2.c;
                        if ((i2 & 1) != 0 && (i2 & 4) != 0) {
                            if (awrlVar2.e < 0.1d) {
                                throw new syf("LoopCommand delay is too small");
                            }
                            View view = swuVar2.a;
                            if (view == null) {
                                throw new syf("No view is available, loop has not been registered");
                            }
                            synchronized (smlVar.e) {
                                smlVar.a.put(awrlVar2.d, new smk(awrlVar2));
                            }
                            view.addOnAttachStateChangeListener(new smj(smlVar, awrlVar2));
                            return;
                        }
                    }
                    throw new syf("Invalid LoopCommand");
                }
            });
        }
        final awrn awrnVar = (awrn) obj;
        return ayph.t(new ayrm(awrnVar, bArr) { // from class: smu
            public final /* synthetic */ awrn a;

            @Override // defpackage.ayrm
            public final void a() {
                smt.this.a.a(this.a.c);
            }
        });
    }
}
