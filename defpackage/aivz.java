package defpackage;

import defpackage.aivy;
import defpackage.aok;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aivz {
    private final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public final azrs a = azrh.aN(false).aT();

    public final synchronized void a(aivy aivyVar) {
        if (this.b.remove(aivyVar)) {
            aivyVar.b.c(aivyVar.a);
            if (this.b.isEmpty()) {
                this.a.c(false);
            }
        }
    }

    public final synchronized aivy b(aof aofVar) {
        final aivy aivyVar;
        aivyVar = new aivy(this, aofVar);
        aivyVar.a = new any() { // from class: com.google.android.libraries.youtube.player.ui.locks.PausePlaybackLockControllerImpl$PausePlaybackLockImpl$1
            @Override // defpackage.aoa
            public final /* synthetic */ void lc(aok aokVar) {
            }

            @Override // defpackage.any, defpackage.aoa
            public final /* synthetic */ void lg(aok aokVar) {
            }

            @Override // defpackage.any, defpackage.aoa
            public final void lh(aok aokVar) {
                aivy.this.a();
            }

            @Override // defpackage.any, defpackage.aoa
            public final /* synthetic */ void nu(aok aokVar) {
            }

            @Override // defpackage.aoa
            public final /* synthetic */ void nv(aok aokVar) {
            }

            @Override // defpackage.any, defpackage.aoa
            public final /* synthetic */ void ot(aok aokVar) {
            }
        };
        this.b.add(aivyVar);
        this.a.c(true);
        aofVar.b(aivyVar.a);
        return aivyVar;
    }
}
