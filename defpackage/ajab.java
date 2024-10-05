package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajab extends aaxm {
    public List d;
    public aomf s;
    public String t;
    private String u;

    /* JADX INFO: Access modifiers changed from: protected */
    public ajab(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaxm, defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        return a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaxm, defpackage.aaqh
    public final void c() {
        zhq.m(this.u);
        List list = this.d;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (((ajaf) it.next()) != null) {
                a();
            }
        }
    }

    @Override // defpackage.aaxm
    public final void d(String str) {
        ((aaxm) this).a = str;
        this.u = str;
    }

    @Override // defpackage.aaxm
    /* renamed from: e */
    public final aone a() {
        aone createBuilder = arxm.a.createBuilder();
        String str = this.u;
        createBuilder.copyOnWrite();
        arxm arxmVar = (arxm) createBuilder.instance;
        str.getClass();
        arxmVar.b |= 2;
        arxmVar.d = str;
        aomf aomfVar = this.s;
        if (aomfVar != null) {
            createBuilder.copyOnWrite();
            arxm arxmVar2 = (arxm) createBuilder.instance;
            arxmVar2.b |= 64;
            arxmVar2.h = aomfVar;
        }
        String str2 = this.t;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            arxm arxmVar3 = (arxm) createBuilder.instance;
            arxmVar3.b |= 16;
            arxmVar3.f = str2;
        }
        List list = this.d;
        if (list != null && !list.isEmpty()) {
            for (ajaf ajafVar : this.d) {
                if (ajafVar != null) {
                    ajafVar.a(this, createBuilder);
                }
            }
        }
        return createBuilder;
    }
}
