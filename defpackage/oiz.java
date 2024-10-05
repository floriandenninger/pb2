package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oiz extends ajtz implements ajvp {
    private final zaw a;
    private final ajpd b;
    private ajvo c;

    public oiz(aasm aasmVar, ypa ypaVar, Object obj, zaw zawVar, acra acraVar, ajpd ajpdVar) {
        super(aasmVar, ypaVar, obj, zawVar, acraVar);
        this.a = zawVar;
        ajpdVar.getClass();
        this.b = ajpdVar;
    }

    private final void l(ajtx ajtxVar) {
        ajvo b;
        if (!ai(ajcd.NEXT)) {
            k((ajvo) null);
            return;
        }
        ajvo ajvoVar = this.c;
        if (ajvoVar == null) {
            ajvn a = ajvo.a();
            a.a = ajtxVar;
            a.b = this.v;
            a.d = this;
            b = a.a();
        } else {
            b = ajvoVar.b(ajtxVar);
        }
        k(b);
    }

    public final void c(List list) {
        super.lu(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final /* bridge */ /* synthetic */ void lB(Object obj, ajcd ajcdVar) {
        aubs aubsVar = (aubs) obj;
        super.lB(aubsVar, ajcdVar);
        ajvo ajvoVar = this.c;
        if (ajvoVar != null) {
            this.b.remove(ajvoVar);
            this.c = null;
        }
        B();
        if (aubsVar == null) {
            return;
        }
        ajpd ajpdVar = this.b;
        ArrayList arrayList = new ArrayList();
        for (aubr aubrVar : aubsVar.i) {
            if ((aubrVar.b & 1) != 0) {
                aubw aubwVar = aubrVar.c;
                if (aubwVar == null) {
                    aubwVar = aubw.a;
                }
                arrayList.add(aubwVar);
            }
        }
        ajpdVar.addAll(arrayList);
        lu(adyu.di(aubsVar));
    }

    @Override // defpackage.ajtz
    public final void lF(ajcd ajcdVar) {
        if (ajcdVar == null || !ai(ajcdVar)) {
            return;
        }
        l(ajtw.a());
        super.lF(ajcdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final void lm(cnq cnqVar, ajce ajceVar) {
        super.lm(cnqVar, ajceVar);
        l(new ajtv(this.a.a(cnqVar), true, new Intent(), ajceVar));
    }

    @Override // defpackage.ajvp
    public final void ln() {
        lF(ajcd.NEXT);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final /* bridge */ /* synthetic */ Object nn(aulp aulpVar) {
        if (aulpVar == null || !aulpVar.pY(aubs.b)) {
            return null;
        }
        return (aubs) aulpVar.pX(aubs.b);
    }

    private final void k(ajvo ajvoVar) {
        ajvo ajvoVar2 = this.c;
        if (ajvoVar2 == ajvoVar) {
            return;
        }
        if (ajvoVar2 == null || ajvoVar == null) {
            this.b.remove(ajvoVar2);
            if (ajvoVar != null) {
                this.b.add(ajvoVar);
            }
        } else {
            this.b.o(ajvoVar2, ajvoVar);
        }
        this.c = ajvoVar;
    }
}
