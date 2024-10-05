package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wbi implements afwx {
    final /* synthetic */ aawb a;
    final /* synthetic */ wbk b;
    final /* synthetic */ aone c;

    public wbi(wbk wbkVar, aawb aawbVar, aone aoneVar) {
        this.b = wbkVar;
        this.a = aawbVar;
        this.c = aoneVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        aawb aawbVar = this.a;
        if (aawbVar != null) {
            aawbVar.e(cnqVar);
            return;
        }
        awjw awjwVar = (awjw) this.c.instance;
        if (awjwVar.b == 1) {
            awjx awjxVar = (awjx) awjwVar.c;
            if ((awjxVar.b & 16) != 0) {
                aahd aahdVar = this.b.a;
                apxf apxfVar = awjxVar.e;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.a(apxfVar);
            }
        }
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        final aawb aawbVar = this.a;
        final aone aoneVar = this.c;
        Runnable runnable = new Runnable() { // from class: wbh
            @Override // java.lang.Runnable
            public final void run() {
                wbi wbiVar = wbi.this;
                aawb aawbVar2 = aawbVar;
                aone aoneVar2 = aoneVar;
                if (aawbVar2 != null) {
                    aawbVar2.d();
                    return;
                }
                awjw awjwVar = (awjw) aoneVar2.instance;
                if (awjwVar.b == 1) {
                    awjx awjxVar = (awjx) awjwVar.c;
                    if ((awjxVar.b & 8) != 0) {
                        aahd aahdVar = wbiVar.b.a;
                        apxf apxfVar = awjxVar.d;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aahdVar.a(apxfVar);
                    }
                }
            }
        };
        this.b.a((arku) obj, 2, runnable, null);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
