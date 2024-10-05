package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class act {
    public final ComponentName a;
    public final az b;

    public act(az azVar, ComponentName componentName) {
        this.b = azVar;
        this.a = componentName;
    }

    public final Bundle a(String str, Bundle bundle) {
        try {
            az azVar = this.b;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                obtain.writeString(str);
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
                azVar.a.transact(5, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        } catch (RemoteException unused) {
            return null;
        }
    }
}
