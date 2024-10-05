package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ivm {
    public final zaw a;
    public final mwt b;
    public final acqz c;
    public final Set d;
    public final gnx e;
    public final yjj f;
    private final Context g;
    private final nko h;
    private final HatsController i;
    private final MealbarPromoController j;
    private final akcp k;
    private final aahd l;
    private final fgo m;
    private final ajzf n;

    public ivm(Context context, zaw zawVar, nko nkoVar, mwt mwtVar, HatsController hatsController, MealbarPromoController mealbarPromoController, acqz acqzVar, akcp akcpVar, aahd aahdVar, gnx gnxVar, fgo fgoVar, Set set, nnb nnbVar, yjj yjjVar, ajzf ajzfVar, byte[] bArr, byte[] bArr2) {
        this.g = context;
        this.a = zawVar;
        this.h = nkoVar;
        this.b = mwtVar;
        this.i = hatsController;
        this.j = mealbarPromoController;
        this.c = acqzVar;
        this.k = akcpVar;
        this.l = aahdVar;
        this.m = fgoVar;
        this.d = set;
        this.e = gnxVar;
        this.f = yjjVar;
        this.n = ajzfVar;
        gnxVar.b = nnbVar;
        gnxVar.c = fgoVar;
    }

    public static Optional a(arjv arjvVar) {
        avhy avhyVar;
        arjs arjsVar = arjvVar.h;
        if (arjsVar == null) {
            arjsVar = arjs.a;
        }
        if (arjsVar.b != 152873793) {
            return Optional.empty();
        }
        arjs arjsVar2 = arjvVar.h;
        if (arjsVar2 == null) {
            arjsVar2 = arjs.a;
        }
        if (arjsVar2.b == 152873793) {
            avhyVar = (avhy) arjsVar2.c;
        } else {
            avhyVar = avhy.a;
        }
        return Optional.of(avhyVar);
    }

    public final void b(arjv arjvVar) {
        avco avcoVar;
        avii aviiVar;
        aqzh aqzhVar;
        apxi apxiVar;
        aqdt aqdtVar;
        atcf atcfVar;
        apxh apxhVar;
        avco avcoVar2;
        asjh asjhVar;
        Optional a = a(arjvVar);
        if (a.isPresent()) {
            String bB = evr.bB(a.get());
            this.d.add(bB);
            this.k.f((avhy) a.get(), new ammy() { // from class: ivl
                @Override // defpackage.ammy
                public final boolean a(Object obj) {
                    return ivm.this.d.contains(evr.bB((avhy) obj));
                }
            }, (bB.equals("music_app_button") || bB.equals("youtube_originals_button")) ? false : true);
        }
        if (this.m.k()) {
            return;
        }
        arjs arjsVar = arjvVar.h;
        if (arjsVar == null) {
            arjsVar = arjs.a;
        }
        if (arjsVar.b != 86135402) {
            arjx arjxVar = arjvVar.g;
            if (arjxVar == null) {
                arjxVar = arjx.a;
            }
            if (arjxVar.b == 84469052) {
                avcoVar = (avco) arjxVar.c;
            } else {
                avcoVar = avco.a;
            }
            if ((avcoVar.b & 16) == 0) {
                arjx arjxVar2 = arjvVar.g;
                if (arjxVar2 == null) {
                    arjxVar2 = arjx.a;
                }
                if (arjxVar2.b == 364669234) {
                    arjx arjxVar3 = arjvVar.g;
                    if (arjxVar3 == null) {
                        arjxVar3 = arjx.a;
                    }
                    if (arjxVar3.b == 364669234) {
                        apxhVar = (apxh) arjxVar3.c;
                    } else {
                        apxhVar = apxh.a;
                    }
                    if ((apxhVar.b & 1) != 0) {
                        aahd aahdVar = this.l;
                        apxf apxfVar = apxhVar.c;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aahdVar.a(apxfVar);
                        return;
                    }
                }
                arjs arjsVar2 = arjvVar.h;
                if (arjsVar2 == null) {
                    arjsVar2 = arjs.a;
                }
                if (arjsVar2.b != 96907215) {
                    arjw arjwVar = arjvVar.f;
                    if (arjwVar == null) {
                        arjwVar = arjw.a;
                    }
                    if (arjwVar.b == 118637602) {
                        arjw arjwVar2 = arjvVar.f;
                        if (arjwVar2 == null) {
                            arjwVar2 = arjw.a;
                        }
                        if (arjwVar2.b == 118637602) {
                            aviiVar = (avii) arjwVar2.c;
                        } else {
                            aviiVar = avii.a;
                        }
                    } else {
                        arjs arjsVar3 = arjvVar.h;
                        if (arjsVar3 == null) {
                            arjsVar3 = arjs.a;
                        }
                        if (arjsVar3.b == 118637602) {
                            arjs arjsVar4 = arjvVar.h;
                            if (arjsVar4 == null) {
                                arjsVar4 = arjs.a;
                            }
                            if (arjsVar4.b == 118637602) {
                                aviiVar = (avii) arjsVar4.c;
                            } else {
                                aviiVar = avii.a;
                            }
                        } else {
                            aviiVar = null;
                        }
                    }
                    mwt mwtVar = this.b;
                    acra mM = this.c.mM();
                    fhg g = mwtVar.a.g();
                    if (g.i() || g.m()) {
                        if (mwtVar.j()) {
                            mwtVar.a();
                        }
                    } else if (!mwt.k(aviiVar)) {
                        if (mwtVar.j()) {
                            return;
                        }
                        if (mwtVar.g == null) {
                            mwtVar.b();
                        }
                        mwtVar.g(aviiVar, mM);
                        mwtVar.e = false;
                        return;
                    }
                    arjs arjsVar5 = arjvVar.h;
                    if (arjsVar5 == null) {
                        arjsVar5 = arjs.a;
                    }
                    if (arjsVar5.b != 64099105) {
                        arjs arjsVar6 = arjvVar.h;
                        if (arjsVar6 == null) {
                            arjsVar6 = arjs.a;
                        }
                        if (arjsVar6.b == 182224395) {
                            arjs arjsVar7 = arjvVar.h;
                            if (arjsVar7 == null) {
                                arjsVar7 = arjs.a;
                            }
                            if (arjsVar7.b == 182224395) {
                                apxiVar = (apxi) arjsVar7.c;
                            } else {
                                apxiVar = apxi.a;
                            }
                            if (this.n.c(apxiVar.g)) {
                                int i = apxiVar.b;
                                if ((i & 1) != 0) {
                                    aahd aahdVar2 = this.l;
                                    apxf apxfVar2 = apxiVar.c;
                                    if (apxfVar2 == null) {
                                        apxfVar2 = apxf.a;
                                    }
                                    aahdVar2.a(apxfVar2);
                                } else if ((i & 2) != 0) {
                                    aahd aahdVar3 = this.l;
                                    apxf apxfVar3 = apxiVar.d;
                                    if (apxfVar3 == null) {
                                        apxfVar3 = apxf.a;
                                    }
                                    aahdVar3.a(apxfVar3);
                                    this.c.mM().u(new acqx(apxiVar.f), null);
                                }
                                this.n.a(apxiVar.g);
                                return;
                            }
                        }
                        arjs arjsVar8 = arjvVar.h;
                        if (arjsVar8 == null) {
                            arjsVar8 = arjs.a;
                        }
                        if (arjsVar8.b == 162801955) {
                            aqzhVar = (aqzh) arjsVar8.c;
                        } else {
                            aqzhVar = aqzh.a;
                        }
                        c(aqzhVar);
                        return;
                    }
                    Context context = this.g;
                    arjs arjsVar9 = arjvVar.h;
                    if (arjsVar9 == null) {
                        arjsVar9 = arjs.a;
                    }
                    if (arjsVar9.b == 64099105) {
                        aqdtVar = (aqdt) arjsVar9.c;
                    } else {
                        aqdtVar = aqdt.a;
                    }
                    ajdf.n(context, aqdtVar, this.l, this.c.mM(), null);
                    return;
                }
                MealbarPromoController mealbarPromoController = this.j;
                arjs arjsVar10 = arjvVar.h;
                if (arjsVar10 == null) {
                    arjsVar10 = arjs.a;
                }
                if (arjsVar10.b == 96907215) {
                    atcfVar = (atcf) arjsVar10.c;
                } else {
                    atcfVar = atcf.a;
                }
                mealbarPromoController.h(atcfVar, this.c.mM());
                return;
            }
            HatsController hatsController = this.i;
            arjx arjxVar4 = arjvVar.g;
            if (arjxVar4 == null) {
                arjxVar4 = arjx.a;
            }
            if (arjxVar4.b == 84469052) {
                avcoVar2 = (avco) arjxVar4.c;
            } else {
                avcoVar2 = avco.a;
            }
            avcn avcnVar = avcoVar2.c;
            if (avcnVar == null) {
                avcnVar = avcn.a;
            }
            hatsController.j(avcnVar);
            return;
        }
        nko nkoVar = this.h;
        arjs arjsVar11 = arjvVar.h;
        if (arjsVar11 == null) {
            arjsVar11 = arjs.a;
        }
        if (arjsVar11.b == 86135402) {
            asjhVar = (asjh) arjsVar11.c;
        } else {
            asjhVar = asjh.a;
        }
        nkoVar.e();
        nkoVar.c.a(asjhVar);
        nkoVar.a.b(nkoVar.c);
    }

    public final boolean c(aqzh aqzhVar) {
        if (aqzhVar == null || (aqzhVar.b & 1) == 0) {
            return false;
        }
        this.e.e(aqzhVar);
        return true;
    }
}
