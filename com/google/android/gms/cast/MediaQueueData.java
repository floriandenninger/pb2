package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qar;
import defpackage.qfh;
import defpackage.qip;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MediaQueueData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qfh(3);
    public String a;
    public String b;
    public int c;
    public String d;
    public MediaQueueContainerMetadata e;
    public int f;
    public List g;
    public int h;
    public long i;

    public MediaQueueData() {
        a();
    }

    public MediaQueueData(MediaQueueData mediaQueueData) {
        this.a = mediaQueueData.a;
        this.b = mediaQueueData.b;
        this.c = mediaQueueData.c;
        this.d = mediaQueueData.d;
        this.e = mediaQueueData.e;
        this.f = mediaQueueData.f;
        this.g = mediaQueueData.g;
        this.h = mediaQueueData.h;
        this.i = mediaQueueData.i;
    }

    public MediaQueueData(String str, String str2, int i, String str3, MediaQueueContainerMetadata mediaQueueContainerMetadata, int i2, List list, int i3, long j) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = mediaQueueContainerMetadata;
        this.f = i2;
        this.g = list;
        this.h = i3;
        this.i = j;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.f = 0;
        this.g = null;
        this.h = 0;
        this.i = -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueData)) {
            return false;
        }
        MediaQueueData mediaQueueData = (MediaQueueData) obj;
        return TextUtils.equals(this.a, mediaQueueData.a) && TextUtils.equals(this.b, mediaQueueData.b) && this.c == mediaQueueData.c && TextUtils.equals(this.d, mediaQueueData.d) && qar.j(this.e, mediaQueueData.e) && this.f == mediaQueueData.f && qar.j(this.g, mediaQueueData.g) && this.h == mediaQueueData.h && this.i == mediaQueueData.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Long.valueOf(this.i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.F(parcel, 3, this.b);
        qip.s(parcel, 4, this.c);
        qip.F(parcel, 5, this.d);
        qip.E(parcel, 6, this.e, i);
        qip.s(parcel, 7, this.f);
        List list = this.g;
        qip.J(parcel, 8, list == null ? null : Collections.unmodifiableList(list));
        qip.s(parcel, 9, this.h);
        qip.t(parcel, 10, this.i);
        qip.n(parcel, m);
    }
}
