package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agpw extends afit {
    private final agej a;
    private final afhe b;
    private final afhz c;
    private final axzg d;

    public agpw(agej agejVar, afhe afheVar, afhz afhzVar, axzg axzgVar, byte[] bArr, byte[] bArr2) {
        agejVar.getClass();
        this.a = agejVar;
        this.b = afheVar;
        this.c = afhzVar;
        this.d = axzgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afit
    public final ate a(ate ateVar) {
        Boolean bool;
        aqvj aqvjVar = this.d.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45354110L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45354110L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45354110L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            return new agpt(this.a, this.b, this.c, ateVar);
        }
        ate agpvVar = new agpv(ateVar);
        Iterator it = this.a.g().iterator();
        while (true) {
            ate ateVar2 = agpvVar;
            if (!it.hasNext()) {
                return ateVar2;
            }
            agna agnaVar = (agna) it.next();
            agpvVar = new phj(agnaVar, ateVar2, this.b.a(agnaVar.n()), null, 4, this.c);
        }
    }
}
