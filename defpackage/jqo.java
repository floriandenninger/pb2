package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jqo implements ykl {
    final /* synthetic */ dy a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ jqp d;

    public jqo(jqp jqpVar, dy dyVar, String str, int i) {
        this.d = jqpVar;
        this.a = dyVar;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        if (this.d.b.b()) {
            this.d.f(this.a.b(), this.b, this.c);
        }
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        this.a.n(fhe.a(this.d.a, (Bitmap) obj2));
        this.d.f(this.a.b(), this.b, this.c);
    }
}
