package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeoe implements aeof {
    public final acpl a;
    public final anib b;
    private final aafc c;

    public aeoe(aafc aafcVar, acpl acplVar, anib anibVar) {
        this.c = aafcVar;
        this.a = acplVar;
        this.b = anibVar;
    }

    @Override // defpackage.aeof
    public final void a(final String str, final azrh azrhVar) {
        aone createBuilder = tkf.a.createBuilder();
        createBuilder.copyOnWrite();
        tkf tkfVar = (tkf) createBuilder.instance;
        tkfVar.b |= 1;
        tkfVar.c = "tf-lite-bandwidth-model";
        int hashCode = str.hashCode();
        createBuilder.copyOnWrite();
        tkf tkfVar2 = (tkf) createBuilder.instance;
        tkfVar2.b |= 4;
        tkfVar2.e = hashCode;
        aone createBuilder2 = tke.a.createBuilder();
        createBuilder2.copyOnWrite();
        tke tkeVar = (tke) createBuilder2.instance;
        tkeVar.b |= 1;
        tkeVar.c = "tf-lite-bandwidth-model.tflite";
        createBuilder2.copyOnWrite();
        tke tkeVar2 = (tke) createBuilder2.instance;
        tkeVar2.e = 1;
        tkeVar2.b |= 8;
        createBuilder2.copyOnWrite();
        tke tkeVar3 = (tke) createBuilder2.instance;
        str.getClass();
        tkeVar3.b |= 2;
        tkeVar3.d = str;
        createBuilder.copyOnWrite();
        tkf tkfVar3 = (tkf) createBuilder.instance;
        tke tkeVar4 = (tke) createBuilder2.build();
        tkeVar4.getClass();
        aony aonyVar = tkfVar3.g;
        if (!aonyVar.c()) {
            tkfVar3.g = aonm.mutableCopy(aonyVar);
        }
        tkfVar3.g.add(tkeVar4);
        aney.h(anht.q(this.c.c((tkf) createBuilder.build())), IOException.class, new amml() { // from class: aeob
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                aeoe aeoeVar = aeoe.this;
                String str2 = str;
                aone createBuilder3 = avey.a.createBuilder();
                createBuilder3.copyOnWrite();
                avey aveyVar = (avey) createBuilder3.instance;
                aveyVar.d = 1;
                aveyVar.b |= 2;
                createBuilder3.copyOnWrite();
                avey aveyVar2 = (avey) createBuilder3.instance;
                aveyVar2.c = 1;
                aveyVar2.b = 1 | aveyVar2.b;
                createBuilder3.copyOnWrite();
                avey aveyVar3 = (avey) createBuilder3.instance;
                str2.getClass();
                aveyVar3.b |= 4;
                aveyVar3.e = str2;
                avey aveyVar4 = (avey) createBuilder3.build();
                arpn a = arpp.a();
                a.copyOnWrite();
                ((arpp) a.instance).dL(aveyVar4);
                aeoeVar.a.c((arpp) a.build());
                return null;
            }
        }, this.b);
        this.c.a().ax(new ayrs() { // from class: aeod
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aeoe aeoeVar = aeoe.this;
                final azrh azrhVar2 = azrhVar;
                anfq.h(anht.q(((aafx) obj).g()), new amml() { // from class: aeoc
                    @Override // defpackage.amml
                    public final Object apply(Object obj2) {
                        azrh.this.c((ByteBuffer) obj2);
                        return null;
                    }
                }, aeoeVar.b);
            }
        });
    }
}
