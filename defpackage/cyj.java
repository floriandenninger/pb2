package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyj implements ctd, cta {
    private final Resources a;
    private final ctd b;

    private cyj(Resources resources, ctd ctdVar) {
        did.ap(resources);
        this.a = resources;
        did.ap(ctdVar);
        this.b = ctdVar;
    }

    public static ctd f(Resources resources, ctd ctdVar) {
        if (ctdVar == null) {
            return null;
        }
        return new cyj(resources, ctdVar);
    }

    @Override // defpackage.ctd
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.ctd
    public final Class b() {
        return BitmapDrawable.class;
    }

    @Override // defpackage.ctd
    public final /* bridge */ /* synthetic */ Object c() {
        return new BitmapDrawable(this.a, (Bitmap) this.b.c());
    }

    @Override // defpackage.cta
    public final void d() {
        ctd ctdVar = this.b;
        if (ctdVar instanceof cta) {
            ((cta) ctdVar).d();
        }
    }

    @Override // defpackage.ctd
    public final void e() {
        this.b.e();
    }
}
