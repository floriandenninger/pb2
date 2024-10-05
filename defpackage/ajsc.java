package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajsc implements ykl {
    final /* synthetic */ ajrx a;
    final /* synthetic */ ajsd b;
    final /* synthetic */ ajsf c;

    public ajsc(ajsd ajsdVar, ajsf ajsfVar, ajrx ajrxVar) {
        this.b = ajsdVar;
        this.c = ajsfVar;
        this.a = ajrxVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        this.b.a.put((Uri) obj, new WeakReference(bitmap));
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.c.d(this.a, bitmap);
        } else {
            this.b.b.execute(new ajsb(this, bitmap));
        }
    }
}
