package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aghu {
    DISABLED,
    DUAL_WRITE_READ_FROM_OLD_DB,
    DUAL_WRITE_READ_FROM_ENTITY_STORE,
    MIGRATED;

    public final boolean a() {
        return this == MIGRATED || this == DUAL_WRITE_READ_FROM_ENTITY_STORE;
    }

    public final boolean b() {
        return this == DISABLED || this == DUAL_WRITE_READ_FROM_OLD_DB || this == DUAL_WRITE_READ_FROM_ENTITY_STORE;
    }
}
