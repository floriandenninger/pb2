package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acw implements ServiceConnection {
    public Context a;
    final /* synthetic */ ajcw b;

    public acw() {
    }

    public acw(ajcw ajcwVar) {
        this.b = ajcwVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        az azVar;
        if (this.a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        if (iBinder == null) {
            azVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof az)) {
                azVar = new az(iBinder);
            } else {
                azVar = (az) queryLocalInterface;
            }
        }
        shd shdVar = new shd(componentName, new act(azVar, componentName));
        if (this.b.c != null) {
            this.b.c.c(shdVar);
            apct apctVar = this.b.b.a().B;
            if (apctVar == null) {
                apctVar = apct.a;
            }
            if (!apctVar.b) {
                apct apctVar2 = this.b.b.a().B;
                if (apctVar2 == null) {
                    apctVar2 = apct.a;
                }
                if (!apctVar2.c) {
                    return;
                }
            }
            try {
                try {
                    az azVar2 = shdVar.b.b;
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                        obtain.writeLong(0L);
                        azVar2.a.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.readInt();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                } catch (RemoteException unused) {
                }
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                afsi.c(1, 1, "Unable to prewarm CCT", e);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ajcw ajcwVar = this.b;
        if (ajcwVar.d.compareAndSet(true, false)) {
            ajcwVar.a.unbindService(ajcwVar.e);
        }
        if (ajcwVar.c != null) {
            ajcwVar.c.b();
            ajcwVar.c = null;
        }
    }
}
