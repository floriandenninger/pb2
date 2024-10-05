package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.model.k;
import defpackage.aomf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class SubscriptionNotificationButtonData implements Parcelable {
    public static final SubscriptionNotificationButtonData a = e().a();
    public static final Parcelable.Creator CREATOR = new k(6);

    public static a e() {
        a aVar = new a();
        aVar.c(0);
        aVar.b(0);
        aVar.a = null;
        aVar.d(aomf.b);
        return aVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract aomf c();

    public abstract String d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(b());
        parcel.writeInt(a());
        parcel.writeString(d());
        parcel.writeByteArray(c().I());
    }
}
