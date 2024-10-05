package com.google.android.libraries.youtube.mdx.smartremote;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import defpackage.aaq;
import defpackage.acqx;
import defpackage.acra;
import defpackage.acsb;
import defpackage.adpr;
import defpackage.adpw;
import defpackage.adqc;
import defpackage.adqf;
import defpackage.adyu;
import defpackage.akai;
import defpackage.akao;
import defpackage.akap;
import defpackage.akaq;
import defpackage.akar;
import defpackage.allo;
import defpackage.ce;
import defpackage.dd;
import defpackage.dn;
import defpackage.zga;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MdxSmartRemoteActivity extends adpr implements akaq {
    public acra c;
    public akai d;
    public int e;
    public int f = 1;
    public akap g;
    private dd j;
    private akar k;
    private static final String h = zga.a("MDX.MdxSmartRemoteActivity");
    private static final PermissionDescriptor[] i = new PermissionDescriptor[0];
    static final PermissionDescriptor[] b = {new PermissionDescriptor(2, acsb.c(65799), acsb.c(65800))};

    private final int j() {
        int i2 = 0;
        int intExtra = getIntent().getIntExtra("com.google.android.libraries.youtube.mdx.smartremote.startingUiMode", 0);
        int[] iArr = {1, 2, 3, 4, 5};
        if (intExtra < 0 || intExtra >= 5) {
            zga.b("Invalid UI mode.");
        } else {
            i2 = iArr[intExtra];
        }
        this.f = i2;
        if (i2 != 0) {
            return i2;
        }
        zga.c(h, "Starting UI mode was invalid.");
        this.f = 1;
        return 1;
    }

    @Override // defpackage.acxf
    protected final int a() {
        int j = j();
        this.f = j;
        return (j == 3 && Build.VERSION.SDK_INT >= 23 && akai.f(this, b)) ? 1 : 0;
    }

    @Override // defpackage.akaq
    public final void aJ() {
        if (this.f == 4) {
            adyu.ca(this, MdxSmartRemoteActivity.class, 0);
        } else {
            finish();
        }
    }

    @Override // defpackage.akaq
    public final void aK() {
        adyu.ca(this, MdxSmartRemoteActivity.class, 0);
    }

    @Override // defpackage.acxf
    protected final void f(int i2, Activity activity) {
        if (i2 == 0) {
            activity.setTitle(R.string.mdx_smart_remote_title);
        } else {
            if (i2 == 1) {
                activity.setTitle(R.string.mdx_smart_remote_permission_fragment_title);
                return;
            }
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown current index ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.acxf
    protected final boolean g(int i2, ce ceVar) {
        if (i2 == 0) {
            return ceVar instanceof adqf;
        }
        if (i2 != 1) {
            return false;
        }
        return ceVar instanceof akar;
    }

    @Override // defpackage.acxf
    protected final boolean h(int i2) {
        if (i2 == 0) {
            return false;
        }
        if (i2 == 1) {
            aJ();
            return true;
        }
        adyu.ca(this, MdxSmartRemoteActivity.class, 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.acxf, defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f = j();
        this.e = getIntent().getIntExtra("com.google.android.libraries.youtube.mdx.smartremote.dialogStyle", 2132083834);
        dd supportFragmentManager = getSupportFragmentManager();
        this.j = supportFragmentManager;
        if (bundle != null) {
            akar akarVar = (akar) supportFragmentManager.g(bundle, "permission_request_fragment");
            this.k = akarVar;
            if (akarVar == null || akai.f(this, b)) {
                return;
            }
            dn k = this.j.k();
            k.l(this.k);
            k.a();
        }
    }

    @Override // defpackage.ci, defpackage.zv, android.app.Activity, defpackage.ahn
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (i2 != 1234) {
            if (i2 == 65538 && (getSupportFragmentManager().e(android.R.id.content) instanceof akar)) {
                if (iArr.length <= 0 || iArr[0] != 0) {
                    if (this.d.k(this, new String[]{"android.permission.RECORD_AUDIO"})) {
                        this.c.I(3, new acqx(acsb.c(69588)), null);
                    } else {
                        this.c.I(3, new acqx(acsb.c(69586)), null);
                    }
                    finish();
                    return;
                }
                this.c.I(3, new acqx(acsb.c(69585)), null);
                aK();
                return;
            }
            return;
        }
        ce e = getSupportFragmentManager().e(android.R.id.content);
        if (e instanceof adqf) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                adqc adqcVar = ((adqf) e).a;
                View view = adqcVar.m;
                if (view == null) {
                    return;
                }
                allo m = allo.m(view, R.string.mdx_smart_remote_no_microphone_detected_error_message, 0);
                m.q(R.string.mdx_smart_remote_navigate_to_settings_action_button_text, new adpw(adqcVar, 5));
                m.h();
                adqcVar.h.n(new acqx(acsb.c(63269)));
                return;
            }
            ((adqf) e).a.h();
        }
    }

    @Override // defpackage.acxf
    protected final ce b(int i2) {
        if (i2 == 0) {
            return new adqf();
        }
        if (i2 == 1) {
            this.c.n(new acqx(acsb.c(69585)));
            this.c.n(new acqx(acsb.c(69586)));
            this.c.n(new acqx(acsb.c(69588)));
            akap akapVar = this.g;
            akapVar.e(b);
            akapVar.d(i);
            akapVar.a = acsb.b(69692);
            akapVar.b = acsb.c(73767);
            akapVar.c = acsb.c(73768);
            akapVar.d = acsb.c(69587);
            akapVar.b(R.string.mdx_smart_remote_permission_allow_access_description);
            akapVar.c(R.string.mdx_smart_remote_permission_open_settings_description);
            akapVar.e = R.string.mdx_smart_remote_permission_fragment_title;
            akao a = akapVar.a();
            a.d = new aaq(this, R.style.Mdx_Theme_SmartRemote);
            a.a = this;
            return a;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown current index ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
