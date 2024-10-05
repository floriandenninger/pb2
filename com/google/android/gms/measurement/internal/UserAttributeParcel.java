package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rbg;
import defpackage.rkk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UserAttributeParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rbg(16);
    public final int a;
    public final String b;
    public final long c;
    public final Long d;
    public final String e;
    public final String f;
    public final Double g;

    public UserAttributeParcel(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = l;
        if (i == 1) {
            this.g = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.g = d;
        }
        this.e = str2;
        this.f = str3;
    }

    public final Object a() {
        Long l = this.d;
        if (l != null) {
            return l;
        }
        Double d = this.g;
        if (d != null) {
            return d;
        }
        String str = this.e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        rbg.b(this, parcel);
    }

    public UserAttributeParcel(rkk rkkVar) {
        this(rkkVar.c, rkkVar.d, rkkVar.e, rkkVar.b);
    }

    public UserAttributeParcel(String str, long j, Object obj, String str2) {
        qip.ax(str);
        this.a = 2;
        this.b = str;
        this.c = j;
        this.f = str2;
        if (obj == null) {
            this.d = null;
            this.g = null;
            this.e = null;
            return;
        }
        if (obj instanceof Long) {
            this.d = (Long) obj;
            this.g = null;
            this.e = null;
        } else if (obj instanceof String) {
            this.d = null;
            this.g = null;
            this.e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.d = null;
                this.g = (Double) obj;
                this.e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
