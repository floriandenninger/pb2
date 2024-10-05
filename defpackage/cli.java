package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cli extends clh {
    private static final bacx f = bacx.e("'\\");
    private static final bacx g = bacx.e("\"\\");
    private static final bacx h = bacx.e("{}[]:, \n\t\r\f/\\;#=");
    private static final bacx i = bacx.e("\n\r");
    private static final bacx j = bacx.e("*/");
    private final bacw k;
    private final bacu l;
    private int m = 0;
    private long n;
    private int o;
    private String p;

    public cli(bacw bacwVar) {
        this.k = bacwVar;
        this.l = ((badd) bacwVar).a;
        m(6);
    }

    private final void A() {
        long d = this.k.d(i);
        bacu bacuVar = this.l;
        bacuVar.l(d != -1 ? d + 1 : bacuVar.b);
    }

    private final void B() {
        long d = this.k.d(h);
        bacu bacuVar = this.l;
        if (d == -1) {
            d = bacuVar.b;
        }
        bacuVar.l(d);
    }

    private final boolean C(int i2) {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (i2 != 47 && i2 != 61) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        y();
        return false;
    }

    private final char s() {
        int i2;
        if (!this.k.n(1L)) {
            throw d("Unterminated escape sequence");
        }
        byte b = this.l.b();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b == 117) {
            if (this.k.n(4L)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte a = this.l.a(i3);
                    char c2 = (char) (c << 4);
                    if (a >= 48 && a <= 57) {
                        i2 = a - 48;
                    } else if (a >= 97 && a <= 102) {
                        i2 = a - 87;
                    } else {
                        if (a < 65 || a > 70) {
                            String i4 = this.l.i(4L);
                            throw d(i4.length() != 0 ? "\\u".concat(i4) : new String("\\u"));
                        }
                        i2 = a - 55;
                    }
                    c = (char) (c2 + i2);
                }
                this.l.l(4L);
                return c;
            }
            String valueOf = String.valueOf(f());
            throw new EOFException(valueOf.length() != 0 ? "Unterminated escape sequence at path ".concat(valueOf) : new String("Unterminated escape sequence at path "));
        }
        StringBuilder sb = new StringBuilder(27);
        sb.append("Invalid escape sequence: \\");
        sb.append((char) b);
        throw d(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01dc, code lost:
    
        r5 = -r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01dd, code lost:
    
        r16.n = r5;
        r16.l.l(r4);
        r16.m = 16;
        r3 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d9, code lost:
    
        if (r3 == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01cf, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ec, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ed, code lost:
    
        if (r2 == 2) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f0, code lost:
    
        if (r2 == 4) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f2, code lost:
    
        if (r2 != 7) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f4, code lost:
    
        r16.o = r4;
        r16.m = 17;
        r3 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bd, code lost:
    
        if (C(r11) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c1, code lost:
    
        if (r2 != 2) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c3, code lost:
    
        if (r7 == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c9, code lost:
    
        if (r5 != Long.MIN_VALUE) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cb, code lost:
    
        if (r9 == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01cd, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d4, code lost:
    
        if (r5 != 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d6, code lost:
    
        if (r3 != false) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0241 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0223 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int t() {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cli.t():int");
    }

    private final int u(String str, clg clgVar) {
        int length = clgVar.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(clgVar.a[i2])) {
                this.m = 0;
                this.d[this.b - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0199, code lost:
    
        throw new java.lang.IllegalStateException("closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x003e, code lost:
    
        return 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x019c, code lost:
    
        if (r2 != 35) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x019e, code lost:
    
        y();
        A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a6, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r25.l.l(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r2 != 47) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r25.k.n(2) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        y();
        r4 = 1;
        r2 = r25.l.a(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r2 == 42) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r2 == 47) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        return 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r25.l.b();
        r25.l.b();
        r2 = r25.k;
        r3 = defpackage.cli.j;
        r2 = (defpackage.badd) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r2.c != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        r6 = 0;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        r10 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (r3.b() == 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (r8 < r6) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        r11 = r10.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        if (r11 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r20 = r8;
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0137, code lost:
    
        if (r1 == (-1)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013a, code lost:
    
        r2 = r19;
        r1 = r2.a;
        r6 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014a, code lost:
    
        if (r2.b.e(r1, 8192) != (-1)) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016e, code lost:
    
        r4 = 1;
        r8 = java.lang.Math.max(r20, (r6 - r3.b()) + 1);
        r1 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014c, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014d, code lost:
    
        r3 = r25.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0151, code lost:
    
        if (r1 == (-1)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0153, code lost:
    
        r6 = defpackage.cli.j.b() + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x015e, code lost:
    
        r3.l(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0163, code lost:
    
        if (r1 == (-1)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016d, code lost:
    
        throw d("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015c, code lost:
    
        r6 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0090, code lost:
    
        r14 = r10.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0096, code lost:
    
        if ((r14 - r8) >= r8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009a, code lost:
    
        if (r14 <= r8) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x009c, code lost:
    
        r11 = r11.g;
        r14 = r14 - (r11.c - r11.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b9, code lost:
    
        r6 = r3.a(r1);
        r7 = r3.b();
        r19 = r2;
        r1 = (r10.b - r7) + r4;
        r12 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cb, code lost:
    
        if (r14 >= r1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cd, code lost:
    
        r10 = r11.a;
        r20 = r8;
        r5 = (int) java.lang.Math.min(r11.c, (r11.b + r1) - r14);
        r4 = (int) ((r11.b + r12) - r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e4, code lost:
    
        if (r4 >= r5) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e8, code lost:
    
        if (r10[r4] != r6) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ea, code lost:
    
        r8 = r4 + 1;
        r9 = r11.c;
        r12 = r11.a;
        r13 = 1;
        r22 = r1;
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f4, code lost:
    
        if (r13 >= r7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f6, code lost:
    
        if (r8 != r9) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f8, code lost:
    
        r1 = r1.f;
        r2 = r1.a;
        r8 = r1.b;
        r9 = r1.c;
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0101, code lost:
    
        r24 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0109, code lost:
    
        if (r12[r8] == r3.a(r13)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010c, code lost:
    
        r8 = r8 + 1;
        r13 = r13 + 1;
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011c, code lost:
    
        r4 = r4 + 1;
        r1 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0113, code lost:
    
        r1 = (r4 - r11.b) + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x011a, code lost:
    
        r22 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0121, code lost:
    
        r12 = r14 + (r11.c - r11.b);
        r11 = r11.f;
        r14 = r12;
        r8 = r20;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00a8, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00aa, code lost:
    
        r6 = (r11.c - r11.b) + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00b3, code lost:
    
        if (r6 >= r8) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00b5, code lost:
    
        r11 = r11.f;
        r14 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0189, code lost:
    
        throw new java.lang.IllegalArgumentException("fromIndex < 0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0191, code lost:
    
        throw new java.lang.IllegalArgumentException("bytes is empty");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int v(boolean r26) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cli.v(boolean):int");
    }

    private final String w(bacx bacxVar) {
        StringBuilder sb = null;
        while (true) {
            long d = this.k.d(bacxVar);
            if (d != -1) {
                if (this.l.a(d) != 92) {
                    if (sb == null) {
                        String i2 = this.l.i(d);
                        this.l.b();
                        return i2;
                    }
                    sb.append(this.l.i(d));
                    this.l.b();
                    return sb.toString();
                }
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.l.i(d));
                this.l.b();
                sb.append(s());
            } else {
                throw d("Unterminated string");
            }
        }
    }

    private final String x() {
        long d = this.k.d(h);
        return d != -1 ? this.l.i(d) : this.l.h();
    }

    private final void y() {
        throw d("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final void z(bacx bacxVar) {
        while (true) {
            long d = this.k.d(bacxVar);
            if (d != -1) {
                if (this.l.a(d) == 92) {
                    this.l.l(d + 1);
                    s();
                } else {
                    this.l.l(d + 1);
                    return;
                }
            } else {
                throw d("Unterminated string");
            }
        }
    }

    @Override // defpackage.clh
    public final double a() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 16) {
            this.m = 0;
            int[] iArr = this.e;
            int i3 = this.b - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.n;
        }
        if (i2 == 17) {
            this.p = this.l.i(this.o);
        } else if (i2 == 9) {
            this.p = w(g);
        } else if (i2 == 8) {
            this.p = w(f);
        } else if (i2 == 10) {
            this.p = x();
        } else if (i2 != 11) {
            String c = abu.c(r());
            String f2 = f();
            StringBuilder sb = new StringBuilder(c.length() + 35 + String.valueOf(f2).length());
            sb.append("Expected a double but was ");
            sb.append(c);
            sb.append(" at path ");
            sb.append(f2);
            throw new cle(sb.toString());
        }
        this.m = 11;
        try {
            double parseDouble = Double.parseDouble(this.p);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                String f3 = f();
                StringBuilder sb2 = new StringBuilder(String.valueOf(f3).length() + 66);
                sb2.append("JSON forbids NaN and infinities: ");
                sb2.append(parseDouble);
                sb2.append(" at path ");
                sb2.append(f3);
                throw new clf(sb2.toString());
            }
            this.p = null;
            this.m = 0;
            int[] iArr2 = this.e;
            int i4 = this.b - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            String str = this.p;
            String f4 = f();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(f4).length());
            sb3.append("Expected a double but was ");
            sb3.append(str);
            sb3.append(" at path ");
            sb3.append(f4);
            throw new cle(sb3.toString());
        }
    }

    @Override // defpackage.clh
    public final int b() {
        String w;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 16) {
            long j2 = this.n;
            int i3 = (int) j2;
            if (j2 == i3) {
                this.m = 0;
                int[] iArr = this.e;
                int i4 = this.b - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            String f2 = f();
            StringBuilder sb = new StringBuilder(String.valueOf(f2).length() + 53);
            sb.append("Expected an int but was ");
            sb.append(j2);
            sb.append(" at path ");
            sb.append(f2);
            throw new cle(sb.toString());
        }
        if (i2 == 17) {
            this.p = this.l.i(this.o);
        } else {
            if (i2 == 9) {
                w = w(g);
            } else if (i2 == 8) {
                w = w(f);
            } else if (i2 != 11) {
                String c = abu.c(r());
                String f3 = f();
                StringBuilder sb2 = new StringBuilder(c.length() + 33 + String.valueOf(f3).length());
                sb2.append("Expected an int but was ");
                sb2.append(c);
                sb2.append(" at path ");
                sb2.append(f3);
                throw new cle(sb2.toString());
            }
            this.p = w;
            try {
                int parseInt = Integer.parseInt(w);
                this.m = 0;
                int[] iArr2 = this.e;
                int i5 = this.b - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.m = 11;
        try {
            double parseDouble = Double.parseDouble(this.p);
            int i6 = (int) parseDouble;
            if (i6 == parseDouble) {
                this.p = null;
                this.m = 0;
                int[] iArr3 = this.e;
                int i7 = this.b - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            String str = this.p;
            String f4 = f();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(f4).length());
            sb3.append("Expected an int but was ");
            sb3.append(str);
            sb3.append(" at path ");
            sb3.append(f4);
            throw new cle(sb3.toString());
        } catch (NumberFormatException unused2) {
            String str2 = this.p;
            String f5 = f();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 33 + String.valueOf(f5).length());
            sb4.append("Expected an int but was ");
            sb4.append(str2);
            sb4.append(" at path ");
            sb4.append(f5);
            throw new cle(sb4.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8 A[EDGE_INSN: B:35:0x00b8->B:24:0x00b8 BREAK  A[LOOP:0: B:14:0x002a->B:22:0x00cf], SYNTHETIC] */
    @Override // defpackage.clh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(defpackage.clg r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cli.c(clg):int");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m = 0;
        this.c[0] = 8;
        this.b = 1;
        this.l.k();
        this.k.close();
    }

    @Override // defpackage.clh
    public final String g() {
        String str;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 14) {
            str = x();
        } else if (i2 == 13) {
            str = w(g);
        } else if (i2 == 12) {
            str = w(f);
        } else {
            if (i2 != 15) {
                String c = abu.c(r());
                String f2 = f();
                StringBuilder sb = new StringBuilder(c.length() + 33 + String.valueOf(f2).length());
                sb.append("Expected a name but was ");
                sb.append(c);
                sb.append(" at path ");
                sb.append(f2);
                throw new cle(sb.toString());
            }
            str = this.p;
        }
        this.m = 0;
        this.d[this.b - 1] = str;
        return str;
    }

    @Override // defpackage.clh
    public final String h() {
        String i2;
        int i3 = this.m;
        if (i3 == 0) {
            i3 = t();
        }
        if (i3 == 10) {
            i2 = x();
        } else if (i3 == 9) {
            i2 = w(g);
        } else if (i3 == 8) {
            i2 = w(f);
        } else if (i3 == 11) {
            i2 = this.p;
            this.p = null;
        } else if (i3 == 16) {
            i2 = Long.toString(this.n);
        } else if (i3 == 17) {
            i2 = this.l.i(this.o);
        } else {
            String c = abu.c(r());
            String f2 = f();
            StringBuilder sb = new StringBuilder(c.length() + 35 + String.valueOf(f2).length());
            sb.append("Expected a string but was ");
            sb.append(c);
            sb.append(" at path ");
            sb.append(f2);
            throw new cle(sb.toString());
        }
        this.m = 0;
        int[] iArr = this.e;
        int i4 = this.b - 1;
        iArr[i4] = iArr[i4] + 1;
        return i2;
    }

    @Override // defpackage.clh
    public final void i() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 3) {
            m(1);
            this.e[this.b - 1] = 0;
            this.m = 0;
            return;
        }
        String c = abu.c(r());
        String f2 = f();
        StringBuilder sb = new StringBuilder(c.length() + 38 + String.valueOf(f2).length());
        sb.append("Expected BEGIN_ARRAY but was ");
        sb.append(c);
        sb.append(" at path ");
        sb.append(f2);
        throw new cle(sb.toString());
    }

    @Override // defpackage.clh
    public final void j() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 1) {
            m(3);
            this.m = 0;
            return;
        }
        String c = abu.c(r());
        String f2 = f();
        StringBuilder sb = new StringBuilder(c.length() + 39 + String.valueOf(f2).length());
        sb.append("Expected BEGIN_OBJECT but was ");
        sb.append(c);
        sb.append(" at path ");
        sb.append(f2);
        throw new cle(sb.toString());
    }

    @Override // defpackage.clh
    public final void k() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 4) {
            int i3 = this.b - 1;
            this.b = i3;
            int[] iArr = this.e;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.m = 0;
            return;
        }
        String c = abu.c(r());
        String f2 = f();
        StringBuilder sb = new StringBuilder(c.length() + 36 + String.valueOf(f2).length());
        sb.append("Expected END_ARRAY but was ");
        sb.append(c);
        sb.append(" at path ");
        sb.append(f2);
        throw new cle(sb.toString());
    }

    @Override // defpackage.clh
    public final void l() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 2) {
            int i3 = this.b - 1;
            this.b = i3;
            this.d[i3] = null;
            int[] iArr = this.e;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.m = 0;
            return;
        }
        String c = abu.c(r());
        String f2 = f();
        StringBuilder sb = new StringBuilder(c.length() + 37 + String.valueOf(f2).length());
        sb.append("Expected END_OBJECT but was ");
        sb.append(c);
        sb.append(" at path ");
        sb.append(f2);
        throw new cle(sb.toString());
    }

    @Override // defpackage.clh
    public final void n() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 14) {
            B();
        } else if (i2 == 13) {
            z(g);
        } else if (i2 == 12) {
            z(f);
        } else if (i2 != 15) {
            String c = abu.c(r());
            String f2 = f();
            StringBuilder sb = new StringBuilder(c.length() + 33 + String.valueOf(f2).length());
            sb.append("Expected a name but was ");
            sb.append(c);
            sb.append(" at path ");
            sb.append(f2);
            throw new cle(sb.toString());
        }
        this.m = 0;
        this.d[this.b - 1] = "null";
    }

    @Override // defpackage.clh
    public final void o() {
        int i2 = 0;
        do {
            int i3 = this.m;
            if (i3 == 0) {
                i3 = t();
            }
            if (i3 == 3) {
                m(1);
            } else if (i3 != 1) {
                if (i3 == 4) {
                    i2--;
                    if (i2 >= 0) {
                        this.b--;
                    } else {
                        String c = abu.c(r());
                        String f2 = f();
                        StringBuilder sb = new StringBuilder(c.length() + 34 + String.valueOf(f2).length());
                        sb.append("Expected a value but was ");
                        sb.append(c);
                        sb.append(" at path ");
                        sb.append(f2);
                        throw new cle(sb.toString());
                    }
                } else if (i3 == 2) {
                    i2--;
                    if (i2 >= 0) {
                        this.b--;
                    } else {
                        String c2 = abu.c(r());
                        String f3 = f();
                        StringBuilder sb2 = new StringBuilder(c2.length() + 34 + String.valueOf(f3).length());
                        sb2.append("Expected a value but was ");
                        sb2.append(c2);
                        sb2.append(" at path ");
                        sb2.append(f3);
                        throw new cle(sb2.toString());
                    }
                } else if (i3 == 14 || i3 == 10) {
                    B();
                } else if (i3 == 9 || i3 == 13) {
                    z(g);
                } else if (i3 == 8 || i3 == 12) {
                    z(f);
                } else if (i3 == 17) {
                    this.l.l(this.o);
                } else if (i3 == 18) {
                    String c3 = abu.c(r());
                    String f4 = f();
                    StringBuilder sb3 = new StringBuilder(c3.length() + 34 + String.valueOf(f4).length());
                    sb3.append("Expected a value but was ");
                    sb3.append(c3);
                    sb3.append(" at path ");
                    sb3.append(f4);
                    throw new cle(sb3.toString());
                }
                this.m = 0;
            } else {
                m(3);
            }
            i2++;
            this.m = 0;
        } while (i2 != 0);
        int[] iArr = this.e;
        int i4 = this.b - 1;
        iArr[i4] = iArr[i4] + 1;
        this.d[i4] = "null";
    }

    @Override // defpackage.clh
    public final boolean p() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        return (i2 == 2 || i2 == 4 || i2 == 18) ? false : true;
    }

    @Override // defpackage.clh
    public final boolean q() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 5) {
            this.m = 0;
            int[] iArr = this.e;
            int i3 = this.b - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        }
        if (i2 == 6) {
            this.m = 0;
            int[] iArr2 = this.e;
            int i4 = this.b - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        }
        String c = abu.c(r());
        String f2 = f();
        StringBuilder sb = new StringBuilder(c.length() + 36 + String.valueOf(f2).length());
        sb.append("Expected a boolean but was ");
        sb.append(c);
        sb.append(" at path ");
        sb.append(f2);
        throw new cle(sb.toString());
    }

    @Override // defpackage.clh
    public final int r() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        switch (i2) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.k);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("JsonReader(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
