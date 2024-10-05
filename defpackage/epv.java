package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class epv {
    public final azrw a;
    public final azrw b;
    public final ci c;
    public final axpg d;
    public final axpg e;
    public final azrw f;
    public final azrw g;
    public final afsy h;
    public final aadw i;
    private final wju j;

    public epv(ci ciVar, azrw azrwVar, azrw azrwVar2, axpg axpgVar, aadw aadwVar, axpg axpgVar2, azrw azrwVar3, ayqi ayqiVar, wju wjuVar, azrw azrwVar4, afsy afsyVar) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = ciVar;
        this.i = aadwVar;
        this.d = axpgVar;
        this.e = axpgVar2;
        this.f = azrwVar3;
        this.j = wjuVar;
        this.g = azrwVar4;
        this.h = afsyVar;
        if (evr.aA(aadwVar)) {
            ((eqa) axpgVar2.get()).c.B().ab(ayqiVar).L(eng.g).ax(new ayrs() { // from class: epu
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    epv epvVar = epv.this;
                    eow eowVar = (eow) epvVar.d.get();
                    eok b = eowVar.b();
                    if (!eowVar.j() || b.k != 0) {
                        if (eowVar.j() || b.m != 0) {
                            return;
                        }
                        ynm.m(eowVar.c(new ens(2)), new egw(6));
                        gbw gbwVar = (gbw) epvVar.a.get();
                        akbx d = akby.d();
                        d.c = epvVar.c.getString(R.string.turn_on_bedtime_reminder_title);
                        d.d = epvVar.c.getString(R.string.update_bedtime_reminder_text);
                        akbx a = d.c(epvVar.c.getString(R.string.update_bedtime_reminder_no_thanks), null).a(epvVar.c.getString(R.string.turn_on_bedtime_reminder_update_reminder), new epr(epvVar, 2));
                        a.i(false);
                        gbwVar.j(a.e(R.drawable.bedtime_mode_mealbar).f());
                        return;
                    }
                    ynm.m(eowVar.c(new ens(3)), new egw(6));
                    gbw gbwVar2 = (gbw) epvVar.a.get();
                    akbx d2 = akby.d();
                    d2.c = epvVar.c.getString(R.string.update_bedtime_reminder_title);
                    d2.d = epvVar.c.getString(R.string.update_bedtime_reminder_text);
                    akbx a2 = d2.c(epvVar.c.getString(R.string.update_bedtime_reminder_no_thanks), null).a(epvVar.c.getString(R.string.update_bedtime_reminder_update_reminder), epvVar.a());
                    a2.i(false);
                    gbwVar2.j(a2.e(R.drawable.bedtime_mode_mealbar).f());
                }
            });
        }
        if (evr.az(aadwVar)) {
            return;
        }
        azrwVar.get();
        azrwVar2.get();
        axpgVar.get();
        axpgVar2.get();
        azrwVar3.get();
    }

    public final View.OnClickListener a() {
        if (this.j.a()) {
            return new epr(this, 1);
        }
        return new epr(this, 0);
    }
}
