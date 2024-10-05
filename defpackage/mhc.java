package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mhc extends gfp implements mia {
    public final aaea d;
    public final azrw e;
    public volatile int f;
    private final aadw i;
    private final axzg j;
    private boolean h = true;
    private final Handler g = new mhb(this, Looper.getMainLooper());

    public mhc(aaea aaeaVar, aadw aadwVar, azrw azrwVar, ayqi ayqiVar, axzg axzgVar, byte[] bArr) {
        this.d = aaeaVar;
        this.i = aadwVar;
        this.e = azrwVar;
        this.f = evr.s(aaeaVar);
        aswb aswbVar = aaeaVar.a().e;
        aswbVar = aswbVar == null ? aswb.a : aswbVar;
        if (fhe.F(aswbVar)) {
            this.f = fhe.E(aswbVar).c;
            ((akmu) azrwVar.get()).c().E(ayqiVar).X(new ayrs() { // from class: mha
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    mhc mhcVar = mhc.this;
                    akmw akmwVar = (akmw) obj;
                    aswb aswbVar2 = mhcVar.d.a().e;
                    if (aswbVar2 == null) {
                        aswbVar2 = aswb.a;
                    }
                    if (fhe.F(aswbVar2)) {
                        ammv a = ((akmu) mhcVar.e.get()).a(fhe.E(aswbVar2), akmwVar);
                        if (a.h()) {
                            mhcVar.f = ((Integer) a.c()).intValue();
                        }
                    }
                }
            });
        }
        this.j = axzgVar;
    }

    private final void b() {
        this.g.removeMessages(23998);
    }

    @Override // defpackage.mia
    public final void a(boolean z) {
        this.h = z;
    }

    @Override // defpackage.gfp, defpackage.ggf
    public final void g(gfq gfqVar) {
        b();
    }

    @Override // defpackage.gfp
    protected final boolean i(gfq gfqVar, int i) {
        if (evr.aC(this.i) && gfqVar.b.a().d == arib.INLINE_PLAYBACK_TRIGGER_STYLE_USER) {
            return true;
        }
        int intValue = ((Long) this.j.a.a.Y(axzc.b).B().aB()).intValue();
        aswb aswbVar = this.d.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if (fhe.F(aswbVar) && this.f > 0) {
            intValue = this.f;
        } else if (this.h || intValue <= 0) {
            intValue = evr.s(this.d);
        }
        if (i != 2 || intValue <= 0 || !gfqVar.b.j()) {
            b();
            return true;
        }
        b();
        this.g.sendEmptyMessageDelayed(23998, intValue);
        return false;
    }
}
