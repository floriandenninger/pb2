package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eyl implements afwx {
    final /* synthetic */ eym a;
    private final String b;
    private final List c;
    private final Object d;

    public eyl(eym eymVar, String str, List list, Object obj) {
        this.a = eymVar;
        zhq.m(str);
        this.b = str;
        this.c = list;
        this.d = obj;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zga.d("Error editing the playlist", cnqVar);
        this.a.b.e(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        jvr jvrVar;
        arzb arzbVar = (arzb) obj;
        if (arzbVar.f.size() > 0) {
            ((aahd) this.a.a.get()).e(arzbVar.f, this.d);
        }
        Iterator it = this.c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            int bC = anaf.bC(((auau) it.next()).c);
            if (bC == 0) {
                bC = 1;
            }
            int i = bC - 1;
            if (i == 1 || i == 2 || i == 14) {
                z = true;
            }
        }
        if (z && (jvrVar = this.a.c) != null) {
            String str = this.b;
            zhq.m(str);
            if (((agzz) jvrVar.a.get()).c() && ((agof) jvrVar.b.get()).a().i().e(str) != null) {
                jvrVar.a(str);
            }
        }
        if ((arzbVar.b & 256) != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.d);
            aahd aahdVar = (aahd) this.a.a.get();
            apxf apxfVar = arzbVar.h;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, hashMap);
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
