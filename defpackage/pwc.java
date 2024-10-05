package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pwc extends ecq implements pwd {
    private final dwp a;

    public pwc(dwp dwpVar) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.a = dwpVar;
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        this.a.a();
        parcel2.writeNoException();
        return true;
    }

    public pwc() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }
}
