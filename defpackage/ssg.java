package defpackage;

import com.google.android.libraries.elements.interfaces.DebuggerClient;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ssg implements sww {
    public final azrw a;
    private final amru b;
    private final amsx c;
    private final swy d;
    private final ssi e;
    private final boolean f;
    private final boolean g;
    private final ayqi h;
    private final azrw i;
    private final ammv j;

    public ssg(Map map, Set set, swy swyVar, syd sydVar, ssi ssiVar, azrw azrwVar, azrw azrwVar2, ammv ammvVar, ammv ammvVar2, ammv ammvVar3, ayqi ayqiVar, azrw azrwVar3) {
        amru g;
        amqp<swv> b = amqp.b(((amrz) map).values(), set);
        HashSet hashSet = new HashSet();
        amsv i = amsx.i();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            aomu a = ((swv) it.next()).a();
            if (!hashSet.add(a)) {
                i.c(a);
                int a2 = a.a();
                StringBuilder sb = new StringBuilder(57);
                sb.append("Multiple command handlers found for extension ");
                sb.append(a2);
                sydVar.b(27, sb.toString());
            }
        }
        amsx g2 = i.g();
        this.c = g2;
        if (g2.isEmpty()) {
            amrp f = amru.f();
            f.j(b);
            e(f, azrwVar3);
            g = f.g();
        } else {
            amrp f2 = amru.f();
            for (swv swvVar : b) {
                if (!g2.contains(swvVar.a())) {
                    f2.h(swvVar);
                }
            }
            e(f2, azrwVar3);
            g = f2.g();
        }
        this.b = g;
        this.d = swyVar;
        this.e = ssiVar;
        this.f = ((Boolean) ammvVar.e(false)).booleanValue();
        this.a = azrwVar2;
        this.i = azrwVar;
        this.g = ((Boolean) ammvVar2.e(false)).booleanValue();
        this.j = ammvVar3;
        this.h = ayqiVar;
    }

    public static ayph a(swv swvVar, awnw awnwVar, swu swuVar) {
        return swvVar.b(awnwVar.pX(swvVar.a()), swuVar);
    }

    private static void e(amrp amrpVar, azrw azrwVar) {
        amru g = amrpVar.g();
        int i = ((amvj) g).c;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            if (((swv) g.get(i2)).a().a() == 342268478) {
                return;
            } else {
                i2 = i3;
            }
        }
        amrpVar.h((swv) azrwVar.get());
    }

    @Override // defpackage.sww
    public final /* synthetic */ ayph b(awnw awnwVar, swu swuVar) {
        return d(awnwVar, swuVar, 2);
    }

    public final void c(awsn awsnVar, sxa sxaVar, Throwable th) {
        if (sxaVar != null) {
            sxaVar.a(th != null);
        }
        if (awsnVar != null) {
            awsh a = awsi.a();
            a.copyOnWrite();
            ((awsi) a.instance).d(awsnVar);
            awsi awsiVar = (awsi) a.build();
            DebuggerClient debuggerClient = (DebuggerClient) this.a.get();
            awsv a2 = awsw.a();
            aoqa d = svv.d();
            a2.copyOnWrite();
            ((awsw) a2.instance).p(d);
            a2.copyOnWrite();
            ((awsw) a2.instance).j(awsiVar);
            debuggerClient.sendTimelineEvent(((awsw) a2.build()).toByteArray());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    @Override // defpackage.sww
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ayph d(final defpackage.awnw r15, defpackage.swu r16, int r17) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssg.d(awnw, swu, int):ayph");
    }
}
