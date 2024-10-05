package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pc {
    private static final Comparator a = new uo(1);

    public static oz a(oy oyVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        pa paVar;
        pb pbVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        pa paVar2;
        dkb dkbVar;
        int i;
        pb pbVar2;
        pb pbVar3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int b = oyVar.b();
        int a2 = oyVar.a();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new pa(b, a2));
        int i9 = b + a2;
        int i10 = 1;
        int i11 = (i9 + 1) / 2;
        int i12 = i11 + i11 + 1;
        int[] iArr = new int[i12];
        int i13 = i12 >> 1;
        int[] iArr2 = new int[i12];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            pa paVar3 = (pa) arrayList6.remove(arrayList6.size() - 1);
            if (paVar3.b() > 0 && paVar3.a() > 0) {
                int b2 = ((paVar3.b() + paVar3.a()) + i10) / 2;
                int i14 = i13 + 1;
                iArr[i14] = paVar3.a;
                iArr2[i14] = paVar3.b;
                int i15 = 0;
                while (i15 < b2) {
                    int abs = Math.abs(paVar3.b() - paVar3.a()) % 2;
                    int b3 = paVar3.b() - paVar3.a();
                    int i16 = -i15;
                    int i17 = i16;
                    while (true) {
                        if (i17 > i15) {
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            i = b2;
                            pbVar2 = null;
                            break;
                        }
                        if (i17 != i16 && (i17 == i15 || iArr[i17 + 1 + i13] <= iArr[(i17 - 1) + i13])) {
                            i5 = iArr[(i17 - 1) + i13];
                            i6 = i5 + 1;
                        } else {
                            i5 = iArr[i17 + 1 + i13];
                            i6 = i5;
                        }
                        i = b2;
                        arrayList = arrayList6;
                        int i18 = (paVar3.c + (i6 - paVar3.a)) - i17;
                        if (i15 == 0 || i6 != i5) {
                            arrayList2 = arrayList7;
                            i7 = i18;
                        } else {
                            i7 = i18 - 1;
                            arrayList2 = arrayList7;
                        }
                        while (i6 < paVar3.b && i18 < paVar3.d && oyVar.d(i6, i18)) {
                            i6++;
                            i18++;
                        }
                        iArr[i17 + i13] = i6;
                        if (abs == 1) {
                            int i19 = b3 - i17;
                            i8 = abs;
                            if (i19 >= i16 + 1 && i19 <= i15 - 1 && iArr2[i19 + i13] <= i6) {
                                pbVar2 = new pb();
                                pbVar2.a = i5;
                                pbVar2.b = i7;
                                pbVar2.c = i6;
                                pbVar2.d = i18;
                                pbVar2.e = false;
                                break;
                            }
                        } else {
                            i8 = abs;
                        }
                        i17 += 2;
                        b2 = i;
                        arrayList6 = arrayList;
                        arrayList7 = arrayList2;
                        abs = i8;
                    }
                    if (pbVar2 != null) {
                        pbVar = pbVar2;
                        paVar = paVar3;
                        break;
                    }
                    int b4 = (paVar3.b() - paVar3.a()) % 2;
                    int b5 = paVar3.b() - paVar3.a();
                    int i20 = i16;
                    while (true) {
                        if (i20 > i15) {
                            paVar = paVar3;
                            pbVar3 = null;
                            break;
                        }
                        if (i20 != i16 && (i20 == i15 || iArr2[i20 + 1 + i13] >= iArr2[(i20 - 1) + i13])) {
                            i2 = iArr2[(i20 - 1) + i13];
                            i3 = i2 - 1;
                        } else {
                            i2 = iArr2[i20 + 1 + i13];
                            i3 = i2;
                        }
                        int i21 = paVar3.d - ((paVar3.b - i3) - i20);
                        int i22 = (i15 == 0 || i3 != i2) ? i21 : i21 + 1;
                        while (i3 > paVar3.a && i21 > paVar3.c) {
                            int i23 = i3 - 1;
                            paVar = paVar3;
                            int i24 = i21 - 1;
                            if (!oyVar.d(i23, i24)) {
                                break;
                            }
                            i3 = i23;
                            i21 = i24;
                            paVar3 = paVar;
                        }
                        paVar = paVar3;
                        iArr2[i20 + i13] = i3;
                        if (b4 == 0 && (i4 = b5 - i20) >= i16 && i4 <= i15 && iArr[i4 + i13] >= i3) {
                            pbVar3 = new pb();
                            pbVar3.a = i3;
                            pbVar3.b = i21;
                            pbVar3.c = i2;
                            pbVar3.d = i22;
                            pbVar3.e = true;
                            break;
                        }
                        i20 += 2;
                        paVar3 = paVar;
                    }
                    if (pbVar3 != null) {
                        pbVar = pbVar3;
                        break;
                    }
                    i15++;
                    b2 = i;
                    arrayList6 = arrayList;
                    arrayList7 = arrayList2;
                    paVar3 = paVar;
                }
            }
            arrayList = arrayList6;
            arrayList2 = arrayList7;
            paVar = paVar3;
            pbVar = null;
            if (pbVar != null) {
                if (pbVar.a() > 0) {
                    int i25 = pbVar.d;
                    int i26 = pbVar.b;
                    int i27 = i25 - i26;
                    int i28 = pbVar.c;
                    int i29 = pbVar.a;
                    int i30 = i28 - i29;
                    if (i27 == i30) {
                        dkbVar = new dkb(i29, i26, i30, null, null);
                    } else if (pbVar.e) {
                        dkbVar = new dkb(i29, i26, pbVar.a(), null, null);
                    } else if (i27 <= i30) {
                        dkbVar = new dkb(i29 + 1, i26, pbVar.a(), null, null);
                    } else {
                        dkbVar = new dkb(i29, i26 + 1, pbVar.a(), null, null);
                    }
                    arrayList5.add(dkbVar);
                }
                if (arrayList2.isEmpty()) {
                    paVar2 = new pa();
                    arrayList4 = arrayList2;
                } else {
                    arrayList4 = arrayList2;
                    paVar2 = (pa) arrayList4.remove(arrayList2.size() - 1);
                }
                pa paVar4 = paVar;
                paVar2.a = paVar4.a;
                paVar2.c = paVar4.c;
                paVar2.b = pbVar.a;
                paVar2.d = pbVar.b;
                arrayList3 = arrayList;
                arrayList3.add(paVar2);
                int i31 = paVar4.b;
                int i32 = paVar4.d;
                paVar4.a = pbVar.c;
                paVar4.c = pbVar.d;
                arrayList3.add(paVar4);
            } else {
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                arrayList4.add(paVar);
            }
            arrayList7 = arrayList4;
            arrayList6 = arrayList3;
            i10 = 1;
        }
        Collections.sort(arrayList5, a);
        return new oz(oyVar, arrayList5, iArr, iArr2);
    }
}
