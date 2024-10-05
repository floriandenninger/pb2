package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajeo implements sye {
    private final acpl a;
    private final boolean b;
    private final aoae c;

    public ajeo(acpl acplVar, aoae aoaeVar, ammv ammvVar, byte[] bArr, byte[] bArr2) {
        this.a = acplVar;
        this.c = aoaeVar;
        this.b = ((Boolean) ammvVar.e(false)).booleanValue();
    }

    @Override // defpackage.sye
    public final void a(int i, String str, String str2) {
        if (i == 29) {
            aoae aoaeVar = this.c;
            synchronized (aoaeVar.b) {
                Iterator it = aoaeVar.b.iterator();
                while (it.hasNext()) {
                    ((ajfc) it.next()).a();
                }
            }
            if (this.b) {
                return;
            } else {
                i = 29;
            }
        }
        if (true == amnu.a(str2)) {
            str2 = "Unknown Template";
        }
        aone createBuilder = aqrl.a.createBuilder();
        createBuilder.copyOnWrite();
        aqrl aqrlVar = (aqrl) createBuilder.instance;
        aqrlVar.c = i - 1;
        aqrlVar.b |= 2;
        createBuilder.copyOnWrite();
        aqrl aqrlVar2 = (aqrl) createBuilder.instance;
        str.getClass();
        aqrlVar2.b |= 4;
        aqrlVar2.d = str;
        createBuilder.copyOnWrite();
        aqrl aqrlVar3 = (aqrl) createBuilder.instance;
        str2.getClass();
        aqrlVar3.b |= 8;
        aqrlVar3.e = str2;
        createBuilder.copyOnWrite();
        aqrl aqrlVar4 = (aqrl) createBuilder.instance;
        aqrlVar4.b |= 16;
        aqrlVar4.f = 0;
        aqrl aqrlVar5 = (aqrl) createBuilder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).ct(aqrlVar5);
        this.a.c((arpp) a.build());
    }
}
