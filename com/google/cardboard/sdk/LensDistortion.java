package com.google.cardboard.sdk;

import com.google.cardboard.sdk.nativetypes.Mesh;
import com.google.cardboard.sdk.nativetypes.UvPoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LensDistortion {
    private long nativeLensDistortion;

    public LensDistortion(byte[] bArr, int i, int i2) {
        this.nativeLensDistortion = nativeLensDistortionCreate(bArr, i, i2);
    }

    private native long nativeLensDistortionCreate(byte[] bArr, int i, int i2);

    private native void nativeLensDistortionDestroy(long j);

    private native UvPoint nativeLensDistortionDistortedUvForUndistortedUv(long j, UvPoint uvPoint, int i);

    private native Mesh nativeLensDistortionGetDistortionMesh(long j, int i);

    private native void nativeLensDistortionGetEyeFromHeadMatrix(long j, int i, float[] fArr);

    private native void nativeLensDistortionGetEyeProjectionMatrix(long j, int i, float f, float f2, float[] fArr);

    private native UvPoint nativeLensDistortionUndistortedUvForDistortedUv(long j, UvPoint uvPoint, int i);

    public void close() {
        nativeLensDistortionDestroy(this.nativeLensDistortion);
        this.nativeLensDistortion = 0L;
    }

    public UvPoint distortedUvForUndistortedUv(UvPoint uvPoint, int i) {
        return nativeLensDistortionDistortedUvForUndistortedUv(this.nativeLensDistortion, uvPoint, i);
    }

    protected void finalize() {
        close();
        super.finalize();
    }

    public Mesh getDistortionMesh(int i) {
        return nativeLensDistortionGetDistortionMesh(this.nativeLensDistortion, i);
    }

    public void getEyeFromHeadMatrix(int i, float[] fArr) {
        nativeLensDistortionGetEyeFromHeadMatrix(this.nativeLensDistortion, i, fArr);
    }

    public void getEyeProjectionMatrix(int i, float f, float f2, float[] fArr) {
        nativeLensDistortionGetEyeProjectionMatrix(this.nativeLensDistortion, i, f, f2, fArr);
    }

    public UvPoint undistortedUvForDistortedUv(UvPoint uvPoint, int i) {
        return nativeLensDistortionUndistortedUvForDistortedUv(this.nativeLensDistortion, uvPoint, i);
    }
}
