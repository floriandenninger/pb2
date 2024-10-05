package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chb implements cgq, cgy, cgv, chf, cgw {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final cfz c;
    private final cjp d;
    private final String e;
    private final boolean f;
    private final chk g;
    private final chk h;
    private final chy i;
    private cgp j;

    public chb(cfz cfzVar, cjp cjpVar, cjh cjhVar) {
        this.c = cfzVar;
        this.d = cjpVar;
        this.e = cjhVar.a;
        this.f = cjhVar.e;
        chk a = cjhVar.b.a();
        this.g = a;
        cjpVar.h(a);
        a.g(this);
        chk a2 = cjhVar.c.a();
        this.h = a2;
        cjpVar.h(a2);
        a2.g(this);
        chy b = cjhVar.d.b();
        this.i = b;
        b.c(cjpVar);
        b.d(this);
    }

    @Override // defpackage.cih
    public final void a(Object obj, clu cluVar) {
        chk chkVar;
        if (this.i.e(obj, cluVar)) {
            return;
        }
        if (obj == cge.s) {
            chkVar = this.g;
        } else if (obj != cge.t) {
            return;
        } else {
            chkVar = this.h;
        }
        chkVar.d = cluVar;
    }

    @Override // defpackage.cgq
    public final void b(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.g.e()).floatValue();
        float floatValue2 = ((Float) this.h.e()).floatValue();
        float floatValue3 = ((Float) this.i.h.e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.i.i.e()).floatValue() / 100.0f;
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            this.a.set(matrix);
            float f = i2;
            this.a.preConcat(this.i.b(f + floatValue2));
            this.j.b(canvas, this.a, (int) (i * cln.c(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // defpackage.cgq
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.j.c(rectF, matrix, z);
    }

    @Override // defpackage.chf
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.cih
    public final void e(cig cigVar, int i, List list, cig cigVar2) {
        cln.h(cigVar, i, list, cigVar2, this);
    }

    @Override // defpackage.cgo
    public final void f(List list, List list2) {
        this.j.f(list, list2);
    }

    @Override // defpackage.cgo
    public final String g() {
        return this.e;
    }

    @Override // defpackage.cgv
    public final void h(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((cgo) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new cgp(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // defpackage.cgy
    public final Path i() {
        Path i = this.j.i();
        this.b.reset();
        float floatValue = ((Float) this.g.e()).floatValue();
        float floatValue2 = ((Float) this.h.e()).floatValue();
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 < 0) {
                return this.b;
            }
            this.a.set(this.i.b(i2 + floatValue2));
            this.b.addPath(i, this.a);
        }
    }
}
