package defpackage;

import android.os.IInterface;
import com.google.vr.vrcore.common.api.HeadTrackingState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface axhj extends IInterface {
    void applyColorfulFade(int i, long j, int i2);

    void applyFade(int i, long j);

    void deprecated_setLensOffsets(float f, float f2, float f3, float f4);

    void dumpDebugData();

    void invokeCloseAction();

    void recenterHeadTracking();

    HeadTrackingState requestStopTracking();

    void resumeHeadTracking(HeadTrackingState headTrackingState);

    void setLensOffset(float f, float f2, float f3);
}
