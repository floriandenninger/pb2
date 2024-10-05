package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.CroppedVideoWithPreviewView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.libraries.youtube.edit.preview.TrimVideoControllerView;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hqw extends hqg implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, hql, vxb, vxa, zyi, hrh {
    public ShortsVideoTrimView2 a;
    public hrq aA;
    public hmw aB;
    public hoz aC;
    public hfp aE;
    public jqr aF;
    public ajyw aG;
    private EditorButtonView aH;
    private TextView aI;
    private apxf aJ;
    private ayqx aL;
    public Switch ae;
    public TextView af;
    public hhe ag;
    public VideoMetaData ai;
    public boolean aj;
    public boolean ak;
    public boolean al;
    public int am;
    public int an;
    public zyj ao;
    hqk ap;
    public Uri aq;
    public hqj ar;
    public hpb as;
    public hfy at;
    public hfv au;
    public acra av;
    public hqo aw;
    public hqx ax;
    public hrs ay;
    public hos az;
    public TrimVideoControllerView b;
    public YouTubeButton c;
    public YouTubeButton d;
    public View e;
    public int ah = 1;
    private long aK = -1;
    final vsz aD = new hqt(this);

    private final void aT() {
        vyg vygVar;
        hqj hqjVar = this.ar;
        if (hqjVar != null && (vygVar = hqjVar.b().a.f) != null) {
            vygVar.d.e = false;
            vygVar.g();
        }
        TrimVideoControllerView trimVideoControllerView = this.b;
        if (trimVideoControllerView != null) {
            trimVideoControllerView.n(null);
        }
        zyj zyjVar = this.ao;
        if (zyjVar != null) {
            zyjVar.f();
        }
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        aT();
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        zyj zyjVar = this.ao;
        if (zyjVar != null) {
            zyjVar.g();
        }
    }

    @Override // defpackage.hql
    public final void a(float f) {
        if (q().j()) {
            this.aF.a(acsb.c(121259)).f();
            CroppedVideoWithPreviewView q = q();
            if (q.d == 1 && q.a() < q.l) {
                float f2 = q.f();
                float h = q.h();
                float g = q.g();
                float a = q.a();
                if (h != 0.0f && g != 0.0f && a != 0.0f) {
                    float f3 = q.e + f;
                    q.e = f3;
                    float f4 = -f2;
                    float f5 = (q.a * h) - h;
                    float f6 = f5 + f2;
                    float f7 = f5 / 2.0f;
                    float f8 = f3 + f7;
                    if (f8 < f4) {
                        q.e = f4 - f7;
                        f8 = f4;
                    } else if (f8 > f6) {
                        q.e = f6 - f7;
                        f8 = f6;
                    }
                    float f9 = f6 - f2;
                    float f10 = f8 / f9;
                    q.b = f10;
                    float f11 = f4 / f9;
                    q.c = (f10 - f11) / ((f6 / f9) - f11);
                    q.i();
                }
            }
            if (this.aj) {
                zyj zyjVar = this.ao;
                vwm vwmVar = zyjVar.f;
                vwmVar.j(vwmVar.c() + 1);
                zyjVar.f.j(r8.c() - 1);
            }
            hqk hqkVar = this.ap;
            hqkVar.a(this.ao.d, hqkVar.b.c.c);
        }
    }

    @Override // defpackage.zyi
    public final void aF() {
    }

    public final void aG() {
        if (this.ak) {
            ((hmc) this.ag).aK();
            return;
        }
        if (q() != null) {
            q().setVisibility(4);
        }
        hhe hheVar = this.ag;
        if (hheVar != null) {
            hmc hmcVar = (hmc) hheVar;
            hmcVar.ai.d();
            hmcVar.aM(jqr.c(hmcVar.q(), hmcVar.ao, 96638));
        }
    }

    @Override // defpackage.vxb
    public final void aH(boolean z) {
        ci C = C();
        if (z) {
            if (C != null) {
                C.getWindow().addFlags(128);
                return;
            }
            return;
        }
        if (C != null) {
            C.getWindow().clearFlags(128);
        }
        if (aS()) {
            return;
        }
        TrimVideoControllerView trimVideoControllerView = this.b;
        if (trimVideoControllerView.h || this.a.y || this.aj) {
            return;
        }
        trimVideoControllerView.p();
    }

    @Override // defpackage.vxa
    public final void aI(long j) {
        this.a.v(j);
    }

    @Override // defpackage.zyi
    public final void aJ(oxh oxhVar) {
        throw null;
    }

    public final void aK() {
        this.e.setVisibility(8);
        this.ax.g();
        if (aO()) {
            aN();
        } else {
            aL();
        }
        aM(true);
        this.aF.a(acsb.c(110247)).e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aL() {
        vsy vsyVar = this.as.b;
        if (vsyVar == null) {
            return;
        }
        ShortsVideoTrimView2 shortsVideoTrimView2 = this.a;
        long n = vsyVar.n();
        if (shortsVideoTrimView2.t != null) {
            shortsVideoTrimView2.t(n);
        }
        ShortsVideoTrimView2 shortsVideoTrimView22 = this.a;
        long l = vsyVar.l();
        if (shortsVideoTrimView22.t != null) {
            shortsVideoTrimView22.u(l);
        }
        this.b.i();
    }

    public final void aM(boolean z) {
        this.c.setContentDescription(z ? O(R.string.shorts_a11y_continue_to_editor) : O(R.string.shorts_a11y_continue_to_upload));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aN() {
        vsy vsyVar = this.ao.d;
        if (vsyVar != null) {
            this.as.b = vsyVar;
        }
    }

    public final boolean aO() {
        return this.as.b == null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aP() {
        return this.a.l && aQ();
    }

    final boolean aQ() {
        return this.ai.a() <= 1.0f;
    }

    public final boolean aR() {
        return p() <= TimeUnit.MILLISECONDS.toMicros((long) this.an);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aS() {
        return this.b.u();
    }

    @Override // defpackage.ce
    public final void aa(View view, Bundle bundle) {
        if (bundle != null) {
            this.an = bundle.getInt("max_video_duration_ms");
            this.aK = bundle.getLong("playback_position", -1L);
            this.ah = bundle.getInt("max_hardware_decoders");
            this.ak = bundle.getBoolean("segment_import_mode", false);
            this.al = bundle.getBoolean("pannable_crop_mode", false);
        }
        if (this.ak) {
            this.d.setVisibility(0);
            this.c.setVisibility(8);
        }
        this.b.e(this);
        this.b.e.add(this);
        this.b.i = new hqv(this, (byte[]) null);
        this.ao = new zyj(q(), this.b, null, this.aK, this.ah, true, 0);
        int o = o();
        this.aI.setText(qR().getResources().getQuantityString(R.plurals.trim_switch_edu_full_length_shorts, o, Integer.valueOf(o)));
        this.aL = this.az.c().L(gsv.g).ax(new ayrs() { // from class: hqq
            /* JADX WARN: Removed duplicated region for block: B:29:0x011c A[Catch: IllegalStateException -> 0x01ac, IOException | IllegalStateException -> 0x01ae, TryCatch #2 {IOException | IllegalStateException -> 0x01ae, blocks: (B:6:0x0050, B:8:0x0058, B:9:0x005a, B:13:0x0064, B:14:0x0068, B:16:0x008a, B:18:0x0094, B:20:0x00cb, B:21:0x00cd, B:22:0x00e8, B:24:0x00f2, B:26:0x00fc, B:27:0x0113, B:29:0x011c, B:32:0x0129, B:33:0x014c, B:35:0x015e, B:36:0x0179, B:38:0x0182, B:41:0x0189, B:43:0x018d, B:44:0x0195, B:45:0x019d, B:50:0x0125, B:51:0x012e, B:54:0x013e, B:55:0x013a), top: B:5:0x0050 }] */
            /* JADX WARN: Removed duplicated region for block: B:35:0x015e A[Catch: IllegalStateException -> 0x01ac, IOException | IllegalStateException -> 0x01ae, TryCatch #2 {IOException | IllegalStateException -> 0x01ae, blocks: (B:6:0x0050, B:8:0x0058, B:9:0x005a, B:13:0x0064, B:14:0x0068, B:16:0x008a, B:18:0x0094, B:20:0x00cb, B:21:0x00cd, B:22:0x00e8, B:24:0x00f2, B:26:0x00fc, B:27:0x0113, B:29:0x011c, B:32:0x0129, B:33:0x014c, B:35:0x015e, B:36:0x0179, B:38:0x0182, B:41:0x0189, B:43:0x018d, B:44:0x0195, B:45:0x019d, B:50:0x0125, B:51:0x012e, B:54:0x013e, B:55:0x013a), top: B:5:0x0050 }] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x018d A[Catch: IllegalStateException -> 0x01ac, IOException | IllegalStateException -> 0x01ae, TryCatch #2 {IOException | IllegalStateException -> 0x01ae, blocks: (B:6:0x0050, B:8:0x0058, B:9:0x005a, B:13:0x0064, B:14:0x0068, B:16:0x008a, B:18:0x0094, B:20:0x00cb, B:21:0x00cd, B:22:0x00e8, B:24:0x00f2, B:26:0x00fc, B:27:0x0113, B:29:0x011c, B:32:0x0129, B:33:0x014c, B:35:0x015e, B:36:0x0179, B:38:0x0182, B:41:0x0189, B:43:0x018d, B:44:0x0195, B:45:0x019d, B:50:0x0125, B:51:0x012e, B:54:0x013e, B:55:0x013a), top: B:5:0x0050 }] */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0195 A[Catch: IllegalStateException -> 0x01ac, IOException | IllegalStateException -> 0x01ae, TryCatch #2 {IOException | IllegalStateException -> 0x01ae, blocks: (B:6:0x0050, B:8:0x0058, B:9:0x005a, B:13:0x0064, B:14:0x0068, B:16:0x008a, B:18:0x0094, B:20:0x00cb, B:21:0x00cd, B:22:0x00e8, B:24:0x00f2, B:26:0x00fc, B:27:0x0113, B:29:0x011c, B:32:0x0129, B:33:0x014c, B:35:0x015e, B:36:0x0179, B:38:0x0182, B:41:0x0189, B:43:0x018d, B:44:0x0195, B:45:0x019d, B:50:0x0125, B:51:0x012e, B:54:0x013e, B:55:0x013a), top: B:5:0x0050 }] */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0177  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x012e A[Catch: IllegalStateException -> 0x01ac, IOException | IllegalStateException -> 0x01ae, TryCatch #2 {IOException | IllegalStateException -> 0x01ae, blocks: (B:6:0x0050, B:8:0x0058, B:9:0x005a, B:13:0x0064, B:14:0x0068, B:16:0x008a, B:18:0x0094, B:20:0x00cb, B:21:0x00cd, B:22:0x00e8, B:24:0x00f2, B:26:0x00fc, B:27:0x0113, B:29:0x011c, B:32:0x0129, B:33:0x014c, B:35:0x015e, B:36:0x0179, B:38:0x0182, B:41:0x0189, B:43:0x018d, B:44:0x0195, B:45:0x019d, B:50:0x0125, B:51:0x012e, B:54:0x013e, B:55:0x013a), top: B:5:0x0050 }] */
            @Override // defpackage.ayrs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r32) {
                /*
                    Method dump skipped, instructions count: 461
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.hqq.a(java.lang.Object):void");
            }
        });
        this.ap = new hqk(this.as, this.aw, this.aF, null);
        this.au = new hfv(this.az, qR(), new hqv(this));
    }

    @Override // defpackage.ce
    public final void lZ() {
        super.lZ();
        this.ar = null;
        ShortsVideoTrimView2 shortsVideoTrimView2 = this.a;
        if (shortsVideoTrimView2 != null) {
            shortsVideoTrimView2.w(null, null, vsm.a);
            vsm vsmVar = shortsVideoTrimView2.s;
            if (vsmVar != null) {
                vsmVar.h(shortsVideoTrimView2);
            }
        }
        TrimVideoControllerView trimVideoControllerView = this.b;
        if (trimVideoControllerView != null) {
            trimVideoControllerView.j(this);
            trimVideoControllerView.e.remove(this);
            trimVideoControllerView.o(null);
        }
        zyj zyjVar = this.ao;
        if (zyjVar != null) {
            zyjVar.g = null;
            zyjVar.o();
        }
        Object obj = this.aL;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
        s(false);
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putInt("max_hardware_decoders", this.ah);
        bundle.putInt("max_video_duration_ms", this.an);
        bundle.putLong("playback_position", this.ao.e());
        bundle.putBoolean("segment_import_mode", this.ak);
        bundle.putBoolean("pannable_crop_mode", this.al);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        byte[] byteArray;
        super.mR(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 != null && (byteArray = bundle2.getByteArray("SHORTS_EDIT_VIDEO_ENDPOINT")) != null) {
            try {
                this.aJ = (apxf) aonm.parseFrom(apxf.a, byteArray, aomw.b());
            } catch (aoob e) {
                zga.d("Error parsing navigation endpoint.", e);
            }
        }
        this.aF = new jqr(this.av);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.shorts_trim_fragment_2, viewGroup, false);
        hqo hqoVar = this.aw;
        hqoVar.b = this;
        hqoVar.c = (CroppedVideoWithPreviewView) inflate.findViewById(R.id.video_view);
        hqoVar.d = (FrameLayout) inflate.findViewById(R.id.preview_video_container);
        hqoVar.e = inflate.findViewById(R.id.video_preview_start_crop_overlay);
        hqoVar.f = inflate.findViewById(R.id.video_preview_end_crop_overlay);
        hqoVar.d.setOnTouchListener(hqoVar);
        hqoVar.d.setAccessibilityDelegate(new hqm(hqoVar));
        hqoVar.c.g = hqoVar;
        hqx hqxVar = this.ax;
        hqxVar.a = inflate.findViewById(R.id.shorts_edit_video_trim_container);
        hqxVar.b = (ShortsVideoTrimView2) inflate.findViewById(R.id.shorts_edit_video_trim_view);
        hqxVar.e = (TrimVideoControllerView) inflate.findViewById(R.id.trim_video_controller);
        hqxVar.c = inflate.getContext().getResources().getDimension(R.dimen.shorts_edit_video_trim_height);
        hqxVar.d();
        ShortsVideoTrimView2 shortsVideoTrimView2 = this.ax.b;
        this.a = shortsVideoTrimView2;
        shortsVideoTrimView2.C = this.aF;
        shortsVideoTrimView2.j = new vsf(qR(), inflate);
        vsf vsfVar = shortsVideoTrimView2.j;
        if (vsfVar != null) {
            vsfVar.d = shortsVideoTrimView2.b;
        }
        this.a.a = this;
        this.b = (TrimVideoControllerView) inflate.findViewById(R.id.trim_video_controller);
        this.b.f = (ImageView) inflate.findViewById(R.id.play_button);
        YouTubeButton youTubeButton = (YouTubeButton) inflate.findViewById(R.id.shorts_trim_next_button);
        this.c = youTubeButton;
        youTubeButton.setOnClickListener(this);
        YouTubeButton youTubeButton2 = (YouTubeButton) inflate.findViewById(R.id.shorts_trim_add_segment_button);
        this.d = youTubeButton2;
        youTubeButton2.setOnClickListener(this);
        EditorButtonView editorButtonView = (EditorButtonView) inflate.findViewById(R.id.shorts_trim_back);
        this.aH = editorButtonView;
        editorButtonView.setOnClickListener(this);
        this.e = inflate.findViewById(R.id.trim_to_short_container);
        Switch r4 = (Switch) inflate.findViewById(R.id.trim_to_short_switch);
        this.ae = r4;
        r4.setOnCheckedChangeListener(this);
        this.ae.setOnClickListener(new View.OnClickListener() { // from class: hqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hqw.this.aF.a(acsb.c(110248)).b();
            }
        });
        this.aI = (TextView) inflate.findViewById(R.id.trim_to_short_edu_text);
        this.af = (TextView) inflate.findViewById(R.id.segment_max_length_label);
        jqr jqrVar = this.aF;
        if (jqrVar != null) {
            hfr b = jqrVar.b(acsb.b(96659));
            b.a = this.aJ;
            b.b();
            if (this.ak) {
                hfq a = this.aF.a(acsb.c(121260));
                a.h(true);
                a.a();
                this.aF.a(acsb.c(121259)).a();
            } else {
                hfq a2 = this.aF.a(acsb.c(96644));
                a2.h(true);
                a2.a();
            }
            hfq a3 = this.aF.a(acsb.c(96638));
            a3.h(true);
            a3.a();
            hfq a4 = this.aF.a(acsb.c(97091));
            a4.h(true);
            a4.a();
            this.aF.a(acsb.c(110246)).a();
            this.aF.a(acsb.c(110247)).a();
            this.aF.a(acsb.c(110248)).a();
            this.aF.a(acsb.c(97092)).a();
        }
        return inflate;
    }

    public final int o() {
        return (int) TimeUnit.MILLISECONDS.toSeconds(this.an);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton == this.ae) {
            if (z) {
                this.ax.g();
                aM(true);
                aN();
                this.aF.a(acsb.c(110246)).d();
                this.aF.a(acsb.c(110247)).e();
                return;
            }
            hqx hqxVar = this.ax;
            hqxVar.d = false;
            gfw.z(hqxVar);
            aM(false);
            this.aF.a(acsb.c(110247)).d();
            this.aF.a(acsb.c(110246)).e();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        bbr bbrVar;
        hfu hfuVar;
        hfu hfuVar2;
        if (view == this.c) {
            if (aP() && (aR() || this.ae.isChecked())) {
                if (this.ag != null) {
                    vsy vsyVar = this.as.b;
                    if (vsyVar != null && vsyVar.K()) {
                        this.aA.e(true);
                    }
                    ((hmc) this.ag).aF(3);
                    return;
                }
                return;
            }
            aone createBuilder = atmc.a.createBuilder();
            createBuilder.copyOnWrite();
            atmc atmcVar = (atmc) createBuilder.instance;
            atmcVar.b |= 2;
            atmcVar.d = 96644;
            InteractionLoggingScreen interactionLoggingScreen = ((acqq) this.av).g;
            if (interactionLoggingScreen != null) {
                String str2 = interactionLoggingScreen.a;
                createBuilder.copyOnWrite();
                atmc atmcVar2 = (atmc) createBuilder.instance;
                str2.getClass();
                atmcVar2.b |= 1;
                atmcVar2.c = str2;
            }
            this.aA.e(false);
            Uri uri = this.aq;
            if (uri != null) {
                this.aA.d(uri);
            }
            Uri d = zyk.d(this.ao.d);
            hrt a = hru.a();
            a.c(avtn.UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SHORTS_GALLERY);
            a.l = 2;
            a.b = d;
            a.c = (atmc) createBuilder.build();
            a.b(p() <= hfo.a && aQ());
            Uri uri2 = this.aq;
            if (uri2 != null) {
                a.a = uri2;
            }
            String str3 = this.aA.e;
            if (str3 != null) {
                a.j = str3;
            }
            this.ay.a(a.a());
            return;
        }
        if (view != this.d) {
            if (view == this.aH) {
                aG();
                return;
            }
            return;
        }
        if (this.aF != null) {
            vsy vsyVar2 = this.ao.d;
            aone createBuilder2 = asif.a.createBuilder();
            int k = vsyVar2.b.k();
            createBuilder2.copyOnWrite();
            asif asifVar = (asif) createBuilder2.instance;
            asifVar.b |= 1;
            asifVar.c = k;
            int j = vsyVar2.b.j();
            createBuilder2.copyOnWrite();
            asif asifVar2 = (asif) createBuilder2.instance;
            asifVar2.b = 2 | asifVar2.b;
            asifVar2.d = j;
            if (vsyVar2.a() != 0.0d) {
                double a2 = vsyVar2.a();
                createBuilder2.copyOnWrite();
                asif asifVar3 = (asif) createBuilder2.instance;
                asifVar3.b |= 16;
                asifVar3.g = (float) a2;
            }
            if (vsyVar2.d() != 0.0d) {
                double d2 = vsyVar2.d();
                createBuilder2.copyOnWrite();
                asif asifVar4 = (asif) createBuilder2.instance;
                asifVar4.b |= 4;
                asifVar4.e = (float) d2;
            }
            if (vsyVar2.b() != 0.0d) {
                double b = vsyVar2.b();
                createBuilder2.copyOnWrite();
                asif asifVar5 = (asif) createBuilder2.instance;
                asifVar5.b |= 32;
                asifVar5.h = (float) b;
            }
            if (vsyVar2.c() != 0.0d) {
                double c = vsyVar2.c();
                createBuilder2.copyOnWrite();
                asif asifVar6 = (asif) createBuilder2.instance;
                asifVar6.b |= 8;
                asifVar6.f = (float) c;
            }
            asif asifVar7 = (asif) createBuilder2.build();
            aone createBuilder3 = asht.a.createBuilder();
            aone createBuilder4 = asil.a.createBuilder();
            createBuilder4.copyOnWrite();
            asil asilVar = (asil) createBuilder4.instance;
            asifVar7.getClass();
            asilVar.d = asifVar7;
            asilVar.b |= 4;
            asil asilVar2 = (asil) createBuilder4.build();
            createBuilder3.copyOnWrite();
            asht ashtVar = (asht) createBuilder3.instance;
            asilVar2.getClass();
            ashtVar.B = asilVar2;
            ashtVar.c |= 262144;
            asht ashtVar2 = (asht) createBuilder3.build();
            hfq a3 = this.aF.a(acsb.c(121260));
            a3.a = ashtVar2;
            a3.b();
        }
        if (this.ag != null) {
            aT();
            hfy hfyVar = new hfy(qR());
            this.at = hfyVar;
            String string = qR().getString(R.string.processing_indicator_label);
            if (ammx.e(string)) {
                hfyVar.h.setVisibility(8);
            } else {
                hfyVar.h.setVisibility(0);
                hfyVar.h.setText(string);
            }
            this.at.g.setIndeterminate(false);
            this.at.b(0);
            hfy hfyVar2 = this.at;
            if (hfyVar2.d) {
                hfyVar2.a.removeCallbacks(hfyVar2.c);
            } else if (!hfyVar2.e) {
                hfyVar2.e = true;
                hfyVar2.a.postDelayed(hfyVar2.b, 300L);
            }
            this.at.i = new hqv(this, (char[]) null);
            hfv hfvVar = this.au;
            hpb hpbVar = this.as;
            Uri uri3 = hpbVar.a;
            vsy vsyVar3 = hpbVar.b;
            if (vsyVar3 == null) {
                hfvVar.a(new IllegalArgumentException("Segment Import not provided trim range"));
                return;
            }
            Toast.makeText(hfvVar.b, "Begin trimmed segment transcode", 0).show();
            hfvVar.a.d();
            hpa b2 = hfvVar.a.b();
            if (b2 == null || !hpa.J(b2)) {
                hfvVar.a(new IllegalArgumentException("Unable to load CameraProject for Segment Import"));
                return;
            }
            how howVar = (how) b2;
            File i = howVar.i();
            if (i == null) {
                hfvVar.a(new IllegalArgumentException("Segment Import failed to create project segment"));
                return;
            }
            if (uri3 == null) {
                hfvVar.a(new IllegalArgumentException("No source Uri provided"));
                return;
            }
            Context context = hfvVar.b;
            long n = vsyVar3.n();
            long l = vsyVar3.l();
            ati atiVar = new ati();
            atiVar.b = pts.J(context, "VideoMPEG");
            bay bayVar = new bay(new bcq(new bfj(context, atiVar)).a(pnd.a(uri3)), n, l);
            RectF rectF = new RectF((float) vsyVar3.b(), (float) vsyVar3.d(), (float) (1.0d - vsyVar3.c()), (float) (1.0d - vsyVar3.a()));
            String.valueOf(String.valueOf(i)).length();
            vyx vyxVar = new vyx();
            vyxVar.a = hfvVar.b;
            String path = i.getPath();
            if (path == null) {
                throw new NullPointerException("Null outputPath");
            }
            vyxVar.b = path;
            vyxVar.c = bayVar;
            vyxVar.d = rectF;
            hfu hfuVar3 = new hfu(hfvVar, howVar);
            hfu hfuVar4 = new hfu(hfvVar, howVar);
            hft hftVar = new hft(hfvVar.d);
            vyxVar.e = hfuVar3;
            vyxVar.g = hfuVar4;
            vyxVar.f = hftVar;
            Context context2 = vyxVar.a;
            if (context2 != null && (str = vyxVar.b) != null && (bbrVar = vyxVar.c) != null && (hfuVar = vyxVar.e) != null && (hfuVar2 = vyxVar.g) != null) {
                hfvVar.c = new vyz(new vyy(context2, str, bbrVar, vyxVar.d, hfuVar, hfuVar2, vyxVar.f, null));
                vtf vtfVar = hfvVar.c.a;
                vtn vtnVar = (vtn) vtfVar;
                vtnVar.g = null;
                try {
                    ((vtn) vtfVar).e = new vto(((vtn) vtfVar).u, ((vtn) vtfVar).v);
                    vtnVar.d = new vte(vtnVar.m, vtnVar.n, vtnVar.o, vtnVar.p, vtnVar.r);
                    vtnVar.c = new vts(vtnVar.j, vtnVar.k, vtnVar.l, vtnVar.v, vtnVar.i, vtnVar.p, vtnVar.t, vtnVar.a, vtnVar.q, vtnVar.a(), vtnVar.y, vtnVar.s, vtnVar.w, vtnVar.x);
                    vtnVar.c.g();
                    return;
                } catch (IOException e) {
                    vtnVar.c(e);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            if (vyxVar.a == null) {
                sb.append(" context");
            }
            if (vyxVar.b == null) {
                sb.append(" outputPath");
            }
            if (vyxVar.c == null) {
                sb.append(" mediaSource");
            }
            if (vyxVar.e == null) {
                sb.append(" successListener");
            }
            if (vyxVar.g == null) {
                sb.append(" errorListener");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long p() {
        return this.a.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CroppedVideoWithPreviewView q() {
        return this.aw.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(boolean z) {
        this.b.f(z);
    }

    public final void s(final boolean z) {
        ci C = C();
        if (C != null) {
            C.runOnUiThread(new Runnable() { // from class: hqs
                @Override // java.lang.Runnable
                public final void run() {
                    hqw hqwVar = hqw.this;
                    boolean z2 = z;
                    hfy hfyVar = hqwVar.at;
                    if (hfyVar != null) {
                        if (z2) {
                            hfyVar.b(100);
                        }
                        hqwVar.at.a();
                    }
                }
            });
        }
    }
}
