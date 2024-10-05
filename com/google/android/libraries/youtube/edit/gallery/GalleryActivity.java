package com.google.android.libraries.youtube.edit.gallery;

import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CameraEndpointOuterClass;
import defpackage.aadw;
import defpackage.aaea;
import defpackage.acsb;
import defpackage.acsg;
import defpackage.akap;
import defpackage.akaq;
import defpackage.akar;
import defpackage.akvf;
import defpackage.akwd;
import defpackage.akwg;
import defpackage.amkq;
import defpackage.anib;
import defpackage.aomw;
import defpackage.aone;
import defpackage.aonm;
import defpackage.aoob;
import defpackage.apnf;
import defpackage.apxf;
import defpackage.asht;
import defpackage.asiq;
import defpackage.avtn;
import defpackage.avtp;
import defpackage.avuj;
import defpackage.avwe;
import defpackage.ce;
import defpackage.dn;
import defpackage.ypa;
import defpackage.zfi;
import defpackage.zhr;
import defpackage.znv;
import defpackage.zom;
import defpackage.zvn;
import defpackage.zvs;
import defpackage.zvu;
import defpackage.zvy;
import defpackage.zxq;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GalleryActivity extends zvy implements zvs, akaq {
    private zvn A;
    private String C;
    private int D;
    public aaea b;
    public acsg c;
    public ypa d;
    public akvf e;
    public akwd f;
    public Handler g;
    public anib h;
    public zvu i;
    public akar j;
    public aadw m;
    public akap n;
    public akwg o;
    private znv r;
    private apxf t;
    private PermissionDescriptor[] u;
    private PermissionDescriptor[] v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;
    private static final long q = TimeUnit.DAYS.toSeconds(7);
    public static final zfi a = zxq.b;
    public boolean k = true;
    public boolean l = false;
    private boolean s = false;
    private boolean B = false;

    public static zom a(Context context) {
        return new zom(context, 2, "gallery", q, new zhr(0));
    }

    public static boolean k() {
        return Camera.getNumberOfCameras() > 0;
    }

    private final asht m() {
        aone createBuilder = asht.a.createBuilder();
        aone createBuilder2 = asiq.a.createBuilder();
        String str = this.C;
        createBuilder2.copyOnWrite();
        asiq asiqVar = (asiq) createBuilder2.instance;
        str.getClass();
        asiqVar.b |= 1;
        asiqVar.c = str;
        createBuilder.as(createBuilder2);
        return (asht) createBuilder.build();
    }

    private final void n() {
        znv znvVar = this.r;
        if (znvVar != null) {
            znvVar.au = null;
            this.r = null;
        }
    }

    private final void o() {
        zvu zvuVar = this.i;
        if (zvuVar != null) {
            zvuVar.c = null;
            this.i = null;
        }
    }

    private final void p() {
        akar akarVar = this.j;
        if (akarVar != null) {
            akarVar.aG(null);
            this.j = null;
        }
    }

    private final void q(ce ceVar) {
        dn k = getSupportFragmentManager().k();
        k.y(R.id.gallery_container, ceVar);
        k.a();
    }

    private final void r() {
        if (this.r == null) {
            int i = this.D;
            znv znvVar = new znv();
            Bundle bundle = new Bundle();
            bundle.putInt("TARGET_VIDEO_QUALITY", i);
            znvVar.af(bundle);
            this.r = znvVar;
        }
        zvn zvnVar = new zvn(this);
        this.A = zvnVar;
        znv znvVar2 = this.r;
        znvVar2.au = zvnVar;
        znvVar2.e = m();
        setRequestedOrientation(1);
    }

    private final void s() {
        if (this.i == null) {
            this.i = new zvu();
        }
        zvu zvuVar = this.i;
        zvuVar.c = this;
        zvuVar.ak = m();
        zvu zvuVar2 = this.i;
        zvuVar2.aj = this.z;
        zvuVar2.ai = this.y;
    }

    private final void t() {
        if (this.j == null) {
            akap akapVar = this.n;
            akapVar.e(this.u);
            akapVar.a = acsb.b(18635);
            akapVar.b = acsb.c(18638);
            akapVar.c = acsb.c(18636);
            akapVar.d = acsb.c(18637);
            akapVar.b(this.w);
            akapVar.c(this.x);
            PermissionDescriptor[] permissionDescriptorArr = this.v;
            if (permissionDescriptorArr != null) {
                this.n.d(permissionDescriptorArr);
            }
            this.j = this.n.a();
        }
        this.j.aG(this);
        this.j.aF(m());
    }

    @Override // defpackage.akaq
    public final void aJ() {
        finish();
    }

    @Override // defpackage.akaq
    public final void aK() {
        this.g.post(new Runnable() { // from class: zvm
            @Override // java.lang.Runnable
            public final void run() {
                GalleryActivity galleryActivity = GalleryActivity.this;
                if (galleryActivity.j == null || galleryActivity.i != null) {
                    return;
                }
                if (galleryActivity.k) {
                    galleryActivity.l = true;
                } else {
                    galleryActivity.j();
                }
            }
        });
    }

    public final apxf b() {
        Intent intent;
        byte[] byteArrayExtra;
        if (this.t == null && (intent = getIntent()) != null && (byteArrayExtra = intent.getByteArrayExtra("navigation_endpoint")) != null) {
            try {
                this.t = (apxf) aonm.parseFrom(apxf.a, byteArrayExtra, aomw.b());
            } catch (aoob unused) {
            }
        }
        return this.t;
    }

    public final void c(Uri uri, int i, Bundle bundle) {
        Intent intent = new Intent("com.google.android.youtube.intent.action.INTERNAL_UPLOAD");
        intent.setDataAndType(uri, "video/*");
        intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_frontend_upload_id", this.C);
        avuj avujVar = this.b.a().h;
        if (avujVar == null) {
            avujVar = avuj.a;
        }
        intent.putExtra("navigate_to_my_uploads", !avujVar.w);
        intent.putExtras(bundle);
        startActivityForResult(intent, i);
    }

    @Override // defpackage.zvs
    public final void f() {
        i();
    }

    @Override // defpackage.zvs
    public final void g() {
        finish();
    }

    @Override // defpackage.zvs
    public final void h(Uri uri, boolean z) {
        avtn avtnVar;
        if (uri != null) {
            Bundle bundle = new Bundle();
            apxf b = b();
            int i = 902;
            if (b != null && b.pY(CameraEndpointOuterClass.cameraEndpoint) && (((apnf) b.pX(CameraEndpointOuterClass.cameraEndpoint)).b & 4) != 0) {
                bundle.putBoolean("video_show_metadata", false);
                bundle.putBoolean("navigate_to_my_uploads", false);
                apxf b2 = b();
                int i2 = -1;
                if (b2 != null && b2.pY(CameraEndpointOuterClass.cameraEndpoint)) {
                    apnf apnfVar = (apnf) b2.pX(CameraEndpointOuterClass.cameraEndpoint);
                    if ((apnfVar.b & 4) != 0) {
                        avwe avweVar = apnfVar.d;
                        if (avweVar == null) {
                            avweVar = avwe.a;
                        }
                        i2 = avweVar.b;
                    }
                }
                bundle.putInt("video_time_limit_seconds", i2);
                i = 1800;
            }
            if (z) {
                avtnVar = avtn.UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SYSTEM_CAMERA;
            } else {
                avtnVar = avtn.UPLOAD_FLOW_SOURCE_YOUTUBE_APP_GALLERY;
            }
            bundle.putInt("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_source", avtnVar.k);
            c(uri, i, bundle);
        }
    }

    final void i() {
        amkq.N(this.z);
        r();
        q(this.r);
        p();
        o();
    }

    public final void j() {
        amkq.N(this.i == null);
        s();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.i.p(extras.getString("extra_gallery_secondary_action_class"));
        }
        setRequestedOrientation(-1);
        q(this.i);
        p();
        n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent == null || !intent.getBooleanExtra("close_gallery_on_successful_upload", false) || i2 != -1) {
            if (i == 902) {
                if (i2 == 0 && this.k) {
                    if (!this.B) {
                        if (this.i != null) {
                            o();
                            this.l = true;
                        } else if (this.r != null) {
                            n();
                            this.s = true;
                        }
                    }
                    String str = this.C;
                    if (str == null || akwd.f(str)) {
                        return;
                    }
                    this.C = this.f.b();
                    znv znvVar = this.r;
                    if (znvVar != null) {
                        znvVar.e = m();
                    }
                    zvu zvuVar = this.i;
                    if (zvuVar != null) {
                        zvuVar.ak = m();
                    }
                    akar akarVar = this.j;
                    if (akarVar != null) {
                        akarVar.aF(m());
                        return;
                    }
                    return;
                }
                i = 902;
            }
            super.onActivityResult(i, i2, intent);
            return;
        }
        setResult(-1, intent);
        finish();
    }

    @Override // defpackage.zv, android.app.Activity
    public final void onBackPressed() {
        akar akarVar = this.j;
        if (akarVar != null) {
            akarVar.q();
            return;
        }
        zvu zvuVar = this.i;
        if (zvuVar != null) {
            if (zvuVar.af) {
                return;
            }
            zvuVar.n();
            return;
        }
        znv znvVar = this.r;
        if (znvVar == null) {
            super.onBackPressed();
            return;
        }
        zvn zvnVar = znvVar.au;
        if (zvnVar != null) {
            zvnVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c0  */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.edit.gallery.GalleryActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onDestroy() {
        String str;
        super.onDestroy();
        if (isFinishing() && (str = this.C) != null && akwd.f(str)) {
            this.e.c(this.C, avtp.UPLOAD_PROCESSOR_ABANDONMENT_REASON_CANCELLED_CREATION);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.ci, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.k = true;
        this.B = false;
    }

    @Override // defpackage.ci, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.k = false;
        if (this.l) {
            if (this.i == null) {
                j();
            }
            this.l = false;
        } else if (this.s) {
            if (this.r == null) {
                i();
            }
            this.s = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zv, defpackage.er, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("interaction_bundle", this.c.J());
        bundle.putString("frontend_upload_id", this.C);
    }
}
