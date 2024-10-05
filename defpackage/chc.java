package defpackage;

import android.graphics.Path;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chc implements cgy, chf {
    private final boolean b;
    private final cfz c;
    private final chk d;
    private boolean e;
    private final Path a = new Path();
    private final vak f = new vak((byte[]) null, (char[]) null, (byte[]) null);

    public chc(cfz cfzVar, cjp cjpVar, cjl cjlVar) {
        this.b = cjlVar.b;
        this.c = cfzVar;
        chk a = cjlVar.a.a();
        this.d = a;
        cjpVar.h(a);
        a.g(this);
    }

    @Override // defpackage.chf
    public final void d() {
        this.e = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.cgo
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            cgo cgoVar = (cgo) list.get(i);
            if (cgoVar instanceof che) {
                che cheVar = (che) cgoVar;
                if (cheVar.e == 1) {
                    this.f.q(cheVar);
                    cheVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.cgo
    public final String g() {
        throw null;
    }

    @Override // defpackage.cgy
    public final Path i() {
        if (this.e) {
            return this.a;
        }
        this.a.reset();
        if (this.b) {
            this.e = true;
            return this.a;
        }
        this.a.set((Path) this.d.e());
        this.a.setFillType(Path.FillType.EVEN_ODD);
        this.f.r(this.a);
        this.e = true;
        return this.a;
    }
}
