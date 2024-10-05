package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aoe {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean a(aoe aoeVar) {
        return compareTo(aoeVar) >= 0;
    }
}
