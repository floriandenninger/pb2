package defpackage;

import com.google.mediapipe.framework.GlSyncToken;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aogc extends aogi {
    final /* synthetic */ aogd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aogc(aogd aogdVar, int i, int i2, int i3) {
        super(i, i2, i3);
        this.a = aogdVar;
    }

    @Override // defpackage.aogi, com.google.mediapipe.framework.TextureFrame
    public final void release() {
        super.release();
        this.a.b(this);
    }

    @Override // defpackage.aogi, com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public final void release(GlSyncToken glSyncToken) {
        super.release(glSyncToken);
        this.a.b(this);
    }
}
