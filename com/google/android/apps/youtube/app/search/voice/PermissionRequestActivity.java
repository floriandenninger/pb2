package com.google.android.apps.youtube.app.search.voice;

import android.os.Bundle;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import defpackage.acsb;
import defpackage.akap;
import defpackage.akaq;
import defpackage.akar;
import defpackage.dn;
import defpackage.lhq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PermissionRequestActivity extends lhq implements akaq {
    private static final PermissionDescriptor[] c = {new PermissionDescriptor(2, acsb.c(65799), acsb.c(65800))};
    public akap b;

    @Override // defpackage.akaq
    public final void aJ() {
        setResult(0);
        finish();
    }

    @Override // defpackage.akaq
    public final void aK() {
        setResult(-1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        akar akarVar;
        super.onCreate(bundle);
        if (bundle == null) {
            akap akapVar = this.b;
            akapVar.e(c);
            akapVar.a = acsb.b(69076);
            akapVar.b = acsb.c(69077);
            akapVar.c = acsb.c(69078);
            akapVar.d = acsb.c(69079);
            akapVar.b(R.string.vs_permission_allow_access_description);
            akapVar.c(R.string.vs_permission_open_settings_description);
            akapVar.e = R.string.permission_fragment_title;
            akarVar = akapVar.a();
            dn k = getSupportFragmentManager().k();
            k.p(android.R.id.content, akarVar);
            k.a();
        } else {
            akarVar = (akar) getSupportFragmentManager().e(android.R.id.content);
        }
        akarVar.aG(this);
    }
}
