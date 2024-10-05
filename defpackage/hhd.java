package defpackage;

import android.animation.AnimatorSet;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.TransitionDrawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsEditCoordinatorLayout;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsEditToolButtonView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsPlayerView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.ShortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hhd extends hgn implements acqz, hhs, zry, icz, hih, zob, hnl {
    public acra a;
    public hfp aA;
    public jqr aB;
    public jlb aC;
    public jlb aD;
    public aoae aE;
    private ShortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver aF;
    private View aG;
    private ayqw aH;
    private View aI;
    private ShortsEditToolButtonView aL;
    private ShortsEditToolButtonView aM;
    private ChooseFilterView aN;
    private boolean aO;
    private hch aP;
    private boolean aQ;
    public hoj ae;
    public ida af;
    public hii ag;
    public hkz ah;
    public hrq ai;
    public azrw aj;
    public hos ak;
    public ayqi al;
    public hne am;
    public gni an;
    hnq ao;
    hnw ap;
    public hgb aq;
    public apxf ar;
    public ShortsPlayerView as;
    public View at;
    public ImageView au;
    public View av;
    public AnimatorSet ax;
    public hhc ay;
    public View az;
    public hht b;
    public hrv c;
    public hjs d;
    public Context e;
    private boolean aJ = true;
    public boolean aw = false;
    private boolean aK = false;

    @Override // defpackage.ce
    public final void X() {
        ayqx ayqxVar;
        super.X();
        hii hiiVar = this.ag;
        hiiVar.b = null;
        zrx a = hiiVar.a();
        if (a != null) {
            a.d(hiiVar);
            hiiVar.c = (File) a.k(amlr.a).b().f();
        }
        hnq hnqVar = this.ao;
        if (hnqVar != null) {
            hnqVar.d();
        }
        hnw hnwVar = this.ap;
        if (hnwVar != null && (ayqxVar = hnwVar.b) != null && !ayqxVar.e()) {
            ayrz.c((AtomicReference) hnwVar.b);
        }
        ((hhz) this.aj.get()).c(true);
        hht hhtVar = this.b;
        pom pomVar = hhtVar.r;
        hhtVar.q = (pomVar == null || pomVar.E()) ? false : true;
        hhtVar.e();
        if (hhtVar.s != null) {
            hhtVar.v(ept.n);
            zrs zrsVar = hhtVar.s;
            if (zrsVar != null) {
                zrsVar.h();
            }
        }
        hhtVar.z();
        Object obj = hhtVar.k;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
        hhtVar.H.a.f();
        ShortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver = this.aF;
        if (shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver != null) {
            shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver.b = false;
            this.aE.b.remove(shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver);
        }
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        hht hhtVar = this.b;
        zrs zrsVar = hhtVar.s;
        if (zrsVar != null) {
            zrsVar.j();
        } else {
            hhtVar.C();
        }
        if (!hhtVar.q) {
            hhtVar.f();
        }
        hfp hfpVar = this.aA;
        acsx acsxVar = hfpVar.d;
        if (acsxVar != null) {
            acsxVar.c("aft");
            hfpVar.d = null;
        }
        ShortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver = this.aF;
        if (shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver != null) {
            this.aE.b.add(shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver);
            this.aF.b = true;
        }
        hii hiiVar = this.ag;
        hiiVar.b = this;
        zrx a = hiiVar.a();
        if (a != null) {
            a.c(hiiVar);
        }
        this.az.setEnabled(true);
    }

    @Override // defpackage.hih
    public final void aF(axdk axdkVar) {
        axdy axdyVar;
        if (aQ()) {
            axdi i = axdkVar.i();
            if (i.c == 1) {
                axdyVar = (axdy) i.d;
            } else {
                axdyVar = axdy.a;
            }
            if (axdyVar.c.isEmpty()) {
                return;
            }
            this.b.e();
            this.d.h(axdkVar.e());
            return;
        }
        if (((hhz) this.aj.get()).b(axdkVar, this.as)) {
            return;
        }
        this.af.my(axdkVar);
    }

    public final void aG() {
        this.aJ = false;
        this.at.setVisibility(8);
        this.aG.setVisibility(8);
    }

    @Override // defpackage.hih
    public final void aH(final boolean z) {
        if (this.aK == z) {
            return;
        }
        this.aK = z;
        this.au.post(new Runnable() { // from class: hgx
            @Override // java.lang.Runnable
            public final void run() {
                hhd hhdVar = hhd.this;
                boolean z2 = z;
                if (z2) {
                    hhdVar.au.performHapticFeedback(1);
                }
                if (hhdVar.av.getAnimation() != null && hhdVar.av.getAnimation().hasStarted() && !hhdVar.av.getAnimation().hasEnded()) {
                    hhdVar.av.getAnimation().reset();
                }
                float f = true != z2 ? 1.0f : 1.1667f;
                hhdVar.av.animate().scaleX(f).scaleY(f).setDuration(75L).start();
                TransitionDrawable transitionDrawable = (TransitionDrawable) hhdVar.av.getBackground();
                if (z2) {
                    transitionDrawable.startTransition(75);
                    hhdVar.a.I(3, new acqx(acsb.c(39104)), null);
                } else {
                    transitionDrawable.reverseTransition(75);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aI() {
        hhe hheVar;
        bue bueVar = this.C;
        if ((bueVar instanceof hhe) && (hheVar = (hhe) bueVar) != null) {
            hheVar.b();
        }
        if (aP()) {
            hht hhtVar = this.b;
            hpa b = hhtVar.f.b();
            if (b != null) {
                b.p();
                if (b.c().h()) {
                    hhtVar.g.m((axet) b.c().c());
                    return;
                }
                return;
            }
            hhtVar.g.j();
        }
    }

    public final void aJ() {
        hgb hgbVar;
        ((hhz) this.aj.get()).c(true);
        this.a.I(3, new acqx(acsb.c(96638)), null);
        if (aP()) {
            if (!this.aQ || !hpa.J(this.ak.b()) || (hgbVar = this.aq) == null) {
                new AlertDialog.Builder(this.e).setTitle(R.string.shorts_editor_discard_dialog_title).setMessage(R.string.shorts_editor_discard_dialog_text).setPositiveButton(R.string.shorts_editor_discard_dialog_yes, new DialogInterface.OnClickListener() { // from class: hgr
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        hhd.this.aI();
                    }
                }).setNegativeButton(R.string.shorts_editor_discard_dialog_no, hgs.a).create().show();
                return;
            } else {
                hgbVar.G();
                return;
            }
        }
        aI();
    }

    @Override // defpackage.hhs
    public final void aK() {
        this.az.setEnabled(true);
    }

    @Override // defpackage.hih
    public final void aL(final boolean z, final boolean z2) {
        if (!z && this.aO) {
            hch hchVar = this.aP;
            if (hchVar.i > 0) {
                hchVar.f.I(3, hchVar.g, null);
            }
        }
        if (!z) {
            this.b.y();
        }
        if (aQ()) {
            return;
        }
        this.au.post(new Runnable() { // from class: hgy
            @Override // java.lang.Runnable
            public final void run() {
                hhd hhdVar = hhd.this;
                boolean z3 = z;
                boolean z4 = z2;
                if (z3) {
                    hhdVar.aG();
                    ((hhz) hhdVar.aj.get()).c(true);
                } else {
                    hhdVar.aN();
                }
                if (hhdVar.aw == z4) {
                    return;
                }
                hhdVar.aw = z4;
                hhdVar.ax = gfw.x(hhdVar.ay, z4, hhdVar.ax);
            }
        });
    }

    @Override // defpackage.icz
    public final void aM(boolean z) {
        if (z) {
            return;
        }
        this.b.y();
    }

    public final void aN() {
        this.aJ = true;
        this.at.setVisibility(0);
        this.aG.setVisibility(0);
    }

    public final void aO(boolean z) {
        if (z) {
            aG();
        } else {
            aN();
        }
    }

    final boolean aP() {
        axet axetVar;
        if (this.c.i()) {
            hht hhtVar = this.b;
            hpa b = hhtVar.f.b();
            ammv c = b == null ? amlr.a : b.c();
            ShortsCreationSelectedTrack a = hhtVar.g.a();
            if (a == null ? c.h() : !((axetVar = (axet) c.f()) != null && axetVar.c.equals(a.k()) && fkc.A(axetVar) == a.a())) {
                return true;
            }
        }
        return (this.c.o() && !FilterMapTable$FilterDescriptor.h(this.b.t.g().b)) || this.ag.p();
    }

    public final boolean aQ() {
        return !this.d.i();
    }

    @Override // defpackage.zob
    public final void c() {
    }

    @Override // defpackage.zob
    public final void e(float f, float f2) {
    }

    @Override // defpackage.ce
    public final void lN(Bundle bundle) {
        super.lN(bundle);
        View view = this.O;
        if (view == null) {
            return;
        }
        view.findViewById(R.id.shorts_edit_timeline_button).setVisibility(0);
        this.d.d(view, this.a);
        this.aH.d(this.d.b().ax(new hgw(this, 1)));
        ((ShortsEditCoordinatorLayout) view).i = new zfi() { // from class: hgu
            @Override // defpackage.zfi
            public final void a(Object obj) {
                hhd hhdVar = hhd.this;
                MotionEvent motionEvent = (MotionEvent) obj;
                if (motionEvent == null) {
                    return;
                }
                Rect rect = new Rect();
                hhdVar.at.getGlobalVisibleRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    ((hhz) hhdVar.aj.get()).c(true);
                }
            }
        };
        this.aH.d(((hhz) this.aj.get()).a().ax(new hgw(this, 0)));
    }

    @Override // defpackage.ce
    public final void lZ() {
        bgw bgwVar;
        super.lZ();
        this.ae.q();
        hht hhtVar = this.b;
        hhtVar.z();
        Object obj = hhtVar.k;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
        hhtVar.o = null;
        ShortsPlayerView shortsPlayerView = hhtVar.n;
        if (shortsPlayerView.e != null) {
            shortsPlayerView.a.setSurfaceTextureListener(null);
            pom pomVar = shortsPlayerView.e;
            if (pomVar != null) {
                pomVar.D(shortsPlayerView.k);
            }
            shortsPlayerView.e = null;
            shortsPlayerView.f = null;
        }
        pom pomVar2 = hhtVar.r;
        if (pomVar2 != null && (bgwVar = hhtVar.B) != null) {
            pomVar2.A(bgwVar);
        }
        pom pomVar3 = hhtVar.r;
        if (pomVar3 != null) {
            pomVar3.D(hhtVar);
            hhtVar.r.w();
            hhtVar.r = null;
        }
        zrs zrsVar = hhtVar.s;
        if (zrsVar != null) {
            zrsVar.h();
            hhtVar.s.i();
            hhtVar.s = null;
        }
        zsk zskVar = hhtVar.E;
        if (zskVar != null) {
            zskVar.a();
        }
        this.aH.qc();
        ShortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver = this.aF;
        if (shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver != null) {
            shortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver.a = null;
        }
    }

    @Override // defpackage.acqz
    public final acra mM() {
        return this.a;
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        File file;
        hii hiiVar = this.ag;
        if (hiiVar != null && (file = hiiVar.c) != null) {
            bundle.putString("SHORTS_STATE_EVENT_FILE_PATH_KEY", file.getAbsolutePath());
        }
        hht hhtVar = this.b;
        bundle.putFloat("shorts_editor_preview_audio_balance", hhtVar.w);
        bundle.putString("shorts_editor_preview_currently_playing_track_id", hhtVar.x);
        String str = hhtVar.t.g().b;
        if (FilterMapTable$FilterDescriptor.h(str)) {
            return;
        }
        bundle.putString("shorts_editor_selected_preset_effects", str);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        zrs zrsVar;
        pom pomVar;
        byte[] byteArray;
        this.aH = new ayqw();
        Bundle bundle2 = this.m;
        if (bundle2 != null && (byteArray = bundle2.getByteArray("SHORTS_EDIT_VIDEO_COMMAND_KEY")) != null) {
            try {
                this.ar = (apxf) aonm.parseFrom(apxf.a, byteArray, aomw.b());
            } catch (aoob e) {
                zga.d("Error parsing navigation endpoint.", e);
            }
        }
        hrq hrqVar = this.ai;
        String str = hrqVar.e;
        if (str != null) {
            if (hrqVar.f) {
                hrqVar.d.y(str, avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_ENTERED_SHORTS_EDIT);
            } else {
                hrqVar.c.d(str, null, avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_ENTERED_SHORTS_EDIT);
            }
        }
        this.a.d(acsb.b(96658), this.ar, null);
        this.a.n(new acqx(acsb.c(96638)));
        this.a.n(new acqx(acsb.c(96644)));
        if (this.c.i()) {
            this.a.n(new acqx(acsb.c(106443)));
            ((acqq) this.a).D(new acqx(acsb.c(106444)));
            ((acqq) this.a).D(new acqx(acsb.c(115550)));
            ((acqq) this.a).D(new acqx(acsb.c(115549)));
            if (this.c.j()) {
                ((acqq) this.a).D(new acqx(acsb.c(106445)));
            }
        }
        this.a.n(new acqx(acsb.c(109823)));
        if (this.c.o()) {
            this.a.n(new acqx(acsb.c(119242)));
        }
        this.aB = new jqr(this.a);
        boolean d = this.c.d();
        this.aQ = d;
        if (d) {
            this.aq = new hgb(new ContextThemeWrapper(qR(), this.an.a() == gng.DARK ? R.style.ShortsTheme_AppCompat_FullScreen_Dark : R.style.ShortsTheme_AppCompat_FullScreen_Light), mN(), new hha(this), R.drawable.yt_outline_arrow_undo_black_24, R.string.shorts_editor_close_confirmation_reshoot, R.drawable.yt_outline_paper_corner_folded_black_24, R.string.shorts_editor_close_confirmation_exit);
        }
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.shorts_edit_fragment_2, viewGroup, false);
        this.aG = inflate.findViewById(R.id.shorts_edit_top_bar_container);
        this.as = (ShortsPlayerView) inflate.findViewById(R.id.shorts_edit_player_view);
        final hht hhtVar = this.b;
        Context qR = qR();
        jqr jqrVar = this.aB;
        ShortsPlayerView shortsPlayerView = this.as;
        hhtVar.j = qR;
        hhtVar.n = shortsPlayerView;
        hhtVar.o = this;
        hhtVar.z();
        if (hhtVar.A.j()) {
            hhtVar.p = new hiq();
            hir hirVar = new hir(hhtVar.p);
            hhf hhfVar = hhtVar.G;
            Context context = hhtVar.j;
            hhtVar.r = hhf.a(context, new his(context, hirVar), new hin(hirVar));
        } else {
            hhf hhfVar2 = hhtVar.G;
            Context context2 = hhtVar.j;
            hhtVar.r = hhf.a(context2, new pln(context2), new bej(hhtVar.j));
        }
        if (!hhtVar.A.c() && (pomVar = hhtVar.r) != null) {
            pomVar.R();
        }
        pom pomVar2 = hhtVar.r;
        if (pomVar2 != null) {
            pomVar2.y(hhtVar);
        }
        hhtVar.t.h(hhtVar.i.b);
        hhtVar.s = new zrs(hhtVar.j, new zsc() { // from class: hhq
            @Override // defpackage.zsc
            public final void a(SurfaceTexture surfaceTexture, int i2) {
                final hht hhtVar2 = hht.this;
                final Surface surface = new Surface(surfaceTexture);
                hhtVar2.c.execute(new Runnable() { // from class: hhl
                    @Override // java.lang.Runnable
                    public final void run() {
                        final hht hhtVar3 = hht.this;
                        final Surface surface2 = surface;
                        hhtVar3.v(new zfi() { // from class: hhm
                            @Override // defpackage.zfi
                            public final void a(Object obj) {
                                hht hhtVar4 = hht.this;
                                Surface surface3 = surface2;
                                pom pomVar3 = (pom) obj;
                                if (pomVar3 == null) {
                                    return;
                                }
                                pomVar3.N(surface3);
                                hhtVar4.C();
                            }
                        });
                    }
                });
            }
        }, null, false, hhtVar.H, false);
        hhtVar.s.y(hhtVar.t);
        final int i2 = 1;
        if (((Boolean) hhtVar.A.b.a.a.Y(akuo.u).B().aB()).booleanValue() && (zrsVar = hhtVar.s) != null) {
            zrsVar.i.F = true;
        }
        zrs zrsVar2 = hhtVar.s;
        if (zrsVar2 != null) {
            zrsVar2.j();
        }
        hhtVar.D = hhtVar.A.d();
        pom pomVar3 = hhtVar.r;
        zrs zrsVar3 = hhtVar.s;
        hrv hrvVar = hhtVar.A;
        shortsPlayerView.e = pomVar3;
        shortsPlayerView.f = zrsVar3;
        shortsPlayerView.l = jqrVar;
        shortsPlayerView.a.setSurfaceTextureListener(new hgf(shortsPlayerView));
        pom pomVar4 = shortsPlayerView.e;
        if (pomVar4 != null) {
            pomVar4.y(shortsPlayerView.k);
        }
        shortsPlayerView.i = hrvVar;
        boolean e2 = hrvVar.e();
        shortsPlayerView.j = e2;
        if (e2) {
            shortsPlayerView.c.setVisibility(0);
        }
        hht hhtVar2 = this.b;
        if (bundle != null) {
            if (bundle.containsKey("shorts_editor_preview_audio_balance") && bundle.containsKey("shorts_editor_preview_currently_playing_track_id")) {
                hhtVar2.w = bundle.getFloat("shorts_editor_preview_audio_balance");
                hhtVar2.x = bundle.getString("shorts_editor_preview_currently_playing_track_id");
            }
            if (bundle.containsKey("shorts_editor_selected_preset_effects") && (string = bundle.getString("shorts_editor_selected_preset_effects")) != null) {
                hhtVar2.m().c(string);
            }
        }
        this.aF = new ShortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver(this.b);
        View findViewById = inflate.findViewById(R.id.shorts_post_button);
        this.az = findViewById;
        findViewById.setVisibility(0);
        this.az.setOnClickListener(new View.OnClickListener(this) { // from class: hgt
            public final /* synthetic */ hhd a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 == 0) {
                    this.a.aJ();
                    return;
                }
                hhd hhdVar = this.a;
                aone createBuilder = atmc.a.createBuilder();
                createBuilder.copyOnWrite();
                atmc atmcVar = (atmc) createBuilder.instance;
                atmcVar.b |= 2;
                atmcVar.d = 96644;
                InteractionLoggingScreen interactionLoggingScreen = ((acqq) hhdVar.a).g;
                final int i3 = 1;
                if (interactionLoggingScreen != null) {
                    String str2 = interactionLoggingScreen.a;
                    createBuilder.copyOnWrite();
                    atmc atmcVar2 = (atmc) createBuilder.instance;
                    str2.getClass();
                    atmcVar2.b |= 1;
                    atmcVar2.c = str2;
                }
                final atmc atmcVar3 = (atmc) createBuilder.build();
                final int i4 = 0;
                hhdVar.az.setEnabled(false);
                final hht hhtVar3 = hhdVar.b;
                aok aokVar = hhtVar3.d;
                final hhy hhyVar = hhtVar3.C;
                final Context context3 = hhtVar3.j;
                final zrs zrsVar4 = hhtVar3.s;
                final Uri uri = hhtVar3.l;
                if (zrsVar4 == null) {
                    throw new IllegalArgumentException("Effects pipeline cannot be null");
                }
                ynm.n(aokVar, anfq.i(anfq.i(anht.q(anaf.S(new Callable() { // from class: hhw
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        hhy hhyVar2 = hhy.this;
                        Context context4 = context3;
                        Uri uri2 = uri;
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        gfw.s(uri2, mediaMetadataRetriever, context4.getContentResolver());
                        hpa b = hhyVar2.a.b();
                        long j = 0;
                        if (b != null) {
                            vsy H = b.H();
                            if (hpa.K(b) && H != null) {
                                j = H.n();
                            }
                        }
                        Bitmap t = gfw.t(j, mediaMetadataRetriever);
                        gfw.u(mediaMetadataRetriever);
                        return t;
                    }
                }, hhyVar.c)), new anfz() { // from class: hhv
                    @Override // defpackage.anfz
                    public final anhy a(Object obj) {
                        hhy hhyVar2 = hhy.this;
                        final zrs zrsVar5 = zrsVar4;
                        final Bitmap bitmap = (Bitmap) obj;
                        anic anicVar = hhyVar2.c;
                        zrsVar5.t.getClass();
                        if (zrsVar5.n || !zrsVar5.o) {
                            throw new IllegalStateException("Effects pipeline is destroyed or it is not running.");
                        }
                        anhy V = anaf.V(aci.c(new aeu() { // from class: zqu
                            @Override // defpackage.aeu
                            public final Object a(final aes aesVar) {
                                final zrs zrsVar6 = zrs.this;
                                final Bitmap bitmap2 = bitmap;
                                zrsVar6.w(new Runnable() { // from class: zrd
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zrs zrsVar7 = zrs.this;
                                        Bitmap bitmap3 = bitmap2;
                                        final aes aesVar2 = aesVar;
                                        zrsVar7.i.m(false);
                                        zrsVar7.t.d();
                                        zrsVar7.i.k.a(bitmap3);
                                        zpw zpwVar = zrsVar7.i;
                                        zfi zfiVar = new zfi() { // from class: zrg
                                            @Override // defpackage.zfi
                                            public final void a(Object obj2) {
                                                aes.this.c((Bitmap) obj2);
                                            }
                                        };
                                        zpk zpkVar = zpwVar.c;
                                        zpkVar.e = -1L;
                                        zpkVar.d = zfiVar;
                                    }
                                });
                                return "GetNextOutputAsBitmap";
                            }
                        }), 500L, TimeUnit.MILLISECONDS, anicVar);
                        ynm.k(V, angq.a, new ynk() { // from class: zrc
                            @Override // defpackage.zfi
                            /* renamed from: b */
                            public final void a(Throwable th) {
                                zrs.this.v();
                            }
                        }, new ynl() { // from class: zrf
                            @Override // defpackage.ynl, defpackage.zfi
                            public final void a(Object obj2) {
                                zrs.this.v();
                            }
                        });
                        return V;
                    }
                }, hhyVar.d), new anfz() { // from class: hhu
                    @Override // defpackage.anfz
                    public final anhy a(Object obj) {
                        final hhy hhyVar2 = hhy.this;
                        final Context context4 = context3;
                        final Bitmap bitmap = (Bitmap) obj;
                        return anaf.S(new Callable() { // from class: hhx
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                hhy hhyVar3 = hhy.this;
                                Bitmap bitmap2 = bitmap;
                                Context context5 = context4;
                                hrq hrqVar2 = hhyVar3.b;
                                if (hrqVar2.f) {
                                    hrqVar2.c("Failure while setting thumbnail.", hrqVar2.d.p(hrqVar2.e, bitmap2));
                                }
                                File file = new File(hpa.I(context5).getPath(), "Thumbnail");
                                if (file.exists()) {
                                    File[] listFiles = file.listFiles();
                                    if (listFiles != null) {
                                        for (File file2 : listFiles) {
                                            file2.delete();
                                        }
                                    }
                                } else {
                                    file.mkdirs();
                                }
                                File file3 = new File(file, bamb.a("'thumbnailFile'_yyyyMMdd_HHmmssSSS'.jpg'").a(baju.c()));
                                file3.createNewFile();
                                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                fileOutputStream.close();
                                return file3.getAbsolutePath();
                            }
                        }, hhyVar2.c);
                    }
                }, hhyVar.c), new zfi() { // from class: hho
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        if (i4 == 0) {
                            hht hhtVar4 = hhtVar3;
                            atmc atmcVar4 = atmcVar3;
                            Throwable th = (Throwable) obj;
                            if (th != null) {
                                zga.d("Error generating a thumbnail with effects", th);
                                afsi.c(2, 6, "[ShortsCreation][Android][Edit]Error generating a thumbnail with effects", th);
                            }
                            hhtVar4.A(atmcVar4, null);
                            return;
                        }
                        hhtVar3.A(atmcVar3, (String) obj);
                    }
                }, new zfi() { // from class: hho
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        if (i3 == 0) {
                            hht hhtVar4 = hhtVar3;
                            atmc atmcVar4 = atmcVar3;
                            Throwable th = (Throwable) obj;
                            if (th != null) {
                                zga.d("Error generating a thumbnail with effects", th);
                                afsi.c(2, 6, "[ShortsCreation][Android][Edit]Error generating a thumbnail with effects", th);
                            }
                            hhtVar4.A(atmcVar4, null);
                            return;
                        }
                        hhtVar3.A(atmcVar3, (String) obj);
                    }
                });
            }
        });
        EditorButtonView editorButtonView = (EditorButtonView) inflate.findViewById(R.id.shorts_edit_back);
        editorButtonView.b.getDrawable().setAutoMirrored(true);
        editorButtonView.setOnClickListener(new View.OnClickListener(this) { // from class: hgt
            public final /* synthetic */ hhd a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i == 0) {
                    this.a.aJ();
                    return;
                }
                hhd hhdVar = this.a;
                aone createBuilder = atmc.a.createBuilder();
                createBuilder.copyOnWrite();
                atmc atmcVar = (atmc) createBuilder.instance;
                atmcVar.b |= 2;
                atmcVar.d = 96644;
                InteractionLoggingScreen interactionLoggingScreen = ((acqq) hhdVar.a).g;
                final int i3 = 1;
                if (interactionLoggingScreen != null) {
                    String str2 = interactionLoggingScreen.a;
                    createBuilder.copyOnWrite();
                    atmc atmcVar2 = (atmc) createBuilder.instance;
                    str2.getClass();
                    atmcVar2.b |= 1;
                    atmcVar2.c = str2;
                }
                final atmc atmcVar3 = (atmc) createBuilder.build();
                final int i4 = 0;
                hhdVar.az.setEnabled(false);
                final hht hhtVar3 = hhdVar.b;
                aok aokVar = hhtVar3.d;
                final hhy hhyVar = hhtVar3.C;
                final Context context3 = hhtVar3.j;
                final zrs zrsVar4 = hhtVar3.s;
                final Uri uri = hhtVar3.l;
                if (zrsVar4 == null) {
                    throw new IllegalArgumentException("Effects pipeline cannot be null");
                }
                ynm.n(aokVar, anfq.i(anfq.i(anht.q(anaf.S(new Callable() { // from class: hhw
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        hhy hhyVar2 = hhy.this;
                        Context context4 = context3;
                        Uri uri2 = uri;
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        gfw.s(uri2, mediaMetadataRetriever, context4.getContentResolver());
                        hpa b = hhyVar2.a.b();
                        long j = 0;
                        if (b != null) {
                            vsy H = b.H();
                            if (hpa.K(b) && H != null) {
                                j = H.n();
                            }
                        }
                        Bitmap t = gfw.t(j, mediaMetadataRetriever);
                        gfw.u(mediaMetadataRetriever);
                        return t;
                    }
                }, hhyVar.c)), new anfz() { // from class: hhv
                    @Override // defpackage.anfz
                    public final anhy a(Object obj) {
                        hhy hhyVar2 = hhy.this;
                        final zrs zrsVar5 = zrsVar4;
                        final Bitmap bitmap = (Bitmap) obj;
                        anic anicVar = hhyVar2.c;
                        zrsVar5.t.getClass();
                        if (zrsVar5.n || !zrsVar5.o) {
                            throw new IllegalStateException("Effects pipeline is destroyed or it is not running.");
                        }
                        anhy V = anaf.V(aci.c(new aeu() { // from class: zqu
                            @Override // defpackage.aeu
                            public final Object a(final aes aesVar) {
                                final zrs zrsVar6 = zrs.this;
                                final Bitmap bitmap2 = bitmap;
                                zrsVar6.w(new Runnable() { // from class: zrd
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zrs zrsVar7 = zrs.this;
                                        Bitmap bitmap3 = bitmap2;
                                        final aes aesVar2 = aesVar;
                                        zrsVar7.i.m(false);
                                        zrsVar7.t.d();
                                        zrsVar7.i.k.a(bitmap3);
                                        zpw zpwVar = zrsVar7.i;
                                        zfi zfiVar = new zfi() { // from class: zrg
                                            @Override // defpackage.zfi
                                            public final void a(Object obj2) {
                                                aes.this.c((Bitmap) obj2);
                                            }
                                        };
                                        zpk zpkVar = zpwVar.c;
                                        zpkVar.e = -1L;
                                        zpkVar.d = zfiVar;
                                    }
                                });
                                return "GetNextOutputAsBitmap";
                            }
                        }), 500L, TimeUnit.MILLISECONDS, anicVar);
                        ynm.k(V, angq.a, new ynk() { // from class: zrc
                            @Override // defpackage.zfi
                            /* renamed from: b */
                            public final void a(Throwable th) {
                                zrs.this.v();
                            }
                        }, new ynl() { // from class: zrf
                            @Override // defpackage.ynl, defpackage.zfi
                            public final void a(Object obj2) {
                                zrs.this.v();
                            }
                        });
                        return V;
                    }
                }, hhyVar.d), new anfz() { // from class: hhu
                    @Override // defpackage.anfz
                    public final anhy a(Object obj) {
                        final hhy hhyVar2 = hhy.this;
                        final Context context4 = context3;
                        final Bitmap bitmap = (Bitmap) obj;
                        return anaf.S(new Callable() { // from class: hhx
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                hhy hhyVar3 = hhy.this;
                                Bitmap bitmap2 = bitmap;
                                Context context5 = context4;
                                hrq hrqVar2 = hhyVar3.b;
                                if (hrqVar2.f) {
                                    hrqVar2.c("Failure while setting thumbnail.", hrqVar2.d.p(hrqVar2.e, bitmap2));
                                }
                                File file = new File(hpa.I(context5).getPath(), "Thumbnail");
                                if (file.exists()) {
                                    File[] listFiles = file.listFiles();
                                    if (listFiles != null) {
                                        for (File file2 : listFiles) {
                                            file2.delete();
                                        }
                                    }
                                } else {
                                    file.mkdirs();
                                }
                                File file3 = new File(file, bamb.a("'thumbnailFile'_yyyyMMdd_HHmmssSSS'.jpg'").a(baju.c()));
                                file3.createNewFile();
                                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                fileOutputStream.close();
                                return file3.getAbsolutePath();
                            }
                        }, hhyVar2.c);
                    }
                }, hhyVar.c), new zfi() { // from class: hho
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        if (i4 == 0) {
                            hht hhtVar4 = hhtVar3;
                            atmc atmcVar4 = atmcVar3;
                            Throwable th = (Throwable) obj;
                            if (th != null) {
                                zga.d("Error generating a thumbnail with effects", th);
                                afsi.c(2, 6, "[ShortsCreation][Android][Edit]Error generating a thumbnail with effects", th);
                            }
                            hhtVar4.A(atmcVar4, null);
                            return;
                        }
                        hhtVar3.A(atmcVar3, (String) obj);
                    }
                }, new zfi() { // from class: hho
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        if (i3 == 0) {
                            hht hhtVar4 = hhtVar3;
                            atmc atmcVar4 = atmcVar3;
                            Throwable th = (Throwable) obj;
                            if (th != null) {
                                zga.d("Error generating a thumbnail with effects", th);
                                afsi.c(2, 6, "[ShortsCreation][Android][Edit]Error generating a thumbnail with effects", th);
                            }
                            hhtVar4.A(atmcVar4, null);
                            return;
                        }
                        hhtVar3.A(atmcVar3, (String) obj);
                    }
                });
            }
        });
        View findViewById2 = inflate.findViewById(R.id.shorts_edit_toolbar);
        this.at = findViewById2;
        findViewById2.setVisibility(0);
        if (this.c.f()) {
            ShortsEditToolButtonView shortsEditToolButtonView = (ShortsEditToolButtonView) this.at.findViewById(R.id.shorts_edit_music_picker_button);
            String O = O(R.string.shorts_editor_sound_label);
            TextView textView = shortsEditToolButtonView.b;
            textView.getClass();
            textView.setText(O);
            shortsEditToolButtonView.setContentDescription(O);
        }
        this.aI = inflate.findViewById(R.id.trash_container);
        ((acqq) this.a).D(new acqx(acsb.c(39104)));
        this.a.n(new acqx(acsb.c(116194)));
        this.a.n(new acqx(acsb.c(116195)));
        ImageView imageView = (ImageView) this.aI.findViewById(R.id.trash_icon);
        this.au = imageView;
        imageView.setImageResource(R.drawable.quantum_ic_delete_white_24);
        this.av = this.aI.findViewById(R.id.trash_bg);
        this.ay = new hhc(this.aI);
        ShortsEditToolButtonView shortsEditToolButtonView2 = (ShortsEditToolButtonView) inflate.findViewById(R.id.shorts_edit_text_button);
        this.aL = shortsEditToolButtonView2;
        shortsEditToolButtonView2.setVisibility(0);
        this.af.g(inflate.findViewById(R.id.text_container), inflate.findViewById(R.id.edit_video_container), this.aL, true, true, false, this.a);
        ida idaVar = this.af;
        idaVar.p = 116194;
        idaVar.q = 118661;
        idaVar.r = 116195;
        idaVar.g.n(new acqx(acsb.c(117497)));
        hii hiiVar = this.ag;
        hiiVar.a = this;
        zrx a = hiiVar.a();
        if (bundle != null && a != null) {
            String string2 = bundle.containsKey("SHORTS_STATE_EVENT_FILE_PATH_KEY") ? bundle.getString("SHORTS_STATE_EVENT_FILE_PATH_KEY") : null;
            if (string2 != null) {
                a.g(string2);
            }
        }
        ayqw ayqwVar = this.aH;
        aypy ab = this.ag.b().ab(this.al);
        final ShortsEditToolButtonView shortsEditToolButtonView3 = this.aL;
        shortsEditToolButtonView3.getClass();
        ayqwVar.d(ab.ax(new ayrs() { // from class: hgv
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ShortsEditToolButtonView.this.setEnabled(((Boolean) obj).booleanValue());
            }
        }));
        this.as.setOnTouchListener(new hhb(this, this.ag, this.aI, this.b, this));
        this.aH.d(this.af.c().ax(new hgw(this, i)));
        if (this.c.o()) {
            ShortsEditToolButtonView shortsEditToolButtonView4 = (ShortsEditToolButtonView) inflate.findViewById(R.id.shorts_edit_preset_button);
            this.aM = shortsEditToolButtonView4;
            shortsEditToolButtonView4.setVisibility(0);
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(qR(), R.style.ShortsTheme_AppCompat_FullScreen_Dark);
            ztf m = this.b.m();
            ChooseFilterView chooseFilterView = (ChooseFilterView) LayoutInflater.from(contextThemeWrapper).inflate(R.layout.choose_preset_bottom_sheet_layout, viewGroup, false);
            this.aN = chooseFilterView;
            chooseFilterView.e(m, this);
            TextView textView2 = (TextView) inflate.findViewById(R.id.swipe_effect_text_view);
            hkz hkzVar = this.ah;
            ShortsEditToolButtonView shortsEditToolButtonView5 = this.aM;
            hkzVar.c(this.as, this.aN, textView2, this.aB, amru.r(this.aG), contextThemeWrapper);
            shortsEditToolButtonView5.getClass();
            hkzVar.e = shortsEditToolButtonView5;
            hkzVar.d = acsb.c(119242);
            shortsEditToolButtonView5.setOnClickListener(new hku(hkzVar));
            m.a(new hkv(hkzVar, 2));
            hkzVar.k = m;
            hkzVar.i = acsb.c(122896);
        }
        this.aO = this.c.e();
        this.aP = new hch(this.as.c, qX().getColor(R.color.shorts_edit_guideline_positional_color), qX().getColor(R.color.shorts_edit_guideline_rotational_color), this.a);
        if (this.aO) {
            aone createBuilder = axbj.a.createBuilder();
            aone createBuilder2 = axbk.a.createBuilder();
            boolean z = this.aO;
            createBuilder2.copyOnWrite();
            axbk axbkVar = (axbk) createBuilder2.instance;
            axbkVar.b |= 1;
            axbkVar.c = z;
            int dimensionPixelOffset = this.e.getResources().getDimensionPixelOffset(R.dimen.shorts_edit_guidelines_snapping_distance);
            createBuilder2.copyOnWrite();
            axbk axbkVar2 = (axbk) createBuilder2.instance;
            axbkVar2.b = 2 | axbkVar2.b;
            axbkVar2.d = dimensionPixelOffset;
            createBuilder.copyOnWrite();
            axbj axbjVar = (axbj) createBuilder.instance;
            axbk axbkVar3 = (axbk) createBuilder2.build();
            axbkVar3.getClass();
            axbjVar.c = axbkVar3;
            axbjVar.b |= 1;
            axbj axbjVar2 = (axbj) createBuilder.build();
            zrx a2 = this.ag.a();
            if (a2 != null) {
                zqc zqcVar = a2.b;
                axcl a3 = axcq.a();
                axdn a4 = axdo.a();
                a4.copyOnWrite();
                axdo.c((axdo) a4.instance, axbjVar2);
                a3.copyOnWrite();
                ((axcq) a3.instance).x((axdo) a4.build());
                zqcVar.a.add((axcq) a3.build());
            }
        }
        return inflate;
    }

    @Override // defpackage.zob
    public final void mi() {
    }

    @Override // defpackage.zob
    public final void mj(int i) {
        if (this.c.o() && this.aJ) {
            this.ah.a(i);
        }
    }

    @Override // defpackage.zob
    public final void mo(float f) {
    }

    @Override // defpackage.hnl
    public final hoj q() {
        return this.ae;
    }

    @Override // defpackage.zry
    public final zrx r() {
        return this.b.l();
    }

    @Override // defpackage.hih
    public final void s(final axck axckVar) {
        if (this.aO) {
            final hch hchVar = this.aP;
            hchVar.b.post(new Runnable() { // from class: hcg
                @Override // java.lang.Runnable
                public final void run() {
                    Paint paint;
                    hch hchVar2 = hch.this;
                    axck axckVar2 = axckVar;
                    if (hchVar2.h == null) {
                        Bitmap createBitmap = Bitmap.createBitmap(hchVar2.b.getWidth(), hchVar2.b.getHeight(), hch.a);
                        hchVar2.h = new Canvas(createBitmap);
                        hchVar2.b.setImageBitmap(createBitmap);
                    }
                    Canvas canvas = hchVar2.h;
                    canvas.getClass();
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    if (axckVar2.b.size() != 0) {
                        Iterator it = axckVar2.b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!hch.a((axci) it.next())) {
                                    afsi.b(2, 6, "[ShortsCreation][Android][Guidelines]Invalid GuidelineData");
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        int width = hchVar2.b.getWidth();
                        int height = hchVar2.b.getHeight();
                        for (axci axciVar : axckVar2.b) {
                            if (hch.a(axciVar)) {
                                int c = awxs.c(axciVar.d);
                                if (c == 0 || c != 8) {
                                    paint = hchVar2.c;
                                } else {
                                    paint = hchVar2.d;
                                }
                                axcj axcjVar = axciVar.b;
                                if (axcjVar == null) {
                                    axcjVar = axcj.a;
                                }
                                axcj axcjVar2 = axciVar.c;
                                if (axcjVar2 == null) {
                                    axcjVar2 = axcj.a;
                                }
                                float[] fArr = hchVar2.e;
                                float f = width;
                                fArr[0] = axcjVar.c * f;
                                float f2 = height;
                                fArr[1] = axcjVar.d * f2;
                                fArr[2] = axcjVar2.c * f;
                                fArr[3] = axcjVar2.d * f2;
                                Canvas canvas2 = hchVar2.h;
                                canvas2.getClass();
                                canvas2.drawLines(fArr, paint);
                                hchVar2.f.n(hchVar2.g);
                            }
                        }
                    }
                    if (axckVar2.b.size() > hchVar2.i) {
                        hchVar2.b.performHapticFeedback(1);
                    }
                    hchVar2.i = axckVar2.b.size();
                }
            });
        }
    }
}
