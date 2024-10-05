package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum dbt {
    RUNNING(false),
    PAUSED(false),
    CLEARED(false),
    SUCCESS(true),
    FAILED(true);

    public final boolean f;

    dbt(boolean z) {
        this.f = z;
    }
}
