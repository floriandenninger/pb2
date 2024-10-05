package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crh implements cqy {
    public final cym a;

    public crh(InputStream inputStream, ctk ctkVar) {
        cym cymVar = new cym(inputStream, ctkVar);
        this.a = cymVar;
        cymVar.mark(5242880);
    }

    @Override // defpackage.cqy
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.cqy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InputStream a() {
        this.a.reset();
        return this.a;
    }
}
