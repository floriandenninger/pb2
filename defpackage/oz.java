package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oz {
    private final List a;
    private final int[] b;
    private final int[] c;
    private final oy d;
    private final int e;
    private final int f;

    public oz(oy oyVar, List list, int[] iArr, int[] iArr2) {
        this.a = list;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = oyVar;
        int b = oyVar.b();
        this.e = b;
        int a = oyVar.a();
        this.f = a;
        dkb dkbVar = list.isEmpty() ? null : (dkb) list.get(0);
        if (dkbVar == null || dkbVar.b != 0 || dkbVar.c != 0) {
            list.add(0, new dkb(0, 0, 0, null, null));
        }
        list.add(new dkb(b, a, 0, null, null));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dkb dkbVar2 = (dkb) it.next();
            for (int i = 0; i < dkbVar2.a; i++) {
                int i2 = dkbVar2.b + i;
                int i3 = dkbVar2.c + i;
                int i4 = true != this.d.c(i2, i3) ? 2 : 1;
                this.b[i2] = (i3 << 4) | i4;
                this.c[i3] = (i2 << 4) | i4;
            }
        }
        int i5 = 0;
        for (dkb dkbVar3 : this.a) {
            while (i5 < dkbVar3.b) {
                if (this.b[i5] == 0) {
                    int size = this.a.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i6 < size) {
                            dkb dkbVar4 = (dkb) this.a.get(i6);
                            while (i7 < dkbVar4.c) {
                                if (this.c[i7] == 0 && this.d.d(i5, i7)) {
                                    int i8 = true != this.d.c(i5, i7) ? 4 : 8;
                                    this.b[i5] = (i7 << 4) | i8;
                                    this.c[i7] = i8 | (i5 << 4);
                                } else {
                                    i7++;
                                }
                            }
                            i7 = dkbVar4.b();
                            i6++;
                        }
                    }
                }
                i5++;
            }
            i5 = dkbVar3.a();
        }
    }

    private static pqd b(Collection collection, int i, boolean z) {
        pqd pqdVar;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                pqdVar = null;
                break;
            }
            pqdVar = (pqd) it.next();
            if (pqdVar.a == i && pqdVar.b == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            pqd pqdVar2 = (pqd) it.next();
            if (z) {
                pqdVar2.c--;
            } else {
                pqdVar2.c++;
            }
        }
        return pqdVar;
    }

    public final void a(vw vwVar) {
        int i;
        int i2;
        int i3;
        ox oxVar = new ox(new or(vwVar));
        int i4 = this.e;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i5 = this.e;
        int i6 = this.f;
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                dkb dkbVar = (dkb) this.a.get(size);
                int a = dkbVar.a();
                int b = dkbVar.b();
                while (true) {
                    if (i5 <= a) {
                        break;
                    }
                    i5--;
                    int i7 = this.b[i5];
                    if ((i7 & 12) != 0) {
                        pqd b2 = b(arrayDeque, i7 >> 4, false);
                        if (b2 != null) {
                            int i8 = (i4 - b2.c) - 1;
                            oxVar.b(i5, i8);
                            if ((i7 & 4) != 0) {
                                oxVar.c(i8);
                            }
                        } else {
                            arrayDeque.add(new pqd(i5, (i4 - i5) - 1, true));
                        }
                    } else {
                        if (oxVar.b != 2 || (i3 = oxVar.c) < i5 || i3 > i5 + 1) {
                            oxVar.a();
                            oxVar.c = i5;
                            oxVar.d = 1;
                            oxVar.b = 2;
                        } else {
                            oxVar.d++;
                            oxVar.c = i5;
                        }
                        i4--;
                    }
                }
                while (i6 > b) {
                    i6--;
                    int i9 = this.c[i6];
                    if ((i9 & 12) == 0) {
                        if (oxVar.b == 1 && i5 >= (i2 = oxVar.c)) {
                            int i10 = oxVar.d;
                            if (i5 <= i2 + i10) {
                                oxVar.d = i10 + 1;
                                oxVar.c = Math.min(i5, i2);
                                i4++;
                            }
                        }
                        oxVar.a();
                        oxVar.c = i5;
                        oxVar.d = 1;
                        oxVar.b = 1;
                        i4++;
                    } else {
                        if (b(arrayDeque, i9 >> 4, true) == null) {
                            arrayDeque.add(new pqd(i6, i4 - i5, false));
                        } else {
                            oxVar.b((i4 - r11.c) - 1, i5);
                            if ((i9 & 4) != 0) {
                                oxVar.c(i5);
                            }
                        }
                    }
                }
                int i11 = dkbVar.b;
                int i12 = dkbVar.c;
                for (i = 0; i < dkbVar.a; i++) {
                    if ((this.b[i11] & 15) == 2) {
                        oxVar.c(i11);
                    }
                    i11++;
                }
                i5 = dkbVar.b;
                i6 = dkbVar.c;
            } else {
                oxVar.a();
                return;
            }
        }
    }
}
