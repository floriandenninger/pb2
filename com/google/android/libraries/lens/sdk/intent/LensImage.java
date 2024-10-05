package com.google.android.libraries.lens.sdk.intent;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rrw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LensImage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new rrw(11);
    public BinderBitmap a;
    private final Bundle b;

    public LensImage(Bitmap bitmap) {
        this.a = new BinderBitmap(bitmap.isMutable() ? bitmap.copy(bitmap.getConfig(), false) : bitmap);
        Bundle bundle = new Bundle();
        this.b = bundle;
        bundle.putParcelable("BinderBitmap", this.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }

    public LensImage(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.b = readBundle;
        if (readBundle != null) {
            this.a = (BinderBitmap) readBundle.getParcelable("BinderBitmap");
            readBundle.getString("FifeUrl");
            readBundle.getString("PageUrl");
            readBundle.getString("PageDomain");
            readBundle.getString("SrcUrl");
            readBundle.getString("TitleOrAltText");
        }
    }
}
