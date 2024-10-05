package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cht extends chp {
    private final PointF e;

    public cht(List list) {
        super(list);
        this.e = new PointF();
    }

    @Override // defpackage.chk
    public final /* synthetic */ Object f(clt cltVar, float f) {
        return j(cltVar, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.chk
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final PointF j(clt cltVar, float f, float f2) {
        Object obj;
        Object obj2 = cltVar.b;
        if (obj2 == null || (obj = cltVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        clu cluVar = this.d;
        if (cluVar != null) {
            float f3 = cltVar.g;
            cltVar.h.floatValue();
            c();
            PointF pointF3 = (PointF) cluVar.a();
            if (pointF3 != null) {
                return pointF3;
            }
        }
        this.e.set(pointF.x + (f * (pointF2.x - pointF.x)), pointF.y + (f2 * (pointF2.y - pointF.y)));
        return this.e;
    }
}
