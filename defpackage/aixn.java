package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aixn {
    public long a;
    final /* synthetic */ aixo b;
    public final int c;

    public aixn(aixo aixoVar, int i, long j) {
        this.b = aixoVar;
        this.c = i;
        this.a = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.b.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        return this.b.p;
    }

    public final String toString() {
        String str = this.c != 1 ? "EXIT" : "ENTER";
        long j = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 21);
        sb.append(str);
        sb.append("@");
        sb.append(j);
        return sb.toString();
    }
}
