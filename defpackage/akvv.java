package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akvv implements akvu {
    public static final akvv a;
    static final SparseArray b;
    private static final /* synthetic */ akvv[] d;
    public final int c = 1;

    static {
        akvv akvvVar = new akvv();
        a = akvvVar;
        d = new akvv[]{akvvVar};
        b = new SparseArray();
        for (akvv akvvVar2 : values()) {
            b.put(akvvVar2.c, akvvVar2);
        }
    }

    private akvv() {
    }

    public static akvv[] values() {
        return (akvv[]) d.clone();
    }

    @Override // defpackage.akvu
    public final /* bridge */ /* synthetic */ akvu a(int i) {
        return (akvv) b.get(i);
    }

    @Override // defpackage.akvu
    public final String b() {
        return "api";
    }
}
