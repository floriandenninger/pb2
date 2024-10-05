package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anmc extends ankd {
    public static final byte[] c = new byte[0];

    public anmc() {
        super(annt.class, new anma(anjm.class));
    }

    public static anjr i(int i, anjq anjqVar, byte[] bArr, int i2) {
        int i3;
        aone createBuilder = annr.a.createBuilder();
        aone createBuilder2 = annv.a.createBuilder();
        createBuilder2.copyOnWrite();
        int i4 = 4;
        ((annv) createBuilder2.instance).b = aobq.W(4);
        createBuilder2.copyOnWrite();
        ((annv) createBuilder2.instance).c = aobq.U(5);
        aomf x = aomf.x(bArr);
        createBuilder2.copyOnWrite();
        ((annv) createBuilder2.instance).d = x;
        annv annvVar = (annv) createBuilder2.build();
        aone createBuilder3 = anod.a.createBuilder();
        String str = anjqVar.a.b;
        createBuilder3.copyOnWrite();
        anod anodVar = (anod) createBuilder3.instance;
        str.getClass();
        anodVar.b = str;
        aomf x2 = aomf.x(anjqVar.a.c.I());
        createBuilder3.copyOnWrite();
        ((anod) createBuilder3.instance).c = x2;
        int aH = aocz.aH(anjqVar.a.d);
        if (aH == 0) {
            aH = 1;
        }
        int i5 = aH - 2;
        if (i5 == 1) {
            i3 = 1;
        } else if (i5 == 2) {
            i3 = 2;
        } else if (i5 == 3) {
            i3 = 3;
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException("Unknown output prefix type");
            }
            i3 = 4;
        }
        int i6 = i3 - 1;
        if (i6 == 0) {
            i4 = 3;
        } else if (i6 != 1) {
            i4 = i6 != 2 ? 6 : 5;
        }
        createBuilder3.copyOnWrite();
        ((anod) createBuilder3.instance).d = aocz.aG(i4);
        anod anodVar2 = (anod) createBuilder3.build();
        aone createBuilder4 = annq.a.createBuilder();
        createBuilder4.copyOnWrite();
        annq annqVar = (annq) createBuilder4.instance;
        anodVar2.getClass();
        annqVar.b = anodVar2;
        annq annqVar2 = (annq) createBuilder4.build();
        aone createBuilder5 = anns.a.createBuilder();
        createBuilder5.copyOnWrite();
        anns annsVar = (anns) createBuilder5.instance;
        annvVar.getClass();
        annsVar.b = annvVar;
        createBuilder5.copyOnWrite();
        anns annsVar2 = (anns) createBuilder5.instance;
        annqVar2.getClass();
        annsVar2.c = annqVar2;
        createBuilder5.copyOnWrite();
        ((anns) createBuilder5.instance).d = aobq.Z(i);
        anns annsVar3 = (anns) createBuilder5.build();
        createBuilder.copyOnWrite();
        annr annrVar = (annr) createBuilder.instance;
        annsVar3.getClass();
        annrVar.b = annsVar3;
        return new anjr((annr) createBuilder.build(), i2);
    }

    @Override // defpackage.anju
    public final anjs a() {
        return new anmb(annr.class);
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (annt) aonm.parseFrom(annt.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        annt anntVar = (annt) aooyVar;
        if (!anntVar.d.H()) {
            anrp.d(anntVar.b);
            annu annuVar = anntVar.c;
            if (annuVar == null) {
                annuVar = annu.a;
            }
            anns annsVar = annuVar.c;
            if (annsVar == null) {
                annsVar = anns.a;
            }
            aobq.ab(annsVar);
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    @Override // defpackage.anju
    public final int h() {
        return 4;
    }
}
