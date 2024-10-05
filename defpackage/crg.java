package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crg implements cqx {
    private final ctk a;

    public crg(ctk ctkVar) {
        this.a = ctkVar;
    }

    @Override // defpackage.cqx
    public final /* bridge */ /* synthetic */ cqy a(Object obj) {
        return new crh((InputStream) obj, this.a);
    }

    @Override // defpackage.cqx
    public final Class b() {
        return InputStream.class;
    }
}
