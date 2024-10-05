package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kzf implements ykl {
    public final List a = new ArrayList();
    private AsyncTask b;

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zbb) it.next()).a(kzg.d);
        }
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        final Bitmap bitmap = (Bitmap) obj2;
        c();
        if (bitmap == null || this.a.isEmpty()) {
            return;
        }
        this.b = brj.b(bitmap).a(new brh() { // from class: kze
            @Override // defpackage.brh
            public final void a(brj brjVar) {
                kzf kzfVar = kzf.this;
                Bitmap bitmap2 = bitmap;
                int[] iArr = {fav.E(brjVar, kzg.d[0], kzg.d[0], kzg.d[0], kzg.d[0], bitmap2.getWidth(), bitmap2.getHeight()).a};
                Iterator it = kzfVar.a.iterator();
                while (it.hasNext()) {
                    ((zbb) it.next()).a(iArr);
                }
            }
        });
    }

    public final void c() {
        AsyncTask asyncTask = this.b;
        if (asyncTask == null || asyncTask.isCancelled()) {
            return;
        }
        this.b.cancel(false);
        this.b = null;
    }
}
