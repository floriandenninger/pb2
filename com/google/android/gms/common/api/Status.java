package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qar;
import defpackage.qip;
import defpackage.qmu;
import defpackage.qom;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable, qom {
    public static final Parcelable.Creator CREATOR;
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    final int f;
    public final int g;
    public final String h;
    public final PendingIntent i;
    public final ConnectionResult j;

    static {
        new Status(17);
        new Status(18);
        CREATOR = new qmu(7);
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f = i;
        this.g = i2;
        this.h = str;
        this.i = pendingIntent;
        this.j = connectionResult;
    }

    @Override // defpackage.qom
    public final Status a() {
        return this;
    }

    public final String b() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        int i = this.g;
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unknown status code: ");
                sb.append(i);
                return sb.toString();
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public final boolean c() {
        return this.g <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f == status.f && this.g == status.g && qar.j(this.h, status.h) && qar.j(this.i, status.i) && qar.j(this.j, status.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.g), this.h, this.i, this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qar.l("statusCode", b(), arrayList);
        qar.l("resolution", this.i, arrayList);
        return qar.k(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.g);
        qip.F(parcel, 2, this.h);
        qip.E(parcel, 3, this.i, i);
        qip.E(parcel, 4, this.j, i);
        qip.s(parcel, 1000, this.f);
        qip.n(parcel, m);
    }

    public Status(int i, String str, PendingIntent pendingIntent, byte[] bArr) {
        this(1, i, str, pendingIntent, null);
    }

    public Status(int i, String str) {
        this(i, str, null, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(i, str, pendingIntent, null);
    }

    @Deprecated
    public Status(ConnectionResult connectionResult, String str, int i) {
        this(1, i, str, connectionResult.d, connectionResult);
    }
}
