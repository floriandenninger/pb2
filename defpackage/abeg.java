package defpackage;

import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abeg extends aaru {
    public String a;
    public String b;
    public List c;
    private List d;

    public abeg(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("ypc/cancel_recurrence", ajoyVar, afsxVar, null, null, null);
        this.a = "";
        this.b = "";
        this.d = null;
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        zhq.m(((asft) a().build()).d);
    }

    public final void d(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.d = list;
    }

    @Override // defpackage.aaru
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final aone a() {
        aone createBuilder = asft.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asft asftVar = (asft) createBuilder.instance;
        str.getClass();
        asftVar.b |= 2;
        asftVar.d = str;
        if (!TextUtils.isEmpty(this.b)) {
            String str2 = this.b;
            createBuilder.copyOnWrite();
            asft asftVar2 = (asft) createBuilder.instance;
            str2.getClass();
            asftVar2.b |= 8;
            asftVar2.f = str2;
        }
        aone createBuilder2 = awhh.a.createBuilder();
        List list = this.d;
        if (list != null) {
            createBuilder2.copyOnWrite();
            awhh awhhVar = (awhh) createBuilder2.instance;
            aony aonyVar = awhhVar.b;
            if (!aonyVar.c()) {
                awhhVar.b = aonm.mutableCopy(aonyVar);
            }
            aolo.addAll((Iterable) list, (List) awhhVar.b);
        }
        List list2 = this.c;
        if (list2 != null) {
            createBuilder2.copyOnWrite();
            awhh awhhVar2 = (awhh) createBuilder2.instance;
            aony aonyVar2 = awhhVar2.c;
            if (!aonyVar2.c()) {
                awhhVar2.c = aonm.mutableCopy(aonyVar2);
            }
            aolo.addAll((Iterable) list2, (List) awhhVar2.c);
        }
        createBuilder.copyOnWrite();
        asft asftVar3 = (asft) createBuilder.instance;
        awhh awhhVar3 = (awhh) createBuilder2.build();
        awhhVar3.getClass();
        asftVar3.e = awhhVar3;
        asftVar3.b |= 4;
        return createBuilder;
    }
}
