package defpackage;

import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gcj implements aioa, ypd {
    final /* synthetic */ MealbarPromoController a;

    public gcj(MealbarPromoController mealbarPromoController) {
        this.a = mealbarPromoController;
    }

    public final void a(ahef ahefVar) {
        boolean d;
        boolean e;
        gck gckVar = this.a.i;
        PlayerResponseModel b = ahefVar.b();
        int i = 0;
        if (b != null) {
            aryn[] I = b.I();
            int i2 = 0;
            while (true) {
                if (i2 >= I.length) {
                    e = gckVar.e(null);
                    break;
                }
                aryn arynVar = I[i2];
                if ((arynVar.b & 1) != 0) {
                    atcf atcfVar = arynVar.c;
                    if (atcfVar == null) {
                        atcfVar = atcf.a;
                    }
                    e = gckVar.e(atcfVar);
                } else {
                    i2++;
                }
            }
            if (e) {
                MealbarPromoController mealbarPromoController = this.a;
                mealbarPromoController.h(mealbarPromoController.i.a, mealbarPromoController.b);
                return;
            }
        }
        gck gckVar2 = this.a.i;
        PlayerResponseModel b2 = ahefVar.b();
        if (b2 == null) {
            return;
        }
        aryn[] I2 = b2.I();
        int length = I2.length;
        while (true) {
            if (i >= length) {
                d = gckVar2.d(null);
                break;
            }
            aryn arynVar2 = I2[i];
            if ((arynVar2.b & 8) != 0) {
                apxi apxiVar = arynVar2.f;
                if (apxiVar == null) {
                    apxiVar = apxi.a;
                }
                d = gckVar2.d(apxiVar);
            } else {
                i++;
            }
        }
        if (d) {
            MealbarPromoController mealbarPromoController2 = this.a;
            apxi apxiVar2 = mealbarPromoController2.i.b;
            if (apxiVar2 == null) {
                mealbarPromoController2.g.b();
                return;
            }
            if ((apxiVar2.b & 8) != 0) {
                mealbarPromoController2.a.a(null);
                mealbarPromoController2.g.b();
                awdy awdyVar = apxiVar2.e;
                if (awdyVar == null) {
                    awdyVar = awdy.a;
                }
                int N = awxr.N(awdyVar.b);
                if (N == 0 || N != 4) {
                    awdy awdyVar2 = apxiVar2.e;
                    if (awdyVar2 == null) {
                        awdyVar2 = awdy.a;
                    }
                    int N2 = awxr.N(awdyVar2.b);
                    if (N2 == 0 || N2 != 3) {
                        return;
                    }
                    mealbarPromoController2.a.a(apxiVar2);
                    return;
                }
                mealbarPromoController2.g.a(apxiVar2);
            }
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().b.Y(new ayrs() { // from class: gci
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gcj.this.a((ahef) obj);
            }
        }, eoo.s)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class};
        }
        if (i == 0) {
            a((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
