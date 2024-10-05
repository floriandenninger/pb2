package defpackage;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bajn implements Serializable {
    public static final bajn a = new banr("UTC", "UTC", 0, 0);
    public static Set b = null;
    public static banq d = null;
    private static bans e = null;
    private static volatile bajn f = null;
    private static bamc g = null;
    private static Map h = null;
    private static Map i = null;
    private static final long serialVersionUID = 5546345482340108586L;
    public final String c;

    /* JADX WARN: Removed duplicated region for block: B:40:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    static {
        /*
            banr r0 = new banr
            java.lang.String r1 = "UTC"
            r2 = 0
            r0.<init>(r1, r1, r2, r2)
            defpackage.bajn.a = r0
            r0 = 0
            java.lang.String r2 = "org.joda.time.DateTimeZone.Provider"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.SecurityException -> L2a
            if (r2 == 0) goto L2a
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L1e java.lang.SecurityException -> L2a
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.Exception -> L1e java.lang.SecurityException -> L2a
            bans r2 = (defpackage.bans) r2     // Catch: java.lang.Exception -> L1e java.lang.SecurityException -> L2a
            goto L2b
        L1e:
            r2 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.SecurityException -> L2a
            java.lang.ThreadGroup r4 = r3.getThreadGroup()     // Catch: java.lang.SecurityException -> L2a
            r4.uncaughtException(r3, r2)     // Catch: java.lang.SecurityException -> L2a
        L2a:
            r2 = r0
        L2b:
            if (r2 != 0) goto L40
            banu r3 = new banu     // Catch: java.lang.Exception -> L34
            r3.<init>()     // Catch: java.lang.Exception -> L34
            r2 = r3
            goto L40
        L34:
            r3 = move-exception
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.ThreadGroup r5 = r4.getThreadGroup()
            r5.uncaughtException(r4, r3)
        L40:
            if (r2 != 0) goto L47
            bant r2 = new bant
            r2.<init>()
        L47:
            java.util.Set r3 = r2.a()
            if (r3 == 0) goto La5
            int r4 = r3.size()
            if (r4 == 0) goto La5
            boolean r4 = r3.contains(r1)
            if (r4 == 0) goto L9d
            bajn r4 = defpackage.bajn.a
            bajn r1 = r2.b(r1)
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L95
            defpackage.bajn.e = r2
            defpackage.bajn.b = r3
            java.lang.String r1 = "org.joda.time.DateTimeZone.NameProvider"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.SecurityException -> L8a
            if (r1 == 0) goto L8b
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L7d java.lang.SecurityException -> L8a
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> L7d java.lang.SecurityException -> L8a
            banq r1 = (defpackage.banq) r1     // Catch: java.lang.Exception -> L7d java.lang.SecurityException -> L8a
            r0 = r1
            goto L8b
        L7d:
            r1 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.SecurityException -> L8a
            java.lang.ThreadGroup r3 = r2.getThreadGroup()     // Catch: java.lang.SecurityException -> L8a
            r3.uncaughtException(r2, r1)     // Catch: java.lang.SecurityException -> L8a
            goto L8b
        L8a:
        L8b:
            if (r0 != 0) goto L92
            banq r0 = new banq
            r0.<init>()
        L92:
            defpackage.bajn.d = r0
            return
        L95:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid UTC zone provided"
            r0.<init>(r1)
            throw r0
        L9d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The provider doesn't support UTC"
            r0.<init>(r1)
            throw r0
        La5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The provider doesn't have any available ids"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bajn.<clinit>():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public bajn(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Id must not be null");
        }
        this.c = str;
    }

    public static String h(int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i2 >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i2 = -i2;
        }
        int i3 = i2 / 3600000;
        bamx.d(stringBuffer, i3, 2);
        int i4 = i2 - (i3 * 3600000);
        int i5 = i4 / 60000;
        stringBuffer.append(':');
        bamx.d(stringBuffer, i5, 2);
        int i6 = i4 - (i5 * 60000);
        if (i6 == 0) {
            return stringBuffer.toString();
        }
        int i7 = i6 / 1000;
        stringBuffer.append(':');
        bamx.d(stringBuffer, i7, 2);
        int i8 = i6 - (i7 * 1000);
        if (i8 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        bamx.d(stringBuffer, i8, 3);
        return stringBuffer.toString();
    }

    public static bajn i(String str) {
        if (str == null) {
            return k();
        }
        if (str.equals("UTC")) {
            return a;
        }
        bajn b2 = e.b(str);
        if (b2 != null) {
            return b2;
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            int o = o(str);
            return ((long) o) == 0 ? a : q(h(o), o);
        }
        StringBuilder sb = new StringBuilder(str.length() + 41);
        sb.append("The datetime zone id '");
        sb.append(str);
        sb.append("' is not recognised");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab A[Catch: all -> 0x00b1, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0007, B:10:0x000c, B:12:0x0014, B:19:0x001f, B:21:0x0025, B:16:0x00ab, B:17:0x00ad, B:22:0x002b, B:24:0x0037, B:25:0x003a, B:27:0x0040, B:29:0x0048, B:32:0x0052, B:34:0x005e, B:36:0x0066, B:38:0x0076, B:39:0x0079, B:40:0x0082, B:41:0x00a7, B:48:0x00af), top: B:5:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bajn k() {
        /*
            bajn r0 = defpackage.bajn.f
            if (r0 != 0) goto Lb4
            java.lang.Class<bajn> r1 = defpackage.bajn.class
            monitor-enter(r1)
            bajn r0 = defpackage.bajn.f     // Catch: java.lang.Throwable -> Lb1
            if (r0 != 0) goto Laf
            r0 = 0
            java.lang.String r2 = "user.timezone"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.RuntimeException -> L1c java.lang.Throwable -> Lb1
            if (r2 == 0) goto L1c
            bajn r2 = i(r2)     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.RuntimeException -> L1c java.lang.Throwable -> Lb1
            goto L1d
        L19:
            goto La9
        L1c:
            r2 = r0
        L1d:
            if (r2 != 0) goto La8
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            if (r3 != 0) goto L2b
            bajn r0 = k()     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            goto La9
        L2b:
            java.lang.String r4 = r3.getID()     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            java.lang.String r5 = "UTC"
            boolean r5 = r4.equals(r5)     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            if (r5 == 0) goto L3a
            bajn r0 = defpackage.bajn.a     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            goto La9
        L3a:
            java.lang.String r5 = p(r4)     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            if (r5 == 0) goto L46
            bans r0 = defpackage.bajn.e     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            bajn r0 = r0.b(r5)     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
        L46:
            if (r0 != 0) goto L4e
            bans r0 = defpackage.bajn.e     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            bajn r0 = r0.b(r4)     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
        L4e:
            if (r0 != 0) goto La9
            if (r5 != 0) goto L82
            java.lang.String r0 = r3.getID()     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            java.lang.String r3 = "GMT+"
            boolean r3 = r0.startsWith(r3)     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            if (r3 != 0) goto L66
            java.lang.String r3 = "GMT-"
            boolean r3 = r0.startsWith(r3)     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            if (r3 == 0) goto L82
        L66:
            r3 = 3
            java.lang.String r0 = r0.substring(r3)     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            int r0 = o(r0)     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            long r3 = (long) r0     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L79
            bajn r0 = defpackage.bajn.a     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            goto La9
        L79:
            java.lang.String r3 = h(r0)     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            bajn r0 = q(r3, r0)     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            goto La9
        L82:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            int r3 = r3.length()     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            int r3 = r3 + 41
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            r5.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            java.lang.String r3 = "The datetime zone id '"
            r5.append(r3)     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            r5.append(r4)     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            java.lang.String r3 = "' is not recognised"
            r5.append(r3)     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            java.lang.String r3 = r5.toString()     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
            throw r0     // Catch: java.lang.IllegalArgumentException -> La8 java.lang.Throwable -> Lb1
        La8:
            r0 = r2
        La9:
            if (r0 != 0) goto Lad
            bajn r0 = defpackage.bajn.a     // Catch: java.lang.Throwable -> Lb1
        Lad:
            defpackage.bajn.f = r0     // Catch: java.lang.Throwable -> Lb1
        Laf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb1
            goto Lb4
        Lb1:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb1
            throw r0
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bajn.k():bajn");
    }

    private static int o(String str) {
        bajl bajlVar = new bajl();
        bamc r = r();
        if (r.c != bajlVar) {
            r = new bamc(r.a, r.b, bajlVar, r.d);
        }
        bams bamsVar = r.b;
        if (bamsVar == null) {
            throw new UnsupportedOperationException("Parsing not supported");
        }
        bamv bamvVar = new bamv(r.b(r.c));
        int c = bamsVar.c(bamvVar, str, 0);
        if (c < 0) {
            c ^= -1;
        } else if (c >= str.length()) {
            return -((int) bamvVar.g(str));
        }
        throw new IllegalArgumentException(bamx.c(str, c));
    }

    private static synchronized String p(String str) {
        String str2;
        synchronized (bajn.class) {
            Map map = i;
            if (map == null) {
                map = new HashMap();
                map.put("GMT", "UTC");
                map.put("WET", "WET");
                map.put("CET", "CET");
                map.put("MET", "CET");
                map.put("ECT", "CET");
                map.put("EET", "EET");
                map.put("MIT", "Pacific/Apia");
                map.put("HST", "Pacific/Honolulu");
                map.put("AST", "America/Anchorage");
                map.put("PST", "America/Los_Angeles");
                map.put("MST", "America/Denver");
                map.put("PNT", "America/Phoenix");
                map.put("CST", "America/Chicago");
                map.put("EST", "America/New_York");
                map.put("IET", "America/Indiana/Indianapolis");
                map.put("PRT", "America/Puerto_Rico");
                map.put("CNT", "America/St_Johns");
                map.put("AGT", "America/Argentina/Buenos_Aires");
                map.put("BET", "America/Sao_Paulo");
                map.put("ART", "Africa/Cairo");
                map.put("CAT", "Africa/Harare");
                map.put("EAT", "Africa/Addis_Ababa");
                map.put("NET", "Asia/Yerevan");
                map.put("PLT", "Asia/Karachi");
                map.put("IST", "Asia/Kolkata");
                map.put("BST", "Asia/Dhaka");
                map.put("VST", "Asia/Ho_Chi_Minh");
                map.put("CTT", "Asia/Shanghai");
                map.put("JST", "Asia/Tokyo");
                map.put("ACT", "Australia/Darwin");
                map.put("AET", "Australia/Sydney");
                map.put("SST", "Pacific/Guadalcanal");
                map.put("NST", "Pacific/Auckland");
                i = map;
            }
            str2 = (String) map.get(str);
        }
        return str2;
    }

    private static synchronized bajn q(String str, int i2) {
        bajn bajnVar;
        synchronized (bajn.class) {
            if (i2 == 0) {
                return a;
            }
            if (h == null) {
                h = new HashMap();
            }
            Reference reference = (Reference) h.get(str);
            if (reference != null && (bajnVar = (bajn) reference.get()) != null) {
                return bajnVar;
            }
            banr banrVar = new banr(str, null, i2, i2);
            h.put(str, new SoftReference(banrVar));
            return banrVar;
        }
    }

    private static synchronized bamc r() {
        bamc bamcVar;
        synchronized (bajn.class) {
            if (g == null) {
                bamr bamrVar = new bamr();
                bamrVar.s(null, true, 4);
                g = bamrVar.a();
            }
            bamcVar = g;
        }
        return bamcVar;
    }

    public abstract int a(long j);

    public int b(long j) {
        int a2 = a(j);
        long j2 = j - a2;
        int a3 = a(j2);
        if (a2 != a3) {
            if (a2 - a3 < 0 && e(j2) != e(j - a3)) {
                return a2;
            }
        } else if (a2 >= 0) {
            long f2 = f(j2);
            if (f2 < j2) {
                int a4 = a(f2);
                if (j2 - f2 <= a4 - a2) {
                    return a4;
                }
            }
        }
        return a3;
    }

    public abstract int c(long j);

    public final long d(long j) {
        long a2 = a(j);
        long j2 = j + a2;
        if ((j ^ j2) >= 0 || (j ^ a2) < 0) {
            return j2;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public abstract long e(long j);

    public abstract boolean equals(Object obj);

    public abstract long f(long j);

    public abstract String g(long j);

    public int hashCode() {
        return this.c.hashCode() + 57;
    }

    public abstract boolean l();

    public final boolean m(long j) {
        return a(j) == c(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r2 != (r6 != r0 ? r6 : Long.MAX_VALUE)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long n(long r10, long r12) {
        /*
            r9 = this;
            int r12 = r9.a(r12)
            long r0 = (long) r12
            long r0 = r10 - r0
            int r13 = r9.a(r0)
            if (r13 == r12) goto L56
            int r12 = r9.a(r10)
            long r0 = (long) r12
            long r0 = r10 - r0
            int r13 = r9.a(r0)
            if (r12 == r13) goto L3c
            if (r12 >= 0) goto L3c
            long r2 = r9.e(r0)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L2a
            r2 = r4
        L2a:
            long r0 = (long) r13
            long r0 = r10 - r0
            long r6 = r9.e(r0)
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 != 0) goto L36
            goto L37
        L36:
            r4 = r6
        L37:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L3c
            goto L3d
        L3c:
            r12 = r13
        L3d:
            long r12 = (long) r12
            long r0 = r10 - r12
            long r2 = r10 ^ r0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L56
            long r10 = r10 ^ r12
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 < 0) goto L4e
            goto L56
        L4e:
            java.lang.ArithmeticException r10 = new java.lang.ArithmeticException
            java.lang.String r11 = "Subtracting time zone offset caused overflow"
            r10.<init>(r11)
            throw r10
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bajn.n(long, long):long");
    }

    public final String toString() {
        return this.c;
    }

    protected Object writeReplace() {
        return new bajm(this.c);
    }

    public static bajn j(int i2) {
        if (i2 < -86399999 || i2 > 86399999) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Millis out of range: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        return q(h(i2), i2);
    }
}
