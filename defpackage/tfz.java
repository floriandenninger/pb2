package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class tfz {
    private final aone b;
    private final sgf d = tgb.d;
    private tgb a = null;
    public final aong c = (aong) tgf.a.createBuilder();

    static {
        amsx.r(121594);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public tfz(awxk awxkVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.b = awxkVar.a;
        a(((ando) awxkVar.a.instance).d);
    }

    private final void a(int i) {
        aong aongVar = this.c;
        long j = ((tgf) aongVar.instance).g;
        aongVar.copyOnWrite();
        tgf tgfVar = (tgf) aongVar.instance;
        tgfVar.b |= 8;
        tgfVar.g = j + i;
    }

    private final void b(int i) {
        aong aongVar = this.c;
        long j = ((tgf) aongVar.instance).h;
        aongVar.copyOnWrite();
        tgf tgfVar = (tgf) aongVar.instance;
        tgfVar.b |= 16;
        tgfVar.h = j + i;
    }

    public final void d(tga tgaVar) {
        amkq.N(this.a == null);
        this.c.e(tgaVar.a, tgaVar.b);
        b(tgaVar.a.a());
        b(tgaVar.a.hashCode());
        b(tgaVar.b.hashCode());
    }

    public final void e(tga tgaVar) {
        amkq.N(this.a == null);
        ando andoVar = ((tgf) this.c.instance).d;
        if (andoVar == null) {
            andoVar = ando.a;
        }
        amkq.N(!((andoVar.b & 2048) != 0));
        if (!this.c.pY(tgaVar.a)) {
            aong aongVar = this.c;
            int a = tgaVar.a.a();
            aongVar.copyOnWrite();
            tgf tgfVar = (tgf) aongVar.instance;
            aonu aonuVar = tgfVar.c;
            if (!aonuVar.c()) {
                tgfVar.c = aonm.mutableCopy(aonuVar);
            }
            tgfVar.c.g(a);
        }
        this.c.e(tgaVar.a, tgaVar.b);
        a(tgaVar.a.a());
        a(tgaVar.a.hashCode());
        a(tgaVar.b.hashCode());
    }

    public final tgb f(aoae aoaeVar) {
        amkq.O(this.a == null, "Cannot create CVE twice.");
        aong aongVar = this.c;
        aone aoneVar = this.b;
        aongVar.copyOnWrite();
        tgf tgfVar = (tgf) aongVar.instance;
        ando andoVar = (ando) aoneVar.build();
        tgf tgfVar2 = tgf.a;
        andoVar.getClass();
        tgfVar.d = andoVar;
        tgfVar.b = 1 | tgfVar.b;
        tgb tgbVar = new tgb((aong) ((tgf) this.c.build()).toBuilder(), this.d, aoaeVar, null, null, null, null, null, null);
        this.a = tgbVar;
        aoae aoaeVar2 = tgbVar.e;
        if (!aoaeVar2.b.isEmpty()) {
            Iterator it = aoaeVar2.b.iterator();
            while (it.hasNext()) {
                ((tgr) it.next()).f();
            }
        }
        return this.a;
    }
}
