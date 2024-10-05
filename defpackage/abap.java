package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abap extends aaru {
    public String a;
    public String b;
    public int c;
    private String d;
    private final List s;

    /* JADX INFO: Access modifiers changed from: protected */
    public abap(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("playlist/create", ajoyVar, afsxVar, null, null, null);
        this.c = 1;
        this.s = new ArrayList();
    }

    @Override // defpackage.aaru
    public final /* synthetic */ aoox a() {
        aone createBuilder = arzf.a.createBuilder();
        String str = this.d;
        createBuilder.copyOnWrite();
        arzf arzfVar = (arzf) createBuilder.instance;
        str.getClass();
        arzfVar.b |= 4;
        arzfVar.d = str;
        if (TextUtils.isEmpty(null)) {
            if (this.s.isEmpty() || !TextUtils.isEmpty(this.a)) {
                if (this.s.isEmpty() && !TextUtils.isEmpty(this.a)) {
                    String str2 = this.a;
                    createBuilder.copyOnWrite();
                    arzf arzfVar2 = (arzf) createBuilder.instance;
                    str2.getClass();
                    arzfVar2.b |= 8;
                    arzfVar2.f = str2;
                }
            } else {
                List list = this.s;
                createBuilder.copyOnWrite();
                arzf arzfVar3 = (arzf) createBuilder.instance;
                aony aonyVar = arzfVar3.e;
                if (!aonyVar.c()) {
                    arzfVar3.e = aonm.mutableCopy(aonyVar);
                }
                aolo.addAll((Iterable) list, (List) arzfVar3.e);
            }
            int i = this.c;
            createBuilder.copyOnWrite();
            arzf arzfVar4 = (arzf) createBuilder.instance;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            arzfVar4.g = i2;
            arzfVar4.b |= 16;
            String str3 = this.b;
            if (str3 != null) {
                createBuilder.copyOnWrite();
                arzf arzfVar5 = (arzf) createBuilder.instance;
                arzfVar5.b |= 64;
                arzfVar5.h = str3;
            }
            return createBuilder;
        }
        createBuilder.copyOnWrite();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        boolean z = true;
        if (!this.s.isEmpty() && !TextUtils.isEmpty(this.a)) {
            z = false;
        }
        amkq.O(z, "CreatePlaylistServiceRequest can only have videoIds or sourcePlaylistId");
    }

    public final void d(String str) {
        this.s.add(str);
    }

    public final void e(String str) {
        this.d = i(str);
    }
}
