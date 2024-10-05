package defpackage;

import android.graphics.PointF;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chw extends chk {
    protected clu e;
    protected clu f;
    private final PointF g;
    private final PointF h;
    private final chk i;
    private final chk j;

    public chw(chk chkVar, chk chkVar2) {
        super(Collections.emptyList());
        this.g = new PointF();
        this.h = new PointF();
        this.i = chkVar;
        this.j = chkVar2;
        i(this.c);
    }

    @Override // defpackage.chk
    public final /* bridge */ /* synthetic */ Object f(clt cltVar, float f) {
        return e();
    }

    @Override // defpackage.chk
    public final void i(float f) {
        this.i.i(f);
        this.j.i(f);
        this.g.set(((Float) this.i.e()).floatValue(), ((Float) this.j.e()).floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            ((chf) this.a.get(i)).d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.chk
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final PointF e() {
        Float f;
        clt d;
        clt d2;
        Float f2 = null;
        if (this.e == null || (d2 = this.i.d()) == null) {
            f = null;
        } else {
            this.i.b();
            Float f3 = d2.h;
            clu cluVar = this.e;
            if (f3 != null) {
                f3.floatValue();
            }
            f = (Float) cluVar.a();
        }
        if (this.f != null && (d = this.j.d()) != null) {
            this.j.b();
            Float f4 = d.h;
            clu cluVar2 = this.f;
            if (f4 != null) {
                f4.floatValue();
            }
            f2 = (Float) cluVar2.a();
        }
        if (f == null) {
            this.h.set(this.g.x, 0.0f);
        } else {
            this.h.set(f.floatValue(), 0.0f);
        }
        if (f2 == null) {
            PointF pointF = this.h;
            pointF.set(pointF.x, this.g.y);
        } else {
            PointF pointF2 = this.h;
            pointF2.set(pointF2.x, f2.floatValue());
        }
        return this.h;
    }
}
