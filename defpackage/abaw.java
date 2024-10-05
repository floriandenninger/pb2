package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abaw extends aaru {
    public String a;
    public final List b;
    public String c;

    /* JADX INFO: Access modifiers changed from: protected */
    public abaw(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("browse/edit_playlist", ajoyVar, afsxVar, null, null, null);
        this.b = new ArrayList();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arza.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            arza arzaVar = (arza) createBuilder.instance;
            arzaVar.b |= 2;
            arzaVar.d = str;
        }
        List list = this.b;
        createBuilder.copyOnWrite();
        arza arzaVar2 = (arza) createBuilder.instance;
        aony aonyVar = arzaVar2.e;
        if (!aonyVar.c()) {
            arzaVar2.e = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) list, (List) arzaVar2.e);
        String str2 = this.c;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            arza arzaVar3 = (arza) createBuilder.instance;
            arzaVar3.b |= 4;
            arzaVar3.f = str2;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.N(this.a != null);
        amkq.N(this.b.size() > 0);
    }

    public final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.b.add((auau) it.next());
        }
    }

    public final void e(String str, String str2) {
        aone createBuilder = auau.a.createBuilder();
        createBuilder.copyOnWrite();
        auau auauVar = (auau) createBuilder.instance;
        auauVar.c = 35;
        auauVar.b |= 1;
        createBuilder.copyOnWrite();
        auau auauVar2 = (auau) createBuilder.instance;
        str.getClass();
        auauVar2.b |= 16;
        auauVar2.e = str;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            auau auauVar3 = (auau) createBuilder.instance;
            auauVar3.b |= 32;
            auauVar3.f = str2;
        }
        this.b.add((auau) createBuilder.build());
    }
}
