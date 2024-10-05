package defpackage;

import com.google.android.libraries.youtube.mdx.mediaroute.service.RemotePlaybackControlsService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfk implements aioa {
    final /* synthetic */ RemotePlaybackControlsService a;

    public adfk(RemotePlaybackControlsService remotePlaybackControlsService) {
        this.a = remotePlaybackControlsService;
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 0;
        return new ayqx[]{aiocVar.G().a.X(new ayrs(this) { // from class: adfj
            public final /* synthetic */ adfk a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    adfk adfkVar = this.a;
                    ahej ahejVar = (ahej) obj;
                    if (((adlt) adfkVar.a.j.get()).g() == null) {
                        return;
                    }
                    int a = ahejVar.a();
                    if (a == 2 || a == 3 || a == 5 || a == 6 || a == 7 || a == 8) {
                        adfkVar.a.b();
                        return;
                    }
                    return;
                }
                adfk adfkVar2 = this.a;
                ahef ahefVar = (ahef) obj;
                if (((adlt) adfkVar2.a.j.get()).g() == null) {
                    adfkVar2.a.l = false;
                    return;
                }
                if (!ahefVar.c().h()) {
                    adfkVar2.a.l = false;
                }
                adfkVar2.a.b();
            }
        }), aiocVar.G().i.X(new ayrs(this) { // from class: adfj
            public final /* synthetic */ adfk a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    adfk adfkVar = this.a;
                    ahej ahejVar = (ahej) obj;
                    if (((adlt) adfkVar.a.j.get()).g() == null) {
                        return;
                    }
                    int a = ahejVar.a();
                    if (a == 2 || a == 3 || a == 5 || a == 6 || a == 7 || a == 8) {
                        adfkVar.a.b();
                        return;
                    }
                    return;
                }
                adfk adfkVar2 = this.a;
                ahef ahefVar = (ahef) obj;
                if (((adlt) adfkVar2.a.j.get()).g() == null) {
                    adfkVar2.a.l = false;
                    return;
                }
                if (!ahefVar.c().h()) {
                    adfkVar2.a.l = false;
                }
                adfkVar2.a.b();
            }
        })};
    }
}
