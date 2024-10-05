package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agdi {
    public final Context a;
    public final ajut b;
    public final Executor c;
    public final Executor d;
    public PopupWindow e;
    public boolean f;
    public final akpq g;

    public agdi(Context context, ajut ajutVar, akpq akpqVar, Executor executor, Executor executor2, byte[] bArr) {
        this.a = context;
        this.b = ajutVar;
        this.g = akpqVar;
        this.c = executor;
        this.d = executor2;
    }

    public final void a() {
        PopupWindow popupWindow = this.e;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.e = null;
        }
        this.f = false;
    }

    public final void b(View view, boolean z) {
        if (z) {
            view.setBackgroundColor(wbs.Q(this.a, R.attr.ytGeneralBackgroundB));
        } else {
            view.setBackgroundColor(wbs.Q(this.a, R.attr.ytBrandBackgroundSolid));
        }
    }
}
