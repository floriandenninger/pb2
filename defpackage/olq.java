package defpackage;

import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class olq implements oll {
    static final amrz b = amrz.m(auxs.STARTUP_SIGNAL_BROWSE_FEED_LOADED, e(asoj.STARTUP_SIGNAL_TYPE_BROWSE_FEED_LOADED, asoi.STARTUP_SIGNAL_ERROR_BROWSE_FEED_TIMEOUT), auxs.STARTUP_SIGNAL_FIRST_THUMBNAIL_LOADED, e(asoj.STARTUP_SIGNAL_TYPE_FIRST_THUMBNAIL_LOADED, asoi.STARTUP_SIGNAL_ERROR_FIRST_THUMBNAIL_TIMEOUT), auxs.STARTUP_SIGNAL_ACTIVITY_ONRESUME_LOADED, e(asoj.STARTUP_SIGNAL_TYPE_AFTER_ONRESUME_LOADED, asoi.STARTUP_SIGNAL_ERROR_AFTER_ONRESUME_TIMEOUT));
    private final acpl c;

    public olq(acpl acplVar) {
        this.c = acplVar;
    }

    static olp e(asoj asojVar, asoi asoiVar) {
        asoi asoiVar2;
        olo oloVar = new olo();
        if (asojVar == null) {
            throw new NullPointerException("Null signalLogType");
        }
        oloVar.a = asojVar;
        if (asoiVar != null) {
            oloVar.b = asoiVar;
            asoj asojVar2 = oloVar.a;
            if (asojVar2 == null || (asoiVar2 = oloVar.b) == null) {
                StringBuilder sb = new StringBuilder();
                if (oloVar.a == null) {
                    sb.append(" signalLogType");
                }
                if (oloVar.b == null) {
                    sb.append(" signalLogErrorType");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            return new olp(asojVar2, asoiVar2);
        }
        throw new NullPointerException("Null signalLogErrorType");
    }

    @Override // defpackage.oll
    public final aypl a(final auxs auxsVar) {
        return new aypl() { // from class: olm
            @Override // defpackage.aypl
            public final aypk a(ayph ayphVar) {
                final olq olqVar = olq.this;
                final auxs auxsVar2 = auxsVar;
                return ayphVar.q(new ayrs() { // from class: oln
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        olq olqVar2 = olq.this;
                        auxs auxsVar3 = auxsVar2;
                        if (((Throwable) obj) instanceof TimeoutException) {
                            olp olpVar = (olp) olq.b.get(auxsVar3);
                            if (olpVar == null) {
                                throw new IllegalStateException("Unresolved startup signal error");
                            }
                            olqVar2.f(null, olpVar.b);
                        }
                    }
                });
            }
        };
    }

    @Override // defpackage.oll
    public final void b() {
        f(asoj.STARTUP_SIGNAL_TYPE_SIGNAL_STREAM_CREATED, null);
    }

    @Override // defpackage.oll
    public final void c(auxs auxsVar) {
        olp olpVar = (olp) b.get(auxsVar);
        if (olpVar == null) {
            throw new IllegalStateException("Unresolved startup signal type");
        }
        f(olpVar.a, null);
    }

    @Override // defpackage.oll
    public final void d() {
        f(asoj.STARTUP_SIGNAL_TYPE_SIGNAL_STREAM_STOPPED, null);
    }

    public final void f(asoj asojVar, asoi asoiVar) {
        asog a = asoh.a();
        if (asojVar != null) {
            a.copyOnWrite();
            ((asoh) a.instance).f(asojVar);
        }
        if (asoiVar != null) {
            a.copyOnWrite();
            ((asoh) a.instance).e(asoiVar);
        }
        acpl acplVar = this.c;
        arpn a2 = arpp.a();
        asoh asohVar = (asoh) a.build();
        a2.copyOnWrite();
        ((arpp) a2.instance).dI(asohVar);
        acplVar.c((arpp) a2.build());
    }
}
