package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akja implements afwx {
    final /* synthetic */ akjb a;
    final /* synthetic */ akjc b;
    final /* synthetic */ akjd c;

    public akja(akjd akjdVar, akjb akjbVar, akjc akjcVar) {
        this.c = akjdVar;
        this.a = akjbVar;
        this.b = akjcVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.c.a.e(cnqVar);
        akjc akjcVar = this.b;
        if (akjcVar != null) {
            akjcVar.c();
        }
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        aqdw aqdwVar;
        aqdy aqdyVar;
        aqdz aqdzVar;
        armp armpVar = (armp) obj;
        if ((armpVar.b & 2) != 0) {
            aqdx aqdxVar = armpVar.d;
            if (aqdxVar == null) {
                aqdxVar = aqdx.a;
            }
            aqdwVar = aqdxVar.d;
            if (aqdwVar == null) {
                aqdwVar = aqdw.a;
            }
        } else {
            aqdwVar = null;
        }
        if ((armpVar.b & 2) != 0) {
            aqdx aqdxVar2 = armpVar.d;
            if (aqdxVar2 == null) {
                aqdxVar2 = aqdx.a;
            }
            aqdyVar = aqdxVar2.c;
            if (aqdyVar == null) {
                aqdyVar = aqdy.a;
            }
        } else {
            aqdyVar = null;
        }
        aqdx aqdxVar3 = armpVar.d;
        if (aqdxVar3 == null) {
            aqdxVar3 = aqdx.a;
        }
        if ((aqdxVar3.b & 4) != 0) {
            aqdx aqdxVar4 = armpVar.d;
            if (aqdxVar4 == null) {
                aqdxVar4 = aqdx.a;
            }
            aqdzVar = aqdxVar4.e;
            if (aqdzVar == null) {
                aqdzVar = aqdz.a;
            }
        } else {
            aqdzVar = null;
        }
        akkv akkvVar = new akkv(null, aqdwVar, aqdyVar, aqdzVar);
        String b = akkvVar.b();
        if (!TextUtils.isEmpty(b)) {
            this.c.c.c(akmq.a(b), akkvVar);
        }
        if (armpVar.e.size() != 0) {
            this.c.b.e(armpVar.e, this.a);
        }
        akjc akjcVar = this.b;
        if (akjcVar != null) {
            akjcVar.d();
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
