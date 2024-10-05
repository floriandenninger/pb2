package com.google.android.libraries.lens.sdk.intent;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.rrw;
import defpackage.tdn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BinderBitmap implements Parcelable {
    public static final Parcelable.Creator CREATOR = new rrw(10);
    public final Bitmap a;
    private final Bundle b;
    private final tdn c;

    public BinderBitmap(Bitmap bitmap) {
        this.a = bitmap;
        tdn tdnVar = new tdn(bitmap);
        this.c = tdnVar;
        Bundle bundle = new Bundle();
        this.b = bundle;
        bundle.putBinder("binder", tdnVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }

    public BinderBitmap(Parcel parcel) {
        this.c = null;
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.b = readBundle;
        IBinder binder = readBundle.getBinder("binder");
        if (binder == null) {
            this.a = null;
            return;
        }
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            binder.transact(1, obtain, obtain2, 0);
        } catch (RemoteException unused) {
        }
        obtain2.readException();
        Bundle readBundle2 = obtain2.readBundle(Bundle.class.getClassLoader());
        Bitmap bitmap = readBundle2 != null ? (Bitmap) readBundle2.getParcelable("bitmap") : null;
        obtain.recycle();
        obtain2.recycle();
        this.a = bitmap;
    }
}
