package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.e;
import defpackage.ecq;
import defpackage.ecr;
import defpackage.xiz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e extends ecq implements f {
    public xiz a;
    private final Handler b;

    public e(Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayServiceListener");
        this.b = handler;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f
    public final void a(final Bundle bundle) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.service.c
            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.a.a(bundle);
            }
        });
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            g(parcel.readInt(), parcel.readInt());
        } else if (i == 2) {
            f(parcel.createIntArray());
        } else {
            if (i != 3) {
                return false;
            }
            a((Bundle) ecr.a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f
    public final void f(final int[] iArr) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.service.d
            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.a.b(iArr);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.f
    public final void g(final int i, final int i2) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.service.b
            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.a.c(i, i2);
            }
        });
    }

    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayServiceListener");
    }
}
