package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bgg {
    private static final Comparator e = bea.e;
    private static final Comparator f = bea.f;
    public int c;
    public int d;
    private final int g;
    private int i;
    private final bgf[] h = new bgf[5];
    public final ArrayList a = new ArrayList();
    public int b = -1;

    public bgg(int i) {
        this.g = i;
    }

    public final float a(float f2) {
        if (this.b != 0) {
            Collections.sort(this.a, f);
            this.b = 0;
        }
        float f3 = f2 * this.d;
        int i = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            bgf bgfVar = (bgf) this.a.get(i2);
            i += bgfVar.b;
            if (i >= f3) {
                return bgfVar.c;
            }
        }
        if (this.a.isEmpty()) {
            return Float.NaN;
        }
        return ((bgf) this.a.get(r5.size() - 1)).c;
    }

    public final void m(int i, float f2) {
        bgf bgfVar;
        if (this.b != 1) {
            Collections.sort(this.a, e);
            this.b = 1;
        }
        int i2 = this.i;
        if (i2 > 0) {
            bgf[] bgfVarArr = this.h;
            int i3 = i2 - 1;
            this.i = i3;
            bgfVar = bgfVarArr[i3];
        } else {
            bgfVar = new bgf();
        }
        int i4 = this.c;
        this.c = i4 + 1;
        bgfVar.a = i4;
        bgfVar.b = i;
        bgfVar.c = f2;
        this.a.add(bgfVar);
        this.d += i;
        while (true) {
            int i5 = this.d;
            int i6 = this.g;
            if (i5 <= i6) {
                return;
            }
            int i7 = i5 - i6;
            bgf bgfVar2 = (bgf) this.a.get(0);
            int i8 = bgfVar2.b;
            if (i8 <= i7) {
                this.d -= i8;
                this.a.remove(0);
                int i9 = this.i;
                if (i9 < 5) {
                    bgf[] bgfVarArr2 = this.h;
                    this.i = i9 + 1;
                    bgfVarArr2[i9] = bgfVar2;
                }
            } else {
                bgfVar2.b = i8 - i7;
                this.d -= i7;
            }
        }
    }
}
