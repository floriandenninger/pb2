package defpackage;

import android.net.Uri;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zjw implements afwx {
    final /* synthetic */ zjx a;
    private final Collection b;
    private final zjz c;

    public zjw(zjx zjxVar, Collection collection, zjz zjzVar) {
        this.a = zjxVar;
        this.b = collection;
        this.c = zjzVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zga.b(String.format(Locale.US, "GetDataSyncNodesResponse: %s", cnqVar.getMessage()));
        zjz zjzVar = this.c;
        if (zjzVar == null || this.b == null) {
            return;
        }
        new zjy(true);
        zjzVar.a();
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        aqig aqigVar;
        aror arorVar = (aror) obj;
        boolean z = (this.b == null || this.c == null) ? false : true;
        zjx zjxVar = this.a;
        if ((arorVar.b & 2) != 0) {
            aqigVar = arorVar.d;
            if (aqigVar == null) {
                aqigVar = aqig.a;
            }
        } else {
            aqigVar = null;
        }
        zjxVar.a(aqigVar);
        HashMap hashMap = z ? new HashMap() : null;
        for (arop aropVar : arorVar.e) {
            zga.b(String.format(Locale.US, "GetDataSyncNodesResponse: path=%s,  error=%s", aropVar.b, aropVar.c));
            if (hashMap != null) {
                hashMap.put(Uri.parse(aropVar.b), aropVar.c);
            }
        }
        if (z) {
            zjz zjzVar = this.c;
            new zjy(false);
            zjzVar.a();
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
