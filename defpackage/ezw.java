package defpackage;

import android.app.Activity;
import android.net.Uri;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ezw implements aaha {
    public static final /* synthetic */ int g = 0;
    public final Activity a;
    public final afsy b;
    public final Executor c;
    public final Executor d;
    public final azrw e;
    public final wcf f;

    public ezw(Activity activity, wcf wcfVar, afsy afsyVar, Executor executor, Executor executor2, azrw azrwVar) {
        this.a = activity;
        this.f = wcfVar;
        this.b = afsyVar;
        this.c = executor;
        this.d = executor2;
        this.e = azrwVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        ayqj.F(apxfVar).G(eoe.g).B(new ezu(this, 0)).G(eoe.h).W(new ayrs() { // from class: ezt
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ezw ezwVar = ezw.this;
                Uri uri = (Uri) obj;
                if (((ajcx) ezwVar.e.get()).f(ezwVar.a, uri)) {
                    return;
                }
                fav.F(ezwVar.a, uri);
            }
        }, eoo.f);
    }
}
