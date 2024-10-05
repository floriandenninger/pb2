package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum agno {
    OFFLINE_IMMEDIATELY(0),
    DEFER_FOR_DISCOUNTED_DATA(1),
    OFFLINE_SHARING(2),
    SIDELOAD(3),
    AUTO_OFFLINE(4);

    static final amrz f;
    public final int g;

    static {
        amrw h2 = amrz.h();
        for (agno agnoVar : values()) {
            h2.g(Integer.valueOf(agnoVar.g), agnoVar);
        }
        f = h2.c();
    }

    agno(int i) {
        this.g = i;
    }

    public static agno a(int i) {
        agno agnoVar = (agno) f.get(Integer.valueOf(i));
        return agnoVar != null ? agnoVar : OFFLINE_IMMEDIATELY;
    }

    public final int b() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return 2;
        }
        if (ordinal == 1) {
            return 3;
        }
        if (ordinal == 2) {
            return 4;
        }
        if (ordinal != 3) {
            return ordinal != 4 ? 1 : 6;
        }
        return 5;
    }
}
