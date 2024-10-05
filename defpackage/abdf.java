package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abdf extends aaru {
    public String a;
    public String b;
    private final Set c;

    public abdf(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("subscription/unsubscribe", ajoyVar, afsxVar, null, null, null);
        this.c = new HashSet();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = asbq.a.createBuilder();
        Set set = this.c;
        createBuilder.copyOnWrite();
        asbq asbqVar = (asbq) createBuilder.instance;
        aony aonyVar = asbqVar.d;
        if (!aonyVar.c()) {
            asbqVar.d = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) set, (List) asbqVar.d);
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            asbq asbqVar2 = (asbq) createBuilder.instance;
            str.getClass();
            asbqVar2.b |= 2;
            asbqVar2.e = str;
        }
        if (!TextUtils.isEmpty(this.b)) {
            String str2 = this.b;
            createBuilder.copyOnWrite();
            asbq asbqVar3 = (asbq) createBuilder.instance;
            str2.getClass();
            asbqVar3.b |= 4;
            asbqVar3.f = str2;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.N(this.c.size() > 0);
    }

    public final void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c.add(str);
    }
}
