package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jwm extends agyb {
    private final agzr a;
    private final fjs b;

    public jwm(agpd agpdVar, azrw azrwVar, fjs fjsVar, agzr agzrVar) {
        super(agpdVar, (agof) azrwVar.get(), agzrVar);
        this.b = fjsVar;
        this.a = agzrVar;
    }

    @Override // defpackage.agyb
    protected final atpo a(String str, atrx atrxVar, String str2, byte[] bArr) {
        awjp b;
        aone createBuilder = awii.a.createBuilder();
        createBuilder.copyOnWrite();
        awii awiiVar = (awii) createBuilder.instance;
        awiiVar.e = atrxVar.k;
        awiiVar.c |= 2;
        aomf x = aomf.x(bArr);
        createBuilder.copyOnWrite();
        awii awiiVar2 = (awii) createBuilder.instance;
        awiiVar2.c |= 1;
        awiiVar2.d = x;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            awii awiiVar3 = (awii) createBuilder.instance;
            awiiVar3.c |= 32;
            awiiVar3.h = str2;
        }
        fjs fjsVar = this.b;
        String v = fhe.v(str);
        asxd asxdVar = !fjsVar.g(v) ? null : (asxd) fjsVar.c.a(fjsVar.b.c()).f(v).g(asxd.class).X();
        if (asxdVar != null && (b = asxdVar.b()) != null) {
            awjq awjqVar = b.b;
            createBuilder.copyOnWrite();
            awii awiiVar4 = (awii) createBuilder.instance;
            awjqVar.getClass();
            awiiVar4.f = awjqVar;
            awiiVar4.c |= 8;
            awic f = b.f();
            if (f != null) {
                awid awidVar = f.b;
                createBuilder.copyOnWrite();
                awii awiiVar5 = (awii) createBuilder.instance;
                awidVar.getClass();
                awiiVar5.g = awidVar;
                awiiVar5.c |= 16;
            }
        }
        aong aongVar = (aong) atpo.b.createBuilder();
        aongVar.e(awii.b, (awii) createBuilder.build());
        return (atpo) aongVar.build();
    }

    @Override // defpackage.agyb, defpackage.agzl
    public final int b(String str, atrx atrxVar, String str2, agno agnoVar, byte[] bArr, int i) {
        if (!this.b.g(fhe.v(str)) || this.a.l()) {
            return super.b(str, atrxVar, str2, agnoVar, bArr, i);
        }
        return e(str, atrxVar, str2, bArr, i);
    }
}
