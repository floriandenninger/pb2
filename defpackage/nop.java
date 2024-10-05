package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class nop implements nqg {
    public final acra a;
    public aqts b;
    protected asht c;
    private final aaea d;

    public nop(acra acraVar, aaea aaeaVar) {
        this.a = acraVar;
        this.d = aaeaVar;
    }

    @Override // defpackage.nqg
    public /* synthetic */ void A(aqts aqtsVar, apxf apxfVar, boolean z) {
        w(aqtsVar, null);
    }

    @Override // defpackage.nqg
    public final acra j() {
        return this.a;
    }

    @Override // defpackage.nqg
    public final amsx k() {
        aqts aqtsVar = this.b;
        if (aqtsVar == null || aqtsVar.l.size() <= 0) {
            return nyh.a;
        }
        return amsx.p(new aonw(aqtsVar.l, aqts.a));
    }

    @Override // defpackage.nqg
    public final aqts l() {
        return this.b;
    }

    @Override // defpackage.nqg
    public void m() {
    }

    @Override // defpackage.nqg
    public void p() {
    }

    @Override // defpackage.nqg
    public void q(aqts aqtsVar, asht ashtVar) {
        this.b = aqtsVar;
        this.c = ashtVar;
    }

    @Override // defpackage.nqg
    public void r(boolean z) {
    }

    @Override // defpackage.nqg
    public /* synthetic */ boolean s() {
        return false;
    }

    @Override // defpackage.nqg
    public /* synthetic */ boolean t() {
        return false;
    }

    @Override // defpackage.nqg
    public /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.nqg
    public final boolean v() {
        int bk;
        arfd a;
        int bk2;
        aqts aqtsVar = this.b;
        if (aqtsVar != null && (aqtsVar.c & 64) != 0) {
            aqtp aqtpVar = aqtsVar.i;
            if (aqtpVar == null) {
                aqtpVar = aqtp.a;
            }
            if ((aqtpVar.b & 1) != 0) {
                aqtp aqtpVar2 = aqtsVar.i;
                if (aqtpVar2 == null) {
                    aqtpVar2 = aqtp.a;
                }
                int bi = aocz.bi(aqtpVar2.c);
                if (bi != 0 && bi == 3) {
                    return false;
                }
            }
        }
        aaea aaeaVar = this.d;
        if (aaeaVar != null && (a = aaeaVar.a()) != null && (a.b & 64) != 0) {
            aswb aswbVar = a.e;
            if (aswbVar == null) {
                aswbVar = aswb.a;
            }
            if (aswbVar.bb) {
                aqts aqtsVar2 = this.b;
                return aqtsVar2 == null || (bk2 = aocz.bk(aqtsVar2.k)) == 0 || bk2 != 3;
            }
        }
        aqts aqtsVar3 = this.b;
        return (aqtsVar3 == null || (bk = aocz.bk(aqtsVar3.k)) == 0 || bk != 2) ? false : true;
    }

    @Override // defpackage.nqg
    public /* synthetic */ boolean w(aqts aqtsVar, apxf apxfVar) {
        return false;
    }

    @Override // defpackage.nqg
    public boolean x() {
        int bm;
        aqts aqtsVar = this.b;
        return aqtsVar == null || (bm = aocz.bm(aqtsVar.n)) == 0 || bm != 4;
    }

    @Override // defpackage.nqg
    public boolean y() {
        return false;
    }

    @Override // defpackage.nqg
    public final /* synthetic */ void z() {
    }
}
