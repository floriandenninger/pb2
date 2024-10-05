package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class beo extends beq {
    public ben d;

    protected abstract Pair f(ben benVar, int[][][] iArr, int[] iArr2);

    @Override // defpackage.beq
    public final void g(Object obj) {
        this.d = (ben) obj;
    }

    @Override // defpackage.beq
    public final ber h(pof[] pofVarArr, asj asjVar, ash ashVar, pou pouVar) {
        int length;
        int[] iArr;
        asj asjVar2 = asjVar;
        int length2 = pofVarArr.length + 1;
        int[] iArr2 = new int[length2];
        asi[][] asiVarArr = new asi[length2];
        int[][][] iArr3 = new int[length2][];
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = asjVar2.b;
            asiVarArr[i2] = new asi[i3];
            iArr3[i2] = new int[i3];
        }
        int length3 = pofVarArr.length;
        int[] iArr4 = new int[length3];
        for (int i4 = 0; i4 < length3; i4++) {
            iArr4[i4] = pofVarArr[i4].F();
        }
        int i5 = 0;
        while (i5 < asjVar2.b) {
            asi b = asjVar2.b(i5);
            int b2 = psz.b(b.a(i).n);
            int length4 = pofVarArr.length;
            int i6 = 0;
            int i7 = 0;
            boolean z = true;
            while (true) {
                length = pofVarArr.length;
                if (i6 >= length) {
                    break;
                }
                pof pofVar = pofVarArr[i6];
                int i8 = 0;
                while (i < b.a) {
                    i8 = Math.max(i8, muf.D(pofVar.a(b.a(i))));
                    i++;
                }
                boolean z2 = iArr2[i6] == 0;
                if (i8 > i7) {
                    z = z2;
                    i7 = i8;
                    length4 = i6;
                } else if (i8 == i7 && b2 == 5 && !z && z2) {
                    i7 = i8;
                    length4 = i6;
                    z = true;
                }
                i6++;
                i = 0;
            }
            if (length4 == length) {
                iArr = new int[b.a];
            } else {
                pof pofVar2 = pofVarArr[length4];
                int[] iArr5 = new int[b.a];
                for (int i9 = 0; i9 < b.a; i9++) {
                    iArr5[i9] = pofVar2.a(b.a(i9));
                }
                iArr = iArr5;
            }
            int i10 = iArr2[length4];
            asiVarArr[length4][i10] = b;
            iArr3[length4][i10] = iArr;
            iArr2[length4] = i10 + 1;
            i5++;
            asjVar2 = asjVar;
            i = 0;
        }
        int length5 = pofVarArr.length;
        asj[] asjVarArr = new asj[length5];
        String[] strArr = new String[length5];
        int[] iArr6 = new int[length5];
        int i11 = 0;
        while (true) {
            int length6 = pofVarArr.length;
            if (i11 < length6) {
                int i12 = iArr2[i11];
                asjVarArr[i11] = new asj((asi[]) pts.ad(asiVarArr[i11], i12));
                iArr3[i11] = (int[][]) pts.ad(iArr3[i11], i12);
                strArr[i11] = pofVarArr[i11].d();
                iArr6[i11] = pofVarArr[i11].ae();
                i11++;
            } else {
                new asj((asi[]) pts.ad(asiVarArr[length6], iArr2[length6]));
                ben benVar = new ben(iArr6, asjVarArr, iArr3);
                Pair f = f(benVar, iArr3, iArr4);
                return new ber((pog[]) f.first, (bel[]) f.second, benVar);
            }
        }
    }
}
