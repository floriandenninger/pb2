package com.google.cardboard.sdk.utils;

import android.opengl.Matrix;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MathUtils {
    private static final String TAG = "MathUtils";

    private MathUtils() {
    }

    public static float[] getMatrixFromPose(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        Matrix.translateM(fArr3, 0, fArr[0], fArr[1], fArr[2]);
        float[] fArr4 = new float[16];
        Matrix.multiplyMM(fArr4, 0, fArr3, 0, getRotationMatrixFromQuaternion(fArr2), 0);
        return fArr4;
    }

    private static float[] getRotationMatrixFromQuaternion(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = f + f;
        float f6 = f2 + f2;
        float f7 = f6 * f2;
        float f8 = f3 + f3;
        float f9 = f8 * f3;
        float f10 = f2 * f5;
        float f11 = f5 * f3;
        float f12 = f3 * f6;
        float f13 = f5 * f4;
        float f14 = f6 * f4;
        float f15 = f8 * f4;
        float f16 = 1.0f - (f5 * f);
        return new float[]{(1.0f - f7) - f9, f10 + f15, f11 - f14, 0.0f, f10 - f15, f16 - f9, f12 + f13, 0.0f, f11 + f14, f12 - f13, f16 - f7, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }
}
