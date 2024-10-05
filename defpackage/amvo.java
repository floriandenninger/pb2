package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amvo extends amrz {
    public static final amrz b = new amvo(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient Object[] c;
    public final transient int d;
    private final transient Object e;

    private amvo(Object obj, Object[] objArr, int i) {
        this.e = obj;
        this.c = objArr;
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amvo a(int i, Object[] objArr) {
        if (i == 0) {
            return (amvo) b;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            Object obj2 = objArr[1];
            obj2.getClass();
            amkq.r(obj, obj2);
            return new amvo(null, objArr, 1);
        }
        amkq.W(i, objArr.length >> 1);
        return new amvo(r(objArr, i, amsx.f(i), 0), objArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c8, code lost:
    
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object r(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amvo.r(java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object s(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            obj3.getClass();
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            obj4.getClass();
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int bs = amkq.bs(obj2.hashCode());
            while (true) {
                int i3 = bs & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                bs = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int bs2 = amkq.bs(obj2.hashCode());
            while (true) {
                int i5 = bs2 & length2;
                char c = (char) sArr[i5];
                if (c == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[c])) {
                    return objArr[c ^ 1];
                }
                bs2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int bs3 = amkq.bs(obj2.hashCode());
            while (true) {
                int i6 = bs3 & length3;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i7])) {
                    return objArr[i7 ^ 1];
                }
                bs3 = i6 + 1;
            }
        }
    }

    private static IllegalArgumentException t(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.amrz
    public final amrl d() {
        return new amvn(this.c, 1, this.d);
    }

    @Override // defpackage.amrz
    public final amsx g() {
        return new amvm(this, new amvn(this.c, 0, this.d));
    }

    @Override // defpackage.amrz, java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        Object s = s(this.e, this.c, this.d, 0, obj);
        if (s == null) {
            return null;
        }
        return s;
    }

    @Override // defpackage.amrz
    public final amsx rY() {
        return new amvl(this, this.c, 0, this.d);
    }

    @Override // defpackage.amrz
    public final void sa() {
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.d;
    }
}
