package defpackage;

import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hee implements hoh {
    final /* synthetic */ hel a;

    public hee(hel helVar) {
        this.a = helVar;
    }

    @Override // defpackage.hoh
    public final void a() {
        this.a.aP();
        MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator = this.a.aA;
        if (multiSegmentCameraProgressIndicator != null) {
            multiSegmentCameraProgressIndicator.setVisibility(0);
        }
    }

    @Override // defpackage.hoh
    public final void b() {
        this.a.aI();
        MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator = this.a.aA;
        if (multiSegmentCameraProgressIndicator != null) {
            multiSegmentCameraProgressIndicator.setVisibility(4);
        }
    }
}
