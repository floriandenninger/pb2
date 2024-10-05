package com.google.android.apps.youtube.app.extensions.reel.util;

import defpackage.angq;
import defpackage.aok;
import defpackage.fjz;
import defpackage.gwr;
import defpackage.idr;
import defpackage.vgz;
import defpackage.ynm;
import defpackage.zor;
import defpackage.ztf;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelPresetTracker extends PresetTracker {
    public boolean h;

    public ReelPresetTracker(aok aokVar, ztf ztfVar, vgz vgzVar) {
        super(aokVar, ztfVar, vgzVar);
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.util.PresetTracker
    protected final void g() {
        ynm.m(this.g.b(new fjz(this.d, 6), angq.a), gwr.f);
    }

    @Override // com.google.android.apps.youtube.app.extensions.reel.util.PresetTracker
    public final void h(idr idrVar, zor zorVar) {
        String str = idrVar.k;
        List a = zorVar.a();
        if (k(str, a)) {
            this.f = str;
        } else if (this.h && k("AUTO", a)) {
            this.f = "AUTO";
        } else {
            this.f = "NORMAL";
        }
    }
}
