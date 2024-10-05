package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum apab implements aonq {
    CONTROL_FLOW_MANAGER_LAYER_UNSPECIFIED(0),
    CONTROL_FLOW_MANAGER_LAYER_CORE(1),
    CONTROL_FLOW_MANAGER_LAYER_ADAPTER(2),
    CONTROL_FLOW_MANAGER_LAYER_SURFACE(3),
    CONTROL_FLOW_MANAGER_LAYER_EXTERNAL(4);

    public final int f;

    apab(int i) {
        this.f = i;
    }

    public static aons a() {
        return aouo.r;
    }

    public static apab b(int i) {
        if (i == 0) {
            return CONTROL_FLOW_MANAGER_LAYER_UNSPECIFIED;
        }
        if (i == 1) {
            return CONTROL_FLOW_MANAGER_LAYER_CORE;
        }
        if (i == 2) {
            return CONTROL_FLOW_MANAGER_LAYER_ADAPTER;
        }
        if (i == 3) {
            return CONTROL_FLOW_MANAGER_LAYER_SURFACE;
        }
        if (i != 4) {
            return null;
        }
        return CONTROL_FLOW_MANAGER_LAYER_EXTERNAL;
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
