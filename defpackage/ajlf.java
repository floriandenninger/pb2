package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajlf extends cor {
    public ajlf(cnv cnvVar, dap dapVar, dax daxVar, Context context) {
        super(cnvVar, dapVar, daxVar, context);
    }

    @Override // defpackage.cor
    public final /* bridge */ /* synthetic */ con a(Class cls) {
        return new ajle(this.a, this, cls, this.b);
    }

    @Override // defpackage.cor
    public final /* bridge */ /* synthetic */ con b() {
        return (ajle) super.b();
    }

    @Override // defpackage.cor
    public final /* bridge */ /* synthetic */ con c() {
        return (ajle) super.c();
    }

    @Override // defpackage.cor
    public final /* bridge */ /* synthetic */ con d(Drawable drawable) {
        return (ajle) super.d(drawable);
    }

    @Override // defpackage.cor
    public final /* bridge */ /* synthetic */ con e(Integer num) {
        return (ajle) super.e(num);
    }

    @Override // defpackage.cor
    public final /* bridge */ /* synthetic */ con f(Object obj) {
        return (ajle) super.f(obj);
    }

    @Override // defpackage.cor
    public final /* bridge */ /* synthetic */ con g(byte[] bArr) {
        return (ajle) super.g(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cor
    public final void p(dbx dbxVar) {
        if (dbxVar instanceof ajlc) {
            super.p(dbxVar);
        } else {
            super.p(new ajlc().l(dbxVar));
        }
    }
}
