package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aavo extends aaru {
    public String a;
    public List b;

    public aavo(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("share/get_old_share_panel", ajoyVar, afsxVar, null, null, null);
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arkz.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arkz arkzVar = (arkz) createBuilder.instance;
        str.getClass();
        arkzVar.b |= 2;
        arkzVar.d = str;
        List list = this.b;
        if (list != null) {
            createBuilder.copyOnWrite();
            arkz arkzVar2 = (arkz) createBuilder.instance;
            aonu aonuVar = arkzVar2.e;
            if (!aonuVar.c()) {
                arkzVar2.e = aonm.mutableCopy(aonuVar);
            }
            aolo.addAll((Iterable) list, (List) arkzVar2.e);
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        this.a.getClass();
    }
}
