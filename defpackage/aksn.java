package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aksn implements vjf {
    private final acpl a;

    public aksn(acpl acplVar) {
        this.a = acplVar;
    }

    @Override // defpackage.vjf
    public final void a(vje vjeVar) {
        amll d = vjeVar.d();
        if (d.b.size() != 0) {
            aony<aobe> aonyVar = d.b;
            if (aonyVar.isEmpty()) {
                return;
            }
            for (aobe aobeVar : aonyVar) {
                aone createBuilder = auzb.a.createBuilder();
                aomf byteString = aobeVar.toByteString();
                createBuilder.copyOnWrite();
                auzb auzbVar = (auzb) createBuilder.instance;
                auzbVar.b |= 1;
                auzbVar.c = byteString;
                auzb auzbVar2 = (auzb) createBuilder.build();
                arpn a = arpp.a();
                a.copyOnWrite();
                ((arpp) a.instance).dJ(auzbVar2);
                this.a.e((arpp) a.build());
            }
        }
    }
}
