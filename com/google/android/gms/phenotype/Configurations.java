package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rnq;
import defpackage.rqr;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Configurations extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rnq(13);
    public final String a;
    public final byte[] b;
    public final String c;
    public final Configuration[] d;
    public final Map e = new TreeMap();
    public final boolean f;
    public final long g;

    public Configurations(String str, String str2, Configuration[] configurationArr, boolean z, byte[] bArr, long j) {
        this.a = str;
        this.c = str2;
        this.d = configurationArr;
        this.f = z;
        this.b = bArr;
        this.g = j;
        for (Configuration configuration : configurationArr) {
            this.e.put(Integer.valueOf(configuration.a), configuration);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Configurations) {
            Configurations configurations = (Configurations) obj;
            if (rqr.i(this.a, configurations.a) && rqr.i(this.c, configurations.c) && this.e.equals(configurations.e) && this.f == configurations.f && Arrays.equals(this.b, configurations.b) && this.g == configurations.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.e, Boolean.valueOf(this.f), this.b, Long.valueOf(this.g)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.a);
        sb.append("', '");
        sb.append(this.c);
        sb.append("', (");
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            sb.append((Configuration) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f);
        sb.append(", ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.F(parcel, 3, this.c);
        qip.I(parcel, 4, this.d, i);
        qip.o(parcel, 5, this.f);
        qip.w(parcel, 6, this.b);
        qip.t(parcel, 7, this.g);
        qip.n(parcel, m);
    }
}
