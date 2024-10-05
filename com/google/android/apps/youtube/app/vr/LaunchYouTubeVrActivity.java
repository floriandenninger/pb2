package com.google.android.apps.youtube.app.vr;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.vr.ndk.base.DaydreamApi;
import defpackage.ahow;
import defpackage.ainy;
import defpackage.etx;
import defpackage.nmv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LaunchYouTubeVrActivity extends nmv {
    public ainy b;

    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        etx.h(this);
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setSystemUiVisibility(3846);
        setContentView(frameLayout);
        DaydreamApi create = DaydreamApi.create(getApplicationContext());
        if (create != null) {
            ahow.d(this, 2, create, this.b);
            create.close();
        }
    }
}
