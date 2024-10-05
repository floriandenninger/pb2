package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abdt {
    private final String a;
    private final afsy b;
    private final aaea c;
    private final boolean d;
    private final Set e;
    private final ajoy f;
    private final axzf g;

    public abdt(ammv ammvVar, aarm aarmVar, ajoy ajoyVar, afsy afsyVar, aadw aadwVar, aaea aaeaVar, Set set, axzf axzfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = ammvVar.h() ? (String) ammvVar.c() : "next";
        aarmVar.getClass();
        ajoyVar.getClass();
        this.f = ajoyVar;
        afsyVar.getClass();
        this.b = afsyVar;
        this.d = aaec.b(aadwVar);
        aaeaVar.getClass();
        this.c = aaeaVar;
        set.getClass();
        this.e = set;
        this.g = axzfVar;
    }

    public final abdu a(String str, String str2, int i, String str3, byte[] bArr, yst ystVar) {
        abdu b = b();
        str2.getClass();
        b.a = str2;
        b.b = i;
        b.v(str);
        b.e(str3);
        b.m(bArr);
        b.p = ystVar;
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final abdu b() {
        Boolean bool;
        Optional of;
        String str = this.a;
        ajoy ajoyVar = this.f;
        afsx c = this.b.c();
        boolean z = this.d;
        aqvj aqvjVar = this.g.a.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45353255L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45353255L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45353255L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (!bool.booleanValue()) {
            of = Optional.empty();
        } else {
            atfr atfrVar = this.c.a().f;
            if (atfrVar == null) {
                atfrVar = atfr.a;
            }
            awdx awdxVar = atfrVar.l;
            if (awdxVar == null) {
                awdxVar = awdx.a;
            }
            aone createBuilder = awxc.a.createBuilder();
            boolean z2 = awdxVar.b;
            createBuilder.copyOnWrite();
            awxc awxcVar = (awxc) createBuilder.instance;
            awxcVar.b = 1 | awxcVar.b;
            awxcVar.c = z2;
            aoqa cg = amkq.cg(Instant.now().plusMillis(awdxVar.c));
            createBuilder.copyOnWrite();
            awxc awxcVar2 = (awxc) createBuilder.instance;
            cg.getClass();
            awxcVar2.d = cg;
            awxcVar2.b |= 2;
            of = Optional.of((awxc) createBuilder.build());
        }
        Optional optional = of;
        c.getClass();
        abdu abduVar = new abdu(str, ajoyVar, c, z, optional, null, null, null);
        for (abdr abdrVar : this.e) {
            if (abdrVar != null) {
                abdrVar.no(abduVar);
            }
        }
        return abduVar;
    }
}
