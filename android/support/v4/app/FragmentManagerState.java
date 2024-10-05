package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bg;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bg(3);
    public ArrayList a;
    public ArrayList b;
    public ArrayList c;
    public BackStackRecordState[] d;
    public int e;
    public String f;
    public ArrayList g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;

    public FragmentManagerState() {
        this.f = null;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeStringList(this.c);
        parcel.writeTypedArray(this.d, i);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeStringList(this.g);
        parcel.writeTypedList(this.h);
        parcel.writeStringList(this.i);
        parcel.writeTypedList(this.j);
        parcel.writeTypedList(this.k);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f = null;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.a = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.b = parcel.createStringArrayList();
        this.c = parcel.createStringArrayList();
        this.d = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.createStringArrayList();
        this.h = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.i = parcel.createStringArrayList();
        this.j = parcel.createTypedArrayList(Bundle.CREATOR);
        this.k = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
    }
}
