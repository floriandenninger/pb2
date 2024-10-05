package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aite implements Comparable {
    public final int a;

    public aite(int i) {
        this.a = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((aite) obj).a;
    }
}
