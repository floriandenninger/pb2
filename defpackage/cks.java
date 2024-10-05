package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cks {
    private static final clg b = clg.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    static final clg a = clg.a("id", "layers", "w", "h", "p", "u");
    private static final clg c = clg.a("list");
    private static final clg d = clg.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0045. Please report as an issue. */
    public static cfj a(clh clhVar) {
        HashMap hashMap;
        ArrayList arrayList;
        aeh aehVar;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        HashMap hashMap2;
        ArrayList arrayList2;
        float a2 = cls.a();
        aee aeeVar = new aee();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        aeh aehVar2 = new aeh();
        cfj cfjVar = new cfj();
        clhVar.j();
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        while (clhVar.p()) {
            float f6 = f5;
            int i6 = 1;
            switch (clhVar.c(b)) {
                case 0:
                    i4 = clhVar.b();
                    f5 = f6;
                    break;
                case 1:
                    i5 = clhVar.b();
                    f5 = f6;
                    break;
                case 2:
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    f3 = (float) clhVar.a();
                    f5 = f6;
                    hashMap5 = hashMap2;
                    arrayList4 = arrayList2;
                    break;
                case 3:
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    f4 = ((float) clhVar.a()) - 0.01f;
                    f5 = f6;
                    hashMap5 = hashMap2;
                    arrayList4 = arrayList2;
                    break;
                case 4:
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    f5 = (float) clhVar.a();
                    hashMap5 = hashMap2;
                    arrayList4 = arrayList2;
                    break;
                case 5:
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    aehVar = aehVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    String[] split = clhVar.h().split("\\.");
                    if (!cls.m(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]))) {
                        cfjVar.d("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    aehVar2 = aehVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                    break;
                case 6:
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    aehVar = aehVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    clhVar.i();
                    int i7 = 0;
                    while (clhVar.p()) {
                        cjs b2 = ckr.b(clhVar, cfjVar);
                        if (b2.u == 3) {
                            i7++;
                        }
                        arrayList3.add(b2);
                        aeeVar.k(b2.d, b2);
                        if (i7 > 4) {
                            StringBuilder sb = new StringBuilder(157);
                            sb.append("You have ");
                            sb.append(i7);
                            sb.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                            cll.a(sb.toString());
                        }
                    }
                    clhVar.k();
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    aehVar2 = aehVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                    break;
                case 7:
                    clhVar.i();
                    while (clhVar.p()) {
                        ArrayList arrayList5 = new ArrayList();
                        aee aeeVar2 = new aee();
                        clhVar.j();
                        ArrayList arrayList6 = arrayList4;
                        aeh aehVar3 = aehVar2;
                        float f7 = f4;
                        String str = null;
                        String str2 = null;
                        int i8 = 0;
                        HashMap hashMap6 = hashMap5;
                        int i9 = 0;
                        while (clhVar.p()) {
                            float f8 = f3;
                            int c2 = clhVar.c(a);
                            if (c2 != 0) {
                                int i10 = i5;
                                if (c2 != 1) {
                                    if (c2 == 2) {
                                        i8 = clhVar.b();
                                    } else if (c2 == 3) {
                                        i9 = clhVar.b();
                                    } else if (c2 != 4) {
                                        if (c2 == 5) {
                                            clhVar.h();
                                        } else {
                                            clhVar.n();
                                            clhVar.o();
                                        }
                                        i3 = i4;
                                    } else {
                                        str = clhVar.h();
                                    }
                                    f3 = f8;
                                    i5 = i10;
                                } else {
                                    clhVar.i();
                                    while (clhVar.p()) {
                                        cjs b3 = ckr.b(clhVar, cfjVar);
                                        aeeVar2.k(b3.d, b3);
                                        arrayList5.add(b3);
                                        i4 = i4;
                                    }
                                    i3 = i4;
                                    clhVar.k();
                                }
                                f3 = f8;
                                i5 = i10;
                                i4 = i3;
                            } else {
                                str2 = clhVar.h();
                                f3 = f8;
                            }
                        }
                        float f9 = f3;
                        int i11 = i4;
                        int i12 = i5;
                        clhVar.l();
                        if (str != null) {
                            cga cgaVar = new cga(i8, i9, str2, str);
                            hashMap4.put(cgaVar.c, cgaVar);
                        } else {
                            hashMap3.put(str2, arrayList5);
                        }
                        hashMap5 = hashMap6;
                        arrayList4 = arrayList6;
                        aehVar2 = aehVar3;
                        f4 = f7;
                        f3 = f9;
                        i5 = i12;
                        i4 = i11;
                    }
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    aehVar = aehVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    clhVar.k();
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    aehVar2 = aehVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                    break;
                case 8:
                    clhVar.j();
                    while (clhVar.p()) {
                        if (clhVar.c(c) == 0) {
                            clhVar.i();
                            while (clhVar.p()) {
                                cie a3 = ckk.a(clhVar);
                                hashMap5.put(a3.b, a3);
                            }
                            clhVar.k();
                        } else {
                            clhVar.n();
                            clhVar.o();
                        }
                    }
                    clhVar.l();
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    aehVar = aehVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    aehVar2 = aehVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                    break;
                case 9:
                    clhVar.i();
                    while (clhVar.p()) {
                        cif a4 = ckj.a(clhVar, cfjVar);
                        aehVar2.k(a4.hashCode(), a4);
                    }
                    clhVar.k();
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    aehVar = aehVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    aehVar2 = aehVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                    break;
                case 10:
                    clhVar.i();
                    while (clhVar.p()) {
                        clhVar.j();
                        while (clhVar.p()) {
                            int c3 = clhVar.c(d);
                            if (c3 == 0) {
                                clhVar.h();
                            } else if (c3 == i6) {
                                clhVar.a();
                            } else if (c3 == 2) {
                                clhVar.a();
                            } else {
                                clhVar.n();
                                clhVar.o();
                            }
                            i6 = 1;
                        }
                        clhVar.l();
                        arrayList4.add(new abo());
                        i6 = 1;
                    }
                    clhVar.k();
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    aehVar = aehVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    aehVar2 = aehVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                    break;
                default:
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    aehVar = aehVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    clhVar.n();
                    clhVar.o();
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    aehVar2 = aehVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                    break;
            }
        }
        cfjVar.g = new Rect(0, 0, (int) (i4 * a2), (int) (i5 * a2));
        cfjVar.h = f3;
        cfjVar.i = f4;
        cfjVar.j = f5;
        cfjVar.f = arrayList3;
        cfjVar.e = aeeVar;
        cfjVar.a = hashMap3;
        cfjVar.b = hashMap4;
        cfjVar.d = aehVar2;
        cfjVar.c = hashMap5;
        return cfjVar;
    }
}
