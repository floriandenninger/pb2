package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aavp extends aaru {
    public String a;
    public List b;
    public String c;
    public int d;

    public aavp(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("share/get_share_panel", ajoyVar, afsxVar, 3, (byte[]) null, (byte[]) null, (byte[]) null);
        k();
    }

    public static String d(String str, List list, String str2) {
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(num);
            }
        }
        afpi afpiVar = new afpi();
        afpiVar.c("serviceName", "share/get_share_panel");
        afpiVar.c("serializedSharedEntity", str);
        afpiVar.c("installedSharingServiceIds", sb.toString());
        if (str2 != null) {
            afpiVar.c("sheetId", str2);
        }
        return afpiVar.a();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arlb.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arlb arlbVar = (arlb) createBuilder.instance;
        str.getClass();
        arlbVar.b |= 2;
        arlbVar.d = str;
        int i = this.d;
        createBuilder.copyOnWrite();
        arlb arlbVar2 = (arlb) createBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        arlbVar2.f = i2;
        arlbVar2.b |= 8;
        List list = this.b;
        if (list != null) {
            createBuilder.copyOnWrite();
            arlb arlbVar3 = (arlb) createBuilder.instance;
            aonu aonuVar = arlbVar3.e;
            if (!aonuVar.c()) {
                arlbVar3.e = aonm.mutableCopy(aonuVar);
            }
            aolo.addAll((Iterable) list, (List) arlbVar3.e);
        }
        String str2 = this.c;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            arlb arlbVar4 = (arlb) createBuilder.instance;
            arlbVar4.b |= 16;
            arlbVar4.g = str2;
        }
        return createBuilder;
    }

    @Override // defpackage.aaqh
    public final String b() {
        return d(this.a, this.b, this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        this.a.getClass();
    }
}
