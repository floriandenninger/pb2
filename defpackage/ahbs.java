package defpackage;

import android.app.Service;
import com.google.android.libraries.youtube.player.background.service.BackgroundPlayerService;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ahbs extends Service implements axql {
    private volatile axqc a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.axql
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final axqc lL() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new axqc(this);
                }
            }
        }
        return this.a;
    }

    public final void b() {
        if (this.c) {
            return;
        }
        this.c = true;
        BackgroundPlayerService backgroundPlayerService = (BackgroundPlayerService) this;
        ehx ehxVar = (ehx) lM();
        backgroundPlayerService.a = (ainy) ehxVar.a.fX.get();
        backgroundPlayerService.b = (aikd) ehxVar.a.uM.get();
        backgroundPlayerService.c = (aifs) ehxVar.a.gw.get();
        backgroundPlayerService.d = (banw) ehxVar.a.vi.get();
        backgroundPlayerService.e = (banw) ehxVar.a.vj.get();
        backgroundPlayerService.f = (aioe) ehxVar.a.a.dk.get();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // android.app.Service
    public void onCreate() {
        b();
        super.onCreate();
    }
}
