package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alqh implements alqe {
    public static final alqh a;
    private static final AtomicReference b;
    private static final /* synthetic */ alqh[] c;

    static {
        alqh alqhVar = new alqh();
        a = alqhVar;
        c = new alqh[]{alqhVar};
        b = new AtomicReference(null);
    }

    private alqh() {
    }

    public static alqh[] values() {
        return (alqh[]) c.clone();
    }

    @Override // defpackage.alqe
    public final alqf a() {
        return (alqf) b.get();
    }
}
