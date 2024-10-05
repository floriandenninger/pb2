package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgp implements cgq, cgy, chf, cih {
    private final Matrix a;
    private final Path b;
    private final RectF c;
    private final String d;
    private final boolean e;
    private final List f;
    private final cfz g;
    private List h;
    private chy i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cgp(defpackage.cfz r8, defpackage.cjp r9, defpackage.cjk r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.a
            boolean r4 = r10.c
            java.util.List r0 = r10.b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = 0
        L11:
            int r6 = r0.size()
            if (r2 >= r6) goto L29
            java.lang.Object r6 = r0.get(r2)
            ciz r6 = (defpackage.ciz) r6
            cgo r6 = r6.a(r8, r9)
            if (r6 == 0) goto L26
            r5.add(r6)
        L26:
            int r2 = r2 + 1
            goto L11
        L29:
            java.util.List r10 = r10.b
        L2b:
            int r0 = r10.size()
            if (r1 >= r0) goto L42
            java.lang.Object r0 = r10.get(r1)
            ciz r0 = (defpackage.ciz) r0
            boolean r2 = r0 instanceof defpackage.civ
            if (r2 == 0) goto L3f
            civ r0 = (defpackage.civ) r0
            r6 = r0
            goto L44
        L3f:
            int r1 = r1 + 1
            goto L2b
        L42:
            r10 = 0
            r6 = r10
        L44:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgp.<init>(cfz, cjp, cjk):void");
    }

    @Override // defpackage.cih
    public final void a(Object obj, clu cluVar) {
        chy chyVar = this.i;
        if (chyVar != null) {
            chyVar.e(obj, cluVar);
        }
    }

    @Override // defpackage.cgq
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        this.a.set(matrix);
        chy chyVar = this.i;
        if (chyVar != null) {
            this.a.preConcat(chyVar.a());
            i = (int) (((((this.i.e == null ? 100 : ((Integer) r4.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        int size = this.f.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Object obj = this.f.get(size);
            if (obj instanceof cgq) {
                ((cgq) obj).b(canvas, this.a, i);
            }
        }
    }

    @Override // defpackage.cgq
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.a.set(matrix);
        chy chyVar = this.i;
        if (chyVar != null) {
            this.a.preConcat(chyVar.a());
        }
        this.c.set(0.0f, 0.0f, 0.0f, 0.0f);
        int size = this.f.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            cgo cgoVar = (cgo) this.f.get(size);
            if (cgoVar instanceof cgq) {
                ((cgq) cgoVar).c(this.c, this.a, z);
                rectF.union(this.c);
            }
        }
    }

    @Override // defpackage.chf
    public final void d() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.cih
    public final void e(cig cigVar, int i, List list, cig cigVar2) {
        if (cigVar.e(this.d, i) || "__container".equals(this.d)) {
            if (!"__container".equals(this.d)) {
                cigVar2 = cigVar2.b(this.d);
                if (cigVar.d(this.d, i)) {
                    list.add(cigVar2.c(this));
                }
            }
            if (cigVar.f(this.d, i)) {
                int a = i + cigVar.a(this.d, i);
                for (int i2 = 0; i2 < this.f.size(); i2++) {
                    cgo cgoVar = (cgo) this.f.get(i2);
                    if (cgoVar instanceof cih) {
                        ((cih) cgoVar).e(cigVar, a, list, cigVar2);
                    }
                }
            }
        }
    }

    @Override // defpackage.cgo
    public final void f(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f.size());
        arrayList.addAll(list);
        int size = this.f.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            cgo cgoVar = (cgo) this.f.get(size);
            cgoVar.f(arrayList, this.f.subList(0, size));
            arrayList.add(cgoVar);
        }
    }

    @Override // defpackage.cgo
    public final String g() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Matrix h() {
        chy chyVar = this.i;
        if (chyVar != null) {
            return chyVar.a();
        }
        this.a.reset();
        return this.a;
    }

    @Override // defpackage.cgy
    public final Path i() {
        this.a.reset();
        chy chyVar = this.i;
        if (chyVar != null) {
            this.a.set(chyVar.a());
        }
        this.b.reset();
        if (this.e) {
            return this.b;
        }
        int size = this.f.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.b;
            }
            cgo cgoVar = (cgo) this.f.get(size);
            if (cgoVar instanceof cgy) {
                this.b.addPath(((cgy) cgoVar).i(), this.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List j() {
        if (this.h == null) {
            this.h = new ArrayList();
            for (int i = 0; i < this.f.size(); i++) {
                cgo cgoVar = (cgo) this.f.get(i);
                if (cgoVar instanceof cgy) {
                    this.h.add((cgy) cgoVar);
                }
            }
        }
        return this.h;
    }

    public cgp(cfz cfzVar, cjp cjpVar, String str, boolean z, List list, civ civVar) {
        new cgl();
        new RectF();
        this.a = new Matrix();
        this.b = new Path();
        this.c = new RectF();
        this.d = str;
        this.g = cfzVar;
        this.e = z;
        this.f = list;
        if (civVar != null) {
            chy b = civVar.b();
            this.i = b;
            b.c(cjpVar);
            this.i.d(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            cgo cgoVar = (cgo) list.get(size);
            if (cgoVar instanceof cgv) {
                arrayList.add((cgv) cgoVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((cgv) arrayList.get(size2)).h(list.listIterator(list.size()));
            }
        }
    }
}
