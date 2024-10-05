package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qeq;
import defpackage.qip;
import defpackage.qko;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CastDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new qeq();
    public String a;
    String b;
    public InetAddress c;
    public String d;
    public String e;
    public String f;
    public int g;
    public int h;
    public int i;
    public String j;
    public final String k;
    public int l;
    public final String m;
    public byte[] n;
    public final String o;
    public final boolean p;
    private List q;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, List list, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9, boolean z) {
        this.a = f(str);
        String f = f(str2);
        this.b = f;
        if (!TextUtils.isEmpty(f)) {
            try {
                this.c = InetAddress.getByName(this.b);
            } catch (UnknownHostException e) {
                String str10 = this.b;
                String message = e.getMessage();
                String.valueOf(str10).length();
                String.valueOf(message).length();
            }
        }
        this.d = f(str3);
        this.e = f(str4);
        this.f = f(str5);
        this.g = i;
        this.q = list != null ? list : new ArrayList();
        this.h = i2;
        this.i = i3;
        this.j = f(str6);
        this.k = str7;
        this.l = i4;
        this.m = str8;
        this.n = bArr;
        this.o = str9;
        this.p = z;
    }

    public static CastDevice a(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    private static String f(String str) {
        return str == null ? "" : str;
    }

    public final String b() {
        return this.a.startsWith("__cast_nearby__") ? this.a.substring(16) : this.a;
    }

    public final void c(Bundle bundle) {
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
    }

    public final boolean d(int i) {
        return (this.h & i) == i;
    }

    public final boolean e() {
        return (this.a.startsWith("__cast_nearby__") || this.p) ? false : true;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        String str = this.a;
        return str == null ? castDevice.a == null : qko.j(str, castDevice.a) && qko.j(this.c, castDevice.c) && qko.j(this.e, castDevice.e) && qko.j(this.d, castDevice.d) && qko.j(this.f, castDevice.f) && this.g == castDevice.g && qko.j(this.q, castDevice.q) && this.h == castDevice.h && this.i == castDevice.i && qko.j(this.j, castDevice.j) && qko.j(Integer.valueOf(this.l), Integer.valueOf(castDevice.l)) && qko.j(this.m, castDevice.m) && qko.j(this.k, castDevice.k) && qko.j(this.f, castDevice.f) && this.g == castDevice.g && (((bArr = this.n) == null && castDevice.n == null) || Arrays.equals(bArr, castDevice.n)) && qko.j(this.o, castDevice.o) && this.p == castDevice.p;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return String.format("\"%s\" (%s)", this.d, this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.F(parcel, 3, this.b);
        qip.F(parcel, 4, this.d);
        qip.F(parcel, 5, this.e);
        qip.F(parcel, 6, this.f);
        qip.s(parcel, 7, this.g);
        qip.J(parcel, 8, Collections.unmodifiableList(this.q));
        qip.s(parcel, 9, this.h);
        qip.s(parcel, 10, this.i);
        qip.F(parcel, 11, this.j);
        qip.F(parcel, 12, this.k);
        qip.s(parcel, 13, this.l);
        qip.F(parcel, 14, this.m);
        qip.w(parcel, 15, this.n);
        qip.F(parcel, 16, this.o);
        qip.o(parcel, 17, this.p);
        qip.n(parcel, m);
    }
}
