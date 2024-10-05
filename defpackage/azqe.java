package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azqe implements Callable, ayrv {
    public static final azqe a;
    private static final /* synthetic */ azqe[] b;

    static {
        azqe azqeVar = new azqe();
        a = azqeVar;
        b = new azqe[]{azqeVar};
    }

    private azqe() {
    }

    public static azqe[] values() {
        return (azqe[]) b.clone();
    }

    @Override // defpackage.ayrv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List call() {
        return new ArrayList();
    }
}
