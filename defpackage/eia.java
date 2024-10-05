package defpackage;

import android.content.SharedPreferences;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerOverlayLayout;
import com.google.android.apps.youtube.app.player.overlay.ControlsRelativeLayout;
import com.google.android.apps.youtube.app.player.overlay.FullscreenEngagementPanelCoordinatorLayout;
import com.google.android.apps.youtube.app.ui.MainRtlAwareViewPager;
import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.FullscreenExitController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchContainerLayout;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.UpForFullController;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.libraries.youtube.metadataeditor.geo.EditLocation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eia implements fgy, fnb, ggi, jfx, kie, kjx, koy, lup, nkk, ods, oem, vnh, vny, zni, afof, axqj {
    private final efz a;
    private final eed b;

    public eia() {
    }

    public eia(efz efzVar, eed eedVar) {
        this.a = efzVar;
        this.b = eedVar;
    }

    @Override // defpackage.zni
    public final void a(CameraView cameraView) {
        cameraView.x = new zmn();
        cameraView.z = new agcm((vgz) this.a.a.cZ.get());
        cameraView.w = (hrv) this.a.a.S.get();
    }

    @Override // defpackage.kie
    public final void b(ControlsRelativeLayout controlsRelativeLayout) {
        controlsRelativeLayout.a = (aadw) this.a.D.get();
    }

    @Override // defpackage.afof
    public final void c(EditLocation editLocation) {
        editLocation.b = this.a.cO();
        editLocation.c = this.b.jG();
    }

    @Override // defpackage.vny
    public final void d(EditablePhotoView editablePhotoView) {
        editablePhotoView.q = ((voh) this.b.r().a(voh.class)).d;
        editablePhotoView.r = this.a.a.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kjx
    public final void e(FullscreenEngagementPanelCoordinatorLayout fullscreenEngagementPanelCoordinatorLayout) {
        Long l;
        Long l2;
        fullscreenEngagementPanelCoordinatorLayout.k = (axzf) this.a.yc.get();
        aqvj aqvjVar = fullscreenEngagementPanelCoordinatorLayout.k.a.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45354827L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45354827L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45354827L);
            l = Long.valueOf(aqvkVar.b == 2 ? ((Long) aqvkVar.c).longValue() : 0L);
        } else {
            l = 0L;
        }
        fullscreenEngagementPanelCoordinatorLayout.j = l.intValue();
        aqvj aqvjVar2 = fullscreenEngagementPanelCoordinatorLayout.k.a.b().C;
        if (aqvjVar2 == null) {
            aqvjVar2 = aqvj.a;
        }
        if (aqvjVar2.a(45354760L)) {
            aoot aootVar2 = aqvjVar2.b;
            if (!aootVar2.containsKey(45354760L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar2 = (aqvk) aootVar2.get(45354760L);
            l2 = Long.valueOf(aqvkVar2.b == 2 ? ((Long) aqvkVar2.c).longValue() : 0L);
        } else {
            l2 = 0L;
        }
        fullscreenEngagementPanelCoordinatorLayout.i = l2.intValue();
    }

    @Override // defpackage.vnh
    public final void f(FullscreenErrorView fullscreenErrorView) {
        fullscreenErrorView.d = (tgn) this.a.a.aX.get();
        fullscreenErrorView.e = this.a.a.q();
    }

    @Override // defpackage.ggi
    public final void g(InlinePlayerOverlayLayout inlinePlayerOverlayLayout) {
        inlinePlayerOverlayLayout.d = (ViewGroup) this.b.bU.get();
    }

    @Override // defpackage.fnb
    public final void h(fmt fmtVar) {
        fmtVar.a = (aaea) this.a.K.get();
        fmtVar.b = amsx.s((ahyd) this.b.fL.get(), (ahyd) this.b.jT.get());
        fmtVar.c = new fmu(this.b.a(), (aadw) this.a.D.get());
        fmtVar.d = (fmw) this.b.ov.get();
        fmtVar.e = new ahtk((shf) this.a.g.get(), (ahtp) this.b.aX.get());
        fmtVar.q = (axzg) this.a.hN.get();
    }

    @Override // defpackage.lup
    public final void i(MainRtlAwareViewPager mainRtlAwareViewPager) {
        mainRtlAwareViewPager.i = (ayqd) this.a.a.cY.get();
    }

    @Override // defpackage.ods
    public final void j(NextGenWatchContainerLayout nextGenWatchContainerLayout) {
        nextGenWatchContainerLayout.d = (obr) this.b.r.get();
        nextGenWatchContainerLayout.e = (zao) this.b.B.get();
        nextGenWatchContainerLayout.f = (obr) this.b.r.get();
    }

    @Override // defpackage.oem
    public final void k(NextGenWatchLayout nextGenWatchLayout) {
        nextGenWatchLayout.b = (gju) this.b.gc.get();
        nextGenWatchLayout.E = (aadw) this.a.D.get();
        nextGenWatchLayout.c = (oel) this.b.hA.get();
        nextGenWatchLayout.d = (acra) this.b.ay.get();
        nextGenWatchLayout.e = (oeu) this.b.w.get();
        nextGenWatchLayout.f = (aypn) this.b.C.get();
        nextGenWatchLayout.g = (odg) this.b.jK.get();
        nextGenWatchLayout.h = (UpForFullController) this.b.jN.get();
        nextGenWatchLayout.i = (FullscreenExitController) this.b.gb.get();
        nextGenWatchLayout.j = (nqp) this.b.bu.get();
        nextGenWatchLayout.k = (gpe) this.b.by.get();
        nextGenWatchLayout.l = (oeq) this.b.ow.get();
        nextGenWatchLayout.F = new ajoy(this.b.bu, (byte[]) null, (byte[]) null, (byte[]) null, (short[]) null);
        nextGenWatchLayout.m = (aaea) this.a.K.get();
        nextGenWatchLayout.n = (kow) this.b.bw.get();
        nextGenWatchLayout.o = ((Boolean) this.b.hy.get()).booleanValue();
        nextGenWatchLayout.c.h(nextGenWatchLayout);
        nextGenWatchLayout.e.a(new odx(nextGenWatchLayout));
        nextGenWatchLayout.D = evr.aF(nextGenWatchLayout.E);
    }

    @Override // defpackage.fgy
    public final void l(SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout) {
        eed eedVar = this.b;
        specificNetworkErrorViewLoadingFrameLayout.i = new ajyw(eedVar.s, eedVar.a.kv, eedVar.cu, (byte[]) null, (byte[]) null, (short[]) null, (byte[]) null);
        specificNetworkErrorViewLoadingFrameLayout.h = (ysy) this.a.as.get();
    }

    @Override // defpackage.nkk
    public final void m(SwipeToContainerFrameLayout swipeToContainerFrameLayout) {
        swipeToContainerFrameLayout.j = (aadw) this.a.D.get();
        swipeToContainerFrameLayout.a = ((azrs) this.a.a.cY.get()).U();
        swipeToContainerFrameLayout.b = (SharedPreferences) this.a.z.get();
    }

    @Override // defpackage.koy
    public final void n(kkr kkrVar) {
        kkrVar.a = (kut) this.b.bA.get();
        kkrVar.b = (ayqi) this.a.im.get();
    }

    @Override // defpackage.jfx
    public final void o() {
    }
}
