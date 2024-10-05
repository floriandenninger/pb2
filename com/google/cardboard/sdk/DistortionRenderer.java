package com.google.cardboard.sdk;

import com.google.cardboard.sdk.nativetypes.EyeTextureDescription;
import com.google.cardboard.sdk.nativetypes.Mesh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DistortionRenderer {
    private long nativeDistortionRenderer = nativeDistortionRendererCreate();

    private native long nativeDistortionRendererCreate();

    private native void nativeDistortionRendererDestroy(long j);

    private native void nativeDistortionRendererRenderEyeToDisplay(long j, long j2, int i, int i2, int i3, int i4, EyeTextureDescription eyeTextureDescription, EyeTextureDescription eyeTextureDescription2);

    private native void nativeDistortionRendererSetMesh(long j, Mesh mesh, int i);

    public void close() {
        nativeDistortionRendererDestroy(this.nativeDistortionRenderer);
        this.nativeDistortionRenderer = 0L;
    }

    protected void finalize() {
        close();
        super.finalize();
    }

    public void renderEyeToDisplay(long j, int i, int i2, int i3, int i4, EyeTextureDescription eyeTextureDescription, EyeTextureDescription eyeTextureDescription2) {
        nativeDistortionRendererRenderEyeToDisplay(this.nativeDistortionRenderer, j, i, i2, i3, i4, eyeTextureDescription, eyeTextureDescription2);
    }

    public void setMesh(Mesh mesh, int i) {
        nativeDistortionRendererSetMesh(this.nativeDistortionRenderer, mesh, i);
    }
}
