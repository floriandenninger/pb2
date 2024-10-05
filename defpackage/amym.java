package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum amym {
    GENERAL(true),
    BOOLEAN(false),
    CHARACTER(false),
    INTEGRAL(false),
    FLOAT(true);

    public final boolean f;

    amym(boolean z) {
        this.f = z;
    }
}
