package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.aomf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class RelatedVideoItem implements BusSupported$Data {
    public static final Parcelable.Creator CREATOR;
    public static final RelatedVideoItem a;

    static {
        h i = i();
        i.a = "";
        i.b = "";
        i.c = "";
        i.d = "";
        i.e = new BitmapKey(0, 0);
        i.f = new SelectableItemKey(0, 0);
        i.g = aomf.b;
        a = i.a();
        CREATOR = new com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.a(17);
    }

    public static h i() {
        return new h();
    }

    public abstract BitmapKey a();

    public abstract SelectableItemKey b();

    public abstract aomf c();

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data
    public final b d() {
        return b.RELATED_VIDEO_ITEM;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract CharSequence e();

    public abstract CharSequence f();

    public abstract CharSequence g();

    public abstract String h();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(h());
        TextUtils.writeToParcel(g(), parcel, i);
        TextUtils.writeToParcel(e(), parcel, i);
        TextUtils.writeToParcel(f(), parcel, i);
        parcel.writeParcelable(a(), i);
        parcel.writeParcelable(b(), i);
        parcel.writeSerializable(c());
    }
}
