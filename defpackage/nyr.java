package defpackage;

import com.google.android.apps.youtube.app.watch.navigation.WatchHistoryPreviousNextController;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nyr implements aivx, aivw {
    public final aphh a;
    final /* synthetic */ WatchHistoryPreviousNextController b;

    public nyr(WatchHistoryPreviousNextController watchHistoryPreviousNextController, aphh aphhVar) {
        this.b = watchHistoryPreviousNextController;
        this.a = aphhVar;
    }

    private final void e(aims aimsVar, Runnable runnable) {
        if (!this.a.d || !this.b.b.j()) {
            if (this.a.e && this.b.b.k()) {
                nyn nynVar = this.b.b;
                nynVar.d();
                PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor) nynVar.b.next();
                for (kcy kcyVar : nynVar.a) {
                    kcyVar.a.aJ(playbackStartDescriptor, kcyVar.a.aE.c(5));
                }
                return;
            }
            WatchHistoryPreviousNextController watchHistoryPreviousNextController = this.b;
            if (!watchHistoryPreviousNextController.e) {
                if (((ainl) watchHistoryPreviousNextController.d.get()).j(aimsVar)) {
                    if (runnable != null) {
                        runnable.run();
                    }
                    ((ainl) this.b.d.get()).a(aimsVar);
                    return;
                }
                return;
            }
            aphh aphhVar = this.a;
            if ((aphhVar.b & 1) != 0) {
                aahd aahdVar = watchHistoryPreviousNextController.a;
                apxf apxfVar = aphhVar.c;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, null);
                return;
            }
            return;
        }
        nyn nynVar2 = this.b.b;
        nynVar2.d();
        PlaybackStartDescriptor playbackStartDescriptor2 = (PlaybackStartDescriptor) nynVar2.b.previous();
        for (kcy kcyVar2 : nynVar2.a) {
            kcyVar2.a.an.m();
            kcyVar2.a.aJ(playbackStartDescriptor2, kcyVar2.a.aE.c(6));
        }
    }

    @Override // defpackage.aivw
    public final void a() {
        e(aims.a, new Runnable() { // from class: nyq
            @Override // java.lang.Runnable
            public final void run() {
                nyr nyrVar = nyr.this;
                if ((nyrVar.a.b & 1) != 0) {
                    nyn nynVar = nyrVar.b.b;
                    aifz d = PlaybackStartDescriptor.d();
                    apxf apxfVar = nyrVar.a.c;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    d.a = apxfVar;
                    nynVar.f(d.a(), false);
                }
            }
        });
    }

    @Override // defpackage.aivx
    public final void b() {
        e(aims.b, null);
    }

    @Override // defpackage.aivw
    public final boolean c() {
        return f(aims.a);
    }

    @Override // defpackage.aivx
    public final boolean d() {
        return f(aims.b);
    }

    private final boolean f(aims aimsVar) {
        WatchHistoryPreviousNextController watchHistoryPreviousNextController = this.b;
        if (watchHistoryPreviousNextController.e) {
            if ((this.a.b & 1) != 0) {
                return true;
            }
        } else if (((ainl) watchHistoryPreviousNextController.d.get()).j(aimsVar)) {
            return true;
        }
        aphh aphhVar = this.a;
        if (aphhVar.d) {
            return this.b.b.j();
        }
        if (aphhVar.e) {
            return this.b.b.k();
        }
        return false;
    }
}
