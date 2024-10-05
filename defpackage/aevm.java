package defpackage;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aevm extends aud {
    private aetl d;

    public aevm() {
        this(null, null, new avr[0]);
    }

    @Override // defpackage.awo
    protected final auk g(String str, pms pmsVar, pms pmsVar2) {
        int i = pmsVar.A != pmsVar2.A ? 4096 : 0;
        if (pmsVar.B != pmsVar2.B) {
            i |= 8192;
        }
        int i2 = i;
        return new auk(str, pmsVar, pmsVar2, i2 == 0 ? 3 : 0, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awo, defpackage.ple
    public final void l(boolean z, boolean z2) {
        super.l(z, z2);
        this.d.c();
    }

    @Override // defpackage.awo, defpackage.ple
    public final void n() {
        super.n();
        this.d.f();
    }

    @Override // defpackage.awo, defpackage.ple, defpackage.poc
    public final void rk(int i, Object obj) {
        if (i == 10001) {
            aetl aetlVar = (aetl) obj;
            if (aetlVar == null) {
                aetlVar = aetl.a;
            }
            this.d = aetlVar;
            return;
        }
        super.rk(i, obj);
    }

    @Override // defpackage.awo, defpackage.poe
    public final boolean s() {
        if (!super.s()) {
            return false;
        }
        this.d.e();
        return true;
    }

    public aevm(awb awbVar, Handler handler, avr... avrVarArr) {
        super(handler, awbVar, avrVarArr);
        this.d = aetl.a;
    }
}
