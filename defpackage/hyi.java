package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hyi implements aaha {
    private final dd a;

    public hyi(dd ddVar) {
        this.a = ddVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (this.a == null) {
            zga.b("fragmentManager is null");
            return;
        }
        iac iacVar = new iac();
        dn k = this.a.k();
        k.r(iacVar, "multi_page_sticker_catalog");
        k.a();
    }
}
