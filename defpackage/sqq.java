package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sqq {
    private static final awos b;
    private static final byte[] c;
    public final sxt a;

    static {
        aone createBuilder = awos.a.createBuilder();
        aong aongVar = (aong) awqd.a.createBuilder();
        aongVar.e(awok.b, awok.a);
        createBuilder.copyOnWrite();
        awos awosVar = (awos) createBuilder.instance;
        awqd awqdVar = (awqd) aongVar.build();
        awqdVar.getClass();
        awosVar.c = awqdVar;
        awosVar.b |= 1;
        awos awosVar2 = (awos) createBuilder.build();
        b = awosVar2;
        c = awosVar2.toByteArray();
    }

    public sqq(sxt sxtVar) {
        this.a = sxtVar;
    }

    public final dha a(dhe dheVar, sxc sxcVar, byte[] bArr, sxk sxkVar, ayqw ayqwVar) {
        return this.a.a(dheVar, sxcVar, bArr, sxkVar, ayqwVar);
    }

    public final dha b(dhe dheVar, sxc sxcVar, ajds ajdsVar, sxk sxkVar, ayqw ayqwVar) {
        sxt sxtVar = this.a;
        byte[] bArr = ajdsVar.b;
        if (bArr == null) {
            bArr = c;
        }
        return sxtVar.a(dheVar, sxcVar, bArr, sxkVar, ayqwVar);
    }
}
