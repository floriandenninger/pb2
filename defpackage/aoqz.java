package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class aoqz implements Comparator, Serializable {
    public static final aoqz a;
    private static final /* synthetic */ aoqz[] b;

    static {
        aoqz aoqzVar = new aoqz();
        a = aoqzVar;
        b = new aoqz[]{aoqzVar};
    }

    private aoqz() {
    }

    public static aoqz[] values() {
        return (aoqz[]) b.clone();
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compare(aoqa aoqaVar, aoqa aoqaVar2) {
        aora.g(aoqaVar);
        aora.g(aoqaVar2);
        long j = aoqaVar.b;
        long j2 = aoqaVar2.b;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (j != j2) {
            return i;
        }
        int i2 = aoqaVar.c;
        int i3 = aoqaVar2.c;
        if (i2 == i3) {
            return 0;
        }
        return i2 >= i3 ? 1 : -1;
    }
}
