package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayso implements Callable {
    public static final ayso a;
    private static final /* synthetic */ ayso[] b;

    static {
        ayso aysoVar = new ayso();
        a = aysoVar;
        b = new ayso[]{aysoVar};
    }

    private ayso() {
    }

    public static ayso[] values() {
        return (ayso[]) b.clone();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Set call() {
        return new HashSet();
    }
}
