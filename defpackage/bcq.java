package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bcq implements bbz {
    private final atd a;
    private bfs b;
    private int c;
    private bcp d;
    private ayf e;

    public bcq(atd atdVar) {
        this(atdVar, new bie());
    }

    public final bcr a(pnd pndVar) {
        ayr ayrVar;
        pse.c(pndVar.b);
        pnc pncVar = pndVar.b;
        Object obj = pncVar.h;
        String str = pncVar.f;
        atd atdVar = this.a;
        bcp bcpVar = this.d;
        ayf ayfVar = this.e;
        pse.c(pncVar);
        pna pnaVar = pndVar.b.c;
        if (pnaVar != null) {
            int i = pts.a;
            synchronized (ayfVar.a) {
                if (!pts.R(pnaVar, ayfVar.b)) {
                    ayfVar.b = pnaVar;
                    ati atiVar = new ati();
                    atiVar.b = null;
                    azf azfVar = new azf(atiVar);
                    amxd listIterator = pnaVar.c.entrySet().listIterator();
                    while (listIterator.hasNext()) {
                        Map.Entry entry = (Map.Entry) listIterator.next();
                        String str2 = (String) entry.getKey();
                        String str3 = (String) entry.getValue();
                        pse.c(str2);
                        pse.c(str3);
                        synchronized (azfVar.b) {
                            azfVar.b.put(str2, str3);
                        }
                    }
                    axu axuVar = new axu();
                    UUID uuid = pnaVar.a;
                    azc azcVar = aze.b;
                    axuVar.b = uuid;
                    axuVar.e = azcVar;
                    axuVar.a(anaf.aj(pnaVar.g));
                    aye ayeVar = new aye(axuVar.b, azfVar, axuVar.a, axuVar.c, axuVar.d);
                    byte[] bArr = pnaVar.h;
                    byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                    pse.g(ayeVar.c.isEmpty());
                    ayeVar.k = copyOf;
                    ayfVar.c = ayeVar;
                }
                ayrVar = ayfVar.c;
                pse.c(ayrVar);
            }
        } else {
            ayrVar = ayr.m;
        }
        return new bcr(pndVar, atdVar, bcpVar, ayrVar, this.b, this.c);
    }

    public bcq(atd atdVar, bil bilVar) {
        bcp bcpVar = new bcp(bilVar);
        this.a = atdVar;
        this.d = bcpVar;
        this.e = new ayf();
        this.b = new bfm();
        this.c = 1048576;
    }
}
