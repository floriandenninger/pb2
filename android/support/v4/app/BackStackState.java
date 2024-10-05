package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bg;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BackStackState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bg(0);
    public final List a;
    final List b;

    public BackStackState(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeTypedList(this.b);
    }
}
