package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ammn implements amml {
    public static final ammn a;
    private static final /* synthetic */ ammn[] b;

    static {
        ammn ammnVar = new ammn();
        a = ammnVar;
        b = new ammn[]{ammnVar};
    }

    private ammn() {
    }

    public static ammn[] values() {
        return (ammn[]) b.clone();
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        return obj;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Functions.identity()";
    }
}
