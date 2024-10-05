package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amhz implements amiz, uyl {
    private final amhh a;

    public amhz(amhh amhhVar) {
        this.a = amhhVar;
    }

    @Override // defpackage.uyl
    public final anhy a() {
        if (this.a.a().isEmpty()) {
            return anhv.a;
        }
        int i = 0;
        int i2 = 0;
        for (amjm amjmVar : ((amrz) this.a.a()).values()) {
            int i3 = i2 + 1;
            StringBuilder sb = new StringBuilder(18);
            sb.append("Trace: ");
            sb.append(i2);
            Log.println(4, "trace_manager", sb.toString());
            if ((amjmVar.b & 16) != 0) {
                amhq amhqVar = amjmVar.h;
                if (amhqVar == null) {
                    amhqVar = amhq.a;
                }
                if ((amhqVar.b & 2) != 0) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[2];
                    objArr[i] = ((amik) amjmVar.e.get(i)).c;
                    amho amhoVar = amhqVar.d;
                    if (amhoVar == null) {
                        amhoVar = amho.a;
                    }
                    objArr[1] = Integer.valueOf(amhoVar.d);
                    Log.println(4, "trace_manager", String.format(locale, "Trace %s timed out before completion. %s spans remaining", objArr));
                }
                if ((amhqVar.b & 1) != 0) {
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = new Object[2];
                    objArr2[i] = ((amik) amjmVar.e.get(i)).c;
                    amhp amhpVar = amhqVar.c;
                    if (amhpVar == null) {
                        amhpVar = amhp.a;
                    }
                    objArr2[1] = Integer.valueOf(amhpVar.c);
                    Log.println(4, "trace_manager", String.format(locale2, "Trace %s tried to log too many spans. %s spans dropped", objArr2));
                }
            }
            aee aeeVar = new aee();
            Iterator it = amjmVar.e.iterator();
            while (it.hasNext()) {
                aeeVar.k(r10.d, (amik) it.next());
            }
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < aeeVar.c(); i4++) {
                amik amikVar = (amik) aeeVar.h(i4);
                long j = amikVar.d;
                long j2 = amikVar.g;
                StringBuilder sb2 = new StringBuilder(23);
                sb2.append(j2);
                sb2.append(" ms");
                String sb3 = sb2.toString();
                while (true) {
                    amik amikVar2 = (amik) aeeVar.f(j);
                    if (amikVar2 == null) {
                        String valueOf = String.valueOf(sb3);
                        sb3 = valueOf.length() != 0 ? "Orphaned Root > ".concat(valueOf) : new String("Orphaned Root > ");
                    } else {
                        j = amikVar2.e;
                        String str = amikVar2.c;
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(sb3).length());
                        sb4.append(str);
                        sb4.append(" > ");
                        sb4.append(sb3);
                        sb3 = sb4.toString();
                        if (j != -1) {
                        }
                    }
                }
                arrayList.add(String.format(Locale.US, "%06d\t%s", Long.valueOf(amikVar.f), sb3));
            }
            Collections.sort(arrayList);
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                Log.println(4, "trace_manager", (String) arrayList.get(i5));
            }
            i2 = i3;
            i = 0;
        }
        return anhv.a;
    }

    @Override // defpackage.amiz
    public final void b() {
    }
}
