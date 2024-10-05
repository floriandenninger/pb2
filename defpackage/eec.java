package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.window.java.layout.WindowInfoRepositoryCallbackAdapter;
import androidx.window.layout.WindowInfoRepository;
import com.google.android.apps.youtube.app.common.ads.WatchLayoutStateMonitor;
import com.google.android.apps.youtube.app.common.command.modal.ModalDialogController;
import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import com.google.android.apps.youtube.app.common.notification.NotificationOsSettingEntityController;
import com.google.android.apps.youtube.app.common.player.PlaybackLifecycleMonitor;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBarWrapper;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.common.playervideoviewlayoutdelegate.PlayerVideoViewLayoutDelegateController;
import com.google.android.apps.youtube.app.common.subscriptions.controller.SubscriptionNotificationOptionsDialogFragmentControllerImpl;
import com.google.android.apps.youtube.app.common.tvfilm.RentalActivationOverlay;
import com.google.android.apps.youtube.app.common.tvfilm.TrailerOverlayPresenter;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayoutDelegate;
import com.google.android.apps.youtube.app.common.ui.inline.LoopController;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneFragmentOrientationLocker;
import com.google.android.apps.youtube.app.common.ui.pip.NoOpPipController;
import com.google.android.apps.youtube.app.common.ui.pip.PipObserver;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.systemui.PipWindowInsetsHelper;
import com.google.android.apps.youtube.app.common.ui.theme.elements.ThemeStoreLifecycleController;
import com.google.android.apps.youtube.app.common.ui.tooltip.TooltipPlayerResponseMonitor;
import com.google.android.apps.youtube.app.common.ui.tooltip.TooltipPlayerViewModeMonitor;
import com.google.android.apps.youtube.app.common.util.NfcHelper;
import com.google.android.apps.youtube.app.extensions.livecreation.MainLiveCreationActivity;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity;
import com.google.android.apps.youtube.app.extensions.reel.edit.activity.ReelCameraActivity;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelSnackbarController;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivityCaptionsLifecycleObserver;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivityLifecycleObserver;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivityOrientationController;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelPlaybackErrorLogger;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import com.google.android.apps.youtube.app.mdx.MdxOverlaysPresenter;
import com.google.android.apps.youtube.app.mdx.WatchOnTvMenuItem;
import com.google.android.apps.youtube.app.offline.OfflineModeChangedRefreshController;
import com.google.android.apps.youtube.app.offline.controller.OfflineSlimStatusBarConnectivityController;
import com.google.android.apps.youtube.app.player.DefaultVideoStageMonitor;
import com.google.android.apps.youtube.app.player.PlayerResponseServiceEndpointListener;
import com.google.android.apps.youtube.app.player.autonav.AutonavToggleController;
import com.google.android.apps.youtube.app.player.controls.ListenFirstMenuItemController;
import com.google.android.apps.youtube.app.player.controls.MusicDeeplinkMenuItemController;
import com.google.android.apps.youtube.app.player.controls.ReportVideoController;
import com.google.android.apps.youtube.app.player.controls.SingleLoopMenuItemController;
import com.google.android.apps.youtube.app.player.infocards.YouTubeInfoCardOverlayPresenter;
import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.NoSoundMemoOverlay;
import com.google.android.apps.youtube.app.player.overlay.PipPaidProductBadgeOverlay;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.YouTubeInlineAdOverlay;
import com.google.android.apps.youtube.app.player.overlay.accessibility.TimebarAccessibilityController;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import com.google.android.apps.youtube.app.ui.MultiPageMenuDialogFragmentController;
import com.google.android.apps.youtube.app.ui.PlaylistEditToastController;
import com.google.android.apps.youtube.app.ui.WatchUpsellDialogController;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;
import com.google.android.apps.youtube.app.ui.actionbar.ElevatedAppBarLayout;
import com.google.android.apps.youtube.app.ui.inline.DefaultInlinePlayerControls;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import com.google.android.apps.youtube.app.ui.inline.spotlight.SpotlightScrimLayout;
import com.google.android.apps.youtube.app.ui.presenter.DismissalFollowUpDialogFragmentController;
import com.google.android.apps.youtube.app.watch.engagementpanel.ShowPlaylistEngagementPanelOnUiReadyHandler;
import com.google.android.apps.youtube.app.watch.engagementpanel.WatchEngagementPanelViewContainerController;
import com.google.android.apps.youtube.app.watch.navigation.WatchHistoryPreviousNextController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.VideoStageMonitor;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.UpForFullController;
import com.google.android.apps.youtube.app.watch.playback.MinimizedPlaybackPolicyController;
import com.google.android.apps.youtube.app.watch.playback.SingleLoopPlaybackMonitor;
import com.google.android.apps.youtube.app.watch.playback.WatchResponseCoordinator;
import com.google.android.apps.youtube.app.watchwhile.MdxMainController;
import com.google.android.apps.youtube.app.watchwhile.StartupSignalStream;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import com.google.android.apps.youtube.app.webviewfallback.WebViewFallbackActivity;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioSelectionActivity;
import com.google.android.libraries.youtube.infocards.factories.InfoCardCollection;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInControllerImpl;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.libraries.youtube.player.features.markers.sync.NoOpTimedSyncObserver;
import com.google.android.libraries.youtube.player.features.markers.sync.TimedSyncObserverImpl;
import com.google.android.libraries.youtube.player.features.mediacontroller.VolumeControlsManager;
import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import com.google.android.youtube.R;
import com.google.apps.tiktok.concurrent.futuresmixin.FuturesMixinImpl;
import com.google.protos.youtube.api.innertube.PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint;
import com.google.protos.youtube.api.innertube.RunAttestationCommandOuterClass$RunAttestationCommand;
import com.google.protos.youtube.api.innertube.ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint;
import defpackage.ajmc;
import defpackage.aok;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Function;
import j$.util.function.Supplier;
import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.CronetEngine;
import org.chromium.net.PrivateKeyType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eec implements azrw {
    private final eed a;
    private final int b;

    public eec(eed eedVar, int i) {
        this.a = eedVar;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object i() {
        ammv ammvVar;
        Boolean bool;
        int i = this.b;
        boolean z = true;
        switch (i) {
            case 300:
                return azrh.e().aT();
            case 301:
                eed eedVar = this.a;
                return new kqv(eedVar.a(), (krd) eedVar.dd.get(), (krh) eedVar.de.get(), (kri) eedVar.dg.get());
            case 302:
                eed eedVar2 = this.a;
                return new krd(eedVar2.a(), (ajjz) eedVar2.a.kp.get(), (aaea) eedVar2.a.K.get(), (acra) eedVar2.ay.get());
            case 303:
                eed eedVar3 = this.a;
                return new krh(eedVar3.a(), (ajjz) eedVar3.a.kp.get(), eedVar3.mX(), (aaea) eedVar3.a.K.get(), (acra) eedVar3.ay.get(), null, null, null, null, null);
            case 304:
                eed eedVar4 = this.a;
                return new kri(axqq.a(eedVar4.df), eedVar4.jp(), eedVar4.a.cO());
            case 305:
                return this.a.ju();
            case 306:
                return new NoSoundMemoOverlay(this.a.a());
            case 307:
                return new kmn(this.a.a());
            case 308:
                return new ksl(this.a.a());
            case 309:
                return this.a.dJ();
            case 310:
                eed eedVar5 = this.a;
                return new ahmg((kkf) eedVar5.dr.get(), (ahhc) eedVar5.a.uz.get());
            case 311:
                return this.a.dL();
            case 312:
                return this.a.dY();
            case 313:
                return this.a.mL();
            case 314:
                return this.a.jN();
            case 315:
                eed eedVar6 = this.a;
                return new gnn((SharedPreferences) eedVar6.a.z.get(), (shf) eedVar6.a.g.get());
            case 316:
                return this.a.ml();
            case 317:
                return this.a.mE();
            case 318:
                eed eedVar7 = this.a;
                azrw azrwVar = eedVar7.I;
                efz efzVar = eedVar7.a;
                return new mvg(azrwVar, efzVar.lE, eedVar7.f, eedVar7.dy, efzVar.B, efzVar.dB);
            case 319:
                eed eedVar8 = this.a;
                return new fyx((fgq) eedVar8.A.get(), (Handler) eedVar8.a.an.get(), (Executor) eedVar8.a.i.get(), (shf) eedVar8.a.g.get(), (fxj) eedVar8.f196J.get(), eedVar8.a.xq);
            case 320:
                eed eedVar9 = this.a;
                azrw azrwVar2 = eedVar9.I;
                efz efzVar2 = eedVar9.a;
                return new muv(azrwVar2, efzVar2.lE, eedVar9.f, efzVar2.B, efzVar2.dB, efzVar2.D, efzVar2.im, efzVar2.as, efzVar2.z);
            case 321:
                return this.a.dW();
            case 322:
                eed eedVar10 = this.a;
                return new fwe((shf) eedVar10.a.g.get(), (fgq) eedVar10.A.get(), new Handler(), (aioc) eedVar10.n.get(), (fxj) eedVar10.f196J.get());
            case 323:
                return this.a.mx();
            case 324:
                eed eedVar11 = this.a;
                return new ggt(eedVar11.a(), (ajut) eedVar11.a.lE.get());
            case 325:
                return this.a.av();
            case 326:
                return new SubscriptionNotificationOptionsDialogFragmentControllerImpl((ci) this.a.s.get());
            case 327:
                eed eedVar12 = this.a;
                azrw azrwVar3 = eedVar12.s;
                azrw azrwVar4 = eedVar12.dD;
                azrw azrwVar5 = eedVar12.dw;
                efz efzVar3 = eedVar12.a;
                return new nmc(azrwVar3, azrwVar4, azrwVar5, efzVar3.as, eedVar12.ai, efzVar3.eu, eedVar12.dE, efzVar3.dB, efzVar3.D, null, null, null);
            case 328:
                return this.a.mQ();
            case 329:
                return this.a.iF();
            case 330:
                return this.a.lI();
            case 331:
                return this.a.dX();
            case 332:
                return this.a.jz();
            case 333:
                eed eedVar13 = this.a;
                return new kng((fgq) eedVar13.A.get(), eedVar13.jp(), axqq.a(eedVar13.bf), (acra) eedVar13.ay.get(), (aioc) eedVar13.n.get(), (fgm) eedVar13.bq.get(), (axzg) eedVar13.a.hN.get(), null, null);
            case 334:
                eed eedVar14 = this.a;
                Optional optional = (Optional) eedVar14.dJ.get();
                return new View[]{(View) optional.get(), (TouchImageView) eedVar14.bn.get(), (ImageView) eedVar14.ce.get()};
            case 335:
                eed eedVar15 = this.a;
                return muf.t(eedVar15.a(), (aaea) eedVar15.a.K.get());
            case 336:
                return this.a.ff();
            case 337:
                eed eedVar16 = this.a;
                knm knmVar = new knm((aadw) eedVar16.a.D.get(), eedVar16.bu);
                if (knmVar.a) {
                    ((nqp) knmVar.b.get()).g().a(knmVar);
                    knmVar.d = aypn.e(knmVar.c, ((nqp) knmVar.b.get()).h().j, new knl(0)).n().J().ah().b(0);
                } else {
                    knmVar.d = aypn.z(true);
                }
                return knmVar;
            case 338:
                return this.a.iN();
            case 339:
                return new NoOpTimedSyncObserver();
            case 340:
                eed eedVar17 = this.a;
                aioc aiocVar = (aioc) eedVar17.a.fY.get();
                efz efzVar4 = eedVar17.a;
                return new TimedSyncObserverImpl(aiocVar, new ajyw(efzVar4.dB, efzVar4.au, eedVar17.I, (byte[]) null, (char[]) null), null, null);
            case 341:
                eed eedVar18 = this.a;
                return new mwt(eedVar18.a(), (fxj) eedVar18.f196J.get(), eedVar18.dD, eedVar18.dQ, (fgq) eedVar18.A.get(), new ajoy(eedVar18.a.ka, (short[]) null, (byte[]) null, (char[]) null), eedVar18.jz(), (gfz) eedVar18.aq.get(), (zaw) eedVar18.a.iN.get(), null, null, null, null);
            case 342:
                eed eedVar19 = this.a;
                return new kga(eedVar19.f, eedVar19.a.kp, eedVar19.dP, 4, (int[]) null);
            case 343:
                return this.a.eq();
            case 344:
                eed eedVar20 = this.a;
                Object noOpPipController = ((gkx) eedVar20.dT.get()).b() == 1 ? new NoOpPipController() : (gky) eedVar20.dZ.get();
                ayaw.k(noOpPipController);
                return noOpPipController;
            case 345:
                return this.a.aZ();
            case 346:
                return this.a.ba();
            case 347:
                eed eedVar21 = this.a;
                ci ciVar = (ci) eedVar21.s.get();
                return new gle(ciVar, eedVar21.o, eedVar21.A);
            case 348:
                return this.a.kF();
            case 349:
                return new gld();
            case 350:
                eed eedVar22 = this.a;
                ahfg ahfgVar = (ahfg) eedVar22.dV.get();
                keg kegVar = (keg) eedVar22.a.hT.get();
                fma fmaVar = (fma) eedVar22.a.wk.get();
                aahd aahdVar = (aahd) eedVar22.dW.get();
                acra acraVar = (acra) eedVar22.ay.get();
                ainl jg = eedVar22.jg();
                zbw zbwVar = (zbw) eedVar22.a.av.get();
                ysy ysyVar = (ysy) eedVar22.a.as.get();
                eoa eoaVar = (eoa) eedVar22.a.xw.get();
                ypa ypaVar = (ypa) eedVar22.a.B.get();
                aaea aaeaVar = (aaea) eedVar22.a.K.get();
                nys nysVar = (nys) eedVar22.dX.get();
                fyx fyxVar = (fyx) eedVar22.dy.get();
                ajae S = ((aioc) eedVar22.n.get()).S();
                ayaw.k(S);
                kec kecVar = new kec(ahfgVar, kegVar, fmaVar, aahdVar, acraVar, jg, zbwVar, ysyVar, eoaVar, ypaVar, aaeaVar, nysVar, fyxVar, S, eedVar22.ao(), eedVar22.a.vd);
                ahym ahymVar = (ahym) eedVar22.bw.get();
                ksg ksgVar = (ksg) eedVar22.dH.get();
                fgq fgqVar = (fgq) eedVar22.A.get();
                ahymVar.kR(kecVar);
                ksgVar.b(kecVar);
                fgqVar.i(kecVar);
                return kecVar;
            case 351:
                eed eedVar23 = this.a;
                return new ahfg((kea) eedVar23.bX.get(), (ahnh) eedVar23.dU.get());
            case 352:
                eed eedVar24 = this.a;
                return new ahnh(eedVar24.a(), (ajjz) eedVar24.a.kp.get(), (ViewGroup) eedVar24.dn.get());
            case 353:
                return this.a.hB();
            case 354:
                return this.a.eY();
            case 355:
                return this.a.eK();
            case 356:
                return this.a.jl();
            case 357:
                return this.a.dz();
            case 358:
                eed eedVar25 = this.a;
                return new MdxMainController((ypa) eedVar25.a.B.get(), axqq.a(eedVar25.a.jD), axqq.a(eedVar25.ed), (Handler) eedVar25.a.an.get(), axqq.a(eedVar25.ee), axqq.a(eedVar25.ef), axqq.a(eedVar25.eJ), axqq.a(eedVar25.ah), axqq.a(eedVar25.a.xR), eedVar25.eK, axqq.a(eedVar25.aj), axqq.a(eedVar25.a.ut), axqq.a(eedVar25.a.mi), axqq.a(eedVar25.a.iZ), axqq.a(eedVar25.eG), axqq.a(eedVar25.af), axqq.a(eedVar25.P), axqq.a(eedVar25.eL), eedVar25.dJ, axqq.a(eedVar25.a.jZ));
            case 359:
                eed eedVar26 = this.a;
                ypa ypaVar2 = (ypa) eedVar26.a.B.get();
                efz efzVar5 = eedVar26.a;
                azrw azrwVar6 = efzVar5.jl;
                azrw azrwVar7 = efzVar5.jm;
                jdu i2 = ghe.i();
                adfc adfcVar = (adfc) eedVar26.a.xx.get();
                adlt adltVar = (adlt) eedVar26.a.ja.get();
                efz efzVar6 = eedVar26.a;
                return new addn(ypaVar2, azrwVar6, azrwVar7, i2, adfcVar, adltVar, efzVar6.jD, (acwr) efzVar6.jg.get(), (acwv) eedVar26.a.jW.get(), (acun) eedVar26.a.iu.get(), (acue) eedVar26.a.mj.get(), (c) eedVar26.kD(), null, null, null);
            case 360:
                return this.a.aE();
            case 361:
                eed eedVar27 = this.a;
                return new jcm((acun) eedVar27.a.iu.get(), (aaea) eedVar27.a.K.get(), (aadw) eedVar27.a.D.get(), eedVar27.gR(), (ayqi) eedVar27.a.im.get(), (addf) eedVar27.a.xA.get());
            case 362:
                eed eedVar28 = this.a;
                return new jcr((addn) eedVar28.ed.get(), (jcm) eedVar28.ee.get());
            case 363:
                eed eedVar29 = this.a;
                Activity a = eedVar29.a();
                ono onoVar = (ono) eedVar29.eI.get();
                fwo fwoVar = (fwo) eedVar29.ah.get();
                jcm jcmVar = (jcm) eedVar29.ee.get();
                efz efzVar7 = eedVar29.a;
                return new nkr(a, onoVar, fwoVar, jcmVar, efzVar7.jl, efzVar7.jD);
            case 364:
                eed eedVar30 = this.a;
                Activity a2 = eedVar30.a();
                azrw azrwVar8 = eedVar30.eH;
                if (a2 instanceof WatchWhileActivity) {
                    return (ono) azrwVar8.get();
                }
                return null;
            case 365:
                eed eedVar31 = this.a;
                return new ono(eedVar31.et, (ety) eedVar31.af.get());
            case 366:
                eed eedVar32 = this.a;
                ml mlVar = (ml) eedVar32.j.get();
                AppTabsBar appTabsBar = (AppTabsBar) eedVar32.eh.get();
                ViewGroup viewGroup = (ViewGroup) ((ViewGroup) eedVar32.aG.get()).findViewById(R.id.pane_fragment_container);
                ayaw.k(viewGroup);
                ConstraintLayout constraintLayout = (ConstraintLayout) eedVar32.eg.get();
                lza lzaVar = (lza) eedVar32.eu.get();
                azrw azrwVar9 = eedVar32.am;
                azrw azrwVar10 = eedVar32.ev;
                acqz acqzVar = (acqz) eedVar32.P.get();
                aadw aadwVar = (aadw) eedVar32.a.D.get();
                fzi fziVar = (fzi) eedVar32.ex.get();
                may mayVar = (may) eedVar32.ez.get();
                mbl mblVar = (mbl) eedVar32.eB.get();
                mdp mdpVar = (mdp) eedVar32.eD.get();
                aaea aaeaVar2 = (aaea) eedVar32.a.K.get();
                azrw azrwVar11 = eedVar32.eF;
                if (evr.L(aaeaVar2)) {
                    ammvVar = ammv.j((mec) azrwVar11.get());
                } else {
                    ammvVar = amlr.a;
                }
                return new maw(mlVar, appTabsBar, viewGroup, constraintLayout, lzaVar, azrwVar9, azrwVar10, acqzVar, aadwVar, fziVar, mayVar, mblVar, mdpVar, ammvVar, (ElevatedAppBarLayout) eedVar32.ey.get(), (fzc) eedVar32.eG.get(), mcy.ar(), (aaea) eedVar32.a.K.get(), (ayqi) eedVar32.a.im.get(), (obr) eedVar32.r.get(), eedVar32.gR(), (gje) eedVar32.l.get(), (zaz) eedVar32.B.get(), null);
            case 367:
                return this.a.aB();
            case 368:
                return this.a.i();
            case 369:
                return this.a.km();
            case 370:
                return this.a.aC();
            case 371:
                eed eedVar33 = this.a;
                return new mal((gji) eedVar33.E.get(), (ysy) eedVar33.a.as.get(), (rxm) eedVar33.ei.get(), (zbi) eedVar33.a.iL.get(), mcy.as(), null, null);
            case 372:
                eed eedVar34 = this.a;
                ml mlVar2 = (ml) eedVar34.j.get();
                ysy ysyVar2 = (ysy) eedVar34.a.as.get();
                Bundle a3 = mlVar2.getSavedStateRegistry().a("bundle_is_in_offline_mode");
                Boolean valueOf = a3 != null ? Boolean.valueOf(a3.getBoolean("is_in_offline_mode")) : null;
                if (valueOf != null) {
                    z = valueOf.booleanValue();
                } else if (ysyVar2.o()) {
                    z = false;
                }
                return new rxm(z);
            case 373:
                return new lzf((ggp) this.a.ek.get());
            case 374:
                eed eedVar35 = this.a;
                return new ggp(eedVar35.a(), (acqz) eedVar35.P.get(), (gfy) eedVar35.a.in.get());
            case 375:
                eed eedVar36 = this.a;
                return new WatchOnTvMenuItem(eedVar36.a(), (gni) eedVar36.a.eA.get(), (acue) eedVar36.a.mj.get());
            case 376:
                return this.a.fY();
            case 377:
                eed eedVar37 = this.a;
                return mcy.E((ci) eedVar37.s.get(), (onf) eedVar37.F.get(), (jcm) eedVar37.ee.get(), (fzj) eedVar37.ej.get(), (aadw) eedVar37.a.D.get(), eedVar37.el, (WatchOnTvMenuItem) eedVar37.em.get(), (axzg) eedVar37.a.ig.get());
            case 378:
                eed eedVar38 = this.a;
                akcy akcyVar = (akcy) eedVar38.aj.get();
                aoae aoaeVar = (aoae) eedVar38.ai.get();
                aoae aoaeVar2 = (aoae) eedVar38.eq.get();
                return new akcp(akcyVar, aoaeVar, aoaeVar2, null, null, null);
            case 379:
                return new aoae((byte[]) null, (byte[]) null);
            case 380:
                return new MultiPageMenuDialogFragmentController((ci) this.a.s.get());
            case 381:
                return this.a.fs();
            case 382:
                eed eedVar39 = this.a;
                Activity a4 = eedVar39.a();
                aadw aadwVar2 = (aadw) eedVar39.a.D.get();
                return evr.aV(aadwVar2) ? new lzd(a4, aadwVar2, (aahd) eedVar39.I.get()) : mak.d;
            case 383:
                zau mI = this.a.G().mI();
                ayaw.k(mI);
                return mI;
            case 384:
                eed eedVar40 = this.a;
                return new omw(eedVar40.a(), (oeu) eedVar40.w.get(), (miv) eedVar40.ew.get(), (aypn) eedVar40.C.get());
            case 385:
                eed eedVar41 = this.a;
                Activity a5 = eedVar41.a();
                axzg axzgVar = (axzg) eedVar41.a.ig.get();
                yqw gR = eedVar41.gR();
                gje gjeVar = (gje) eedVar41.l.get();
                InlinePlaybackLifecycleController inlinePlaybackLifecycleController = (InlinePlaybackLifecycleController) eedVar41.x.get();
                ViewGroup viewGroup2 = (ViewGroup) eedVar41.aG.get();
                aqvj aqvjVar = axzgVar.b.b().C;
                if (aqvjVar == null) {
                    aqvjVar = aqvj.a;
                }
                if (aqvjVar.a(45357627L)) {
                    aoot aootVar = aqvjVar.b;
                    if (!aootVar.containsKey(45357627L)) {
                        throw new IllegalArgumentException();
                    }
                    aqvk aqvkVar = (aqvk) aootVar.get(45357627L);
                    bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
                } else {
                    bool = false;
                }
                return (!bool.booleanValue() || zev.e(a5)) ? miv.q : new mit(gR, gjeVar, inlinePlaybackLifecycleController, (SpotlightScrimLayout) ((ViewStub) viewGroup2.findViewById(R.id.spotlight_scrim_stub)).inflate());
            case 386:
                eed eedVar42 = this.a;
                return new may(eedVar42.a(), axqq.a(eedVar42.ey), axqq.a(eedVar42.ch), eedVar42.jp());
            case 387:
                return this.a.ew();
            case 388:
                return this.a.ex();
            case 389:
                return this.a.p();
            case 390:
                return this.a.ey();
            case 391:
                eed eedVar43 = this.a;
                return new mdp(axqq.a(eedVar43.eC), eedVar43.a(), axqq.a(eedVar43.ey), (axzg) eedVar43.a.ig.get(), (ayqi) eedVar43.a.im.get(), eedVar43.gR(), null);
            case 392:
                eed eedVar44 = this.a;
                Activity a6 = eedVar44.a();
                ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(a6).inflate(R.layout.mysubs_filter_bar, (ViewGroup) null);
                ayaw.k(viewGroup3);
                return viewGroup3;
            case 393:
                eed eedVar45 = this.a;
                return new mec(eedVar45.a(), axqq.a(eedVar45.eE), axqq.a(eedVar45.ey), (aaea) eedVar45.a.K.get());
            case 394:
                return this.a.q();
            case 395:
                return this.a.aA();
            case 396:
                eed eedVar46 = this.a;
                return new gbw(eedVar46.aE(), (Handler) eedVar46.a.an.get(), (ajjz) eedVar46.a.kp.get());
            case 397:
                return this.a.G();
            case 398:
                return this.a.aR();
            case 399:
                eed eedVar47 = this.a;
                return new OfflineSlimStatusBarConnectivityController(eedVar47.a(), (ysy) eedVar47.a.as.get(), (rxm) eedVar47.ei.get(), (fgq) eedVar47.A.get(), eedVar47.ji(), (jmk) eedVar47.eP.get(), (afte) eedVar47.a.dx.get(), (afsy) eedVar47.a.au.get(), (ypa) eedVar47.a.B.get(), (aioc) eedVar47.n.get(), (aadw) eedVar47.a.D.get(), null);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        oll ollVar;
        Iterable iterable;
        int i = this.b;
        switch (i) {
            case 1000:
                eed eedVar = this.a;
                syk sykVar = (syk) eedVar.ij.get();
                syd fD = eedVar.fD();
                ajjz ajjzVar = (ajjz) eedVar.a.kp.get();
                ajhe ajheVar = (ajhe) eedVar.a.dU.get();
                afri afriVar = (afri) eedVar.a.yr.get();
                sww swwVar = (sww) eedVar.V.get();
                ajjn ajjnVar = (ajjn) eedVar.a.kh.get();
                shf shfVar = (shf) eedVar.a.g.get();
                Executor executor = (Executor) eedVar.a.aA.get();
                srm fv = eedVar.fv();
                final ajhw ajhwVar = new ajhw(fD, swwVar, ajjzVar, executor, afriVar, ajjnVar, shfVar, ajheVar.o, eedVar.a.ju(), fv);
                return sqb.b(sykVar, new spz() { // from class: ajhx
                    @Override // defpackage.spz
                    public final dgy a(dhe dheVar, sxc sxcVar, Object obj, String str, aoam aoamVar, sod sodVar, List list) {
                        szn sznVar;
                        ajhw ajhwVar2 = ajhw.this;
                        axow axowVar = (axow) obj;
                        syd sydVar = ajhwVar2.a;
                        sww swwVar2 = ajhwVar2.b;
                        ajjz ajjzVar2 = ajhwVar2.c;
                        Executor executor2 = ajhwVar2.d;
                        afri afriVar2 = ajhwVar2.e;
                        ajjn ajjnVar2 = ajhwVar2.f;
                        shf shfVar2 = ajhwVar2.g;
                        int i2 = ajhwVar2.h;
                        boolean z = ajhwVar2.i;
                        syj syjVar = ajhwVar2.j;
                        aoam aO = axowVar.aO();
                        if (aO == null) {
                            throw new syf("ImageType.image missing");
                        }
                        if (aO.Z() == 4 || aO.Z() == 3) {
                            szz szzVar = new szz(sydVar);
                            szx g = szzVar.g(axowVar.aL());
                            szx g2 = szzVar.g(axowVar.aK());
                            sznVar = new szn(g != null ? g.a() : null, g2 != null ? g2.a() : null, swwVar2, axowVar);
                        } else {
                            sznVar = null;
                        }
                        ajht ajhtVar = new ajht();
                        ajht.c(ajhtVar, dheVar, new ajhv());
                        ajhtVar.a.f61J = aO;
                        ajhtVar.d.set(3);
                        ajhtVar.a.y = sydVar;
                        ajhtVar.d.set(9);
                        ajhtVar.a.g = ajjzVar2;
                        ajhtVar.d.set(5);
                        ajhtVar.a.x = axowVar.aI();
                        ajhtVar.d.set(8);
                        ajhtVar.a.e = executor2;
                        ajhtVar.d.set(2);
                        ajhtVar.a.d = sxcVar;
                        ajhtVar.d.set(1);
                        ajhv ajhvVar = ajhtVar.a;
                        ajhvVar.b = sznVar;
                        ajhvVar.A = afriVar2;
                        ajhvVar.f = ajjnVar2;
                        ajhtVar.d.set(4);
                        ajhtVar.a.c = shfVar2;
                        ajhtVar.d.set(0);
                        ajhtVar.a.B = i2;
                        ajhtVar.d.set(11);
                        ajhtVar.a.z = z;
                        ajhtVar.d.set(10);
                        ajhtVar.a.w = syjVar;
                        ajhtVar.d.set(7);
                        if (aoamVar != null) {
                            axof axofVar = new axof();
                            ajhtVar.a.a = Boolean.valueOf(szz.l(aoamVar, axofVar, 168774763, swi.e) && "primary_image".equals(axofVar.X()));
                        }
                        if (axowVar.aM() != null) {
                            ajhtVar.a.H = axowVar.aM();
                        }
                        if (axowVar.aN() != null) {
                            ajhtVar.a.I = axowVar.aN();
                        }
                        ajhtVar.a.v = sxcVar.g;
                        ajhtVar.d.set(6);
                        return ajhtVar;
                    }
                }, 158796345, spo.k);
            case 1001:
                eed eedVar2 = this.a;
                azrw azrwVar = eedVar2.dG;
                azrw azrwVar2 = eedVar2.al;
                azrw azrwVar3 = eedVar2.I;
                efz efzVar = eedVar2.a;
                return new alor(azrwVar, azrwVar2, azrwVar3, efzVar.aw, efzVar.ed, efzVar.ys, null);
            case 1002:
                eed eedVar3 = this.a;
                return new aaxn((aarm) eedVar3.a.er.get(), (ajoy) eedVar3.a.eV.get(), (afsy) eedVar3.a.au.get(), (ysl) eedVar3.a.fO.get(), (byte[]) null, (char[]) null, (byte[]) null, (char[]) null, (byte[]) null);
            case 1003:
                return this.a.jF();
            case 1004:
                return this.a.mi();
            case 1005:
                return this.a.cb();
            case 1006:
                eed eedVar4 = this.a;
                akbo akboVar = (akbo) Optional.of((akbo) eedVar4.f197io.get()).orElse((akbo) eedVar4.in.get());
                ayaw.k(akboVar);
                return akboVar;
            case 1007:
                eed eedVar5 = this.a;
                return new ajfj(eedVar5.a(), eedVar5.im);
            case 1008:
                eed eedVar6 = this.a;
                return new gbk(eedVar6.aE(), (Handler) eedVar6.a.an.get(), eedVar6.gl);
            case 1009:
                return azrl.e().aT();
            case 1010:
                return this.a.y();
            case 1011:
                return this.a.x();
            case 1012:
                eed eedVar7 = this.a;
                return new nkx((ci) eedVar7.s.get(), (akbu) eedVar7.dw.get(), (SharedPreferences) eedVar7.a.z.get(), (fka) eedVar7.a.gN.get());
            case 1013:
                eed eedVar8 = this.a;
                efz efzVar2 = eedVar8.a;
                return new oiy(efzVar2.B, eedVar8.I, efzVar2.lv, efzVar2.iN, eedVar8.dG, eedVar8.iq);
            case 1014:
                ajpa dc = ((nid) this.a.ak.get()).dc();
                ayaw.k(dc);
                return dc;
            case 1015:
                return new ahey(null);
            case 1016:
                return new aoae((byte[]) null, (byte[]) null, (char[]) null);
            case 1017:
                eed eedVar9 = this.a;
                return new abic(eedVar9.a.b.a, (abig) eedVar9.fJ.get(), (abjr) eedVar9.a.xl.get(), (abjv) eedVar9.a.xn.get(), (ypa) eedVar9.a.B.get(), eedVar9.cp, eedVar9.cl, eedVar9.cI, eedVar9.cm, eedVar9.cH, eedVar9.is);
            case 1018:
                return new abhu();
            case 1019:
                return this.a.cZ();
            case 1020:
                eed eedVar10 = this.a;
                return new oia(eedVar10.a(), (abds) eedVar10.a.lv.get(), (ajvb) eedVar10.al.get(), (ypa) eedVar10.a.B.get(), (zaw) eedVar10.a.iN.get(), (acra) eedVar10.ay.get(), (ajun) eedVar10.iu.get(), eedVar10.ju(), (shf) eedVar10.a.g.get(), (jap) eedVar10.iv.get(), ammv.j(efz.jL()));
            case 1021:
                return new ajun();
            case 1022:
                eed eedVar11 = this.a;
                return new jap((shf) eedVar11.a.g.get(), (fgm) eedVar11.bq.get());
            case 1023:
                eed eedVar12 = this.a;
                return new ohq((abds) eedVar12.a.lv.get(), (ajvb) eedVar12.al.get(), (ypa) eedVar12.a.B.get(), (zaw) eedVar12.a.iN.get(), (acra) eedVar12.ay.get(), (ajun) eedVar12.iu.get(), eedVar12.ju(), (shf) eedVar12.a.g.get(), (jap) eedVar12.iv.get(), ammv.j(efz.jL()));
            case 1024:
                return this.a.fi();
            case 1025:
                return this.a.fk();
            case 1026:
                return new ajwt();
            case 1027:
                return new ohv(0);
            case 1028:
                return this.a.mt();
            case 1029:
                eed eedVar13 = this.a;
                return new ajyw(eedVar13.f, eedVar13.al, eedVar13.a.B, (int[]) null, (char[]) null);
            case 1030:
                eed eedVar14 = this.a;
                return new ajyw(eedVar14.f, eedVar14.al, eedVar14.a.B, (byte[]) null, (short[]) null, (char[]) null);
            case 1031:
                eed eedVar15 = this.a;
                eedVar15.a();
                Executor executor2 = (Executor) eedVar15.a.aA.get();
                return new fos(executor2);
            case 1032:
                eed eedVar16 = this.a;
                eedVar16.a();
                Executor executor3 = (Executor) eedVar16.a.aA.get();
                return new fow(executor3);
            case 1033:
                return ammv.j(efz.jL());
            case 1034:
                eed eedVar17 = this.a;
                return new c(eedVar17.f, eedVar17.iE, (int[]) null);
            case 1035:
                return this.a.gR();
            case 1036:
                return this.a.mg();
            case 1037:
                oal oalVar = (oal) this.a.iH.get();
                ayaw.k(oalVar);
                return oalVar;
            case 1038:
                return this.a.fb();
            case 1039:
                return new xin(new xhx[0]);
            case 1040:
                eed eedVar18 = this.a;
                azrw azrwVar4 = eedVar18.f;
                efz efzVar3 = eedVar18.a;
                return new ogx(azrwVar4, efzVar3.D, eedVar18.n, efzVar3.B, (byte[]) null);
            case 1041:
                return new ajoy(this.a.a.ja, (short[]) null, (char[]) null);
            case 1042:
                return new wmw();
            case 1043:
                eed eedVar19 = this.a;
                return new ohy(eedVar19.fk(), eedVar19.ju());
            case 1044:
                eed eedVar20 = this.a;
                return new gpg((aahd) eedVar20.I.get(), amsx.s((gpf) eedVar20.iI.get(), (gpf) eedVar20.iJ.get()));
            case 1045:
                eed eedVar21 = this.a;
                final ShowPlaylistEngagementPanelOnUiReadyHandler showPlaylistEngagementPanelOnUiReadyHandler = new ShowPlaylistEngagementPanelOnUiReadyHandler((aadw) eedVar21.a.D.get(), (ahqr) eedVar21.a.rx.get(), (aahd) eedVar21.I.get());
                showPlaylistEngagementPanelOnUiReadyHandler.b = new ahqp() { // from class: nuc
                    @Override // defpackage.ahqp
                    public final void a(ahqo ahqoVar) {
                        ShowPlaylistEngagementPanelOnUiReadyHandler showPlaylistEngagementPanelOnUiReadyHandler2 = ShowPlaylistEngagementPanelOnUiReadyHandler.this;
                        showPlaylistEngagementPanelOnUiReadyHandler2.c = ahqoVar;
                        showPlaylistEngagementPanelOnUiReadyHandler2.h();
                    }
                };
                return showPlaylistEngagementPanelOnUiReadyHandler;
            case 1046:
                return new nub((aioc) this.a.n.get());
            case 1047:
                return this.a.eL();
            case 1048:
                return this.a.eM();
            case 1049:
                eed eedVar22 = this.a;
                return new ogx(eedVar22.fO, eedVar22.dw, eedVar22.a.eA, eedVar22.ay);
            case 1050:
                eed eedVar23 = this.a;
                return new nto((ypa) eedVar23.a.B.get(), (aahd) eedVar23.I.get(), (abds) eedVar23.a.lv.get(), (zaw) eedVar23.a.iN.get(), (aoae) eedVar23.ir.get(), (gpe) eedVar23.by.get(), null, null, null, null);
            case 1051:
                return this.a.fj();
            case 1052:
                eed eedVar24 = this.a;
                return new ojs((kch) eedVar24.u.get(), (oel) eedVar24.hA.get());
            case 1053:
                eed eedVar25 = this.a;
                Activity a = eedVar25.a();
                axpg a2 = axqq.a(eedVar25.bu);
                aadw aadwVar = (aadw) eedVar25.a.D.get();
                aaea aaeaVar = (aaea) eedVar25.a.K.get();
                nvd nvdVar = (nvd) eedVar25.iT.get();
                gpg gpgVar = (gpg) eedVar25.iK.get();
                aioc aiocVar = (aioc) eedVar25.n.get();
                WatchEngagementPanelViewContainerController watchEngagementPanelViewContainerController = new WatchEngagementPanelViewContainerController(a, a2, aadwVar, aaeaVar, nvdVar, gpgVar, aiocVar);
                nuv nuvVar = (nuv) eedVar25.hB.get();
                final ayqj ayqjVar = (ayqj) eedVar25.iU.get();
                final ayqj ayqjVar2 = (ayqj) eedVar25.iV.get();
                watchEngagementPanelViewContainerController.a = nuvVar.a.U().aj(new ayrv() { // from class: nuz
                    @Override // defpackage.ayrv
                    public final Object a(Object obj) {
                        ayqj ayqjVar3 = ayqj.this;
                        ayqj ayqjVar4 = ayqjVar2;
                        nuu nuuVar = (nuu) obj;
                        String.valueOf(String.valueOf(nuuVar)).length();
                        if (nuuVar == nuu.PORTRAIT_WATCH_PANEL) {
                            return ayqjVar3.l();
                        }
                        if (nuuVar == nuu.LANDSCAPE_PLAYER_OVERLAY) {
                            return ayqjVar4.l();
                        }
                        return aypy.I();
                    }
                }).B().p(nuw.a);
                return watchEngagementPanelViewContainerController;
            case 1054:
                eed eedVar26 = this.a;
                return new nvd(axqq.a(eedVar26.bu), axqq.a(eedVar26.iQ), (nuv) eedVar26.hB.get(), (ayqj) eedVar26.iR.get(), (ayqj) eedVar26.iS.get());
            case 1055:
                return this.a.eU();
            case 1056:
                return ((ojz) this.a.iO.get()).f;
            case 1057:
                return azrr.F((kke) this.a.bA.get());
            case 1058:
                return ((ojz) this.a.iO.get()).e;
            case 1059:
                return azrr.F((kke) this.a.bA.get());
            case 1060:
                eed eedVar27 = this.a;
                return new oqk((gje) eedVar27.l.get(), (obr) eedVar27.r.get(), (axze) eedVar27.a.a.aF.get());
            case 1061:
                eed eedVar28 = this.a;
                return new fcw((ypa) eedVar28.a.B.get(), (actg) eedVar28.a.jO.get(), (aadw) eedVar28.a.D.get());
            case 1062:
                eed eedVar29 = this.a;
                WatchWhileActivity fq = eedVar29.fq();
                ony onyVar = (ony) eedVar29.E.get();
                omy omyVar = (omy) eedVar29.iX.get();
                return new ook(fq, onyVar, omyVar, (aftn) eedVar29.a.a.aH.get(), (afsy) eedVar29.a.au.get(), (wdj) eedVar29.a.a.aI.get(), (aahd) eedVar29.I.get(), (fgj) eedVar29.a.jp.get(), (gcl) eedVar29.bj.get(), eedVar29.iZ, (afte) eedVar29.a.dx.get(), (wdm) eedVar29.a.au.get(), (fxj) eedVar29.f196J.get(), (aaea) eedVar29.a.K.get(), (aadw) eedVar29.a.D.get(), eedVar29.ja, eedVar29.fW(), eedVar29.et);
            case 1063:
                eed eedVar30 = this.a;
                return new omy(eedVar30.fq());
            case 1064:
                return this.a.fr();
            case 1065:
                return new aifh((ypa) this.a.a.B.get());
            case 1066:
                return this.a.kx();
            case 1067:
                return new oqf((gje) this.a.l.get(), (opq) eed.lh());
            case 1068:
                eed eedVar31 = this.a;
                return new ejk((afsy) eedVar31.a.au.get(), (ci) eedVar31.s.get(), (aatg) eedVar31.a.mq.get(), (wkk) eedVar31.a.da.get(), (wiz) eedVar31.a.mr.get(), (ypa) eedVar31.a.B.get(), (aaxn) eedVar31.a.a.x.get(), (HatsController) eedVar31.hj.get(), (Executor) eedVar31.a.i.get(), (gjr) eedVar31.at.get(), (ysy) eedVar31.a.as.get(), (axzg) eedVar31.a.wC.get(), null, null, null, null, null);
            case 1069:
                eed eedVar32 = this.a;
                return new okw((ml) eedVar32.j.get(), eedVar32.je, eedVar32.iZ, (gje) eedVar32.l.get(), gfw.E(), ghe.h(), null, null, null, null);
            case 1070:
                eed eedVar33 = this.a;
                ml mlVar = (ml) eedVar33.j.get();
                aahd aahdVar = (aahd) eedVar33.I.get();
                ajdh ajdhVar = (ajdh) eedVar33.cG.get();
                afsy afsyVar = (afsy) eedVar33.a.au.get();
                fgj fgjVar = (fgj) eedVar33.a.jp.get();
                fcw fcwVar = (fcw) eedVar33.iW.get();
                azrw azrwVar5 = eedVar33.fE;
                azrw azrwVar6 = eedVar33.dq;
                orr orrVar = (orr) eedVar33.jc.get();
                epq epqVar = (epq) eedVar33.jd.get();
                ony onyVar2 = (ony) eedVar33.E.get();
                ety etyVar = (ety) eedVar33.af.get();
                onm onmVar = (onm) eedVar33.eN.get();
                efz efzVar4 = eedVar33.a;
                return new onk(mlVar, aahdVar, ajdhVar, afsyVar, fgjVar, fcwVar, azrwVar5, azrwVar6, orrVar, epqVar, onyVar2, etyVar, onmVar, efzVar4.ha, (Executor) efzVar4.i.get(), (aadw) eedVar33.a.D.get(), (ypa) eedVar33.a.B.get(), eedVar33.a.lO, mcy.ar(), ghe.h(), gfw.E(), (acpl) eedVar33.a.aw.get(), (fcv) eedVar33.a.wZ.get(), (actg) eedVar33.a.jO.get(), null, null, null, null);
            case 1071:
                return new orr((aahd) this.a.I.get());
            case 1072:
                eed eedVar34 = this.a;
                return new epq(eedVar34.I, (aadw) eedVar34.a.D.get());
            case 1073:
                return new gil();
            case 1074:
                return this.a.fO();
            case 1075:
                return new abrn(null);
            case 1076:
                eed eedVar35 = this.a;
                return xuq.k(axqq.a(eedVar35.jn), axqq.a(eedVar35.jo), eedVar35.a.b.a);
            case 1077:
                return xuq.i();
            case 1078:
                return xuq.j();
            case 1079:
                eed eedVar36 = this.a;
                return new hrq(eedVar36.a.gD(), (akyb) eedVar36.a.mG.get(), (akvf) eedVar36.a.mN.get(), (hrv) eedVar36.a.a.S.get(), (Executor) eedVar36.a.f.get());
            case 1080:
                return ghe.q();
            case 1081:
                return this.a.gS();
            case 1082:
                return this.a.kP();
            case 1083:
                eed eedVar37 = this.a;
                Optional kj = eedVar37.kj();
                final axpg a3 = axqq.a(eedVar37.js);
                yxe yxeVar = (yxe) kj.map(new Function() { // from class: ooi
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj) {
                        final buc bucVar = (buc) obj;
                        return new yxa(yxi.b(new kgh(axpg.this, 1), new yxd() { // from class: fuq
                            @Override // defpackage.yxd
                            public final void a(Object obj2) {
                                Map.Entry entry = (Map.Entry) obj2;
                                buc.this.b((String) entry.getKey(), (bub) entry.getValue());
                            }
                        }, new yxj() { // from class: fur
                            @Override // defpackage.yxj
                            public final void a(Object obj2) {
                                buc bucVar2 = buc.this;
                                bucVar2.a.c((String) ((Map.Entry) obj2).getKey());
                            }
                        }));
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return Function.CC.$default$compose(this, function);
                    }
                }).orElse(yxi.a);
                ayaw.k(yxeVar);
                aadw aadwVar2 = (aadw) eedVar37.a.D.get();
                Object obj = (okn) eedVar37.jA.get();
                asvu asvuVar = aadwVar2.b().e;
                if (asvuVar == null) {
                    asvuVar = asvu.a;
                }
                if (!asvuVar.bW) {
                    obj = new yxh(1);
                }
                ayaw.k(obj);
                final gje gjeVar = (gje) eedVar37.l.get();
                axpg a4 = axqq.a(eedVar37.jB);
                gjeVar.getClass();
                return amsx.t(yxeVar, obj, yxi.b(a4, new yxd() { // from class: gjg
                    @Override // defpackage.yxd
                    public final void a(Object obj2) {
                        gje.this.m((gjd) obj2);
                    }
                }, yxg.b));
            case 1084:
                return amrz.k("pane_nav_controller", (bub) this.a.l.get());
            case 1085:
                return this.a.fp();
            case 1086:
                return amsx.r(old.a);
            case 1087:
                eed eedVar38 = this.a;
                aoj c = old.c(eedVar38.jt, (aadw) eedVar38.a.D.get());
                ayaw.k(c);
                aoj c2 = old.c(eedVar38.ju, (aadw) eedVar38.a.D.get());
                ayaw.k(c2);
                aoj c3 = old.c(eedVar38.di, (aadw) eedVar38.a.D.get());
                ayaw.k(c3);
                aoj c4 = old.c(eedVar38.jv, (aadw) eedVar38.a.D.get());
                ayaw.k(c4);
                return amsx.v(c, c2, c3, c4, old.a);
            case 1088:
                eed eedVar39 = this.a;
                return new NfcHelper(eedVar39.a(), (Executor) eedVar39.a.i.get(), eedVar39.o);
            case 1089:
                return new ThemeStoreLifecycleController((gnf) this.a.a.ny.get());
            case 1090:
                eed eedVar40 = this.a;
                aahv aahvVar = (aahv) eedVar40.a.dB.get();
                efz efzVar5 = eedVar40.a;
                return new NotificationOsSettingEntityController(aahvVar, efzVar5.b.a, (afyt) efzVar5.eu.get());
            case 1091:
                return amsx.r(old.a);
            case 1092:
                eed eedVar41 = this.a;
                return new StartupSignalStream((ypa) eedVar41.a.B.get(), (eni) eedVar41.a.cL.get(), (adpl) eedVar41.a.ws.get(), (oll) eedVar41.jx.get(), (aadw) eedVar41.a.D.get(), (ond) eedVar41.jy.get(), null);
            case 1093:
                eed eedVar42 = this.a;
                azrw azrwVar7 = eedVar42.jw;
                asvu asvuVar2 = ((aadw) eedVar42.a.D.get()).b().e;
                if (asvuVar2 == null) {
                    asvuVar2 = asvu.a;
                }
                if (asvuVar2.cE) {
                    ollVar = (oll) azrwVar7.get();
                } else {
                    ollVar = oll.a;
                }
                ayaw.k(ollVar);
                return ollVar;
            case 1094:
                return new olq((acpl) this.a.a.aw.get());
            case 1095:
                eed eedVar43 = this.a;
                adpl adplVar = (adpl) eedVar43.a.ws.get();
                aadw aadwVar3 = (aadw) eedVar43.a.D.get();
                yqw gR = eedVar43.gR();
                efz efzVar6 = eedVar43.a;
                return new ond(adplVar, aadwVar3, gR, efzVar6.cK, efzVar6.kp, null);
            case 1096:
                return amsx.r((gjd) this.a.a.a.aJ.get());
            case 1097:
                return this.a.li();
            case 1098:
                return this.a.kO();
            case 1099:
                eed eedVar44 = this.a;
                amsv j = amsx.j(6);
                aaea aaeaVar2 = (aaea) eedVar44.a.K.get();
                azrw azrwVar8 = eedVar44.jD;
                aujs aujsVar = aaeaVar2.a().u;
                if (aujsVar == null) {
                    aujsVar = aujs.a;
                }
                if (!aujsVar.j) {
                    iterable = amvs.a;
                } else {
                    iterable = amsx.r((aoj) azrwVar8.get());
                }
                ayaw.k(iterable);
                j.j(iterable);
                j.c((aoj) eedVar44.jE.get());
                j.c((aoj) eedVar44.jF.get());
                j.c((aoj) eedVar44.jG.get());
                j.c((aoj) eedVar44.jH.get());
                j.c((aoj) eedVar44.gG.get());
                return j.g();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object a() {
        nkl nklVar;
        aaha aahaVar;
        int i = this.b;
        final int i2 = 1;
        switch (i) {
            case 0:
                return new Intent(this.a.a.b.a, (Class<?>) WebViewFallbackActivity.class);
            case 1:
                return this.a.jY();
            case 2:
                return ajbp.g(this.a.kd(), null);
            case 3:
                return this.a.jZ();
            case 4:
                return eed.lg();
            case 5:
                eed eedVar = this.a;
                return new amdz((ames) eedVar.d.get(), eedVar.lj());
            case 6:
                return ammv.j(this.a.jX());
            case 7:
                final ames amesVar = (ames) this.a.d.get();
                amesVar.getClass();
                return new FuturesMixinImpl(new azrw() { // from class: amci
                    @Override // defpackage.azrw
                    public final Object get() {
                        return ames.this.b();
                    }
                }, amesVar, amesVar.getLifecycle());
            case 8:
                return this.a.a();
            case 9:
                return this.a.bc();
            case 10:
                eed eedVar2 = this.a;
                Activity a = eedVar2.a();
                amrz n = amrz.n(MainLiveCreationActivity.class, eedVar2.g, ReelWatchActivity.class, eedVar2.h, ShortsCreationActivity.class, eedVar2.i, WatchWhileActivity.class, eedVar2.jh);
                aaea aaeaVar = (aaea) eedVar2.a.K.get();
                if (n.get(a.getClass()) != null) {
                    nklVar = (nkl) ((azrw) n.get(a.getClass())).get();
                } else {
                    nklVar = new nkl(aaeaVar, gzp.d);
                }
                ayaw.k(nklVar);
                return nklVar;
            case 11:
                return new nkl((aaea) this.a.a.K.get(), gzp.a);
            case 12:
                return new nkl((aaea) this.a.a.K.get(), gzp.c);
            case 13:
                return new nkl((aaea) this.a.a.K.get(), gzp.b);
            case 14:
                eed eedVar3 = this.a;
                aaea aaeaVar2 = (aaea) eedVar3.a.K.get();
                final giv givVar = (giv) eedVar3.ae.get();
                final its h = ghe.h();
                final ety etyVar = (ety) eedVar3.af.get();
                return new nkl(aaeaVar2, new amnv() { // from class: olt
                    @Override // defpackage.amnv
                    public final Object get() {
                        ety etyVar2 = ety.this;
                        giv givVar2 = givVar;
                        its itsVar = h;
                        if (etyVar2.i()) {
                            return false;
                        }
                        PaneDescriptor a2 = givVar2.a();
                        if (a2 == null) {
                            return true;
                        }
                        return Boolean.valueOf(itsVar.i(a2));
                    }
                });
            case 15:
                eed eedVar4 = this.a;
                Optional optional = (Optional) eedVar4.ht.get();
                final azrw azrwVar = eedVar4.jg;
                azrwVar.getClass();
                giv givVar2 = (giv) optional.orElseGet(new Supplier() { // from class: omb
                    @Override // j$.util.function.Supplier
                    public final Object get() {
                        return (giv) azrw.this.get();
                    }
                });
                ayaw.k(givVar2);
                return givVar2;
            case 16:
                eed eedVar5 = this.a;
                Activity a2 = eedVar5.a();
                azrw azrwVar2 = eedVar5.E;
                if (a2 instanceof WatchWhileActivity) {
                    return Optional.of((giv) azrwVar2.get());
                }
                return Optional.empty();
            case 17:
                eed eedVar6 = this.a;
                euc G = eedVar6.G();
                gje gjeVar = (gje) eedVar6.l.get();
                ScrollSelectionController scrollSelectionController = (ScrollSelectionController) eedVar6.m.get();
                okf okfVar = (okf) eedVar6.ao.get();
                rxm rxmVar = (rxm) eedVar6.ei.get();
                kbv kbvVar = (kbv) eedVar6.eQ.get();
                fcw fcwVar = (fcw) eedVar6.iW.get();
                lso lsoVar = (lso) eedVar6.dS.get();
                ong ongVar = (ong) eedVar6.ga.get();
                fxj fxjVar = (fxj) eedVar6.f196J.get();
                aaea aaeaVar3 = (aaea) eedVar6.a.K.get();
                azrw azrwVar3 = eedVar6.af;
                azrw azrwVar4 = eedVar6.jb;
                azrw azrwVar5 = eedVar6.iZ;
                efz efzVar = eedVar6.a;
                return new ony(G, gjeVar, scrollSelectionController, okfVar, rxmVar, kbvVar, fcwVar, lsoVar, ongVar, fxjVar, aaeaVar3, azrwVar3, azrwVar4, azrwVar5, efzVar.ks, efzVar.kv, ghe.s(), (iyq) eedVar6.hX.get(), ghe.h(), mcy.at(), mcy.as(), mcy.ar(), gfw.E(), eedVar6.et, (nbm) eedVar6.gh.get(), (aadw) eedVar6.a.D.get(), (okw) eedVar6.jf.get(), (axzg) eedVar6.a.wC.get(), null, null, null, null);
            case 18:
                return this.a.kt();
            case 19:
                return (ml) this.a.a();
            case 20:
                return this.a.mT();
            case 21:
                return new aahf(1);
            case 22:
                Optional map = this.a.kj().map(ght.h);
                ayaw.k(map);
                return map;
            case 23:
                return new ScrollSelectionController();
            case 24:
                return this.a.fn();
            case 25:
                return this.a.ji();
            case 26:
                aioc aiocVar = ((ahzx) this.a.a.eQ.get()).a;
                ayaw.k(aiocVar);
                return aiocVar;
            case 27:
                eed eedVar7 = this.a;
                return new ojz(eedVar7.iN, (oja) eedVar7.aI.get(), (fgq) eedVar7.A.get(), eedVar7.bq);
            case 28:
                return this.a.ky();
            case 29:
                return this.a.aF();
            case 30:
                eed eedVar8 = this.a;
                return new oop((gap) eedVar8.p.get(), (fgq) eedVar8.A.get(), (zaz) eedVar8.B.get(), (aypn) eedVar8.C.get(), eedVar8.dR);
            case 31:
                return this.a.aD();
            case 32:
                eed eedVar9 = this.a;
                fgq fgqVar = (fgq) (amrz.k(WatchWhileActivity.class, true).containsKey(eedVar9.a().getClass()) ? eedVar9.y.get() : eedVar9.z.get());
                ayaw.k(fgqVar);
                return fgqVar;
            case 33:
                return this.a.aq();
            case 34:
                return azrh.aN(false).aT();
            case 35:
                return new obr();
            case 36:
                eed eedVar10 = this.a;
                oeu oeuVar = new oeu(eedVar10.v);
                ((obr) eedVar10.r.get()).a(oeuVar);
                return oeuVar;
            case 37:
                eed eedVar11 = this.a;
                return new kda(eedVar11.ji(), eedVar11.jc(), (kch) eedVar11.u.get());
            case 38:
                return this.a.du();
            case 39:
                dd supportFragmentManager = ((ci) this.a.s.get()).getSupportFragmentManager();
                ayaw.k(supportFragmentManager);
                return supportFragmentManager;
            case 40:
                return this.a.a();
            case 41:
                return new InlinePlaybackLifecycleController((Handler) this.a.a.an.get());
            case 42:
                return new foi();
            case 43:
                return new zao(this.a.a().getWindow());
            case 44:
                return ((zaz) this.a.B.get()).d();
            case 45:
                return this.a.jr();
            case 46:
                return this.a.lf();
            case 47:
                return this.a.kI();
            case 48:
                eed eedVar12 = this.a;
                Collection b = stb.b(eedVar12.kM());
                Collection a3 = stb.a(eedVar12.kM());
                Pair create = Pair.create(new ajie(), asul.a.getParserForType());
                ayaw.k(create);
                Pair create2 = Pair.create(new ajjc(), aumx.a.getParserForType());
                ayaw.k(create2);
                return ssv.e(b, a3, ssv.f(amrz.l(asul.class, create, ajjc.class, create2), amvs.a), eedVar12.fD(), ammv.j((ammy) eedVar12.a.ym.get()));
            case 49:
                return this.a.kq();
            case 50:
                return new slp();
            case 51:
                return this.a.jn();
            case 52:
                return this.a.fz();
            case 53:
                return this.a.fA();
            case 54:
                eed eedVar13 = this.a;
                ammv j = ammv.j((Boolean) eedVar13.a.dQ.get());
                efz efzVar2 = eedVar13.a;
                return shr.c(j, efzVar2.b.a, eedVar13.D, ammv.j(efzVar2.az()));
            case 55:
                return this.a.hA();
            case 56:
                aalv aalvVar = (aalv) this.a.G.get();
                aagt g = aagx.g();
                g.c(amrz.k(apft.class, aalvVar));
                return g.a();
            case 57:
                return this.a.hO();
            case 58:
                eed eedVar14 = this.a;
                return new onf(eedVar14.a(), (ffs) eedVar14.a.wR.get(), (gji) eedVar14.E.get());
            case 59:
                eed eedVar15 = this.a;
                amrw i3 = amrz.i(12);
                i3.g(avuo.class, eedVar15.S);
                i3.g(apgt.class, eedVar15.T);
                i3.g(atei.class, eedVar15.U);
                i3.g(awnw.class, eedVar15.W);
                i3.g(apft.class, eedVar15.G);
                i3.g(aqqm.class, eedVar15.X);
                i3.g(PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.class, eedVar15.aa);
                i3.g(RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.class, eedVar15.ab);
                i3.g(ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint.class, eedVar15.ac);
                i3.g(atuy.class, eedVar15.ad);
                i3.g(atux.class, eedVar15.ad);
                i3.g(atuw.class, eedVar15.ad);
                amrz c = i3.c();
                aahd aahdVar = (aahd) eedVar15.a.iM.get();
                aagt g2 = aagx.g();
                g2.b(c);
                g2.d(aahdVar);
                return g2.a();
            case 60:
                eed eedVar16 = this.a;
                Activity a4 = eedVar16.a();
                wzq wzqVar = (wzq) eedVar16.a.rQ.get();
                eul eulVar = (eul) eedVar16.Q.get();
                final LoggingUrlsPingController loggingUrlsPingController = (LoggingUrlsPingController) eedVar16.R.get();
                ajcx ajcxVar = (ajcx) eedVar16.a.fQ.get();
                acqz acqzVar = (acqz) eedVar16.P.get();
                Executor executor = (Executor) eedVar16.a.i.get();
                axzf axzfVar = (axzf) eedVar16.a.nw.get();
                yzm yzmVar = (yzm) eedVar16.a.wT.get();
                loggingUrlsPingController.getClass();
                return new ffp(a4, wzqVar, eulVar, new ffo() { // from class: ffl
                    @Override // defpackage.ffo
                    public final Uri a(String str, Map map2) {
                        return LoggingUrlsPingController.this.g(str, map2);
                    }
                }, ajcxVar, acqzVar, executor, axzfVar, yzmVar, null, null, null, null);
            case 61:
                eed eedVar17 = this.a;
                return new eul((fxj) eedVar17.f196J.get(), (aahd) eedVar17.I.get(), (acqz) eedVar17.P.get());
            case 62:
                return this.a.az();
            case 63:
                eed eedVar18 = this.a;
                amsv j2 = amsx.j(2);
                j2.c((fxi) eedVar18.a.wS.get());
                j2.j((Iterable) eedVar18.N.get());
                return j2.g();
            case 64:
                return this.a.kQ();
            case 65:
                eed eedVar19 = this.a;
                return amsx.u((fxi) eedVar19.H.get(), (fxi) eedVar19.K.get(), (fxi) eedVar19.L.get(), (fxi) eedVar19.M.get());
            case 66:
                eed eedVar20 = this.a;
                return new ipm((ajmu) eedVar20.a.ma.get(), eedVar20.a.dr);
            case 67:
                eed eedVar21 = this.a;
                return new omz((aahd) eedVar21.I.get(), (aahd) eedVar21.a.rN.get(), (fxj) eedVar21.f196J.get());
            case 68:
                return this.a.kn();
            case 69:
                return this.a.eR();
            case 70:
                return this.a.iv();
            case 71:
                return this.a.a.cO();
            case 72:
                final acqq cO = this.a.a.cO();
                return new acqz() { // from class: iec
                    @Override // defpackage.acqz
                    public final acra mM() {
                        return acqq.this;
                    }
                };
            case 73:
                return (ReelCameraActivity) this.a.a();
            case 74:
                return this.a.fq();
            case 75:
                eed eedVar22 = this.a;
                return new LoggingUrlsPingController(eedVar22.a.rU, new ffd(), eedVar22.a.bs(), (afuh) eedVar22.a.hz.get(), (Executor) eedVar22.a.f.get(), (aioc) eedVar22.n.get());
            case 76:
                return this.a.lu();
            case 77:
                return new iql((iqw) this.a.a());
            case 78:
                return this.a.js();
            case 79:
                return new ipt((ips) this.a.a());
            case 80:
                eed eedVar23 = this.a;
                aaxn aaxnVar = (aaxn) eedVar23.a.a.a.get();
                dd ddVar = (dd) eedVar23.t.get();
                return new wkp(aaxnVar, ddVar, ((Integer) eedVar23.Y.get()).intValue(), (aahd) eedVar23.I.get(), null, null, null, null);
            case 81:
                return this.a.kl();
            case 82:
                return Integer.valueOf(R.id.verification_edit_container);
            case 83:
                return Integer.valueOf(R.id.phone_verification_container);
            case 84:
                return new wkq((aaxn) this.a.a.a.c.get(), null, null, null);
            case 85:
                return new wkr((aaxn) this.a.a.a.d.get(), null, null, null);
            case 86:
                return new iqm((ipw) this.a.a.a.e.get());
            case 87:
                eed eedVar24 = this.a;
                Map kL = eedVar24.kL();
                amrz l = amrz.l(PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.class, eedVar24.Z, RunAttestationCommandOuterClass$RunAttestationCommand.class, eedVar24.hU);
                HashMap hashMap = new HashMap();
                hashMap.putAll(kL);
                hashMap.putAll(l);
                aagt g3 = aagx.g();
                g3.b(hashMap);
                return g3.a();
            case 88:
                eed eedVar25 = this.a;
                axzg axzgVar = (axzg) eedVar25.a.kt.get();
                azrw azrwVar6 = eedVar25.gu;
                azrw azrwVar7 = eedVar25.gv;
                if (axzgVar.o().booleanValue()) {
                    aahaVar = (aaha) azrwVar7.get();
                } else {
                    aahaVar = (aaha) azrwVar6.get();
                }
                ayaw.k(aahaVar);
                return aahaVar;
            case 89:
                eed eedVar26 = this.a;
                Object obj = eedVar26.gj.get();
                Executor executor2 = (Executor) eedVar26.a.f.get();
                Executor executor3 = (Executor) eedVar26.a.i.get();
                fjn fjnVar = (fjn) eedVar26.gt.get();
                efz efzVar3 = eedVar26.a;
                return new gse((gpz) obj, executor2, executor3, fjnVar, efzVar3.gH, efzVar3.fr());
            case 90:
                return this.a.ko();
            case 91:
                eed eedVar27 = this.a;
                Activity a5 = eedVar27.a();
                azrw azrwVar8 = eedVar27.af;
                if (a5 instanceof WatchWhileActivity) {
                    return (etz) azrwVar8.get();
                }
                return null;
            case 92:
                eed eedVar28 = this.a;
                euc G2 = eedVar28.G();
                azrw azrwVar9 = eedVar28.ae;
                azrw azrwVar10 = eedVar28.E;
                onm onmVar = (onm) eedVar28.eN.get();
                ScrollSelectionController scrollSelectionController2 = (ScrollSelectionController) eedVar28.m.get();
                ActiveStateScrollSelectionController activeStateScrollSelectionController = (ActiveStateScrollSelectionController) eedVar28.eO.get();
                fgj fgjVar = (fgj) eedVar28.a.jp.get();
                fwo fwoVar = (fwo) eedVar28.ah.get();
                okf okfVar2 = (okf) eedVar28.ao.get();
                fgq fgqVar2 = (fgq) eedVar28.A.get();
                gjz gjzVar = (gjz) eedVar28.aD.get();
                kbv kbvVar2 = (kbv) eedVar28.eQ.get();
                efz efzVar4 = eedVar28.a;
                final ooc oocVar = new ooc(G2, azrwVar9, azrwVar10, onmVar, scrollSelectionController2, activeStateScrollSelectionController, fgjVar, fwoVar, okfVar2, fgqVar2, gjzVar, kbvVar2, efzVar4.uz, (aadw) efzVar4.D.get(), (aaea) eedVar28.a.K.get(), (gky) eedVar28.ea.get(), eedVar28.a.wG, (ajdh) eedVar28.cG.get(), (aasd) eedVar28.a.eL.get(), (aivb) eedVar28.as.get(), (lso) eedVar28.dS.get(), (kda) eedVar28.v.get(), (YouTubePlayerOverlaysLayout) eedVar28.dm.get(), (kct) eedVar28.eR.get(), (ypa) eedVar28.a.B.get(), (adlt) eedVar28.a.ja.get(), (flu) eedVar28.eS.get(), axqq.a(eedVar28.bO), (gfz) eedVar28.aq.get(), (ahqr) eedVar28.a.rx.get(), (ahwy) eedVar28.a.xS.get(), (acra) eedVar28.ay.get(), (nym) eedVar28.eT.get(), axqq.a(eedVar28.eU), (kch) eedVar28.u.get(), eedVar28.eV, amsx.w((fks) eedVar28.eW.get(), (fks) eedVar28.fD.get(), (fks) eedVar28.fE.get(), (fks) eedVar28.fF.get(), (fks) eedVar28.fG.get(), (fks) eedVar28.fH.get(), (fks) eedVar28.bt.get(), (fks) eedVar28.fI.get(), (fks) eedVar28.fK.get(), (fks) eedVar28.fM.get(), (fks) eedVar28.fN.get(), (fks) eedVar28.fQ.get(), (fks) eedVar28.fR.get(), (fks) eedVar28.fS.get(), (fks) eedVar28.fT.get(), (fks) eedVar28.fU.get(), (fks) eedVar28.fV.get(), (fks) eedVar28.fX.get(), (fks) eedVar28.dt.get(), (fks) eedVar28.fY.get(), (fks) eedVar28.fZ.get()), (ong) eedVar28.ga.get(), (aioc) eedVar28.n.get(), (zaz) eedVar28.B.get(), (fln) eedVar28.aZ.get(), eedVar28.gd, (oqi) eedVar28.gg.get(), (azrs) eedVar28.q.get(), gfw.E(), (aifk) eedVar28.a.fS.get(), eedVar28.a.xW, (gop) eedVar28.aC.get(), eedVar28.fq(), (nbm) eedVar28.gh.get(), (slr) eedVar28.dR.get(), axqq.a(eedVar28.gi), null, null, null, null, null);
                final int i4 = 0;
                oocVar.y.g(((aypy) eedVar28.be.get()).ax(new ayrs() { // from class: ooa
                    @Override // defpackage.ayrs
                    public final void a(Object obj2) {
                        if (i2 == 0) {
                            oocVar.z = ((Boolean) obj2).booleanValue();
                        } else {
                            oocVar.r(2, 1);
                        }
                    }
                }), oocVar.s.ax(new ayrs() { // from class: ooa
                    @Override // defpackage.ayrs
                    public final void a(Object obj2) {
                        if (i4 == 0) {
                            oocVar.z = ((Boolean) obj2).booleanValue();
                        } else {
                            oocVar.r(2, 1);
                        }
                    }
                }));
                return oocVar;
            case 93:
                eed eedVar29 = this.a;
                return new onm((ml) eedVar29.j.get(), eedVar29.E, eedVar29.af, eedVar29.aw, eedVar29.aH, eedVar29.a.wG, (oja) eedVar29.aI.get(), (kch) eedVar29.u.get(), eedVar29.dO, (okf) eedVar29.ao.get(), (fgq) eedVar29.A.get(), (mwt) eedVar29.dP.get(), (lso) eedVar29.dS.get(), (gje) eedVar29.l.get(), (gky) eedVar29.ea.get(), (cnd) eedVar29.a.dr.get(), (adly) eedVar29.a.jy.get(), (aaea) eedVar29.a.K.get(), (mja) eedVar29.eb.get(), axqq.a(eedVar29.eM), (miv) eedVar29.ew.get());
            case 94:
                return this.a.eP();
            case 95:
                eed eedVar30 = this.a;
                return new fwo((Handler) eedVar30.a.an.get(), (fwl) eedVar30.ag.get());
            case 96:
                return new fwl();
            case 97:
                eed eedVar31 = this.a;
                return new akcy(eedVar31.jO(), (aahd) eedVar31.I.get(), (acqz) eedVar31.P.get());
            case 98:
                return new aoae((short[]) null);
            case 99:
                eed eedVar32 = this.a;
                return new nkt(eedVar32.a(), (fka) eedVar32.a.gN.get(), (akch) eedVar32.aj.get(), (fgo) eedVar32.af.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        int i = this.b;
        switch (i) {
            case 1200:
                eed eedVar = this.a;
                return new jlg((ci) eedVar.s.get(), (akbz) eedVar.gp.get(), (fka) eedVar.a.gN.get());
            case 1201:
                eed eedVar2 = this.a;
                aadw aadwVar = (aadw) eedVar2.a.D.get();
                akbz akbzVar = (akbz) eedVar2.bj.get();
                return new ooh(aadwVar, akbzVar, (fuo) eedVar2.a.rh.get(), (shf) eedVar2.a.g.get(), (acpl) eedVar2.a.aw.get(), (fuj) eedVar2.a.ri.get(), (ypa) eedVar2.a.B.get(), (ci) eedVar2.s.get());
            case 1202:
                eed eedVar3 = this.a;
                WatchWhileActivity fq = eedVar3.fq();
                aadw aadwVar2 = (aadw) eedVar3.a.D.get();
                gcl gclVar = (gcl) eedVar3.bj.get();
                fxj fxjVar = (fxj) eedVar3.f196J.get();
                gni gniVar = (gni) eedVar3.a.eA.get();
                return new lwy(fq, fq, aadwVar2, gclVar, fxjVar, gniVar, (ywr) eedVar3.a.ez.get(), (afsy) eedVar3.a.au.get(), eedVar3.fX(), (wju) eedVar3.en.get());
            case 1203:
                eed eedVar4 = this.a;
                return new lsr((ci) eedVar4.s.get(), (gcl) eedVar4.bj.get(), (gni) eedVar4.a.eA.get(), (ywr) eedVar4.a.ez.get(), (afsy) eedVar4.a.au.get(), eedVar4.fX(), (wju) eedVar4.en.get());
            case 1204:
                return new oki((acqz) this.a.P.get());
            case 1205:
                eed eedVar5 = this.a;
                return new eoh(eedVar5.a(), (aaea) eedVar5.a.K.get(), (aadw) eedVar5.a.D.get(), (acqz) eedVar5.P.get(), axqq.a(eedVar5.I), eedVar5.a.xw, axqq.a(eedVar5.iE), axqq.a(eedVar5.A), axqq.a(eedVar5.o), axqq.a(eedVar5.a.xM), (aioc) eedVar5.a.fY.get(), axqq.a(eedVar5.ao), axqq.a(eedVar5.bu), axqq.a(eedVar5.cG), (ayqi) eedVar5.a.im.get(), (ayqi) eedVar5.a.aq.get(), (Executor) eedVar5.a.f.get());
            case 1206:
                return new mcy();
            case 1207:
                eed eedVar6 = this.a;
                return amsx.r(new okl((aadw) eedVar6.a.D.get(), (YouTubePlayerOverlaysLayout) eedVar6.dm.get(), axqq.a(eedVar6.dl)));
            case 1208:
                eed eedVar7 = this.a;
                return new onv((StartupSignalStream) eedVar7.jz.get(), (aadw) eedVar7.a.D.get(), eedVar7.gR(), (ayqi) eedVar7.a.im.get());
            case 1209:
                eed eedVar8 = this.a;
                return new ola(axqq.a(eedVar8.eM), (aadw) eedVar8.a.D.get(), eedVar8.G(), (StartupSignalStream) eedVar8.jz.get(), eedVar8.gR(), (SharedPreferences) eedVar8.a.z.get());
            case 1210:
                WebViewFallbackActivity webViewFallbackActivity = (WebViewFallbackActivity) this.a.a();
                webViewFallbackActivity.setContentView(R.layout.web_view_fallback_activity);
                return webViewFallbackActivity;
            case 1211:
                lu supportActionBar = ((ml) this.a.j.get()).getSupportActionBar();
                supportActionBar.getClass();
                return new oqo(supportActionBar);
            case 1212:
                ViewGroup viewGroup = (ViewGroup) ((WebViewFallbackActivity) this.a.kL.get()).findViewById(R.id.web_view_custom_view_container);
                ayaw.k(viewGroup);
                return new oqx(viewGroup);
            case 1213:
                eed eedVar9 = this.a;
                Object obj = eedVar9.kR.get();
                oqz k = ghe.k();
                oqz k2 = ghe.k();
                CookieManager l = ghe.l();
                URI create = URI.create(((org) eedVar9.kR.get()).d());
                ayaw.k(create);
                return new ord((org) obj, k, k2, new orj(l, create, eedVar9.kS), (Executor) eedVar9.a.i.get());
            case 1214:
                eed eedVar10 = this.a;
                Object obj2 = eedVar10.kO.get();
                azrw azrwVar = eedVar10.kP;
                azrw azrwVar2 = eedVar10.kQ;
                if (true == ((oqr) obj2).a) {
                    azrwVar = azrwVar2;
                }
                org orgVar = (org) azrwVar.get();
                ayaw.k(orgVar);
                return orgVar;
            case 1215:
                return new oqr(((WebViewFallbackActivity) this.a.kL.get()).getIntent().getBooleanExtra(WebViewFallbackActivity.b, false));
            case 1216:
                return new orf((aaea) this.a.a.K.get());
            case 1217:
                return new ore();
            case 1218:
                Locale locale = ((WebViewFallbackActivity) this.a.kL.get()).getResources().getConfiguration().locale;
                ayaw.k(locale);
                return locale;
            case 1219:
                eed eedVar11 = this.a;
                WebView o = eedVar11.o();
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ((WebViewFallbackActivity) eedVar11.kL.get()).findViewById(R.id.web_view_refresh_layout);
                ayaw.k(swipeRefreshLayout);
                return new orp(o, swipeRefreshLayout, (ord) eedVar11.kT.get());
            case 1220:
                return this.a.a.li().r();
            case 1221:
                return new vot(this.a.fI());
            case 1222:
                eed eedVar12 = this.a;
                ci ciVar = (ci) eedVar12.s.get();
                amlr amlrVar = amlr.a;
                akht akhtVar = new akht(eedVar12.la, eedVar12.a.f, eedVar12.lc, eedVar12.ld, eedVar12.le, (short[]) null);
                akht akhtVar2 = new akht(eedVar12.a.f, eedVar12.lf, eedVar12.lg, eedVar12.ld, eedVar12.lh, (byte[]) null, (short[]) null);
                akht akhtVar3 = new akht(eedVar12.a.f, eedVar12.ld, eedVar12.le, eedVar12.lj, eedVar12.lk, (char[]) null, (char[]) null);
                akht akhtVar4 = new akht(eedVar12.ll, eedVar12.a.f, eedVar12.ld, eedVar12.le, eedVar12.lj, (short[]) null, (byte[]) null);
                efz efzVar = eedVar12.a;
                return (vme) eq.d(ciVar, new vmf(amlrVar, akhtVar, akhtVar2, akhtVar3, akhtVar4, new yfl(efzVar.by, efzVar.f, (byte[]) null, (char[]) null), new akht(eedVar12.a.f, eedVar12.la, eedVar12.lc, eedVar12.le, eedVar12.ld, (byte[]) null, (byte[]) null, (char[]) null), null, null, null, null)).a(vme.class);
            case 1223:
                return this.a.fG();
            case 1224:
                eed eedVar13 = this.a;
                return new vll((aybv) eedVar13.kW.get(), (anib) eedVar13.a.f.get(), new vlh(eedVar13.a.b.a), (Account) eedVar13.kZ.get());
            case 1225:
                Context context = this.a.a.b.a;
                vln vlnVar = vln.PROD;
                vlnVar.getClass();
                return ayfe.a((String) vlo.a.get(vlnVar), 443, new CronetEngine.Builder(context).build()).c();
            case 1226:
                return (Account) ((vrn) this.a.kY.get()).a.c();
            case 1227:
                eed eedVar14 = this.a;
                return new vrn((ci) eedVar14.s.get(), (vjv) eedVar14.kX.get());
            case 1228:
                efz efzVar2 = this.a.a;
                return axxp.a.get().m() ? new vjx(new trp(efzVar2.a.dm.c.b.a, (short[]) null), null, null) : new vjw(efzVar2.b.a);
            case 1229:
                aofn aofnVar = (aofn) this.a.lb.get();
                aone createBuilder = aocx.a.createBuilder();
                aone createBuilder2 = aocw.a.createBuilder();
                createBuilder2.copyOnWrite();
                aocw aocwVar = (aocw) createBuilder2.instance;
                aocwVar.d = 1;
                aocwVar.b |= 2;
                createBuilder2.copyOnWrite();
                aocw aocwVar2 = (aocw) createBuilder2.instance;
                aocwVar2.c = 5;
                aocwVar2.b |= 1;
                String str = aofnVar.d;
                createBuilder2.copyOnWrite();
                aocw aocwVar3 = (aocw) createBuilder2.instance;
                str.getClass();
                aocwVar3.b |= 4;
                aocwVar3.e = str;
                int e = awxr.e(aofnVar.c);
                if (e == 0) {
                    e = 1;
                }
                createBuilder2.copyOnWrite();
                aocw aocwVar4 = (aocw) createBuilder2.instance;
                aocwVar4.f = e - 1;
                aocwVar4.b |= 8;
                createBuilder.copyOnWrite();
                aocx aocxVar = (aocx) createBuilder.instance;
                aocw aocwVar5 = (aocw) createBuilder2.build();
                aocwVar5.getClass();
                aocxVar.c = aocwVar5;
                aocxVar.b |= 1;
                aocx aocxVar2 = (aocx) createBuilder.build();
                ayaw.k(aocxVar2);
                return aocxVar2;
            case 1230:
                return (aofn) ((vrn) this.a.kY.get()).b.c();
            case 1231:
                return new ajoy(this.a.a.a.bG, (boolean[]) null);
            case 1232:
                return new vlm(this.a.md(), null);
            case 1233:
                eed eedVar15 = this.a;
                tug a = ((tuh) eedVar15.a.a.bH.get()).a((Account) eedVar15.kZ.get());
                ayaw.k(a);
                return a;
            case 1234:
                return this.a.mG();
            case 1235:
                return this.a.md();
            case 1236:
                eed eedVar16 = this.a;
                Context context2 = eedVar16.a.b.a;
                return new vlz(context2, new qlm(context2, "OBAKE", (String) eedVar16.li.get()), eedVar16.kf());
            case 1237:
                return ((vrn) this.a.kY.get()).a();
            case 1238:
                aoez aoezVar = ((vrn) this.a.kY.get()).c;
                ayaw.k(aoezVar);
                return aoezVar;
            case 1239:
                eed eedVar17 = this.a;
                return new vmw(eedVar17.fG(), (anib) eedVar17.a.f.get(), (aocx) eedVar17.lc.get());
            case 1240:
                eed eedVar18 = this.a;
                return new vmo(eedVar18.fG(), (anib) eedVar18.a.f.get(), (aocx) eedVar18.lc.get());
            case 1241:
                eed eedVar19 = this.a;
                return new voh(eedVar19.mG(), (anib) eedVar19.a.f.get(), eedVar19.mN(), szr.g(), null, null);
            case 1242:
                eed eedVar20 = this.a;
                return new vpt(eedVar20.fJ(), eedVar20.fI(), eedVar20.fK());
            case 1243:
                return new voo(((vme) this.a.lm.get()).a);
            case 1244:
                return new vqh(this.a.fJ());
            case 1245:
                return new vql(((vme) this.a.lm.get()).e);
            case 1246:
                return this.a.fM();
            case 1247:
                return new vnk();
            case 1248:
                eed eedVar21 = this.a;
                return new vkb((ammv) eedVar21.ln.get(), eedVar21.a().getResources());
            case 1249:
                eed eedVar22 = this.a;
                Activity a2 = eedVar22.a();
                vjv vjvVar = (vjv) eedVar22.kX.get();
                String stringExtra = a2.getIntent().getStringExtra("com.google.profile.photopicker.ACCOUNT");
                if (!TextUtils.isEmpty(stringExtra)) {
                    for (Account account : vjvVar.a()) {
                        if (account.name.equals(stringExtra)) {
                            return ammv.j(new vjz(a2, account, vjvVar));
                        }
                    }
                }
                return amlr.a;
            case 1250:
                return new vnr((vlx) this.a.lj.get(), szr.g(), szr.g());
            case 1251:
                eed eedVar23 = this.a;
                ci ciVar2 = (ci) eedVar23.s.get();
                vrq fN = eedVar23.fN();
                tgd q = eedVar23.a.a.q();
                vro vroVar = new vro(eedVar23.a(), new akhi(eedVar23.a()), null);
                return new vru(ciVar2, fN, q, vroVar, eedVar23.lt, eedVar23.lu);
            case 1252:
                return new vls();
            case 1253:
                return new vls();
            case 1254:
                return new vlu((char[]) null);
            case 1255:
                return new vqo();
            case 1256:
                return new vqk();
            case 1257:
                eed eedVar24 = this.a;
                return szr.i(eedVar24.a(), eedVar24.kN());
            case 1258:
                wlu wluVar = (wlu) ((EditVideoActivity) this.a.a()).getSupportFragmentManager().f("verification_fragment_tag");
                ayaw.k(wluVar);
                return wluVar;
            case 1259:
                wlu wluVar2 = (wlu) this.a.iq().getSupportFragmentManager().f("LIVE_ENABLEMENT_FRAGMENT_NAME");
                ayaw.k(wluVar2);
                return wluVar2;
            case 1260:
                wlu wluVar3 = (wlu) ((ml) this.a.a()).getSupportFragmentManager().f("verification_fragment_tag");
                ayaw.k(wluVar3);
                return wluVar3;
            case 1261:
                wlu wluVar4 = (wlu) this.a.cR().getSupportFragmentManager().f("verificationFragmentTag");
                ayaw.k(wluVar4);
                return wluVar4;
            case 1262:
                wlu wluVar5 = (wlu) this.a.iq().getSupportFragmentManager().f("LIVE_ENABLEMENT_FRAGMENT_NAME");
                ayaw.k(wluVar5);
                return wluVar5;
            case 1263:
                return new ajoy(this.a.lx, (byte[]) null, (byte[]) null, (char[]) null);
            case 1264:
                return new ajoy(this.a.a.lZ, (char[]) null, (char[]) null);
            case 1265:
                return new amet(this.a.a(), amvs.a);
            case 1266:
                return this.a.C();
            case 1267:
                eed eedVar25 = this.a;
                final Context g = eedVar25.g();
                final gma bc = eedVar25.bc();
                final ajvb ajvbVar = (ajvb) eedVar25.al.get();
                return new ajoq() { // from class: ied
                    /* JADX WARN: Type inference failed for: r1v1, types: [ajos, java.lang.Object] */
                    @Override // defpackage.ajoq
                    public final ajom b(ViewGroup viewGroup2) {
                        return new ajne(g, bc, ajvbVar.get());
                    }
                };
            case 1268:
                eed eedVar26 = this.a;
                return new kyo(eedVar26.a(), (afsy) eedVar26.a.au.get(), (aftn) eedVar26.a.uZ.get(), (aayg) eedVar26.a.jq.get(), (zaw) eedVar26.a.iN.get(), (ypa) eedVar26.a.B.get(), (aahd) eedVar26.I.get(), (Executor) eedVar26.a.i.get());
            case 1269:
                eed eedVar27 = this.a;
                return new jgv((rxm) eedVar27.ei.get(), (gje) eedVar27.l.get(), eedVar27.a.kv, ghe.s(), ghe.h(), ghe.r(), null, null, null);
            case 1270:
                final nkl nklVar = (nkl) this.a.ji.get();
                nklVar.getClass();
                return new akbd(new amnv() { // from class: nkm
                    @Override // defpackage.amnv
                    public final Object get() {
                        return Boolean.valueOf(nkl.this.a());
                    }
                });
            case 1271:
                return this.a.as();
            case 1272:
                return new ahbw();
            case 1273:
                return this.a.jD();
            case 1274:
                eed eedVar28 = this.a;
                Activity a3 = eedVar28.a();
                aadw aadwVar3 = (aadw) eedVar28.a.D.get();
                fxj fxjVar2 = (fxj) eedVar28.f196J.get();
                aipt aiptVar = (aipt) eedVar28.a.iB.get();
                asvu asvuVar = aadwVar3.b().e;
                if (asvuVar == null) {
                    asvuVar = asvu.a;
                }
                return asvuVar.r ? new lsn(a3, aadwVar3, fxjVar2, aiptVar) : lsb.a;
            case 1275:
                return abfm.n();
            case 1276:
                return this.a.jB();
            case 1277:
                return this.a.mZ();
            case 1278:
                eed eedVar29 = this.a;
                return new aklv(eedVar29.a(), (aahd) eedVar29.I.get(), 1, null);
            case 1279:
                return new ajun(null, null, null, null);
            case 1280:
                return new kxh(this.a.lN, 1);
            case 1281:
                eed eedVar30 = this.a;
                return new esi(eedVar30.a(), (ajjz) eedVar30.a.kp.get(), (aahd) eedVar30.I.get(), (xhr) eedVar30.a.mf.get(), (fwi) eedVar30.aw.get(), eedVar30.as(), eedVar30.mz(), eedVar30.mr(), new ajyw(eedVar30.f, eedVar30.a.kp, eedVar30.I, null, null, null, null, null, null), (unx) eedVar30.a.a.bO.get(), (hbb) eedVar30.a.lN.get(), (hak) eedVar30.hs.get(), (akbu) eedVar30.dw.get(), eedVar30.jG(), null, null, null, null, null, null);
            case 1282:
                return new xqi((Handler) this.a.a.an.get());
            case 1283:
                return this.a.jA();
            case 1284:
                return abfm.n();
            case 1285:
                eed eedVar31 = this.a;
                return new jwb((jws) eedVar31.gq.get(), (jvz) eedVar31.lS.get(), (fiu) eedVar31.a.ku.get());
            case 1286:
                eed eedVar32 = this.a;
                return new jvz((ci) eedVar32.s.get(), (aalw) eedVar32.a.wp.get(), (aahd) eedVar32.I.get(), (ajut) eedVar32.a.lE.get());
            case 1287:
                return abfm.n();
            case 1288:
                return this.a.mr();
            case 1289:
                return abfm.n();
            case 1290:
                return new DismissalFollowUpDialogFragmentController((ci) this.a.s.get());
            case 1291:
                eed eedVar33 = this.a;
                eedVar33.a();
                return new lru((adlt) eedVar33.a.ja.get(), null);
            case 1292:
                eed eedVar34 = this.a;
                return new akht(eedVar34.f, eedVar34.jj, eedVar34.x, eedVar34.lZ, eedVar34.mf, (char[]) null, (byte[]) null, (char[]) null);
            case 1293:
                return new fkc();
            case 1294:
                eed eedVar35 = this.a;
                azrw azrwVar3 = eedVar35.f;
                efz efzVar3 = eedVar35.a;
                return ghe.o(azrwVar3, efzVar3.kp, efzVar3.lE, eedVar35.I, eedVar35.lG, eedVar35.bL, eedVar35.aq, eedVar35.bJ, eedVar35.ma, eedVar35.mb, eedVar35.mc, efzVar3.D, eedVar35.lH, eedVar35.md, eedVar35.me);
            case 1295:
                eed eedVar36 = this.a;
                return new ajyw(eedVar36.f, eedVar36.lE, eedVar36.lV, (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 1296:
                eed eedVar37 = this.a;
                return new ajnv(eedVar37.a(), (aahd) eedVar37.I.get(), (ajun) eedVar37.lU.get(), null, null);
            case 1297:
                efz efzVar4 = this.a.a;
                return new ohg(efzVar4.f, efzVar4.i, efzVar4.gH, efzVar4.B, efzVar4.gG, efzVar4.nM, efzVar4.ku, (char[]) null, (byte[]) null, (byte[]) null);
            case 1298:
                eed eedVar38 = this.a;
                return new c(eedVar38.f, eedVar38.a.kp, (char[]) null, (byte[]) null);
            case 1299:
                eed eedVar39 = this.a;
                return new c(eedVar39.a.lE, eedVar39.f, (byte[]) null, (char[]) null, (byte[]) null);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        int i = this.b;
        switch (i) {
            case 1400:
                eed eedVar = this.a;
                return new abmz(eedVar.cM, eedVar.cK, eedVar.cU, eedVar.cT, eedVar.cW);
            case 1401:
                eed eedVar2 = this.a;
                return new abrx(eedVar2.a(), (shf) eedVar2.a.g.get());
            case 1402:
                eed eedVar3 = this.a;
                Activity a = eedVar3.a();
                aahd aahdVar = (aahd) eedVar3.I.get();
                acki ackiVar = (acki) eedVar3.of.get();
                ajwn ajwnVar = new ajwn(a, aahdVar, ackiVar, eedVar3.mp(), null, null, null, null, null);
                ackg b = ackiVar.b();
                b.b = new ajvs(ajwnVar, 1);
                b.a = new ajvt(ajwnVar, 1);
                return ajwnVar;
            case 1403:
                eed eedVar4 = this.a;
                return new acki((ci) eedVar4.s.get(), (aahd) eedVar4.I.get(), (acfh) eedVar4.a.a.cP.get());
            case 1404:
                return new abtp(this.a.a());
            case 1405:
                return this.a.it();
            case 1406:
                return this.a.it();
            case 1407:
                return this.a.it();
            case 1408:
                return this.a.mO();
            case 1409:
                eed eedVar5 = this.a;
                adyu adyuVar = (adyu) eedVar5.a.a.cR.get();
                Activity a2 = eedVar5.a();
                shf shfVar = (shf) eedVar5.a.g.get();
                ysl yslVar = (ysl) eedVar5.a.fN.get();
                axze mO = eedVar5.mO();
                abrn abrnVar = (abrn) eedVar5.jm.get();
                final acih acihVar = (acih) eedVar5.oi.get();
                shfVar.getClass();
                nbq d = nbq.d();
                boolean p = mO.p();
                acihVar.getClass();
                return d.e(adyuVar, p, a2, shfVar, yslVar, mO, abrnVar, new absp() { // from class: acig
                    @Override // defpackage.absp
                    public final void a(boolean z) {
                        acih.this.af(z);
                    }
                });
            case 1410:
                efz efzVar = this.a.a;
                abzs h = abzs.h(efzVar.b.a, (SharedPreferences) efzVar.z.get());
                ayaw.k(h);
                return h;
            case 1411:
                fmw fmwVar = new fmw((ahtp) this.a.aX.get());
                fmwVar.a.i(ahyo.CHAPTER, fmwVar);
                fmwVar.a.i(ahyo.TIMESTAMP_MARKER, fmwVar);
                return fmwVar;
            case 1412:
                eed eedVar6 = this.a;
                return new oeq((kch) eedVar6.u.get(), (fgq) eedVar6.A.get(), (ahui) eedVar6.a.xc.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        int i = this.b;
        switch (i) {
            case 600:
                eed eedVar = this.a;
                iip iipVar = (iip) ((azrw) Map.EL.getOrDefault(amrz.l(ReelWatchActivity.class, eedVar.hf, WatchWhileActivity.class, eedVar.hg), eedVar.a().getClass(), ejz.l)).get();
                ayaw.k(iipVar);
                return iipVar;
            case 601:
                return new iju(this.a.he, 1);
            case 602:
                eed eedVar2 = this.a;
                aadw aadwVar = (aadw) eedVar2.a.D.get();
                aaea aaeaVar = (aaea) eedVar2.a.K.get();
                ci ciVar = (ci) eedVar2.s.get();
                yqw gR = eedVar2.gR();
                ieb iebVar = new hay() { // from class: ieb
                    @Override // defpackage.hay
                    public final ce a(apxf apxfVar, Bundle bundle) {
                        return ijo.aF(bundle);
                    }
                };
                final SfvAudioItemPlaybackController sfvAudioItemPlaybackController = (SfvAudioItemPlaybackController) eedVar2.hd.get();
                amrz l = amrz.l(ReelWatchEndpointOuterClass$ReelWatchEndpoint.class, iebVar, aplt.class, new hay() { // from class: iea
                    @Override // defpackage.hay
                    public final ce a(apxf apxfVar, Bundle bundle) {
                        SfvAudioItemPlaybackController sfvAudioItemPlaybackController2 = SfvAudioItemPlaybackController.this;
                        hbx aH = hbx.aH(apxfVar);
                        aH.X.b(sfvAudioItemPlaybackController2);
                        return aH;
                    }
                });
                azrw azrwVar = eedVar2.P;
                amkq.F(true, "Invalid resource identifier: 0");
                return new hav(aadwVar, aaeaVar, ciVar, gR, l, azrwVar, (shf) eedVar2.a.g.get(), (ayqi) eedVar2.a.im.get());
            case 603:
                eed eedVar3 = this.a;
                Activity a = eedVar3.a();
                aioc I = eedVar3.a.a.I();
                azrw azrwVar2 = eedVar3.a.dB;
                ayqi a2 = azre.a();
                ayaw.k(a2);
                return new SfvAudioItemPlaybackController(a, I, azrwVar2, a2, eedVar3.mI(), (Executor) eedVar3.a.f.get(), (Executor) eedVar3.a.i.get(), (acsy) eedVar3.a.ee.get(), (acqz) eedVar3.P.get(), null, null, null);
            case 604:
                return new iju(this.a.l, 0);
            case 605:
                return new ffe(this.a.cp, 12, (float[][]) null);
            case 606:
                return this.a.bD();
            case 607:
                return this.a.bq();
            case 608:
                eed eedVar4 = this.a;
                aahv aahvVar = (aahv) eedVar4.a.dB.get();
                shf shfVar = (shf) eedVar4.a.g.get();
                xho xhoVar = (xho) eedVar4.a.sf.get();
                xbq xbqVar = (xbq) eedVar4.a.sc.get();
                efz efzVar = eedVar4.a;
                return new gur(aahvVar, shfVar, xhoVar, xbqVar, efzVar.sg, efzVar.tR);
            case 609:
                return this.a.bU();
            case 610:
                return this.a.R();
            case 611:
                return this.a.fS();
            case 612:
                return this.a.hT();
            case 613:
                return this.a.gi();
            case 614:
                return this.a.ed();
            case 615:
                return this.a.br();
            case 616:
                return this.a.bE();
            case 617:
                return this.a.lT();
            case 618:
                return this.a.lU();
            case 619:
                return new ffe(this.a.el, 2, (char[]) null);
            case 620:
                return this.a.eI();
            case 621:
                eed eedVar5 = this.a;
                return new guv((acqz) eedVar5.P.get(), (aahd) eedVar5.aL.get(), 1);
            case 622:
                return this.a.df();
            case 623:
                return this.a.S();
            case 624:
                return this.a.T();
            case 625:
                return this.a.lW();
            case 626:
                return this.a.db();
            case 627:
                return this.a.ik();
            case 628:
                return this.a.hZ();
            case 629:
                return this.a.U();
            case 630:
                return this.a.gs();
            case 631:
                return new ycu((acpl) this.a.a.aw.get());
            case 632:
                return new grs((YpcOffersListDialogFragmentController) this.a.hk.get());
            case 633:
                eed eedVar6 = this.a;
                return new YpcOffersListDialogFragmentController((ci) eedVar6.s.get(), (ajdh) eedVar6.cG.get());
            case 634:
                eed eedVar7 = this.a;
                return new gub((aahv) eedVar7.a.dB.get(), (shf) eedVar7.a.g.get());
            case 635:
                eed eedVar8 = this.a;
                return ghe.p((ci) eedVar8.s.get(), (aahd) eedVar8.I.get(), (ajut) eedVar8.a.lE.get(), eedVar8.mp(), (lyp) eedVar8.hl.get(), (acqz) eedVar8.P.get(), (aalw) eedVar8.a.wp.get(), (lru) eedVar8.a.wq.get(), (ajdh) eedVar8.cG.get());
            case 636:
                lyp al = ((nid) this.a.ak.get()).al();
                ayaw.k(al);
                return al;
            case 637:
                eed eedVar9 = this.a;
                addy addyVar = (addy) eedVar9.a.jD.get();
                efz efzVar2 = eedVar9.a;
                Context context = efzVar2.b.a;
                adeg adegVar = (adeg) efzVar2.jC.get();
                shf shfVar2 = (shf) eedVar9.a.g.get();
                anzg ky = eedVar9.a.ky();
                adgv ds = eedVar9.a.ds();
                anic anicVar = (anic) eedVar9.a.h.get();
                ypa ypaVar = (ypa) eedVar9.a.B.get();
                aahd aahdVar = (aahd) eedVar9.I.get();
                dd ddVar = (dd) eedVar9.t.get();
                bph bphVar = (bph) eedVar9.a.jm.get();
                ghe.i();
                return new jdj(addyVar, context, adegVar, shfVar2, ky, ds, anicVar, ypaVar, aahdVar, ddVar, bphVar, (ci) eedVar9.s.get(), (gcl) eedVar9.bj.get(), (adlt) eedVar9.a.ja.get(), eedVar9.ji(), (amce) eedVar9.a.a.A.get(), null, null);
            case 638:
                eed eedVar10 = this.a;
                return new abio((aazg) eedVar10.a.xf.get(), (abge) eedVar10.co.get(), (zaw) eedVar10.a.iN.get());
            case 639:
                return this.a.ia();
            case 640:
                return new exw((ModalDialogController) this.a.hm.get());
            case 641:
                eed eedVar11 = this.a;
                return new ModalDialogController(eedVar11.a(), eedVar11.jB(), (acqz) eedVar11.P.get(), eedVar11.jG(), eedVar11.ji());
            case 642:
                eed eedVar12 = this.a;
                efz efzVar3 = eedVar12.a;
                return new fvc(efzVar3.b.a, (abab) efzVar3.lZ.get(), eedVar12.I, (zaw) eedVar12.a.iN.get(), (ajmu) eedVar12.a.ma.get(), (afyt) eedVar12.a.eu.get(), (Executor) eedVar12.a.i.get());
            case 643:
                eed eedVar13 = this.a;
                return new grv(new lvc(eedVar13.a(), (ajjz) eedVar13.a.kp.get(), (aahd) eedVar13.I.get(), (acqz) eedVar13.P.get(), (hbb) eedVar13.a.lN.get()));
            case 644:
                eed eedVar14 = this.a;
                return new eya((ypa) eedVar14.a.B.get(), (aahd) eedVar14.I.get());
            case 645:
                eed eedVar15 = this.a;
                return new grz((ci) eedVar15.s.get(), (abab) eedVar15.a.lZ.get(), (zaw) eedVar15.a.iN.get(), (aahd) eedVar15.I.get(), (Executor) eedVar15.a.i.get());
            case 646:
                eed eedVar16 = this.a;
                return new eyb((giv) eedVar16.ae.get(), (ypa) eedVar16.a.B.get(), mcy.at(), evr.cb(), null, null, null);
            case 647:
                return new eyc((agyr) this.a.gr.get());
            case 648:
                eed eedVar17 = this.a;
                agzj agzjVar = (agzj) eedVar17.gs.get();
                fjs fjsVar = (fjs) eedVar17.a.kv.get();
                azrw azrwVar3 = eedVar17.a.gH;
                agzj agzjVar2 = (agzj) eedVar17.gs.get();
                efz efzVar4 = eedVar17.a;
                return new eye(agzjVar, fjsVar, azrwVar3, new jlj(agzjVar2, efzVar4.ya, efzVar4.gH, (Executor) efzVar4.i.get(), (Executor) eedVar17.a.f.get(), eedVar17.a.b.a), (Executor) eedVar17.a.i.get(), (axzf) eedVar17.a.yc.get(), null, null);
            case 649:
                return new eyf((agzj) this.a.gs.get());
            case 650:
                return new xqz((xqx) this.a.gW.get());
            case 651:
                eed eedVar18 = this.a;
                return new gsf(eedVar18.a(), (aahd) eedVar18.I.get(), new ezn(8), (dd) eedVar18.t.get(), eedVar18.iG(), (acqz) eedVar18.P.get(), eedVar18.cG, null);
            case 652:
                eed eedVar19 = this.a;
                return new jaz(eedVar19.a(), (aaxn) eedVar19.a.a.B.get(), (jav) eedVar19.hn.get(), (Executor) eedVar19.a.i.get(), null, null);
            case 653:
                return this.a.da();
            case 654:
                eed eedVar20 = this.a;
                return new gsi(eedVar20.a(), (ypa) eedVar20.a.B.get(), (aaxr) eedVar20.a.a.n.get(), (zaw) eedVar20.a.iN.get(), (Executor) eedVar20.a.i.get());
            case 655:
                eed eedVar21 = this.a;
                aavy aavyVar = (aavy) eedVar21.a.md.get();
                azrw azrwVar4 = eedVar21.I;
                return new xra(aavyVar, azrwVar4, new xpi((aahd) azrwVar4.get(), (xnm) eedVar21.gS.get(), (zaw) eedVar21.a.iN.get()), (aadw) eedVar21.a.D.get(), (Executor) eedVar21.a.i.get());
            case 656:
                return new ezn(6);
            case 657:
                eed eedVar22 = this.a;
                return new itn((itm) eedVar22.ho.get(), (aahd) eedVar22.I.get());
            case 658:
                return this.a.cT();
            case 659:
                eed eedVar23 = this.a;
                return new abfz((aaxn) eedVar23.a.a.C.get(), (Executor) eedVar23.a.i.get(), (aahd) eedVar23.I.get(), null, null);
            case 660:
                return new ewh(this.a.a(), 4);
            case 661:
                return new ezn(1);
            case 662:
                eed eedVar24 = this.a;
                return new eyi(eedVar24.ji(), (aiqh) eedVar24.a.iT.get());
            case 663:
                return new eyj((fne) this.a.aS.get());
            case 664:
                eed eedVar25 = this.a;
                return new eym((abaz) eedVar25.a.mb.get(), eedVar25.I, (zaw) eedVar25.a.iN.get(), eedVar25.a(), (afsy) eedVar25.a.au.get(), (aftn) eedVar25.a.uZ.get(), (jvr) eedVar25.a.a.E.get(), (kyj) eedVar25.a.a.F.get());
            case 665:
                return new hqd((ci) this.a.s.get(), 3);
            case 666:
                eed eedVar26 = this.a;
                return new akjg(eedVar26.a(), (aavj) eedVar26.a.a.l.get(), (aadw) eedVar26.a.D.get());
            case 667:
                eed eedVar27 = this.a;
                return new gug((alpe) eedVar27.hp.get(), (eni) eedVar27.a.cL.get(), (Executor) eedVar27.a.f.get(), (ayqi) eedVar27.a.aq.get(), (aadw) eedVar27.a.D.get());
            case 668:
                return new alpe(new alph(alta.q(this.a.a.b.a)));
            case 669:
                return new eih((eiv) this.a.hq.get());
            case 670:
                return this.a.w();
            case 671:
                eed eedVar28 = this.a;
                return new abad((abab) eedVar28.a.lZ.get(), eedVar28.I, (Executor) eedVar28.a.i.get());
            case 672:
                return new iza((izd) this.a.a.fx.get());
            case 673:
                return new abip((abhf) this.a.cl.get());
            case 674:
                return new hry(new hvd(this.a.j()));
            case 675:
                dd mN = ((ReelCameraActivity) this.a.a()).b.mN();
                ayaw.k(mN);
                return mN;
            case 676:
                ShortsCreationActivity cj = this.a.cj();
                hcm hcmVar = cj.b;
                if (hcmVar != null) {
                    if (cj.c) {
                        throw new IllegalStateException("peer() called after destroyed.");
                    }
                    hcmVar.e(0L);
                    dd mN2 = hcmVar.a.mN();
                    ayaw.k(mN2);
                    return mN2;
                }
                throw new IllegalStateException("peer() called before initialized.");
            case 677:
                dd b = ((nka) this.a.aH.get()).b();
                ayaw.k(b);
                return b;
            case 678:
                eed eedVar29 = this.a;
                return new ifj(new jgp(eedVar29.s, eedVar29.hr, (byte[]) null, (byte[]) null), (aahd) eedVar29.I.get(), (hak) eedVar29.hs.get(), (Executor) eedVar29.a.i.get(), null, null);
            case 679:
                eed eedVar30 = this.a;
                return new ioj(eedVar30.a(), (Executor) eedVar30.a.i.get(), (afsy) eedVar30.a.au.get(), (akxw) eedVar30.a.wb.get(), (ajjs) eedVar30.a.km.get(), (akvq) eedVar30.a.mM.get(), (aahd) eedVar30.I.get(), (ajjz) eedVar30.a.kp.get(), (ajut) eedVar30.a.lE.get(), (acqz) eedVar30.P.get());
            case 680:
                eed eedVar31 = this.a;
                return new hak((Executor) eedVar31.a.i.get(), (akvq) eedVar31.a.mM.get(), (afsy) eedVar31.a.au.get());
            case 681:
                eed eedVar32 = this.a;
                return new gsq(eedVar32.a(), (aahd) eedVar32.I.get(), (gcl) eedVar32.bj.get());
            case 682:
                return new aauf(axqq.a(this.a.a.a.H), 1);
            case 683:
                eed eedVar33 = this.a;
                return new gsy(eedVar33.a(), (adlt) eedVar33.a.ja.get(), etx.ap(), (ihn) eedVar33.a.lM.get(), (iml) eedVar33.a.lL.get(), (hbb) eedVar33.a.lN.get(), (shf) eedVar33.a.g.get(), axqq.a(eedVar33.ht), (acqz) eedVar33.P.get(), Optional.empty(), (aadw) eedVar33.a.D.get(), (aaea) eedVar33.a.K.get(), (PipObserver) eedVar33.hu.get(), (ajjz) eedVar33.a.kp.get(), (aahv) eedVar33.a.dB.get(), eedVar33.a.bY(), (ing) eedVar33.a.vK.get(), eedVar33.a.T(), null, null, null);
            case 684:
                eed eedVar34 = this.a;
                final PipObserver pipObserver = new PipObserver(eedVar34.a(), (azrs) eedVar34.q.get());
                pipObserver.c = pipObserver.b.ax(new ayrs() { // from class: glb
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        PipObserver pipObserver2 = PipObserver.this;
                        if (((Boolean) obj).booleanValue()) {
                            if (pipObserver2.a.aO() != glc.IN_PIP) {
                                pipObserver2.a.c(glc.IN_PIP);
                            }
                        } else if (pipObserver2.a.aO() == glc.IN_PIP) {
                            pipObserver2.a.c(glc.EXITING_PIP);
                        }
                    }
                });
                return pipObserver;
            case 685:
                return new hyi(this.a.j());
            case 686:
                eed eedVar35 = this.a;
                Runnable runnable = (Runnable) eedVar35.a.a.I.get();
                efz efzVar5 = eedVar35.a.a.dm.c;
                return new eyo(amsx.s(runnable, new jsl(efzVar5.kQ, efzVar5.gH)));
            case 687:
                eed eedVar36 = this.a;
                return new gtf((zaw) eedVar36.a.iN.get(), (acra) eedVar36.ay.get(), new gte(eedVar36.cZ(), (ypa) eedVar36.a.B.get(), (zaw) eedVar36.a.iN.get(), (acra) eedVar36.ay.get()));
            case 688:
                efz efzVar6 = this.a.a;
                return new jdn(efzVar6.b.a, (adlt) efzVar6.ja.get());
            case 689:
                return new gvl((ypa) this.a.a.B.get(), 15, (char[][]) null);
            case 690:
                eed eedVar37 = this.a;
                return new eyu((abab) eedVar37.a.lZ.get(), (aahd) eedVar37.I.get(), (zaw) eedVar37.a.iN.get(), 0);
            case 691:
                return new gvl((ypa) this.a.a.B.get(), 1, (byte[]) null);
            case 692:
                eed eedVar38 = this.a;
                return new izh((ajmu) eedVar38.a.ma.get(), (ypa) eedVar38.a.B.get());
            case 693:
                return new eyv((nqp) this.a.bu.get());
            case 694:
                eed eedVar39 = this.a;
                return new gtg(eedVar39.a(), (ypa) eedVar39.a.B.get(), (aaxr) eedVar39.a.a.n.get(), (zaw) eedVar39.a.iN.get(), (Executor) eedVar39.a.i.get());
            case 695:
                eed eedVar40 = this.a;
                return new ktr(eedVar40.aX(), (aivb) eedVar40.as.get());
            case 696:
                return new eyy((akbu) this.a.dw.get());
            case 697:
                eed eedVar41 = this.a;
                return new gti((giv) eedVar41.ae.get(), (SharedPreferences) eedVar41.a.z.get(), (lgs) eedVar41.a.a.f203J.get(), mcy.as(), mcy.ar(), null, null);
            case 698:
                return new eyq((eys) this.a.a.a.K.get());
            case 699:
                return new gvl((ypa) this.a.a.B.get(), 14, (byte[][]) null);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        int i = this.b;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 500:
                eed eedVar = this.a;
                return new gwa(eedVar.a(), (gwt) eedVar.a.a.j.get(), (wcf) eedVar.a.hM.get(), (afsy) eedVar.a.au.get(), (aahd) eedVar.I.get());
            case 501:
                return new gwp((acpl) this.a.a.aw.get());
            case 502:
                return this.a.bS();
            case 503:
                return this.a.jb();
            case 504:
                eed eedVar2 = this.a;
                return new aieu((Handler) eedVar2.a.an.get(), (aioc) eedVar2.n.get(), eedVar2.ji(), (zbw) eedVar2.a.av.get(), (acpl) eedVar2.a.aw.get(), (acra) eedVar2.ay.get(), (aahd) eedVar2.I.get(), (okg) eedVar2.gy.get());
            case 505:
                return new okg((akbz) this.a.bj.get());
            case 506:
                return this.a.N();
            case 507:
                return this.a.O();
            case 508:
                return this.a.P();
            case 509:
                return this.a.bj();
            case 510:
                return this.a.de();
            case 511:
                return this.a.lm();
            case 512:
                return this.a.bI();
            case 513:
                return this.a.lz();
            case 514:
                return new guw((acqz) this.a.P.get(), 0);
            case 515:
                return this.a.I();
            case 516:
                return this.a.H();
            case 517:
                return this.a.bJ();
            case 518:
                return this.a.bB();
            case 519:
                return this.a.s();
            case 520:
                return new ykk();
            case 521:
                eed eedVar3 = this.a;
                return new jaw(eedVar3.a(), (aahd) eedVar3.I.get(), 1);
            case 522:
                return new ewh(this.a.a(), 1);
            case 523:
                return new ewh(this.a.a(), 0);
            case 524:
                return new gtu((ajcw) this.a.a.fP.get());
            case 525:
                return this.a.bC();
            case 526:
                eed eedVar4 = this.a;
                return new gtx((aahd) eedVar4.I.get(), (Executor) eedVar4.a.f.get(), eedVar4.a.b.a);
            case 527:
                eed eedVar5 = this.a;
                return new ewm(new ajyw(eedVar5.I, eedVar5.f196J, eedVar5.aq, (byte[]) null, (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null), (wzq) eedVar5.a.rQ.get(), (eul) eedVar5.Q.get(), eedVar5.a(), (wng) eedVar5.a.cU.get(), (axzg) eedVar5.a.ap.get(), eedVar5.gQ(), (gfz) eedVar5.aq.get(), null, null, null, null, null, null);
            case 528:
                eed eedVar6 = this.a;
                return new ewt((ci) eedVar6.s.get(), (aavj) eedVar6.a.a.l.get(), (zaw) eedVar6.a.iN.get());
            case 529:
                eed eedVar7 = this.a;
                return new gpy((ci) eedVar7.s.get(), eedVar7.a.cF(), (ysy) eedVar7.a.as.get(), (rxm) eedVar7.ei.get(), (Executor) eedVar7.a.i.get(), (trp) eedVar7.a.hY(), eedVar7.fX(), (wju) eedVar7.en.get(), (acqz) eedVar7.P.get(), (afsy) eedVar7.a.au.get(), eedVar7.a.bj(), null, null, null);
            case 530:
                return new fvm((banw) this.a.a.yb.get());
            case 531:
                return new eyg((nqy) this.a.gE.get(), 0);
            case 532:
                eed eedVar8 = this.a;
                return new nqy(axqq.a(eedVar8.bu), axqq.a(eedVar8.gD), (fgq) eedVar8.A.get());
            case 533:
                eed eedVar9 = this.a;
                nqm nqmVar = (nqm) eedVar9.gB.get();
                nqz nqzVar = (nqz) eedVar9.gC.get();
                nqp a = nqmVar.a();
                nqzVar.a(a);
                return a;
            case 534:
                eed eedVar10 = this.a;
                eei eeiVar = new eei(eedVar10.a, eedVar10.b);
                eeiVar.b(false);
                return eeiVar.a();
            case 535:
                return new nqz();
            case 536:
                return new grb((aoae) this.a.gF.get(), 2, null, null, null, null, null);
            case 537:
                return new aoae((byte[]) null, (byte[]) null, (byte[]) null, (char[]) null);
            case 538:
                return new grb((aoae) this.a.gF.get(), 1, null, null, null, null, null);
            case 539:
                return new grb((aoae) this.a.gF.get(), 0, null, null, null, null, null);
            case 540:
                eed eedVar11 = this.a;
                return new gut(eedVar11.a(), (aahd) eedVar11.I.get());
            case 541:
                eed eedVar12 = this.a;
                return new gqe(eedVar12.a(), eedVar12.ji(), (kde) eedVar12.gG.get(), (acqz) eedVar12.P.get());
            case 542:
                eed eedVar13 = this.a;
                return new DefaultVideoStageMonitor((ypa) eedVar13.a.B.get(), (aioc) eedVar13.n.get(), (aadw) eedVar13.a.D.get());
            case 543:
                return new ffe(this.a.gL, 0);
            case 544:
                eed eedVar14 = this.a;
                Activity a2 = eedVar14.a();
                azrw azrwVar = eedVar14.gI;
                azrw azrwVar2 = eedVar14.gJ;
                azrw azrwVar3 = eedVar14.gK;
                azrw azrwVar4 = eedVar14.gH;
                azrw azrwVar5 = (azrw) amrz.o(UploadActivity.class, azrwVar, ReelWatchActivity.class, azrwVar2, WatchWhileActivity.class, azrwVar3, LiveCreationActivity.class, azrwVar4, MainLiveCreationActivity.class, azrwVar4).get(a2.getClass());
                a2.getClass().getName();
                azrwVar5.getClass();
                wan wanVar = (wan) azrwVar5.get();
                ayaw.k(wanVar);
                return wanVar;
            case 545:
                eed eedVar15 = this.a;
                was wasVar = (was) eedVar15.gH.get();
                wasVar.i(eedVar15.cR());
                ayaw.k(wasVar);
                return wasVar;
            case 546:
                eed eedVar16 = this.a;
                return new was((ci) eedVar16.s.get(), (ypa) eedVar16.a.B.get(), (slv) eedVar16.gm.get(), eedVar16.a.cO(), (aaea) eedVar16.a.K.get());
            case 547:
                eed eedVar17 = this.a;
                final was wasVar2 = (was) eedVar17.gH.get();
                fxj fxjVar = (fxj) eedVar17.f196J.get();
                fxjVar.g(new omc(wasVar2, 1));
                fxjVar.f(new fxh() { // from class: oly
                    @Override // defpackage.fxh
                    public final void e(Configuration configuration) {
                        if (i2 != 0) {
                            wasVar2.l();
                        } else {
                            wasVar2.l();
                        }
                    }
                });
                if (fxjVar.b) {
                    wasVar2.f();
                }
                ayaw.k(wasVar2);
                return wasVar2;
            case 548:
                eed eedVar18 = this.a;
                final was wasVar3 = (was) eedVar18.gH.get();
                fxj fxjVar2 = (fxj) eedVar18.f196J.get();
                fxjVar2.g(new omc(wasVar3, 0));
                fxjVar2.f(new fxh() { // from class: oly
                    @Override // defpackage.fxh
                    public final void e(Configuration configuration) {
                        if (i3 != 0) {
                            wasVar3.l();
                        } else {
                            wasVar3.l();
                        }
                    }
                });
                if (fxjVar2.b) {
                    wasVar3.f();
                }
                ayaw.k(wasVar3);
                return wasVar3;
            case 549:
                eed eedVar19 = this.a;
                return new wag(eedVar19.gL, eedVar19.fP());
            case 550:
                return new ewh(this.a.a.b.a, 11);
            case 551:
                return new izg((afzp) this.a.a.lS.get());
            case 552:
                eed eedVar20 = this.a;
                return new guv((aahd) eedVar20.I.get(), (acqz) eedVar20.P.get(), 2);
            case 553:
                return new ewn((adlt) this.a.a.ja.get());
            case 554:
                eed eedVar21 = this.a;
                return new gqf(eedVar21.a(), (ypa) eedVar21.a.B.get(), (aaxr) eedVar21.a.a.n.get(), (zaw) eedVar21.a.iN.get(), (aahd) eedVar21.I.get(), (Executor) eedVar21.a.i.get());
            case 555:
                return new abih((abia) this.a.cm.get());
            case 556:
                return new gvl((ypa) this.a.a.B.get(), 4);
            case 557:
                return new gvl((ypa) this.a.a.B.get(), 7);
            case 558:
                eed eedVar22 = this.a;
                return new ajdl(eedVar22.a(), (aahd) eedVar22.I.get(), (acqz) eedVar22.P.get(), (ajut) eedVar22.a.lE.get(), (ajdh) eedVar22.cG.get(), (zbw) eedVar22.a.av.get());
            case 559:
                eed eedVar23 = this.a;
                return new ewu(eedVar23.a(), (aahd) eedVar23.I.get());
            case 560:
                eed eedVar24 = this.a;
                return new guz(eedVar24.gM, (ainy) eedVar24.a.fX.get(), 1, null);
            case 561:
                eed eedVar25 = this.a;
                ci ciVar = (ci) eedVar25.s.get();
                aahd aahdVar = (aahd) eedVar25.I.get();
                akbz akbzVar = (akbz) eedVar25.gp.get();
                fxj fxjVar3 = (fxj) eedVar25.f196J.get();
                xng xngVar = new xng(ciVar, aahdVar, akbzVar, (xzz) eedVar25.a.a.o.get());
                fxjVar3.g(new omf(xngVar));
                return xngVar;
            case 562:
                eed eedVar26 = this.a;
                aavy aavyVar = (aavy) eedVar26.a.md.get();
                xpu xpuVar = (xpu) eedVar26.gN.get();
                acqz acqzVar = (acqz) eedVar26.P.get();
                return new xqw(aavyVar, xpuVar, acqzVar, eedVar26.I, (aahv) eedVar26.a.dB.get(), (Executor) eedVar26.a.i.get(), (ci) eedVar26.s.get(), 1);
            case 563:
                return new xpu();
            case 564:
                eed eedVar27 = this.a;
                return new xqq(eedVar27.a(), (aloh) eedVar27.a.a.p.get(), (akrh) eedVar27.a.wP.get(), 0, null);
            case 565:
                eed eedVar28 = this.a;
                return new guz(eedVar28.gO, (ainy) eedVar28.a.fX.get(), 0);
            case 566:
                eed eedVar29 = this.a;
                return new xnk((ci) eedVar29.s.get(), (aahd) eedVar29.I.get(), (akbz) eedVar29.gp.get(), xuq.r(), null, null, null, null);
            case 567:
                eed eedVar30 = this.a;
                return new xqt((xoh) eedVar30.gV.get(), (acqz) eedVar30.P.get());
            case 568:
                eed eedVar31 = this.a;
                return new xoh(eedVar31.a(), (Context) eedVar31.gQ.get(), (ajjs) eedVar31.a.km.get(), (aahd) eedVar31.I.get(), (ajut) eedVar31.a.lE.get(), (zaw) eedVar31.a.iN.get(), (ysy) eedVar31.a.as.get(), (zbi) eedVar31.a.iL.get(), eedVar31.a.t(), (ajun) eedVar31.gR.get(), new yfl(eedVar31.f, eedVar31.gS, (byte[]) null, (byte[]) null), new abie(eedVar31.f, eedVar31.gS, eedVar31.gT, eedVar31.gN, eedVar31.gU, eedVar31.df, (byte[]) null), eedVar31.jI(), eedVar31.mq(), (ajzc) eedVar31.cY.get(), (aadw) eedVar31.a.D.get(), (aahv) eedVar31.a.dB.get(), (afsy) eedVar31.a.au.get(), (ajsa) eedVar31.a.xh.get(), null, null, null);
            case 569:
                return this.a.g();
            case 570:
                return new ajun((byte[]) null, (byte[]) null, (byte[]) null);
            case 571:
                eed eedVar32 = this.a;
                return new xnm(eedVar32.a(), (akbz) eedVar32.gp.get(), (aahd) eedVar32.I.get());
            case 572:
                return new yal((ajmu) this.a.a.ma.get());
            case 573:
                return new vak((byte[]) null);
            case 574:
                eed eedVar33 = this.a;
                return new xqy((xqx) eedVar33.gW.get(), (acqz) eedVar33.P.get(), (afsy) eedVar33.a.au.get(), (aahv) eedVar33.a.dB.get(), (aahd) eedVar33.I.get());
            case 575:
                eed eedVar34 = this.a;
                return new xqx(eedVar34.a(), (aahd) eedVar34.I.get(), eedVar34.a.cO(), (xoh) eedVar34.gV.get(), (yal) eedVar34.gT.get(), (ajdh) eedVar34.cG.get());
            case 576:
                eed eedVar35 = this.a;
                return new xqw((aavy) eedVar35.a.md.get(), (xpu) eedVar35.gN.get(), (acqz) eedVar35.P.get(), eedVar35.I, (aahv) eedVar35.a.dB.get(), (ci) eedVar35.s.get(), (Executor) eedVar35.a.i.get(), 0);
            case 577:
                eed eedVar36 = this.a;
                return new gqj(eedVar36.a(), (afsy) eedVar36.a.au.get(), (aftn) eedVar36.a.uZ.get(), (zaw) eedVar36.a.iN.get(), eedVar36.bb(), (aahv) eedVar36.a.dB.get(), (kwr) eedVar36.gX.get());
            case 578:
                return new kwr((ci) this.a.s.get());
            case 579:
                eed eedVar37 = this.a;
                aavy aavyVar2 = (aavy) eedVar37.a.md.get();
                ajoy ajoyVar = (ajoy) eedVar37.a.eV.get();
                afsy afsyVar = (afsy) eedVar37.a.au.get();
                aahd aahdVar2 = (aahd) eedVar37.I.get();
                zaw zawVar = (zaw) eedVar37.a.iN.get();
                return new gql(aavyVar2, ajoyVar, afsyVar, aahdVar2, zawVar, null, null, null);
            case 580:
                eed eedVar38 = this.a;
                return new gqo((ysy) eedVar38.a.as.get(), (lrw) eedVar38.a.iL.get(), new akht(eedVar38.f, eedVar38.dB, eedVar38.I, eedVar38.gY, eedVar38.a.B, (byte[]) null, (byte[]) null, (byte[]) null, (char[]) null), null, null, null, null);
            case 581:
                return this.a.iA();
            case 582:
                eed eedVar39 = this.a;
                return new ewx((aaux) eedVar39.a.a.t.get(), (zaw) eedVar39.a.iN.get(), (aahd) eedVar39.I.get(), (Executor) eedVar39.a.i.get(), (ci) eedVar39.s.get());
            case 583:
                eed eedVar40 = this.a;
                return new gsn(eedVar40.a(), (aaxn) eedVar40.a.vZ.get(), (ypa) eedVar40.a.B.get(), (Executor) eedVar40.a.i.get(), (akvq) eedVar40.a.mM.get(), null);
            case 584:
                return new ewy(this.a.bb());
            case 585:
                return new gqs((keg) this.a.a.hT.get(), 1, null);
            case 586:
                return new ajdm((ajdh) this.a.cG.get());
            case 587:
                eed eedVar41 = this.a;
                return new exc((aaxn) eedVar41.a.a.u.get(), (zaw) eedVar41.a.iN.get(), (aahd) eedVar41.I.get(), null, null);
            case 588:
                eed eedVar42 = this.a;
                return new akjd((aavj) eedVar42.a.a.l.get(), (zaw) eedVar42.a.iN.get(), (aahd) eedVar42.I.get(), (ajmu) eedVar42.a.ma.get(), eedVar42.a(), (afyt) eedVar42.a.eu.get());
            case 589:
                eed eedVar43 = this.a;
                return new exf(eedVar43.a(), eedVar43.gQ(), (ypa) eedVar43.a.B.get());
            case 590:
                return new gqs((keg) this.a.a.hT.get(), 0);
            case 591:
                return new ahof((ahos) this.a.a.wG.get());
            case 592:
                eed eedVar44 = this.a;
                return new aahn((aakq) eedVar44.a.dL.get(), (afsy) eedVar44.a.au.get());
            case 593:
                eed eedVar45 = this.a;
                return new gra((mwt) eedVar45.dP.get(), (aaue) eedVar45.a.ka.get(), (acqz) eedVar45.P.get(), (Executor) eedVar45.a.i.get());
            case 594:
                eed eedVar46 = this.a;
                return new aaxe(eedVar46.a(), (aaxn) eedVar46.a.a.r.get(), (zaw) eedVar46.a.iN.get(), (aahd) eedVar46.I.get(), null, null);
            case 595:
                eed eedVar47 = this.a;
                return new exi(eedVar47.hc, (iip) eedVar47.hh.get());
            case 596:
                eed eedVar48 = this.a;
                return new ReportVideoController(eedVar48.a(), (ysy) eedVar48.a.as.get(), (afsy) eedVar48.a.au.get(), (zaw) eedVar48.a.iN.get(), (aftn) eedVar48.a.uZ.get(), eedVar48.jl(), (kez) eedVar48.ha.get(), (kfg) eedVar48.hb.get(), (ypa) eedVar48.a.B.get(), (aioc) eedVar48.n.get(), (aadw) eedVar48.a.D.get());
            case 597:
                eed eedVar49 = this.a;
                return new kez(eedVar49.a(), (aahd) eedVar49.I.get(), eedVar49.gZ);
            case 598:
                return this.a.mh();
            case 599:
                eed eedVar50 = this.a;
                return new kfg(eedVar50.ji(), (ajrn) eedVar50.cE.get(), eedVar50.jA());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        int i = this.b;
        switch (i) {
            case 1300:
                return abfm.n();
            case 1301:
                return this.a.mz();
            case 1302:
                return abfm.n();
            case 1303:
                return this.a.au();
            case 1304:
                return this.a.jx();
            case 1305:
                return this.a.mj();
            case 1306:
                eed eedVar = this.a;
                Activity a = eedVar.a();
                amrz l = amrz.l(ReelWatchActivity.class, eedVar.mn, ShortsCreationActivity.class, eedVar.mo);
                ajti ajtiVar = l.containsKey(a.getClass()) ? (ajti) ((azrw) l.get(a.getClass())).get() : new ajti(new oma(a, 2));
                ayaw.k(ajtiVar);
                return ajtiVar;
            case 1307:
                return new ajti(new oma(this.a.a(), 1));
            case 1308:
                final ShortsCreationActivity cj = this.a.cj();
                return new ajti(new Supplier() { // from class: hcl
                    @Override // j$.util.function.Supplier
                    public final Object get() {
                        return lto.c(ShortsCreationActivity.this);
                    }
                });
            case 1309:
                eed eedVar2 = this.a;
                efz efzVar = eedVar2.a;
                return new jle(efzVar.gG, (Executor) efzVar.i.get(), (juy) eedVar2.a.a.bR.get());
            case 1310:
                eed eedVar3 = this.a;
                eedVar3.a();
                Executor executor = (Executor) eedVar3.a.aA.get();
                return new ajfp(executor);
            case 1311:
                return this.a.ig();
            case 1312:
                return new abjt((abjs) this.a.mt.get());
            case 1313:
                abjs abjsVar = ((gng) this.a.ck.get()) == gng.DARK ? abjs.DARK : abjs.LIGHT;
                ayaw.k(abjsVar);
                return abjsVar;
            case 1314:
                return this.a.ie();
            case 1315:
                return this.a.mv();
            case 1316:
                return this.a.mf();
            case 1317:
                eed eedVar4 = this.a;
                return new ntt(eedVar4.a(), (acra) eedVar4.ay.get(), (Handler) eedVar4.a.an.get(), (xqa) eedVar4.hJ.get());
            case 1318:
                return this.a.mX();
            case 1319:
                return this.a.mm();
            case 1320:
                return new aoae((char[]) null, (char[]) null);
            case 1321:
                eed eedVar5 = this.a;
                return new yht(eedVar5.a(), (wcf) eedVar5.a.hM.get(), (afsy) eedVar5.a.au.get(), (yhk) eedVar5.hF.get(), (acsy) eedVar5.a.ee.get(), (zaw) eedVar5.a.iN.get(), (axze) eedVar5.a.a.T.get(), (Executor) eedVar5.a.f.get(), null, null, null);
            case 1322:
                eed eedVar6 = this.a;
                return new hlo(eedVar6.hc(), eedVar6.hb(), (hrv) eedVar6.a.a.S.get(), new hlm((abcv) eedVar6.a.a.cc.get(), (afsy) eedVar6.a.au.get(), (Executor) eedVar6.a.f.get()));
            case 1323:
                return new orr((aahd) this.a.I.get());
            case 1324:
                return new hoz();
            case 1325:
                eed eedVar7 = this.a;
                azrw azrwVar = eedVar7.f;
                azrw azrwVar2 = eedVar7.dG;
                azrw azrwVar3 = eedVar7.al;
                azrw azrwVar4 = eedVar7.I;
                efz efzVar2 = eedVar7.a;
                return new jlb(azrwVar, azrwVar2, azrwVar3, azrwVar4, efzVar2.aw, efzVar2.ed, (byte[]) null, (byte[]) null);
            case 1326:
                return new akei((shf) this.a.a.g.get());
            case 1327:
                eed eedVar8 = this.a;
                return new zxk((zoj) eedVar8.mI.get(), new zxc(eedVar8.a()), (Executor) eedVar8.a.i.get(), (Executor) eedVar8.a.f.get());
            case 1328:
                return new zoj(this.a.a());
            case 1329:
                return new Intent(this.a.a.b.a, (Class<?>) AudioSelectionActivity.class);
            case 1330:
                return new hwy((acsy) this.a.a.ee.get());
            case 1331:
                return new amsj((byte[]) null, (byte[]) null, (byte[]) null);
            case 1332:
                eed eedVar9 = this.a;
                return new ReelPlaybackErrorLogger(eedVar9.jh(), (acpl) eedVar9.a.aw.get(), (aemv) eedVar9.a.hC.get(), (ypa) eedVar9.a.B.get(), (aioc) eedVar9.a.vH.get(), (aadw) eedVar9.a.D.get());
            case 1333:
                return this.a.jh();
            case 1334:
                return new amsj((char[]) null);
            case 1335:
                eed eedVar10 = this.a;
                return new ahxv(eedVar10.jh(), (kfn) eedVar10.jC.get());
            case 1336:
                eed eedVar11 = this.a;
                return new igq(eedVar11.a(), (aahd) eedVar11.I.get(), (zaw) eedVar11.a.iN.get(), eedVar11.cF);
            case 1337:
                return this.a.mB();
            case 1338:
                return this.a.bb();
            case 1339:
                return new aifh((ypa) this.a.a.B.get());
            case 1340:
                eed eedVar12 = this.a;
                adsw adswVar = (adsw) eedVar12.jS.get();
                adsq adsqVar = (adsq) eedVar12.a.a.bo.get();
                efc efcVar = eedVar12.a.a;
                adsi adsiVar = new adsi((acyg) efcVar.dm.c.iv.get(), (shf) efcVar.dm.c.g.get(), Executors.newSingleThreadScheduledExecutor(new yna("passiveAuthCodeRetriever")));
                adti adtiVar = (adti) eedVar12.jR.get();
                efc efcVar2 = eedVar12.a.a;
                azrw azrwVar5 = efcVar2.cq;
                azrw azrwVar6 = efcVar2.cr;
                ukk ukkVar = (ukk) efcVar2.cn.get();
                acqq cO = eedVar12.a.cO();
                efz efzVar3 = eedVar12.a;
                azrw azrwVar7 = efzVar3.a.bn;
                return new adsb(adswVar, adsqVar, adsiVar, adtiVar, azrwVar5, azrwVar6, ukkVar, cO, (ypa) eedVar12.a.B.get());
            case 1341:
                return this.a.jM();
            case 1342:
                return new ajpt((ajpj) this.a.ne.get());
            case 1343:
                eed eedVar13 = this.a;
                azrw azrwVar8 = eedVar13.mX;
                azrw azrwVar9 = eedVar13.mY;
                azrw azrwVar10 = eedVar13.mZ;
                azrw azrwVar11 = eedVar13.na;
                amrz amrzVar = amvo.b;
                amrz k = amrz.k(msi.class, eedVar13.nb);
                amrz k2 = amrz.k(fro.class, eedVar13.nc);
                amrz k3 = amrz.k(new ajqk(fro.class, fro.class), eedVar13.nd);
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : k3.entrySet()) {
                    ajql ajqlVar = (ajql) entry.getKey();
                    hashMap.put(new hx(ajqlVar.a(), ajqlVar.b()), (azrw) entry.getValue());
                }
                ajpj ajpjVar = new ajpj();
                ajpjVar.a.c(azrwVar8);
                ajpjVar.b.c(azrwVar9);
                ajpjVar.c.c(azrwVar10);
                ajpjVar.d.c(azrwVar11);
                ajpjVar.a.b(amrzVar);
                ajpjVar.b.b(k);
                ajpjVar.c.b(k2);
                ajpjVar.d.b(hashMap);
                return ajpjVar;
            case 1344:
                return new ajqg();
            case 1345:
                return new ajqr();
            case 1346:
                return new ajqt();
            case 1347:
                return new ajqo();
            case 1348:
                return new msh(axqq.a(this.a.mY));
            case 1349:
                return new frm(axqq.a(this.a.mZ));
            case 1350:
                return new frn(axqq.a(this.a.na));
            case 1351:
                eed eedVar14 = this.a;
                return new fab((rxm) eedVar14.ei.get(), (aahd) eedVar14.I.get(), null);
            case 1352:
                return new akpa((akpb) this.a.ii.get());
            case 1353:
                ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this.a.eC.get()).findViewById(R.id.avatar_row_container);
                ayaw.k(viewGroup);
                return viewGroup;
            case 1354:
                eed eedVar15 = this.a;
                Activity a2 = eedVar15.a();
                aahd aahdVar = (aahd) eedVar15.I.get();
                acqq cO2 = eedVar15.a.cO();
                llc llcVar = (llc) eedVar15.hv.get();
                akgl akglVar = (akgl) eedVar15.a.a.bd.get();
                ajyw ajywVar = new ajyw(eedVar15.f, eedVar15.nj, eedVar15.P, (byte[]) null, (byte[]) null, (char[]) null, (char[]) null);
                ajyw ajywVar2 = new ajyw(eedVar15.f, eedVar15.nk, eedVar15.P, (char[]) null, (char[]) null, (char[]) null);
                azrw azrwVar12 = eedVar15.f;
                azrw azrwVar13 = eedVar15.I;
                efz efzVar4 = eedVar15.a;
                return new lld(a2, aahdVar, cO2, llcVar, akglVar, ajywVar, ajywVar2, new zzw(azrwVar12, azrwVar13, efzVar4.kp, efzVar4.dB), (wfv) eedVar15.a.a.Q.get(), (aoae) eedVar15.a.a.cu.get(), (afsy) eedVar15.a.au.get(), null, null, null, null, null);
            case 1355:
                eed eedVar16 = this.a;
                azrw azrwVar14 = eedVar16.f;
                azrw azrwVar15 = eedVar16.jj;
                azrw azrwVar16 = eedVar16.I;
                efc efcVar3 = eedVar16.a.a;
                return new lpu(azrwVar14, azrwVar15, azrwVar16, efcVar3.bd, efcVar3.bM);
            case 1356:
                eed eedVar17 = this.a;
                azrw azrwVar17 = eedVar17.f;
                azrw azrwVar18 = eedVar17.jj;
                azrw azrwVar19 = eedVar17.I;
                efc efcVar4 = eedVar17.a.a;
                return new lqa(azrwVar17, azrwVar18, azrwVar19, efcVar4.bN, efcVar4.bd);
            case 1357:
                eed eedVar18 = this.a;
                return new onn(eedVar18.iZ, eedVar18.ao);
            case 1358:
                return this.a.mp();
            case 1359:
                eed eedVar19 = this.a;
                return new kci((YouTubePlayerOverlaysLayout) eedVar19.dm.get(), (ahhc) eedVar19.a.uz.get(), (xjl) eedVar19.a.sS.get(), (wwn) eedVar19.a.to.get(), (kex) eedVar19.np.get(), (fln) eedVar19.aZ.get(), (flu) eedVar19.eS.get(), (ahvb) eedVar19.nq.get(), (kda) eedVar19.v.get(), (YouTubeControlsOverlay) eedVar19.bC.get(), (kow) eedVar19.bw.get(), (ahmy) eedVar19.f11do.get(), (ahnc) eedVar19.fs.get(), (ahvq) eedVar19.nr.get(), (ahvq) eedVar19.ns.get(), (xmx) eedVar19.nt.get(), (kea) eedVar19.bX.get(), (ahnh) eedVar19.dU.get(), (ahnj) eedVar19.fW.get(), (nmy) eedVar19.fX.get(), (kkf) eedVar19.dr.get(), (xhz) eedVar19.nu.get(), (ahvm) eedVar19.dp.get(), (xji) eedVar19.bs.get(), (xiu) eedVar19.fl.get(), (xik) eedVar19.nv.get(), (kra) eedVar19.nw.get(), (CreatorEndscreenOverlayPresenter) eedVar19.fq.get(), (ahzg) eedVar19.fr.get(), (ahwu) eedVar19.fv.get(), (ahmg) eedVar19.ds.get(), (ahmx) eedVar19.fx.get(), (kec) eedVar19.dY.get(), (kgk) eedVar19.fz.get(), (aadw) eedVar19.a.D.get(), (aioc) eedVar19.n.get(), (ahff) eedVar19.a.hU.get(), (zdf) eedVar19.aJ.get(), (MdxOverlaysPresenter) eedVar19.fA.get(), (SuggestedActionsMainController) eedVar19.bx.get(), (aoae) eedVar19.a.rK.get(), new ekl((acra) eedVar19.ay.get(), eedVar19.cW, axqv.b(eedVar19.ch)), null, null, null, null, null);
            case 1360:
                eed eedVar20 = this.a;
                kex kexVar = new kex((ci) eedVar20.s.get(), (ywr) eedVar20.a.hL.get(), (adlt) eedVar20.a.ja.get());
                kexVar.a();
                return kexVar;
            case 1361:
                return new ahvs();
            case 1362:
                eed eedVar21 = this.a;
                return eedVar21.mA().b((ahmy) eedVar21.f11do.get(), new ahxp());
            case 1363:
                eed eedVar22 = this.a;
                return eedVar22.mA().b((YouTubeControlsOverlay) eedVar22.bC.get(), new ahxp());
            case 1364:
                eed eedVar23 = this.a;
                return new xmx(eedVar23.a().getResources(), (acra) eedVar23.ay.get(), (xcl) eedVar23.a.rV.get());
            case 1365:
                return this.a.gc();
            case 1366:
                eed eedVar24 = this.a;
                return new xik((krq) eedVar24.cg.get(), (ajjz) eedVar24.a.kp.get(), (aahd) eedVar24.aL.get(), (zaz) eedVar24.B.get(), (xls) eedVar24.a.sg.get(), (wno) eedVar24.a.rC.get(), (wyt) eedVar24.a.sC.get(), (wyn) eedVar24.a.ty.get(), (acra) eedVar24.ay.get());
            case 1367:
                eed eedVar25 = this.a;
                kra kraVar = new kra((krm) eedVar25.ci.get(), (zaz) eedVar25.B.get(), (xls) eedVar25.a.sg.get(), (wno) eedVar25.a.rC.get(), (wyt) eedVar25.a.sC.get(), (wyn) eedVar25.a.ty.get(), (fgq) eedVar25.A.get(), (acra) eedVar25.ay.get());
                kraVar.a.d = kraVar;
                return kraVar;
            case 1368:
                eed eedVar26 = this.a;
                return new kcg(eedVar26.a(), (nnb) eedVar26.af.get(), (aahd) eedVar26.I.get(), (acqz) eedVar26.P.get(), (ajdh) eedVar26.cG.get());
            case 1369:
                aifp e = ((ety) this.a.af.get()).e();
                ayaw.k(e);
                return e;
            case 1370:
                return this.a.dt();
            case 1371:
                return this.a.je();
            case 1372:
                return this.a.eC();
            case 1373:
                eed eedVar27 = this.a;
                eedVar27.a();
                Executor executor2 = (Executor) eedVar27.a.aA.get();
                return new fov(executor2);
            case 1374:
                eed eedVar28 = this.a;
                eedVar28.a();
                return new akhp((aahd) eedVar28.I.get());
            case 1375:
                eed eedVar29 = this.a;
                return new akia((SharedPreferences) eedVar29.a.z.get(), (Handler) eedVar29.a.an.get(), eedVar29.a.b.a);
            case 1376:
                eed eedVar30 = this.a;
                return new keo(eedVar30.a(), (ffs) eedVar30.a.wR.get());
            case 1377:
                eed eedVar31 = this.a;
                final ker kerVar = new ker(eedVar31.a(), eedVar31.dq);
                if (evr.aJ((aadw) eedVar31.a.D.get())) {
                    ((aabq) kerVar.a.get()).c.U().ax(new ayrs() { // from class: keq
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            ker kerVar2 = ker.this;
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            if (kerVar2.b == null) {
                                kerVar2.a();
                            }
                            if (kerVar2.b == null) {
                                return;
                            }
                            InfoCardCollection infoCardCollection = ((aabq) kerVar2.a.get()).d;
                            if (!booleanValue || infoCardCollection == null) {
                                kem kemVar = kerVar2.b;
                                kemVar.c = "";
                                kemVar.g(false);
                            } else {
                                kerVar2.b.c = infoCardCollection.a().toString();
                                kerVar2.b.g(true);
                            }
                        }
                    });
                }
                return kerVar;
            case 1378:
                eed eedVar32 = this.a;
                return new ListenFirstMenuItemController(eedVar32.a(), (aahd) eedVar32.I.get(), (fgq) eedVar32.A.get(), (aadw) eedVar32.a.D.get());
            case 1379:
                return this.a.bR();
            case 1380:
                return this.a.mS();
            case 1381:
                return this.a.r();
            case 1382:
                return this.a.fL();
            case 1383:
                return this.a.fH();
            case 1384:
                return new akhi((ci) this.a.s.get());
            case 1385:
                return new DevicePhotosFragment();
            case 1386:
                return new vpf();
            case 1387:
                eed eedVar33 = this.a;
                return new ejb(eedVar33.a(), (afsy) eedVar33.a.au.get(), (ffs) eedVar33.a.wR.get(), (aadw) eedVar33.a.D.get(), (wiz) eedVar33.a.mr.get());
            case 1388:
                eed eedVar34 = this.a;
                return new wdz(eedVar34.a(), (wco) eedVar34.a.dc.get(), (afsy) eedVar34.a.au.get(), xuq.a());
            case 1389:
                return this.a.gb();
            case 1390:
                return new wll(this.a.a());
            case 1391:
                irz irzVar = this.a.cR().s;
                ayaw.k(irzVar);
                return irzVar;
            case 1392:
                return muf.v((gng) this.a.ck.get(), R.style.Theme_YouTube_Verification_Dark, R.style.Theme_YouTube_Verification_Light);
            case 1393:
                eed eedVar35 = this.a;
                return new xsk(eedVar35.a.b.a, (xsh) eedVar35.nV.get());
            case 1394:
                return new xsh(this.a.a.b.a);
            case 1395:
                return fav.l((aahd) this.a.I.get());
            case 1396:
                eed eedVar36 = this.a;
                return new jbm(eedVar36.nY, eedVar36.nZ, eedVar36.oa);
            case 1397:
                eed eedVar37 = this.a;
                Context e2 = eedVar37.e();
                abjt abjtVar = (abjt) eedVar37.mu.get();
                aahd aahdVar2 = (aahd) eedVar37.I.get();
                ajjz ajjzVar = (ajjz) eedVar37.a.kp.get();
                ajut ajutVar = (ajut) eedVar37.a.lE.get();
                abji abjiVar = (abji) eedVar37.da.get();
                abjr abjrVar = (abjr) eedVar37.a.xl.get();
                acpk acpkVar = (acpk) eedVar37.a.xm.get();
                abhc abhcVar = (abhc) eedVar37.cI.get();
                ajsd ajsdVar = (ajsd) eedVar37.a.xj.get();
                azrw azrwVar20 = eedVar37.I;
                efz efzVar5 = eedVar37.a;
                return new jbl(e2, abjtVar, aahdVar2, ajjzVar, ajutVar, abjiVar, abjrVar, acpkVar, abhcVar, ajsdVar, new ajyw(azrwVar20, efzVar5.kp, efzVar5.dB, (short[]) null, (char[]) null), (abht) eedVar37.cp.get(), (abge) eedVar37.co.get(), (zaw) eedVar37.a.iN.get(), null, null, null, null);
            case 1398:
                eed eedVar38 = this.a;
                return new abmh(eedVar38.a(), (aahd) eedVar38.I.get(), (abjt) eedVar38.mu.get());
            case 1399:
                eed eedVar39 = this.a;
                return new abmx(eedVar39.a(), eedVar39.cp, (aahd) eedVar39.I.get(), (ajut) eedVar39.a.lE.get(), eedVar39.gW(), (abjr) eedVar39.a.xl.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        int i = this.b;
        switch (i) {
            case 100:
                return this.a.be();
            case 101:
                return this.a.bf();
            case 102:
                return this.a.jy();
            case 103:
                ajvb de = ((nid) this.a.ak.get()).de();
                ayaw.k(de);
                return de;
            case 104:
                eed eedVar = this.a;
                eff effVar = new eff(eedVar.a, eedVar.b);
                effVar.a = eedVar.g();
                return effVar.a();
            case 105:
                return this.a.c();
            case 106:
                return this.a.aT();
            case 107:
                return this.a.bg();
            case 108:
                return this.a.ap();
            case 109:
                return this.a.aY();
            case 110:
                return new ool(this.a.a());
            case 111:
                return new aivb((aaoz) this.a.a.gc.get());
            case 112:
                return abfm.n();
            case 113:
                eed eedVar2 = this.a;
                return new nkg(eedVar2.fq(), (SharedPreferences) eedVar2.a.z.get(), (gjz) eedVar2.aD.get(), (dd) eedVar2.t.get(), (gfz) eedVar2.aq.get(), (acqz) eedVar2.P.get(), (fgq) eedVar2.A.get(), (gje) eedVar2.l.get(), (fxj) eedVar2.f196J.get(), (zaz) eedVar2.B.get(), (fgn) eedVar2.aE.get(), (gjr) eedVar2.at.get(), (ygc) eedVar2.au.get(), eedVar2.ji(), (aioc) eedVar2.n.get());
            case 114:
                eed eedVar3 = this.a;
                Activity a = eedVar3.a();
                fxj fxjVar = (fxj) eedVar3.f196J.get();
                fgq fgqVar = (fgq) eedVar3.A.get();
                aadw aadwVar = (aadw) eedVar3.a.D.get();
                gjr gjrVar = (gjr) eedVar3.at.get();
                zas zasVar = (zas) eedVar3.ax.get();
                aivb aivbVar = (aivb) eedVar3.as.get();
                Handler handler = (Handler) eedVar3.a.an.get();
                gjz gjzVar = new gjz(a, fxjVar, fgqVar, aadwVar, gjrVar, new gjy(new gjp(a, (gop) eedVar3.aC.get()), handler), zasVar, (gjw) eedVar3.ao.get(), aivbVar, (acra) eedVar3.ay.get(), (nyk) eedVar3.aB.get());
                gjzVar.b.g(gjzVar);
                gjzVar.b.f(gjzVar);
                gjzVar.c.b.add(gjzVar);
                gjzVar.f.a(gjzVar);
                gjy gjyVar = gjzVar.d;
                gjzVar.e.a(gjyVar.a);
                gjyVar.a.a = gjzVar;
                if (gjzVar.b.b) {
                    gjzVar.b();
                }
                return gjzVar;
            case 115:
                return this.a.gT();
            case 116:
                eed eedVar4 = this.a;
                return new nyk((zcq) eedVar4.aA.get(), (aypn) eedVar4.C.get());
            case 117:
                return this.a.kz();
            case 118:
                return this.a.gV();
            case 119:
                eed eedVar5 = this.a;
                WindowInfoRepositoryCallbackAdapter windowInfoRepositoryCallbackAdapter = (WindowInfoRepositoryCallbackAdapter) eedVar5.az.get();
                eedVar5.a();
                return new zda(windowInfoRepositoryCallbackAdapter, eedVar5.gR(), (Executor) eedVar5.a.i.get(), (ayqi) eedVar5.a.im.get(), (ayqi) eedVar5.a.aq.get(), 0);
            case 120:
                return new WindowInfoRepositoryCallbackAdapter(WindowInfoRepository.CC.getOrCreate(this.a.a()));
            case 121:
                return this.a.bh();
            case 122:
                return this.a.es();
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return this.a.fo();
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return this.a.k();
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return this.a.m();
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return new oja();
            case 127:
                return amsx.r((fll) this.a.bC.get());
            case 128:
                eed eedVar6 = this.a;
                Activity a2 = eedVar6.a();
                zdf zdfVar = (zdf) eedVar6.aJ.get();
                aicz aiczVar = (aicz) eedVar6.aQ.get();
                kmf kmfVar = (kmf) eedVar6.aU.get();
                acra acraVar = (acra) eedVar6.aV.get();
                oja ojaVar = (oja) eedVar6.aI.get();
                ahtp ahtpVar = (ahtp) eedVar6.aX.get();
                aica aicaVar = (aica) eedVar6.aY.get();
                final ahfk ahfkVar = new ahfk((shf) eedVar6.a.g.get(), (acsy) eedVar6.a.ee.get(), (ajkn) eedVar6.a.ed.get(), (aaea) eedVar6.a.K.get(), null);
                aioc aiocVar = (aioc) eedVar6.a.fY.get();
                ayqw ayqwVar = new ayqw();
                final int i2 = 3;
                ayqwVar.d(ahbw.c(aiocVar.V(), ahbz.f).X(new ayrs() { // from class: ahfj
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        int i3 = i2;
                        if (i3 == 0) {
                            ahfkVar.c();
                            return;
                        }
                        if (i3 == 1) {
                            ahfkVar.c();
                        } else if (i3 == 2) {
                            ahfkVar.b((ahdb) obj);
                        } else if (i3 == 3) {
                            ahfkVar.d((ahcy) obj);
                        } else {
                            ahfkVar.b((ahde) obj);
                        }
                    }
                }));
                final int i3 = 4;
                ayqwVar.d(ahbw.c(aiocVar.V(), ahbz.g).X(new ayrs() { // from class: ahfj
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        int i32 = i3;
                        if (i32 == 0) {
                            ahfkVar.c();
                            return;
                        }
                        if (i32 == 1) {
                            ahfkVar.c();
                        } else if (i32 == 2) {
                            ahfkVar.b((ahdb) obj);
                        } else if (i32 == 3) {
                            ahfkVar.d((ahcy) obj);
                        } else {
                            ahfkVar.b((ahde) obj);
                        }
                    }
                }));
                final int i4 = 2;
                ayqwVar.d(ahbw.c(aiocVar.V(), ahbz.d).X(new ayrs() { // from class: ahfj
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        int i32 = i4;
                        if (i32 == 0) {
                            ahfkVar.c();
                            return;
                        }
                        if (i32 == 1) {
                            ahfkVar.c();
                        } else if (i32 == 2) {
                            ahfkVar.b((ahdb) obj);
                        } else if (i32 == 3) {
                            ahfkVar.d((ahcy) obj);
                        } else {
                            ahfkVar.b((ahde) obj);
                        }
                    }
                }));
                final int i5 = 1;
                ayqwVar.d(ahbw.c(aiocVar.V(), ahbz.e).X(new ayrs() { // from class: ahfj
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        int i32 = i5;
                        if (i32 == 0) {
                            ahfkVar.c();
                            return;
                        }
                        if (i32 == 1) {
                            ahfkVar.c();
                        } else if (i32 == 2) {
                            ahfkVar.b((ahdb) obj);
                        } else if (i32 == 3) {
                            ahfkVar.d((ahcy) obj);
                        } else {
                            ahfkVar.b((ahde) obj);
                        }
                    }
                }));
                aypn c = ahbw.c(aiocVar.ab(), ahbz.h);
                final int i6 = 0;
                ayqwVar.d(c.X(new ayrs() { // from class: ahfj
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        int i32 = i6;
                        if (i32 == 0) {
                            ahfkVar.c();
                            return;
                        }
                        if (i32 == 1) {
                            ahfkVar.c();
                        } else if (i32 == 2) {
                            ahfkVar.b((ahdb) obj);
                        } else if (i32 == 3) {
                            ahfkVar.d((ahcy) obj);
                        } else {
                            ahfkVar.b((ahde) obj);
                        }
                    }
                }));
                kob kobVar = (kob) eedVar6.bo.get();
                ajyw ajywVar = new ajyw(eedVar6.aQ, eedVar6.as, eedVar6.a.hN, (byte[]) null, (int[]) null, (byte[]) null);
                ogx ogxVar = new ogx(eedVar6.as, eedVar6.a.D, eedVar6.ay, eedVar6.af, (char[]) null, (char[]) null);
                SuggestedActionsMainController suggestedActionsMainController = (SuggestedActionsMainController) eedVar6.bx.get();
                kuu kuuVar = (kuu) eedVar6.du.get();
                aigv la = eedVar6.la();
                kux kuxVar = (kux) eedVar6.bS.get();
                koc kocVar = (koc) eedVar6.bc.get();
                ksg ksgVar = (ksg) eedVar6.dH.get();
                kng kngVar = (kng) eedVar6.dI.get();
                ypa ypaVar = (ypa) eedVar6.a.B.get();
                aioc aiocVar2 = (aioc) eedVar6.n.get();
                aadw aadwVar2 = (aadw) eedVar6.a.D.get();
                aaea aaeaVar = (aaea) eedVar6.a.K.get();
                kow kowVar = (kow) eedVar6.bw.get();
                aiee aieeVar = (aiee) eedVar6.a.xe.get();
                ahuk ahukVar = (ahuk) eedVar6.a.xd.get();
                ajrv jB = eedVar6.jB();
                kly klyVar = (kly) eedVar6.aR.get();
                nyk nykVar = (nyk) eedVar6.aB.get();
                View[] viewArr = (View[]) eedVar6.dK.get();
                odi odiVar = (odi) eedVar6.dL.get();
                kip kipVar = (kip) eedVar6.aS.get();
                kih kihVar = (kih) eedVar6.bl.get();
                ainl jg = eedVar6.jg();
                kiz kizVar = (kiz) eedVar6.bT.get();
                kjc kjcVar = new kjc(eedVar6.a(), (aadw) eedVar6.a.D.get(), (kiz) eedVar6.bT.get(), (aypn) eedVar6.C.get());
                final knq knqVar = new knq((Handler) eedVar6.a.an.get(), (kih) eedVar6.bl.get(), (azrs) eedVar6.bQ.get(), (aadw) eedVar6.a.D.get(), (acra) eedVar6.ay.get(), (knm) eedVar6.dM.get());
                fna fnaVar = (fna) eedVar6.bw.get();
                knqVar.b.a(knqVar);
                fnaVar.r(new fmz() { // from class: knn
                    @Override // defpackage.fmz
                    public final void a(MotionEvent motionEvent) {
                        knq knqVar2 = knq.this;
                        if (knqVar2.k || knqVar2.d.a()) {
                            if (!knqVar2.k && knqVar2.d.a() && knqVar2.l) {
                                return;
                            }
                            int action = motionEvent.getAction();
                            if (action != 0) {
                                if (action == 1 || action == 3) {
                                    knqVar2.a();
                                    return;
                                }
                                return;
                            }
                            if (knqVar2.i || knqVar2.h) {
                                return;
                            }
                            knqVar2.a.postDelayed(knqVar2.c, knqVar2.f);
                        }
                    }
                });
                kns knsVar = new kns(new kni((ywr) eedVar6.a.il.get(), (axzg) eedVar6.a.hN.get(), null, null));
                ((kih) eedVar6.bl.get()).a(knsVar);
                knm knmVar = (knm) eedVar6.dM.get();
                nrp nrpVar = new nrp(eedVar6.f, eedVar6.aX, eedVar6.aQ, eedVar6.a.D, eedVar6.dM, eedVar6.bw, eedVar6.bR, eedVar6.dN, null, null, null);
                ogx ogxVar2 = new ogx(eedVar6.aX, eedVar6.aV, eedVar6.aL, eedVar6.a.hN, (byte[]) null, (char[]) null, (byte[]) null);
                final kkl kklVar = new kkl((ahtp) eedVar6.aX.get(), (fna) eedVar6.bw.get(), (kih) eedVar6.bl.get(), (aioc) eedVar6.n.get(), (aadw) eedVar6.a.D.get());
                if (kklVar.d) {
                    kklVar.a.i(ahyo.HEATMAP_MARKER, kklVar);
                    kklVar.a.i(ahyo.CHAPTER, kklVar);
                    kklVar.b.kR(kklVar);
                    kklVar.f.a(kklVar);
                    kklVar.e.G().e.Y(new ayrs() { // from class: kkh
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            kkl kklVar2 = kkl.this;
                            aheg ahegVar = (aheg) obj;
                            if (ahegVar.f() == kklVar2.i) {
                                return;
                            }
                            kklVar2.i = ahegVar.f();
                            kklVar2.d();
                        }
                    }, kfe.g);
                }
                YouTubeControlsOverlay youTubeControlsOverlay = new YouTubeControlsOverlay(a2, zdfVar, aiczVar, kmfVar, acraVar, ojaVar, ahtpVar, aicaVar, ahfkVar, kobVar, ajywVar, ogxVar, suggestedActionsMainController, kuuVar, la, kuxVar, kocVar, ksgVar, kngVar, ypaVar, aiocVar2, aadwVar2, aaeaVar, kowVar, aieeVar, ahukVar, jB, klyVar, nykVar, viewArr, odiVar, kipVar, kihVar, jg, kizVar, kjcVar, knqVar, knsVar, knmVar, nrpVar, ogxVar2, kklVar, (axzg) eedVar6.a.hN.get(), axqq.a(eedVar6.a.xr), axqq.a(eedVar6.bh), axqq.a(eedVar6.bj), (ajut) eedVar6.a.lE.get(), (kli) eedVar6.bR.get(), null, null, null, null, null, null);
                fno fnoVar = (fno) eedVar6.bz.get();
                aypy aypyVar = (aypy) eedVar6.dc.get();
                aypy aypyVar2 = (aypy) eedVar6.bQ.get();
                fnoVar.a.X(new kpa(youTubeControlsOverlay, 11));
                aypyVar.ax(new kpa(youTubeControlsOverlay, 0));
                aypyVar2.ax(new kpa(youTubeControlsOverlay, 2));
                youTubeControlsOverlay.O.d = youTubeControlsOverlay;
                youTubeControlsOverlay.G = new kpi(youTubeControlsOverlay);
                youTubeControlsOverlay.h.c.a(youTubeControlsOverlay.G);
                return youTubeControlsOverlay;
            case 129:
                return new zdf();
            case 130:
                return this.a.dB();
            case 131:
                return new aidb();
            case 132:
                return this.a.ld();
            case 133:
                return this.a.hC();
            case 134:
                return new ajpe();
            case 135:
                return spp.q(amrz.k(IntersectionObserver.class, this.a.aO));
            case 136:
                return spp.p(this.a.aN);
            case 137:
                return this.a.fE();
            case 138:
                return this.a.dA();
            case 139:
                return this.a.dR();
            case 140:
                return this.a.dQ();
            case 141:
                return this.a.iZ();
            case 142:
                eed eedVar7 = this.a;
                Activity a3 = eedVar7.a();
                efz efzVar = eedVar7.a;
                return new koj(a3, efzVar.wG, (ajla) efzVar.kn.get(), (fxj) eedVar7.f196J.get(), eedVar7.aS, (aadw) eedVar7.a.D.get());
            case 143:
                return this.a.dH();
            case 144:
                return this.a.iy();
            case 145:
                eed eedVar8 = this.a;
                return new ahtp((aahd) eedVar8.I.get(), (ahtn) eedVar8.aW.get());
            case 146:
                return new ahtn();
            case 147:
                return this.a.iY();
            case 148:
                return this.a.iX();
            case 149:
                eed eedVar9 = this.a;
                ggs ggsVar = (ggs) eedVar9.a.lE.get();
                koc kocVar2 = (koc) eedVar9.bc.get();
                ayqd ayqdVar = (ayqd) eedVar9.bd.get();
                ajyw ajywVar2 = new ajyw(eedVar9.A, eedVar9.be, eedVar9.ay, (char[]) null, (short[]) null, (byte[]) null);
                kmz kmzVar = (kmz) eedVar9.bg.get();
                nng nngVar = (nng) eedVar9.bh.get();
                kdh kdhVar = (kdh) eedVar9.ba.get();
                AutonavToggleController autonavToggleController = (AutonavToggleController) eedVar9.bb.get();
                return new kob(ggsVar, kocVar2, ayqdVar, ajywVar2, kmzVar, nngVar, kdhVar, autonavToggleController, (SubtitleButtonController) eedVar9.bm.get(), (TouchImageView) eedVar9.bn.get(), null, null, null);
            case 150:
                eed eedVar10 = this.a;
                return new koc((adlt) eedVar10.a.ja.get(), (kdh) eedVar10.ba.get(), (AutonavToggleController) eedVar10.bb.get(), (aadw) eedVar10.a.D.get());
            case 151:
                return this.a.dw();
            case 152:
                return new fln();
            case 153:
                return this.a.dx();
            case 154:
                return this.a.ix();
            case 155:
                return azrl.e().aT();
            case 156:
                return azrl.e().aT();
            case 157:
                return this.a.dT();
            case 158:
                return this.a.jq();
            case 159:
                return this.a.eS();
            case 160:
                eed eedVar11 = this.a;
                return new kfn(eedVar11.g(), (ci) eedVar11.s.get(), eedVar11.ji(), (kfm) eedVar11.bi.get(), eedVar11.dz(), (aadw) eedVar11.a.D.get());
            case 161:
                ce f = ((ci) this.a.s.get()).getSupportFragmentManager().f("SUBTITLE_MENU_BOTTOM_SHEET_FRAGMENT");
                return f != null ? (noe) f : new noe();
            case 162:
                eed eedVar12 = this.a;
                return new gcl(eedVar12.aE(), (Handler) eedVar12.a.an.get());
            case 163:
                return this.a.dV();
            case 164:
                return new kih();
            case 165:
                return this.a.gU();
            case 166:
                eed eedVar13 = this.a;
                oiy oiyVar = new oiy(eedVar13.A, eedVar13.as, eedVar13.u, eedVar13.bp, eedVar13.bt, eedVar13.bl, (byte[]) null, (char[]) null, (byte[]) null);
                c cVar = new c(eedVar13.a.B, eedVar13.bl, (short[]) null, (byte[]) null, (byte[]) null);
                ajyw ajywVar3 = new ajyw(eedVar13.n, eedVar13.bl, eedVar13.a.i, (boolean[]) null, (byte[]) null);
                akht akhtVar = new akht(eedVar13.n, eedVar13.bl, eedVar13.bu, eedVar13.A, eedVar13.a.il, (byte[]) null, (short[]) null, (byte[]) null);
                azrw azrwVar = eedVar13.f;
                azrw azrwVar2 = eedVar13.I;
                efz efzVar2 = eedVar13.a;
                SuggestedActionsMainController suggestedActionsMainController2 = new SuggestedActionsMainController(oiyVar, cVar, ajywVar3, akhtVar, new ohg(azrwVar, azrwVar2, efzVar2.lE, efzVar2.kp, efzVar2.D, eedVar13.bv, efzVar2.il, (short[]) null), (acra) eedVar13.ay.get(), (ahym) eedVar13.bw.get(), (gop) eedVar13.aC.get(), (aioc) eedVar13.n.get(), (Handler) eedVar13.a.an.get(), null, null, null, null, null);
                suggestedActionsMainController2.e.kR(suggestedActionsMainController2);
                return suggestedActionsMainController2;
            case 167:
                return this.a.aX();
            case 168:
                return this.a.an();
            case 169:
                return this.a.fm();
            case 170:
                eed eedVar14 = this.a;
                azrw azrwVar3 = eedVar14.ay;
                aahd aahdVar = (aahd) eedVar14.I.get();
                kpr kprVar = (kpr) eedVar14.br.get();
                wno wnoVar = (wno) eedVar14.a.rC.get();
                wyt wytVar = (wyt) eedVar14.a.sC.get();
                wyn wynVar = (wyn) eedVar14.a.ty.get();
                shf shfVar = (shf) eedVar14.a.g.get();
                zaz zazVar = (zaz) eedVar14.B.get();
                xls xlsVar = (xls) eedVar14.a.sg.get();
                zazVar.getClass();
                return new xji(azrwVar3, aahdVar, kprVar, shfVar, new xjb(zazVar, 0), xlsVar, wnoVar, wytVar, wynVar);
            case 171:
                eed eedVar15 = this.a;
                return new kpr(eedVar15.a(), (ajjz) eedVar15.a.kp.get());
            case 172:
                return this.a.eT();
            case 173:
                return new nqz();
            case 174:
                eed eedVar16 = this.a;
                kuh kuhVar = new kuh(eedVar16.a(), (kih) eedVar16.bl.get(), (aadw) eedVar16.a.D.get());
                if (kuhVar.a) {
                    kuhVar.b.a(kuhVar);
                }
                return kuhVar;
            case 175:
                eed eedVar17 = this.a;
                kow kowVar2 = new kow((axzg) eedVar17.a.hN.get(), null, null);
                Activity a4 = eedVar17.a();
                if (!kowVar2.i) {
                    kowVar2.j = new InlineTimeBarWrapper(a4);
                    kowVar2.o(kowVar2.j.a, jzf.b);
                    kowVar2.z(fhg.NONE);
                }
                return kowVar2;
            case 176:
                eed eedVar18 = this.a;
                Object kusVar = evr.bc((aadw) eedVar18.a.D.get()) ? (kuu) eedVar18.dt.get() : new kus();
                ayaw.k(kusVar);
                return kusVar;
            case 177:
                return this.a.ea();
            case 178:
                return this.a.hg();
            case 179:
                return this.a.hf();
            case 180:
                return this.a.hd();
            case 181:
                eed eedVar19 = this.a;
                return new kgs(eedVar19.a(), (Handler) eedVar19.a.an.get(), (ajjz) eedVar19.a.kp.get(), eedVar19.ay, eedVar19.bA);
            case 182:
                return this.a.dK();
            case 183:
                eed eedVar20 = this.a;
                return new fno((zaz) eedVar20.B.get(), (gpe) eedVar20.by.get(), (obr) eedVar20.r.get());
            case 184:
                return this.a.bi();
            case 185:
                return this.a.ki();
            case 186:
                return this.a.iQ();
            case 187:
                return this.a.iR();
            case 188:
                eed eedVar21 = this.a;
                return new ahmy((ViewGroup) eedVar21.dn.get(), eedVar21.a());
            case 189:
                return this.a.n();
            case 190:
                eed eedVar22 = this.a;
                Activity a5 = eedVar22.a();
                zdf zdfVar2 = (zdf) eedVar22.aJ.get();
                axpg a6 = axqq.a(eedVar22.dl);
                fno fnoVar2 = (fno) eedVar22.bz.get();
                zaz zazVar2 = (zaz) eedVar22.B.get();
                aadw aadwVar3 = (aadw) eedVar22.a.D.get();
                YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout = (YouTubePlayerOverlaysLayout) a5.getLayoutInflater().inflate(R.layout.player_overlays, (ViewGroup) null);
                asvu asvuVar = aadwVar3.b().e;
                if (asvuVar == null) {
                    asvuVar = asvu.a;
                }
                aivf[] aivfVarArr = asvuVar.cd ? new aivf[0] : (aivf[]) a6.get();
                youTubePlayerOverlaysLayout.g(zazVar2);
                youTubePlayerOverlaysLayout.c = zdfVar2;
                youTubePlayerOverlaysLayout.b = fnoVar2;
                zde zdeVar = new zde(ViewConfiguration.get(youTubePlayerOverlaysLayout.getContext()));
                fly flyVar = new fly(youTubePlayerOverlaysLayout);
                zdeVar.c = flyVar;
                zdeVar.b = flyVar;
                zdfVar2.b(zdeVar);
                youTubePlayerOverlaysLayout.pE(aivfVarArr);
                ayaw.k(youTubePlayerOverlaysLayout);
                return youTubePlayerOverlaysLayout;
            case 191:
                return this.a.kX();
            case 192:
                return new kna(this.a.a());
            case 193:
                eed eedVar23 = this.a;
                return new kqa(eedVar23.a(), (ajjz) eedVar23.a.kp.get(), (flx) eedVar23.bD.get(), (aaea) eedVar23.a.K.get());
            case 194:
                eed eedVar24 = this.a;
                return new flx((ypa) eedVar24.a.B.get(), (ynx) eedVar24.a.M.get());
            case 195:
                return new ahya(this.a.a());
            case 196:
                return this.a.iW();
            case 197:
                return this.a.iH();
            case 198:
                eed eedVar25 = this.a;
                final ksz kszVar = new ksz(eedVar25.a(), (kut) eedVar25.bA.get(), (aaea) eedVar25.a.K.get(), (aicz) eedVar25.aQ.get(), eedVar25.a.im);
                kszVar.d.c.a(kszVar);
                kszVar.f = new FrameLayout(kszVar.b);
                kszVar.f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                kszVar.f.addView(kszVar.a);
                kszVar.addView(kszVar.f);
                kszVar.c.ab((ayqi) kszVar.e.get()).ax(new ayrs() { // from class: ksy
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        ksz kszVar2 = ksz.this;
                        int intValue = ((Integer) obj).intValue();
                        FrameLayout frameLayout = kszVar2.f;
                        if (frameLayout == null) {
                            return;
                        }
                        yny.z(frameLayout, yny.q(intValue), ViewGroup.MarginLayoutParams.class);
                    }
                });
                return kszVar;
            case 199:
                return this.a.dM();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        int i = this.b;
        switch (i) {
            case 200:
                return this.a.dG();
            case 201:
                return new kmi(this.a.a());
            case 202:
                return new ahxn(this.a.a());
            case 203:
                eed eedVar = this.a;
                return new InteractiveInlineMutedControlsOverlay(eedVar.a(), eedVar.bH, (InlinePlaybackController) eedVar.bO.get(), (InlinePlaybackLifecycleController) eedVar.x.get(), (aaea) eedVar.a.K.get(), (aadw) eedVar.a.D.get(), (SubtitleButtonController) eedVar.bP.get(), (acqz) eedVar.P.get(), (aiee) eedVar.a.xe.get(), (ahtp) eedVar.aX.get(), (aidb) eedVar.aK.get(), (kiz) eedVar.bT.get(), eedVar.jl(), (ViewGroup) eedVar.bU.get(), (ViewGroup) eedVar.bV.get(), (aioc) eedVar.n.get(), (mhu) eedVar.a.lp.get(), (acpl) eedVar.a.aw.get(), eedVar.dN(), (axzg) eedVar.a.wB.get(), (ajut) eedVar.a.lE.get(), null);
            case 204:
                return this.a.eJ();
            case 205:
                return new mhi(this.a.bI);
            case 206:
                zcd a = ((ety) this.a.af.get()).a();
                ayaw.k(a);
                return a;
            case 207:
                return this.a.eG();
            case 208:
                return this.a.aQ();
            case 209:
                eed eedVar2 = this.a;
                return new mif((fgq) eedVar2.A.get(), (InlinePlaybackLifecycleController) eedVar2.x.get());
            case 210:
                eed eedVar3 = this.a;
                return new mhk((gfz) eedVar3.aq.get(), (InlinePlaybackLifecycleController) eedVar3.x.get(), (ScrollSelectionController) eedVar3.m.get(), (Handler) eedVar3.a.an.get());
            case 211:
                return this.a.eE();
            case 212:
                return this.a.dv();
            case 213:
                return this.a.eD();
            case 214:
                return this.a.eF();
            case 215:
                eed eedVar4 = this.a;
                return new fbm((ypa) eedVar4.a.B.get(), (aaea) eedVar4.a.K.get());
            case 216:
                return this.a.ao();
            case 217:
                eed eedVar5 = this.a;
                return new LoopController(eedVar5.bM, eedVar5.bN, (InlinePlaybackLifecycleController) eedVar5.x.get());
            case 218:
                ahsq q = this.a.ec().q();
                ayaw.k(q);
                return q;
            case 219:
                return this.a.ec();
            case 220:
                return this.a.dU();
            case 221:
                return this.a.dI();
            case 222:
                return azrh.e().aT();
            case 223:
                eed eedVar6 = this.a;
                return new kli((acra) eedVar6.aV.get(), (aadw) eedVar6.a.D.get());
            case 224:
                kux kuxVar = new kux(this.a.a());
                kuxVar.b = new ScaleGestureDetector(kuxVar.a, kuxVar);
                kuxVar.c = new GestureDetector(kuxVar.a, new kuv(kuxVar));
                return kuxVar;
            case 225:
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.a.a()).inflate(R.layout.inline_muted_time_bar_overlay, (ViewGroup) null);
                ayaw.k(viewGroup);
                return viewGroup;
            case 226:
                ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(this.a.a()).inflate(R.layout.inline_muted_scrim_overlay, (ViewGroup) null);
                ayaw.k(viewGroup2);
                return viewGroup2;
            case 227:
                eed eedVar7 = this.a;
                return new kdv(eedVar7.a(), (ajjz) eedVar7.a.kp.get(), (aaea) eedVar7.a.K.get(), (fno) eedVar7.bz.get(), (fln) eedVar7.aZ.get(), (kdf) eedVar7.bW.get());
            case 228:
                eed eedVar8 = this.a;
                return new kds(eedVar8.a(), (acra) eedVar8.ay.get(), (ajjz) eedVar8.a.kp.get(), eedVar8.mZ(), null, null, null, null);
            case 229:
                Activity a2 = this.a.a();
                return new jca(a2, a2.getResources().getDimensionPixelSize(R.dimen.mdx_playing_on_tv_padding));
            case 230:
                return this.a.iT();
            case 231:
                return new kgv(this.a.a());
            case 232:
                return this.a.he();
            case 233:
                return new fwu(this.a.a());
            case 234:
                eed eedVar9 = this.a;
                return new RentalActivationOverlay(eedVar9.a(), (fgq) eedVar9.A.get());
            case 235:
                eed eedVar10 = this.a;
                return new YouTubeInlineAdOverlay(eedVar10.a(), (gop) eedVar10.aC.get(), (acra) eedVar10.ay.get(), (ajjz) eedVar10.a.kp.get(), (fgq) eedVar10.A.get(), (aahd) eedVar10.aL.get(), (xcl) eedVar10.a.rV.get(), (aivb) eedVar10.as.get(), eedVar10.jG(), (klk) eedVar10.cd.get(), (ImageView) eedVar10.ce.get(), (ahyr) eedVar10.cf.get(), (ypa) eedVar10.a.B.get(), (aaea) eedVar10.a.K.get());
            case 236:
                return new klk((ajjz) this.a.a.kp.get());
            case 237:
                ImageView imageView = (ImageView) LayoutInflater.from(this.a.a()).inflate(R.layout.youtube_controls_overlay_ad_overflow_menu_button, (ViewGroup) null);
                imageView.setVisibility(8);
                ayaw.k(imageView);
                return imageView;
            case 238:
                klq klqVar = ((YouTubeControlsOverlay) this.a.bC.get()).q;
                ayaw.k(klqVar);
                return klqVar;
            case 239:
                eed eedVar11 = this.a;
                Activity a3 = eedVar11.a();
                ajjz ajjzVar = (ajjz) eedVar11.a.kp.get();
                YouTubeControlsOverlay youTubeControlsOverlay = (YouTubeControlsOverlay) eedVar11.bC.get();
                return new krq(a3, ajjzVar, youTubeControlsOverlay.A(), eedVar11.mX(), null, null, null, null, null);
            case 240:
                eed eedVar12 = this.a;
                Activity a4 = eedVar12.a();
                YouTubeControlsOverlay youTubeControlsOverlay2 = (YouTubeControlsOverlay) eedVar12.bC.get();
                return new krm(a4, axqq.a(eedVar12.ch), eedVar12.jp(), (aahd) eedVar12.aL.get(), youTubeControlsOverlay2.A());
            case 241:
                return this.a.jv();
            case 242:
                eed eedVar13 = this.a;
                return new ksk(eedVar13.a(), (ahwi) eedVar13.bC.get(), (ahvz) eedVar13.cj.get(), (Handler) eedVar13.a.an.get());
            case 243:
                eed eedVar14 = this.a;
                return new abjc(eedVar14.a(), (axzg) eedVar14.a.wX.get());
            case 244:
                eed eedVar15 = this.a;
                Activity a5 = eedVar15.a();
                ((YouTubeControlsOverlay) eedVar15.bC.get()).A();
                return new xim(a5);
            case 245:
                return new jci(this.a.a());
            case 246:
                eed eedVar16 = this.a;
                return new kdy(eedVar16.a(), (adlt) eedVar16.a.ja.get());
            case 247:
                eed eedVar17 = this.a;
                Context e = eedVar17.e();
                azrw azrwVar = eedVar17.cp;
                ajvb ajvbVar = (ajvb) eedVar17.cD.get();
                azrw azrwVar2 = eedVar17.cH;
                ajoy jz = eedVar17.jz();
                abhc abhcVar = (abhc) eedVar17.cI.get();
                aiqn mf = eedVar17.mf();
                aeqh mv = eedVar17.mv();
                abiy ie = eedVar17.ie();
                ayqd ayqdVar = (ayqd) eedVar17.dc.get();
                sqq lf = eedVar17.lf();
                eedVar17.fD();
                return new jbe(e, azrwVar, ajvbVar, azrwVar2, jz, abhcVar, mf, mv, ie, ayqdVar, lf, (ajgq) eedVar17.a.dT.get(), (sxw) eedVar17.a.xp.get(), eedVar17.aP, null, null);
            case 248:
                return this.a.bd();
            case 249:
                gng gngVar = gng.DARK;
                ayaw.k(gngVar);
                return gngVar;
            case 250:
                gng gngVar2 = gng.DARK;
                ayaw.k(gngVar2);
                return gngVar2;
            case 251:
                eed eedVar18 = this.a;
                efz efzVar = eedVar18.a;
                azrw azrwVar3 = efzVar.by;
                azrw azrwVar4 = efzVar.xf;
                azrw azrwVar5 = efzVar.xg;
                azrw azrwVar6 = efzVar.lI;
                azrw azrwVar7 = efzVar.B;
                azrw azrwVar8 = efzVar.fX;
                azrw azrwVar9 = efzVar.iN;
                azrw azrwVar10 = efzVar.an;
                azrw azrwVar11 = efzVar.xh;
                azrw azrwVar12 = efzVar.xi;
                azrw azrwVar13 = eedVar18.cl;
                azrw azrwVar14 = eedVar18.cm;
                azrw azrwVar15 = eedVar18.bf;
                azrw azrwVar16 = efzVar.dB;
                azrw azrwVar17 = eedVar18.cn;
                azrwVar3.getClass();
                azrwVar4.getClass();
                azrwVar5.getClass();
                azrwVar6.getClass();
                azrwVar7.getClass();
                azrwVar8.getClass();
                azrwVar9.getClass();
                azrwVar10.getClass();
                azrwVar11.getClass();
                azrwVar12.getClass();
                azrwVar13.getClass();
                azrwVar14.getClass();
                azrwVar15.getClass();
                azrwVar16.getClass();
                azrwVar17.getClass();
                return adyu.df((abge) eedVar18.co.get(), eedVar18.a.cO(), (acqz) eedVar18.P.get(), azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, azrwVar14, azrwVar15, azrwVar16, azrwVar17);
            case 252:
                return new abhf((Handler) this.a.a.an.get());
            case 253:
                eed eedVar19 = this.a;
                eedVar19.a();
                return new abia((Handler) eedVar19.a.an.get());
            case 254:
                return this.a.mP();
            case PrivateKeyType.INVALID /* 255 */:
                eed eedVar20 = this.a;
                return new abge((aahd) eedVar20.I.get(), (acqz) eedVar20.P.get());
            case 256:
                eed eedVar21 = this.a;
                return new jbk(eedVar21.cq, eedVar21.cr, eedVar21.cs, eedVar21.ct, eedVar21.cv, eedVar21.cw, eedVar21.cx, eedVar21.cy, eedVar21.cz, eedVar21.cA, eedVar21.cB, eedVar21.cC);
            case 257:
                eed eedVar22 = this.a;
                return new ackf(eedVar22.a(), (ajjz) eedVar22.a.kp.get(), (ajut) eedVar22.a.lE.get(), (aahd) eedVar22.I.get(), (afsy) eedVar22.a.au.get(), (ajsd) eedVar22.a.xj.get(), (abjk) eedVar22.a.xi.get(), eedVar22.ie(), eedVar22.gW());
            case 258:
                eed eedVar23 = this.a;
                return new ackb(eedVar23.a(), (ajjz) eedVar23.a.kp.get());
            case 259:
                eed eedVar24 = this.a;
                return new ackc(eedVar24.e(), (aahd) eedVar24.I.get(), (ajut) eedVar24.a.lE.get());
            case 260:
                eed eedVar25 = this.a;
                return new ackd(eedVar25.a(), (ajjs) eedVar25.a.km.get(), (acqz) eedVar25.P.get(), (aahd) eedVar25.I.get(), (ajsd) eedVar25.a.xj.get(), (ajut) eedVar25.a.lE.get(), eedVar25.mP(), null, null, null, null);
            case 261:
                eed eedVar26 = this.a;
                return new acke(eedVar26.cp, eedVar26.e(), (aahd) eedVar26.I.get(), (ajut) eedVar26.a.lE.get(), eedVar26.mu(), null);
            case 262:
                return this.a.jG();
            case 263:
                eed eedVar27 = this.a;
                return new abmp(eedVar27.a(), (acqz) eedVar27.P.get(), (aahd) eedVar27.I.get(), (ajjs) eedVar27.a.km.get());
            case 264:
                eed eedVar28 = this.a;
                return new abmr(eedVar28.a(), (acqz) eedVar28.P.get(), (aahd) eedVar28.I.get(), (ajjs) eedVar28.a.km.get());
            case 265:
                eed eedVar29 = this.a;
                return new abmo(eedVar29.a(), (ajjs) eedVar29.a.km.get(), (acqz) eedVar29.P.get(), (aahd) eedVar29.I.get(), (ajla) eedVar29.a.kn.get(), eedVar29.gW());
            case 266:
                eed eedVar30 = this.a;
                return new abmq(eedVar30.a(), (acqz) eedVar30.P.get(), (aahd) eedVar30.I.get(), (ajjs) eedVar30.a.km.get());
            case 267:
                eed eedVar31 = this.a;
                return new abmn(eedVar31.a(), (acqz) eedVar31.P.get(), (ajjz) eedVar31.a.kp.get(), (ajsd) eedVar31.a.xj.get(), (aahd) eedVar31.I.get(), (ajut) eedVar31.a.lE.get());
            case 268:
                eed eedVar32 = this.a;
                return new abmm(eedVar32.e(), (ajjs) eedVar32.a.km.get(), (aahd) eedVar32.I.get(), (acqz) eedVar32.P.get());
            case 269:
                return this.a.jo();
            case 270:
                eed eedVar33 = this.a;
                return new abhh(eedVar33.a(), (aahd) eedVar33.I.get(), (ajrn) eedVar33.cE.get(), (abge) eedVar33.co.get(), eedVar33.cF, (ajdh) eedVar33.cG.get());
            case 271:
                eed eedVar34 = this.a;
                Context g = eedVar34.g();
                aahd aahdVar = (aahd) eedVar34.I.get();
                acqq cO = eedVar34.a.cO();
                zim gX = eedVar34.gX();
                return new ajrn(new ContextThemeWrapper(g, gX.a), aahdVar, cO, eedVar34.mh(), (eun) eedVar34.a.xk.get(), null, null);
            case 272:
                eed eedVar35 = this.a;
                Activity a6 = eedVar35.a();
                zim gX2 = eedVar35.gX();
                return new ajrc(new ContextThemeWrapper(a6, gX2.a), gX2, (aahd) eedVar35.I.get());
            case 273:
                return new ajdh();
            case 274:
                eed eedVar36 = this.a;
                return new abhc((abge) eedVar36.co.get(), (aahd) eedVar36.I.get(), (zaw) eedVar36.a.iN.get(), (ajsa) eedVar36.a.xh.get(), (abht) eedVar36.cp.get(), eedVar36.a());
            case 275:
                eed eedVar37 = this.a;
                return new abmv(eedVar37.cJ, eedVar37.cK, eedVar37.cL, eedVar37.cM, eedVar37.cN, eedVar37.cO, eedVar37.cP, eedVar37.cQ, eedVar37.cR, new ajyw(eedVar37.cS, eedVar37.I, eedVar37.cp, (char[]) null, (short[]) null), eedVar37.cT, eedVar37.cU, eedVar37.cV, eedVar37.cW, null, null);
            case 276:
                eed eedVar38 = this.a;
                return new abmy(eedVar38.a(), (ajjz) eedVar38.a.kp.get(), (aahd) eedVar38.I.get(), (ajut) eedVar38.a.lE.get(), (ajsd) eedVar38.a.xj.get(), (abjk) eedVar38.a.xi.get(), eedVar38.ie(), eedVar38.gW());
            case 277:
                eed eedVar39 = this.a;
                return new abmk(eedVar39.a(), (ajjz) eedVar39.a.kp.get());
            case 278:
                eed eedVar40 = this.a;
                return new abml(eedVar40.e(), (aahd) eedVar40.I.get(), (ajut) eedVar40.a.lE.get());
            case 279:
                eed eedVar41 = this.a;
                return new abms(eedVar41.a(), (ajjs) eedVar41.a.km.get(), (acqz) eedVar41.P.get(), (aahd) eedVar41.I.get(), (ajsd) eedVar41.a.xj.get(), (ajut) eedVar41.a.lE.get(), eedVar41.mP(), null, null, null, null);
            case 280:
                eed eedVar42 = this.a;
                return new abna(eedVar42.a(), (acqz) eedVar42.P.get(), (aahd) eedVar42.I.get(), (ajjs) eedVar42.a.km.get());
            case 281:
                eed eedVar43 = this.a;
                return new abnb(eedVar43.a(), (acqz) eedVar43.P.get(), (aahd) eedVar43.I.get(), (ajjs) eedVar43.a.km.get());
            case 282:
                eed eedVar44 = this.a;
                return new abmb(eedVar44.a(), (acqz) eedVar44.P.get(), (aahd) eedVar44.I.get(), (ajjs) eedVar44.a.km.get());
            case 283:
                eed eedVar45 = this.a;
                return new ablp(eedVar45.e(), (aahd) eedVar45.I.get());
            case 284:
                eed eedVar46 = this.a;
                return new abnc(eedVar46.cp, eedVar46.e(), (aahd) eedVar46.I.get(), (ajut) eedVar46.a.lE.get(), eedVar46.mu(), null);
            case 285:
                return this.a.e();
            case 286:
                eed eedVar47 = this.a;
                return new abmt(eedVar47.a(), (ajjs) eedVar47.a.km.get(), (acqz) eedVar47.P.get(), (aahd) eedVar47.I.get(), (ajla) eedVar47.a.kn.get(), eedVar47.gW());
            case 287:
                eed eedVar48 = this.a;
                return new able(eedVar48.a(), (acqz) eedVar48.P.get(), (ajjz) eedVar48.a.kp.get(), (ajsd) eedVar48.a.xj.get(), (aahd) eedVar48.I.get(), (ajut) eedVar48.a.lE.get());
            case 288:
                eed eedVar49 = this.a;
                return new abmj(eedVar49.e(), (ajjs) eedVar49.a.km.get(), (aahd) eedVar49.I.get(), (acqz) eedVar49.P.get());
            case 289:
                return this.a.jp();
            case 290:
                eed eedVar50 = this.a;
                return new abji(eedVar50.a.b.a, eedVar50.jI(), (ajvb) eedVar50.cZ.get(), (ajsa) eedVar50.a.xh.get(), (ajut) eedVar50.a.lE.get(), (ajsd) eedVar50.a.xj.get(), (acrt) eedVar50.a.ui.get());
            case 291:
                return this.a.jL();
            case 292:
                return this.a.jH();
            case 293:
                return this.a.jJ();
            case 294:
                return this.a.jK();
            case 295:
                return this.a.gW();
            case 296:
                eed eedVar51 = this.a;
                return new abow(eedVar51.e(), (abgd) eedVar51.cp.get(), eedVar51.cp, eedVar51.a(), (abjv) eedVar51.a.xn.get(), (ypa) eedVar51.a.B.get(), (aahd) eedVar51.I.get(), (abge) eedVar51.co.get(), eedVar51.ig(), new akcy(eedVar51.jO(), (aahd) eedVar51.I.get(), (acqz) eedVar51.P.get()), eedVar51.ie());
            case 297:
                return this.a.mu();
            case 298:
                eed eedVar52 = this.a;
                return new ajzd(eedVar52.db, eedVar52.cW, 1, null);
            case 299:
                eed eedVar53 = this.a;
                return new abku(eedVar53.a(), (ajjz) eedVar53.a.kp.get(), (aahd) eedVar53.I.get(), (ajut) eedVar53.a.lE.get(), (ajsd) eedVar53.a.xj.get(), (abjk) eedVar53.a.xi.get(), eedVar53.ie());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        int i = this.b;
        char c = 1;
        final int i2 = 0;
        switch (i) {
            case 400:
                eed eedVar = this.a;
                return new jmk(eedVar.a(), (rxm) eedVar.ei.get(), (acqz) eedVar.P.get(), null);
            case 401:
                return new kct();
            case 402:
                return new flu();
            case 403:
                eed eedVar2 = this.a;
                return new nym((fgq) eedVar2.A.get(), (acra) eedVar2.ay.get());
            case 404:
                return this.a.dk();
            case 405:
                adlt adltVar = (adlt) this.a.a.ja.get();
                ahey aheyVar = new ahey(null, null);
                aheyVar.f(adltVar.g() != null);
                return aheyVar;
            case 406:
                return this.a.K();
            case 407:
                mgz mgzVar = ((DefaultInlinePlayerControls) this.a.bK.get()).d;
                ayaw.k(mgzVar);
                return mgzVar;
            case 408:
                eed eedVar3 = this.a;
                ahhc ahhcVar = (ahhc) eedVar3.a.uz.get();
                efz efzVar = eedVar3.a;
                return new kcr(ahhcVar, efzVar.wG, (ypa) efzVar.B.get(), (kfw) eedVar3.eZ.get(), (fln) eedVar3.aZ.get(), (xic) eedVar3.fa.get(), (ahvm) eedVar3.dp.get(), (ahuq) eedVar3.fc.get(), (ahxv) eedVar3.fd.get(), (ahyw) eedVar3.fe.get(), (ahxb) eedVar3.fh.get(), (ahxg) eedVar3.fj.get(), (kmv) eedVar3.fk.get(), (xji) eedVar3.bs.get(), (xiu) eedVar3.fl.get(), (LiveOverlayPresenter) eedVar3.fn.get(), (ahsl) eedVar3.fp.get(), (CreatorEndscreenOverlayPresenter) eedVar3.fq.get(), (ahzg) eedVar3.fr.get(), (SubtitlesOverlayPresenter) eedVar3.fu.get(), (ahwu) eedVar3.fv.get(), (ahmg) eedVar3.ds.get(), (ahmx) eedVar3.fx.get(), (ahwy) eedVar3.fy.get(), (kec) eedVar3.dY.get(), (kgk) eedVar3.fz.get(), (MdxOverlaysPresenter) eedVar3.fA.get(), (kqy) eedVar3.fB.get(), (ksm) eedVar3.fC.get(), (NoSoundMemoOverlay) eedVar3.di.get(), (koj) eedVar3.aT.get(), (kmn) eedVar3.dj.get(), (aadw) eedVar3.a.D.get(), (aioc) eedVar3.n.get(), (abje) eedVar3.fo.get());
            case 409:
                eed eedVar4 = this.a;
                return new kfw((ci) eedVar4.s.get(), (kfu) eedVar4.eX.get(), (kfv) eedVar4.eY.get(), (Handler) eedVar4.a.an.get(), (aaea) eedVar4.a.K.get(), (akbz) eedVar4.bj.get());
            case 410:
                ce f = ((ci) this.a.s.get()).getSupportFragmentManager().f("VIDEO_QUALITIES_MENU_BOTTOM_SHEET_FRAGMENT");
                if (f != null) {
                    return (nol) f;
                }
                return new nol();
            case 411:
                ce f2 = ((ci) this.a.s.get()).getSupportFragmentManager().f("VIDEO_QUALITIES_QUICK_MENU_BOTTOM_SHEET_FRAGMENT");
                if (f2 != null) {
                    return (noo) f2;
                }
                return new noo();
            case 412:
                return this.a.gd();
            case 413:
                return this.a.iP();
            case 414:
                return this.a.dy();
            case 415:
                ce f3 = ((ci) this.a.s.get()).getSupportFragmentManager().f("AUDIO_TRACKS_MENU_BOTTOM_SHEET_FRAGMENT");
                if (f3 != null) {
                    return (nnj) f3;
                }
                return new nnj();
            case 416:
                eed eedVar5 = this.a;
                return new ahxv(eedVar5.ji(), (kfn) eedVar5.bk.get());
            case 417:
                return this.a.iD();
            case 418:
                return this.a.iV();
            case 419:
                eed eedVar6 = this.a;
                return new ahxb(eedVar6.ji(), (kfc) eedVar6.fg.get());
            case 420:
                eed eedVar7 = this.a;
                return new kfc((ci) eedVar7.s.get(), (kfb) eedVar7.ff.get());
            case 421:
                ce f4 = ((ci) this.a.s.get()).getSupportFragmentManager().f("PLAYBACK_RATE_MENU_BOTTOM_SHEET_FRAGMENT");
                if (f4 != null) {
                    return (noa) f4;
                }
                return new noa();
            case 422:
                eed eedVar8 = this.a;
                return new ahxg(eedVar8.ji(), eedVar8.jg(), (ahxc) eedVar8.fi.get());
            case 423:
                return this.a.iU();
            case 424:
                return new kmv((kmz) this.a.bg.get());
            case 425:
                return this.a.ge();
            case 426:
                return this.a.iS();
            case 427:
                eed eedVar9 = this.a;
                kqe kqeVar = new kqe((kqa) eedVar9.bE.get(), (PlaybackLifecycleMonitor) eedVar9.fm.get(), (fln) eedVar9.aZ.get(), (ypa) eedVar9.a.B.get(), (aioc) eedVar9.n.get(), (aadw) eedVar9.a.D.get(), (kch) eedVar9.u.get());
                fgq fgqVar = (fgq) eedVar9.A.get();
                fgm fgmVar = (fgm) eedVar9.bq.get();
                InlinePlaybackLifecycleController inlinePlaybackLifecycleController = (InlinePlaybackLifecycleController) eedVar9.x.get();
                kqeVar.b.h(kqeVar);
                kqeVar.c.a(kqeVar);
                kqeVar.g = fgqVar;
                fgqVar.i(kqeVar);
                fgmVar.g(kqeVar);
                inlinePlaybackLifecycleController.l(kqeVar);
                return kqeVar;
            case 428:
                eed eedVar10 = this.a;
                PlaybackLifecycleMonitor playbackLifecycleMonitor = new PlaybackLifecycleMonitor(eedVar10.ji(), (aioc) eedVar10.n.get());
                fgm fgmVar2 = (fgm) eedVar10.bq.get();
                fln flnVar = (fln) eedVar10.aZ.get();
                fgmVar2.d(playbackLifecycleMonitor);
                flnVar.a(playbackLifecycleMonitor);
                return playbackLifecycleMonitor;
            case 429:
                eed eedVar11 = this.a;
                final kgy kgyVar = new kgy(eedVar11.a(), (kgv) eedVar11.bZ.get(), (ajjz) eedVar11.a.kp.get(), (aahd) eedVar11.aL.get(), (zaz) eedVar11.B.get(), (afuh) eedVar11.a.hz.get(), (afxf) eedVar11.a.rU.get(), (acra) eedVar11.ay.get(), (ahsm) eedVar11.a.sS.get(), (nsv) eedVar11.bA.get(), (ahvw) eedVar11.fo.get(), (ahez) eedVar11.dY.get());
                kgyVar.a.r(kgyVar);
                aypn t = kgyVar.b.t();
                final char c2 = c == true ? 1 : 0;
                t.X(new ayrs() { // from class: kgw
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        if (c2 == 0) {
                            kgy kgyVar2 = kgyVar;
                            kgyVar2.f = ((Boolean) obj).booleanValue();
                            kgyVar2.c();
                        } else {
                            kgy kgyVar3 = kgyVar;
                            kgyVar3.e = ((Boolean) obj).booleanValue();
                            kgyVar3.c();
                        }
                    }
                });
                kgyVar.c.r.X(new ayrs() { // from class: kgw
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        if (i2 == 0) {
                            kgy kgyVar2 = kgyVar;
                            kgyVar2.f = ((Boolean) obj).booleanValue();
                            kgyVar2.c();
                        } else {
                            kgy kgyVar3 = kgyVar;
                            kgyVar3.e = ((Boolean) obj).booleanValue();
                            kgyVar3.c();
                        }
                    }
                });
                return kgyVar;
            case 430:
                return this.a.m152if();
            case 431:
                return this.a.iI();
            case 432:
                return this.a.dD();
            case 433:
                eed eedVar12 = this.a;
                eedVar12.a();
                return new ahzg((ahza) eedVar12.bF.get(), (aahd) eedVar12.I.get(), (ajut) eedVar12.a.lE.get(), eedVar12.ay);
            case 434:
                eed eedVar13 = this.a;
                return new SubtitlesOverlayPresenter((ahxi) eedVar13.ft.get(), (aisn) eedVar13.a.wh.get(), (aiuy) eedVar13.a.iC.get(), eedVar13.jk(), (Executor) eedVar13.a.f.get(), (Executor) eedVar13.a.i.get(), (aadw) eedVar13.a.D.get());
            case 435:
                eed eedVar14 = this.a;
                return new ahxh((ksz) eedVar14.bG.get(), (ahxn) eedVar14.bH.get(), (ahnc) eedVar14.fs.get());
            case 436:
                eed eedVar15 = this.a;
                return new ahnc((ViewGroup) eedVar15.dn.get(), eedVar15.a());
            case 437:
                eed eedVar16 = this.a;
                return new ahwu((ahww) eedVar16.bY.get(), eedVar16.a(), ammv.j((ywr) eedVar16.a.hL.get()), (afhz) eedVar16.a.gs.get(), (afqj) eedVar16.a.hk.get(), (ysy) eedVar16.a.as.get(), (zfe) eedVar16.a.hB.get(), eedVar16.a.et(), eedVar16.a.gW(), eedVar16.a.gU(), eedVar16.a.gX(), eedVar16.a.kr(), (aioc) eedVar16.n.get());
            case 438:
                eed eedVar17 = this.a;
                Activity a = eedVar17.a();
                YouTubeControlsOverlay youTubeControlsOverlay = (YouTubeControlsOverlay) eedVar17.bC.get();
                azrw azrwVar = eedVar17.a.wG;
                kfy kfyVar = (kfy) eedVar17.fw.get();
                TouchImageView touchImageView = (TouchImageView) LayoutInflater.from(a).inflate(R.layout.vr_button, (ViewGroup) null);
                youTubeControlsOverlay.d.a(touchImageView);
                return new ahmx(azrwVar, new ahnb(touchImageView), kfyVar);
            case 439:
                eed eedVar18 = this.a;
                return new kfy(eedVar18.a(), (acra) eedVar18.ay.get());
            case 440:
                eed eedVar19 = this.a;
                eedVar19.ji();
                return new ahwy(eedVar19.a(), 0);
            case 441:
                return this.a.dC();
            case 442:
                return this.a.dd();
            case 443:
                eed eedVar20 = this.a;
                kqy kqyVar = new kqy((kqv) eedVar20.dh.get(), (aahd) eedVar20.aL.get(), (wzq) eedVar20.a.rQ.get(), (acra) eedVar20.ay.get(), new zhr(0), (aifw) eedVar20.a.ls.get(), (aaea) eedVar20.a.K.get(), (Handler) eedVar20.a.an.get());
                kqyVar.a.a = kqyVar;
                kqyVar.d();
                return kqyVar;
            case 444:
                eed eedVar21 = this.a;
                ksm ksmVar = new ksm((ksl) eedVar21.dk.get(), axqq.a(eedVar21.ch), eedVar21.jp(), (acra) eedVar21.ay.get(), (sxd) eedVar21.a.nx.get(), (kih) eedVar21.bl.get());
                ahym ahymVar = (ahym) eedVar21.bw.get();
                aicz aiczVar = (aicz) eedVar21.aQ.get();
                CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter = (CreatorEndscreenOverlayPresenter) eedVar21.fq.get();
                ahymVar.kR(ksmVar);
                aiczVar.c.a(ksmVar);
                creatorEndscreenOverlayPresenter.e.add(ksmVar);
                ksmVar.e.a(ksmVar);
                return ksmVar;
            case 445:
                return this.a.L();
            case 446:
                return this.a.M();
            case 447:
                eed eedVar22 = this.a;
                return new ejm((fln) eedVar22.aZ.get(), (ypa) eedVar22.a.B.get(), (afsy) eedVar22.a.au.get(), (aahd) eedVar22.I.get(), (ajmu) eedVar22.a.ma.get(), (flh) eedVar22.eR.get(), eedVar22.af, (fgq) eedVar22.A.get());
            case 448:
                eed eedVar23 = this.a;
                return new fxf((fln) eedVar23.aZ.get(), (RentalActivationOverlay) eedVar23.cc.get(), (aioc) eedVar23.n.get());
            case 449:
                eed eedVar24 = this.a;
                return new ojw(eedVar24.a(), (fln) eedVar24.aZ.get(), (fgq) eedVar24.A.get());
            case 450:
                return this.a.dc();
            case 451:
                return new abig();
            case 452:
                return this.a.dP();
            case 453:
                return this.a.iK();
            case 454:
                eed eedVar25 = this.a;
                return new ojv((fln) eedVar25.aZ.get(), (ypa) eedVar25.a.B.get(), eedVar25.o, eedVar25.bq, eedVar25.af);
            case 455:
                eed eedVar26 = this.a;
                fln flnVar2 = (fln) eedVar26.aZ.get();
                aahd aahdVar = (aahd) eedVar26.aL.get();
                nyn nynVar = (nyn) eedVar26.dX.get();
                ahxg ahxgVar = (ahxg) eedVar26.fj.get();
                PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor = (PlaybackLoopShuffleMonitor) eedVar26.fO.get();
                aadw aadwVar = (aadw) eedVar26.a.D.get();
                aivu P = ((aioc) eedVar26.n.get()).P();
                ayaw.k(P);
                WatchHistoryPreviousNextController watchHistoryPreviousNextController = new WatchHistoryPreviousNextController(flnVar2, aahdVar, nynVar, ahxgVar, playbackLoopShuffleMonitor, aadwVar, P, (ypa) eedVar26.a.B.get(), (aioc) eedVar26.n.get(), eedVar26.fP);
                watchHistoryPreviousNextController.c.g(watchHistoryPreviousNextController);
                return watchHistoryPreviousNextController;
            case 456:
                return new PlaybackLoopShuffleMonitor((aioc) this.a.n.get());
            case 457:
                return this.a.jg();
            case 458:
                eed eedVar27 = this.a;
                return new okb((fln) eedVar27.aZ.get(), (ypa) eedVar27.a.B.get(), eedVar27.o);
            case 459:
                eed eedVar28 = this.a;
                return new okc((fln) eedVar28.aZ.get(), (aoae) eedVar28.a.xK.get(), eedVar28.o, eedVar28.I, eedVar28.eR, null, null);
            case 460:
                return this.a.fc();
            case 461:
                eed eedVar29 = this.a;
                return new nna(eedVar29.a(), (ywr) eedVar29.a.wF.get(), (fln) eedVar29.aZ.get(), eedVar29.o, (ahos) eedVar29.a.wG.get(), (aioc) eedVar29.n.get());
            case 462:
                return this.a.dO();
            case 463:
                return this.a.eQ();
            case 464:
                eed eedVar30 = this.a;
                return new ahnj((acra) eedVar30.ay.get(), eedVar30.a(), (ViewGroup) eedVar30.dn.get(), (ajjz) eedVar30.a.kp.get(), (aahd) eedVar30.aL.get());
            case 465:
                return this.a.aV();
            case 466:
                eed eedVar31 = this.a;
                return new oka((fln) eedVar31.aZ.get(), (fgm) eedVar31.bq.get(), (fgq) eedVar31.A.get(), eedVar31.aE());
            case 467:
                return new ong(this.a.fq(), ghe.h());
            case 468:
                return this.a.fl();
            case 469:
                return this.a.fg();
            case 470:
                eed eedVar32 = this.a;
                return new gju(eedVar32.a(), (gjr) eedVar32.at.get(), (nyk) eedVar32.aB.get());
            case 471:
                eed eedVar33 = this.a;
                return new oqi((ypa) eedVar33.a.B.get(), (gop) eedVar33.aC.get(), (PipWindowInsetsHelper) eedVar33.ge.get(), (zaz) eedVar33.B.get(), (adlt) eedVar33.a.ja.get(), eedVar33.ji(), (fgq) eedVar33.A.get(), (okd) eedVar33.aF.get(), (aaea) eedVar33.a.K.get(), (axzg) eedVar33.a.hN.get(), (okf) eedVar33.ao.get(), (oqk) eedVar33.gf.get(), null, null);
            case 472:
                return new PipWindowInsetsHelper(this.a.A);
            case 473:
                return new oqk((gje) this.a.l.get());
            case 474:
                return new nbm();
            case 475:
                return this.a.eO();
            case 476:
                return this.a.m151do();
            case 477:
                return this.a.dq();
            case 478:
                eed eedVar34 = this.a;
                Context context = eedVar34.a.b.a;
                ci ciVar = (ci) eedVar34.s.get();
                agzf agzfVar = (agzf) eedVar34.a.xX.get();
                jup jupVar = (jup) eedVar34.a.gU.get();
                fka fkaVar = (fka) eedVar34.a.gN.get();
                efz efzVar2 = eedVar34.a;
                return new jln(context, ciVar, agzfVar, jupVar, fkaVar, efzVar2.gH, efzVar2.as, (axzf) efzVar2.gT.get(), (jng) eedVar34.a.nB.get(), (jkv) eedVar34.gk.get(), (slv) eedVar34.gm.get(), (slr) eedVar34.dR.get(), (fjs) eedVar34.a.kv.get(), eedVar34.a.bY(), (axzg) eedVar34.a.kt.get(), null, null, null, null);
            case 479:
                return this.a.dm();
            case 480:
                return this.a.dp();
            case 481:
                return this.a.jw();
            case 482:
                eed eedVar35 = this.a;
                return new jws((ci) eedVar35.s.get(), (akbz) eedVar35.gp.get(), (aahd) eedVar35.I.get(), (jvh) eedVar35.a.xY.get(), (acqz) eedVar35.P.get());
            case 483:
                eed eedVar36 = this.a;
                Activity a2 = eedVar36.a();
                azrw azrwVar2 = eedVar36.go;
                azrw azrwVar3 = eedVar36.bj;
                akbz akbzVar = (akbz) ((azrw) amrz.n(ReelWatchActivity.class, azrwVar2, MainLiveCreationActivity.class, azrwVar3, ShortsCreationActivity.class, azrwVar3, WatchWhileActivity.class, azrwVar3).get(a2.getClass())).get();
                ayaw.k(akbzVar);
                return akbzVar;
            case 484:
                return new igi(this.a.g());
            case 485:
                return this.a.dr();
            case 486:
                eed eedVar37 = this.a;
                return new jwt(eedVar37.a(), (aahd) eedVar37.I.get(), eedVar37.a.cO(), (agzk) eedVar37.gn.get(), (ysy) eedVar37.a.as.get(), (ajdh) eedVar37.cG.get());
            case 487:
                return this.a.ds();
            case 488:
                return this.a.bp();
            case 489:
                return new ezn(2);
            case 490:
                return this.a.bL();
            case 491:
                return new ffe(this.a.gw, 11, (boolean[][]) null);
            case 492:
                return this.a.gh();
            case 493:
                return new gvl((ypa) this.a.a.B.get(), 9);
            case 494:
                return this.a.lN();
            case 495:
                return new gvl((ypa) this.a.a.B.get(), 8);
            case 496:
                return new xrd((xro) this.a.gx.get());
            case 497:
                return new xro();
            case 498:
                return this.a.bP();
            case 499:
                return this.a.bT();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        int i = this.b;
        switch (i) {
            case 1100:
                eed eedVar = this.a;
                return new ReelWatchActivityCaptionsLifecycleObserver((kfn) eedVar.jC.get(), eedVar.jh());
            case 1101:
                eed eedVar2 = this.a;
                return new kfn(eedVar2.g(), (ci) eedVar2.s.get(), eedVar2.jh(), (kfm) eedVar2.bi.get(), eedVar2.dz(), (aadw) eedVar2.a.D.get());
            case 1102:
                return this.a.cs();
            case 1103:
                eed eedVar3 = this.a;
                return new ReelSnackbarController((ci) eedVar3.s.get(), (ypa) eedVar3.a.B.get(), (akbz) eedVar3.bj.get(), eedVar3.ma(), (acqz) eedVar3.P.get(), eedVar3.aE(), null);
            case 1104:
                eed eedVar4 = this.a;
                return new ReelWatchActivityLifecycleObserver((hbb) eedVar4.a.lN.get(), (aahd) eedVar4.I.get());
            case 1105:
                eed eedVar5 = this.a;
                return new ReelWatchActivityOrientationController(eedVar5.a(), eedVar5.gR(), (zas) eedVar5.ax.get(), eedVar5.aX(), (axze) eedVar5.a.a.aF.get(), (ayqi) eedVar5.a.im.get(), (sus) eedVar5.ik.get());
            case 1106:
                eed eedVar6 = this.a;
                return new SettingsDataAccess(eedVar6.a(), (ypa) eedVar6.a.B.get(), eedVar6.a.cF(), (fap) eedVar6.a.ks.get(), (aadw) eedVar6.a.D.get(), (fuu) eedVar6.a.a.bc.get(), (akgl) eedVar6.a.a.bd.get(), (Executor) eedVar6.a.f.get(), (ysy) eedVar6.a.as.get(), (acra) eedVar6.O.get());
            case 1107:
                return this.a.kS();
            case 1108:
                return this.a.bX();
            case 1109:
                return this.a.fX();
            case 1110:
                eed eedVar7 = this.a;
                return new isk(eedVar7.a(), (ayqi) eedVar7.a.im.get(), (gcl) eedVar7.bj.get(), (aahv) eedVar7.a.dB.get(), (aahd) eedVar7.I.get(), (aadw) eedVar7.a.D.get());
            case 1111:
                return this.a.ej();
            case 1112:
                return this.a.dj();
            case 1113:
                return this.a.aW();
            case 1114:
                eed eedVar8 = this.a;
                return new PaneFragmentOrientationLocker((gji) eedVar8.E.get(), (gjr) eedVar8.at.get());
            case 1115:
                return this.a.fe();
            case 1116:
                return this.a.bQ();
            case 1117:
                return this.a.kA();
            case 1118:
                eed eedVar9 = this.a;
                vfg vfgVar = (vfg) eedVar9.a.p.get();
                vda a = vdb.a(eedVar9.a.b.a);
                a.e("commonui");
                a.f("inappreviews_proto.pb");
                Uri a2 = a.a();
                vfe a3 = vff.a();
                a3.f(a2);
                a3.e(mgl.a);
                return new ywp(agcm.e(vfgVar.a(a3.a())), mgl.a);
            case 1119:
                return this.a.aU();
            case 1120:
                eed eedVar10 = this.a;
                return new PlayerVideoViewLayoutDelegateController((kch) eedVar10.u.get(), (fgq) eedVar10.A.get(), (InlinePlayerLayoutDelegate) eedVar10.jL.get(), (ojs) eedVar10.iP.get());
            case 1121:
                return this.a.dF();
            case 1122:
                return this.a.A();
            case 1123:
                return this.a.B();
            case 1124:
                return this.a.dZ();
            case 1125:
                return this.a.dg();
            case 1126:
                return this.a.di();
            case 1127:
                return this.a.dh();
            case 1128:
                eed eedVar11 = this.a;
                return new MinimizedPlaybackPolicyController((ypa) eedVar11.a.B.get(), (fgq) eedVar11.A.get(), (aahd) eedVar11.I.get(), (nnd) eedVar11.af.get(), eedVar11.ji());
            case 1129:
                return this.a.dl();
            case 1130:
                eed eedVar12 = this.a;
                OfflineModeChangedRefreshController offlineModeChangedRefreshController = new OfflineModeChangedRefreshController((gje) eedVar12.l.get(), (fgq) eedVar12.A.get(), (flh) eedVar12.eR.get(), (aadw) eedVar12.a.D.get(), (aaea) eedVar12.a.K.get(), eedVar12.ji(), (oja) eedVar12.aI.get(), (oor) eedVar12.iZ.get(), (ypa) eedVar12.a.B.get(), (aioc) eedVar12.n.get(), ghe.s(), ghe.h(), ghe.r(), null, null, null);
                ((rxm) eedVar12.ei.get()).a(offlineModeChangedRefreshController);
                return offlineModeChangedRefreshController;
            case 1131:
                eed eedVar13 = this.a;
                return new PlaylistEditToastController(eedVar13.a(), (akbz) eedVar13.gp.get(), (aaea) eedVar13.a.K.get(), (ypa) eedVar13.a.B.get());
            case 1132:
                eed eedVar14 = this.a;
                return new TrailerOverlayPresenter(eedVar14.a(), (fwu) eedVar14.cb.get(), (aoae) eedVar14.a.xK.get(), (aioc) eedVar14.n.get(), (ayqi) eedVar14.a.im.get(), (ypa) eedVar14.a.B.get(), null, null);
            case 1133:
                eed eedVar15 = this.a;
                TooltipPlayerResponseMonitor tooltipPlayerResponseMonitor = new TooltipPlayerResponseMonitor((akcp) eedVar15.er.get(), (ypa) eedVar15.a.B.get(), (aioc) eedVar15.n.get(), (aadw) eedVar15.a.D.get());
                ((fgq) eedVar15.A.get()).i(tooltipPlayerResponseMonitor);
                return tooltipPlayerResponseMonitor;
            case 1134:
                eed eedVar16 = this.a;
                return new TooltipPlayerViewModeMonitor((akcy) eedVar16.aj.get(), (fgq) eedVar16.A.get());
            case 1135:
                eed eedVar17 = this.a;
                return new VolumeControlsManager(axqq.a(eedVar17.a.jo), (aiwg) eedVar17.a.jn.get(), eedVar17.a());
            case 1136:
                eed eedVar18 = this.a;
                return new WatchUpsellDialogController(eedVar18.ji(), eedVar18.iG(), eedVar18.a.cO(), (fma) eedVar18.a.wk.get(), (ypa) eedVar18.a.B.get(), (aioc) eedVar18.n.get(), (aadw) eedVar18.a.D.get(), (aahd) eedVar18.I.get(), eedVar18.jM());
            case 1137:
                eed eedVar19 = this.a;
                axzg axzgVar = (axzg) eedVar19.a.ap.get();
                axzf axzfVar = (axzf) eedVar19.a.wY.get();
                ahpe ahpeVar = (ahpe) eedVar19.a.rx.get();
                ojg ojgVar = (ojg) eedVar19.bq.get();
                ayqi ayqiVar = (ayqi) eedVar19.a.im.get();
                return new WatchResponseCoordinator(axzgVar, axzfVar, ahpeVar, ojgVar, ayqiVar, ayqiVar, (aioc) eedVar19.n.get(), amsx.r((ojk) eedVar19.bb.get()), null, null, null);
            case 1138:
                return this.a.fa();
            case 1139:
                eed eedVar20 = this.a;
                eedVar20.a();
                YouTubeInfoCardOverlayPresenter youTubeInfoCardOverlayPresenter = new YouTubeInfoCardOverlayPresenter((aabi) eedVar20.ca.get(), (zaz) eedVar20.B.get(), (aabq) eedVar20.dq.get(), (aabn) eedVar20.a.yv.get(), (xjl) eedVar20.a.sS.get(), (ahsl) eedVar20.fp.get(), (ypa) eedVar20.a.B.get());
                aabq aabqVar = (aabq) eedVar20.dq.get();
                ksg ksgVar = (ksg) eedVar20.dH.get();
                aabqVar.r = youTubeInfoCardOverlayPresenter;
                ksgVar.b(youTubeInfoCardOverlayPresenter);
                return youTubeInfoCardOverlayPresenter;
            case 1140:
                return this.a.dS();
            case 1141:
                eed eedVar21 = this.a;
                PipPaidProductBadgeOverlay pipPaidProductBadgeOverlay = new PipPaidProductBadgeOverlay(eedVar21.a(), (aioc) eedVar21.n.get(), (Handler) eedVar21.a.an.get(), (shf) eedVar21.a.g.get(), (aaea) eedVar21.a.K.get());
                ((YouTubePlayerOverlaysLayout) eedVar21.dm.get()).pE(pipPaidProductBadgeOverlay);
                return pipPaidProductBadgeOverlay;
            case 1142:
                return this.a.ar();
            case 1143:
                return this.a.eV();
            case 1144:
                eed eedVar22 = this.a;
                return new UpForFullController(eedVar22.a(), (aaea) eedVar22.a.K.get(), (aioc) eedVar22.n.get());
            case 1145:
                return this.a.dE();
            case 1146:
                eed eedVar23 = this.a;
                return new WatchLayoutStateMonitor((wob) eedVar23.a.sk.get(), (xjl) eedVar23.a.sS.get(), eedVar23.a(), (oel) eedVar23.hA.get());
            case 1147:
                eed eedVar24 = this.a;
                return new SingleLoopMenuItemController(eedVar24.a(), (PlaybackLoopShuffleMonitor) eedVar24.fO.get(), (aioc) eedVar24.n.get(), (acra) eedVar24.ay.get());
            case 1148:
                eed eedVar25 = this.a;
                return new SingleLoopPlaybackMonitor(eedVar25.a(), (PlaybackLoopShuffleMonitor) eedVar25.fO.get(), (aili) eedVar25.a.xr.get(), (akbz) eedVar25.bj.get(), (aioc) eedVar25.n.get(), (acra) eedVar25.ay.get(), (aaea) eedVar25.a.K.get(), null, null);
            case 1149:
                return this.a.gK();
            case 1150:
                eed eedVar26 = this.a;
                return new VideoStageMonitor((aioc) eedVar26.n.get(), (nzc) eedVar26.hz.get(), (ahym) eedVar26.bw.get());
            case 1151:
                eed eedVar27 = this.a;
                return new MusicDeeplinkMenuItemController(eedVar27.a(), (aioc) eedVar27.n.get(), (aahd) eedVar27.I.get(), (ajut) eedVar27.a.lE.get());
            case 1152:
                eed eedVar28 = this.a;
                return new TimebarAccessibilityController((fna) eedVar28.bw.get(), (ahui) eedVar28.a.xc.get(), (kih) eedVar28.bl.get());
            case 1153:
                eed eedVar29 = this.a;
                return new TvSignInControllerImpl((acys) eedVar29.a.iJ.get(), (ypa) eedVar29.a.B.get(), (acpl) eedVar29.a.aw.get(), eedVar29.a.ie(), (wdm) eedVar29.a.au.get(), (afsy) eedVar29.a.au.get(), (acun) eedVar29.a.iu.get(), eedVar29.a.a.bn, (ci) eedVar29.s.get(), (adti) eedVar29.jR.get(), (adlt) eedVar29.a.ja.get(), (adsq) eedVar29.a.a.bo.get(), (Executor) eedVar29.a.i.get(), (ScheduledExecutorService) eedVar29.a.f.get());
            case 1154:
                eed eedVar30 = this.a;
                return new adti(eedVar30.a(), (akbz) eedVar30.gp.get(), (acqz) eedVar30.P.get());
            case 1155:
                eed eedVar31 = this.a;
                return new kqm((ci) eedVar31.s.get(), (ajoy) eedVar31.a.a.bp.get(), eedVar31.a.am(), (aadw) eedVar31.a.D.get(), (aioc) eedVar31.n.get(), (akbw) eedVar31.eK.get(), (shf) eedVar31.a.g.get(), (acra) eedVar31.ay.get(), eedVar31.fX(), (afsy) eedVar31.a.au.get(), (wju) eedVar31.en.get(), null, null, null);
            case 1156:
                return this.a.ku();
            case 1157:
                return new ksn();
            case 1158:
                eed eedVar32 = this.a;
                return new PlayerResponseServiceEndpointListener((aioc) eedVar32.n.get(), (aahd) eedVar32.I.get());
            case 1159:
                return this.a.kT();
            case 1160:
                eed eedVar33 = this.a;
                final ajmc ajmcVar = new ajmc(eedVar33.a(), (SharedPreferences) eedVar33.a.z.get(), (acrh) eedVar33.a.fz.get());
                return new any(ajmcVar) { // from class: com.google.android.libraries.youtube.rendering.logging.InteractionLoggingOverlayController$Observer
                    private final ajmc a;

                    {
                        this.a = ajmcVar;
                    }

                    @Override // defpackage.aoa
                    public final /* synthetic */ void lc(aok aokVar) {
                    }

                    @Override // defpackage.any, defpackage.aoa
                    public final /* synthetic */ void lg(aok aokVar) {
                    }

                    @Override // defpackage.any, defpackage.aoa
                    public final void lh(aok aokVar) {
                        ajmc ajmcVar2 = this.a;
                        ajmcVar2.a.c.remove(ajmcVar2);
                    }

                    @Override // defpackage.any, defpackage.aoa
                    public final /* synthetic */ void nu(aok aokVar) {
                    }

                    @Override // defpackage.aoa
                    public final /* synthetic */ void nv(aok aokVar) {
                    }

                    @Override // defpackage.any, defpackage.aoa
                    public final void ot(aok aokVar) {
                        ajmc ajmcVar2 = this.a;
                        ajmcVar2.a.c.add(ajmcVar2);
                    }
                };
            case 1161:
                return this.a.kR();
            case 1162:
                return this.a.cS();
            case 1163:
                return this.a.cQ();
            case 1164:
                return amsx.r(new hrr((hos) this.a.jX.get()));
            case 1165:
                efz efzVar = this.a.a;
                return new hos(efzVar.b.a, (acpy) efzVar.gV.get());
            case 1166:
                return new isf(this.a.jG());
            case 1167:
                return this.a.jP();
            case 1168:
                return new akbc();
            case 1169:
                return this.a.mV();
            case 1170:
                eed eedVar34 = this.a;
                return new llu(eedVar34.a(), (fjs) eedVar34.a.kv.get(), (SettingsDataAccess) eedVar34.jI.get());
            case 1171:
                eed eedVar35 = this.a;
                return new iyp((ml) eedVar35.j.get(), eedVar35.gR(), (ViewGroup) ((ViewGroup) eedVar35.kd.get()).findViewById(R.id.settings_selection_detail_parent_container), eedVar35.mb(), null);
            case 1172:
                return this.a.l();
            case 1173:
                return this.a.ek();
            case 1174:
                return this.a.jC();
            case 1175:
                return new ajti(ghx.e);
            case 1176:
                return new ajti(ghx.d);
            case 1177:
                return new fxn();
            case 1178:
                return new mkb((gje) this.a.l.get());
            case 1179:
                return this.a.aS();
            case 1180:
                return this.a.iC();
            case 1181:
                return this.a.eu();
            case 1182:
                return this.a.eN();
            case 1183:
                Activity a4 = this.a.a();
                Configuration configuration = new Configuration();
                configuration.uiMode = (configuration.uiMode & (-49)) | 32;
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(a4, R.style.Theme_YouTube_Dark);
                contextThemeWrapper.applyOverrideConfiguration(configuration);
                return contextThemeWrapper;
            case 1184:
                return new ContextThemeWrapper(this.a.a(), R.style.Theme_YouTube_Dark);
            case 1185:
                return this.a.iG();
            case 1186:
                return this.a.eo();
            case 1187:
                return this.a.ep();
            case 1188:
                eed eedVar36 = this.a;
                return new oso((aadw) eedVar36.a.D.get(), (osm) eedVar36.a.ll.get(), eedVar36.jc(), axqq.a(eedVar36.kp), axqq.a(eedVar36.a.a.bz), (ayqi) eedVar36.a.im.get());
            case 1189:
                eed eedVar37 = this.a;
                return new orx((osm) eedVar37.a.ll.get(), (osq) eedVar37.a.a.by.get(), (aadw) eedVar37.a.D.get(), (ypa) eedVar37.a.B.get(), (fgq) eedVar37.A.get(), (rxm) eedVar37.ei.get(), (adlt) eedVar37.a.ja.get(), (gjz) eedVar37.aD.get(), (okf) eedVar37.ao.get(), eedVar37.ji(), (aahd) eedVar37.I.get(), (Handler) eedVar37.a.an.get(), (ayqi) eedVar37.a.im.get(), null);
            case 1190:
                return this.a.er();
            case 1191:
                eed eedVar38 = this.a;
                return new lyj(eedVar38.a(), (akbw) eedVar38.eK.get(), eedVar38.o, (aioc) eedVar38.n.get(), (ywr) eedVar38.a.a.bA.get(), (aok) eedVar38.s.get());
            case 1192:
                eed eedVar39 = this.a;
                return new lwt((ci) eedVar39.s.get(), (ajby) eedVar39.a.uE.get(), eedVar39.ip, new fue((aahd) eedVar39.I.get(), (acra) eedVar39.ay.get(), (ysy) eedVar39.a.as.get(), (shf) eedVar39.a.g.get(), (SharedPreferences) eedVar39.a.z.get(), (akbz) eedVar39.gp.get()), (acra) eedVar39.ay.get());
            case 1193:
                return this.a.en();
            case 1194:
                eed eedVar40 = this.a;
                return new fxb((acpl) eedVar40.a.aw.get(), eedVar40.aG(), (Handler) eedVar40.a.an.get(), (akbw) eedVar40.eK.get(), (fxd) eedVar40.kv.get(), (acys) eedVar40.a.iJ.get(), eedVar40.hW());
            case 1195:
                eed eedVar41 = this.a;
                return new fxd((ysl) eedVar41.a.fN.get(), eedVar41.a.iy);
            case 1196:
                eed eedVar42 = this.a;
                return new onr(eedVar42.a(), (gje) eedVar42.l.get(), (fgq) eedVar42.A.get(), (miv) eedVar42.ew.get(), eedVar42.aH, (oqk) eedVar42.kx.get(), eedVar42.gR(), (aaea) eedVar42.a.K.get(), null);
            case 1197:
                return new oqk((jfj) this.a.eU.get());
            case 1198:
                eed eedVar43 = this.a;
                return new oom((ml) eedVar43.j.get(), (aoae) eedVar43.a.xK.get(), eedVar43.a.kr, null, null);
            case 1199:
                eed eedVar44 = this.a;
                ml mlVar = (ml) eedVar44.j.get();
                ypa ypaVar = (ypa) eedVar44.a.B.get();
                azrw azrwVar = eedVar44.ei;
                zbi zbiVar = (zbi) eedVar44.a.iL.get();
                kbv kbvVar = (kbv) eedVar44.eQ.get();
                azrw azrwVar2 = eedVar44.kA;
                efz efzVar2 = eedVar44.a;
                azrw azrwVar3 = efzVar2.oJ;
                azrw azrwVar4 = efzVar2.oK;
                azrw azrwVar5 = efzVar2.a.bB;
                jvh jvhVar = (jvh) efzVar2.xY.get();
                efc efcVar = eedVar44.a.a;
                return new ont(mlVar, ypaVar, azrwVar, zbiVar, kbvVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, jvhVar, efcVar.bC, efcVar.bD, (acqz) eedVar44.P.get());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.azrw
    public final Object get() {
        int i = this.b;
        switch (i / 100) {
            case 0:
                return a();
            case 1:
                return b();
            case 2:
                return h();
            case 3:
                return i();
            case 4:
                return j();
            case 5:
                return k();
            case 6:
                return l();
            case 7:
                switch (i) {
                    case 700:
                        return this.a.ib();
                    case 701:
                        return this.a.lX();
                    case 702:
                        return this.a.jR();
                    case 703:
                        return this.a.jS();
                    case 704:
                        return this.a.jU();
                    case 705:
                        return this.a.jT();
                    case 706:
                        return this.a.lv();
                    case 707:
                        return this.a.cX();
                    case 708:
                        return this.a.hQ();
                    case 709:
                        return this.a.X();
                    case 710:
                        return this.a.eg();
                    case 711:
                        return this.a.bw();
                    case 712:
                        return this.a.bx();
                    case 713:
                        return this.a.hU();
                    case 714:
                        return this.a.lw();
                    case 715:
                        return this.a.bV();
                    case 716:
                        return this.a.lF();
                    case 717:
                        return this.a.cG();
                    case 718:
                        return this.a.lA();
                    case 719:
                        return this.a.kH();
                    case 720:
                        return this.a.cJ();
                    case 721:
                        return new yaq(null, null);
                    case 722:
                        return this.a.bN();
                    case 723:
                        return this.a.bM();
                    case 724:
                        return this.a.bO();
                    case 725:
                        return this.a.hY();
                    case 726:
                        return this.a.hX();
                    case 727:
                        return this.a.cW();
                    case 728:
                        return this.a.aM();
                    case 729:
                        return this.a.aN();
                    case 730:
                        return this.a.aO();
                    case 731:
                        return this.a.aL();
                    case 732:
                        return this.a.Y();
                    case 733:
                        return this.a.eX();
                    case 734:
                        return this.a.fh();
                    case 735:
                        return new fxp();
                    case 736:
                        return Boolean.valueOf(this.a.kW());
                    case 737:
                        return this.a.eZ();
                    case 738:
                        return new nzd();
                    case 739:
                        return this.a.fd();
                    case 740:
                        return this.a.eb();
                    case 741:
                        return this.a.eW();
                    case 742:
                        return this.a.ln();
                    case 743:
                        return this.a.ae();
                    case 744:
                        return this.a.lo();
                    case 745:
                        return this.a.Z();
                    case 746:
                        return this.a.hl();
                    case 747:
                        return this.a.fT();
                    case 748:
                        return this.a.fU();
                    case 749:
                        return this.a.lM();
                    case 750:
                        return this.a.fV();
                    case 751:
                        return this.a.cY();
                    case 752:
                        return this.a.ic();
                    case 753:
                        return this.a.id();
                    case 754:
                        return this.a.aJ();
                    case 755:
                        return this.a.aI();
                    case 756:
                        return this.a.aH();
                    case 757:
                        return this.a.lp();
                    case 758:
                        return this.a.lG();
                    case 759:
                        return this.a.ab();
                    case 760:
                        return this.a.aK();
                    case 761:
                        return this.a.ac();
                    case 762:
                        return this.a.u();
                    case 763:
                        return this.a.v();
                    case 764:
                        return this.a.lq();
                    case 765:
                        return this.a.ai();
                    case 766:
                        return this.a.af();
                    case 767:
                        return this.a.mH();
                    case 768:
                        return this.a.bH();
                    case 769:
                        return this.a.lx();
                    case 770:
                        return this.a.iJ();
                    case 771:
                        return this.a.ly();
                    case 772:
                        return this.a.gE();
                    case 773:
                        return this.a.gI();
                    case 774:
                        return this.a.gF();
                    case 775:
                        return this.a.gJ();
                    case 776:
                        return this.a.cl();
                    case 777:
                        return this.a.cA();
                    case 778:
                        return this.a.cP();
                    case 779:
                        return this.a.cM();
                    case 780:
                        return this.a.cx();
                    case 781:
                        return this.a.J();
                    case 782:
                        return this.a.eA();
                    case 783:
                        return this.a.ez();
                    case 784:
                        return this.a.ll();
                    case 785:
                        return this.a.gM();
                    case 786:
                        return this.a.gP();
                    case 787:
                        return this.a.gN();
                    case 788:
                        return this.a.lE();
                    case 789:
                        return this.a.cF();
                    case 790:
                        return this.a.iu();
                    case 791:
                        return this.a.lQ();
                    case 792:
                        return this.a.gl();
                    case 793:
                        return this.a.cu();
                    case 794:
                        return this.a.cN();
                    case 795:
                        return new ajvq();
                    case 796:
                        return this.a.fD();
                    case 797:
                        return this.a.z();
                    case 798:
                        return this.a.cD();
                    case 799:
                        return this.a.ha();
                    default:
                        throw new AssertionError(i);
                }
            case 8:
                switch (i) {
                    case 800:
                        return this.a.iO();
                    case 801:
                        return this.a.E();
                    case 802:
                        return this.a.cE();
                    case 803:
                        return this.a.cI();
                    case 804:
                        return this.a.gg();
                    case 805:
                        return new xqa();
                    case 806:
                        return this.a.iL();
                    case 807:
                        return new ahtw();
                    case 808:
                        return this.a.iM();
                    case 809:
                        return this.a.lt();
                    case 810:
                        return this.a.aw();
                    case 811:
                        return ghe.n();
                    case 812:
                        return this.a.cz();
                    case 813:
                        return this.a.hm();
                    case 814:
                        return this.a.hn();
                    case 815:
                        return this.a.ho();
                    case 816:
                        return this.a.hs();
                    case 817:
                        return this.a.hp();
                    case 818:
                        return this.a.bm();
                    case 819:
                        return this.a.ah();
                    case 820:
                        return this.a.hq();
                    case 821:
                        return this.a.hr();
                    case 822:
                        return this.a.ht();
                    case 823:
                        return this.a.hu();
                    case 824:
                        return this.a.hv();
                    case 825:
                        return this.a.hw();
                    case 826:
                        return this.a.hx();
                    case 827:
                        return this.a.hy();
                    case 828:
                        return this.a.hz();
                    case 829:
                        return this.a.lO();
                    case 830:
                        return this.a.gj();
                    case 831:
                        return this.a.gk();
                    case 832:
                        return this.a.lP();
                    case 833:
                        return new xre();
                    case 834:
                        return this.a.bY();
                    case 835:
                        return this.a.ga();
                    case 836:
                        return this.a.fZ();
                    case 837:
                        return this.a.ck();
                    case 838:
                        return this.a.kB();
                    case 839:
                        return this.a.am();
                    case 840:
                        return this.a.jW();
                    case 841:
                        return this.a.ks();
                    case 842:
                        return this.a.in();
                    case 843:
                        return this.a.iq();
                    case 844:
                        return this.a.io();
                    case 845:
                        return this.a.ip();
                    case 846:
                        return this.a.iE();
                    case 847:
                        return this.a.ii();
                    case 848:
                        return this.a.ij();
                    case 849:
                        return this.a.kY();
                    case 850:
                        return new acfo();
                    case 851:
                        return this.a.hS();
                    case 852:
                        return this.a.im();
                    case 853:
                        return this.a.hV();
                    case 854:
                        return this.a.lZ();
                    case 855:
                        return this.a.il();
                    case 856:
                        return this.a.iB();
                    case 857:
                        return this.a.hR();
                    case 858:
                        return this.a.aj();
                    case 859:
                        return this.a.Q();
                    case 860:
                        return this.a.hP();
                    case 861:
                        return this.a.t();
                    case 862:
                        return this.a.cg();
                    case 863:
                        return this.a.kJ();
                    case 864:
                        return this.a.cp();
                    case 865:
                        return this.a.lC();
                    case 866:
                        return this.a.cn();
                    case 867:
                        return this.a.co();
                    case 868:
                        return this.a.cm();
                    case 869:
                        return this.a.kv();
                    case 870:
                        return this.a.ci();
                    case 871:
                        return new aoae((byte[]) null, (byte[]) null, (char[]) null, (byte[]) null);
                    case 872:
                        return new fhe();
                    case 873:
                        return this.a.ca();
                    case 874:
                        return this.a.bZ();
                    case 875:
                        return this.a.ja();
                    case 876:
                        return this.a.lV();
                    case 877:
                        return this.a.hi();
                    case 878:
                        return this.a.hh();
                    case 879:
                        return this.a.hE();
                    case 880:
                        return this.a.lL();
                    case 881:
                        return this.a.hJ();
                    case 882:
                        return this.a.lS();
                    case 883:
                        return this.a.hF();
                    case 884:
                        return new ezn(3);
                    case 885:
                        return this.a.cq();
                    case 886:
                        return this.a.hG();
                    case 887:
                        return this.a.el();
                    case 888:
                        return this.a.em();
                    case 889:
                        return this.a.lD();
                    case 890:
                        return this.a.bs();
                    case 891:
                        return this.a.et();
                    case 892:
                        return this.a.ls();
                    case 893:
                        return this.a.kG();
                    case 894:
                        return this.a.ct();
                    case 895:
                        return this.a.cv();
                    case 896:
                        return this.a.ax();
                    case 897:
                        return this.a.ay();
                    case 898:
                        return this.a.cw();
                    case 899:
                        return this.a.f();
                    default:
                        throw new AssertionError(i);
                }
            case 9:
                switch (i) {
                    case 900:
                        return this.a.gm();
                    case 901:
                        return this.a.lR();
                    case 902:
                        return this.a.cB();
                    case 903:
                        return this.a.gn();
                    case 904:
                        return this.a.go();
                    case 905:
                        return this.a.cy();
                    case 906:
                        return this.a.cC();
                    case 907:
                        return this.a.bn();
                    case 908:
                        return this.a.gO();
                    case 909:
                        return this.a.hK();
                    case 910:
                        return new lno();
                    case 911:
                        return this.a.hk();
                    case 912:
                        return this.a.hH();
                    case 913:
                        return this.a.hL();
                    case 914:
                        return this.a.hM();
                    case 915:
                        return this.a.hN();
                    case 916:
                        return this.a.hI();
                    case 917:
                        return this.a.bK();
                    case 918:
                        return this.a.bk();
                    case 919:
                        return this.a.bl();
                    case 920:
                        return this.a.cU();
                    case 921:
                        return this.a.mn();
                    case 922:
                        return this.a.cV();
                    case 923:
                        return this.a.bo();
                    case 924:
                        return new ezn(7);
                    case 925:
                        return this.a.fQ();
                    case 926:
                        return this.a.ad();
                    case 927:
                        return this.a.lr();
                    case 928:
                        return this.a.lY();
                    case 929:
                        return this.a.ee();
                    case 930:
                        return this.a.lH();
                    case 931:
                        return this.a.gL();
                    case 932:
                        return this.a.gq();
                    case 933:
                        return this.a.bt();
                    case 934:
                        return this.a.le();
                    case 935:
                        return new ezn(5);
                    case 936:
                        return new ezn(0);
                    case 937:
                        return this.a.ag();
                    case 938:
                        return this.a.at();
                    case 939:
                        return this.a.lk();
                    case 940:
                        return this.a.kp();
                    case 941:
                        return this.a.F();
                    case 942:
                        return this.a.bA();
                    case 943:
                        return this.a.bz();
                    case 944:
                        return this.a.bF();
                    case 945:
                        return this.a.gw();
                    case 946:
                        return this.a.gy();
                    case 947:
                        return this.a.gC();
                    case 948:
                        return this.a.gz();
                    case 949:
                        return this.a.gr();
                    case 950:
                        return this.a.bu();
                    case 951:
                        return this.a.mC();
                    case 952:
                        return this.a.me();
                    case 953:
                        return this.a.mK();
                    case 954:
                        return this.a.gA();
                    case 955:
                        return this.a.dn();
                    case 956:
                        return this.a.ak();
                    case 957:
                        return this.a.bv();
                    case 958:
                        return this.a.gD();
                    case 959:
                        return this.a.gx();
                    case 960:
                        return this.a.W();
                    case 961:
                        return this.a.gB();
                    case 962:
                        return this.a.gG();
                    case 963:
                        return this.a.gH();
                    case 964:
                        return this.a.gu();
                    case 965:
                        return this.a.gv();
                    case 966:
                        return this.a.aa();
                    case 967:
                        return this.a.lK();
                    case 968:
                        return this.a.ef();
                    case 969:
                        return this.a.lJ();
                    case 970:
                        return this.a.V();
                    case 971:
                        return this.a.hj();
                    case 972:
                        return this.a.bG();
                    case 973:
                        return this.a.jQ();
                    case 974:
                        return this.a.cd();
                    case 975:
                        return this.a.cc();
                    case 976:
                        return this.a.lB();
                    case 977:
                        return this.a.ce();
                    case 978:
                        return this.a.gp();
                    case 979:
                        return this.a.by();
                    case 980:
                        return this.a.ir();
                    case 981:
                        return this.a.jt();
                    case 982:
                        return this.a.fu();
                    case 983:
                        return this.a.kC();
                    case 984:
                        return this.a.ih();
                    case 985:
                        return this.a.kZ();
                    case 986:
                        return new acfq();
                    case 987:
                        return this.a.eH();
                    case 988:
                        return this.a.aP();
                    case 989:
                        return this.a.kE();
                    case 990:
                        return new akok();
                    case 991:
                        return new akpb();
                    case 992:
                        return this.a.kr();
                    case 993:
                        return this.a.fB();
                    case 994:
                        return this.a.fw();
                    case 995:
                        return ssv.p();
                    case 996:
                        return this.a.kg();
                    case 997:
                        return this.a.fy();
                    case 998:
                        return this.a.fx();
                    case 999:
                        return this.a.fC();
                    default:
                        throw new AssertionError(i);
                }
            case 10:
                return c();
            case 11:
                return d();
            case 12:
                return e();
            case 13:
                return f();
            default:
                return g();
        }
    }
}
