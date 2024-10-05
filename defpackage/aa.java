package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aa implements Cloneable {
    public static final int[] e;
    private static final int h;
    public String a;
    public ArrayList b;
    public ArrayList c;
    public boolean d;
    public final int f;
    private boolean g;

    static {
        char c;
        String a = b.a();
        int hashCode = a.hashCode();
        int i = 1;
        if (hashCode != -413919155) {
            if (hashCode == -99796978 && a.equals("DOUBLE_OPTIONAL")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (a.equals("DOUBLE_REQUIRED")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                throw new IllegalArgumentException();
            }
            i = 2;
        }
        h = i;
        e = new int[]{1, 2, 3, 4, 5, 6};
    }

    public aa() {
        this.b = new ArrayList();
        throw null;
    }

    private final int j(int i) {
        char charAt;
        while (i < this.a.length() && (((charAt = this.a.charAt(i)) >= '0' || "+-.".indexOf(charAt) >= 0) && (charAt <= '9' || charAt == 'e' || charAt == 'E' || charAt == 8734))) {
            i++;
        }
        return i;
    }

    private final int k(int i) {
        String str = this.a;
        byte[] bArr = e.a;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt > 255) {
                if (charAt >= 8206) {
                    if (charAt > 12336) {
                        if (charAt >= 64830) {
                            if (charAt <= 65094) {
                                if (charAt <= 64831 || charAt >= 65093) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (((e.c[e.b[(charAt - 8192) >> 5]] >> (charAt & 31)) & 1) != 0) {
                        break;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                if (e.a[charAt] != 0) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    private final int l(int i) {
        String str = this.a;
        byte[] bArr = e.a;
        while (i < str.length() && e.a(str.charAt(i))) {
            i++;
        }
        return i;
    }

    private final String m() {
        return o(this.a, 0);
    }

    private final String n(int i) {
        return o(this.a, i);
    }

    private static String o(String str, int i) {
        StringBuilder sb = new StringBuilder(44);
        if (i == 0) {
            sb.append("\"");
        } else {
            sb.append("[at pattern index ");
            sb.append(i);
            sb.append("] \"");
        }
        if (str.length() - i <= 24) {
            if (i != 0) {
                str = str.substring(i);
            }
            sb.append(str);
        } else {
            int i2 = i + 20;
            int i3 = i2 - 1;
            if (true == Character.isHighSurrogate(str.charAt(i3))) {
                i2 = i3;
            }
            sb.append((CharSequence) str, i, i2);
            sb.append(" ...");
        }
        sb.append("\"");
        return sb.toString();
    }

    private final void p(double d, int i, int i2) {
        int size;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            this.c = new ArrayList();
            size = 0;
        } else {
            size = arrayList.size();
            if (size > 32767) {
                throw new IndexOutOfBoundsException("Too many numeric values");
            }
        }
        this.c.add(Double.valueOf(d));
        v(14, i, i2, size);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q(int r8, int r9, boolean r10) {
        /*
            r7 = this;
            int r0 = r8 + 1
            java.lang.String r1 = r7.a
            char r1 = r1.charAt(r8)
            r2 = 0
            r3 = 1
            r4 = 45
            if (r1 != r4) goto L1e
            if (r0 != r9) goto L11
            goto L43
        L11:
            int r1 = r0 + 1
            java.lang.String r4 = r7.a
            char r0 = r4.charAt(r0)
            r4 = 1
        L1a:
            r6 = r1
            r1 = r0
            r0 = r6
            goto L2f
        L1e:
            r4 = 43
            if (r1 != r4) goto L2e
            if (r0 == r9) goto L43
            int r1 = r0 + 1
            java.lang.String r4 = r7.a
            char r0 = r4.charAt(r0)
            r4 = 0
            goto L1a
        L2e:
            r4 = 0
        L2f:
            r5 = 8734(0x221e, float:1.2239E-41)
            if (r1 != r5) goto L65
            if (r10 == 0) goto L43
            if (r0 != r9) goto L43
            if (r3 == r4) goto L3c
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L3e
        L3c:
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
        L3e:
            int r9 = r9 - r8
            r7.p(r0, r8, r9)
            return
        L43:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.String r0 = r7.a
            java.lang.String r8 = r0.substring(r8, r9)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "Bad syntax for numeric value: "
            int r0 = r8.length()
            if (r0 == 0) goto L5c
            java.lang.String r8 = r9.concat(r8)
            goto L61
        L5c:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r9)
        L61:
            r10.<init>(r8)
            throw r10
        L65:
            r10 = 48
            if (r1 < r10) goto L8d
            r10 = 57
            if (r1 > r10) goto L8d
            int r2 = r2 * 10
            int r1 = r1 + (-48)
            int r2 = r2 + r1
            int r10 = r4 + 32767
            if (r2 <= r10) goto L77
            goto L8d
        L77:
            if (r0 != r9) goto L83
            int r9 = r9 - r8
            if (r4 == 0) goto L7d
            int r2 = -r2
        L7d:
            r10 = 13
            r7.v(r10, r8, r9, r2)
            return
        L83:
            int r10 = r0 + 1
            java.lang.String r1 = r7.a
            char r1 = r1.charAt(r0)
            r0 = r10
            goto L65
        L8d:
            java.lang.String r10 = r7.a
            java.lang.String r10 = r10.substring(r8, r9)
            double r0 = java.lang.Double.parseDouble(r10)
            int r9 = r9 - r8
            r7.p(r0, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa.q(int, int, boolean):void");
    }

    private final boolean r(int i) {
        return i > 0 || ((z) this.b.get(0)).e == 1;
    }

    private final boolean s(int i) {
        int i2 = i + 1;
        char charAt = this.a.charAt(i);
        if (charAt != 's' && charAt != 'S') {
            return false;
        }
        int i3 = i2 + 1;
        char charAt2 = this.a.charAt(i2);
        if (charAt2 != 'e' && charAt2 != 'E') {
            return false;
        }
        int i4 = i3 + 1;
        char charAt3 = this.a.charAt(i3);
        if (charAt3 != 'l' && charAt3 != 'L') {
            return false;
        }
        int i5 = i4 + 1;
        char charAt4 = this.a.charAt(i4);
        if (charAt4 != 'e' && charAt4 != 'E') {
            return false;
        }
        int i6 = i5 + 1;
        char charAt5 = this.a.charAt(i5);
        if (charAt5 != 'c' && charAt5 != 'C') {
            return false;
        }
        char charAt6 = this.a.charAt(i6);
        return charAt6 == 't' || charAt6 == 'T';
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x08c8, code lost:
    
        r1 = java.lang.String.valueOf(n(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x08d6, code lost:
    
        if (r1.length() == 0) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x08d8, code lost:
    
        r1 = "Bad argument syntax: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x08e5, code lost:
    
        throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x08dd, code lost:
    
        r1 = new java.lang.String("Bad argument syntax: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x05e8, code lost:
    
        r1 = java.lang.String.valueOf(m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x05f8, code lost:
    
        if (r1.length() == 0) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x05fa, code lost:
    
        r1 = "Missing choice argument pattern in ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0607, code lost:
    
        throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x05ff, code lost:
    
        r1 = new java.lang.String("Missing choice argument pattern in ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x07b2, code lost:
    
        r1 = defpackage.d.a(r5).toLowerCase(java.util.Locale.ENGLISH);
        r2 = n(r3);
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 37) + java.lang.String.valueOf(r2).length());
        r5.append("No message fragment after ");
        r5.append(r1);
        r5.append(" selector: ");
        r5.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x07f1, code lost:
    
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0834, code lost:
    
        if (r10 == r(r21)) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0836, code lost:
    
        if (r1 == false) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0849, code lost:
    
        r1 = defpackage.d.a(r5).toLowerCase(java.util.Locale.ENGLISH);
        r2 = m();
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 39) + java.lang.String.valueOf(r2).length());
        r5.append("Missing 'other' keyword in ");
        r5.append(r1);
        r5.append(" pattern in ");
        r5.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0889, code lost:
    
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x088a, code lost:
    
        r1 = defpackage.d.a(r5).toLowerCase(java.util.Locale.ENGLISH);
        r2 = n(r12);
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 21) + java.lang.String.valueOf(r2).length());
        r5.append("Bad ");
        r5.append(r1);
        r5.append(" pattern syntax: ");
        r5.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x08c7, code lost:
    
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x015a, code lost:
    
        r1 = java.lang.String.valueOf(n(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x016a, code lost:
    
        if (r1.length() == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x016c, code lost:
    
        r1 = "Argument number too large: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0179, code lost:
    
        throw new java.lang.IndexOutOfBoundsException(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0171, code lost:
    
        r1 = new java.lang.String("Argument number too large: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0917, code lost:
    
        if (r8 != r2) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0919, code lost:
    
        if (r0 != '}') goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x091b, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x091e, code lost:
    
        r10 = r13 - 1;
        u(r9, 2, r10, r4, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x092b, code lost:
    
        if (r8 != 3) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x092d, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x092e, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x091d, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0761 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int t(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 2427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa.t(int, int, int, int):int");
    }

    private final void u(int i, int i2, int i3, int i4, int i5) {
        ((z) this.b.get(i)).d = this.b.size();
        v(i2, i3, i4, i5);
    }

    private final void v(int i, int i2, int i3, int i4) {
        this.b.add(new z(i, i2, i3, i4));
    }

    public final double a(z zVar) {
        int i = zVar.e;
        if (i == 13) {
            return zVar.c;
        }
        if (i == 14) {
            return ((Double) this.c.get(zVar.c)).doubleValue();
        }
        return -1.23456789E8d;
    }

    public final int b() {
        return this.b.size();
    }

    public final int c(int i) {
        int i2 = ((z) this.b.get(i)).d;
        return i2 < i ? i : i2;
    }

    public final Object clone() {
        return e();
    }

    public final z d(int i) {
        return (z) this.b.get(i);
    }

    public final aa e() {
        try {
            aa aaVar = (aa) super.clone();
            aaVar.b = (ArrayList) this.b.clone();
            ArrayList arrayList = this.c;
            if (arrayList != null) {
                aaVar.c = (ArrayList) arrayList.clone();
            }
            aaVar.g = false;
            return aaVar;
        } catch (CloneNotSupportedException e2) {
            throw new ab(e2);
        }
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aa aaVar = (aa) obj;
        int i = this.f;
        int i2 = aaVar.f;
        if (i != 0) {
            return i == i2 && ((str = this.a) != null ? str.equals(aaVar.a) : aaVar.a == null) && this.b.equals(aaVar.b);
        }
        throw null;
    }

    public final String f(z zVar) {
        int i = zVar.a;
        return this.a.substring(i, zVar.b + i);
    }

    public final boolean g(z zVar, String str) {
        return this.a.regionMatches(zVar.a, str, 0, zVar.b);
    }

    public final int h(int i) {
        return ((z) this.b.get(i)).e;
    }

    public final int hashCode() {
        int i = this.f;
        if (i == 0) {
            throw null;
        }
        int i2 = i * 37;
        String str = this.a;
        return ((i2 + (str != null ? str.hashCode() : 0)) * 37) + this.b.hashCode();
    }

    public final void i(String str) {
        this.a = str;
        this.d = false;
        this.b.clear();
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.clear();
        }
        t(0, 0, 0, 1);
    }

    public final String toString() {
        return this.a;
    }

    public aa(String str) {
        this.b = new ArrayList();
        this.f = h;
        i(str);
    }
}
