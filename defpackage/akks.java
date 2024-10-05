package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akks implements Runnable {
    final /* synthetic */ PackageManager a;
    final /* synthetic */ akkt b;

    public akks(akkt akktVar, PackageManager packageManager) {
        this.b = akktVar;
        this.a = packageManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yjk.e();
        List aF = wbs.aF(this.a);
        synchronized (this.b) {
            Iterator it = aF.iterator();
            while (it.hasNext()) {
                this.b.a.add(((ResolveInfo) it.next()).activityInfo.applicationInfo.packageName);
            }
        }
    }
}
