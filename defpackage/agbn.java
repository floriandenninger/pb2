package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agbn implements ykl {
    final /* synthetic */ amrw a;
    final /* synthetic */ agbp b;
    final /* synthetic */ CountDownLatch c;

    public agbn(amrw amrwVar, agbp agbpVar, CountDownLatch countDownLatch) {
        this.a = amrwVar;
        this.b = agbpVar;
        this.c = countDownLatch;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.c.countDown();
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap != null) {
            this.a.g(this.b, bitmap);
        }
        this.c.countDown();
    }
}
