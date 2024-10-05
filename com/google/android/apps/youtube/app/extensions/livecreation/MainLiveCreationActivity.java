package com.google.android.apps.youtube.app.extensions.livecreation;

import android.os.Bundle;
import android.view.ViewStub;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.youtube.R;
import defpackage.akcy;
import defpackage.etx;
import defpackage.gbh;
import defpackage.gzo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MainLiveCreationActivity extends gzo {
    public gbh a;
    public akcy b;

    @Override // com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity
    protected final void g(ViewStub viewStub) {
        viewStub.setLayoutResource(R.layout.bottom_ui_container);
        this.a.d((BottomUiContainer) viewStub.inflate());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity, defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        etx.h(this);
        super.onCreate(bundle);
        this.b.g(findViewById(android.R.id.content));
    }
}
