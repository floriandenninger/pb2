package com.google.android.libraries.youtube.comment.image;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ImagePreviewSelectCommandOuterClass;
import com.google.protos.youtube.api.innertube.ImagePreviewSelectRendererOuterClass;
import com.google.protos.youtube.api.innertube.UpdateImagePreviewCommandOuterClass;
import defpackage.aahg;
import defpackage.akaf;
import defpackage.amkq;
import defpackage.aong;
import defpackage.apik;
import defpackage.apmg;
import defpackage.apxf;
import defpackage.aqyg;
import defpackage.argg;
import defpackage.argh;
import defpackage.aulq;
import defpackage.avsd;
import defpackage.ce;
import defpackage.dn;
import defpackage.wcy;
import defpackage.xrt;
import defpackage.xrw;
import defpackage.xse;
import defpackage.xsl;
import defpackage.xsu;
import defpackage.xsv;
import defpackage.xta;
import defpackage.xtb;
import defpackage.xth;
import defpackage.xug;
import defpackage.xuh;
import defpackage.xun;
import defpackage.zga;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ImageGalleryActivity extends xrw implements xsu, xta {
    public xun b;
    public xtb c;
    private BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint d;

    public static Intent b(Context context, apxf apxfVar) {
        Intent intent = new Intent(context, (Class<?>) ImageGalleryActivity.class);
        intent.putExtra("navigation_endpoint", apxfVar.toByteArray());
        return intent;
    }

    private final void i(ce ceVar, boolean z) {
        dn k = getSupportFragmentManager().k();
        k.y(R.id.fragment_container, ceVar);
        if (z) {
            k.s(null);
        }
        k.k();
    }

    private final void j(argg arggVar, boolean z) {
        xth xthVar = new xth();
        Bundle bundle = new Bundle();
        bundle.putParcelable("image_preview_select_endpoint", amkq.cl(arggVar));
        xthVar.af(bundle);
        i(xthVar, z);
    }

    @Override // defpackage.xsu
    public final void c(xrt xrtVar, int i) {
        apik apikVar = this.d.f;
        if (apikVar == null) {
            apikVar = apik.a;
        }
        if (apikVar.b != 135384379) {
            BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = this.d;
            if ((backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.b & 128) != 0) {
                apxf apxfVar = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.h;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                if (apxfVar.pY(ImagePreviewSelectCommandOuterClass.imagePreviewSelectCommand)) {
                    this.c.d();
                    BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint2 = this.d;
                    if (!backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint2.i) {
                        apxf apxfVar2 = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint2.h;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        j((argg) apxfVar2.pX(ImagePreviewSelectCommandOuterClass.imagePreviewSelectCommand), true);
                    }
                    xtb xtbVar = this.c;
                    xug a = xuh.a();
                    a.d(xrtVar.a);
                    a.b(xrtVar.f);
                    xtbVar.e(a.a());
                    return;
                }
            }
            onBackPressed();
            xun xunVar = this.b;
            BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint3 = this.d;
            xunVar.c(backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint3.c, backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint3.d, xrtVar.a);
            return;
        }
        i(xse.o(this.d, xrtVar.a), false);
    }

    @Override // defpackage.xta
    public final void g(xuh xuhVar, apmg apmgVar) {
        BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = this.d;
        if (backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint != null) {
            this.b.c(backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.c, backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.d, xuhVar.a);
            if (this.d.i) {
                onBackPressed();
            }
        }
    }

    public final void h(BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint) {
        int i = xsv.ag;
        backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.getClass();
        xsv xsvVar = new xsv();
        Bundle bundle = new Bundle();
        bundle.putParcelable("image_upload_endpoint", amkq.cl(backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint));
        xsvVar.af(bundle);
        xsvVar.e = this;
        i(xsvVar, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c.c(this);
        setRequestedOrientation(1);
        setContentView(R.layout.image_gallery_activity);
        Bundle extras = getIntent().getExtras();
        byte[] byteArray = extras != null ? extras.getByteArray("navigation_endpoint") : null;
        apxf b = byteArray != null ? aahg.b(byteArray) : null;
        if (b == null || !b.pY(ImagePreviewSelectCommandOuterClass.imagePreviewSelectCommand)) {
            if (b == null || !b.pY(BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.backstageImageUploadEndpoint)) {
                zga.b("BackstageImageUploadEndpoint is missing.");
                return;
            }
            this.d = (BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint) b.pX(BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.backstageImageUploadEndpoint);
            String[] o = akaf.o(this, xsv.a);
            if (o.length == 0) {
                h(this.d);
                return;
            }
            BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = this.d;
            String string = getResources().getString(R.string.image_gallery_permission_allow_access_description);
            String string2 = getResources().getString(R.string.image_gallery_permission_open_settings_description);
            amkq.E(o != null);
            string.getClass();
            string2.getClass();
            akaf akafVar = new akaf();
            Bundle bundle2 = new Bundle();
            bundle2.putStringArray("missing_permissions", o);
            bundle2.putCharSequence("allow_access_description", string);
            bundle2.putCharSequence("open_settings_description", string2);
            akafVar.af(bundle2);
            akafVar.d = new xsl(this, backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint);
            i(akafVar, false);
            return;
        }
        j((argg) b.pX(ImagePreviewSelectCommandOuterClass.imagePreviewSelectCommand), false);
    }

    @Override // defpackage.ci, android.app.Activity
    public final void onDestroy() {
        this.c.f(this);
        super.onDestroy();
    }

    @Override // defpackage.xta
    public final void qI(xuh xuhVar) {
        Drawable drawable;
        BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = this.d;
        if (backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint == null || !backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.i || (drawable = xuhVar.c) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = xuhVar.c.getIntrinsicHeight();
        if (intrinsicWidth == 0 || intrinsicHeight == 0) {
            return;
        }
        xug b = xuhVar.b();
        b.b = wcy.p(intrinsicWidth, intrinsicHeight);
        xuh a = b.a();
        xtb xtbVar = this.c;
        BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint2 = this.d;
        apmg apmgVar = null;
        if ((backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint2.b & 128) != 0) {
            apxf apxfVar = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint2.h;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            argg arggVar = (argg) apxfVar.pX(ImagePreviewSelectCommandOuterClass.imagePreviewSelectCommand);
            if (arggVar != null && (arggVar.b & 1) != 0) {
                aulq aulqVar = arggVar.c;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                argh arghVar = (argh) aulqVar.pX(ImagePreviewSelectRendererOuterClass.imagePreviewSelectRenderer);
                if (arghVar != null && (arghVar.b & 8) != 0) {
                    apxf apxfVar2 = arghVar.f;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    avsd avsdVar = (avsd) apxfVar2.pX(UpdateImagePreviewCommandOuterClass.updateImagePreviewCommand);
                    if (avsdVar != null && (avsdVar.b & 1) != 0) {
                        aulq aulqVar2 = avsdVar.c;
                        if (aulqVar2 == null) {
                            aulqVar2 = aulq.a;
                        }
                        if (aulqVar2.pY(ButtonRendererOuterClass.buttonRenderer)) {
                            aulq aulqVar3 = avsdVar.c;
                            if (aulqVar3 == null) {
                                aulqVar3 = aulq.a;
                            }
                            apmg apmgVar2 = (apmg) aulqVar3.pX(ButtonRendererOuterClass.buttonRenderer);
                            aong aongVar = (aong) apmg.a.createBuilder();
                            aqyg aqygVar = apmgVar2.i;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                            aongVar.copyOnWrite();
                            apmg apmgVar3 = (apmg) aongVar.instance;
                            aqygVar.getClass();
                            apmgVar3.i = aqygVar;
                            apmgVar3.b |= 256;
                            aong aongVar2 = (aong) apxf.a.createBuilder();
                            aongVar2.e(ImagePreviewSelectCommandOuterClass.imagePreviewSelectCommand, arggVar);
                            aongVar.copyOnWrite();
                            apmg apmgVar4 = (apmg) aongVar.instance;
                            apxf apxfVar3 = (apxf) aongVar2.build();
                            apxfVar3.getClass();
                            apmgVar4.p = apxfVar3;
                            apmgVar4.b |= 32768;
                            apmgVar = (apmg) aongVar.build();
                        }
                    }
                }
            }
        }
        xtbVar.b(a, apmgVar);
    }
}
