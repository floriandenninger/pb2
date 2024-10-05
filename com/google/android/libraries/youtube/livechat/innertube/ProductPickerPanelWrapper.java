package com.google.android.libraries.youtube.livechat.innertube;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import defpackage.aapi;
import defpackage.aooy;
import defpackage.asqv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ProductPickerPanelWrapper extends SupportedPickerPanelWrapper {
    public static final Parcelable.Creator CREATOR = new aapi(3);

    public ProductPickerPanelWrapper(Parcel parcel) {
        super((asqv) ((ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader())).a(asqv.a));
    }

    @Override // com.google.android.libraries.youtube.livechat.innertube.SupportedPickerPanelWrapper
    public final String a() {
        return ((asqv) this.a).b;
    }

    @Override // com.google.android.libraries.youtube.livechat.innertube.SupportedPickerPanelWrapper
    public final boolean b() {
        return ((asqv) this.a).c.size() > 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aooy, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new ParcelableMessageLite((aooy) this.a), 0);
    }

    public ProductPickerPanelWrapper(asqv asqvVar) {
        super(asqvVar);
    }
}
