package defpackage;

import android.content.Context;
import com.google.research.xeno.effect.Effect;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zum implements zty {
    public static final amrz a = amrz.m("PRESETS", avwx.EFFECT_SUBPACKAGE_ID_PRESET, "EXPRESSIVE", avwx.EFFECT_SUBPACKAGE_ID_EXPRESSIVE, "UNSPECIFIED", avwx.EFFECT_SUBPACKAGE_ID_UNSPECIFIED);
    public final ztz b;
    public boolean d;
    public zsi k;
    public zst m;
    private final agcm n;
    public final Object c = new Object();
    public final zuo e = new zuo();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();
    public final Object j = new Object();
    public final zui l = new zui();

    static {
        zpb.a();
    }

    public zum(Context context, ysl yslVar, hrv hrvVar, zuf zufVar, agcm agcmVar, byte[] bArr) {
        this.n = agcmVar;
        ztz ztzVar = new ztz(context, yslVar, this, true, zufVar);
        this.b = ztzVar;
        ztzVar.i = hrvVar.l();
    }

    public final Effect a(String str) {
        String d = amkq.d(str);
        if (this.h.containsKey(d)) {
            return (Effect) this.h.get(d);
        }
        return null;
    }

    public final void b() {
        if (this.m == null || !this.d || this.g.isEmpty()) {
            return;
        }
        zst zstVar = this.m;
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = this.g;
        HashMap hashMap = this.i;
        agcm agcmVar = this.n;
        ztd ztdVar = zstVar.a;
        zum zumVar = zstVar.b;
        synchronized (ztdVar.e) {
            if (ztdVar.c) {
                zga.b("EffectsSettings already set, not setting XenoEffectsLoader Settings.");
            } else {
                ztdVar.c = true;
                ztdVar.h.f(zumVar.b);
                synchronized (zumVar.j) {
                    zumVar.k = ztdVar;
                }
                ztdVar.l(EnumSet.noneOf(avwy.class));
                synchronized (ztdVar.j) {
                    ztdVar.f = amrz.j(hashMap);
                    wcy.z(ztdVar.j, hashMap);
                    ztdVar.j.clear();
                }
                synchronized (ztdVar.l) {
                    ztdVar.x = true;
                    wcy.z(ztdVar.l, null);
                    ztdVar.l.clear();
                }
                ztdVar.r(arrayList, arrayList2, agcmVar);
            }
        }
        this.m = null;
    }

    public final void c(avcy avcyVar) {
        new zuk(this, avcyVar).execute(new Void[0]);
    }

    @Override // defpackage.zty
    public final void d(String str, String str2) {
        zuo zuoVar = this.e;
        synchronized (zuoVar.a) {
            Iterator it = zuoVar.b.iterator();
            while (it.hasNext()) {
                zun zunVar = (zun) it.next();
                if (zunVar.b.contains(str)) {
                    zunVar.c.put(str, str2);
                    zunVar.b.remove(str);
                    if (zunVar.b.isEmpty()) {
                        zunVar.a.onCompletion(zunVar.c, new HashMap());
                        it.remove();
                    }
                }
            }
        }
        synchronized (this.j) {
            zsi zsiVar = this.k;
            if (zsiVar != null) {
                zsiVar.a(str2);
            }
        }
    }

    public final void e() {
        zui zuiVar = this.l;
        if (zuiVar.c && zuiVar.a == zuiVar.b) {
            new zul(this.b).execute(new Void[0]);
        }
    }
}
