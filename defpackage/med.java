package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class med implements ykl {
    final /* synthetic */ mee a;
    private final /* synthetic */ int b;

    public med(mee meeVar, int i) {
        this.b = i;
        this.a = meeVar;
    }

    @Override // defpackage.ykl
    public final /* synthetic */ void b(Object obj, Object obj2) {
        if (this.b == 0) {
            this.a.b((Bitmap) obj2);
        } else {
            this.a.c((Bitmap) obj2);
        }
    }

    @Override // defpackage.ykl
    public final /* synthetic */ void a(Object obj, Exception exc) {
        if (this.b == 0) {
            zga.d("Error retrieving app thumbnail", exc);
            this.a.b(null);
        } else {
            zga.d("Error retrieving rating image", exc);
            this.a.c(null);
        }
    }
}
