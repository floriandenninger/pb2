package com.google.vr.sdk.base;

import android.opengl.Matrix;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class HeadTransform {
    private final float[] headView;

    public HeadTransform() {
        float[] fArr = new float[16];
        this.headView = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public void getHeadView(float[] fArr, int i) {
        System.arraycopy(this.headView, 0, fArr, 0, 16);
    }

    public float[] getHeadView() {
        return this.headView;
    }
}
