package defpackage;

import android.graphics.Bitmap;
import android.opengl.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahgf extends ahjp {
    private final float[] m;

    public ahgf(Bitmap bitmap, ahku ahkuVar, ahkv ahkvVar, azrw azrwVar) {
        super(bitmap, ahkuVar, ahkvVar, azrwVar);
        this.m = new float[16];
    }

    @Override // defpackage.ahfr, defpackage.ahim
    public final void q(ahjq ahjqVar) {
        Matrix.setIdentityM(this.m, 0);
        super.q(new ahjq(this.m, ahjqVar.b, null));
    }

    @Override // defpackage.ahfr, defpackage.ahim
    public final void qC(ahko ahkoVar) {
        Matrix.setIdentityM(this.m, 0);
        super.qC(new ahko(this.m, ahkoVar.b, ahkoVar.d, ahkoVar.e, ahkoVar.f));
    }

    @Override // defpackage.ahfr, defpackage.ahim
    public final boolean r(ahjq ahjqVar) {
        return false;
    }
}
