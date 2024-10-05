package com.google.android.apps.youtube.app.extensions.reel.edit.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import defpackage.amkq;
import defpackage.amru;
import defpackage.gjj;
import defpackage.hvf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ReelEditModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new gjj(7);

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public abstract class DeletedItem implements Parcelable {
        public static final Parcelable.Creator CREATOR = new gjj(8);

        public static final DeletedItem c(int i, ReelItemEditModel reelItemEditModel) {
            amkq.E(i >= 0);
            return new AutoValue_ReelEditModel_DeletedItem(i, reelItemEditModel);
        }

        public abstract int a();

        public abstract ReelItemEditModel b();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(a());
            parcel.writeParcelable(b(), i);
        }
    }

    public static hvf e() {
        hvf hvfVar = new hvf();
        hvfVar.b(0);
        return hvfVar;
    }

    public abstract int a();

    public abstract hvf b();

    public abstract DeletedItem c();

    public abstract amru d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ReelItemEditModel f() {
        return (ReelItemEditModel) d().get(a());
    }

    public final RecordingInfo g() {
        return f().d();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(d());
        parcel.writeInt(a());
        parcel.writeParcelable(c(), i);
    }
}
