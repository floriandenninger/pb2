package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qjs implements qjl {
    final /* synthetic */ qju a;
    private final /* synthetic */ int b;

    public qjs(qju qjuVar, int i) {
        this.b = i;
        this.a = qjuVar;
    }

    @Override // defpackage.qjl
    public final void a(Bitmap bitmap) {
        if (this.b == 0) {
            this.a.h(bitmap, 3);
        } else {
            this.a.h(qju.g(bitmap), 0);
        }
    }
}
