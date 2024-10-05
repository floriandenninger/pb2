package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahqc implements ahqe {
    private static final amrz c = amrz.n(aigk.NEW, ahqo.NEW, aigk.VIDEO_LOADING, ahqo.LOGGED_NEW_SCREEN, aigk.VIDEO_PLAYBACK_LOADED, ahqo.LOGGED_ATTACH_PLAYER, aigk.VIDEO_WATCH_LOADED, ahqo.LOGGED_ATTACH_WATCH_NEXT);
    public final ahpe a;
    public ahpx b;

    public ahqc(ahpe ahpeVar) {
        this.a = ahpeVar;
    }

    @Override // defpackage.ahqe
    public final ahqs a(ahdv ahdvVar) {
        ahpy a;
        Optional of;
        ahqo ahqoVar = (ahqo) c.get(ahdvVar.c());
        if (ahqoVar == null) {
            ahpx ahpxVar = this.b;
            return ahpxVar == null ? ahqs.a : ahpxVar.c();
        }
        apxf d = ahdvVar.d();
        ahpx ahpxVar2 = this.b;
        if (ahpxVar2 == null || !amkq.b(ahpxVar2.d(), d) || ahqoVar == ahqo.NEW) {
            ahpx ahpxVar3 = this.b;
            if (ahpxVar3 == null) {
                a = new ahpy(null, null, d);
            } else {
                a = ahpxVar3.a(d);
            }
            of = Optional.of(a);
        } else if (!this.b.b().a(ahqoVar) || (ahqoVar != ahqo.LOGGED_ATTACH_PLAYER && ahqoVar != ahqo.LOGGED_ATTACH_WATCH_NEXT)) {
            of = this.b.e(ahdvVar);
        } else {
            of = Optional.of(new ahps((acsl) this.b.c().a().orElse(null), ahdvVar.b(), d));
        }
        if (of.isPresent()) {
            ahpw ahpwVar = (ahpw) of.get();
            if (ahqoVar.a(ahpwVar.b())) {
                ahpx a2 = ahpwVar.a(this.a);
                while (ahqoVar != a2.b()) {
                    Optional e = a2.e(ahdvVar);
                    if (!e.isPresent()) {
                        break;
                    }
                    a2 = ((ahpw) e.get()).a(this.a);
                }
                this.b = a2;
            }
        }
        ahpx ahpxVar4 = this.b;
        return ahpxVar4 == null ? ahqs.a : ahpxVar4.c();
    }

    @Override // defpackage.ahqe
    public final void b() {
        ahpx ahpxVar = this.b;
        if (ahpxVar != null) {
            ahpxVar.c().a().ifPresent(new Consumer() { // from class: ahpr
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    ahqc ahqcVar = ahqc.this;
                    ahqcVar.a.l((acsl) obj, ahqcVar.b.d(), null);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            });
        }
    }
}
