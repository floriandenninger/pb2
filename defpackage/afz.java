package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afz {
    public static final afs a = new afs();
    public static int b = 0;
    public static int c = 0;

    public static void a(int i, afk afkVar, agm agmVar, boolean z) {
        afj afjVar;
        afj afjVar2;
        afj afjVar3;
        afj afjVar4;
        afj afjVar5;
        afj afjVar6;
        if (afkVar.n) {
            return;
        }
        b++;
        if (!(afkVar instanceof afl) && afkVar.K() && c(afkVar)) {
            afl.X(afkVar, agmVar, new afs());
        }
        afj L = afkVar.L(2);
        afj L2 = afkVar.L(4);
        int a2 = L.a();
        int a3 = L2.a();
        HashSet hashSet = L.a;
        float f = 0.0f;
        if (hashSet != null && L.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                afj afjVar7 = (afj) it.next();
                afk afkVar2 = afjVar7.d;
                int i2 = i + 1;
                boolean c2 = c(afkVar2);
                if (afkVar2.K() && c2) {
                    afl.X(afkVar2, agmVar, new afs());
                }
                if (afkVar2.N() != 3 || c2) {
                    if (!afkVar2.K()) {
                        afj afjVar8 = afkVar2.f45J;
                        if (afjVar7 != afjVar8 || afkVar2.L.e != null) {
                            afj afjVar9 = afkVar2.L;
                            if (afjVar7 != afjVar9 || afjVar8.e != null) {
                                if (afjVar7 == afjVar8 && (afjVar3 = afjVar9.e) != null && afjVar3.c && !afkVar2.I()) {
                                    e(i2, agmVar, afkVar2, z);
                                }
                            } else {
                                int b2 = a2 - afjVar9.b();
                                afkVar2.w(b2 - afkVar2.j(), b2);
                                a(i2, afkVar2, agmVar, z);
                            }
                            f = 0.0f;
                        } else {
                            int b3 = afjVar8.b() + a2;
                            afkVar2.w(b3, afkVar2.j() + b3);
                            a(i2, afkVar2, agmVar, z);
                        }
                    }
                } else if (afkVar2.N() == 3 && afkVar2.w >= 0 && afkVar2.v >= 0 && (afkVar2.ag == 8 || (afkVar2.s == 0 && afkVar2.W == f))) {
                    if (!afkVar2.I() && ((afjVar7 == (afjVar4 = afkVar2.f45J) && (afjVar6 = afkVar2.L.e) != null && afjVar6.c) || (afjVar7 == afkVar2.L && (afjVar5 = afjVar4.e) != null && afjVar5.c))) {
                        if (!afkVar2.I()) {
                            f(i2, afkVar, agmVar, afkVar2, z);
                        }
                    }
                }
            }
        }
        if (afkVar instanceof afn) {
            return;
        }
        HashSet hashSet2 = L2.a;
        if (hashSet2 != null && L2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                afj afjVar10 = (afj) it2.next();
                afk afkVar3 = afjVar10.d;
                int i3 = i + 1;
                boolean c3 = c(afkVar3);
                if (afkVar3.K() && c3) {
                    afl.X(afkVar3, agmVar, new afs());
                }
                afj afjVar11 = afkVar3.f45J;
                boolean z2 = false;
                if ((afjVar10 == afjVar11 && (afjVar2 = afkVar3.L.e) != null && afjVar2.c) || (afjVar10 == afkVar3.L && (afjVar = afjVar11.e) != null && afjVar.c)) {
                    z2 = true;
                }
                if (afkVar3.N() != 3 || c3) {
                    if (!afkVar3.K()) {
                        afj afjVar12 = afkVar3.f45J;
                        if (afjVar10 != afjVar12 || afkVar3.L.e != null) {
                            afj afjVar13 = afkVar3.L;
                            if (afjVar10 != afjVar13 || afjVar12.e != null) {
                                if (z2 && !afkVar3.I()) {
                                    e(i3, agmVar, afkVar3, z);
                                }
                            } else {
                                int b4 = a3 - afjVar13.b();
                                afkVar3.w(b4 - afkVar3.j(), b4);
                                a(i3, afkVar3, agmVar, z);
                            }
                        } else {
                            int b5 = afjVar12.b() + a3;
                            afkVar3.w(b5, afkVar3.j() + b5);
                            a(i3, afkVar3, agmVar, z);
                        }
                    }
                } else if (afkVar3.N() == 3) {
                    if (afkVar3.w >= 0) {
                        if (afkVar3.v >= 0) {
                            if (afkVar3.ag != 8) {
                                if (afkVar3.s == 0 && afkVar3.W == 0.0f) {
                                }
                            }
                            if (!afkVar3.I() && z2 && !afkVar3.I()) {
                                f(i3, afkVar, agmVar, afkVar3, z);
                            }
                        }
                    }
                }
            }
        }
        afkVar.n = true;
    }

    public static void b(int i, afk afkVar, agm agmVar) {
        afj afjVar;
        afj afjVar2;
        afj afjVar3;
        afj afjVar4;
        afj afjVar5;
        afj afjVar6;
        if (afkVar.o) {
            return;
        }
        c++;
        if (!(afkVar instanceof afl) && afkVar.K() && c(afkVar)) {
            afl.X(afkVar, agmVar, new afs());
        }
        afj L = afkVar.L(3);
        afj L2 = afkVar.L(5);
        int a2 = L.a();
        int a3 = L2.a();
        HashSet hashSet = L.a;
        if (hashSet != null && L.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                afj afjVar7 = (afj) it.next();
                afk afkVar2 = afjVar7.d;
                int i2 = i + 1;
                boolean c2 = c(afkVar2);
                if (afkVar2.K() && c2) {
                    afl.X(afkVar2, agmVar, new afs());
                }
                if (afkVar2.O() != 3 || c2) {
                    if (!afkVar2.K()) {
                        afj afjVar8 = afkVar2.K;
                        if (afjVar7 != afjVar8 || afkVar2.M.e != null) {
                            afj afjVar9 = afkVar2.M;
                            if (afjVar7 == afjVar9 && afjVar9.e == null) {
                                int b2 = a2 - afjVar9.b();
                                afkVar2.x(b2 - afkVar2.h(), b2);
                                b(i2, afkVar2, agmVar);
                            } else if (afjVar7 == afjVar8 && (afjVar3 = afjVar9.e) != null && afjVar3.c) {
                                g(i2, agmVar, afkVar2);
                            }
                        } else {
                            int b3 = afjVar8.b() + a2;
                            afkVar2.x(b3, afkVar2.h() + b3);
                            b(i2, afkVar2, agmVar);
                        }
                    }
                } else if (afkVar2.O() == 3 && afkVar2.z >= 0 && afkVar2.y >= 0 && (afkVar2.ag == 8 || (afkVar2.t == 0 && afkVar2.W == 0.0f))) {
                    if (!afkVar2.J() && ((afjVar7 == (afjVar4 = afkVar2.K) && (afjVar6 = afkVar2.M.e) != null && afjVar6.c) || (afjVar7 == afkVar2.M && (afjVar5 = afjVar4.e) != null && afjVar5.c))) {
                        if (!afkVar2.J()) {
                            h(i2, afkVar, agmVar, afkVar2);
                        }
                    }
                }
            }
        }
        if (afkVar instanceof afn) {
            return;
        }
        HashSet hashSet2 = L2.a;
        if (hashSet2 != null && L2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                afj afjVar10 = (afj) it2.next();
                afk afkVar3 = afjVar10.d;
                int i3 = i + 1;
                boolean c3 = c(afkVar3);
                if (afkVar3.K() && c3) {
                    afl.X(afkVar3, agmVar, new afs());
                }
                afj afjVar11 = afkVar3.K;
                boolean z = false;
                if ((afjVar10 == afjVar11 && (afjVar2 = afkVar3.M.e) != null && afjVar2.c) || (afjVar10 == afkVar3.M && (afjVar = afjVar11.e) != null && afjVar.c)) {
                    z = true;
                }
                if (afkVar3.O() != 3 || c3) {
                    if (!afkVar3.K()) {
                        afj afjVar12 = afkVar3.K;
                        if (afjVar10 != afjVar12 || afkVar3.M.e != null) {
                            afj afjVar13 = afkVar3.M;
                            if (afjVar10 != afjVar13 || afjVar12.e != null) {
                                if (z && !afkVar3.J()) {
                                    g(i3, agmVar, afkVar3);
                                }
                            } else {
                                int b4 = a3 - afjVar13.b();
                                afkVar3.x(b4 - afkVar3.h(), b4);
                                b(i3, afkVar3, agmVar);
                            }
                        } else {
                            int b5 = afjVar12.b() + a3;
                            afkVar3.x(b5, afkVar3.h() + b5);
                            b(i3, afkVar3, agmVar);
                        }
                    }
                } else if (afkVar3.O() == 3 && afkVar3.z >= 0 && afkVar3.y >= 0 && (afkVar3.ag == 8 || (afkVar3.t == 0 && afkVar3.W == 0.0f))) {
                    if (!afkVar3.J() && z && !afkVar3.J()) {
                        h(i3, afkVar, agmVar, afkVar3);
                    }
                }
            }
        }
        afj L3 = afkVar.L(6);
        if (L3.a != null && L3.c) {
            int a4 = L3.a();
            Iterator it3 = L3.a.iterator();
            while (it3.hasNext()) {
                afj afjVar14 = (afj) it3.next();
                afk afkVar4 = afjVar14.d;
                int i4 = i + 1;
                boolean c4 = c(afkVar4);
                if (afkVar4.K() && c4) {
                    afl.X(afkVar4, agmVar, new afs());
                }
                if (afkVar4.O() != 3 || c4) {
                    if (!afkVar4.K() && afjVar14 == afkVar4.N) {
                        int b6 = afjVar14.b() + a4;
                        if (afkVar4.F) {
                            int i5 = b6 - afkVar4.aa;
                            int i6 = afkVar4.V;
                            afkVar4.Z = i5;
                            afkVar4.K.e(i5);
                            afkVar4.M.e(i5 + i6);
                            afkVar4.N.e(b6);
                            afkVar4.m = true;
                        }
                        b(i4, afkVar4, agmVar);
                    }
                }
            }
        }
        afkVar.o = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(defpackage.afk r9) {
        /*
            int r0 = r9.N()
            int r1 = r9.O()
            afk r2 = r9.T
            if (r2 != 0) goto Ld
            r2 = 0
        Ld:
            if (r2 == 0) goto L12
            r2.N()
        L12:
            if (r2 == 0) goto L17
            r2.O()
        L17:
            r2 = 2
            r3 = 0
            r4 = 3
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L4f
            boolean r7 = r9.e()
            if (r7 != 0) goto L4f
            if (r0 == r2) goto L4f
            if (r0 != r4) goto L3c
            int r0 = r9.s
            if (r0 != 0) goto L3b
            float r0 = r9.W
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L3b
            boolean r0 = r9.G(r5)
            if (r0 != 0) goto L39
            goto L3b
        L39:
            r0 = 3
            goto L4f
        L3b:
            r0 = 3
        L3c:
            if (r0 != r4) goto L4d
            int r7 = r9.s
            if (r7 != r6) goto L4d
            int r7 = r9.j()
            boolean r7 = r9.H(r5, r7)
            if (r7 == 0) goto L4d
            goto L4f
        L4d:
            r7 = 0
            goto L50
        L4f:
            r7 = 1
        L50:
            if (r1 == r6) goto L7f
            boolean r8 = r9.f()
            if (r8 != 0) goto L7f
            if (r1 == r2) goto L7f
            if (r1 != r4) goto L6c
            int r1 = r9.t
            if (r1 != 0) goto L6c
            float r1 = r9.W
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L6c
            boolean r1 = r9.G(r6)
            if (r1 != 0) goto L7f
        L6c:
            if (r0 != r4) goto L7d
            int r0 = r9.t
            if (r0 != r6) goto L7d
            int r0 = r9.h()
            boolean r0 = r9.H(r6, r0)
            if (r0 == 0) goto L7d
            goto L7f
        L7d:
            r0 = 0
            goto L80
        L7f:
            r0 = 1
        L80:
            float r9 = r9.W
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 <= 0) goto L8e
            if (r7 != 0) goto L8d
            if (r0 != 0) goto L8d
            r0 = 0
            r7 = 0
            goto L8e
        L8d:
            return r6
        L8e:
            if (r7 == 0) goto L93
            if (r0 == 0) goto L93
            return r6
        L93:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afz.c(afk):boolean");
    }

    public static void d(afh afhVar, agm agmVar, int i, boolean z) {
        if (afhVar.c()) {
            if (i == 0) {
                a(1, afhVar, agmVar, z);
            } else {
                b(1, afhVar, agmVar);
            }
        }
    }

    private static void e(int i, agm agmVar, afk afkVar, boolean z) {
        float f = afkVar.ad;
        int a2 = afkVar.f45J.e.a();
        int a3 = afkVar.L.e.a();
        int b2 = afkVar.f45J.b() + a2;
        int b3 = a3 - afkVar.L.b();
        if (a2 == a3) {
            b3 = a3;
        }
        if (a2 == a3) {
            b2 = a2;
        }
        if (a2 == a3) {
            f = 0.5f;
        }
        int j = afkVar.j();
        int i2 = (b3 - b2) - j;
        if (b2 > b3) {
            i2 = (b2 - b3) - j;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + b2;
        int i4 = i3 + j;
        if (b2 > b3) {
            i4 = i3 - j;
        }
        afkVar.w(i3, i4);
        a(i + 1, afkVar, agmVar, z);
    }

    private static void f(int i, afk afkVar, agm agmVar, afk afkVar2, boolean z) {
        int j;
        float f = afkVar2.ad;
        int a2 = afkVar2.f45J.e.a() + afkVar2.f45J.b();
        int a3 = afkVar2.L.e.a() - afkVar2.L.b();
        if (a3 >= a2) {
            int j2 = afkVar2.j();
            if (afkVar2.ag != 8) {
                int i2 = afkVar2.s;
                if (i2 == 2) {
                    if (!(afkVar instanceof afl)) {
                        j = afkVar.T.j();
                    } else {
                        j = afkVar.j();
                    }
                    j2 = (int) (afkVar2.ad * 0.5f * j);
                } else if (i2 == 0) {
                    j2 = a3 - a2;
                }
                j2 = Math.max(afkVar2.v, j2);
                int i3 = afkVar2.w;
                if (i3 > 0) {
                    j2 = Math.min(i3, j2);
                }
            }
            int i4 = a2 + ((int) ((f * ((a3 - a2) - j2)) + 0.5f));
            afkVar2.w(i4, j2 + i4);
            a(i + 1, afkVar2, agmVar, z);
        }
    }

    private static void g(int i, agm agmVar, afk afkVar) {
        float f = afkVar.ae;
        int a2 = afkVar.K.e.a();
        int a3 = afkVar.M.e.a();
        int b2 = afkVar.K.b() + a2;
        int b3 = a3 - afkVar.M.b();
        if (a2 == a3) {
            b3 = a3;
        }
        if (a2 == a3) {
            b2 = a2;
        }
        if (a2 == a3) {
            f = 0.5f;
        }
        int h = afkVar.h();
        int i2 = (b3 - b2) - h;
        if (b2 > b3) {
            i2 = (b2 - b3) - h;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = b2 + i3;
        int i5 = i4 + h;
        if (b2 > b3) {
            i4 = b2 - i3;
            i5 = i4 - h;
        }
        afkVar.x(i4, i5);
        b(i + 1, afkVar, agmVar);
    }

    private static void h(int i, afk afkVar, agm agmVar, afk afkVar2) {
        int h;
        float f = afkVar2.ae;
        int a2 = afkVar2.K.e.a() + afkVar2.K.b();
        int a3 = afkVar2.M.e.a() - afkVar2.M.b();
        if (a3 >= a2) {
            int h2 = afkVar2.h();
            if (afkVar2.ag != 8) {
                int i2 = afkVar2.t;
                if (i2 == 2) {
                    if (!(afkVar instanceof afl)) {
                        h = afkVar.T.h();
                    } else {
                        h = afkVar.h();
                    }
                    h2 = (int) (f * 0.5f * h);
                } else if (i2 == 0) {
                    h2 = a3 - a2;
                }
                h2 = Math.max(afkVar2.y, h2);
                int i3 = afkVar2.z;
                if (i3 > 0) {
                    h2 = Math.min(i3, h2);
                }
            }
            int i4 = a2 + ((int) ((f * ((a3 - a2) - h2)) + 0.5f));
            afkVar2.x(i4, h2 + i4);
            b(i + 1, afkVar2, agmVar);
        }
    }
}
