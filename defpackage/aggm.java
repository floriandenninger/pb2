package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aggm implements Runnable {
    public final /* synthetic */ aggn a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ aggm(aggn aggnVar, String str, int i) {
        this.c = i;
        this.a = aggnVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            aggn aggnVar = this.a;
            String str = this.b;
            if (aggnVar.g.z()) {
                aggnVar.e(str);
                return;
            }
            return;
        }
        if (i == 1) {
            aggn aggnVar2 = this.a;
            String str2 = this.b;
            if (aggnVar2.g.z()) {
                ((agil) aggnVar2.f.get()).K(str2);
                aggnVar2.d(str2);
                return;
            }
            return;
        }
        if (i == 2) {
            aggn aggnVar3 = this.a;
            String str3 = this.b;
            if (aggnVar3.g.z()) {
                aggnVar3.c(str3);
                aggnVar3.d(str3);
                return;
            }
            return;
        }
        aggn aggnVar4 = this.a;
        String str4 = this.b;
        if (aggnVar4.g.z()) {
            yjk.e();
            aghc aghcVar = (aghc) aggnVar4.i.get();
            yjk.e();
            if (aghcVar.h.z()) {
                agil agilVar = (agil) aghcVar.k.get();
                if (agilVar.c(str4) != null) {
                    try {
                        agnp a = ((agrq) aghcVar.g.get()).a(str4);
                        if (agilVar.H(a)) {
                            ((ajoy) aghcVar.m.get()).i(a);
                            aghcVar.q(str4);
                            aghcVar.o();
                        }
                    } catch (ExecutionException e) {
                        StringBuilder sb = new StringBuilder(str4.length() + 46);
                        sb.append("[Offline] Failed requesting video ");
                        sb.append(str4);
                        sb.append(" for offline");
                        zga.d(sb.toString(), e);
                    }
                }
            }
            yjk.e();
            if (((agil) aggnVar4.f.get()).p(str4) == null) {
                zga.b(str4.length() != 0 ? "[Offline] Refresh video failed because snapshot invalid for ".concat(str4) : new String("[Offline] Refresh video failed because snapshot invalid for "));
            } else {
                if (str4.length() != 0) {
                    "[Offline] Updating offlined video ".concat(str4);
                }
                ((aghj) aggnVar4.h.get()).d(str4, true);
            }
            amxd listIterator = ((amvs) aggnVar4.j).listIterator();
            while (listIterator.hasNext()) {
                agsu agsuVar = (agsu) listIterator.next();
                agsuVar.a();
            }
        }
    }
}
