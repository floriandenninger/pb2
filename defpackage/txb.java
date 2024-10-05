package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class txb {
    public final String a;
    public final Long b;
    public final Long c;
    public final aokd d;
    public final List e;
    public final Long f;
    public final String g;
    public final aols h;
    public final String i;
    public final String j;
    public final Long k;
    public final Long l;
    public final aoky m;
    public final List n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;

    public txb() {
    }

    public txb(String str, int i, int i2, int i3, int i4, Long l, Long l2, aokd aokdVar, List list, Long l3, String str2, aols aolsVar, String str3, String str4, Long l4, Long l5, int i5, aoky aokyVar, List list2) {
        this.a = str;
        this.o = i;
        this.p = i2;
        this.q = i3;
        this.r = i4;
        this.b = l;
        this.c = l2;
        this.d = aokdVar;
        this.e = list;
        this.f = l3;
        this.g = str2;
        this.h = aolsVar;
        this.i = str3;
        this.j = str4;
        this.k = l4;
        this.l = l5;
        this.s = i5;
        this.m = aokyVar;
        this.n = list2;
    }

    public static final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            txb txbVar = (txb) it.next();
            aone createBuilder = aojv.a.createBuilder();
            String str = txbVar.a;
            createBuilder.copyOnWrite();
            aojv aojvVar = (aojv) createBuilder.instance;
            str.getClass();
            aojvVar.b |= 1;
            aojvVar.c = str;
            long longValue = txbVar.b.longValue();
            createBuilder.copyOnWrite();
            aojv aojvVar2 = (aojv) createBuilder.instance;
            aojvVar2.b |= 2;
            aojvVar2.d = longValue;
            long longValue2 = txbVar.f.longValue();
            createBuilder.copyOnWrite();
            aojv aojvVar3 = (aojv) createBuilder.instance;
            aojvVar3.b |= 4;
            aojvVar3.e = longValue2;
            arrayList.add((aojv) createBuilder.build());
        }
        return arrayList;
    }

    public static tws b() {
        tws twsVar = new tws();
        twsVar.c(aokd.a);
        twsVar.i(1);
        twsVar.h(1);
        twsVar.g(1);
        twsVar.k(1);
        twsVar.a = 0L;
        twsVar.b = 0L;
        twsVar.g = 0L;
        twsVar.c = 0L;
        twsVar.d("chime_default_group");
        twsVar.h = 0L;
        twsVar.f(Collections.emptyList());
        twsVar.b(Collections.emptyList());
        twsVar.j(1);
        return twsVar;
    }

    public final tws c() {
        return new tws(this);
    }

    public final boolean equals(Object obj) {
        String str;
        aols aolsVar;
        String str2;
        aoky aokyVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof txb) {
            txb txbVar = (txb) obj;
            if (this.a.equals(txbVar.a)) {
                int i = this.o;
                int i2 = txbVar.o;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.p;
                    int i4 = txbVar.p;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4) {
                        int i5 = this.q;
                        int i6 = txbVar.q;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i5 == i6) {
                            int i7 = this.r;
                            int i8 = txbVar.r;
                            if (i7 == 0) {
                                throw null;
                            }
                            if (i7 == i8 && this.b.equals(txbVar.b) && this.c.equals(txbVar.c) && this.d.equals(txbVar.d) && this.e.equals(txbVar.e) && this.f.equals(txbVar.f) && ((str = this.g) != null ? str.equals(txbVar.g) : txbVar.g == null) && ((aolsVar = this.h) != null ? aolsVar.equals(txbVar.h) : txbVar.h == null) && ((str2 = this.i) != null ? str2.equals(txbVar.i) : txbVar.i == null) && this.j.equals(txbVar.j) && this.k.equals(txbVar.k) && this.l.equals(txbVar.l)) {
                                int i9 = this.s;
                                int i10 = txbVar.s;
                                if (i9 == 0) {
                                    throw null;
                                }
                                if (i9 == i10 && ((aokyVar = this.m) != null ? aokyVar.equals(txbVar.m) : txbVar.m == null) && this.n.equals(txbVar.n)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.o;
        aobq.v(i);
        int i2 = this.p;
        aobq.y(i2);
        int i3 = this.q;
        aobq.B(i3);
        int i4 = this.r;
        aobq.q(i4);
        int hashCode2 = (((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        String str = this.g;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        aols aolsVar = this.h;
        int hashCode4 = (hashCode3 ^ (aolsVar == null ? 0 : aolsVar.hashCode())) * 1000003;
        String str2 = this.i;
        int hashCode5 = (((((((hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003;
        int i5 = this.s;
        if (i5 == 0) {
            throw null;
        }
        int i6 = (hashCode5 ^ i5) * 1000003;
        aoky aokyVar = this.m;
        return ((i6 ^ (aokyVar != null ? aokyVar.hashCode() : 0)) * 1000003) ^ this.n.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = this.o;
        String u = i != 0 ? aobq.u(i) : "null";
        int i2 = this.p;
        String x = i2 != 0 ? aobq.x(i2) : "null";
        int i3 = this.q;
        String A = i3 != 0 ? aobq.A(i3) : "null";
        int i4 = this.r;
        String p = i4 != 0 ? aobq.p(i4) : "null";
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String str2 = this.g;
        String valueOf6 = String.valueOf(this.h);
        String str3 = this.i;
        String str4 = this.j;
        String valueOf7 = String.valueOf(this.k);
        String valueOf8 = String.valueOf(this.l);
        int i5 = this.s;
        String num = i5 != 0 ? Integer.toString(i5 - 1) : "null";
        String valueOf9 = String.valueOf(this.m);
        String valueOf10 = String.valueOf(this.n);
        int length = String.valueOf(str).length();
        int length2 = u.length();
        int length3 = x.length();
        int length4 = A.length();
        int length5 = p.length();
        int length6 = String.valueOf(valueOf).length();
        int length7 = String.valueOf(valueOf2).length();
        int length8 = String.valueOf(valueOf3).length();
        int length9 = String.valueOf(valueOf4).length();
        int length10 = String.valueOf(valueOf5).length();
        int length11 = String.valueOf(str2).length();
        int length12 = String.valueOf(valueOf6).length();
        int length13 = String.valueOf(str3).length();
        int length14 = String.valueOf(str4).length();
        int length15 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 330 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + String.valueOf(valueOf8).length() + num.length() + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length());
        sb.append("ChimeThread{id=");
        sb.append(str);
        sb.append(", readState=");
        sb.append(u);
        sb.append(", deletionStatus=");
        sb.append(x);
        sb.append(", countBehavior=");
        sb.append(A);
        sb.append(", systemTrayBehavior=");
        sb.append(p);
        sb.append(", lastUpdatedVersion=");
        sb.append(valueOf);
        sb.append(", lastNotificationVersion=");
        sb.append(valueOf2);
        sb.append(", androidSdkMessage=");
        sb.append(valueOf3);
        sb.append(", notificationMetadataList=");
        sb.append(valueOf4);
        sb.append(", creationId=");
        sb.append(valueOf5);
        sb.append(", payloadType=");
        sb.append(str2);
        sb.append(", payload=");
        sb.append(valueOf6);
        sb.append(", updateThreadStateToken=");
        sb.append(str3);
        sb.append(", groupId=");
        sb.append(str4);
        sb.append(", expirationTimestampUsec=");
        sb.append(valueOf7);
        sb.append(", insertionTimeMs=");
        sb.append(valueOf8);
        sb.append(", storageMode=");
        sb.append(num);
        sb.append(", schedule=");
        sb.append(valueOf9);
        sb.append(", actionList=");
        sb.append(valueOf10);
        sb.append("}");
        return sb.toString();
    }
}
