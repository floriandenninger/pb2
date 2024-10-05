package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jub extends aaru {
    public atox a;
    public ammv b;
    private ammv c;
    private ammv d;

    public jub(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("offline/get_main_download_recommendation", ajoyVar, afsxVar, null, null, null);
        this.c = amlr.a;
        this.d = amlr.a;
        this.b = amlr.a;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        this.a.getClass();
        aone createBuilder = aswm.a.createBuilder();
        atox atoxVar = this.a;
        createBuilder.copyOnWrite();
        aswm aswmVar = (aswm) createBuilder.instance;
        atoxVar.getClass();
        aswmVar.d = atoxVar;
        aswmVar.b |= 2;
        if (this.c.h()) {
            aqme aqmeVar = (aqme) this.c.c();
            createBuilder.copyOnWrite();
            aswm aswmVar2 = (aswm) createBuilder.instance;
            aswmVar2.f = aqmeVar.d;
            aswmVar2.b |= 8;
        }
        if (this.d.h()) {
            aswl aswlVar = (aswl) this.d.c();
            createBuilder.copyOnWrite();
            aswm aswmVar3 = (aswm) createBuilder.instance;
            aswmVar3.e = aswlVar;
            aswmVar3.b |= 4;
        }
        if (this.b.h()) {
            Iterable iterable = (Iterable) this.b.c();
            createBuilder.copyOnWrite();
            aswm aswmVar4 = (aswm) createBuilder.instance;
            aony aonyVar = aswmVar4.g;
            if (!aonyVar.c()) {
                aswmVar4.g = aonm.mutableCopy(aonyVar);
            }
            aolo.addAll(iterable, (List) aswmVar4.g);
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        this.a.getClass();
    }

    public final void d(aqme aqmeVar) {
        this.c = ammv.j(aqmeVar);
    }

    public final void e(aswl aswlVar) {
        this.d = ammv.j(aswlVar);
    }
}
