package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akbs implements akbl {
    final /* synthetic */ akbl a;
    final /* synthetic */ arej b;
    final /* synthetic */ Object c;
    final /* synthetic */ acra d;
    final /* synthetic */ boolean e;
    final /* synthetic */ akbu f;

    public akbs(akbu akbuVar, akbl akblVar, arej arejVar, Object obj, acra acraVar, boolean z) {
        this.f = akbuVar;
        this.a = akblVar;
        this.b = arejVar;
        this.c = obj;
        this.d = acraVar;
        this.e = z;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
        akcj akcjVar = (akcj) obj;
        akbl akblVar = this.a;
        if (akblVar != null) {
            akblVar.li(akcjVar, i);
        }
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
        byte[] bArr;
        arec arecVar;
        akcj akcjVar = (akcj) obj;
        akbl akblVar = this.a;
        if (akblVar != null) {
            akblVar.lj(akcjVar);
        }
        akbu akbuVar = this.f;
        arej arejVar = this.b;
        Object obj2 = this.c;
        acra acraVar = this.d;
        if (!this.e) {
            akbuVar.c.add(new Pair(arejVar, obj2));
            gnn gnnVar = akbuVar.f;
            String b = gnn.b(arejVar);
            SharedPreferences.Editor putLong = gnnVar.a.edit().putLong(b, gnnVar.a.getLong(b, 0L) + 1).putLong(gnn.a(arejVar), gnnVar.b.c());
            if ((arejVar.b & 64) != 0) {
                aref arefVar = arejVar.i;
                if (arefVar == null) {
                    arefVar = aref.a;
                }
                int dU = amkq.dU(arefVar.b);
                if (dU != 0 && dU == 4) {
                    putLong.remove("add_to_long_press_hint_trigger_video_id");
                }
            }
            putLong.apply();
            if (arejVar.j.size() != 0) {
                for (apxf apxfVar : arejVar.j) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", arejVar);
                    akbuVar.a.c(apxfVar, hashMap);
                }
            }
        }
        if ((arejVar.b & 2) != 0) {
            areg aregVar = arejVar.d;
            if (aregVar == null) {
                aregVar = areg.a;
            }
            if (aregVar.b == 106514900) {
                areg aregVar2 = arejVar.d;
                if (aregVar2 == null) {
                    aregVar2 = areg.a;
                }
                if (aregVar2.b == 106514900) {
                    arecVar = (arec) aregVar2.c;
                } else {
                    arecVar = arec.a;
                }
                bArr = arecVar.h.I();
                if (acraVar != null || bArr == null) {
                }
                acraVar.u(new acqx(bArr), null);
                return;
            }
        }
        bArr = null;
        if (acraVar != null) {
        }
    }
}
