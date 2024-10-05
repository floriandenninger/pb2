package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends ecp implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayServiceListener");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f
    public final void a(Bundle bundle) {
        Parcel pn = pn();
        ecr.g(pn, bundle);
        pp(3, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f
    public final void f(int[] iArr) {
        Parcel pn = pn();
        pn.writeIntArray(iArr);
        pp(2, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f
    public final void g(int i, int i2) {
        Parcel pn = pn();
        pn.writeInt(i);
        pn.writeInt(i2);
        pp(1, pn);
    }
}
