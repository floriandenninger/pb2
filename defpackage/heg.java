package defpackage;

import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class heg {
    public final /* synthetic */ hel a;

    public heg(hel helVar) {
        this.a = helVar;
    }

    public final void a() {
        this.a.aO.a();
    }

    public final void b() {
        this.a.aO.c();
    }

    public final void c(int i) {
        MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator = this.a.aA;
        if (multiSegmentCameraProgressIndicator == null) {
            zga.b("Unexpected null recordingProgressIndicator in call to onRecordingDurationSelected");
            return;
        }
        amkq.E(i >= 0);
        multiSegmentCameraProgressIndicator.c = i;
        multiSegmentCameraProgressIndicator.postInvalidate();
    }

    public final void d() {
        hei heiVar = this.a.e;
        if (heiVar != null) {
            heiVar.lV();
        }
    }
}
