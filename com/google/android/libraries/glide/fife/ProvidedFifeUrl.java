package com.google.android.libraries.glide.fife;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rrw;
import defpackage.vae;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ProvidedFifeUrl implements FifeUrl {
    public static final Parcelable.Creator CREATOR = new rrw(9);
    private final String b;

    public ProvidedFifeUrl(Parcel parcel) {
        this.b = parcel.readString();
    }

    @Override // defpackage.cqi
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.cqi
    public final boolean equals(Object obj) {
        if (obj instanceof ProvidedFifeUrl) {
            return this.b.equals(((ProvidedFifeUrl) obj).b);
        }
        return false;
    }

    @Override // defpackage.cqi
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 27);
        sb.append("ProvidedFifeUrl{baseUrl='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }

    public ProvidedFifeUrl(String str) {
        if (vae.a(str)) {
            this.b = str;
        } else {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "baseUrl is not a fife Url: ".concat(valueOf) : new String("baseUrl is not a fife Url: "));
        }
    }
}
