package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bvu extends bwd {
    private static final String[] p = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property q;
    private static final Property r;
    private static final Property s;
    private static final Property t;
    private static final Property u;

    static {
        new bvl(PointF.class);
        q = new bvm(PointF.class);
        r = new bvn(PointF.class);
        s = new bvo(PointF.class);
        t = new bvp(PointF.class);
        u = new bvq(PointF.class);
    }

    private static final void e(bwm bwmVar) {
        View view = bwmVar.b;
        if (!jw.al(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        bwmVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        bwmVar.a.put("android:changeBounds:parent", bwmVar.b.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0126  */
    @Override // defpackage.bwd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator a(android.view.ViewGroup r20, defpackage.bwm r21, defpackage.bwm r22) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvu.a(android.view.ViewGroup, bwm, bwm):android.animation.Animator");
    }

    @Override // defpackage.bwd
    public final void b(bwm bwmVar) {
        e(bwmVar);
    }

    @Override // defpackage.bwd
    public final void c(bwm bwmVar) {
        e(bwmVar);
    }

    @Override // defpackage.bwd
    public final String[] d() {
        return p;
    }
}
