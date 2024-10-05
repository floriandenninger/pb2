package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qar;
import defpackage.qip;
import defpackage.rls;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdpDataPlanStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private static final Map t;
    private static final Map u;
    public String a;
    public String b;
    public String c;
    public long d;
    public long e;
    public MdpFlexTimeWindow[] f;
    public int g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int l;
    public List m;
    public long n;
    public long o;
    public long p;
    public String q;
    public String r;
    public boolean s;

    static {
        HashMap hashMap = new HashMap();
        t = hashMap;
        hashMap.put(0, "UNSPECIFIED");
        hashMap.put(1, "THROTTLED");
        hashMap.put(2, "BLOCKED");
        hashMap.put(3, "PAY_AS_YOU_GO");
        u = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            u.put((String) entry.getValue(), (Integer) entry.getKey());
        }
        CREATOR = new rls();
    }

    private MdpDataPlanStatus() {
        this.s = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdpDataPlanStatus mdpDataPlanStatus = (MdpDataPlanStatus) obj;
            if (qar.j(this.a, mdpDataPlanStatus.a) && qar.j(this.b, mdpDataPlanStatus.b) && qar.j(this.c, mdpDataPlanStatus.c) && qar.j(Long.valueOf(this.d), Long.valueOf(mdpDataPlanStatus.d)) && qar.j(Long.valueOf(this.e), Long.valueOf(mdpDataPlanStatus.e)) && Arrays.equals(this.f, mdpDataPlanStatus.f) && qar.j(Integer.valueOf(this.g), Integer.valueOf(mdpDataPlanStatus.g)) && qar.j(Long.valueOf(this.n), Long.valueOf(mdpDataPlanStatus.n)) && qar.j(Long.valueOf(this.o), Long.valueOf(mdpDataPlanStatus.o)) && qar.j(Long.valueOf(this.p), Long.valueOf(mdpDataPlanStatus.p)) && qar.j(this.q, mdpDataPlanStatus.q) && qar.j(this.h, mdpDataPlanStatus.h) && qar.j(this.r, mdpDataPlanStatus.r) && qar.j(this.i, mdpDataPlanStatus.i) && qar.j(Boolean.valueOf(this.s), Boolean.valueOf(mdpDataPlanStatus.s)) && qar.j(this.j, mdpDataPlanStatus.j) && qar.j(this.k, mdpDataPlanStatus.k) && qar.j(Integer.valueOf(this.l), Integer.valueOf(mdpDataPlanStatus.l)) && qar.j(this.m, mdpDataPlanStatus.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), this.h, this.i, this.j, this.k, Integer.valueOf(this.l), this.m})), Integer.valueOf(Arrays.hashCode(this.f))})), Integer.valueOf(this.g), Long.valueOf(this.n), Long.valueOf(this.o), Long.valueOf(this.p), this.q, this.r, Boolean.valueOf(this.s)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qar.l("PlanName", this.a, arrayList);
        qar.l("ExpirationTime", this.b, arrayList);
        qar.l("TrafficCategory", this.c, arrayList);
        qar.l("QuotaBytes", Long.valueOf(this.d), arrayList);
        qar.l("QuotaMinutes", Long.valueOf(this.e), arrayList);
        qar.l("FlexTimeWindows", Arrays.toString(this.f), arrayList);
        int i = this.g;
        String str = (String) t.get(Integer.valueOf(i));
        if (str == null) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("Illegal overusage policy string: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        qar.l("OverUsagePolicy", str, arrayList);
        qar.l("RemainingBytes", Long.valueOf(this.o), arrayList);
        qar.l("RemainingMinutes", Long.valueOf(this.p), arrayList);
        qar.l("ShortDescription", this.j, arrayList);
        qar.l("DisplayRefreshPeriod", this.k, arrayList);
        qar.l("PlanType", Integer.valueOf(this.l), arrayList);
        qar.l("Pmtcs", this.m, arrayList);
        qar.l("SnapshotTime", Long.valueOf(this.n), arrayList);
        qar.l("Description", this.q, arrayList);
        qar.l("PlanId", this.h, arrayList);
        qar.l("Balance", this.r, arrayList);
        qar.l("ModuleName", this.i, arrayList);
        qar.l("IsActive", Boolean.valueOf(this.s), arrayList);
        return qar.k(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.F(parcel, 3, this.c);
        qip.t(parcel, 4, this.d);
        qip.t(parcel, 5, this.e);
        qip.I(parcel, 6, this.f, i);
        qip.s(parcel, 7, this.g);
        qip.F(parcel, 8, this.h);
        qip.F(parcel, 9, this.i);
        qip.F(parcel, 10, this.j);
        qip.F(parcel, 11, this.k);
        qip.s(parcel, 12, this.l);
        qip.A(parcel, 13, this.m);
        qip.t(parcel, 20, this.n);
        qip.t(parcel, 21, this.o);
        qip.t(parcel, 22, this.p);
        qip.F(parcel, 23, this.q);
        qip.F(parcel, 24, this.r);
        qip.o(parcel, 25, this.s);
        qip.n(parcel, m);
    }

    public MdpDataPlanStatus(String str, String str2, String str3, long j, long j2, MdpFlexTimeWindow[] mdpFlexTimeWindowArr, int i, String str4, String str5, String str6, String str7, int i2, List list, long j3, long j4, long j5, String str8, String str9, boolean z) {
        this.s = true;
        this.a = str;
        this.h = str4;
        this.i = str5;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = mdpFlexTimeWindowArr;
        if (t.keySet().contains(Integer.valueOf(i))) {
            this.g = i;
            this.n = j3;
            this.o = j4;
            this.p = j5;
            this.q = str8;
            this.r = str9;
            this.j = str6;
            this.s = z;
            this.k = str7;
            this.l = i2;
            this.m = list;
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Illegal overusage policy: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
