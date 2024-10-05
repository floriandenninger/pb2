package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agrv extends aaru {
    public Collection a;
    public String b;

    public agrv(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("player/refresh", ajoyVar, afsxVar, null, null, null);
        this.a = new ArrayList();
        this.b = "";
        this.g = aaef.b;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arxo.a.createBuilder();
        String str = this.b;
        createBuilder.copyOnWrite();
        arxo arxoVar = (arxo) createBuilder.instance;
        str.getClass();
        arxoVar.b |= 2;
        arxoVar.e = str;
        Collection collection = this.a;
        createBuilder.copyOnWrite();
        arxo arxoVar2 = (arxo) createBuilder.instance;
        aony aonyVar = arxoVar2.d;
        if (!aonyVar.c()) {
            arxoVar2.d = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) collection, (List) arxoVar2.d);
        createBuilder.copyOnWrite();
        arxo arxoVar3 = (arxo) createBuilder.instance;
        arxoVar3.b |= 4;
        arxoVar3.f = true;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        zhq.m(this.k);
        if (TextUtils.isEmpty(this.b)) {
            amkq.N(!this.a.isEmpty());
        } else {
            zhq.m(this.b);
        }
    }
}
