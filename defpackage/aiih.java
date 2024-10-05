package defpackage;

import android.os.ConditionVariable;
import android.os.Handler;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiih {
    public final axpg a;
    public final aaea b;
    public final zaw c;
    public final ScheduledExecutorService d;
    public final Executor e;
    public aiif f;
    public ykn g;
    public volatile aiiz h;
    public aigy i;
    public aigy j;
    public ConditionVariable k;
    public volatile aigk l;
    public aihk m;
    public PlaybackStartDescriptor n;
    public PlaybackStartDescriptor o;
    public volatile PlayerResponseModel p;
    public volatile WatchNextResponseModel q;
    public boolean r;
    public final aimx s;
    private final Handler t;
    private final aifk u;
    private final aiig v;
    private final ahbg w;
    private final aadw x;

    public aiih(ypa ypaVar, axpg axpgVar, Handler handler, zaw zawVar, ScheduledExecutorService scheduledExecutorService, Executor executor, aimx aimxVar, ahbg ahbgVar, aaea aaeaVar, aadw aadwVar, aifk aifkVar) {
        aiig aiigVar = new aiig(this);
        this.v = aiigVar;
        this.a = axpgVar;
        this.t = handler;
        this.c = zawVar;
        this.d = scheduledExecutorService;
        this.e = executor;
        this.s = aimxVar;
        this.w = ahbgVar;
        this.b = aaeaVar;
        this.x = aadwVar;
        this.u = aifkVar;
        ypaVar.g(aiigVar);
    }

    public static ammv b(ammv ammvVar, ammv ammvVar2, aiiy aiiyVar, String str, zaw zawVar) {
        if (ammvVar.h()) {
            aiiyVar.d((PlayerResponseModel) ammvVar.c());
        } else if (ammvVar2.h()) {
            Exception exc = (Exception) ammvVar2.c();
            aiiyVar.b(new aigr(4, true, 1, zawVar.b(exc), exc, str));
        }
        return amlr.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(int i) {
        return i == 3 || i == 2 || i == 0;
    }

    public static void p(aiiy aiiyVar, int i, ammv ammvVar, ammv ammvVar2) {
        if (ammvVar.h() && ammvVar2.h()) {
            aiiyVar.a(i);
        }
    }

    public static void q(ammv ammvVar, ammv ammvVar2, aiiy aiiyVar, zaw zawVar) {
        if (ammvVar.h()) {
            aiiyVar.g((WatchNextResponseModel) ammvVar.c());
        } else if (ammvVar2.h()) {
            Exception exc = (Exception) ammvVar2.c();
            aiiyVar.f(new aigr(12, true, zawVar.b(exc), exc));
        }
    }

    public static void r(aigy aigyVar, Executor executor, ayro ayroVar) {
        aigyVar.d(new aiji(aigyVar, ayroVar, 1), executor);
    }

    public static void s(aigy aigyVar, PlayerResponseModel playerResponseModel, PlaybackStartDescriptor playbackStartDescriptor, long j, final ConditionVariable conditionVariable, ScheduledExecutorService scheduledExecutorService, Executor executor, ayro ayroVar) {
        if (j <= 0 || ((playerResponseModel != null && (playerResponseModel.F() || playerResponseModel.c().ao())) || playbackStartDescriptor.x())) {
            conditionVariable.open();
        } else {
            conditionVariable.getClass();
            scheduledExecutorService.schedule(new Runnable() { // from class: aiia
                @Override // java.lang.Runnable
                public final void run() {
                    conditionVariable.open();
                }
            }, j, TimeUnit.MILLISECONDS);
        }
        aigyVar.d(new aiji(aigyVar, ayroVar, 0), executor);
    }

    private final Pair u(aihk aihkVar, PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar, String str) {
        Pair a = aihkVar.a(playbackStartDescriptor, str, aigdVar, false);
        return Pair.create(anaf.V((anhy) a.first, aifk.b(this.b, aihs.b), TimeUnit.MILLISECONDS, this.d), (anhy) a.second);
    }

    private final void v(aigk aigkVar) {
        this.l = aigkVar;
        String.valueOf(String.valueOf(aigkVar)).length();
    }

    public final PlayerResponseModel a() {
        boolean a = this.l.a(aigk.VIDEO_PLAYBACK_LOADED, aigk.VIDEO_WATCH_LOADED);
        PlayerResponseModel playerResponseModel = this.p;
        if (!a || n(playerResponseModel, "currentPlayerResponse")) {
            return null;
        }
        return playerResponseModel;
    }

    public final void c() {
        PlayerResponseModel a = a();
        WatchNextResponseModel watchNextResponseModel = this.q;
        if (this.l != aigk.VIDEO_WATCH_LOADED || n(watchNextResponseModel, "currentWatchNextResponse")) {
            watchNextResponseModel = null;
        }
        PlaybackStartDescriptor playbackStartDescriptor = this.o;
        this.s.g.c(new ahdv(this.l, a, watchNextResponseModel, playbackStartDescriptor != null ? playbackStartDescriptor.b : null));
    }

    public final void d() {
        if (this.h != null) {
            this.h.b(true);
            this.h = null;
        }
        aigy aigyVar = this.i;
        if (aigyVar != null && !aigyVar.isDone()) {
            this.i.h(true);
        }
        aigy aigyVar2 = this.j;
        if (aigyVar2 != null && !aigyVar2.isDone()) {
            this.j.h(true);
            ConditionVariable conditionVariable = this.k;
            if (conditionVariable != null) {
                conditionVariable.open();
            }
        }
        ykn yknVar = this.g;
        if (yknVar != null) {
            yknVar.d();
            this.g = null;
        }
    }

    public final void e() {
        l(aigk.NEW);
        if (this.p != null) {
            l(aigk.VIDEO_PLAYBACK_LOADED);
            if (this.q != null) {
                l(aigk.VIDEO_WATCH_LOADED);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void f(aihk aihkVar, PlaybackStartDescriptor playbackStartDescriptor, String str, int i, final ykn yknVar) {
        final PlayerResponseModel playerResponseModel;
        try {
            anhy c = aihkVar.c(playbackStartDescriptor, str, i, aigd.a);
            long max = Math.max(aihs.b, TimeUnit.SECONDS.toMillis(aifk.a(this.b)));
            if (max > 0) {
                playerResponseModel = (PlayerResponseModel) c.get(max, TimeUnit.MILLISECONDS);
            } else {
                playerResponseModel = (PlayerResponseModel) c.get(aihs.b, TimeUnit.MILLISECONDS);
            }
            this.e.execute(new Runnable() { // from class: aiib
                @Override // java.lang.Runnable
                public final void run() {
                    ykn.this.b(null, playerResponseModel);
                }
            });
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.e.execute(new Runnable() { // from class: aiic
                @Override // java.lang.Runnable
                public final void run() {
                    ykn.this.a(null, e);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [aiif, aipm] */
    public final void g(PlayerResponseModel playerResponseModel, PlaybackStartDescriptor playbackStartDescriptor, acsx acsxVar) {
        playerResponseModel.getClass();
        WatchNextResponseModel watchNextResponseModel = this.q;
        if (watchNextResponseModel != null && !playerResponseModel.y().equals(watchNextResponseModel.b)) {
            this.q = null;
            aiif aiifVar = this.f;
            if (aiifVar != null) {
                aiifVar.a(null);
            }
        }
        this.p = playerResponseModel;
        if (this.u.v() || this.w.a(playerResponseModel) != 2) {
            if (!this.l.b(aigk.VIDEO_PLAYBACK_LOADED)) {
                l(aigk.VIDEO_PLAYBACK_LOADED);
            }
            ?? r0 = this.f;
            if (r0 != 0) {
                ((aiou) r0).d.a(playerResponseModel, playbackStartDescriptor, r0, acsxVar);
            }
        }
    }

    public final void h(String str, aiiy aiiyVar) {
        PlaybackStartDescriptor playbackStartDescriptor = this.o;
        if (playbackStartDescriptor != null) {
            aiif aiifVar = this.f;
            if (aiifVar != null) {
                ((aiou) aiifVar).b.c();
            }
            i(playbackStartDescriptor, str, aiiyVar, aigd.a);
        }
    }

    public final void i(PlaybackStartDescriptor playbackStartDescriptor, String str, aiiy aiiyVar, aigd aigdVar) {
        j(playbackStartDescriptor, playbackStartDescriptor.w() ? this.r ? 2 : 3 : 0, str, aiiyVar, aigdVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r24.i.h(false) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(final com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor r25, int r26, java.lang.String r27, defpackage.aiiy r28, defpackage.aigd r29) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiih.j(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor, int, java.lang.String, aiiy, aigd):void");
    }

    public final void k() {
        d();
        this.m = null;
        this.p = null;
        this.q = null;
        this.n = null;
        this.o = null;
    }

    public final void l(aigk aigkVar) {
        this.l = aigkVar;
        String.valueOf(String.valueOf(aigkVar)).length();
        c();
    }

    public final boolean n(Object obj, String str) {
        if (obj != null) {
            return false;
        }
        afsi.b(2, 10, String.format("%s was null when it shouldn't be", str));
        aiif aiifVar = this.f;
        if (aiifVar != null) {
            ((aiou) aiifVar).b.d(new aigr(10, true, "There was an error with the video", new IllegalStateException()));
        }
        return true;
    }

    public final void t(String str, aiiy aiiyVar) {
        PlaybackStartDescriptor playbackStartDescriptor;
        PlaybackStartDescriptor playbackStartDescriptor2;
        if (!this.l.a(aigk.VIDEO_WATCH_LOADED) || (playbackStartDescriptor2 = this.n) == null) {
            if ((this.l.a(aigk.VIDEO_PLAYBACK_LOADED) || this.l.a(aigk.VIDEO_PLAYBACK_ERROR)) && (playbackStartDescriptor = this.o) != null) {
                j(playbackStartDescriptor, 1, str, aiiyVar, aigd.a);
                return;
            }
            return;
        }
        j(playbackStartDescriptor2, 1, str, aiiyVar, aigd.a);
    }
}
