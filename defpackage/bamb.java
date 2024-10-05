package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bamb {
    private static final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x0072. Please report as an issue. */
    public static bamc a(String str) {
        ConcurrentHashMap concurrentHashMap;
        bamc bamcVar;
        boolean z;
        if (str.length() == 0) {
            throw new IllegalArgumentException("Invalid pattern specification");
        }
        bamc bamcVar2 = (bamc) a.get(str);
        if (bamcVar2 == null) {
            bamr bamrVar = new bamr();
            int length = str.length();
            int[] iArr = new int[1];
            int i = 0;
            while (i < length) {
                iArr[0] = i;
                String b = b(str, iArr);
                int i2 = iArr[0];
                int length2 = b.length();
                if (length2 != 0) {
                    char charAt = b.charAt(0);
                    if (charAt == '\'') {
                        String substring = b.substring(1);
                        if (substring.length() == 1) {
                            bamrVar.o(substring.charAt(0));
                        } else {
                            bamrVar.p(new String(substring));
                        }
                    } else if (charAt == 'K') {
                        bamrVar.l(bajj.p, length2, 2);
                    } else if (charAt != 'M') {
                        if (charAt == 'S') {
                            bamrVar.w(length2, length2);
                        } else if (charAt == 'a') {
                            bamrVar.g(bajj.o);
                        } else if (charAt == 'h') {
                            bamrVar.l(bajj.q, length2, 2);
                        } else if (charAt == 'k') {
                            bamrVar.l(bajj.r, length2, 2);
                        } else if (charAt == 'm') {
                            bamrVar.y(length2);
                        } else if (charAt == 's') {
                            bamrVar.A(length2);
                        } else if (charAt == 'G') {
                            bamrVar.g(bajj.c);
                        } else if (charAt != 'H') {
                            if (charAt != 'Y') {
                                if (charAt != 'Z') {
                                    if (charAt == 'd') {
                                        bamrVar.t(length2);
                                    } else if (charAt != 'e') {
                                        switch (charAt) {
                                            case 'C':
                                                bamrVar.r(bajj.e, length2, length2);
                                                break;
                                            case 'D':
                                                bamrVar.v(length2);
                                                break;
                                            case 'E':
                                                if (length2 < 4) {
                                                    bamrVar.f(bajj.n);
                                                    break;
                                                } else {
                                                    bamrVar.g(bajj.n);
                                                    break;
                                                }
                                            default:
                                                switch (charAt) {
                                                    case 'w':
                                                        bamrVar.B(length2);
                                                        break;
                                                    case 'x':
                                                    case 'y':
                                                        break;
                                                    case 'z':
                                                        if (length2 < 4) {
                                                            bamn bamnVar = new bamn(1);
                                                            bamrVar.e(bamnVar, bamnVar);
                                                            break;
                                                        } else {
                                                            bamrVar.e(new bamn(0), null);
                                                            break;
                                                        }
                                                    default:
                                                        String valueOf = String.valueOf(b);
                                                        throw new IllegalArgumentException(valueOf.length() != 0 ? "Illegal pattern component: ".concat(valueOf) : new String("Illegal pattern component: "));
                                                }
                                        }
                                    } else {
                                        bamrVar.u(length2);
                                    }
                                } else if (length2 == 1) {
                                    bamrVar.h(false);
                                } else if (length2 != 2) {
                                    bamrVar.e(bamm.a, bamm.a);
                                } else {
                                    bamrVar.h(true);
                                }
                            }
                            if (length2 == 2) {
                                if (i2 + 1 < length) {
                                    iArr[0] = iArr[0] + 1;
                                    z = !c(b(str, iArr));
                                    iArr[0] = iArr[0] - 1;
                                } else {
                                    z = true;
                                }
                                if (charAt == 'x') {
                                    bajg bajgVar = new bajg();
                                    bamrVar.d(new bamp(bajj.l, bajgVar.b.u().a(bajgVar.a) - 30, z));
                                } else {
                                    bamrVar.d(new bamp(bajj.g, new bajg().p() - 30, z));
                                }
                            } else {
                                if (i2 + 1 < length) {
                                    iArr[0] = iArr[0] + 1;
                                    r11 = true == c(b(str, iArr)) ? length2 : 9;
                                    iArr[0] = iArr[0] - 1;
                                }
                                if (charAt == 'Y') {
                                    bamrVar.l(bajj.d, length2, r11);
                                } else if (charAt == 'x') {
                                    bamrVar.C(length2, r11);
                                } else if (charAt == 'y') {
                                    bamrVar.D(length2, r11);
                                }
                            }
                        } else {
                            bamrVar.x(length2);
                        }
                    } else if (length2 < 3) {
                        bamrVar.z(length2);
                    } else if (length2 < 4) {
                        bamrVar.f(bajj.i);
                    } else {
                        bamrVar.g(bajj.i);
                    }
                    i = i2 + 1;
                } else {
                    bamcVar2 = bamrVar.a();
                    concurrentHashMap = a;
                    if (concurrentHashMap.size() >= 500 && (bamcVar = (bamc) concurrentHashMap.putIfAbsent(str, bamcVar2)) != null) {
                        return bamcVar;
                    }
                }
            }
            bamcVar2 = bamrVar.a();
            concurrentHashMap = a;
            if (concurrentHashMap.size() >= 500) {
            }
        }
        return bamcVar2;
    }

    private static String b(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i);
        if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
            sb.append('\'');
            boolean z = false;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 != '\'') {
                    if (!z && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                        i--;
                        break;
                    }
                    sb.append(charAt2);
                } else {
                    int i2 = i + 1;
                    if (i2 >= length || str.charAt(i2) != '\'') {
                        z = !z;
                    } else {
                        sb.append('\'');
                        i = i2;
                    }
                }
                i++;
            }
        } else {
            sb.append(charAt);
            while (true) {
                int i3 = i + 1;
                if (i3 >= length || str.charAt(i3) != charAt) {
                    break;
                }
                sb.append(charAt);
                i = i3;
            }
        }
        iArr[0] = i;
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(java.lang.String r3) {
        /*
            int r0 = r3.length()
            r1 = 0
            if (r0 <= 0) goto L14
            char r3 = r3.charAt(r1)
            r2 = 1
            switch(r3) {
                case 67: goto L13;
                case 68: goto L13;
                case 70: goto L13;
                case 72: goto L13;
                case 75: goto L13;
                case 77: goto L10;
                case 83: goto L13;
                case 87: goto L13;
                case 89: goto L13;
                case 99: goto L13;
                case 100: goto L13;
                case 101: goto L13;
                case 104: goto L13;
                case 107: goto L13;
                case 109: goto L13;
                case 115: goto L13;
                case 119: goto L13;
                case 120: goto L13;
                case 121: goto L13;
                default: goto Lf;
            }
        Lf:
            goto L14
        L10:
            r3 = 2
            if (r0 > r3) goto L14
        L13:
            return r2
        L14:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bamb.c(java.lang.String):boolean");
    }
}
