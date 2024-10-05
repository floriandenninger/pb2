package com.google.android.apps.youtube.app.application.upgrade;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.application.upgrade.NewVersionAvailableActivity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import defpackage.aadw;
import defpackage.aahd;
import defpackage.aahk;
import defpackage.acqx;
import defpackage.acra;
import defpackage.acsb;
import defpackage.ajcq;
import defpackage.aqyg;
import defpackage.aswg;
import defpackage.atej;
import defpackage.avso;
import defpackage.enx;
import defpackage.etx;
import defpackage.ykp;
import defpackage.zgx;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NewVersionAvailableActivity extends enx implements View.OnClickListener {
    public acra b;
    public aadw c;
    private boolean d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private View i;
    private Intent j;

    private final void b() {
        Intent intent = this.j;
        if (intent != null) {
            this.b.I(3, new acqx(acsb.c(24403)), null);
            startActivity(intent);
        }
        finish();
    }

    private final void c() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        atej atejVar = this.c.b().k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        avso avsoVar = atejVar.e;
        if (avsoVar == null) {
            avsoVar = avso.a;
        }
        if ((avsoVar.b & 64) != 0) {
            aswg aswgVar = avsoVar.d;
            if (aswgVar == null) {
                aswgVar = aswg.a;
            }
            aqyg aqygVar = aswgVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            Spanned b = ajcq.b(aqygVar);
            if (b != null && (textView4 = this.f) != null) {
                textView4.setText(b);
            }
            aqyg aqygVar2 = aswgVar.c;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            Spanned b2 = ajcq.b(aqygVar2);
            if (b2 != null && (textView3 = this.e) != null) {
                textView3.setText(b2);
            }
            aahd aahdVar = new aahd() { // from class: eny
                @Override // defpackage.aahd
                public final /* synthetic */ void a(apxf apxfVar) {
                    aahc.a(this, apxfVar);
                }

                @Override // defpackage.aahd
                public final /* synthetic */ void b(List list) {
                    aahc.b(this, list);
                }

                @Override // defpackage.aahd
                public final void c(apxf apxfVar, Map map) {
                    NewVersionAvailableActivity newVersionAvailableActivity = NewVersionAvailableActivity.this;
                    if (apxfVar.pY(UrlEndpointOuterClass.urlEndpoint)) {
                        ykp.f(newVersionAvailableActivity, Uri.parse(((avuo) apxfVar.pX(UrlEndpointOuterClass.urlEndpoint)).c));
                    }
                }

                @Override // defpackage.aahd
                public final /* synthetic */ void d(List list, Map map) {
                    aahc.c(this, list, map);
                }

                @Override // defpackage.aahd
                public final /* synthetic */ void e(List list, Object obj) {
                    aahc.d(this, list, obj);
                }
            };
            aqyg aqygVar3 = aswgVar.b;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
            Spanned a = aahk.a(aqygVar3, aahdVar, false);
            if (a != null && (textView2 = this.h) != null) {
                textView2.setText(a);
            }
            aqyg aqygVar4 = aswgVar.e;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            Spanned b3 = ajcq.b(aqygVar4);
            if (b3 != null && b3.length() > 0 && (textView = this.g) != null) {
                textView.setText(b3);
            }
            if (aswgVar.f) {
                TextView textView5 = this.e;
                if (textView5 != null) {
                    textView5.setVisibility(8);
                }
                View view = this.i;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
        }
    }

    @Override // defpackage.zv, android.app.Activity
    public final void onBackPressed() {
        TextView textView = this.f;
        if (textView == null || textView.getVisibility() != 0) {
            finish();
        } else {
            b();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.e) {
            this.b.I(3, new acqx(acsb.c(24404)), null);
            ykp.j(this, true != this.d ? "unknown" : "force", zgx.c(this));
            finish();
        } else if (view == this.f) {
            b();
        }
    }

    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        etx.h(this);
        super.onCreate(bundle);
        setContentView(R.layout.new_version_available_activity);
        Intent intent = getIntent();
        this.j = (Intent) intent.getParcelableExtra("forward_intent");
        this.d = intent.getBooleanExtra("show_force_upgrade", false);
        TextView textView = (TextView) findViewById(R.id.install_button);
        this.e = textView;
        textView.setOnClickListener(this);
        this.i = findViewById(R.id.install_button_background);
        this.h = (TextView) findViewById(R.id.upgrade_details);
        this.g = (TextView) findViewById(R.id.title);
        this.f = (TextView) findViewById(R.id.later_button);
        c();
        if (this.d) {
            this.b.d(acsb.b(24402), null, null);
            this.b.n(new acqx(acsb.c(24404)));
            TextView textView2 = this.f;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        this.b.d(acsb.b(24400), null, null);
        this.b.n(new acqx(acsb.c(24404)));
        this.b.n(new acqx(acsb.c(24403)));
        TextView textView3 = this.f;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStart() {
        super.onStart();
        c();
    }
}
