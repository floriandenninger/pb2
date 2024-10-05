package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aqjm implements aonq {
    DELAYED_EVENT_TIER_UNSPECIFIED(0),
    DELAYED_EVENT_TIER_DEFAULT(100),
    DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY(200),
    DELAYED_EVENT_TIER_FAST(300),
    DELAYED_EVENT_TIER_IMMEDIATE(400);

    public final int f;

    aqjm(int i) {
        this.f = i;
    }

    public static aons a() {
        return apyu.s;
    }

    public static aqjm b(int i) {
        if (i == 0) {
            return DELAYED_EVENT_TIER_UNSPECIFIED;
        }
        if (i == 100) {
            return DELAYED_EVENT_TIER_DEFAULT;
        }
        if (i == 200) {
            return DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY;
        }
        if (i == 300) {
            return DELAYED_EVENT_TIER_FAST;
        }
        if (i != 400) {
            return null;
        }
        return DELAYED_EVENT_TIER_IMMEDIATE;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
