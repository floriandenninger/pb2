package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cxg implements ctd, cta {
    private final Bitmap a;
    private final ctm b;

    public cxg(Bitmap bitmap, ctm ctmVar) {
        did.at(bitmap, "Bitmap must not be null");
        this.a = bitmap;
        did.at(ctmVar, "BitmapPool must not be null");
        this.b = ctmVar;
    }

    public static cxg f(Bitmap bitmap, ctm ctmVar) {
        if (bitmap == null) {
            return null;
        }
        return new cxg(bitmap, ctmVar);
    }

    @Override // defpackage.ctd
    public final int a() {
        return ddn.a(this.a);
    }

    @Override // defpackage.ctd
    public final Class b() {
        return Bitmap.class;
    }

    @Override // defpackage.ctd
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // defpackage.cta
    public final void d() {
        this.a.prepareToDraw();
    }

    @Override // defpackage.ctd
    public final void e() {
        this.b.d(this.a);
    }
}
