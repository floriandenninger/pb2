package com.google.android.libraries.youtube.mdx.manualpairing;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.youtube.R;
import defpackage.adau;
import defpackage.adax;
import defpackage.adbj;
import defpackage.adbq;
import defpackage.adyu;
import defpackage.ce;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PairWithTvActivity extends adax {
    private int b;

    @Override // defpackage.acxf
    protected final int a() {
        return this.b;
    }

    @Override // defpackage.acxf
    protected final void f(int i, Activity activity) {
        if (i == 0) {
            activity.setTitle(R.string.mdx_pair_with_tv_prefs_title);
            return;
        }
        if (i == 1) {
            activity.setTitle(R.string.mdx_pref_use_tv_code_title);
        } else {
            if (i == 2) {
                activity.setTitle(R.string.mdx_pref_delete_tv_codes_code_title);
                return;
            }
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown current index ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.acxf
    protected final boolean g(int i, ce ceVar) {
        if (i == 0) {
            return ceVar instanceof adbj;
        }
        if (i == 1) {
            return ceVar instanceof adbq;
        }
        if (i != 2) {
            return false;
        }
        return ceVar instanceof adau;
    }

    @Override // defpackage.acxf
    protected final boolean h(int i) {
        int i2 = this.b;
        if (i == i2) {
            return false;
        }
        adyu.ca(this, PairWithTvActivity.class, i2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acxf, defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (getIntent().getExtras() == null || getIntent().getExtras().getInt("useTvCode") != 1) {
            this.b = 0;
        } else {
            this.b = 1;
        }
        super.onCreate(bundle);
        setTheme(true != getIntent().getBooleanExtra("com.google.android.libraries.youtube.mdx.manualpairing.darkTheme", false) ? R.style.Mdx_Theme_Settings : R.style.Mdx_Theme_Settings_Dark);
        getSupportActionBar().j(true);
    }

    @Override // defpackage.acxf
    protected final ce b(int i) {
        if (i == 0) {
            return new adbj();
        }
        if (i == 1) {
            return new adbq();
        }
        if (i == 2) {
            return new adau();
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown current index ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
