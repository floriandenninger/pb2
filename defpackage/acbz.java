package defpackage;

import android.app.Service;
import android.content.SharedPreferences;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class acbz extends Service implements axql {
    private volatile axqc a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.axql
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
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

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            ScreencastHostService screencastHostService = (ScreencastHostService) this;
            ehx ehxVar = (ehx) lM();
            screencastHostService.a = (ypa) ehxVar.a.B.get();
            screencastHostService.b = ehxVar.a.cO();
            efz efzVar = ehxVar.a;
            azrw azrwVar = efzVar.by;
            azrw azrwVar2 = efzVar.au;
            azrw azrwVar3 = efzVar.f;
            azrw azrwVar4 = efzVar.lO;
            azrw b = axqv.b(ehxVar.y);
            efz efzVar2 = ehxVar.a;
            screencastHostService.q = new aeqh(azrwVar, azrwVar2, azrwVar3, azrwVar4, b, efzVar2.lE, efzVar2.kp, efzVar2.z, (byte[]) null);
            efz efzVar3 = ehxVar.a;
            azrw azrwVar5 = efzVar3.by;
            azrw azrwVar6 = efzVar3.an;
            azrw azrwVar7 = ehxVar.z;
            azrw azrwVar8 = ehxVar.A;
            screencastHostService.c = new abwz(azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar8, azrwVar8, efzVar3.a.db, ehxVar.B, ehxVar.C, efzVar3.g, ehxVar.E, ehxVar.F, ehxVar.G, ehxVar.D, efzVar3.yF);
            screencastHostService.d = (absq) ehxVar.E.get();
            screencastHostService.e = (abrn) ehxVar.D.get();
            screencastHostService.f = (Executor) ehxVar.a.f.get();
            screencastHostService.g = (Executor) ehxVar.a.i.get();
            screencastHostService.h = axqq.a(ehxVar.f213J);
            screencastHostService.r = ehxVar.a.a.am();
            screencastHostService.i = (SharedPreferences) ehxVar.a.z.get();
            screencastHostService.j = (aksl) ehxVar.a.ha.get();
        }
        super.onCreate();
    }
}
