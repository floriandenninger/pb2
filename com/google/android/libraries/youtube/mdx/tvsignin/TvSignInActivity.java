package com.google.android.libraries.youtube.mdx.tvsignin;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import defpackage.adrt;
import defpackage.adsf;
import defpackage.adsp;
import defpackage.adyu;
import defpackage.ce;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TvSignInActivity extends adsf {
    public String b;
    public ScreenId c;
    public String d;
    public int e;
    private boolean f;

    @Override // defpackage.acxf
    protected final int a() {
        return this.f ? 1 : 0;
    }

    @Override // defpackage.acxf
    protected final boolean g(int i, ce ceVar) {
        if (i == 0) {
            return ceVar instanceof adrt;
        }
        if (i != 1) {
            return false;
        }
        return ceVar instanceof adsp;
    }

    @Override // defpackage.acxf
    protected final boolean h(int i) {
        if (i == 0 || this.f) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.libraries.youtube.mdx.tvsignin.keyNotifyProgressApi", true);
        adyu.cb(this, TvSignInActivity.class, 0, bundle);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acxf, defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.b = getIntent().getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyAuthCode");
        this.c = new ScreenId(getIntent().getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyScreenId"));
        this.e = getIntent().getIntExtra("com.google.android.libraries.youtube.mdx.tvsignin.requestType", -1);
        String stringExtra = getIntent().getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountEmail");
        this.d = stringExtra;
        boolean z = false;
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            z = true;
        }
        this.f = z;
        super.onCreate(bundle);
    }

    @Override // defpackage.acxf
    protected final ce b(int i) {
        if (i == 0) {
            return new adrt();
        }
        if (i == 1) {
            return new adsp();
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown current index ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
