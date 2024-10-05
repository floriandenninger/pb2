package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import com.google.android.libraries.video.trim.VideoTrimView;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioCrossFadeView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.libraries.youtube.edit.preview.EditableVideoControllerView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hvc extends hsr implements icz, hvr, hvn, huo, hwd, hvw, hua, hty, hvt, hus, hwo, acqz, hsd, hux, ias {
    public boolean a;
    private EditableVideoControllerView aX;
    private ContextThemeWrapper aY;
    private apxf aZ;
    public acra ae;
    public hve af;
    public hvs ag;
    public hvq ah;
    public hur ai;
    public hwg aj;
    public hub ak;
    public htz al;
    public hvu am;
    public hut an;
    public hwq ao;
    public iax ap;
    public azrw aq;
    public azrw ar;
    public azrw as;
    public azrw at;
    public azrw au;
    public final hvb av = new hvb(this);
    public aadw aw;
    public axze ax;
    public AnimatorSet b;
    private apxf ba;
    private aujp bb;
    private boolean bc;
    private boolean bd;
    private boolean be;
    private Bitmap bf;
    private axdk bg;
    public boolean c;
    ReelEditModel d;
    public aksl e;

    private final void bK() {
        CharSequence text;
        hvq.d(this.ah.i, true != bm() ? R.drawable.quantum_ic_volume_up_white_24 : R.drawable.quantum_ic_volume_off_white_24);
        if (this.c) {
            return;
        }
        Context qR = qR();
        View view = this.ah.i;
        if (qR == null || view == null) {
            return;
        }
        if (bm()) {
            text = qR.getResources().getText(R.string.reel_edit_unmute_audio_button_text);
        } else {
            text = qR.getResources().getText(R.string.reel_edit_mute_audio_button_text);
        }
        view.setContentDescription(text);
    }

    private static final Uri bL(RecordingInfo recordingInfo) {
        if (recordingInfo == null) {
            return null;
        }
        if (recordingInfo.c.startsWith("content:")) {
            return Uri.parse(recordingInfo.c);
        }
        return Uri.fromFile(new File(recordingInfo.c));
    }

    static final VideoMetaData bq(Context context, Uri uri, RecordingInfo recordingInfo) {
        if (recordingInfo.f) {
            vvd vvdVar = new vvd();
            vvdVar.b = true;
            vvdVar.a = uri;
            vvdVar.c = 0;
            vvdVar.d = recordingInfo.a;
            vvdVar.e = recordingInfo.b;
            vvdVar.f = 0;
            vvdVar.h = recordingInfo.d * 1000;
            vvdVar.i = new long[]{0};
            vvdVar.j = null;
            vvdVar.k = false;
            return vvdVar.a();
        }
        return vux.a(context, uri);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r0.h != false) goto L9;
     */
    @Override // defpackage.zxz, defpackage.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X() {
        /*
            r2 = this;
            aaea r0 = r2.aB
            arfd r0 = r0.a()
            int r1 = r0.b
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L16
            avuj r0 = r0.h
            if (r0 != 0) goto L12
            avuj r0 = defpackage.avuj.a
        L12:
            boolean r0 = r0.h
            if (r0 == 0) goto L19
        L16:
            r2.bc()
        L19:
            super.X()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvc.X():void");
    }

    @Override // defpackage.hsd
    public final void a(int i) {
        huy huyVar = (huy) this.as.get();
        View S = ((hvi) this.aq.get()).a.e.n.S(i);
        huyVar.e = i;
        whu.I(huyVar.c, true);
        huyVar.f = S;
        zby zbyVar = new zby();
        zby.c(zbyVar, huyVar.f, (View) huyVar.c.getParent());
        int i2 = zbyVar.a.left;
        int i3 = zbyVar.a.right;
        int dimensionPixelSize = huyVar.a.getResources().getDimensionPixelSize(R.dimen.reel_edit_delete_button_size);
        int i4 = zbyVar.a.top;
        int dimensionPixelSize2 = huyVar.a.getResources().getDimensionPixelSize(R.dimen.reel_edit_delete_button_size);
        yny.z(huyVar.d, yny.h(yny.o(((i2 + i3) - dimensionPixelSize) / 2), yny.v((i4 - dimensionPixelSize2) - huyVar.a.getResources().getDimensionPixelSize(R.dimen.reel_edit_delete_button_margin_bottom))), FrameLayout.LayoutParams.class);
        huyVar.b.postDelayed(huyVar.g, 5000L);
    }

    @Override // defpackage.zxz
    protected final View aG() {
        return this.ah.i;
    }

    @Override // defpackage.zxz
    protected final View aI() {
        return this.ah.l;
    }

    @Override // defpackage.zxz
    protected final View aK() {
        return this.ag.c;
    }

    @Override // defpackage.zxz
    protected final View aL() {
        return this.ah.h;
    }

    @Override // defpackage.icz
    public final void aM(boolean z) {
        if (z) {
            aZ();
        } else {
            bf();
        }
    }

    @Override // defpackage.zxz
    protected final View aN() {
        return this.ag.b;
    }

    public final ReelItemEditModel aO(RecordingInfo recordingInfo, VideoMetaData videoMetaData, int i) {
        vsx vsxVar = new vsx();
        vsxVar.a = videoMetaData;
        vsxVar.b(this.aN);
        vsy a = vsxVar.a();
        if (i > 0 || videoMetaData.g > this.aN) {
            long j = this.aN;
            a.E(i * j, (i + 1) * j);
        }
        ba(a);
        hvv g = ReelItemEditModel.g();
        g.d(recordingInfo);
        g.f(videoMetaData);
        g.b(a.a);
        g.e(String.valueOf(i));
        return g.a();
    }

    @Override // defpackage.zxz
    public final VideoMetaData aP(Context context, Uri uri) {
        return bq(context, uri, this.d.g());
    }

    @Override // defpackage.zxz
    protected final VideoWithPreviewView aQ() {
        return this.ag.d;
    }

    @Override // defpackage.zxz
    protected final VideoTrimView aR() {
        return this.am.b;
    }

    @Override // defpackage.zxz
    protected final AudioCrossFadeView aS() {
        return this.ak.d;
    }

    @Override // defpackage.zxz
    protected final AudioTrackView aT() {
        return this.ak.c;
    }

    @Override // defpackage.zxz
    protected final ChooseFilterView aU() {
        hut hutVar = this.an;
        if (hutVar != null) {
            return hutVar.b;
        }
        return null;
    }

    @Override // defpackage.zxz
    protected final EditableVideoControllerView aV() {
        return this.aX;
    }

    @Override // defpackage.ias
    public final aqyg aW() {
        aong aongVar = (aong) aqyg.a.createBuilder();
        String string = qR().getString(R.string.reel_sticker_usage_limit_description);
        aongVar.copyOnWrite();
        aqyg aqygVar = (aqyg) aongVar.instance;
        string.getClass();
        aqygVar.b |= 1;
        aqygVar.d = string;
        return (aqyg) aongVar.build();
    }

    public final void aX() {
        bt(ammv.j(this.d.f().h()));
        gfw.A(this.d.f().e(), qR(), this.ay);
        aU().g(this.d.f().h().p());
        bK();
    }

    @Override // defpackage.hvt
    public final void aY() {
        this.am.d();
        bf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aZ() {
        hvq hvqVar = this.ah;
        if (hvqVar.t) {
            if (hvqVar.v) {
                hvqVar.f.setVisibility(8);
            } else {
                gfw.z(hvqVar);
            }
            hvqVar.t = false;
        }
        if (this.d.d().size() > 1) {
            ((hvi) this.aq.get()).d();
        } else {
            this.ai.g();
        }
    }

    @Override // defpackage.zxz, defpackage.ce
    public final void aa(View view, Bundle bundle) {
        super.aa(view, bundle);
        bt(ammv.j(this.d.f().h()));
        hwq hwqVar = this.ao;
        if (hwqVar.l.r() != null) {
            hwqVar.l.r().c(hwqVar);
        }
        gfw.A(this.d.f().e(), qR(), this.ay);
        if (this.bg != null) {
            this.ay.r().a(this.bg);
            iax iaxVar = this.ap;
            iaxVar.c(Math.round((iaxVar.b - iaxVar.c) - this.bg.a()));
        }
        bK();
    }

    @Override // defpackage.hsd
    public final void b(int i) {
        hwy hwyVar = (hwy) this.au.get();
        hwyVar.b = hwyVar.a.b(asmn.LATENCY_ACTION_REEL_SELECT_SEGMENT);
        bc();
        hvf b = this.d.b();
        b.b(i);
        this.d = b.a();
        ((hvi) this.aq.get()).a.d(this.d, (hsh) this.ar.get());
        aX();
        hwy hwyVar2 = (hwy) this.au.get();
        acsx acsxVar = hwyVar2.b;
        if (acsxVar == null) {
            return;
        }
        acsxVar.c("aft");
        hwyVar2.b = null;
    }

    @Override // defpackage.zxz
    protected final void ba(vsy vsyVar) {
        double d;
        double d2;
        double d3;
        apxf apxfVar = this.aZ;
        if (apxfVar == null || !apxfVar.pY(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)) {
            return;
        }
        if (!vsyVar.L() && vsyVar.b.g > (((LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) this.aZ.pX(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)).c + 1) * 1000000) {
            etx.T(C(), R.string.reel_gallery_video_too_long_not_support_trim);
            this.af.s();
        }
        double k = vsyVar.b.k();
        double j = vsyVar.b.j();
        Double.isNaN(k);
        Double.isNaN(j);
        double d4 = k / j;
        double d5 = 0.0d;
        if (Math.abs((-0.5625d) + d4) < 0.01d) {
            d = 0.0d;
            d2 = 0.0d;
            d3 = 0.0d;
        } else if (d4 > 0.5625d) {
            Double.isNaN(j);
            Double.isNaN(k);
            Double.isNaN(k);
            d2 = ((k - (j * 0.5625d)) / 2.0d) / k;
            d3 = d2;
            d = 0.0d;
        } else {
            Double.isNaN(k);
            Double.isNaN(j);
            Double.isNaN(j);
            d = ((j - (k / 0.5625d)) / 2.0d) / j;
            d2 = 0.0d;
            d3 = 0.0d;
            d5 = d;
        }
        vsyVar.A(d5, d);
        vsyVar.z(d2, d3);
    }

    public final void bc() {
        String e = this.d.f().e();
        zrx r = this.ay.r();
        ammv a = r == null ? amlr.a : r.k(ammv.j(new File("reel_effects", e).getPath())).a();
        ReelEditModel reelEditModel = this.d;
        boolean z = false;
        if (a.h()) {
            Iterator it = ((axdu) a.c()).e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                axdi i = ((axdk) it.next()).i();
                if ((i.c == 10 ? (axeh) i.d : axeh.a).d) {
                    z = true;
                    break;
                }
            }
        }
        if (reelEditModel.f().f() != z) {
            hvv a2 = reelEditModel.f().a();
            a2.c(z);
            ReelItemEditModel a3 = a2.a();
            ArrayList arrayList = new ArrayList(reelEditModel.d());
            arrayList.set(reelEditModel.a(), a3);
            hvf b = reelEditModel.b();
            b.c(arrayList);
            reelEditModel = b.a();
        }
        this.d = reelEditModel;
    }

    @Override // defpackage.zxz
    protected final void bd() {
        this.an.b.setBackgroundColor(wbs.W(this.aY, R.attr.reelEditChooseFilterBackground).orElse(0));
    }

    public final void be(boolean z, boolean z2, boolean z3) {
        this.bc = z;
        this.bd = z2;
        this.be = z3;
    }

    public final void bf() {
        hvq hvqVar = this.ah;
        if (!hvqVar.t) {
            if (hvqVar.v) {
                hvqVar.f.setVisibility(0);
            } else {
                gfw.z(hvqVar);
            }
            hvqVar.t = true;
        }
        if (this.d.d().size() > 1) {
            ((hvi) this.aq.get()).g();
        } else {
            this.ai.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zxz
    public final void bg() {
        hub hubVar = this.ak;
        AudioCrossFadeView audioCrossFadeView = hubVar.d;
        audioCrossFadeView.c.setProgressDrawable(audioCrossFadeView.getResources().getDrawable(R.drawable.audio_swap_cross_fade_progress_bar_white));
        hubVar.d.setVisibility(0);
        hubVar.d.e = -1275068417;
        hubVar.c.e.b.setColor(0);
        hubVar.c.b.setColor(0);
        AudioTrackView audioTrackView = hubVar.c;
        audioTrackView.g = false;
        audioTrackView.h = true;
        hubVar.d.findViewById(R.id.audio_swap_cross_fade_view_container).setBackground(null);
        AudioCrossFadeView audioCrossFadeView2 = hubVar.d;
        float dimension = hubVar.a.getResources().getDimension(R.dimen.reel_edit_audio_cross_fade_text_size);
        audioCrossFadeView2.a.setTextSize(0, dimension);
        audioCrossFadeView2.b.setTextSize(0, dimension);
        int dimension2 = (int) hubVar.a.getResources().getDimension(R.dimen.reel_edit_audio_cross_fade_text_left_right_margin);
        AudioCrossFadeView audioCrossFadeView3 = hubVar.d;
        audioCrossFadeView3.d(audioCrossFadeView3.a, dimension2, dimension2);
        audioCrossFadeView3.d(audioCrossFadeView3.b, dimension2, dimension2);
        hub hubVar2 = this.ak;
        Track track = this.aH.h;
        String obj = track == null ? null : track.b.toString();
        Track track2 = this.aH.h;
        String obj2 = track2 != null ? track2.a.toString() : null;
        if (!hubVar2.j) {
            gfw.z(hubVar2);
            hubVar2.j = true;
        }
        hubVar2.f.setText(obj);
        hubVar2.e.setText(obj2);
        aZ();
    }

    public final void bh() {
        if (this.d.d().size() > 1) {
            ((hvi) this.aq.get()).g();
            this.ai.g();
        } else {
            ((hvi) this.aq.get()).d();
            this.ai.l();
        }
    }

    @Override // defpackage.zxz
    protected final void bi() {
        zou zouVar;
        if (aU().c() == null) {
            return;
        }
        View aI = aI();
        boolean q = aU().c().q();
        int i = R.drawable.quantum_ic_auto_fix_white_24;
        if (q && (zouVar = this.aS) != null && zouVar.a(avwy.EFFECTS_FEATURE_DOT_ON_FILTER_ICON)) {
            i = R.drawable.ic_filter_new_badge_white_24;
        }
        if (aI instanceof ImageButton) {
            ((ImageButton) aI).setImageResource(i);
        } else if (aI instanceof EditorButtonView) {
            ((EditorButtonView) aI).a(i);
        }
    }

    public final void bj(ReelEditModel reelEditModel) {
        this.d = reelEditModel;
        ((hvi) this.aq.get()).a.d(reelEditModel, (hsh) this.ar.get());
    }

    @Override // defpackage.zxz
    protected final void bk(int i) {
    }

    @Override // defpackage.ias
    public final boolean bl() {
        ReelEditModel reelEditModel = this.d;
        for (int i = 0; i < reelEditModel.d().size(); i++) {
            if (i != reelEditModel.a() && ((ReelItemEditModel) reelEditModel.d().get(i)).f()) {
                return false;
            }
        }
        return true;
    }

    public final boolean bm() {
        vsy bs = bs();
        if (bs == null) {
            return false;
        }
        return bs.F();
    }

    @Override // defpackage.zxz
    protected final boolean bn() {
        return true;
    }

    @Override // defpackage.zxz
    protected final boolean bo() {
        return !aR().v;
    }

    @Override // defpackage.hwo
    public final boolean bp() {
        return (this.am.d || this.ak.j || this.an.d || this.al.c || this.aj.i) ? false : true;
    }

    @Override // defpackage.hsd
    public final void c(int i, int i2) {
        ReelEditModel reelEditModel = this.d;
        amru d = reelEditModel.d();
        if (i >= 0 && i < d.size() && i2 >= 0 && i2 < d.size() && i != i2) {
            ArrayList arrayList = new ArrayList(d);
            Collections.swap(arrayList, i, i2);
            int a = reelEditModel.a();
            if (a == i) {
                i = i2;
            } else if (a != i2) {
                i = a;
            }
            hvf b = reelEditModel.b();
            b.c(arrayList);
            b.b(i);
            reelEditModel = b.a();
        }
        bj(reelEditModel);
    }

    @Override // defpackage.hty
    public final void d() {
        bs().v(!bm());
        bK();
        bf();
    }

    @Override // defpackage.hua
    public final void e() {
        this.ak.d();
        bf();
    }

    @Override // defpackage.hus
    public final void h() {
        this.an.d();
        bf();
    }

    @Override // defpackage.zxz, defpackage.ce
    public final void lZ() {
        hwq hwqVar = this.ao;
        if (hwqVar.l.r() != null) {
            hwqVar.l.r().d(hwqVar);
        }
        idb idbVar = hwqVar.d.n;
        if (idbVar != null) {
            idbVar.a.cancel();
            idbVar.cancel(true);
        }
        super.lZ();
    }

    @Override // defpackage.ce
    public final void mD() {
        hwq hwqVar = this.ao;
        if (hwqVar.h.getVisibility() == 0) {
            ida idaVar = hwqVar.d;
            idaVar.k.setText((CharSequence) null);
            idaVar.k.setTextSize(2, 36.0f);
            idaVar.j.setVisibility(8);
        }
        super.mD();
    }

    @Override // defpackage.acqz
    public final acra mM() {
        return this.ae;
    }

    @Override // defpackage.zxz, defpackage.ce
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        bundle.putBoolean("TEXT_ENABLED", this.bc);
        bundle.putBoolean("ADVANCED_TEXT_ENABLED", this.bd);
        bundle.putBoolean("TEXT_ROUNDED_CORNERS_ENABLED", this.be);
        bundle.putBoolean("CAN_REQUEST_VIDEO_EFFECTS_STATE", this.a);
        bundle.putParcelable("REEL_MODEL", this.d);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (bundle != null) {
            be(bundle.getBoolean("TEXT_ENABLED"), bundle.getBoolean("ADVANCED_TEXT_ENABLED"), bundle.getBoolean("TEXT_ROUNDED_CORNERS_ENABLED"));
            this.a = bundle.getBoolean("CAN_REQUEST_VIDEO_EFFECTS_STATE");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x09fc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0ae3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0af7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0b15 A[LOOP:1: B:208:0x0b0f->B:210:0x0b15, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0b36  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05a0  */
    @Override // defpackage.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mg(android.view.LayoutInflater r22, android.view.ViewGroup r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 2947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvc.mg(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.zxz
    protected final int q() {
        return R.fraction.reel_edit_fragment_max_video_height;
    }

    @Override // defpackage.zxz
    protected final View s() {
        return this.ak.b;
    }

    @Override // defpackage.hwo
    public final void bb(int i, final TextView textView, final AnimatorSet animatorSet) {
        ChooseFilterView aU = aU();
        final zvk c = aU == null ? null : aU.c();
        if (aU == null || c == null) {
            return;
        }
        if (i == 3) {
            c.j();
            fhe.P(this.ae, c.c, acsb.c(74465));
        } else {
            if (i != 1) {
                return;
            }
            c.k();
            fhe.P(this.ae, c.c, acsb.c(74465));
        }
        C().runOnUiThread(new Runnable() { // from class: hva
            @Override // java.lang.Runnable
            public final void run() {
                hvc hvcVar = hvc.this;
                TextView textView2 = textView;
                zvk zvkVar = c;
                AnimatorSet animatorSet2 = animatorSet;
                AnimatorSet animatorSet3 = hvcVar.b;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                }
                textView2.setText(zvkVar.f());
                animatorSet2.start();
                hvcVar.b = animatorSet2;
            }
        });
    }
}
