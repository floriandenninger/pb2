package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pwx extends ecq implements pwy {
    private final dwp a;

    public pwx(dwp dwpVar) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.a = dwpVar;
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        this.a.a.q(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }

    public pwx() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }
}
