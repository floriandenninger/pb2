package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afae implements bjc {
    private final bjc a;
    private final afag b;
    private final int c;

    public afae(bjc bjcVar, afag afagVar, int i) {
        this.a = bjcVar;
        this.b = afagVar;
        this.c = i;
    }

    @Override // defpackage.bjc
    public final int B(atc atcVar, int i, boolean z) {
        return this.a.e(atcVar, i, z);
    }

    @Override // defpackage.bjc
    public final /* synthetic */ int e(atc atcVar, int i, boolean z) {
        return hp.d(this, atcVar, i, z);
    }

    @Override // defpackage.bjc
    public final void rp(pms pmsVar) {
        this.a.rp(pmsVar);
    }

    @Override // defpackage.bjc
    public final /* synthetic */ void t(pth pthVar, int i) {
        hp.e(this, pthVar, i);
    }

    @Override // defpackage.bjc
    public final void u(pth pthVar, int i, int i2) {
        this.a.t(pthVar, i);
    }

    @Override // defpackage.bjc
    public final void v(long j, int i, int i2, int i3, bjb bjbVar) {
        afag afagVar = this.b;
        int i4 = this.c;
        if (TimeUnit.MICROSECONDS.toMillis(j) > afagVar.e && !afagVar.b) {
            if (i4 == 1) {
                if (!afagVar.c) {
                    afagVar.a.e();
                    afagVar.c = true;
                    if (Build.VERSION.SDK_INT >= 29) {
                        Trace.endAsyncSection("ParsingAudio", afagVar.f);
                    }
                }
            } else if (!afagVar.d) {
                afagVar.a.av();
                afagVar.d = true;
                if (Build.VERSION.SDK_INT >= 29) {
                    Trace.endAsyncSection("ParsingVideo", afagVar.f);
                }
            }
            afagVar.b = afagVar.d && afagVar.c;
        }
        this.a.v(j, i, i2, i3, bjbVar);
    }
}
