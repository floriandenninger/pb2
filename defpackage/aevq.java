package defpackage;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aevq extends axa {
    public aetl q;
    private final aetw u;
    private final Handler v;

    public aevq(Context context, awb awbVar, aetw aetwVar, Handler handler, aevi aeviVar, awh awhVar) {
        super(context, aeviVar, handler, awbVar, awhVar);
        this.q = aetl.a;
        this.u = aetwVar;
        this.v = handler;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.axa, defpackage.bac
    public final void A(asw aswVar) {
        super.A(aswVar);
        this.q.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.axa, defpackage.bac
    public final float b(float f, pms pmsVar, pms[] pmsVarArr) {
        if (this.u.s.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_DISABLE_CODEC_OPERATING_RATE)) {
            return -1.0f;
        }
        return super.b(f, pmsVar, pmsVarArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.axa, defpackage.bac, defpackage.ple
    public final void l(boolean z, boolean z2) {
        super.l(z, z2);
        this.q.c();
    }

    @Override // defpackage.axa, defpackage.ple
    public final void n() {
        if (this.u.s.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_REPORT_PRE_AUDIO_TRACK_LATENCY)) {
            this.v.post(new Runnable() { // from class: aevp
                @Override // java.lang.Runnable
                public final void run() {
                    aevq.this.q.a();
                }
            });
        }
        super.n();
        this.q.f();
    }

    @Override // defpackage.axa, defpackage.ple, defpackage.poc
    public final void rk(int i, Object obj) {
        if (i == 10001) {
            aetl aetlVar = (aetl) obj;
            if (aetlVar == null) {
                aetlVar = aetl.a;
            }
            this.q = aetlVar;
            return;
        }
        super.rk(i, obj);
    }

    @Override // defpackage.axa, defpackage.bac, defpackage.poe
    public final boolean s() {
        if (!super.s()) {
            return false;
        }
        this.q.e();
        return true;
    }
}
