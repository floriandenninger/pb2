package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bxv;
import defpackage.bxx;
import defpackage.bxy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bxv(0);
    public final bxy a;

    public ParcelImpl(Parcel parcel) {
        this.a = new bxx(parcel).c();
    }

    public ParcelImpl(bxy bxyVar) {
        this.a = bxyVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new bxx(parcel).k(this.a);
    }
}
