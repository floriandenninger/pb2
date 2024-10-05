package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czy implements czz {
    private final ctm a;
    private final czz b;
    private final czz c;

    public czy(ctm ctmVar, czz czzVar, czz czzVar2) {
        this.a = ctmVar;
        this.b = czzVar;
        this.c = czzVar2;
    }

    @Override // defpackage.czz
    public final ctd a(ctd ctdVar, cqn cqnVar) {
        Drawable drawable = (Drawable) ctdVar.c();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(cxg.f(((BitmapDrawable) drawable).getBitmap(), this.a), cqnVar);
        }
        if (drawable instanceof czl) {
            return this.c.a(ctdVar, cqnVar);
        }
        return null;
    }
}
