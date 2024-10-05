package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class azwj extends azsl implements azsr {
    public static final azsm c = new azsm(azsr.a, azwi.a);

    public azwj() {
        super(azsr.a);
    }

    @Override // defpackage.azsr
    public final azsq a(azsq azsqVar) {
        return new azzm(this, azsqVar);
    }

    @Override // defpackage.azsr
    public final void b(azsq azsqVar) {
        azzm azzmVar = (azzm) azsqVar;
        do {
        } while (azzmVar.e.a == azzn.b);
        Object obj = azzmVar.e.a;
        azvt azvtVar = obj instanceof azvt ? (azvt) obj : null;
        if (azvtVar == null) {
            return;
        }
        azvtVar.h();
    }

    public boolean d(azsv azsvVar) {
        azsvVar.getClass();
        return true;
    }

    @Override // defpackage.azsl, defpackage.azss, defpackage.azsv
    public final azss get(azst azstVar) {
        azstVar.getClass();
        if (azstVar instanceof azsm) {
            azsm azsmVar = (azsm) azstVar;
            if (!azsmVar.b(getKey())) {
                return null;
            }
            azss a = azsmVar.a(this);
            if (a instanceof azss) {
                return a;
            }
        } else if (azsr.a == azstVar) {
            return this;
        }
        return null;
    }

    @Override // defpackage.azsl, defpackage.azsv
    public final azsv minusKey(azst azstVar) {
        azstVar.getClass();
        if (azstVar instanceof azsm) {
            azsm azsmVar = (azsm) azstVar;
            if (azsmVar.b(getKey()) && azsmVar.a(this) != null) {
                return azsw.a;
            }
        } else if (azsr.a == azstVar) {
            return azsw.a;
        }
        return this;
    }

    public abstract void so(azsv azsvVar, Runnable runnable);

    public String toString() {
        return azth.g(this) + '@' + azth.h(this);
    }
}
