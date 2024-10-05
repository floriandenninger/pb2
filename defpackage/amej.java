package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amej extends aom {
    private amhn c;

    public amej(ci ciVar) {
        super(ciVar);
    }

    @Override // defpackage.aom
    public final void e(aod aodVar) {
        String str;
        aom.g("getObserverCount");
        if (this.a.e > 0) {
            amhn amhnVar = this.c;
            aod aodVar2 = aod.ON_CREATE;
            int ordinal = aodVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    str = "Lifecycle.Started";
                } else if (ordinal == 2) {
                    str = "Lifecycle.Resumed";
                } else if (ordinal == 3) {
                    str = "Lifecycle.Paused";
                } else if (ordinal == 4) {
                    str = "Lifecycle.Stopped";
                } else {
                    if (ordinal != 5) {
                        String valueOf = String.valueOf(aodVar);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                        sb.append("Unknown lifecycle: ");
                        sb.append(valueOf);
                        throw new UnsupportedOperationException(sb.toString());
                    }
                    str = "Lifecycle.Destroyed";
                }
                amhnVar.n(str);
            } else if (amhnVar.d == null) {
                amhnVar.n("Lifecycle.Created");
                amhnVar.c = true;
            }
            try {
                super.e(aodVar);
                return;
            } finally {
                this.c.l(aodVar);
            }
        }
        super.e(aodVar);
    }

    public final void h(amhn amhnVar) {
        amkq.O(this.c == null, "Activity was already created");
        this.c = amhnVar;
    }
}
