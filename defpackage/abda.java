package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abda extends aaru {
    public String a;
    public String b;
    public final aone c;
    private final Set d;

    public abda(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("subscription/subscribe", ajoyVar, afsxVar, null, null, null);
        this.d = new HashSet();
        this.c = atnf.a.createBuilder();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = asbo.a.createBuilder();
        Set set = this.d;
        createBuilder.copyOnWrite();
        asbo asboVar = (asbo) createBuilder.instance;
        aony aonyVar = asboVar.d;
        if (!aonyVar.c()) {
            asboVar.d = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) set, (List) asboVar.d);
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            asbo asboVar2 = (asbo) createBuilder.instance;
            str.getClass();
            asboVar2.b |= 2;
            asboVar2.e = str;
        }
        if (!TextUtils.isEmpty(this.b)) {
            String str2 = this.b;
            createBuilder.copyOnWrite();
            asbo asboVar3 = (asbo) createBuilder.instance;
            str2.getClass();
            asboVar3.b |= 4;
            asboVar3.f = str2;
        }
        atnf atnfVar = (atnf) this.c.build();
        createBuilder.copyOnWrite();
        asbo asboVar4 = (asbo) createBuilder.instance;
        atnfVar.getClass();
        asboVar4.g = atnfVar;
        asboVar4.b |= 8;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.N(this.d.size() > 0);
    }

    public final void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d.add(str);
    }
}
