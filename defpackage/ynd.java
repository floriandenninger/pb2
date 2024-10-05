package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ynd implements ServiceConnection {
    final /* synthetic */ yne a;

    public ynd(yne yneVar) {
        this.a = yneVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.a.b) {
            if (this.a.c) {
                if (!(iBinder instanceof Binder)) {
                    String flattenToString = componentName == null ? "null" : componentName.flattenToString();
                    String name = iBinder == null ? "null" : iBinder.getClass().getName();
                    StringBuilder sb = new StringBuilder(String.valueOf(flattenToString).length() + 78 + String.valueOf(name).length());
                    sb.append("Unexpected IBinder non-concrete-Binder for ComponentName: ");
                    sb.append(flattenToString);
                    sb.append(" service className: ");
                    sb.append(name);
                    zga.b(sb.toString());
                }
                yne yneVar = this.a;
                yneVar.d = (Binder) iBinder;
                yneVar.a.open();
                yne yneVar2 = this.a;
                yneVar2.e(yneVar2.d);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a.b) {
            yne yneVar = this.a;
            if (yneVar.c) {
                yneVar.c = false;
                yneVar.a.close();
                this.a.d = null;
            }
        }
    }
}
