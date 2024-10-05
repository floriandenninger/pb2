package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.pvl;
import defpackage.qar;
import defpackage.qip;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DocumentContents extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pvl(15);
    final DocumentSection[] a;
    public final String b;
    public final boolean c;
    public final Account d;

    public DocumentContents(DocumentSection[] documentSectionArr, String str, boolean z, Account account) {
        this.a = documentSectionArr;
        this.b = str;
        this.c = z;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DocumentContents) {
            DocumentContents documentContents = (DocumentContents) obj;
            if (qar.j(this.b, documentContents.b) && qar.j(Boolean.valueOf(this.c), Boolean.valueOf(documentContents.c)) && qar.j(this.d, documentContents.d) && Arrays.equals(this.a, documentContents.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.I(parcel, 1, this.a, i);
        qip.F(parcel, 2, this.b);
        qip.o(parcel, 3, this.c);
        qip.E(parcel, 4, this.d, i);
        qip.n(parcel, m);
    }
}
