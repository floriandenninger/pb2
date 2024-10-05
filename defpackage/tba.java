package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tba implements dhy {
    private final syd a;

    public tba(syd sydVar) {
        this.a = sydVar;
    }

    @Override // defpackage.dhy
    public final void a(int i, String str, String str2) {
        int i2 = i - 1;
        this.a.b((i2 == 1 || i2 == 2) ? 28 : 12, str2);
    }

    @Override // defpackage.dhy
    public final void b(int i, String str, String str2) {
        a(2, str, str2);
    }
}
