package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyp implements cxw {
    private final cym a;
    private final ddf b;

    public cyp(cym cymVar, ddf ddfVar) {
        this.a = cymVar;
        this.b = ddfVar;
    }

    @Override // defpackage.cxw
    public final void a(ctm ctmVar, Bitmap bitmap) {
        IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap != null) {
                ctmVar.d(bitmap);
                throw iOException;
            }
            throw iOException;
        }
    }

    @Override // defpackage.cxw
    public final void b() {
        this.a.a();
    }
}
