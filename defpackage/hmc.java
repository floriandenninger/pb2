package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShortsCreationEndpointOuterClass$ShortsCreationEndpoint;
import com.google.protos.youtube.api.innertube.ShortsCreationTitleRendererOuterClass;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hmc extends hln implements hei, hlh, icq, hhe {
    public static final amru a = amru.r(new PermissionDescriptor(0, acsb.c(31566), acsb.c(31569)));
    public static final amru b = amru.s(new PermissionDescriptor(1, acsb.c(31564), acsb.c(31567)), new PermissionDescriptor(2, acsb.c(31565), acsb.c(31568)));
    private ayqx aB;
    private int aC;
    private int aD;
    public hrv ae;
    public aahd af;
    public hrs ag;
    public acra ah;
    public hos ai;
    public hmw aj;
    public hrq ak;
    public hoz al;
    public hmb an;
    public apxf ao;
    public apxf ap;
    public aqdt aq;
    public hpa ar;
    public zxo as;
    public boolean au;
    public Context av;
    public boolean aw;
    public hfp ax;
    public vgz ay;
    public hol az;
    public Handler c;
    public hlo d;
    public gni e;
    public long at = 0;
    public final htv am = new hlz(this);

    private final zrx aU() {
        bue f = mN().f("editFragment");
        if (f instanceof zry) {
            return ((zry) f).r();
        }
        return null;
    }

    private final ammv aV() {
        apxf apxfVar = this.ao;
        if (apxfVar == null || apxfVar.pY(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)) {
            for (aulq aulqVar : ((ShortsCreationEndpointOuterClass$ShortsCreationEndpoint) this.ao.pX(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)).c) {
                if (aulqVar.pY(autj.a)) {
                    return ammv.j((auti) aulqVar.pX(autj.a));
                }
            }
            return amlr.a;
        }
        return amlr.a;
    }

    private final ammv aW() {
        apxf apxfVar = this.ao;
        if (apxfVar == null || apxfVar.pY(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)) {
            for (aulq aulqVar : ((ShortsCreationEndpointOuterClass$ShortsCreationEndpoint) this.ao.pX(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)).c) {
                if (aulqVar.pY(ShortsCreationTitleRendererOuterClass.shortsCreationTitleRenderer)) {
                    return ammv.j((auto) aulqVar.pX(ShortsCreationTitleRendererOuterClass.shortsCreationTitleRenderer));
                }
            }
            return amlr.a;
        }
        return amlr.a;
    }

    private final void aY(hel helVar) {
        helVar.getClass();
        helVar.e = this;
    }

    private final void aZ(hli hliVar) {
        hliVar.getClass();
        hliVar.d = this;
    }

    private final void ba(ce ceVar, String str) {
        dn k = mN().k();
        k.u(R.id.reel_container, ceVar, str);
        k.a();
    }

    private final void bb() {
        aM(jqr.c(this.ah, this.ao, 98539));
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        ci C = C();
        if (this.ar != null && C != null && C.isFinishing()) {
            this.ar.q();
        }
        ayrz.c((AtomicReference) this.aB);
    }

    @Override // defpackage.ce
    public final void Y(int i, String[] strArr, int[] iArr) {
        zxo zxoVar = this.as;
        if (zxoVar != null) {
            zxoVar.b(i, strArr, iArr);
        } else {
            zga.b("No active PermissionRequester to handle PermissionsResult");
        }
    }

    public final void aF(int i) {
        aX(null, i);
    }

    public final void aG() {
        this.ah.q(new acqx(acsb.c(135959)), null);
        this.ah.q(new acqx(acsb.c(135958)), null);
    }

    @Override // defpackage.icq
    public final void aH(ce ceVar) {
        dn k = mN().k();
        k.m(ceVar);
        k.a();
    }

    @Override // defpackage.icq
    public final void aI(axdj axdjVar) {
        zrx aU = aU();
        if (aU != null) {
            aU.b(axdjVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r7 == 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aJ(com.google.android.libraries.youtube.edit.common.DeviceLocalFile r12, int r13) {
        /*
            r11 = this;
            android.net.Uri r0 = r12.f()
            ci r1 = r11.C()
            r2 = 0
            if (r1 == 0) goto L14
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r0 = r1.getType(r0)
            goto L15
        L14:
            r0 = r2
        L15:
            r1 = 2132019244(0x7f14082c, float:1.9676817E38)
            if (r0 == 0) goto Le5
            java.lang.String r3 = "video/"
            boolean r0 = r0.startsWith(r3)
            if (r0 == 0) goto Le5
            ci r0 = r11.C()
            android.net.Uri r12 = r12.f()
            android.media.MediaMetadataRetriever r3 = new android.media.MediaMetadataRetriever
            r3.<init>()
            if (r0 == 0) goto Lae
            android.content.res.AssetFileDescriptor r4 = defpackage.uzm.d(r0, r12)     // Catch: java.lang.Exception -> Lb6
            java.io.FileDescriptor r4 = r4.getFileDescriptor()     // Catch: java.lang.Exception -> Lb6
            r3.setDataSource(r4)     // Catch: java.lang.Exception -> Lb6
            r3.setDataSource(r0, r12)     // Catch: java.lang.Exception -> Lb6
            r0 = 9
            java.lang.String r0 = r3.extractMetadata(r0)     // Catch: java.lang.Exception -> Lb6
            long r4 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> Lb6
            r0 = 18
            r6 = 0
            java.lang.String r0 = r3.extractMetadata(r0)     // Catch: java.lang.NumberFormatException -> L7e java.lang.Exception -> Lb6
            if (r0 == 0) goto L57
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L7e java.lang.Exception -> Lb6
            goto L58
        L57:
            r0 = 0
        L58:
            r7 = 19
            java.lang.String r7 = r3.extractMetadata(r7)     // Catch: java.lang.NumberFormatException -> L7e java.lang.Exception -> Lb6
            if (r7 == 0) goto L65
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L7e java.lang.Exception -> Lb6
            goto L66
        L65:
            r7 = 0
        L66:
            r8 = 24
            java.lang.String r8 = r3.extractMetadata(r8)     // Catch: java.lang.NumberFormatException -> L7e java.lang.Exception -> Lb6
            if (r8 == 0) goto L80
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L7e java.lang.Exception -> Lb6
            r9 = 90
            if (r8 == r9) goto L7a
            r9 = 270(0x10e, float:3.78E-43)
            if (r8 != r9) goto L80
        L7a:
            r10 = r7
            r7 = r0
            r0 = r10
            goto L80
        L7e:
            r0 = 0
            r7 = 0
        L80:
            if (r0 == 0) goto L85
            if (r7 != 0) goto L96
            goto L86
        L85:
            r6 = r7
        L86:
            android.graphics.Bitmap r7 = r3.getFrameAtTime()     // Catch: java.lang.Exception -> Lb6
            if (r7 == 0) goto L95
            int r0 = r7.getWidth()     // Catch: java.lang.Exception -> Lb6
            int r7 = r7.getHeight()     // Catch: java.lang.Exception -> Lb6
            goto L96
        L95:
            r7 = r6
        L96:
            r3.release()     // Catch: java.lang.Exception -> Lb6
            hfs r3 = com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata.e()     // Catch: java.lang.Exception -> Lb6
            r3.c(r12)     // Catch: java.lang.Exception -> Lb6
            r3.e(r0)     // Catch: java.lang.Exception -> Lb6
            r3.b(r7)     // Catch: java.lang.Exception -> Lb6
            r3.d(r4)     // Catch: java.lang.Exception -> Lb6
            com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata r2 = r3.a()     // Catch: java.lang.Exception -> Lb6
            goto Lbb
        Lae:
            java.io.FileNotFoundException r12 = new java.io.FileNotFoundException     // Catch: java.lang.Exception -> Lb6
            java.lang.String r0 = "Activity destroyed."
            r12.<init>(r0)     // Catch: java.lang.Exception -> Lb6
            throw r12     // Catch: java.lang.Exception -> Lb6
        Lb6:
            java.lang.String r12 = "Failed loading video from camera roll."
            defpackage.zga.b(r12)
        Lbb:
            if (r2 == 0) goto Ldd
            com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.$AutoValue_ShortsVideoMetadata r2 = (com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.C$AutoValue_ShortsVideoMetadata) r2
            int r12 = r2.c
            if (r12 == 0) goto Ldd
            long r0 = r2.d
            int r12 = r11.aD
            long r3 = (long) r12
            int r12 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r12 >= 0) goto Ld7
            ci r12 = r11.C()
            r13 = 2132019245(0x7f14082d, float:1.967682E38)
            defpackage.etx.T(r12, r13)
            return
        Ld7:
            android.net.Uri r12 = r2.a
            r11.aX(r12, r13)
            return
        Ldd:
            ci r12 = r11.C()
            defpackage.etx.T(r12, r1)
            return
        Le5:
            ci r12 = r11.C()
            defpackage.etx.T(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmc.aJ(com.google.android.libraries.youtube.edit.common.DeviceLocalFile, int):void");
    }

    public final void aK() {
        ci C = C();
        if (C != null) {
            C.runOnUiThread(new hlr(this, 1));
        }
    }

    public final void aL(boolean z) {
        aS(z, jqr.c(this.ah, this.ao, 99212));
    }

    public final void aM(apxf apxfVar) {
        hli hliVar = (hli) mN().f("galleryFragment");
        int i = 0;
        if (hliVar == null) {
            hliVar = hli.aH(false, apxfVar);
        }
        aZ(hliVar);
        ba(hliVar, "galleryFragment");
        if (this.aq != null) {
            this.c.post(new hlr(this, i));
        }
    }

    public final void aN(final int i, final int i2, final acra acraVar) {
        final ci C = C();
        if (C == null) {
            return;
        }
        C.runOnUiThread(new Runnable() { // from class: hls
            @Override // java.lang.Runnable
            public final void run() {
                hmc hmcVar = hmc.this;
                final acra acraVar2 = acraVar;
                int i3 = i;
                int i4 = i2;
                final Activity activity = C;
                if (acraVar2 != null) {
                    acraVar2.n(new acqx(acsb.c(31639)));
                    acraVar2.n(new acqx(acsb.c(31570)));
                }
                mh mhVar = new mh(hmcVar.av);
                mhVar.n(i3);
                mhVar.f(i4);
                mhVar.l(activity.getString(R.string.shorts_permission_open_settings_dialog_confirm), new DialogInterface.OnClickListener() { // from class: hlw
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        acra acraVar3 = acra.this;
                        Activity activity2 = activity;
                        amru amruVar = hmc.a;
                        if (acraVar3 != null) {
                            acraVar3.I(3, new acqx(acsb.c(31639)), null);
                        }
                        akai.c(activity2);
                    }
                });
                mhVar.i(activity.getString(R.string.shorts_permission_open_settings_dialog_dismiss), new DialogInterface.OnClickListener() { // from class: hlv
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        acra acraVar3 = acra.this;
                        amru amruVar = hmc.a;
                        if (acraVar3 != null) {
                            acraVar3.I(3, new acqx(acsb.c(31570)), null);
                        }
                    }
                });
                mhVar.q();
            }
        });
    }

    public final boolean aO(ce ceVar) {
        return (C().getSupportFragmentManager() == null || C().getSupportFragmentManager().a() <= 0) && ceVar != null && ceVar.av() && (ceVar instanceof hel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aP() {
        View view;
        if (!av() || this.s || this.H || !ar() || !at() || C() == null || (view = this.O) == null) {
            return false;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int width = rect.width();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        C().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        double d = width;
        double d2 = displayMetrics.widthPixels;
        Double.isNaN(d2);
        return d > d2 * 0.1d;
    }

    @Override // defpackage.icq
    public final void aQ() {
    }

    @Override // defpackage.icq
    public final void aR() {
    }

    public final void aS(boolean z, apxf apxfVar) {
        hel helVar = (hel) mN().f("cameraFragment");
        if (helVar == null) {
            helVar = hel.aY(z, apxfVar);
        }
        aY(helVar);
        this.ak.e(true);
        ba(helVar, "cameraFragment");
        if (this.aq != null) {
            this.c.post(new hlr(this, 0));
        }
    }

    @Override // defpackage.icq
    public final void aT(aone aoneVar) {
        zrx aU = aU();
        if (aU != null) {
            aU.l(aoneVar);
        }
    }

    @Override // defpackage.hhe
    public final void b() {
        bue f = mN().f("editFragment");
        if (f != null) {
            if (f instanceof acqz) {
                acra mM = ((acqz) f).mM();
                if (hpa.J(this.ar)) {
                    aS(false, jqr.c(mM, this.ao, 96638));
                    return;
                } else {
                    aF(4);
                    return;
                }
            }
            throw new RuntimeException("Edit fragment doesn't supply interaction logger");
        }
        hmb hmbVar = this.an;
        if (hmbVar != null) {
            hmbVar.f(false);
        }
    }

    @Override // defpackage.hhe
    public final void c() {
        this.an.f(true);
    }

    @Override // defpackage.hlh
    public final void g(DeviceLocalFile deviceLocalFile) {
        aJ(deviceLocalFile, 0);
    }

    @Override // defpackage.hlh
    public final void lU() {
        if (!this.aw) {
            aS(false, jqr.c(q(), this.ao, 96638));
            return;
        }
        hmb hmbVar = this.an;
        if (hmbVar != null) {
            hmbVar.f(false);
        }
    }

    @Override // defpackage.hei, defpackage.hlh
    public final void lV() {
        hlx hlxVar = new hlx(this, q(), 2);
        ynm.o(this, this.ay.a(), new hly(hlxVar, 1), new hly(hlxVar, 0));
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putBoolean("gallery_opened_on_create", this.aw);
        hpa hpaVar = this.ar;
        if (hpaVar != null) {
            hpaVar.w(bundle);
        }
        hlo hloVar = this.d;
        avcy avcyVar = hloVar.c;
        bundle.putByteArray("camera_swazzle_effects_settings_key", avcyVar != null ? avcyVar.toByteArray() : null);
        avxs avxsVar = hloVar.d;
        bundle.putByteArray("edit_kazoo_effects_settings_key", avxsVar != null ? avxsVar.toByteArray() : null);
        ShortsCreationSelectedTrack a2 = this.aj.a();
        if (a2 != null) {
            bundle.putParcelable("shorts_selected_audio_track", a2);
        }
        hoz hozVar = this.al;
        bundle.putInt("MIN_SEGMENT_DURATION_KEY", hozVar.a);
        bundle.putInt("MIN_PROJECT_DURATION_KEY", hozVar.b);
        bundle.putInt("MAX_PROJECT_DURATION_KEY", hozVar.c);
        bundle.putInt("CURRENT_PROJECT_DURATION_KEY", hozVar.d);
        bundle.putFloat("SPEED_MULTIPLIER_KEY", hozVar.e);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        float f;
        byte[] byteArray;
        super.mR(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 != null && (byteArray = bundle2.getByteArray("navigation_endpoint")) != null) {
            try {
                this.ao = (apxf) aonm.parseFrom(apxf.a, byteArray, aomw.b());
            } catch (aoob unused) {
            }
        }
        this.au = this.ae.d();
        this.aC = this.ae.a();
        int b2 = this.ae.b();
        this.aD = b2;
        hoz hozVar = this.al;
        int i = this.aC;
        if (bundle != null) {
            hozVar.b = bundle.getInt("MIN_SEGMENT_DURATION_KEY");
            hozVar.b = bundle.getInt("MIN_PROJECT_DURATION_KEY");
            hozVar.c = bundle.getInt("MAX_PROJECT_DURATION_KEY");
            hozVar.d = bundle.getInt("CURRENT_PROJECT_DURATION_KEY");
            f = bundle.getFloat("SPEED_MULTIPLIER_KEY");
        } else {
            hozVar.a = 160;
            hozVar.b = b2;
            hozVar.c = i;
            f = 1.0f;
        }
        hozVar.e = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x020b, code lost:
    
        if (r2 != 2) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0214, code lost:
    
        if (r5.D() != false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024f  */
    @Override // defpackage.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mg(android.view.LayoutInflater r17, android.view.ViewGroup r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmc.mg(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final hel p() {
        ce e;
        if (etx.S(this) && (e = mN().e(R.id.reel_container)) != null && etx.S(e) && (e instanceof hel)) {
            return (hel) e;
        }
        return null;
    }

    public final acra q() {
        if (!aP()) {
            return null;
        }
        ce e = mN().e(R.id.reel_container);
        if (e instanceof hel) {
            return ((hel) e).ae;
        }
        if (e instanceof hqw) {
            return ((hqw) e).av;
        }
        if (e instanceof hhd) {
            return ((hhd) e).a;
        }
        if (e instanceof hli) {
            return ((hli) e).ah;
        }
        return null;
    }

    public final void r() {
        hel helVar = (hel) mN().f("cameraFragment");
        if (helVar != null) {
            helVar.aF();
        }
    }

    public final void s() {
        ammv aV = aV();
        if (aV.h()) {
            this.aj.l((auti) aV.c());
        } else {
            afsi.b(1, 6, "[ShortsCreation][Android][Music]Pivot music cleared after showing dialog");
        }
        ammv aW = aW();
        if (!aW.h() || (((auto) aW.c()).b & 1) == 0) {
            return;
        }
        this.ar.u(((auto) aW.c()).c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aX(android.net.Uri r25, int r26) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmc.aX(android.net.Uri, int):void");
    }
}
