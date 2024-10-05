package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aapb {
    RECTANGULAR_2D,
    SPHERICAL,
    SPHERICAL_3D,
    RECTANGULAR_3D,
    NOOP,
    MESH;

    public final boolean a() {
        return this == SPHERICAL || this == SPHERICAL_3D || this == MESH;
    }
}
