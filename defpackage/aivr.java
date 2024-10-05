package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aivr implements ykl {
    final /* synthetic */ aivs a;
    private final /* synthetic */ int b;

    public aivr(aivs aivsVar, int i) {
        this.b = i;
        this.a = aivsVar;
    }

    @Override // defpackage.ykl
    public final /* synthetic */ void a(Object obj, Exception exc) {
        if (this.b == 0) {
            if (((Uri) obj).equals(this.a.b)) {
                this.a.c(null, null);
                this.a.b = null;
                return;
            }
            return;
        }
        this.a.a().a((Uri) obj, exc);
    }

    @Override // defpackage.ykl
    public final /* synthetic */ void b(Object obj, Object obj2) {
        if (this.b == 0) {
            hx hxVar = (hx) obj2;
            if (((Uri) obj).equals(this.a.b)) {
                this.a.c((Bitmap) hxVar.a, (Bitmap) hxVar.b);
                this.a.b = null;
                return;
            }
            return;
        }
        Uri uri = (Uri) obj;
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap != null) {
            float f = this.a.a.getResources().getDisplayMetrics().density;
            ykl a = this.a.a();
            float f2 = (int) (f * 64.0f);
            float min = Math.min(f2 / bitmap.getWidth(), f2 / bitmap.getHeight());
            a.b(uri, new hx(bitmap, whu.w(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min))));
        }
    }
}
