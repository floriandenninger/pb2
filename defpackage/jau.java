package defpackage;

import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jau {
    public final akcp a;
    public final Set b = new HashSet();
    public avcn c;
    private final HatsController d;
    private final MealbarPromoController e;
    private final fjk f;
    private final acra g;
    private atcf h;

    public jau(HatsController hatsController, MealbarPromoController mealbarPromoController, acra acraVar, akcp akcpVar, fjk fjkVar) {
        this.d = hatsController;
        this.e = mealbarPromoController;
        this.g = acraVar;
        this.a = akcpVar;
        this.f = fjkVar;
    }

    public final void a(asfc asfcVar) {
        FormatStreamModel formatStreamModel;
        atcf atcfVar;
        avco avcoVar;
        avcn avcnVar;
        avhy avhyVar;
        asfa asfaVar = asfcVar.j;
        if (asfaVar == null) {
            asfaVar = asfa.a;
        }
        if (asfaVar.b == 152873793) {
            asfa asfaVar2 = asfcVar.j;
            if (asfaVar2 == null) {
                asfaVar2 = asfa.a;
            }
            if (asfaVar2.b == 152873793) {
                avhyVar = (avhy) asfaVar2.c;
            } else {
                avhyVar = avhy.a;
            }
            String bB = evr.bB(avhyVar);
            if (bB != null) {
                this.b.add(bB);
                this.a.e(avhyVar, new ammy() { // from class: jat
                    @Override // defpackage.ammy
                    public final boolean a(Object obj) {
                        return jau.this.b.contains(evr.bB((avhy) obj));
                    }
                });
            }
        }
        asfe asfeVar = asfcVar.m;
        if (asfeVar == null) {
            asfeVar = asfe.a;
        }
        if (asfeVar.b == 84469052) {
            asfe asfeVar2 = asfcVar.m;
            if (asfeVar2 == null) {
                asfeVar2 = asfe.a;
            }
            if (asfeVar2.b == 84469052) {
                avcoVar = (avco) asfeVar2.c;
            } else {
                avcoVar = avco.a;
            }
            if ((avcoVar.b & 16) != 0) {
                avcnVar = avcoVar.c;
                if (avcnVar == null) {
                    avcnVar = avcn.a;
                }
            } else {
                avcnVar = null;
            }
            this.c = avcnVar;
            if (avcnVar != null) {
                this.d.j(avcnVar);
                return;
            }
        }
        asfa asfaVar3 = asfcVar.j;
        if (asfaVar3 == null) {
            asfaVar3 = asfa.a;
        }
        if (asfaVar3.b == 96907215) {
            asfa asfaVar4 = asfcVar.j;
            if (asfaVar4 == null) {
                asfaVar4 = asfa.a;
            }
            if (asfaVar4.b == 96907215) {
                atcfVar = (atcf) asfaVar4.c;
            } else {
                atcfVar = atcf.a;
            }
            this.h = atcfVar;
            this.e.h(atcfVar, this.g);
            return;
        }
        fjk fjkVar = this.f;
        if (fjkVar.b.o() && (formatStreamModel = fjkVar.i.a) != null && formatStreamModel.J()) {
            asvu asvuVar = fjkVar.h.b().e;
            if (asvuVar == null) {
                asvuVar = asvu.a;
            }
            boolean c = gov.c(fjkVar.d, ((fkg) fjkVar.e.a.c()).i, TimeUnit.SECONDS.toMillis(asvuVar.T), fjkVar.f.c());
            asvu asvuVar2 = fjkVar.h.b().e;
            if (asvuVar2 == null) {
                asvuVar2 = asvu.a;
            }
            int i = asvuVar2.U;
            long j = ((fkg) fjkVar.e.a.c()).h;
            long j2 = i;
            if (!c || j >= j2) {
                return;
            }
            if (fjkVar.g == null) {
                akca m = fjkVar.c.m();
                m.k(fjkVar.a.getResources().getString(R.string.offline_stream_snackbar_text));
                m.l(new fjj(fjkVar));
                m.j(true);
                fjkVar.g = m.b();
            }
            fjkVar.c.o(fjkVar.g);
        }
    }

    public final void b() {
        this.e.g(this.h);
        this.d.h(this.c);
        fjk fjkVar = this.f;
        akcb akcbVar = fjkVar.g;
        if (akcbVar != null) {
            fjkVar.c.n(akcbVar);
        }
    }
}
