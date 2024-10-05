package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebc implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ebe b;

    public ebc(ebe ebeVar, int i) {
        this.b = ebeVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dvo dvoVar;
        ebe ebeVar = this.b;
        if (this.a > 0) {
            try {
                Thread.sleep(r1 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = ebeVar.a.getPackageManager().getPackageInfo(ebeVar.a.getPackageName(), 0);
            Context context = ebeVar.a;
            dvoVar = oba.H(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            dvoVar = null;
        }
        this.b.i = dvoVar;
        if (this.a < 4) {
            if (dvoVar != null && (dvoVar.b & 4194304) != 0 && !dvoVar.s.equals("0000000000000000000000000000000000000000000000000000000000000000") && (dvoVar.d & 16384) != 0) {
                dvr dvrVar = dvoVar.af;
                if (dvrVar == null) {
                    dvrVar = dvr.a;
                }
                if ((dvrVar.b & 1) != 0) {
                    dvr dvrVar2 = dvoVar.af;
                    if (dvrVar2 == null) {
                        dvrVar2 = dvr.a;
                    }
                    if (dvrVar2.c != -2) {
                        return;
                    }
                }
            }
            this.b.e(this.a + 1);
        }
    }
}
