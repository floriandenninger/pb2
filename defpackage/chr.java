package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chr extends clt {
    public Path a;
    private final clt o;

    public chr(cfj cfjVar, clt cltVar) {
        super(cfjVar, (PointF) cltVar.b, (PointF) cltVar.c, cltVar.d, cltVar.e, cltVar.f, cltVar.g, cltVar.h);
        this.o = cltVar;
        a();
    }

    public final void a() {
        Object obj;
        Object obj2;
        Object obj3 = this.c;
        boolean z = false;
        if (obj3 != null && (obj2 = this.b) != null && ((PointF) obj2).equals(((PointF) obj3).x, ((PointF) this.c).y)) {
            z = true;
        }
        Object obj4 = this.b;
        if (obj4 == null || (obj = this.c) == null || z) {
            return;
        }
        clt cltVar = this.o;
        this.a = cls.f((PointF) obj4, (PointF) obj, cltVar.m, cltVar.n);
    }
}
