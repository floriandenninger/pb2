package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sh {
    final wa e;
    private final hy f = new hz(30);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int d = 0;
    final vl c = new vl(this);

    public sh(wa waVar, byte[] bArr) {
        this.e = waVar;
    }

    private final int m(int i, int i2) {
        int size = this.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            sg sgVar = (sg) this.b.get(size);
            int i3 = sgVar.a;
            if (i3 == 8) {
                int i4 = sgVar.b;
                int i5 = sgVar.d;
                int i6 = i4 < i5 ? i5 : i4;
                int i7 = i4 < i5 ? i4 : i5;
                if (i < i7 || i > i6) {
                    if (i < i4) {
                        if (i2 == 1) {
                            sgVar.b = i4 + 1;
                            sgVar.d = i5 + 1;
                        } else if (i2 == 2) {
                            sgVar.b = i4 - 1;
                            sgVar.d = i5 - 1;
                        }
                    }
                } else if (i7 == i4) {
                    if (i2 == 1) {
                        sgVar.d = i5 + 1;
                    } else if (i2 == 2) {
                        sgVar.d = i5 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        sgVar.b = i4 + 1;
                    } else if (i2 == 2) {
                        sgVar.b = i4 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = sgVar.b;
                if (i8 <= i) {
                    if (i3 == 1) {
                        i -= sgVar.d;
                    } else if (i3 == 2) {
                        i += sgVar.d;
                    }
                } else if (i2 == 1) {
                    sgVar.b = i8 + 1;
                } else if (i2 == 2) {
                    sgVar.b = i8 - 1;
                }
            }
        }
        int size2 = this.b.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return i;
            }
            sg sgVar2 = (sg) this.b.get(size2);
            if (sgVar2.a == 8) {
                int i9 = sgVar2.d;
                if (i9 == sgVar2.b || i9 < 0) {
                    this.b.remove(size2);
                    h(sgVar2);
                }
            } else if (sgVar2.d <= 0) {
                this.b.remove(size2);
                h(sgVar2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r9 == (r0 + 1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r9 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n(defpackage.sg r13) {
        /*
            r12 = this;
            int r0 = r13.a
            r1 = 1
            if (r0 == r1) goto L85
            r2 = 8
            if (r0 == r2) goto L85
            int r2 = r13.b
            int r0 = r12.m(r2, r0)
            int r2 = r13.b
            int r3 = r13.a
            r4 = 2
            r5 = 0
            r6 = 4
            if (r3 == r4) goto L33
            if (r3 != r6) goto L1c
            r3 = 1
            goto L34
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "op should be remove or update."
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L33:
            r3 = 0
        L34:
            r7 = 1
            r8 = 1
        L36:
            int r9 = r13.d
            if (r7 >= r9) goto L71
            int r9 = r13.b
            int r10 = r3 * r7
            int r9 = r9 + r10
            int r10 = r13.a
            int r9 = r12.m(r9, r10)
            int r10 = r13.a
            if (r10 == r4) goto L51
            if (r10 == r6) goto L4c
            goto L5b
        L4c:
            int r11 = r0 + 1
            if (r9 != r11) goto L55
            goto L53
        L51:
            if (r9 != r0) goto L55
        L53:
            r11 = 1
            goto L56
        L55:
            r11 = 0
        L56:
            if (r11 == 0) goto L5b
            int r8 = r8 + 1
            goto L6e
        L5b:
            java.lang.Object r11 = r13.c
            sg r0 = r12.c(r10, r0, r8, r11)
            r12.f(r0, r2)
            r12.h(r0)
            int r0 = r13.a
            if (r0 != r6) goto L6c
            int r2 = r2 + r8
        L6c:
            r0 = r9
            r8 = 1
        L6e:
            int r7 = r7 + 1
            goto L36
        L71:
            java.lang.Object r1 = r13.c
            r12.h(r13)
            if (r8 <= 0) goto L84
            int r13 = r13.a
            sg r13 = r12.c(r13, r0, r8, r1)
            r12.f(r13, r2)
            r12.h(r13)
        L84:
            return
        L85:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "should not dispatch add or move for pre layout"
            r13.<init>(r0)
            goto L8e
        L8d:
            throw r13
        L8e:
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh.n(sg):void");
    }

    private final void o(sg sgVar) {
        this.b.add(sgVar);
        int i = sgVar.a;
        if (i == 1) {
            this.e.d(sgVar.b, sgVar.d);
            return;
        }
        if (i == 2) {
            wa waVar = this.e;
            waVar.a.Q(sgVar.b, sgVar.d, false);
            waVar.a.N = true;
            return;
        }
        if (i == 4) {
            this.e.c(sgVar.b, sgVar.d, sgVar.c);
        } else {
            if (i == 8) {
                this.e.e(sgVar.b, sgVar.d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + sgVar);
        }
    }

    private final boolean p(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            sg sgVar = (sg) this.b.get(i2);
            int i3 = sgVar.a;
            if (i3 == 8) {
                if (b(sgVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = sgVar.b;
                int i5 = sgVar.d + i4;
                while (i4 < i5) {
                    if (b(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        return b(i, 0);
    }

    final int b(int i, int i2) {
        int size = this.b.size();
        while (i2 < size) {
            sg sgVar = (sg) this.b.get(i2);
            int i3 = sgVar.a;
            if (i3 == 8) {
                int i4 = sgVar.b;
                if (i4 == i) {
                    i = sgVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (sgVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = sgVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = sgVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += sgVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final sg c(int i, int i2, int i3, Object obj) {
        sg sgVar = (sg) this.f.a();
        if (sgVar == null) {
            return new sg(i, i2, i3, obj);
        }
        sgVar.a = i;
        sgVar.b = i2;
        sgVar.d = i3;
        sgVar.c = obj;
        return sgVar;
    }

    public final void d() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.e.b((sg) this.b.get(i));
        }
        i(this.b);
        this.d = 0;
    }

    public final void e() {
        d();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            sg sgVar = (sg) this.a.get(i);
            int i2 = sgVar.a;
            if (i2 == 1) {
                this.e.b(sgVar);
                this.e.d(sgVar.b, sgVar.d);
            } else if (i2 == 2) {
                this.e.b(sgVar);
                this.e.f(sgVar.b, sgVar.d);
            } else if (i2 == 4) {
                this.e.b(sgVar);
                this.e.c(sgVar.b, sgVar.d, sgVar.c);
            } else if (i2 == 8) {
                this.e.b(sgVar);
                this.e.e(sgVar.b, sgVar.d);
            }
        }
        i(this.a);
        this.d = 0;
    }

    final void f(sg sgVar, int i) {
        this.e.b(sgVar);
        int i2 = sgVar.a;
        if (i2 == 2) {
            this.e.f(i, sgVar.d);
        } else {
            if (i2 == 4) {
                this.e.c(i, sgVar.d, sgVar.c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh.g():void");
    }

    public final void h(sg sgVar) {
        sgVar.c = null;
        this.f.b(sgVar);
    }

    final void i(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            h((sg) list.get(i));
        }
        list.clear();
    }

    public final void j() {
        i(this.a);
        i(this.b);
        this.d = 0;
    }

    public final boolean k(int i) {
        return (i & this.d) != 0;
    }

    public final boolean l() {
        return this.a.size() > 0;
    }
}
