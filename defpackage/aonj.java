package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aonj implements Comparable {
    final aonr a;
    public final int b;
    public final aoqn c;
    public final boolean d;
    public final boolean e;

    public aonj(aonr aonrVar, int i, aoqn aoqnVar, boolean z, boolean z2) {
        this.a = aonrVar;
        this.b = i;
        this.c = aoqnVar;
        this.d = z;
        this.e = z2;
    }

    public final aoqo a() {
        return this.c.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b - ((aonj) obj).b;
    }
}
