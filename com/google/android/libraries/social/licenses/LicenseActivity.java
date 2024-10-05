package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.youtube.R;
import defpackage.ml;
import defpackage.uye;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LicenseActivity extends ml {
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_activity);
        License license = (License) getIntent().getParcelableExtra("license");
        if (getSupportActionBar() != null) {
            getSupportActionBar().p(license.a);
            getSupportActionBar().l(true);
            getSupportActionBar().j(true);
            getSupportActionBar().B();
        }
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        long j = license.b;
        int i = license.c;
        String str2 = license.d;
        if (str2.isEmpty()) {
            str = uye.e(this, "third_party_licenses", j, i);
        } else {
            try {
                String d = uye.d(new BufferedInputStream(new FileInputStream(str2)), j, i);
                if (d != null) {
                    if (!d.isEmpty()) {
                        str = d;
                    }
                }
            } catch (FileNotFoundException unused) {
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 46);
            sb.append(str2);
            sb.append(" does not contain res/raw/third_party_licenses");
            throw new RuntimeException(sb.toString());
        }
        if (str == null) {
            finish();
        } else {
            textView.setText(str);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        final ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        final int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new Runnable() { // from class: vaa
                @Override // java.lang.Runnable
                public final void run() {
                    LicenseActivity licenseActivity = LicenseActivity.this;
                    int i2 = i;
                    ScrollView scrollView2 = scrollView;
                    Layout layout = ((TextView) licenseActivity.findViewById(R.id.license_activity_textview)).getLayout();
                    if (layout != null) {
                        scrollView2.scrollTo(0, layout.getLineTop(layout.getLineForOffset(i2)));
                    }
                }
            });
        }
    }

    @Override // defpackage.zv, defpackage.er, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        Layout layout = ((TextView) findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}
