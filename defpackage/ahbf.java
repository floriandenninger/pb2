package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahbf implements ServiceConnection {
    final /* synthetic */ ahbh a;

    public ahbf(ahbh ahbhVar) {
        this.a = ahbhVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ahbh ahbhVar = this.a;
        if (!ahbhVar.k) {
            afsi.b(1, 10, "onServiceConnected called for player service, but the service shouldn't be started.");
            return;
        }
        if (ahbhVar.d.c()) {
            Intent intent = (Intent) this.a.b.get();
            if (Build.VERSION.SDK_INT >= 26) {
                ahbh ahbhVar2 = this.a;
                if (ahbhVar2.c.j) {
                    ahbhVar2.a.startForegroundService(intent);
                    ((aiki) this.a.j.get()).i(true);
                    return;
                }
            }
            if (Build.VERSION.SDK_INT < 26) {
                this.a.a.startService(intent);
            }
            ahbh ahbhVar3 = this.a;
            if (ahbhVar3.l) {
                ahbhVar3.c();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((aiki) this.a.j.get()).b(true);
        this.a.g();
    }
}
