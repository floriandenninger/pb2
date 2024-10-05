package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chs extends chp {
    private final PointF e;
    private final float[] f;
    private final PathMeasure g;
    private chr h;

    public chs(List list) {
        super(list);
        this.e = new PointF();
        this.f = new float[2];
        this.g = new PathMeasure();
    }

    @Override // defpackage.chk
    public final /* synthetic */ Object f(clt cltVar, float f) {
        chr chrVar = (chr) cltVar;
        Path path = chrVar.a;
        if (path == null) {
            return (PointF) cltVar.b;
        }
        clu cluVar = this.d;
        if (cluVar != null) {
            float f2 = chrVar.g;
            chrVar.h.floatValue();
            c();
            PointF pointF = (PointF) cluVar.a();
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.h != chrVar) {
            this.g.setPath(path, false);
            this.h = chrVar;
        }
        PathMeasure pathMeasure = this.g;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f, null);
        PointF pointF2 = this.e;
        float[] fArr = this.f;
        pointF2.set(fArr[0], fArr[1]);
        return this.e;
    }
}
