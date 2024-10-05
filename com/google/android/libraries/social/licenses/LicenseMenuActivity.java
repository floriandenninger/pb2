package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.youtube.R;
import defpackage.dd;
import defpackage.dn;
import defpackage.ml;
import defpackage.vac;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LicenseMenuActivity extends ml {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        if (getSupportActionBar() != null) {
            getSupportActionBar().j(true);
        }
        dd supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.e(R.id.license_menu_fragment_container) instanceof vac) {
            return;
        }
        vac vacVar = new vac();
        dn k = supportFragmentManager.k();
        k.p(R.id.license_menu_fragment_container, vacVar);
        k.d();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
