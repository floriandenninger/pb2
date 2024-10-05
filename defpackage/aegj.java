package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aegj extends afja {
    private final afeu b;
    private final aesa c;

    public aegj(atr atrVar, aesa aesaVar, afeu afeuVar) {
        super(atrVar);
        this.c = aesaVar;
        this.b = afeuVar;
    }

    private final void c(atn atnVar) {
        String sb;
        afih b = this.b.b(atnVar);
        if (atnVar.getCause() == null) {
            sb = "";
        } else {
            String valueOf = String.valueOf(atnVar.getCause().getClass());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 3);
            sb2.append(";c.");
            sb2.append(valueOf);
            sb = sb2.toString();
        }
        String i = b.i();
        int i2 = atnVar.c;
        StringBuilder sb3 = new StringBuilder(String.valueOf(i).length() + 16 + String.valueOf(sb).length());
        sb3.append("e.");
        sb3.append(i);
        sb3.append(";t.");
        sb3.append(i2);
        sb3.append(sb);
        this.c.j("fberr", sb3.toString());
    }

    @Override // defpackage.afja, defpackage.atr, defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        try {
            return super.g(bArr, i, i2);
        } catch (atn e) {
            c(e);
            throw e;
        }
    }

    @Override // defpackage.afja, defpackage.atr, defpackage.ate
    public final long h(ath athVar) {
        try {
            return super.h(athVar);
        } catch (atn e) {
            c(e);
            throw e;
        }
    }

    @Override // defpackage.afja, defpackage.atr, defpackage.ate
    public final void j() {
        try {
            super.j();
        } catch (atn e) {
            c(e);
            throw e;
        }
    }
}
