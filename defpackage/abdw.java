package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abdw extends aaru {
    public final List a;
    public String b;
    public String c;

    public abdw(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("ypc/commerce_action", ajoyVar, afsxVar, null, null, null);
        this.b = "";
        this.c = "";
        this.a = new ArrayList();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = armk.a.createBuilder();
        if (!TextUtils.isEmpty(this.b)) {
            String str = this.b;
            createBuilder.copyOnWrite();
            armk armkVar = (armk) createBuilder.instance;
            str.getClass();
            armkVar.b |= 2;
            armkVar.d = str;
        }
        if (!TextUtils.isEmpty(this.c)) {
            String str2 = this.c;
            createBuilder.copyOnWrite();
            armk armkVar2 = (armk) createBuilder.instance;
            str2.getClass();
            armkVar2.b |= 4;
            armkVar2.e = str2;
        }
        if (!this.a.isEmpty()) {
            List list = this.a;
            createBuilder.copyOnWrite();
            armk armkVar3 = (armk) createBuilder.instance;
            aony aonyVar = armkVar3.f;
            if (!aonyVar.c()) {
                armkVar3.f = aonm.mutableCopy(aonyVar);
            }
            aolo.addAll((Iterable) list, (List) armkVar3.f);
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.E(!TextUtils.isEmpty(this.b));
    }
}
