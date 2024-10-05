package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects;

import com.google.android.apps.youtube.app.extensions.reel.util.PresetTracker;
import defpackage.angq;
import defpackage.aok;
import defpackage.fjz;
import defpackage.gwr;
import defpackage.idr;
import defpackage.vgz;
import defpackage.ynm;
import defpackage.zor;
import defpackage.ztf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShortsPresetTracker extends PresetTracker {
    public ShortsPresetTracker(aok aokVar, ztf ztfVar, vgz vgzVar) {
        super(aokVar, ztfVar, vgzVar);
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.util.PresetTracker
    protected final void g() {
        ynm.m(this.g.b(new fjz(this.d, 7), angq.a), gwr.d);
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.util.PresetTracker
    public final void h(idr idrVar, zor zorVar) {
        String str = idrVar.l;
        if (k(str, zorVar.a())) {
            this.f = str;
        } else {
            this.f = zorVar.b;
        }
    }
}
