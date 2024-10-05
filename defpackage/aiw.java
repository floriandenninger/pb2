package defpackage;

import android.graphics.Typeface;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiw {
    private final ajh a;
    private final Handler b;

    public aiw(ajh ajhVar, Handler handler) {
        this.a = ajhVar;
        this.b = handler;
    }

    public final void a(ajd ajdVar) {
        if (ajdVar.b != 0) {
            this.b.post(new aiv(this.a));
        } else {
            Typeface typeface = ajdVar.a;
            this.b.post(new aiu(this.a, typeface));
        }
    }
}
