package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bg;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FragmentManager$LaunchedFragmentInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bg(2);
    public String a;
    public int b;

    public FragmentManager$LaunchedFragmentInfo(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }

    public FragmentManager$LaunchedFragmentInfo(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
