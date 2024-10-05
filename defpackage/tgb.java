package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tgb {
    public static final sgf d = new sgf();
    public tgt a;
    public int b = -1;
    public final aong c;
    public final aoae e;
    private final sgf f;

    public tgb(aong aongVar, sgf sgfVar, aoae aoaeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.c = aongVar;
        this.f = sgfVar;
        this.e = aoaeVar;
    }

    public final tgf a() {
        return (tgf) this.c.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(tgb tgbVar) {
        amkq.N(tgbVar.a == null);
        amkq.N(!c());
        amkq.N(this.f == tgbVar.f);
        boolean m = this.a.m();
        if (m) {
            this.e.x(this);
        }
        this.c.clear();
        this.c.mergeFrom(tgbVar.c.build());
        if (m) {
            this.e.w(this);
        }
    }

    public final boolean c() {
        ando andoVar = ((tgf) this.c.instance).d;
        if (andoVar == null) {
            andoVar = ando.a;
        }
        return (andoVar.b & 8) != 0;
    }

    public final boolean d() {
        ando andoVar = ((tgf) this.c.instance).d;
        if (andoVar == null) {
            andoVar = ando.a;
        }
        return (andoVar.b & 2048) != 0;
    }

    public final void e() {
        aoae aoaeVar = this.e;
        if (!aoaeVar.b.isEmpty()) {
            Iterator it = aoaeVar.b.iterator();
            while (it.hasNext()) {
                ((tgr) it.next()).a(this);
            }
        }
        aong aongVar = this.c;
        ando andoVar = ((tgf) aongVar.instance).d;
        if (andoVar == null) {
            andoVar = ando.a;
        }
        aone builder = andoVar.toBuilder();
        builder.copyOnWrite();
        ando andoVar2 = (ando) builder.instance;
        andoVar2.e = null;
        andoVar2.b &= -2049;
        builder.copyOnWrite();
        ando andoVar3 = (ando) builder.instance;
        andoVar3.b &= -2;
        andoVar3.c = -1;
        ando andoVar4 = (ando) builder.build();
        aongVar.copyOnWrite();
        tgf tgfVar = (tgf) aongVar.instance;
        andoVar4.getClass();
        tgfVar.d = andoVar4;
        tgfVar.b |= 1;
    }

    public final int f() {
        return this.a.r();
    }

    public final void g(int i) {
        if (i != 1) {
            i = 2;
        }
        amkq.F(true, "Repressed visibility is not yet supported.");
        this.a.s(i);
    }

    public final String toString() {
        String str;
        tgt tgtVar = this.a;
        if (tgtVar != null) {
            String valueOf = String.valueOf(tgtVar.getClass().getSimpleName());
            str = valueOf.length() != 0 ? ".".concat(valueOf) : new String(".");
        } else {
            str = "";
        }
        ando andoVar = ((tgf) this.c.instance).d;
        if (andoVar == null) {
            andoVar = ando.a;
        }
        int i = andoVar.d;
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(hexString).length());
        sb.append("CVE");
        sb.append(str);
        sb.append("#");
        sb.append(i);
        sb.append(" [");
        sb.append(hexString);
        sb.append("]");
        return sb.toString();
    }
}
