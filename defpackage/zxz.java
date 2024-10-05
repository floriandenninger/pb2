package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import com.google.android.libraries.video.trim.VideoTrimView;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioCrossFadeView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.libraries.youtube.edit.preview.EditableVideoControllerView;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class zxz extends ce implements View.OnClickListener, vsj, vxb, zyi {
    public SharedPreferences aA;
    public aaea aB;
    public ajjs aC;
    public azrw aD;
    public Handler aE;
    public boolean aF;
    public Uri aG;
    public zyj aH;
    public ArrayList aI;
    public acra aJ;
    public zxn aK;
    public boolean aL;
    public long aN;
    public boolean aP;
    public boolean aR;
    public agcm aW;
    private boolean af;
    private boolean ag;
    private zld ah;
    public File az;
    private boolean b;
    private boolean c;
    private vyj d;
    private zmf e;
    private final Object a = new Object();
    private vsm ae = vsm.a;
    public boolean aM = false;
    public int aO = 0;
    public ztl aV = null;
    public int aQ = 1;
    private long ai = -1;
    private Track aj = null;
    public zou aS = null;
    public zot aT = null;
    public asht aU = null;
    public final zry ay = new zry() { // from class: zxr
        @Override // defpackage.zry
        public final zrx r() {
            return zxz.this.aH.b.b();
        }
    };

    private final void a() {
        this.c = false;
        if (aT() != null) {
            aT().d();
            aM();
        }
    }

    private final void aM() {
        Track track = this.aH.h;
        boolean z = this.ae.c;
        AudioTrackView aT = aT();
        ImageButton br = br();
        aS();
        int i = 8;
        aT.setVisibility((track == null || (this.c && !z)) ? 8 : 0);
        if (br != null) {
            if (track != null && !z) {
                i = 0;
            }
            br.setVisibility(i);
            br.setImageResource(true != this.c ? R.drawable.audio_swap_mix_button : R.drawable.audio_swap_mix_done_button);
        }
        int intrinsicWidth = aii.a(C(), R.drawable.trim_handle_left).getIntrinsicWidth() / 2;
        int dimensionPixelSize = qX().getDimensionPixelSize(R.dimen.upload_edit_video_fragment_mixer_button_width);
        int i2 = true != z ? intrinsicWidth : 0;
        int i3 = (z || track == null) ? 0 : dimensionPixelSize - intrinsicWidth;
        bk(i3);
        bH(i3);
        bF(this.c, z, intrinsicWidth, i3, i2);
    }

    private final boolean aO(int i) {
        acra acraVar = this.aJ;
        if (acraVar == null) {
            return false;
        }
        acraVar.I(3, new acqx(acsb.c(i)), this.aU);
        return true;
    }

    private final void d(int i) {
        acra acraVar = this.aJ;
        if (acraVar == null) {
            return;
        }
        acraVar.n(new acqx(acsb.c(i)));
        this.aJ.w(new acqx(acsb.c(i)), this.aU);
    }

    private final void n(boolean z) {
        amkq.N(this.aL);
        if (z != this.c) {
            this.c = z;
            aM();
        }
    }

    private final void o(boolean z, boolean z2) {
        amkq.N(this.aH.p());
        ChooseFilterView aU = aU();
        if (z != aU.f) {
            aU.k(z2);
        }
    }

    private final void p(Uri uri) {
        oyr oxoVar;
        if (aT() != null) {
            zme zmeVar = this.e.a;
            zmeVar.k = this.aP;
            ci C = C();
            if (!uri.equals(zmeVar.a)) {
                zmeVar.a = uri;
                oxk oxkVar = zmeVar.b;
                if (oxkVar != null) {
                    oxkVar.i(zmeVar.c);
                    zmeVar.b.n();
                    zmeVar.b.h();
                }
                zmeVar.b = opn.s();
                zmeVar.h = 0L;
                zmeVar.i = 0;
                zmeVar.j = 0;
                zmeVar.g = 0;
                try {
                    zmeVar.e.close();
                } catch (IOException e) {
                    zga.d("Error closing DataOutputStream", e);
                }
                zmeVar.d.reset();
                zmeVar.e = new DataOutputStream(zmeVar.e);
                if (zmeVar.k) {
                    oxoVar = new pcg(uri, new pfv(C, pgz.l(C, "AudioMPEG")), new pft(65536), 1310720, new pbz[0]);
                } else {
                    oxoVar = new oxo(C, uri);
                }
                vuf vufVar = new vuf(oxoVar);
                vufVar.a = zmeVar;
                zmeVar.b.e(zmeVar.c);
                zmeVar.b.g(vufVar);
                zmeVar.b.l(true);
            }
            AudioTrackView aT = aT();
            vsy vsyVar = this.aH.d;
            vsm vsmVar = this.ae;
            aT.f = zmeVar;
            aT.d();
            aT.c = vsyVar;
            vsyVar.q(aT);
            aT.d = vsmVar;
            aT.d.f(aT);
            aT.e = new zmb(zmeVar, vsyVar, vsmVar, aT.getResources());
            aT.e.setCallback(aT);
            aT.a.a = vsyVar;
            aT.requestLayout();
            this.c = false;
            aM();
        }
    }

    @Override // defpackage.vsj
    public final void H() {
    }

    @Override // defpackage.vsj
    public final void J() {
        if (C() != null) {
            aM();
        }
    }

    @Override // defpackage.ce
    public final void T(int i, int i2, Intent intent) {
        super.T(i, i2, intent);
        if (i == 15911 && i2 == -1) {
            Parcelable parcelableExtra = intent.getParcelableExtra("audio_track");
            parcelableExtra.getClass();
            bz((Track) parcelableExtra);
            bg();
        }
    }

    @Override // defpackage.ce
    public void X() {
        super.X();
        aV().n(null);
        this.aH.f();
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        this.aH.g();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        C().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float fraction = qX().getFraction(q(), displayMetrics.heightPixels, displayMetrics.heightPixels);
        VideoWithPreviewView aQ = aQ();
        int i = (int) fraction;
        if (aQ.m != i) {
            aQ.m = i;
            aQ.p();
        }
        if (!this.aL || aG() == null) {
            return;
        }
        aG().setVisibility(0);
    }

    @Override // defpackage.zyi
    public final void aF() {
        bz(null);
        Toast.makeText(C(), qX().getString(R.string.upload_edit_video_fragment_audio_swap_error), 1).show();
    }

    protected View aG() {
        throw null;
    }

    @Override // defpackage.vxb
    public final void aH(boolean z) {
        if (z) {
            C().getWindow().addFlags(128);
            return;
        }
        C().getWindow().clearFlags(128);
        if (bo()) {
            aV().p();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View aI() {
        throw null;
    }

    @Override // defpackage.zyi
    public final void aJ(oxh oxhVar) {
        zga.d("Unable to play video", oxhVar);
        d(9916);
        bv(oxhVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract View aK();

    protected View aL() {
        return null;
    }

    protected abstract View aN();

    protected VideoMetaData aP(Context context, Uri uri) {
        return vux.a(context, uri);
    }

    protected abstract VideoWithPreviewView aQ();

    /* JADX INFO: Access modifiers changed from: protected */
    public VideoTrimView aR() {
        throw null;
    }

    protected AudioCrossFadeView aS() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AudioTrackView aT() {
        throw null;
    }

    protected abstract ChooseFilterView aU();

    protected abstract EditableVideoControllerView aV();

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f4  */
    @Override // defpackage.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void aa(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zxz.aa(android.view.View, android.os.Bundle):void");
    }

    public final void bA(acra acraVar) {
        acraVar.getClass();
        this.aJ = acraVar;
    }

    public final void bB(zou zouVar) {
        zouVar.getClass();
        this.aS = zouVar;
    }

    public final void bC(zot zotVar) {
        zotVar.getClass();
        this.aT = zotVar;
    }

    public final void bD(long j) {
        this.aN = Math.max(0L, j);
    }

    public final void bE(final String str) {
        amkq.N(bI());
        amkq.N(this.aH != null);
        final ChooseFilterView aU = aU();
        aU.getClass();
        bx(new Runnable() { // from class: zxt
            @Override // java.lang.Runnable
            public final void run() {
                zxn zxnVar;
                zxz zxzVar = zxz.this;
                ChooseFilterView chooseFilterView = aU;
                String str2 = str;
                if (chooseFilterView.c() != null) {
                    return;
                }
                zou zouVar = zxzVar.aS;
                chooseFilterView.o(zxzVar.aI, zxzVar.aK(), zouVar != null && zouVar.a(avwy.EFFECTS_FEATURE_DOT_ON_EFFECT_THUMBNAIL), false, zxzVar.aW, zxzVar);
                zot zotVar = zxzVar.aT;
                if (zotVar != null) {
                    zvk c = chooseFilterView.c();
                    c.getClass();
                    ((zto) zotVar).d = c;
                }
                chooseFilterView.c().registerObserver(new zxy(zxzVar, chooseFilterView));
                zxzVar.aH.b.l(zxzVar.aV, chooseFilterView.c());
                acra acraVar = zxzVar.aJ;
                if (acraVar != null && (zxnVar = zxzVar.aK) != null) {
                    chooseFilterView.l(acraVar, zxnVar);
                }
                if (str2 != null) {
                    chooseFilterView.g(str2);
                }
                zxzVar.bi();
            }
        });
    }

    protected void bF(boolean z, boolean z2, int i, int i2, int i3) {
    }

    protected void bG() {
    }

    protected void bH(int i) {
    }

    public final boolean bI() {
        ArrayList arrayList = this.aI;
        return (arrayList == null || arrayList.isEmpty() || this.aV == null) ? false : true;
    }

    public final void bJ(ztl ztlVar, ArrayList arrayList) {
        zyj zyjVar;
        vsy vsyVar;
        amkq.N(this.aV == null);
        amkq.N(this.aI == null);
        synchronized (this.a) {
            ztlVar.getClass();
            this.aV = ztlVar;
            this.aI = arrayList;
            if (aU() != null && (zyjVar = this.aH) != null && zyjVar.p() && (vsyVar = this.aH.d) != null) {
                bE(vsyVar.p());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ba(vsy vsyVar) {
    }

    protected void bd() {
        throw null;
    }

    protected void bg() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bi() {
        throw null;
    }

    protected void bk(int i) {
        VideoTrimView aR = aR();
        int dimensionPixelSize = qX().getDimensionPixelSize(R.dimen.video_trim_view_padding);
        if (aR != null) {
            aR.setPadding(0, dimensionPixelSize, i, 0);
        }
    }

    protected boolean bn() {
        return false;
    }

    protected abstract boolean bo();

    protected ImageButton br() {
        return null;
    }

    public final vsy bs() {
        return this.aH.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bt(final ammv ammvVar) {
        final boolean z;
        final boolean z2;
        zyj zyjVar;
        VideoMetaData videoMetaData = ammvVar.h() ? ((vsy) ammvVar.c()).b : null;
        final vyf a = videoMetaData != null ? this.d.a(videoMetaData) : null;
        VideoTrimView aR = aR();
        if (ammvVar.h()) {
            this.ae.h(this);
            long j = videoMetaData.g;
            vsm vsmVar = new vsm(j, j);
            this.ae = vsmVar;
            vsmVar.f(this);
            if (aR != null) {
                aR.p((vsy) ammvVar.c(), a, this.ae);
                if (aL() == null) {
                    z = true;
                    zyjVar = this.aH;
                    if (zyjVar == null && zyjVar.p()) {
                        d(10719);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    d(9917);
                }
            }
            z = false;
            zyjVar = this.aH;
            if (zyjVar == null) {
            }
            z2 = false;
            d(9917);
        } else {
            if (aR != null) {
                aR.p(null, null, vsm.a);
            }
            z = false;
            z2 = false;
        }
        final boolean z3 = this.aH.h != null;
        d(10709);
        d(10717);
        AudioCrossFadeView aS = aS();
        if (aS != null) {
            vsy vsyVar = (vsy) ammvVar.f();
            vsy vsyVar2 = aS.d;
            if (vsyVar2 != null) {
                vsyVar2.u(aS);
            }
            aS.d = vsyVar;
            if (vsyVar != null) {
                aS.c.setProgress(Math.round(vsyVar.e() * 100.0f));
                vsyVar.q(aS);
            }
        }
        aV().o((vsy) ammvVar.f());
        synchronized (this.a) {
            bx(new Runnable() { // from class: zxu
                @Override // java.lang.Runnable
                public final void run() {
                    zxz zxzVar = zxz.this;
                    ammv ammvVar2 = ammvVar;
                    zxzVar.aH.n((vsy) ammvVar2.f(), ammvVar2.h() ? ((vsy) ammvVar2.c()).b.a : null, a);
                    if (zxzVar.aH.p() && zxzVar.bI()) {
                        zxzVar.bE(ammvVar2.h() ? ((vsy) ammvVar2.c()).p() : null);
                    }
                }
            });
        }
        bx(new Runnable() { // from class: zxv
            @Override // java.lang.Runnable
            public final void run() {
                zxz zxzVar = zxz.this;
                boolean z4 = z;
                boolean z5 = z2;
                boolean z6 = z3;
                VideoTrimView aR2 = zxzVar.aR();
                if (aR2 != null) {
                    aR2.setVisibility(true != z4 ? 8 : 0);
                }
                if (zxzVar.aI() != null) {
                    zxzVar.aI().setVisibility(true != z5 ? 4 : 0);
                }
                AudioTrackView aT = zxzVar.aT();
                if (aT != null) {
                    aT.setVisibility(true == z6 ? 0 : 8);
                }
            }
        });
    }

    public final void bu(Uri uri, EditableVideoEdits editableVideoEdits, VideoMetaData videoMetaData) {
        vsy vsyVar;
        if (this.b) {
            zga.l("Unable to SetVideo after Fragment.onDestroyView");
            return;
        }
        if (editableVideoEdits != null && videoMetaData != null) {
            vsyVar = new vsy(editableVideoEdits, videoMetaData);
        } else if (editableVideoEdits != null) {
            vsyVar = new vsy(editableVideoEdits, aP(qR(), uri));
        } else if (uri != null) {
            Context qR = qR();
            long j = this.aN;
            vsx vsxVar = new vsx();
            vsxVar.a = aP(qR, uri);
            vsxVar.b(j);
            vsyVar = vsxVar.a();
            d(9915);
        } else {
            vsyVar = null;
        }
        if (vsyVar != null) {
            ba(vsyVar);
        }
        final VideoMetaData videoMetaData2 = vsyVar != null ? vsyVar.b : null;
        if (this.ag && videoMetaData2 != null && videoMetaData == null) {
            this.aE.post(new Runnable() { // from class: zxs
                /* JADX WARN: Removed duplicated region for block: B:36:0x006d A[Catch: IOException -> 0x0071, TRY_LEAVE, TryCatch #4 {IOException -> 0x0071, blocks: (B:41:0x0068, B:36:0x006d), top: B:40:0x0068 }] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r7 = this;
                        java.lang.String r0 = "Failed to close output stream."
                        zxz r1 = defpackage.zxz.this
                        com.google.android.libraries.video.media.VideoMetaData r2 = r2
                        defpackage.yjk.e()
                        java.io.File r3 = new java.io.File
                        java.io.File r4 = r1.az
                        java.lang.String r5 = "video_meta_data.raw"
                        r3.<init>(r4, r5)
                        r4 = 0
                        java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
                        r5.<init>(r3)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
                        java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
                        r3.<init>(r5)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
                        android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
                        r6 = 0
                        r2.writeToParcel(r4, r6)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
                        byte[] r2 = r4.marshall()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
                        r4.recycle()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
                        r3.write(r2)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
                        r3.flush()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
                        r2 = 1
                        r1.aR = r2     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
                        r3.close()     // Catch: java.io.IOException -> L3c
                        r5.close()     // Catch: java.io.IOException -> L3c
                        return
                    L3c:
                        defpackage.zga.b(r0)
                        return
                    L40:
                        r1 = move-exception
                        goto L65
                    L42:
                        r1 = move-exception
                        goto L48
                    L44:
                        r1 = move-exception
                        goto L66
                    L46:
                        r1 = move-exception
                        r3 = r4
                    L48:
                        r4 = r5
                        goto L4f
                    L4a:
                        r1 = move-exception
                        r5 = r4
                        goto L66
                    L4d:
                        r1 = move-exception
                        r3 = r4
                    L4f:
                        java.lang.String r2 = "Serialization Save Error: "
                        defpackage.zga.d(r2, r1)     // Catch: java.lang.Throwable -> L63
                        if (r3 == 0) goto L59
                        r3.close()     // Catch: java.io.IOException -> L5f
                    L59:
                        if (r4 == 0) goto L62
                        r4.close()     // Catch: java.io.IOException -> L5f
                        return
                    L5f:
                        defpackage.zga.b(r0)
                    L62:
                        return
                    L63:
                        r1 = move-exception
                        r5 = r4
                    L65:
                        r4 = r3
                    L66:
                        if (r4 == 0) goto L6b
                        r4.close()     // Catch: java.io.IOException -> L71
                    L6b:
                        if (r5 == 0) goto L74
                        r5.close()     // Catch: java.io.IOException -> L71
                        goto L74
                    L71:
                        defpackage.zga.b(r0)
                    L74:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.zxs.run():void");
                }
            });
        }
        bt(ammv.i(vsyVar));
    }

    protected void bv(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bw(IOException iOException) {
        zga.d("Failed to open video", iOException);
        String valueOf = String.valueOf(wcy.K(iOException));
        afsi.c(1, 9, valueOf.length() != 0 ? "youtubeBaseEditParse::".concat(valueOf) : new String("youtubeBaseEditParse::"), iOException);
        Toast.makeText(qR(), R.string.video_editor_fail_open_video, 1).show();
        C().finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void bx(Runnable runnable) {
        ci C = C();
        if (C != null) {
            C.runOnUiThread(runnable);
        }
    }

    public final void by() {
        Intent intent = (Intent) this.aD.get();
        acra acraVar = this.aJ;
        if (acraVar != null && acraVar.c() != null) {
            InteractionLoggingScreen c = this.aJ.c();
            intent.putExtra("parent_csn", c.a);
            intent.putExtra("parent_ve_type", c.f);
        }
        intent.putExtra("extractor_sample_source", this.aP);
        intent.putExtra("sunset_banner_enabled", this.aM);
        startActivityForResult(intent, 15911);
    }

    public final void bz(Track track) {
        float f;
        Uri uri;
        if (amkq.b(track, this.aH.h)) {
            return;
        }
        zyj zyjVar = this.aH;
        if (!amkq.b(track, zyjVar.h)) {
            Track track2 = zyjVar.h;
            zyjVar.h = track;
            long j = 0;
            zyjVar.d.w(0L);
            Track track3 = zyjVar.h;
            if (track3 != null) {
                uri = track3.d;
                f = track2 == null ? 0.3f : zyjVar.d.e();
                j = zyjVar.d.g();
            } else {
                f = 0.0f;
                uri = null;
            }
            zyjVar.d.x(uri);
            zyjVar.d.y(f);
            zyjVar.d.w(j);
        }
        this.af = false;
        bG();
        if (track == null) {
            a();
            return;
        }
        if (this.aH.p()) {
            o(false, true);
        }
        p(track.d);
    }

    @Override // defpackage.ce
    public void lZ() {
        super.lZ();
        VideoTrimView aR = aR();
        if (aR != null) {
            aR.p(null, null, vsm.a);
            vsm vsmVar = aR.q;
            if (vsmVar != null) {
                vsmVar.h(aR);
            }
        }
        AudioTrackView aT = aT();
        if (aT != null) {
            aT.d();
        }
        vsm vsmVar2 = this.ae;
        if (vsmVar2 != null) {
            vsmVar2.h(this);
        }
        EditableVideoControllerView aV = aV();
        aV.j(this);
        aV.o(null);
        zyj zyjVar = this.aH;
        zyjVar.g = null;
        zyjVar.o();
        this.aE.post(new zxw(this, 1, null));
        this.b = true;
    }

    @Override // defpackage.ce
    public void mQ(Bundle bundle) {
        bundle.putInt("max_hardware_decoders", this.aQ);
        bundle.putBoolean("extractor_sample_source_enabled", this.aP);
        bundle.putLong("max_video_duration_us", this.aN);
        bundle.putParcelable("video_uri", this.aH.c);
        vsy vsyVar = this.aH.d;
        bundle.putParcelable("editable_video_edits", vsyVar != null ? vsyVar.a : null);
        if (!this.ag) {
            vsy vsyVar2 = this.aH.d;
            bundle.putParcelable("video_meta_data", vsyVar2 != null ? vsyVar2.b : null);
        }
        bundle.putLong("playback_position", this.aH.e());
        bundle.putBoolean("audio_mixer_button_click_logged", this.af);
        bundle.putBoolean("audio_swap_enabled", this.aL);
        bundle.putParcelable("audio_swap_track", this.aH.h);
        bundle.putBoolean("audio_cross_fade_visible", this.c);
        boolean z = false;
        if (s() != null && s().getVisibility() == 0) {
            z = true;
        }
        bundle.putBoolean("audio_panel_visible", z);
        bundle.putInt("video_filter_pipeline", this.aO);
        bundle.putBoolean("video_filters_view_visible", aU().f);
        bundle.putBoolean("video_meta_data_saved_to_disk", this.aR);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == aG()) {
            aO(10709);
            if (this.aH.h != null) {
                zld zldVar = this.ah;
                if (zldVar != null) {
                    AlertDialog alertDialog = zldVar.b;
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                        zldVar.b = null;
                    }
                    this.ah = null;
                }
                zld zldVar2 = new zld(C(), this.aC, this.aH.h, new zxw(this, 0), new zxw(this, 2));
                this.ah = zldVar2;
                zldVar2.b.show();
                return;
            }
            by();
            return;
        }
        if (view == aI()) {
            aO(10719);
            if (aU().c() != null) {
                ynm.o(this, aU().c().d(), zxq.a, new zfi() { // from class: zxp
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        zxz zxzVar = zxz.this;
                        Integer num = (Integer) obj;
                        if (num == null || num.intValue() <= 0) {
                            return;
                        }
                        View aI = zxzVar.aI();
                        Context context = aI.getContext();
                        if (zev.e(context)) {
                            zev.c(context, aI, context.getString(R.string.a11y_new_effect_available_indicator));
                        }
                    }
                });
                bi();
            }
            aU().j();
            return;
        }
        if (view == br()) {
            if (!this.af && aO(10717)) {
                this.af = true;
            }
            n(!this.c);
        }
    }

    protected abstract int q();

    @Override // defpackage.vsj
    public final void r(vsm vsmVar) {
    }

    protected View s() {
        return null;
    }
}
