package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ive implements ykl {
    final /* synthetic */ ivj a;
    private AsyncTask b;

    public ive(ivj ivjVar) {
        this.a = ivjVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        if (this.a.ar()) {
            this.a.br(ivj.bB());
        }
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        final Bitmap bitmap = (Bitmap) obj2;
        c();
        if (bitmap != null) {
            this.b = new brg(bitmap).a(new brh() { // from class: ivd
                @Override // defpackage.brh
                public final void a(brj brjVar) {
                    ive iveVar = ive.this;
                    Bitmap bitmap2 = bitmap;
                    if (!iveVar.a.ar() || brjVar == null) {
                        return;
                    }
                    ivj ivjVar = iveVar.a;
                    gos E = fav.E(brjVar, ivjVar.b.getColor(R.color.yt_grey3), ivjVar.b.getColor(R.color.theme_tab_fallback_text_color_activated_dark), ivjVar.b.getColor(R.color.theme_tab_fallback_text_color_normal_dark), ivjVar.b.getColor(R.color.yt_white1), bitmap2.getWidth(), bitmap2.getHeight());
                    nle a = nlf.a();
                    a.d(gfw.j(E.d));
                    a.e(gfw.j(E.c));
                    a.b(gfw.j(E.a));
                    a.f(gfw.j(E.b));
                    a.c(gfw.j(E.d));
                    ivjVar.br(a.a());
                }
            });
        }
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
