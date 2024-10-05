package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pgn {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;

    public pgn(byte[] bArr) {
        pgw pgwVar = new pgw(bArr);
        pgwVar.d(136);
        this.a = pgwVar.a(16);
        this.b = pgwVar.a(16);
        pgwVar.a(24);
        pgwVar.a(24);
        this.c = pgwVar.a(20);
        this.d = pgwVar.a(3) + 1;
        this.e = pgwVar.a(5) + 1;
        this.f = pgwVar.a(36);
    }
}
