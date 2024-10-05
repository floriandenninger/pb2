package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bajj implements Serializable {
    private static final long serialVersionUID = -42615285973990L;
    public final String z;
    public static final bajj c = new baji("era", (byte) 1, bajr.a, null);
    public static final bajj d = new baji("yearOfEra", (byte) 2, bajr.d, bajr.a);
    public static final bajj e = new baji("centuryOfEra", (byte) 3, bajr.b, bajr.a);
    public static final bajj f = new baji("yearOfCentury", (byte) 4, bajr.d, bajr.b);
    public static final bajj g = new baji("year", (byte) 5, bajr.d, null);
    public static final bajj h = new baji("dayOfYear", (byte) 6, bajr.g, bajr.d);
    public static final bajj i = new baji("monthOfYear", (byte) 7, bajr.e, bajr.d);
    public static final bajj j = new baji("dayOfMonth", (byte) 8, bajr.g, bajr.e);
    public static final bajj k = new baji("weekyearOfCentury", (byte) 9, bajr.c, bajr.b);
    public static final bajj l = new baji("weekyear", (byte) 10, bajr.c, null);
    public static final bajj m = new baji("weekOfWeekyear", (byte) 11, bajr.f, bajr.c);
    public static final bajj n = new baji("dayOfWeek", (byte) 12, bajr.g, bajr.f);
    public static final bajj o = new baji("halfdayOfDay", (byte) 13, bajr.h, bajr.g);
    public static final bajj p = new baji("hourOfHalfday", (byte) 14, bajr.i, bajr.h);
    public static final bajj q = new baji("clockhourOfHalfday", (byte) 15, bajr.i, bajr.h);
    public static final bajj r = new baji("clockhourOfDay", (byte) 16, bajr.i, bajr.g);
    public static final bajj s = new baji("hourOfDay", (byte) 17, bajr.i, bajr.g);
    public static final bajj t = new baji("minuteOfDay", (byte) 18, bajr.j, bajr.g);
    public static final bajj u = new baji("minuteOfHour", (byte) 19, bajr.j, bajr.i);
    public static final bajj v = new baji("secondOfDay", (byte) 20, bajr.k, bajr.g);
    public static final bajj w = new baji("secondOfMinute", (byte) 21, bajr.k, bajr.j);
    public static final bajj x = new baji("millisOfDay", (byte) 22, bajr.l, bajr.g);
    public static final bajj y = new baji("millisOfSecond", (byte) 23, bajr.l, bajr.k);

    /* JADX INFO: Access modifiers changed from: protected */
    public bajj(String str) {
        this.z = str;
    }

    public abstract bajh a(bajf bajfVar);

    public final String toString() {
        return this.z;
    }
}
