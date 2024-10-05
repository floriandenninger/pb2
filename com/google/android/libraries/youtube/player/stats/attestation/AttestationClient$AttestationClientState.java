package com.google.android.libraries.youtube.player.stats.attestation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import defpackage.aigo;
import defpackage.ammx;
import defpackage.atxz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AttestationClient$AttestationClientState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aigo(11);
    public final atxz a;
    public final TrackingUrlModel b;
    public final String c;
    public final int d;
    public final boolean e;

    public AttestationClient$AttestationClientState(Parcel parcel) {
        atxz atxzVar;
        ClassLoader classLoader = getClass().getClassLoader();
        ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite == null) {
            atxzVar = atxz.a;
        } else {
            atxzVar = (atxz) parcelableMessageLite.a(atxz.a);
        }
        this.a = atxzVar;
        this.b = (TrackingUrlModel) parcel.readParcelable(classLoader);
        this.c = ammx.d(parcel.readString());
        this.d = parcel.readInt();
        this.e = parcel.readInt() == 1;
    }

    public AttestationClient$AttestationClientState(atxz atxzVar, TrackingUrlModel trackingUrlModel, String str, int i, boolean z) {
        this.a = atxzVar;
        this.b = trackingUrlModel;
        this.c = str;
        this.d = i;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String valueOf = String.valueOf(this.b.c());
        int b = this.b.b(5);
        String str = this.c;
        int i = this.d;
        boolean z = this.e;
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 110 + String.valueOf(valueOf).length() + str.length());
        sb.append("AtrClient.AtrClientState{");
        sb.append(hexString);
        sb.append(" baseAtrUri=");
        sb.append(valueOf);
        sb.append(" delaySeconds=");
        sb.append(b);
        sb.append(" cpn=");
        sb.append(str);
        sb.append(" length=");
        sb.append(i);
        sb.append(" atrPingRequested=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new ParcelableMessageLite(this.a), 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
