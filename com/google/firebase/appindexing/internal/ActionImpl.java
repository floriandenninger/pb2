package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.alsz;
import defpackage.amkq;
import defpackage.qip;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ActionImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alsz(7);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final MetadataImpl e;
    public final String f;
    public final Bundle g;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class MetadataImpl extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new alsz(10);
        public int a;
        public final boolean b;
        public final String c;
        public final String d;
        public final byte[] e;
        public final boolean f;

        public MetadataImpl(int i, boolean z, String str, String str2, byte[] bArr, boolean z2) {
            this.a = i;
            this.b = z;
            this.c = str;
            this.d = str2;
            this.e = bArr;
            this.f = z2;
        }

        public MetadataImpl(boolean z, String str) {
            this.a = 0;
            this.b = z;
            this.c = null;
            this.d = str;
            this.e = null;
            this.f = false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MetadataImpl { { eventStatus: '");
            sb.append(this.a);
            sb.append("' } { uploadable: '");
            sb.append(this.b);
            sb.append("' } ");
            if (this.c != null) {
                sb.append("{ completionToken: '");
                sb.append(this.c);
                sb.append("' } ");
            }
            if (this.d != null) {
                sb.append("{ accountName: '");
                sb.append(this.d);
                sb.append("' } ");
            }
            if (this.e != null) {
                sb.append("{ ssbContext: [ ");
                for (byte b : this.e) {
                    sb.append("0x");
                    sb.append(Integer.toHexString(b));
                    sb.append(" ");
                }
                sb.append("] } ");
            }
            sb.append("{ contextOnly: '");
            sb.append(this.f);
            sb.append("' } }");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int m = qip.m(parcel);
            qip.s(parcel, 1, this.a);
            qip.o(parcel, 2, this.b);
            qip.F(parcel, 3, this.c);
            qip.F(parcel, 4, this.d);
            qip.w(parcel, 5, this.e);
            qip.o(parcel, 6, this.f);
            qip.n(parcel, m);
        }
    }

    public ActionImpl(String str, String str2, String str3, String str4, MetadataImpl metadataImpl, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = metadataImpl;
        this.f = str5;
        if (bundle != null) {
            this.g = bundle;
        } else {
            this.g = Bundle.EMPTY;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        amkq.u(classLoader);
        this.g.setClassLoader(classLoader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActionImpl { { actionType: '");
        sb.append(this.a);
        sb.append("' } { objectName: '");
        sb.append(this.b);
        sb.append("' } { objectUrl: '");
        sb.append(this.c);
        sb.append("' } ");
        if (this.d != null) {
            sb.append("{ objectSameAs: '");
            sb.append(this.d);
            sb.append("' } ");
        }
        if (this.e != null) {
            sb.append("{ metadata: '");
            sb.append(this.e.toString());
            sb.append("' } ");
        }
        if (this.f != null) {
            sb.append("{ actionStatus: '");
            sb.append(this.f);
            sb.append("' } ");
        }
        if (!this.g.isEmpty()) {
            sb.append("{ ");
            sb.append(this.g);
            sb.append(" } ");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.F(parcel, 3, this.c);
        qip.F(parcel, 4, this.d);
        qip.E(parcel, 5, this.e, i);
        qip.F(parcel, 6, this.f);
        qip.v(parcel, 7, this.g);
        qip.n(parcel, m);
    }
}
