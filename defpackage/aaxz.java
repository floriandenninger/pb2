package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaxz extends aaru {
    public String a;
    public Iterable b;
    public Iterable c;

    public aaxz(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("kids/update_kids_allowlist", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = avse.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        avse avseVar = (avse) createBuilder.instance;
        str.getClass();
        avseVar.b |= 2;
        avseVar.d = str;
        Iterable iterable = this.b;
        createBuilder.copyOnWrite();
        avse avseVar2 = (avse) createBuilder.instance;
        aony aonyVar = avseVar2.e;
        if (!aonyVar.c()) {
            avseVar2.e = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) avseVar2.e);
        Iterable iterable2 = this.c;
        createBuilder.copyOnWrite();
        avse avseVar3 = (avse) createBuilder.instance;
        aony aonyVar2 = avseVar3.f;
        if (!aonyVar2.c()) {
            avseVar3.f = aonm.mutableCopy(aonyVar2);
        }
        aolo.addAll(iterable2, (List) avseVar3.f);
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.E(this.a != null);
        amkq.E((this.b == null && this.c == null) ? false : true);
    }
}
