package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mhg implements gge {
    private final ainy a;
    private final InlinePlaybackLifecycleController b;
    private final aaea c;
    private final Handler d;
    private final ActiveStateLifecycleController e;
    private gof f;
    private Runnable g;

    public mhg(aaea aaeaVar, ainy ainyVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, Handler handler, ActiveStateLifecycleController activeStateLifecycleController) {
        this.c = aaeaVar;
        this.a = ainyVar;
        this.b = inlinePlaybackLifecycleController;
        this.d = handler;
        this.e = activeStateLifecycleController;
    }

    private final boolean c(gof gofVar) {
        gof gofVar2 = this.f;
        return gofVar2 != null && (gofVar2 == gofVar || gofVar2.k(gofVar));
    }

    public final void a(gof gofVar, Map map) {
        if (c(gofVar) && gofVar.j()) {
            aaea aaeaVar = this.c;
            ainy ainyVar = this.a;
            map.put("ALLOW_RELOAD", true);
            map.put("PLAYBACK_START_DESCRIPTOR_MUTATOR", new mhr(ainyVar, aaeaVar));
        }
    }

    public final boolean b(gof gofVar, final aahd aahdVar, final acra acraVar, Map map, ajog ajogVar) {
        boolean z;
        if (c(gofVar)) {
            final HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            ajogVar.oh(hashMap);
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", acraVar);
            final apxf c = gofVar.c();
            this.g = new Runnable() { // from class: mhf
                @Override // java.lang.Runnable
                public final void run() {
                    acra acraVar2 = acra.this;
                    apxf apxfVar = c;
                    aahdVar.c(acraVar2.h(apxfVar), hashMap);
                }
            };
            z = true;
        } else {
            z = false;
        }
        this.b.p();
        ActiveStateLifecycleController activeStateLifecycleController = this.e;
        ayqx ayqxVar = activeStateLifecycleController.e;
        if (ayqxVar != null && !ayqxVar.e()) {
            ayrz.c((AtomicReference) activeStateLifecycleController.e);
        }
        activeStateLifecycleController.e = activeStateLifecycleController.g(get.INACTIVE).Q();
        return z;
    }

    @Override // defpackage.gge
    public final void m(gfq gfqVar, int i, int i2) {
        if (i2 == 1) {
            this.f = null;
            return;
        }
        if (i2 == 2) {
            this.f = gfqVar.b;
            return;
        }
        if (i2 == 0) {
            Runnable runnable = this.g;
            if (runnable != null) {
                this.d.post(runnable);
                this.g = null;
            }
            this.f = null;
        }
    }
}
