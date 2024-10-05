package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aeqn {
    public final String a;
    public final int b;
    public final long c;
    public final long d;
    public final String e;

    public aeqn(String str, int i, long j, long j2, String str2) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = str2;
    }

    public abstract long a();

    public boolean b(aeqn aeqnVar) {
        return c(aeqnVar) && aeqnVar.b <= this.b;
    }

    public final boolean c(aeqn aeqnVar) {
        String str = this.a;
        return str != null && str.equals(aeqnVar.a);
    }
}
