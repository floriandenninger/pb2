package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahqk implements ahqe {
    private static final amrz b = amrz.n(aigk.NEW, ahqo.NEW, aigk.VIDEO_LOADING, ahqo.LOGGED_NEW_SCREEN, aigk.VIDEO_PLAYBACK_LOADED, ahqo.LOGGED_ATTACH_PLAYER, aigk.VIDEO_WATCH_LOADED, ahqo.LOGGED_ATTACH_WATCH_NEXT);
    public final ahpe a;
    private ahqi c;

    public ahqk(ahpe ahpeVar) {
        this.a = ahpeVar;
    }

    @Override // defpackage.ahqe
    public final ahqs a(ahdv ahdvVar) {
        ahqi a;
        ahqo ahqoVar = (ahqo) b.get(ahdvVar.c());
        if (ahqoVar != null) {
            apxf d = ahdvVar.d();
            ahqi ahqiVar = this.c;
            if (ahqiVar == null || !amkq.b(ahqiVar.c(), d) || ahqoVar == ahqo.NEW) {
                ahqi ahqiVar2 = this.c;
                if (ahqiVar2 == null) {
                    a = new ahqj(this, d, false);
                } else {
                    a = ahqiVar2.a(d);
                }
            } else {
                a = (this.c.b().a(ahqoVar) && (ahqoVar == ahqo.LOGGED_ATTACH_PLAYER || ahqoVar == ahqo.LOGGED_ATTACH_WATCH_NEXT)) ? new ahqh(this, d) : this.c;
            }
            if (a.b() == ahqo.NEW) {
                a.e();
            }
            if (ahqoVar.a(a.b())) {
                while (ahqoVar != a.b()) {
                    Optional d2 = a.d(ahdvVar);
                    if (!d2.isPresent()) {
                        break;
                    }
                    a = (ahqi) d2.get();
                    a.e();
                }
                this.c = a;
            }
        }
        return ahqs.a;
    }

    @Override // defpackage.ahqe
    public final void b() {
        this.a.k(null);
    }
}
