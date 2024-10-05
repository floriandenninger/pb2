package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afe extends aez {
    public int f;
    final afd g;
    private aff[] h;
    private aff[] i;

    public afe(afa afaVar) {
        super(afaVar);
        this.h = new aff[128];
        this.i = new aff[128];
        this.f = 0;
        this.g = new afd(this);
    }

    @Override // defpackage.aez
    public final void d(afb afbVar, aez aezVar, boolean z) {
        aff affVar = aezVar.a;
        if (affVar == null) {
            return;
        }
        aey aeyVar = aezVar.e;
        int i = aeyVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            aff d = aeyVar.d(i2);
            float b = aeyVar.b(i2);
            afd afdVar = this.g;
            afdVar.a = d;
            if (afdVar.a.b) {
                boolean z2 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = afdVar.a.i;
                    float f = fArr[i3] + (affVar.i[i3] * b);
                    fArr[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        afdVar.a.i[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    afdVar.b.n(afdVar.a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = affVar.i[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * b;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        afdVar.a.i[i4] = f3;
                    } else {
                        afdVar.a.i[i4] = 0.0f;
                    }
                }
                m(d);
            }
            this.b += aezVar.b * b;
        }
        n(affVar);
    }

    @Override // defpackage.aez
    public final boolean e() {
        return this.f == 0;
    }

    @Override // defpackage.aez
    public final aff k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f; i2++) {
            aff[] affVarArr = this.h;
            aff affVar = affVarArr[i2];
            if (!zArr[affVar.c]) {
                afd afdVar = this.g;
                afdVar.a = affVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = afdVar.a.i[i3];
                        if (f > 0.0f) {
                            break;
                        }
                        if (f < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                } else {
                    aff affVar2 = affVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = affVar2.i[i3];
                            float f3 = afdVar.a.i[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    public final void m(aff affVar) {
        int i;
        int i2 = this.f;
        aff[] affVarArr = this.h;
        int length = affVarArr.length;
        if (i2 + 1 > length) {
            aff[] affVarArr2 = (aff[]) Arrays.copyOf(affVarArr, length + length);
            this.h = affVarArr2;
            int length2 = affVarArr2.length;
            this.i = (aff[]) Arrays.copyOf(affVarArr2, length2 + length2);
        }
        aff[] affVarArr3 = this.h;
        int i3 = this.f;
        affVarArr3[i3] = affVar;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 > 1 && affVarArr3[i4 - 1].c > affVar.c) {
            int i5 = 0;
            while (true) {
                i = this.f;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new uo(2));
            for (int i6 = 0; i6 < this.f; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        affVar.b = true;
        affVar.a(this);
    }

    public final void n(aff affVar) {
        int i = 0;
        while (i < this.f) {
            if (this.h[i] == affVar) {
                while (true) {
                    int i2 = this.f - 1;
                    if (i < i2) {
                        aff[] affVarArr = this.h;
                        int i3 = i + 1;
                        affVarArr[i] = affVarArr[i3];
                        i = i3;
                    } else {
                        this.f = i2;
                        affVar.b = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.aez
    public final String toString() {
        float f = this.b;
        StringBuilder sb = new StringBuilder(29);
        sb.append(" goal -> (");
        sb.append(f);
        sb.append(") : ");
        String sb2 = sb.toString();
        for (int i = 0; i < this.f; i++) {
            this.g.a = this.h[i];
            String valueOf = String.valueOf(sb2);
            String valueOf2 = String.valueOf(this.g);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
            sb3.append(valueOf);
            sb3.append(valueOf2);
            sb3.append(" ");
            sb2 = sb3.toString();
        }
        return sb2;
    }
}
