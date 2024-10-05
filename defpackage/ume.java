package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ume implements anhh {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ umg d;
    private final String e;
    private final String f;

    public ume(umg umgVar, int i, boolean z, long j, byte[] bArr) {
        this.d = umgVar;
        this.c = i;
        this.a = z;
        this.b = j;
        this.e = uou.y(umgVar.c);
        String str = i != 32 ? i != 48 ? i != 64 ? i != 120 ? "null" : "LARGE" : "MEDIUM" : "SMALL" : "TINY";
        if (i == 0) {
            throw null;
        }
        this.f = str;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = ((Bitmap) obj) != null ? "OK" : "NULL";
        umg umgVar = this.d;
        umgVar.a.b(this.e, this.f, str, umgVar.b, this.a);
        this.d.a.d(System.currentTimeMillis() - this.b, this.e, this.f, str, this.d.b, this.a);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        String U = tyo.U(th);
        umg umgVar = this.d;
        umgVar.a.b(this.e, this.f, U, umgVar.b, this.a);
        this.d.a.d(System.currentTimeMillis() - this.b, this.e, this.f, U, this.d.b, this.a);
    }
}
