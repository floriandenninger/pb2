package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahjl {
    private final ViewGroup a;
    private final Context b;
    private final Handler c;
    private final azrw d;

    public ahjl(ViewGroup viewGroup, Context context, Handler handler, azrw azrwVar) {
        this.a = viewGroup;
        this.b = context;
        this.c = handler;
        this.d = azrwVar;
    }

    public final ahjo a(ahkv ahkvVar, float f, float f2) {
        return new ahjo(this.a, this.b, this.c, this.d, ahkvVar, f, f2);
    }
}
