package com.google.android.libraries.youtube.mdx.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aapi;
import defpackage.adfq;
import defpackage.adfs;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class AppStatus implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapi(11);

    public static adfq c() {
        adfq adfqVar = new adfq(null);
        adfqVar.f(true);
        adfqVar.d(false);
        adfqVar.c(false);
        return adfqVar;
    }

    public static AppStatus d(int i) {
        adfq c = c();
        c.e(i);
        c.b(new HashMap());
        return c.a();
    }

    public abstract int a();

    public abstract Uri b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract adfs e();

    public abstract ScreenId f();

    public abstract Optional g();

    public abstract String h();

    public abstract Map i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(a());
        parcel.writeParcelable(b(), i);
        parcel.writeString(h());
        parcel.writeSerializable(f());
        parcel.writeByte(l() ? (byte) 1 : (byte) 0);
        parcel.writeByte(k() ? (byte) 1 : (byte) 0);
        parcel.writeByte(j() ? (byte) 1 : (byte) 0);
        Map i2 = i();
        parcel.writeInt(i2.size());
        for (Map.Entry entry : i2.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
