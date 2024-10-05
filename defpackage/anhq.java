package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class anhq {
    public static final anhq a;
    public static final Set b;
    private static final /* synthetic */ anhq[] c;

    static {
        anhq anhqVar = new anhq();
        a = anhqVar;
        c = new anhq[]{anhqVar};
        b = new CopyOnWriteArraySet();
    }

    private anhq() {
    }

    public static anhq[] values() {
        return (anhq[]) c.clone();
    }
}
