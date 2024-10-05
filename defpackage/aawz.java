package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aawz extends aaru {
    public String a;
    public Boolean b;
    public Long c;
    private final ArrayList d;
    private Boolean s;

    public aawz(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("feedback", ajoyVar, afsxVar, null, null, null);
        this.d = new ArrayList();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arqd.a.createBuilder();
        ArrayList arrayList = this.d;
        createBuilder.copyOnWrite();
        arqd arqdVar = (arqd) createBuilder.instance;
        aony aonyVar = arqdVar.d;
        if (!aonyVar.c()) {
            arqdVar.d = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) arrayList, (List) arqdVar.d);
        Boolean bool = this.b;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            createBuilder.copyOnWrite();
            arqd arqdVar2 = (arqd) createBuilder.instance;
            arqdVar2.b |= 8;
            arqdVar2.g = booleanValue;
        }
        Boolean bool2 = this.s;
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            createBuilder.copyOnWrite();
            arqd arqdVar3 = (arqd) createBuilder.instance;
            arqdVar3.b |= 2;
            arqdVar3.e = booleanValue2;
        }
        aone createBuilder2 = arqa.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder2.copyOnWrite();
            arqa arqaVar = (arqa) createBuilder2.instance;
            str.getClass();
            arqaVar.b |= 1;
            arqaVar.e = str;
        }
        Long l = this.c;
        if (l != null) {
            long longValue = l.longValue();
            createBuilder2.copyOnWrite();
            arqa arqaVar2 = (arqa) createBuilder2.instance;
            arqaVar2.c = 2;
            arqaVar2.d = Long.valueOf(longValue);
        }
        createBuilder.copyOnWrite();
        arqd arqdVar4 = (arqd) createBuilder.instance;
        arqa arqaVar3 = (arqa) createBuilder2.build();
        arqaVar3.getClass();
        arqdVar4.f = arqaVar3;
        arqdVar4.b |= 4;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.E(this.d.size() > 0);
    }

    public final void d(String str) {
        this.d.add(str);
    }

    public final void e(boolean z) {
        this.s = Boolean.valueOf(z);
    }
}
