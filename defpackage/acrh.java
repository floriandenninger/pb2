package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrh {
    private static final Random d = new Random();
    public final Map a;
    public final boolean b;
    public final Set c;
    private final aaea e;

    public acrh(SharedPreferences sharedPreferences, ywr ywrVar, acpl acplVar, aaea aaeaVar) {
        sharedPreferences.getClass();
        ywrVar.getClass();
        acplVar.getClass();
        this.a = new HashMap();
        this.e = aaeaVar;
        this.b = false;
        this.c = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(awav awavVar) {
        owc owcVar;
        if (awavVar == null) {
            return 0;
        }
        if (awavVar.c.d() <= 0) {
            return awavVar.d;
        }
        try {
            owcVar = (owc) aonm.parseFrom(owc.a, awavVar.c, aomw.b());
        } catch (aoob unused) {
            zga.b("Failed to parse tracking params");
            owcVar = owc.a;
        }
        return owcVar.c;
    }

    static String g(int i, int i2) {
        StringBuilder sb = new StringBuilder(28);
        sb.append("VE (");
        sb.append(i);
        sb.append(":");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i(acsc acscVar) {
        return g(acscVar.a, 0);
    }

    public static String j(awav awavVar) {
        if (awavVar == null) {
            return null;
        }
        return g(a(awavVar), awavVar.f);
    }

    public static void l(String str, String str2) {
        ammr.b(" ").e(str, str2, "\nSee go/yt-il-debug-mode on how to address this issue.");
    }

    private static final String n(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(j((awav) it.next()));
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(awav awavVar, awav awavVar2, String str) {
        if (f()) {
            return;
        }
        List<awav> asList = Arrays.asList(awavVar);
        HashMap hashMap = new HashMap();
        hashMap.put("client.params.parentVe", j(awavVar2));
        hashMap.put("client.params.childVe", n(asList));
        if (TextUtils.isEmpty(str)) {
            String j = j(awavVar2);
            String n = n(asList);
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 22 + String.valueOf(n).length());
            sb.append("parent_ve: ");
            sb.append(j);
            sb.append("child_ves: ");
            sb.append(n);
            l("INTERACTIONLOGGINGBUG->ATTACH_CHILD_MISSING_CSN", sb.toString());
            afsi.f("INTERACTIONLOGGINGBUG->ATTACH_CHILD_MISSING_CSN", hashMap);
            return;
        }
        if (!this.a.containsKey(str)) {
            String j2 = j(awavVar2);
            String n2 = n(asList);
            StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 22 + String.valueOf(n2).length());
            sb2.append("parent_ve: ");
            sb2.append(j2);
            sb2.append("child_ves: ");
            sb2.append(n2);
            l("INTERACTIONLOGGINGBUG->ATTACH_CHILD_UNRESOLVED_CSN", sb2.toString());
            afsi.f("INTERACTIONLOGGINGBUG->ATTACH_CHILD_UNRESOLVED_CSN", hashMap);
            return;
        }
        acrg acrgVar = (acrg) this.a.get(str);
        hashMap.put("client.params.pageVe", i(acrgVar.a));
        if (!acrgVar.c(awavVar2, "PARENT_VE_IN_ATTACH")) {
            afsi.f(acrg.a("PARENT_VE_IN_ATTACH"), hashMap);
            return;
        }
        for (awav awavVar3 : asList) {
            if (!((acrg) this.a.get(str)).b(awavVar3)) {
                afsi.f("INTERACTIONLOGGINGBUG->MULTIPLE_ATTACH", hashMap);
                acsc acscVar = acrgVar.a;
                a(awavVar3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(asgs asgsVar) {
        if (f()) {
            return;
        }
        int i = asgsVar.f;
        HashMap hashMap = new HashMap();
        awav awavVar = asgsVar.d;
        if (awavVar == null) {
            awavVar = awav.a;
        }
        hashMap.put("client.params.ve", j(awavVar));
        if ((asgsVar.b & 1) == 0 || asgsVar.c.isEmpty()) {
            awav awavVar2 = asgsVar.d;
            if (awavVar2 == null) {
                awavVar2 = awav.a;
            }
            String valueOf = String.valueOf(j(awavVar2));
            l("INTERACTIONLOGGINGBUG->HIDE_MISSING_CSN", valueOf.length() != 0 ? "ve: ".concat(valueOf) : new String("ve: "));
            afsi.f("INTERACTIONLOGGINGBUG->HIDE_MISSING_CSN", hashMap);
            return;
        }
        if (!this.a.containsKey(asgsVar.c)) {
            awav awavVar3 = asgsVar.d;
            if (awavVar3 == null) {
                awavVar3 = awav.a;
            }
            String valueOf2 = String.valueOf(j(awavVar3));
            l("INTERACTIONLOGGINGBUG->HIDE_UNRESOLVED_CSN", valueOf2.length() != 0 ? "ve: ".concat(valueOf2) : new String("ve: "));
            afsi.f("INTERACTIONLOGGINGBUG->HIDE_UNRESOLVED_CSN", hashMap);
            return;
        }
        acrg acrgVar = (acrg) this.a.get(asgsVar.c);
        awav awavVar4 = asgsVar.d;
        if (awavVar4 == null) {
            awavVar4 = awav.a;
        }
        m("HIDDEN", acrgVar, awavVar4, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(asgt asgtVar) {
        if (f()) {
            return;
        }
        int i = asgtVar.f;
        HashMap hashMap = new HashMap();
        awav awavVar = asgtVar.d;
        if (awavVar == null) {
            awavVar = awav.a;
        }
        hashMap.put("client.params.ve", j(awavVar));
        if ((asgtVar.b & 1) == 0 || asgtVar.c.isEmpty()) {
            awav awavVar2 = asgtVar.d;
            if (awavVar2 == null) {
                awavVar2 = awav.a;
            }
            String valueOf = String.valueOf(j(awavVar2));
            l("INTERACTIONLOGGINGBUG->SHOW_MISSING_CSN", valueOf.length() != 0 ? "ve: ".concat(valueOf) : new String("ve: "));
            afsi.f("INTERACTIONLOGGINGBUG->SHOW_MISSING_CSN", hashMap);
            return;
        }
        if (!this.a.containsKey(asgtVar.c)) {
            awav awavVar3 = asgtVar.d;
            if (awavVar3 == null) {
                awavVar3 = awav.a;
            }
            String valueOf2 = String.valueOf(j(awavVar3));
            l("INTERACTIONLOGGINGBUG->SHOW_UNRESOLVED_CSN", valueOf2.length() != 0 ? "ve: ".concat(valueOf2) : new String("ve: "));
            afsi.f("INTERACTIONLOGGINGBUG->SHOW_UNRESOLVED_CSN", hashMap);
            return;
        }
        acrg acrgVar = (acrg) this.a.get(asgtVar.c);
        awav awavVar4 = asgtVar.d;
        if (awavVar4 == null) {
            awavVar4 = awav.a;
        }
        m("SHOWN", acrgVar, awavVar4, hashMap);
    }

    public final boolean e(asgo asgoVar) {
        return ((asgoVar.b & 2) == 0 || asgoVar.d.isEmpty()) ? false : true;
    }

    public final boolean f() {
        float nextFloat = d.nextFloat() * 100.0f;
        asuj asujVar = this.e.a().m;
        if (asujVar == null) {
            asujVar = asuj.a;
        }
        asiu asiuVar = asujVar.c;
        if (asiuVar == null) {
            asiuVar = asiu.a;
        }
        return nextFloat >= asiuVar.j;
    }

    public final boolean h(String str, acrg acrgVar, awav awavVar) {
        if (acrgVar.c(awavVar, str)) {
            return false;
        }
        acsc acscVar = acrgVar.a;
        a(awavVar);
        return true;
    }

    public final void k(String str, acsc acscVar, awav awavVar) {
        String g = g(acscVar.a, 0);
        String j = j(awavVar);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 15 + String.valueOf(g).length() + String.valueOf(j).length());
        sb.append(str);
        sb.append(" page_ve: ");
        sb.append(g);
        sb.append(" ve: ");
        sb.append(j);
    }

    public final void m(String str, acrg acrgVar, awav awavVar, Map map) {
        if (h(str, acrgVar, awavVar)) {
            String a = acrg.a(str);
            k(acrg.a(str), acrgVar.a, awavVar);
            afsi.f(a, map);
        }
    }
}
