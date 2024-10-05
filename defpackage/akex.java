package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akex extends yvo implements akdm {
    public Map a;
    public boolean b;
    public acsy c;
    private final String k;

    public akex(String str, String str2) {
        super(1, str, null);
        this.a = new HashMap();
        this.k = str2;
    }

    @Override // defpackage.akdm
    public final acsy c() {
        return this.c;
    }

    @Override // defpackage.yvo
    public final Map f() {
        return this.a;
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        byte[] bArr = cnhVar.b;
        akdg akdgVar = null;
        if (bArr == null) {
            return null;
        }
        Map map = cnhVar.c;
        this.a = map;
        if (this.b) {
            Map map2 = cnhVar.c;
            int i = cnhVar.a;
            return cnm.b(new akdh(bArr), ach.k(cnhVar));
        }
        if (!map.containsKey("content-type")) {
            return null;
        }
        String str = (String) this.a.get("content-type");
        if (TextUtils.equals(str, "application/x-protobuffer")) {
            byte[] bArr2 = cnhVar.b;
            int i2 = cnhVar.a;
            akdgVar = new akea(bArr2, this.k, null);
        } else if (TextUtils.equals(str, "application/json; charset=UTF-8")) {
            byte[] bArr3 = cnhVar.b;
            Map map3 = this.a;
            int i3 = cnhVar.a;
            akdgVar = new akdk(bArr3, map3, this.k);
        }
        return cnm.b(akdgVar, ach.k(cnhVar));
    }

    @Override // defpackage.yvo
    public final /* bridge */ /* synthetic */ void ql(Object obj) {
    }

    public final void t(String str, String str2) {
        this.a.put(str, str2);
    }
}
