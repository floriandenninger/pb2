package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agyb implements agzl {
    private final agpd a;
    private final agzr b;
    private final agof c;

    public agyb(agpd agpdVar, agof agofVar, agzr agzrVar) {
        this.a = agpdVar;
        this.c = agofVar;
        this.b = agzrVar;
    }

    protected atpo a(String str, atrx atrxVar, String str2, byte[] bArr) {
        return atpo.b;
    }

    @Override // defpackage.agzl
    public int b(String str, atrx atrxVar, String str2, agno agnoVar, byte[] bArr, int i) {
        if (!this.b.l() || i == 0) {
            return this.c.a().m().a(str, atrxVar, agnoVar, bArr, -1);
        }
        return e(str, atrxVar, str2, bArr, i);
    }

    @Override // defpackage.agzl
    public final void c(String str, int i) {
        if (!this.b.l() || i == 0) {
            this.c.a().m().y(str);
            return;
        }
        try {
            agpd agpdVar = this.a;
            aone createBuilder = atpq.a.createBuilder();
            createBuilder.copyOnWrite();
            atpq atpqVar = (atpq) createBuilder.instance;
            atpqVar.c = 2;
            atpqVar.b |= 1;
            String f = aalt.f(i, str);
            createBuilder.copyOnWrite();
            atpq atpqVar2 = (atpq) createBuilder.instance;
            f.getClass();
            atpqVar2.b = 2 | atpqVar2.b;
            atpqVar2.d = f;
            agpdVar.d((atpq) createBuilder.build());
        } catch (agpe e) {
            String valueOf = String.valueOf(str);
            zga.f("[Offline]", valueOf.length() != 0 ? "Couldn't delete video through orchestration: ".concat(valueOf) : new String("Couldn't delete video through orchestration: "), e);
        }
    }

    @Override // defpackage.agzl
    public final int d(String str, atrx atrxVar, boolean z, int i) {
        if (z || !this.b.l() || i == 0) {
            return this.c.a().m().b(str);
        }
        try {
            agpd agpdVar = this.a;
            aone createBuilder = atpq.a.createBuilder();
            createBuilder.copyOnWrite();
            atpq atpqVar = (atpq) createBuilder.instance;
            atpqVar.c = 1;
            atpqVar.b = 1 | atpqVar.b;
            String f = aalt.f(i, str);
            createBuilder.copyOnWrite();
            atpq atpqVar2 = (atpq) createBuilder.instance;
            f.getClass();
            atpqVar2.b |= 2;
            atpqVar2.d = f;
            atpo a = a(str, atrxVar, null, aaef.b);
            createBuilder.copyOnWrite();
            atpq atpqVar3 = (atpq) createBuilder.instance;
            a.getClass();
            atpqVar3.e = a;
            atpqVar3.b |= 4;
            agpdVar.d((atpq) createBuilder.build());
            return 0;
        } catch (agpe e) {
            String valueOf = String.valueOf(str);
            zga.f("[Offline]", valueOf.length() != 0 ? "Couldn't retry video through orchestration: ".concat(valueOf) : new String("Couldn't retry video through orchestration: "), e);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int e(String str, atrx atrxVar, String str2, byte[] bArr, int i) {
        try {
            agpd agpdVar = this.a;
            aone createBuilder = atpq.a.createBuilder();
            createBuilder.copyOnWrite();
            atpq atpqVar = (atpq) createBuilder.instance;
            atpqVar.c = 1;
            atpqVar.b = 1 | atpqVar.b;
            String f = aalt.f(i, str);
            createBuilder.copyOnWrite();
            atpq atpqVar2 = (atpq) createBuilder.instance;
            f.getClass();
            atpqVar2.b |= 2;
            atpqVar2.d = f;
            atpo a = a(str, atrxVar, str2, bArr);
            createBuilder.copyOnWrite();
            atpq atpqVar3 = (atpq) createBuilder.instance;
            a.getClass();
            atpqVar3.e = a;
            atpqVar3.b |= 4;
            agpdVar.d((atpq) createBuilder.build());
            return 0;
        } catch (agpe e) {
            String valueOf = String.valueOf(str);
            zga.f("[Offline]", valueOf.length() != 0 ? "Couldn't add video through orchestration: ".concat(valueOf) : new String("Couldn't add video through orchestration: "), e);
            return 2;
        }
    }
}
