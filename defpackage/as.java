package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class as extends aw {
    int ag;
    int ah;
    private av am;
    protected final an af = new an();
    private int an = 0;
    private int ao = 0;
    private ar[] ap = new ar[4];
    private ar[] aq = new ar[4];
    private ar[] ar = new ar[4];
    public int ai = 2;
    private final boolean[] as = new boolean[3];
    private final ar[] at = new ar[4];
    public boolean aj = false;
    public boolean ak = false;

    private final int G(an anVar, ar[] arVarArr, ar arVar, int i, boolean[] zArr) {
        int i2;
        char c;
        char c2;
        zArr[0] = true;
        zArr[1] = false;
        ar arVar2 = null;
        arVarArr[0] = null;
        arVarArr[2] = null;
        arVarArr[1] = null;
        arVarArr[3] = null;
        float f = 0.0f;
        int i3 = 5;
        if (i == 0) {
            aq aqVar = arVar.i.b;
            boolean z = aqVar == null || aqVar.a == this;
            arVar.ab = null;
            ar arVar3 = arVar.K != 8 ? arVar : null;
            ar arVar4 = arVar;
            ar arVar5 = null;
            ar arVar6 = arVar3;
            i2 = 0;
            while (arVar4.k.b != null) {
                arVar4.ab = arVar2;
                if (arVar4.K != 8) {
                    if (arVar3 == null) {
                        arVar3 = arVar4;
                    }
                    if (arVar6 != null && arVar6 != arVar4) {
                        arVar6.ab = arVar4;
                    }
                    arVar6 = arVar4;
                } else {
                    aq aqVar2 = arVar4.i;
                    anVar.n(aqVar2.f, aqVar2.b.f, 0, 5);
                    anVar.n(arVar4.k.f, arVar4.i.f, 0, 5);
                }
                if (arVar4.K != 8 && arVar4.ad == 3) {
                    if (arVar4.ae == 3) {
                        zArr[0] = false;
                    }
                    if (arVar4.u <= f) {
                        zArr[0] = false;
                        int i4 = i2 + 1;
                        ar[] arVarArr2 = this.ap;
                        int length = arVarArr2.length;
                        if (i4 >= length) {
                            this.ap = (ar[]) Arrays.copyOf(arVarArr2, length + length);
                        }
                        this.ap[i2] = arVar4;
                        i2 = i4;
                    }
                }
                ar arVar7 = arVar4.k.b.a;
                aq aqVar3 = arVar7.i.b;
                if (aqVar3 == null || aqVar3.a != arVar4 || arVar7 == arVar4) {
                    break;
                }
                arVar5 = arVar7;
                arVar4 = arVar5;
                arVar2 = null;
                f = 0.0f;
            }
            aq aqVar4 = arVar4.k.b;
            if (aqVar4 != null && aqVar4.a != this) {
                z = false;
            }
            if (arVar.i.b == null || arVar5.k.b == null) {
                c2 = 1;
                zArr[1] = true;
            } else {
                c2 = 1;
            }
            arVar.X = z;
            arVar5.ab = null;
            arVarArr[0] = arVar;
            arVarArr[2] = arVar3;
            arVarArr[c2] = arVar5;
            arVarArr[3] = arVar6;
        } else {
            aq aqVar5 = arVar.j.b;
            boolean z2 = aqVar5 == null || aqVar5.a == this;
            ar arVar8 = null;
            arVar.ac = null;
            ar arVar9 = arVar;
            ar arVar10 = null;
            ar arVar11 = arVar.K != 8 ? arVar : null;
            ar arVar12 = arVar11;
            int i5 = 0;
            while (arVar9.l.b != null) {
                arVar9.ac = arVar8;
                if (arVar9.K != 8) {
                    if (arVar11 == null) {
                        arVar11 = arVar9;
                    }
                    if (arVar12 != null && arVar12 != arVar9) {
                        arVar12.ac = arVar9;
                    }
                    arVar12 = arVar9;
                } else {
                    aq aqVar6 = arVar9.j;
                    anVar.n(aqVar6.f, aqVar6.b.f, 0, i3);
                    anVar.n(arVar9.l.f, arVar9.j.f, 0, i3);
                }
                if (arVar9.K != 8 && arVar9.ae == 3) {
                    if (arVar9.ad == 3) {
                        zArr[0] = false;
                    }
                    if (arVar9.u <= 0.0f) {
                        zArr[0] = false;
                        int i6 = i5 + 1;
                        ar[] arVarArr3 = this.ap;
                        int length2 = arVarArr3.length;
                        if (i6 >= length2) {
                            this.ap = (ar[]) Arrays.copyOf(arVarArr3, length2 + length2);
                        }
                        this.ap[i5] = arVar9;
                        i5 = i6;
                    }
                }
                ar arVar13 = arVar9.l.b.a;
                aq aqVar7 = arVar13.j.b;
                if (aqVar7 == null || aqVar7.a != arVar9 || arVar13 == arVar9) {
                    break;
                }
                arVar10 = arVar13;
                arVar9 = arVar10;
                arVar8 = null;
                i3 = 5;
            }
            i2 = i5;
            aq aqVar8 = arVar9.l.b;
            if (aqVar8 != null && aqVar8.a != this) {
                z2 = false;
            }
            if (arVar.j.b == null || arVar10.l.b == null) {
                c = 1;
                zArr[1] = true;
            } else {
                c = 1;
            }
            arVar.Y = z2;
            arVar10.ac = null;
            arVarArr[0] = arVar;
            arVarArr[2] = arVar11;
            arVarArr[c] = arVar10;
            arVarArr[3] = arVar12;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:270:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x050f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void H(defpackage.an r31) {
        /*
            Method dump skipped, instructions count: 1380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as.H(an):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:280:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x052e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void I(defpackage.an r31) {
        /*
            Method dump skipped, instructions count: 1411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as.I(an):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0043, code lost:
    
        if (r12 != (-1)) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.ar r11, boolean[] r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as.B(ar, boolean[]):void");
    }

    public final void C(ar arVar, boolean[] zArr) {
        int i;
        ar arVar2;
        int i2;
        aq aqVar;
        aq aqVar2;
        aq aqVar3;
        int i3;
        boolean z;
        aq aqVar4;
        aq aqVar5;
        aq aqVar6;
        aq aqVar7;
        ar arVar3;
        boolean z2 = false;
        int i4 = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (arVar.ae != 3 || arVar.ad == 3 || arVar.u <= 0.0f) {
            int e = arVar.e();
            arVar.U = true;
            if (arVar instanceof at) {
                at atVar = (at) arVar;
                if (atVar.ai == 0) {
                    e = atVar.ag;
                    if (e == -1) {
                        int i5 = atVar.ah;
                        i4 = i5 != -1 ? i5 : 0;
                        e = 0;
                    }
                } else {
                    i4 = e;
                }
                i = e;
                e = i4;
            } else {
                aq aqVar8 = arVar.m;
                if (aqVar8.b == null && arVar.j.b == null && arVar.l.b == null) {
                    i = arVar.x + e;
                } else {
                    aq aqVar9 = arVar.l.b;
                    if (aqVar9 == null || (aqVar7 = arVar.j.b) == null || (aqVar9 != aqVar7 && ((arVar3 = aqVar9.a) != aqVar7.a || arVar3 == arVar.r))) {
                        if (aqVar8.c()) {
                            ar arVar4 = arVar.m.b.a;
                            if (!arVar4.U) {
                                C(arVar4, zArr);
                            }
                            int max = Math.max((arVar4.L - arVar4.t) + e, e);
                            int max2 = Math.max((arVar4.O - arVar4.t) + e, e);
                            if (arVar.K == 8) {
                                int i6 = arVar.t;
                                max -= i6;
                                max2 -= i6;
                            }
                            arVar.L = max;
                            arVar.O = max2;
                            return;
                        }
                        ar arVar5 = null;
                        if (arVar.j.c()) {
                            aq aqVar10 = arVar.j;
                            arVar2 = aqVar10.b.a;
                            i = aqVar10.a() + e;
                            if (!arVar2.t() && !arVar2.U) {
                                C(arVar2, zArr);
                            }
                        } else {
                            i = e;
                            arVar2 = null;
                        }
                        if (arVar.l.c()) {
                            aq aqVar11 = arVar.l;
                            ar arVar6 = aqVar11.b.a;
                            e += aqVar11.a();
                            if (!arVar6.t() && !arVar6.U) {
                                C(arVar6, zArr);
                            }
                            arVar5 = arVar6;
                        }
                        if (arVar.j.b != null && !arVar2.t()) {
                            int i7 = arVar.j.b.g;
                            if (i7 == 3) {
                                i3 = arVar2.L - arVar2.e();
                            } else {
                                if (i7 == 5) {
                                    i3 = arVar2.L;
                                }
                                z = (arVar2.R && ((aqVar5 = arVar2.j.b) == null || aqVar5.a == arVar || (aqVar6 = arVar2.l.b) == null || aqVar6.a == arVar || arVar2.ae == 3)) ? false : true;
                                arVar.R = z;
                                if (z && ((aqVar4 = arVar2.l.b) == null || aqVar4.a != arVar)) {
                                    i += i - arVar2.L;
                                }
                            }
                            i += i3;
                            if (arVar2.R) {
                            }
                            arVar.R = z;
                            if (z) {
                                i += i - arVar2.L;
                            }
                        }
                        if (arVar.l.b != null && !arVar5.t()) {
                            int i8 = arVar.l.b.g;
                            if (i8 == 5) {
                                i2 = arVar5.O - arVar5.e();
                            } else {
                                if (i8 == 3) {
                                    i2 = arVar5.O;
                                }
                                if (!arVar5.S || ((aqVar2 = arVar5.j.b) != null && aqVar2.a != arVar && (aqVar3 = arVar5.l.b) != null && aqVar3.a != arVar && arVar5.ae != 3)) {
                                    z2 = true;
                                }
                                arVar.S = z2;
                                if (z2 && ((aqVar = arVar5.j.b) == null || aqVar.a != arVar)) {
                                    e += e - arVar5.O;
                                }
                            }
                            e += i2;
                            if (!arVar5.S) {
                            }
                            z2 = true;
                            arVar.S = z2;
                            if (z2) {
                                e += e - arVar5.O;
                            }
                        }
                    } else {
                        zArr[0] = false;
                        return;
                    }
                }
            }
            if (arVar.K == 8) {
                int i9 = arVar.t;
                i -= i9;
                e -= i9;
            }
            arVar.L = i;
            arVar.O = e;
            return;
        }
        zArr[0] = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05e2 A[LOOP:16: B:269:0x05e0->B:270:0x05e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x051b  */
    /* JADX WARN: Type inference failed for: r0v12, types: [ar] */
    /* JADX WARN: Type inference failed for: r2v6, types: [ar] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v21 */
    @Override // defpackage.aw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as.D():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x06c0, code lost:
    
        if (r3.K != 8) goto L241;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(defpackage.an r21) {
        /*
            Method dump skipped, instructions count: 1783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as.E(an):boolean");
    }

    @Override // defpackage.aw, defpackage.ar
    public final void i() {
        this.af.l();
        super.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(ar arVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (true) {
                aq aqVar = arVar.i;
                aq aqVar2 = aqVar.b;
                if (aqVar2 == null) {
                    break;
                }
                ar arVar2 = aqVar2.a;
                aq aqVar3 = arVar2.k.b;
                if (aqVar3 == null || aqVar3 != aqVar || arVar2 == arVar) {
                    break;
                } else {
                    arVar = arVar2;
                }
            }
            while (true) {
                int i3 = this.an;
                if (i2 < i3) {
                    if (this.ar[i2] == arVar) {
                        return;
                    } else {
                        i2++;
                    }
                } else {
                    ar[] arVarArr = this.ar;
                    int length = arVarArr.length;
                    if (i3 + 1 >= length) {
                        this.ar = (ar[]) Arrays.copyOf(arVarArr, length + length);
                    }
                    ar[] arVarArr2 = this.ar;
                    int i4 = this.an;
                    arVarArr2[i4] = arVar;
                    this.an = i4 + 1;
                    return;
                }
            }
        } else {
            while (true) {
                aq aqVar4 = arVar.j;
                aq aqVar5 = aqVar4.b;
                if (aqVar5 == null) {
                    break;
                }
                ar arVar3 = aqVar5.a;
                aq aqVar6 = arVar3.l.b;
                if (aqVar6 == null || aqVar6 != aqVar4 || arVar3 == arVar) {
                    break;
                } else {
                    arVar = arVar3;
                }
            }
            while (true) {
                int i5 = this.ao;
                if (i2 < i5) {
                    if (this.aq[i2] == arVar) {
                        return;
                    } else {
                        i2++;
                    }
                } else {
                    ar[] arVarArr3 = this.aq;
                    int length2 = arVarArr3.length;
                    if (i5 + 1 >= length2) {
                        this.aq = (ar[]) Arrays.copyOf(arVarArr3, length2 + length2);
                    }
                    ar[] arVarArr4 = this.aq;
                    int i6 = this.ao;
                    arVarArr4[i6] = arVar;
                    this.ao = i6 + 1;
                    return;
                }
            }
        }
    }
}
