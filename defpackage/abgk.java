package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abgk extends ajmx {
    private final aakv h;
    public final ArrayList a = new ArrayList();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final Map f = new HashMap();
    private final Map g = new HashMap();
    public final ajol b = new ajol() { // from class: abgj
        @Override // defpackage.ajol
        public final void a(ajok ajokVar, ajng ajngVar, int i) {
            apxf i2;
            abgk abgkVar = abgk.this;
            if (i < 0 || i >= abgkVar.a.size() || (i2 = abgkVar.i((String) abgkVar.a.get(i))) == null) {
                return;
            }
            ajokVar.f("live_chat_item_action", i2);
        }
    };

    public abgk(aakv aakvVar) {
        this.h = aakvVar;
    }

    private static Object B(aspl asplVar) {
        int i = asplVar.b;
        if (i == 117300536) {
            return (asps) asplVar.c;
        }
        if (i == 129492606) {
            return (aspo) asplVar.c;
        }
        if (i == 165252689) {
            return (aspt) asplVar.c;
        }
        if (i == 130661514) {
            return (aspm) asplVar.c;
        }
        if (i == 232396290) {
            return (aspn) asplVar.c;
        }
        if (i == 132496275) {
            return (asqj) asplVar.c;
        }
        if (i == 146966970) {
            return (aspj) asplVar.c;
        }
        if (i == 146948953) {
            return (aspr) asplVar.c;
        }
        if (i == 133279312) {
            return (aspp) asplVar.c;
        }
        if (i == 197064214) {
            return (asqk) asplVar.c;
        }
        if (i == 251664483) {
            return (aspk) asplVar.c;
        }
        if (i == 153515154) {
            return (aqrf) asplVar.c;
        }
        return null;
    }

    private static String C(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof asps) {
            asps aspsVar = (asps) obj;
            if ((aspsVar.b & 1) != 0) {
                return aspsVar.c;
            }
            return null;
        }
        if (obj instanceof aspo) {
            return ((aspo) obj).c;
        }
        if (obj instanceof aspm) {
            return ((aspm) obj).c;
        }
        if (obj instanceof aspn) {
            return ((aspn) obj).e;
        }
        if (obj instanceof asqj) {
            return ((asqj) obj).e;
        }
        if (obj instanceof aspj) {
            return ((aspj) obj).c;
        }
        if (obj instanceof aspr) {
            aspr asprVar = (aspr) obj;
            if ((asprVar.b & 1) != 0) {
                return asprVar.c;
            }
            return null;
        }
        if (obj instanceof aspt) {
            return ((aspt) obj).e;
        }
        if (obj instanceof aspp) {
            aspp asppVar = (aspp) obj;
            if ((asppVar.b & 2) != 0) {
                return asppVar.d;
            }
            return null;
        }
        if (obj instanceof asqk) {
            asqk asqkVar = (asqk) obj;
            if ((asqkVar.b & 1) != 0) {
                return asqkVar.c;
            }
            return null;
        }
        if (obj instanceof aspk) {
            return ((aspk) obj).c;
        }
        if (!(obj instanceof aqrf)) {
            return null;
        }
        aqrg aqrgVar = ((aqrf) obj).d;
        if (aqrgVar == null) {
            aqrgVar = aqrg.a;
        }
        return aqrgVar.d;
    }

    private final synchronized void D(String str, Object obj) {
        if (obj instanceof aqrf) {
            obj = ajds.a((aqrf) obj);
        }
        this.d.put(str, obj);
    }

    private final synchronized void E(String str, apxf apxfVar, aqyg aqygVar, aqyg aqygVar2, boolean z) {
        aulq aulqVar;
        Object obj = this.d.get(str);
        if (obj instanceof aspm) {
            r(str, z);
            return;
        }
        if (obj instanceof aspj) {
            aspj aspjVar = (aspj) obj;
            aooy aooyVar = null;
            if ((aspjVar.b & 8) != 0) {
                aulqVar = aspjVar.d;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
            } else {
                aulqVar = null;
            }
            if (aulqVar != null) {
                aooy m = ahbj.m(aulqVar);
                if ((m instanceof asps) || (m instanceof aspo) || (m instanceof aspt) || (m instanceof aspm) || (m instanceof aspn) || (m instanceof asqj) || (m instanceof aspj) || (m instanceof aspr) || (m instanceof aspp) || (m instanceof asqk) || (m instanceof aspk) || (m instanceof aqrf)) {
                    aooyVar = m;
                }
                F(str, aooyVar, z);
            }
        }
        int indexOf = this.a.indexOf(str);
        if (indexOf >= 0) {
            if (obj instanceof ajds) {
                String obj2 = ajcq.b(aqygVar).toString();
                String obj3 = ajcq.b(aqygVar2).toString();
                String f = aalt.f(176, str);
                f.getClass();
                amkq.O(!f.isEmpty(), "key cannot be empty");
                aone createBuilder = avsm.a.createBuilder();
                createBuilder.copyOnWrite();
                avsm avsmVar = (avsm) createBuilder.instance;
                avsmVar.b |= 1;
                avsmVar.c = f;
                avsj avsjVar = new avsj(createBuilder);
                aone aoneVar = avsjVar.a;
                aoneVar.copyOnWrite();
                avsm avsmVar2 = (avsm) aoneVar.instance;
                obj2.getClass();
                avsmVar2.b |= 2;
                avsmVar2.d = obj2;
                Boolean bool = false;
                aone aoneVar2 = avsjVar.a;
                boolean booleanValue = bool.booleanValue();
                aoneVar2.copyOnWrite();
                avsm avsmVar3 = (avsm) aoneVar2.instance;
                avsmVar3.b |= 8;
                avsmVar3.f = booleanValue;
                if (!obj3.isEmpty()) {
                    aone aoneVar3 = avsjVar.a;
                    aoneVar3.copyOnWrite();
                    avsm avsmVar4 = (avsm) aoneVar3.instance;
                    obj3.getClass();
                    avsmVar4.b |= 4;
                    avsmVar4.e = obj3;
                }
                avsl b = avsjVar.b();
                aaio c = ((aaih) this.h).c();
                c.d(b);
                c.b().T();
            } else {
                this.e.put(str, apxfVar);
            }
            if (z) {
                w(indexOf);
            }
        }
    }

    private final synchronized boolean F(String str, Object obj, boolean z) {
        int indexOf = this.a.indexOf(str);
        if (!this.d.containsKey(str) || indexOf < 0) {
            return false;
        }
        String C = C(obj);
        if (C == null) {
            return false;
        }
        this.d.remove(str);
        this.e.remove(str);
        D(C, obj);
        this.a.set(indexOf, C);
        if (z) {
            w(indexOf);
        }
        return true;
    }

    public static String k(Object obj) {
        aulq aulqVar;
        if (obj instanceof asps) {
            return ((asps) obj).f;
        }
        if (obj instanceof aspm) {
            return ((aspm) obj).d;
        }
        if (obj instanceof aspn) {
            return ((aspn) obj).f;
        }
        if (obj instanceof asqj) {
            return ((asqj) obj).g;
        }
        if (obj instanceof asqk) {
            return ((asqk) obj).l;
        }
        if (obj instanceof asro) {
            return ((asro) obj).m;
        }
        if (obj instanceof asrp) {
            return ((asrp) obj).l;
        }
        if (obj instanceof asrm) {
            return ((asrm) obj).i;
        }
        if (obj instanceof aspj) {
            aspj aspjVar = (aspj) obj;
            if ((aspjVar.b & 8) != 0) {
                aulqVar = aspjVar.d;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
            } else {
                aulqVar = null;
            }
            if (aulqVar != null) {
                return k(ahbj.m(aulqVar));
            }
            return null;
        }
        if (!(obj instanceof ajds)) {
            return null;
        }
        aqrg aqrgVar = ((ajds) obj).a.d;
        if (aqrgVar == null) {
            aqrgVar = aqrg.a;
        }
        return aqrgVar.e;
    }

    public static String l(aspl asplVar) {
        return C(B(asplVar));
    }

    @Override // defpackage.ajng
    public final synchronized int a() {
        return this.a.size();
    }

    @Override // defpackage.ajng
    public final long b(int i) {
        return i;
    }

    @Override // defpackage.ajng
    public final synchronized Object c(int i) {
        return this.d.get((String) this.a.get(i));
    }

    @Override // defpackage.ajng
    public final synchronized boolean contains(Object obj) {
        throw null;
    }

    public final synchronized int h(int i) {
        String str = (String) this.a.get(i);
        if (str == null) {
            return 0;
        }
        return ((Integer) this.f.get(str)).intValue();
    }

    public final synchronized apxf i(String str) {
        return (apxf) this.e.get(str);
    }

    @Override // defpackage.ajng
    public final synchronized boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final synchronized Object j(String str) {
        return this.d.get(str);
    }

    public final synchronized void m(aspl asplVar, boolean z) {
        Object B = B(asplVar);
        String C = C(B);
        if (C != null && !this.d.containsKey(C)) {
            if (B != null) {
                D(C, B);
                this.a.add(C);
                if (z) {
                    int a = a();
                    yjk.f();
                    this.c.b(a - 1, 1);
                }
            }
        }
    }

    public final synchronized void n(String str, String str2) {
        this.g.put(str, str2);
    }

    public final synchronized void o(aspl asplVar, int i) {
        String C = C(B(asplVar));
        if (C != null && !this.f.containsKey(C)) {
            this.f.put(C, Integer.valueOf(i));
        }
    }

    public final synchronized void p(apxf apxfVar, boolean z) {
        if (apxfVar.pY(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction)) {
            LiveChatAction.MarkChatItemAsDeletedAction markChatItemAsDeletedAction = (LiveChatAction.MarkChatItemAsDeletedAction) apxfVar.pX(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction);
            String str = markChatItemAsDeletedAction.e;
            aqyg aqygVar = markChatItemAsDeletedAction.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            aqyg aqygVar2 = aqygVar;
            aqyg aqygVar3 = markChatItemAsDeletedAction.d;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
            E(str, apxfVar, aqygVar2, aqygVar3, z);
            return;
        }
        if (apxfVar.pY(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction)) {
            LiveChatAction.MarkChatItemsByAuthorAsDeletedAction markChatItemsByAuthorAsDeletedAction = (LiveChatAction.MarkChatItemsByAuthorAsDeletedAction) apxfVar.pX(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction);
            String str2 = markChatItemsByAuthorAsDeletedAction.e;
            for (int i = 0; i < this.a.size(); i++) {
                String str3 = (String) this.a.get(i);
                if (TextUtils.equals(str2, k(this.d.get(str3)))) {
                    aqyg aqygVar4 = markChatItemsByAuthorAsDeletedAction.c;
                    if (aqygVar4 == null) {
                        aqygVar4 = aqyg.a;
                    }
                    aqyg aqygVar5 = aqygVar4;
                    aqyg aqygVar6 = markChatItemsByAuthorAsDeletedAction.d;
                    if (aqygVar6 == null) {
                        aqygVar6 = aqyg.a;
                    }
                    E(str3, apxfVar, aqygVar5, aqygVar6, z);
                }
            }
        }
    }

    public final synchronized void q() {
        this.a.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        v();
    }

    public final synchronized void r(String str, boolean z) {
        int indexOf = this.a.indexOf(str);
        if (indexOf >= 0) {
            this.d.remove(str);
            this.a.remove(str);
            this.e.remove(str);
            if (z) {
                yjk.f();
                z(indexOf, 1);
            }
        }
    }

    public final synchronized boolean s(int i) {
        if (i >= this.a.size()) {
            return false;
        }
        return this.f.containsKey((String) this.a.get(i));
    }

    public final boolean t(String str, aspl asplVar, boolean z) {
        return F(str, B(asplVar), z);
    }

    public final synchronized void u(String str, apxf apxfVar, boolean z) {
        if (this.g.containsKey(str)) {
            str = (String) this.g.get(str);
        }
        if (this.d.containsKey(str)) {
            if (F(str, j(str), z)) {
                int indexOf = this.a.indexOf(str);
                if (indexOf >= 0) {
                    this.e.put(str, apxfVar);
                    if (z) {
                        w(indexOf);
                    }
                }
            }
        }
    }
}
