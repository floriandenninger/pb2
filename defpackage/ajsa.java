package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajsa {
    public final Map a = new HashMap();
    private final Map b = new HashMap();
    private Pattern c;

    public final aqyg a(asrh asrhVar) {
        aong aongVar = (aong) aqyg.a.createBuilder();
        int size = asrhVar.c.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                aong aongVar2 = (aong) aqyi.a.createBuilder();
                asri asriVar = (asri) asrhVar.c.get(i);
                if ((asriVar.b == 1 ? (String) asriVar.c : "").isEmpty()) {
                    asri asriVar2 = (asri) asrhVar.c.get(i);
                    if (!(asriVar2.b == 2 ? (String) asriVar2.c : "").isEmpty()) {
                        aonk aonkVar = aqss.b;
                        Map map = this.a;
                        asri asriVar3 = (asri) asrhVar.c.get(i);
                        aongVar2.e(aonkVar, (aqss) map.get(asriVar3.b == 2 ? (String) asriVar3.c : ""));
                    }
                } else {
                    asri asriVar4 = (asri) asrhVar.c.get(i);
                    String str = asriVar4.b == 1 ? (String) asriVar4.c : "";
                    aongVar2.copyOnWrite();
                    aqyi aqyiVar = (aqyi) aongVar2.instance;
                    str.getClass();
                    aqyiVar.b |= 1;
                    aqyiVar.c = str;
                }
                aongVar.cw(aongVar2);
            }
        }
        boolean z = asrhVar.d;
        aongVar.copyOnWrite();
        aqyg aqygVar = (aqyg) aongVar.instance;
        aqygVar.b = 2 | aqygVar.b;
        aqygVar.e = z;
        return (aqyg) aongVar.build();
    }

    public final avgg b(String str) {
        if (!this.a.containsKey(str)) {
            return null;
        }
        avgg avggVar = ((aqss) this.a.get(str)).f;
        return avggVar == null ? avgg.a : avggVar;
    }

    public final String c(String str) {
        if (!this.a.containsKey(str) || (((aqss) this.a.get(str)).c & 4) == 0) {
            return null;
        }
        avgg avggVar = ((aqss) this.a.get(str)).f;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        if ((avggVar.b & 4) == 0) {
            return null;
        }
        avgg avggVar2 = ((aqss) this.a.get(str)).f;
        if (avggVar2 == null) {
            avggVar2 = avgg.a;
        }
        aott aottVar = avggVar2.d;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        if ((aottVar.b & 1) == 0) {
            return null;
        }
        avgg avggVar3 = ((aqss) this.a.get(str)).f;
        if (avggVar3 == null) {
            avggVar3 = avgg.a;
        }
        aott aottVar2 = avggVar3.d;
        if (aottVar2 == null) {
            aottVar2 = aott.a;
        }
        aots aotsVar = aottVar2.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        return aotsVar.c;
    }

    public final String d(String str) {
        if (this.b.containsKey(str.toLowerCase(Locale.ROOT))) {
            return (String) this.b.get(str.toLowerCase(Locale.ROOT));
        }
        return null;
    }

    public final String e(String str) {
        aqss aqssVar = (aqss) this.a.get(str);
        return aqssVar == null ? "" : aqssVar.g ? (this.a.get(str) == null || ((aqss) this.a.get(str)).e.size() <= 0 || TextUtils.isEmpty((String) ((aqss) this.a.get(str)).e.get(0))) ? " " : (String) ((aqss) this.a.get(str)).e.get(0) : str;
    }

    public final Pattern f() {
        if (this.b.isEmpty()) {
            return null;
        }
        return this.c;
    }

    public final void g(List list) {
        this.c = null;
        this.a.clear();
        this.b.clear();
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            aqss aqssVar = (aqss) list.get(i);
            this.a.put(aqssVar.d, aqssVar);
            if (!aqssVar.h) {
                for (String str : aqssVar.e) {
                    if (aqssVar.g) {
                        this.b.put(str.toLowerCase(Locale.ROOT), aqssVar.d);
                        String replaceAll = str.replaceAll("([^a-zA-Z0-9 :_-])", "\\\\$1");
                        StringBuilder sb = new StringBuilder(String.valueOf(replaceAll).length() + 2);
                        sb.append("(");
                        sb.append(replaceAll);
                        sb.append(")");
                        arrayList.add(sb.toString());
                    }
                }
            }
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.c = Pattern.compile(TextUtils.join("|", arrayList), 10);
    }

    public final boolean h() {
        return this.c != null;
    }
}
