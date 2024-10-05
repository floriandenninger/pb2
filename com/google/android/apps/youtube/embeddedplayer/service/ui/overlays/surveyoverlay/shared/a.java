package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.ecp;
import defpackage.ecr;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends ecp implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void a() {
        pp(7, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void f() {
        pp(2, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void g(f fVar) {
        Parcel pn = pn();
        ecr.i(pn, fVar);
        pp(1, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void h(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(3, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void i() {
        pp(5, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void j(String str, List list, boolean z) {
        Parcel pn = pn();
        pn.writeString(str);
        pn.writeStringList(list);
        ecr.e(pn, z);
        pp(4, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void k(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(6, pn);
    }
}
