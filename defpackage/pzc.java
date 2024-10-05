package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pzc extends ecq implements pzd {
    final /* synthetic */ pzp a;

    public pzc() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        pyx pyxVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            pyxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            if (queryLocalInterface instanceof pyx) {
                pyxVar = (pyx) queryLocalInterface;
            } else {
                pyxVar = new pyx(readStrongBinder);
            }
        }
        String readString = parcel.readString();
        pzp pzpVar = this.a;
        dwr dwrVar = pzpVar.b;
        if (dwrVar != null) {
            dwrVar.b.r(pzpVar.a(pyxVar), readString);
        }
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzc(pzp pzpVar) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        this.a = pzpVar;
    }
}
