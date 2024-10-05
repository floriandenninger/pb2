package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nkf implements Runnable {
    public boolean a = false;
    public boolean b = false;
    public float c;
    public int d;
    final /* synthetic */ nkg e;

    public nkf(nkg nkgVar) {
        this.e = nkgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a = false;
        this.b = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            nkg nkgVar = this.e;
            if (nkgVar.q == null) {
                apxf apxfVar = nkgVar.o;
                if (apxfVar == null) {
                    apxfVar = nkgVar.m;
                    acra mM = nkgVar.d.mM();
                    if (mM != null && mM.c() != null) {
                        mM.n(new acqx(acsb.c(62748)));
                        aone createBuilder = atmc.a.createBuilder();
                        String str = mM.c().a;
                        createBuilder.copyOnWrite();
                        atmc atmcVar = (atmc) createBuilder.instance;
                        str.getClass();
                        atmcVar.b |= 1;
                        atmcVar.c = str;
                        createBuilder.copyOnWrite();
                        atmc atmcVar2 = (atmc) createBuilder.instance;
                        atmcVar2.b |= 2;
                        atmcVar2.d = 62748;
                        atmc atmcVar3 = (atmc) createBuilder.build();
                        aong aongVar = (aong) apxfVar.toBuilder();
                        aongVar.e(atmb.b, atmcVar3);
                        aongVar.copyOnWrite();
                        apxf apxfVar2 = (apxf) aongVar.instance;
                        apxfVar2.b &= -2;
                        apxfVar2.c = apxf.a.c;
                        apxfVar = (apxf) aongVar.build();
                    }
                }
                this.e.q = htu.p(apxfVar, true, true);
                nkg nkgVar2 = this.e;
                htu htuVar = nkgVar2.q;
                htuVar.ar = nkgVar2;
                if (!htuVar.ar()) {
                    dn k = this.e.c.k();
                    k.q(this.d, this.e.q, "creation_fragment");
                    k.k();
                }
                if (this.b) {
                    this.e.q.au.a();
                    this.b = false;
                }
            }
            htv htvVar = this.e.q.aq;
            float f = this.c;
            htl htlVar = ((htq) htvVar).a.am;
            if (htlVar != null) {
                htlVar.ai = f;
            }
            this.a = false;
        }
    }
}
