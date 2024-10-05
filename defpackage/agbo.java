package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agbo implements ykl {
    final /* synthetic */ amrw a;
    final /* synthetic */ agbp b;
    final /* synthetic */ CountDownLatch c;
    final /* synthetic */ ajjz d;
    final /* synthetic */ Uri e;
    final /* synthetic */ ykl f;

    public agbo(amrw amrwVar, agbp agbpVar, CountDownLatch countDownLatch, ajjz ajjzVar, Uri uri, ykl yklVar) {
        this.a = amrwVar;
        this.b = agbpVar;
        this.c = countDownLatch;
        this.d = ajjzVar;
        this.e = uri;
        this.f = yklVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.d.l(this.e, this.f);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap != null) {
            this.a.g(this.b, bitmap);
            this.c.countDown();
        } else {
            this.d.l(this.e, this.f);
        }
    }
}
