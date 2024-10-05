package defpackage;

import android.app.Service;
import com.google.android.libraries.youtube.mdx.mediaroute.service.RemotePlaybackControlsService;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adff extends Service implements axql {
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

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            RemotePlaybackControlsService remotePlaybackControlsService = (RemotePlaybackControlsService) this;
            ehx ehxVar = (ehx) lM();
            remotePlaybackControlsService.a = (ypa) ehxVar.a.B.get();
            remotePlaybackControlsService.c = (aioc) ehxVar.a.fY.get();
            remotePlaybackControlsService.d = (aiki) ehxVar.a.a.dd.get();
            remotePlaybackControlsService.e = (aiki) ehxVar.a.a.dh.get();
            remotePlaybackControlsService.f = (aikk) ehxVar.a.uP.get();
            remotePlaybackControlsService.m = (adfg) ehxVar.a.a.di.get();
            remotePlaybackControlsService.g = (adfg) ehxVar.a.a.dj.get();
            remotePlaybackControlsService.h = (aikd) ehxVar.a.uM.get();
            efz efzVar = ehxVar.a;
            remotePlaybackControlsService.i = efzVar.jD;
            remotePlaybackControlsService.j = efzVar.ja;
            remotePlaybackControlsService.k = (acxi) efzVar.bg.get();
            remotePlaybackControlsService.n = (ajbh) ehxVar.a.uK.get();
        }
        super.onCreate();
    }
}
