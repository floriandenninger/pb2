package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeoa implements aeny {
    private static final Comparator a = new uo(18);
    private static final Comparator b = new uo(19);
    private final int d;
    private final float f;
    private int i;
    private int j;
    private final aenz[] g = new aenz[5];
    private final ArrayList e = new ArrayList();
    private int h = -1;

    public aeoa(int i, float f) {
        this.d = i;
        this.f = f;
    }

    @Override // defpackage.aeny
    public final float b() {
        if (this.e.isEmpty()) {
            return Float.NaN;
        }
        if (this.h != 0) {
            Collections.sort(this.e, b);
            this.h = 0;
        }
        int size = this.e.size();
        float f = this.f;
        float f2 = size + 1;
        if (f <= 1.0f / f2) {
            return ((aenz) this.e.get(0)).b;
        }
        float f3 = size;
        if (f < f3 / (f3 + 1.0f)) {
            float f4 = (f2 * f) - 1.0f;
            int i = (int) f4;
            float f5 = ((aenz) this.e.get(i)).b;
            return f5 + ((f4 % 1.0f) * (((aenz) this.e.get(i + 1)).b - f5));
        }
        return ((aenz) this.e.get(size - 1)).b;
    }

    @Override // defpackage.aeny
    public final void f(float f) {
        aenz aenzVar;
        if (this.h != 1) {
            Collections.sort(this.e, a);
            this.h = 1;
        }
        int i = this.j;
        if (i > 0) {
            aenz[] aenzVarArr = this.g;
            int i2 = i - 1;
            this.j = i2;
            aenzVar = aenzVarArr[i2];
        } else {
            aenzVar = new aenz();
        }
        int i3 = this.i;
        this.i = i3 + 1;
        aenzVar.a = i3;
        aenzVar.b = f;
        while (this.e.size() >= this.d) {
            aenz aenzVar2 = (aenz) this.e.get(0);
            this.e.remove(0);
            int i4 = this.j;
            if (i4 < 5) {
                aenz[] aenzVarArr2 = this.g;
                this.j = i4 + 1;
                aenzVarArr2[i4] = aenzVar2;
            }
        }
        this.e.add(aenzVar);
    }

    @Override // defpackage.aeny
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.aeny
    public final void h() {
    }

    @Override // defpackage.aeny
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.aeny
    public final /* synthetic */ int j() {
        return 1;
    }
}
