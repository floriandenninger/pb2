package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pzf extends ecq implements pzg {
    final /* synthetic */ pzp a;

    public pzf() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
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
        pzp pzpVar = this.a;
        dwr dwrVar = pzpVar.a;
        dwrVar.b.m(pzpVar.a(pyxVar));
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzf(pzp pzpVar) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        this.a = pzpVar;
    }
}
