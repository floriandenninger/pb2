package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aod {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static aod a(aoe aoeVar) {
        aoe aoeVar2 = aoe.DESTROYED;
        int ordinal = aoeVar.ordinal();
        if (ordinal == 2) {
            return ON_DESTROY;
        }
        if (ordinal == 3) {
            return ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return ON_PAUSE;
    }

    public static aod b(aoe aoeVar) {
        aoe aoeVar2 = aoe.DESTROYED;
        int ordinal = aoeVar.ordinal();
        if (ordinal == 1) {
            return ON_CREATE;
        }
        if (ordinal == 2) {
            return ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return ON_RESUME;
    }

    public aoe c() {
        aoe aoeVar = aoe.DESTROYED;
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return aoe.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return aoe.DESTROYED;
                        }
                        throw new IllegalArgumentException(this + " has no target state");
                    }
                }
            }
            return aoe.STARTED;
        }
        return aoe.CREATED;
    }
}
