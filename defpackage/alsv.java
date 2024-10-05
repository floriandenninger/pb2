package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alsv implements ServiceConnection {
    final /* synthetic */ alsx a;

    public alsv(alsx alsxVar) {
        this.a = alsxVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.a.a(new alsw(7));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        this.a.a(new alsw(6));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        alsj alsjVar;
        if (iBinder == null) {
            alsx.c.j("Binder is null when onServiceConnected was called!");
            i = 5;
        } else {
            i = 4;
        }
        alsx alsxVar = this.a;
        if (iBinder == null) {
            alsjVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.ISetupCompatService");
            if (queryLocalInterface instanceof alsj) {
                alsjVar = (alsj) queryLocalInterface;
            } else {
                alsjVar = new alsj(iBinder);
            }
        }
        alsxVar.a(new alsw(i, alsjVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.a(new alsw(5));
    }
}
