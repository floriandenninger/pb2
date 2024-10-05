package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qar;
import defpackage.qip;
import defpackage.rot;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConsentInformation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;
    public boolean b;
    private List c;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class AccountConsentInformation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new rot(4);
        public final String a;
        public final byte[] b;
        public List c;

        public AccountConsentInformation(String str, byte[] bArr, List list) {
            this.a = str;
            this.b = bArr;
            this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccountConsentInformation)) {
                return false;
            }
            AccountConsentInformation accountConsentInformation = (AccountConsentInformation) obj;
            return qar.j(this.a, accountConsentInformation.a) && qar.j(this.b, accountConsentInformation.b) && qar.j(this.c, accountConsentInformation.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int m = qip.m(parcel);
            qip.F(parcel, 1, this.a);
            qip.w(parcel, 2, this.b);
            qip.A(parcel, 3, new ArrayList(this.c));
            qip.n(parcel, m);
        }
    }

    static {
        new ConsentInformation(null, false, false);
        CREATOR = new rot(5);
    }

    public ConsentInformation(List list, boolean z, boolean z2) {
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentInformation)) {
            return false;
        }
        ConsentInformation consentInformation = (ConsentInformation) obj;
        return qar.j(this.c, consentInformation.c) && qar.j(Boolean.valueOf(this.a), Boolean.valueOf(consentInformation.a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.J(parcel, 1, new ArrayList(this.c));
        qip.o(parcel, 2, this.a);
        qip.o(parcel, 3, this.b);
        qip.n(parcel, m);
    }
}
