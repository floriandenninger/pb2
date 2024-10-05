package defpackage;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bada extends AbstractList implements RandomAccess {
    public final bacx[] a;
    public final int[] b;

    private bada(bacx[] bacxVarArr, int[] iArr) {
        this.a = bacxVarArr;
        this.b = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bada a(defpackage.bacx... r14) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bada.a(bacx[]):bada");
    }

    private static int b(bacu bacuVar) {
        return (int) (bacuVar.b / 4);
    }

    private static void c(long j, bacu bacuVar, int i, List list, int i2, int i3, List list2) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i2 < i3) {
            for (int i9 = i2; i9 < i3; i9++) {
                if (((bacx) list.get(i9)).b() < i) {
                    throw new AssertionError();
                }
            }
            bacx bacxVar = (bacx) list.get(i2);
            bacx bacxVar2 = (bacx) list.get(i3 - 1);
            if (i == bacxVar.b()) {
                int i10 = i2 + 1;
                i5 = i10;
                i4 = ((Integer) list2.get(i2)).intValue();
                bacxVar = (bacx) list.get(i10);
            } else {
                i4 = -1;
                i5 = i2;
            }
            if (bacxVar.a(i) != bacxVar2.a(i)) {
                int i11 = 1;
                for (int i12 = i5 + 1; i12 < i3; i12++) {
                    if (((bacx) list.get(i12 - 1)).a(i) != ((bacx) list.get(i12)).a(i)) {
                        i11++;
                    }
                }
                long b = j + b(bacuVar) + 2 + i11 + i11;
                bacuVar.s(i11);
                bacuVar.s(i4);
                for (int i13 = i5; i13 < i3; i13++) {
                    byte a = ((bacx) list.get(i13)).a(i);
                    if (i13 == i5 || a != ((bacx) list.get(i13 - 1)).a(i)) {
                        bacuVar.s(a & 255);
                    }
                }
                bacu bacuVar2 = new bacu();
                int i14 = i5;
                while (i14 < i3) {
                    byte a2 = ((bacx) list.get(i14)).a(i);
                    int i15 = i14 + 1;
                    int i16 = i15;
                    while (true) {
                        if (i16 >= i3) {
                            i7 = i3;
                            break;
                        } else {
                            if (a2 != ((bacx) list.get(i16)).a(i)) {
                                i7 = i16;
                                break;
                            }
                            i16++;
                        }
                    }
                    if (i15 != i7 || i + 1 != ((bacx) list.get(i14)).b()) {
                        bacuVar.s((int) (-(b(bacuVar2) + b)));
                        i8 = i7;
                        c(b, bacuVar2, i + 1, list, i14, i7, list2);
                    } else {
                        bacuVar.s(((Integer) list2.get(i14)).intValue());
                        i8 = i7;
                    }
                    i14 = i8;
                }
                bacuVar.m(bacuVar2, bacuVar2.b);
                return;
            }
            int min = Math.min(bacxVar.b(), bacxVar2.b());
            int i17 = 0;
            for (int i18 = i; i18 < min && bacxVar.a(i18) == bacxVar2.a(i18); i18++) {
                i17++;
            }
            long b2 = 1 + j + b(bacuVar) + 2 + i17;
            bacuVar.s(-i17);
            bacuVar.s(i4);
            int i19 = i;
            while (true) {
                i6 = i + i17;
                if (i19 >= i6) {
                    break;
                }
                bacuVar.s(bacxVar.a(i19) & 255);
                i19++;
            }
            if (i5 + 1 == i3) {
                if (i6 != ((bacx) list.get(i5)).b()) {
                    throw new AssertionError();
                }
                bacuVar.s(((Integer) list2.get(i5)).intValue());
                return;
            } else {
                bacu bacuVar3 = new bacu();
                bacuVar.s((int) (-(b(bacuVar3) + b2)));
                c(b2, bacuVar3, i6, list, i5, i3, list2);
                bacuVar.m(bacuVar3, bacuVar3.b);
                return;
            }
        }
        throw new AssertionError();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.length;
    }
}
