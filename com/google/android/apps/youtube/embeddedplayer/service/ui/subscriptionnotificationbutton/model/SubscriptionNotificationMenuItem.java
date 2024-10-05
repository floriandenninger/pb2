package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.model.k;
import defpackage.aomf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class SubscriptionNotificationMenuItem implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        g().a();
        CREATOR = new k(8);
    }

    public static b g() {
        b bVar = new b();
        bVar.d(0);
        bVar.c(false);
        bVar.b(0);
        bVar.a = null;
        bVar.b = null;
        bVar.e(aomf.b);
        return bVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract aomf c();

    public abstract String d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    public abstract boolean f();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(b());
        parcel.writeByte(f() ? (byte) 1 : (byte) 0);
        parcel.writeInt(a());
        parcel.writeString(e());
        parcel.writeString(d());
        parcel.writeByteArray(c().I());
    }
}
