package defpackage;

import android.opengl.Matrix;
import com.google.cardboard.sdk.CardboardView;
import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.FieldOfView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahgj extends Eye {
    private final CardboardView.Eye a;
    private final FieldOfView b;

    public ahgj(CardboardView.Eye eye, int i, float[] fArr) {
        super(i);
        this.a = eye;
        Matrix.multiplyMM(getEyeView(), 0, eye.getEyeFromHead(), 0, fArr, 0);
        float[] fieldOfView = eye.getFieldOfView();
        this.b = new FieldOfView(fieldOfView[0], fieldOfView[1], fieldOfView[2], fieldOfView[3]);
    }

    @Override // com.google.vr.sdk.base.Eye
    public final FieldOfView getFov() {
        return this.b;
    }

    @Override // com.google.vr.sdk.base.Eye
    public final float[] getPerspective(float f, float f2) {
        return this.a.getPerspective(0.1f, 20000.0f);
    }
}
