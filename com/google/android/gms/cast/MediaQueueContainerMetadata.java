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
public class MediaQueueContainerMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qfh(2);
    public int a;
    public String b;
    public List c;
    public List d;
    public double e;

    public MediaQueueContainerMetadata() {
        a();
    }

    public MediaQueueContainerMetadata(int i, String str, List list, List list2, double d) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = d;
    }

    public MediaQueueContainerMetadata(MediaQueueContainerMetadata mediaQueueContainerMetadata) {
        this.a = mediaQueueContainerMetadata.a;
        this.b = mediaQueueContainerMetadata.b;
        this.c = mediaQueueContainerMetadata.c;
        this.d = mediaQueueContainerMetadata.d;
        this.e = mediaQueueContainerMetadata.e;
    }

    public final void a() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueContainerMetadata)) {
            return false;
        }
        MediaQueueContainerMetadata mediaQueueContainerMetadata = (MediaQueueContainerMetadata) obj;
        return this.a == mediaQueueContainerMetadata.a && TextUtils.equals(this.b, mediaQueueContainerMetadata.b) && qar.j(this.c, mediaQueueContainerMetadata.c) && qar.j(this.d, mediaQueueContainerMetadata.d) && this.e == mediaQueueContainerMetadata.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Double.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 2, this.a);
        qip.F(parcel, 3, this.b);
        List list = this.c;
        qip.J(parcel, 4, list == null ? null : Collections.unmodifiableList(list));
        List list2 = this.d;
        qip.J(parcel, 5, list2 != null ? Collections.unmodifiableList(list2) : null);
        qip.p(parcel, 6, this.e);
        qip.n(parcel, m);
    }
}
