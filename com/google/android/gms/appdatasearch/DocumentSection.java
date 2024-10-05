package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.pvl;
import defpackage.qcn;
import defpackage.qco;
import defpackage.qip;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DocumentSection extends AbstractSafeParcelable {
    public final String b;
    final RegisterSectionInfo c;
    public final int d;
    public final byte[] e;
    public static final int a = Integer.parseInt("-1");
    public static final Parcelable.Creator CREATOR = new pvl(17);

    static {
        qco qcoVar = new qco();
        qcoVar.b = "blob";
        String str = qcoVar.a;
        String str2 = qcoVar.b;
        List list = qcoVar.c;
        new RegisterSectionInfo(str, str2, true, 1, false, null, (Feature[]) list.toArray(new Feature[list.size()]), null, null);
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo, int i, byte[] bArr) {
        int i2 = a;
        boolean z = true;
        if (i != i2 && qcn.a(i) == null) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid section type ");
        sb.append(i);
        qip.ap(z, sb.toString());
        this.b = str;
        this.c = registerSectionInfo;
        this.d = i;
        this.e = bArr;
        String str2 = null;
        if (i != i2 && qcn.a(i) == null) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Invalid section type ");
            sb2.append(i);
            str2 = sb2.toString();
        } else if (str != null && bArr != null) {
            str2 = "Both content and blobContent set";
        }
        if (str2 != null) {
            throw new IllegalArgumentException(str2);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.b);
        qip.E(parcel, 3, this.c, i);
        qip.s(parcel, 4, this.d);
        qip.w(parcel, 5, this.e);
        qip.n(parcel, m);
    }
}
