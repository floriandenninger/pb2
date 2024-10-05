package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akvz implements akvu {
    public static final akvz a;
    static final SparseArray b;
    private static final /* synthetic */ akvz[] d;
    public final int c = 3;

    static {
        akvz akvzVar = new akvz();
        a = akvzVar;
        d = new akvz[]{akvzVar};
        b = new SparseArray();
        for (akvz akvzVar2 : values()) {
            b.put(akvzVar2.c, akvzVar2);
        }
    }

    private akvz() {
    }

    public static akvz[] values() {
        return (akvz[]) d.clone();
    }

    @Override // defpackage.akvu
    public final /* bridge */ /* synthetic */ akvu a(int i) {
        return (akvz) b.get(i);
    }

    @Override // defpackage.akvu
    public final String b() {
        return "v";
    }
}
