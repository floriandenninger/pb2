package com.google.android.apps.youtube.app.extensions.reel.edit.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import defpackage.gjj;
import defpackage.hvv;
import defpackage.vsy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ReelItemEditModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new gjj(9);

    public static hvv g() {
        hvv hvvVar = new hvv();
        hvvVar.c(false);
        return hvvVar;
    }

    public abstract hvv a();

    public abstract EditableVideoEdits b();

    public abstract VideoMetaData c();

    public abstract RecordingInfo d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    public abstract boolean f();

    public final vsy h() {
        return new vsy(b(), c());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(d(), i);
        parcel.writeParcelable(c(), i);
        parcel.writeParcelable(b(), i);
        parcel.writeString(e());
        parcel.writeByte(f() ? (byte) 1 : (byte) 0);
    }
}
