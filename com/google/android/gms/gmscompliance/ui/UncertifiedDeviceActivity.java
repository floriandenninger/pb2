package com.google.android.gms.gmscompliance.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.gmscompliance.ui.UncertifiedDeviceActivity;
import com.google.android.youtube.R;
import defpackage.aih;
import defpackage.altm;
import defpackage.altn;
import defpackage.alug;
import defpackage.ammr;
import defpackage.azpg;
import defpackage.gn;
import defpackage.ml;
import defpackage.qyu;
import defpackage.vlu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UncertifiedDeviceActivity extends ml {
    public static qyu a(Context context) {
        return new qyu(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (TextUtils.isEmpty("glif_v3_light")) {
            i = 0;
        } else {
            if (alug.a == null) {
                azpg azpgVar = new azpg((byte[]) null);
                azpgVar.b = R.style.SudThemeGlif_DayNight;
                azpgVar.b();
                alug.a = azpgVar.a();
            }
            azpg azpgVar2 = new azpg(alug.a);
            azpgVar2.b = 0;
            azpgVar2.b();
            i = true != azpgVar2.a().d ? R.style.SudThemeGlifV3_Light : R.style.SudThemeGlifV3_DayNight;
        }
        if (i != 0) {
            setTheme(i);
        }
        Window window = getWindow();
        ammr ammrVar = altn.a;
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.systemUiVisibility &= -5635;
        window.setAttributes(attributes);
        altm altmVar = new altm();
        altmVar.b = window;
        altmVar.c = 3;
        altmVar.d.run();
        TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{android.R.attr.statusBarColor, android.R.attr.navigationBarColor});
        int color = obtainStyledAttributes.getColor(0, 0);
        int color2 = obtainStyledAttributes.getColor(1, 0);
        window.setStatusBarColor(color);
        window.setNavigationBarColor(color2);
        obtainStyledAttributes.recycle();
        setContentView(R.layout.auth_uncertified_activity_v2);
        if (getIntent().getBooleanExtra("overrideNavBarColor", false)) {
            getWindow().setNavigationBarColor(aih.d(this, R.color.play_protect_auth_navigation_bar_color));
        }
        vlu.k((TextView) findViewById(R.id.play_protect_body_text), LinkMovementMethod.getInstance());
        Button button = (Button) findViewById(R.id.goToWebsiteButton);
        if (button != null) {
            String stringExtra = getIntent().getStringExtra("customCtaText");
            final Intent intent = (Intent) getIntent().getParcelableExtra("ctaIntent");
            if (TextUtils.isEmpty(stringExtra) || intent == null) {
                button.setVisibility(4);
            } else {
                final Bundle bundleExtra = getIntent().getBundleExtra("ctaIntentOptions");
                button.setText(stringExtra);
                button.setOnClickListener(new View.OnClickListener() { // from class: qyt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UncertifiedDeviceActivity.this.startActivity(intent, bundleExtra);
                    }
                });
            }
        }
        TextView textView = (TextView) findViewById(R.id.play_protect_custom_body_text);
        if (textView != null) {
            String stringExtra2 = getIntent().getStringExtra("customBodyText");
            if (TextUtils.isEmpty(stringExtra2)) {
                textView.setVisibility(4);
            } else {
                textView.setText(gn.i(stringExtra2));
                vlu.k(textView, LinkMovementMethod.getInstance());
                final Intent intent2 = (Intent) getIntent().getParcelableExtra("customBodyTextOnClickIntent");
                if (intent2 != null) {
                    textView.setOnClickListener(new View.OnClickListener() { // from class: qys
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UncertifiedDeviceActivity.this.startActivity(intent2);
                        }
                    });
                }
            }
        }
        Button button2 = (Button) findViewById(R.id.finishButton);
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: qyr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UncertifiedDeviceActivity.this.finish();
                }
            });
        }
    }
}
