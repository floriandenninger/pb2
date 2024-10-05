package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xnj implements aawb {
    public final aahd a;
    public xoz b;
    public bv c;
    public String d;
    private final WeakReference e;
    private final akbz f;

    public xnj(xnk xnkVar, aahd aahdVar, akbz akbzVar) {
        this.e = new WeakReference(xnkVar);
        this.a = aahdVar;
        this.f = akbzVar;
    }

    @Override // defpackage.aawb
    public final /* synthetic */ aawe a() {
        return null;
    }

    @Override // defpackage.aawb
    public final Long b() {
        return null;
    }

    @Override // defpackage.aawb
    public final String c() {
        return this.d;
    }

    @Override // defpackage.aawb
    public final void d() {
        this.c.kv();
    }

    @Override // defpackage.aawb
    public final void e(cnq cnqVar) {
        xnk xnkVar = (xnk) this.e.get();
        if (xnkVar == null) {
            return;
        }
        whu.K(xnkVar.a, R.string.error_post_failed, 1);
    }

    @Override // defpackage.aawb
    public final void f(armb armbVar) {
        apzx apzxVar;
        apyv apyvVar;
        apzx apzxVar2;
        apzx apzxVar3;
        xnk xnkVar = (xnk) this.e.get();
        aqyg aqygVar = null;
        if (xnkVar != null) {
            xnkVar.d = null;
        }
        armc armcVar = armbVar.d;
        if (armcVar == null) {
            armcVar = armc.a;
        }
        if (armcVar.b == 62285833) {
            apzxVar = (apzx) armcVar.c;
        } else {
            apzxVar = apzx.a;
        }
        if ((apzxVar.b & 1) != 0) {
            armc armcVar2 = armbVar.d;
            if (armcVar2 == null) {
                armcVar2 = armc.a;
            }
            if (armcVar2.b == 62285833) {
                apzxVar3 = (apzx) armcVar2.c;
            } else {
                apzxVar3 = apzx.a;
            }
            apyx apyxVar = apzxVar3.c;
            if (apyxVar == null) {
                apyxVar = apyx.a;
            }
            if (apyxVar.b == 62285947) {
                apyvVar = (apyv) apyxVar.c;
            } else {
                apyvVar = apyv.a;
            }
        } else {
            apyvVar = null;
        }
        bv bvVar = this.c;
        if (bvVar != null) {
            bvVar.kv();
            this.c = null;
        }
        xoz xozVar = this.b;
        if (xozVar != null && apyvVar != null) {
            armc armcVar3 = armbVar.d;
            if (armcVar3 == null) {
                armcVar3 = armc.a;
            }
            if (armcVar3.b == 62285833) {
                apzxVar2 = (apzx) armcVar3.c;
            } else {
                apzxVar2 = apzx.a;
            }
            xozVar.a(apzxVar2, false);
        }
        if ((armbVar.b & 4) != 0) {
            arlj arljVar = armbVar.f;
            if (arljVar == null) {
                arljVar = arlj.a;
            }
            int dE = amkq.dE(arljVar.c);
            if (dE != 0 && dE == 2) {
                arlj arljVar2 = armbVar.f;
                if (arljVar2 == null) {
                    arljVar2 = arlj.a;
                }
                aqyg aqygVar2 = arljVar2.e;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                Spanned b = ajcq.b(aqygVar2);
                if (TextUtils.isEmpty(b)) {
                    return;
                }
                final arlj arljVar3 = armbVar.f;
                if (arljVar3 == null) {
                    arljVar3 = arlj.a;
                }
                akca m = this.f.m();
                m.k(b);
                m.j(false);
                apmh apmhVar = arljVar3.h;
                if (apmhVar == null) {
                    apmhVar = apmh.a;
                }
                if ((apmhVar.b & 1) != 0) {
                    apmh apmhVar2 = arljVar3.h;
                    if (apmhVar2 == null) {
                        apmhVar2 = apmh.a;
                    }
                    apmg apmgVar = apmhVar2.c;
                    if (apmgVar == null) {
                        apmgVar = apmg.a;
                    }
                    if ((apmgVar.b & 256) != 0) {
                        apmh apmhVar3 = arljVar3.h;
                        if (apmhVar3 == null) {
                            apmhVar3 = apmh.a;
                        }
                        apmg apmgVar2 = apmhVar3.c;
                        if (apmgVar2 == null) {
                            apmgVar2 = apmg.a;
                        }
                        aqygVar = apmgVar2.i;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    }
                    m.m(ajcq.b(aqygVar), new View.OnClickListener() { // from class: xni
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            xnj xnjVar = xnj.this;
                            arlj arljVar4 = arljVar3;
                            aahd aahdVar = xnjVar.a;
                            apmh apmhVar4 = arljVar4.h;
                            if (apmhVar4 == null) {
                                apmhVar4 = apmh.a;
                            }
                            apmg apmgVar3 = apmhVar4.c;
                            if (apmgVar3 == null) {
                                apmgVar3 = apmg.a;
                            }
                            apxf apxfVar = apmgVar3.o;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            aahdVar.c(apxfVar, null);
                        }
                    });
                }
                this.f.o(m.b());
            }
        }
    }
}
