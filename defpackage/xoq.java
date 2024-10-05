package defpackage;

import com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xoq implements afwx {
    final /* synthetic */ xpa a;
    final /* synthetic */ UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction b;
    final /* synthetic */ audq c;
    final /* synthetic */ xos d;

    public xoq(xos xosVar, xpa xpaVar, UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction, audq audqVar) {
        this.d = xosVar;
        this.a = xpaVar;
        this.b = updateBackstagePollActionOuterClass$UpdateBackstagePollAction;
        this.c = audqVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        apyv apyvVar;
        this.d.d.e(cnqVar);
        apzx a = this.a.a();
        xos xosVar = this.d;
        apyx apyxVar = a.c;
        if (apyxVar == null) {
            apyxVar = apyx.a;
        }
        if (apyxVar.b == 62285947) {
            apyvVar = (apyv) apyxVar.c;
        } else {
            apyvVar = apyv.a;
        }
        xosVar.b(apyvVar.i, this.c, this.b);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        apyv apyvVar;
        apyv apyvVar2;
        audq audqVar;
        apyv apyvVar3;
        apzx a = this.a.a();
        for (arlj arljVar : ((arlt) obj).c) {
            arlk arlkVar = arljVar.g;
            if (arlkVar == null) {
                arlkVar = arlk.a;
            }
            if (arlkVar.b == 99391126) {
                yal yalVar = this.d.c;
                apyx apyxVar = a.c;
                if (apyxVar == null) {
                    apyxVar = apyx.a;
                }
                if (apyxVar.b == 62285947) {
                    apyvVar2 = (apyv) apyxVar.c;
                } else {
                    apyvVar2 = apyv.a;
                }
                String str = apyvVar2.i;
                arlk arlkVar2 = arljVar.g;
                if (arlkVar2 == null) {
                    arlkVar2 = arlk.a;
                }
                if (arlkVar2.b == 99391126) {
                    audqVar = (audq) arlkVar2.c;
                } else {
                    audqVar = audq.a;
                }
                yalVar.j(str, audqVar);
                yal yalVar2 = this.d.c;
                apyx apyxVar2 = a.c;
                if (apyxVar2 == null) {
                    apyxVar2 = apyx.a;
                }
                if (apyxVar2.b == 62285947) {
                    apyvVar3 = (apyv) apyxVar2.c;
                } else {
                    apyvVar3 = apyv.a;
                }
                String str2 = apyvVar3.i;
                long j = arljVar.j;
                apyk b = apyk.b(arljVar.i);
                if (b == null) {
                    b = apyk.COMMENT_POLL_STATUS_UNKNOWN;
                }
                yalVar2.k(str2, j, b);
            }
        }
        apyk b2 = apyk.b(this.b.c);
        if (b2 == null) {
            b2 = apyk.COMMENT_POLL_STATUS_UNKNOWN;
        }
        if (b2 == apyk.COMMENT_POLL_STATUS_VOTE_AND_COMMENT) {
            apzp apzpVar = a.f;
            if (apzpVar == null) {
                apzpVar = apzp.a;
            }
            yaq yaqVar = this.d.f;
            apyv apyvVar4 = null;
            if (apzpVar != null && (apzpVar.b & 1) != 0) {
                apzn apznVar = apzpVar.c;
                if (apznVar == null) {
                    apznVar = apzn.a;
                }
                Iterator it = yaqVar.b(apznVar).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    apyx apyxVar3 = (apyx) it.next();
                    if (apyxVar3.b == 62285947) {
                        apyvVar = (apyv) apyxVar3.c;
                    } else {
                        apyvVar = apyv.a;
                    }
                    if (apyvVar.o) {
                        if (apyxVar3.b == 62285947) {
                            apyvVar4 = (apyv) apyxVar3.c;
                        } else {
                            apyvVar4 = apyv.a;
                        }
                    }
                }
            }
            if (apyvVar4 != null) {
                this.a.c(apyvVar4);
            }
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
