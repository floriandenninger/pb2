package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xqi {
    public final int[] a;
    private final Handler b;

    public xqi(Handler handler) {
        handler.getClass();
        this.b = handler;
        this.a = new int[2];
    }

    public final void a(String str, int i, View view) {
        akce a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str == null) {
            a = null;
        } else {
            akcr akcrVar = new akcr(view);
            akcrVar.a = 1;
            akcrVar.b();
            akcrVar.c = str;
            akcrVar.h = i;
            akcrVar.i = true;
            a = akcrVar.a();
        }
        if (a == null) {
            return;
        }
        a.h();
        a.c(new akhx(a, 1, null));
        this.b.postDelayed(new akhy(a, 1, null), 5000L);
        a.d();
        view.getLocationOnScreen(this.a);
        view.getViewTreeObserver().addOnPreDrawListener(new xqh(this, a, view));
    }
}
