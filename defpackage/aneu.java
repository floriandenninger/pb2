package defpackage;

import j$.time.Instant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aneu implements anev {
    public static final aneu a;
    private static final /* synthetic */ aneu[] b;

    static {
        aneu aneuVar = new aneu();
        a = aneuVar;
        b = new aneu[]{aneuVar};
    }

    private aneu() {
    }

    public static aneu[] values() {
        return (aneu[]) b.clone();
    }

    @Override // defpackage.anev
    public final Instant a() {
        return Instant.now();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "TimeSource.system()";
    }
}
