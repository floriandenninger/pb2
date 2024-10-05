package com.google.android.apps.youtube.app.extensions.reel.edit.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.youtube.R;
import defpackage.acqz;
import defpackage.acra;
import defpackage.acsg;
import defpackage.aomw;
import defpackage.aonm;
import defpackage.aoob;
import defpackage.apxf;
import defpackage.ce;
import defpackage.dn;
import defpackage.etx;
import defpackage.hrx;
import defpackage.htq;
import defpackage.htu;
import defpackage.htw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelCameraActivity extends hrx implements htw, acqz {
    public htu b;
    public acsg c;
    private apxf d;

    public final apxf b() {
        Intent intent;
        byte[] byteArrayExtra;
        if (this.d == null && (intent = getIntent()) != null && (byteArrayExtra = intent.getByteArrayExtra("navigation_endpoint")) != null) {
            try {
                this.d = (apxf) aonm.parseFrom(apxf.a, byteArrayExtra, aomw.b());
            } catch (aoob unused) {
            }
        }
        return this.d;
    }

    @Override // defpackage.htw
    public final void c() {
        finish();
    }

    @Override // defpackage.htw
    public final void f() {
    }

    @Override // defpackage.acqz
    public final acra mM() {
        return this.c;
    }

    @Override // defpackage.zv, android.app.Activity
    public final void onBackPressed() {
        if (((htq) this.b.aq).a.be()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        etx.h(this);
        super.onCreate(bundle);
        this.c.K(bundle != null ? bundle.getBundle("BUNDLE_INTERACTION_BUNDLE") : null, b());
        setContentView(R.layout.reel_camera_activity);
        ce e = getSupportFragmentManager().e(R.id.reel_creation_container);
        if (e instanceof htu) {
            htu htuVar = (htu) e;
            this.b = htuVar;
            htuVar.ar = this;
        } else {
            htu p = htu.p(b(), false, false);
            this.b = p;
            p.ar = this;
            dn k = getSupportFragmentManager().k();
            k.y(R.id.reel_creation_container, this.b);
            k.a();
        }
    }

    @Override // defpackage.ml, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.b.aq.a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (this.b.aq.b(i)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.b.aq.c(i)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, android.app.Activity
    public final void onPause() {
        if (isFinishing()) {
            setRequestedOrientation(-1);
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zv, defpackage.er, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("BUNDLE_INTERACTION_BUNDLE", this.c.J());
    }
}
