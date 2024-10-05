package com.google.android.libraries.youtube.upload.util;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aigo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UploadThumbnailExtractor$ThumbnailFileInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aigo(20);
    public final Uri a;
    public final Long b;
    public final String c;

    public UploadThumbnailExtractor$ThumbnailFileInfo(Uri uri, Long l) {
        this.a = uri;
        this.b = l;
        this.c = null;
    }

    public UploadThumbnailExtractor$ThumbnailFileInfo(Parcel parcel) {
        this.a = (Uri) parcel.readValue(Uri.class.getClassLoader());
        this.b = (Long) parcel.readValue(Long.class.getClassLoader());
        this.c = (String) parcel.readValue(String.class.getClassLoader());
    }

    public UploadThumbnailExtractor$ThumbnailFileInfo(String str) {
        this.a = null;
        this.b = null;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a);
        parcel.writeValue(this.b);
        parcel.writeValue(this.c);
    }
}
