package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczb {
    private final List a;
    private final String b;
    private final apt c;

    public aczb(atbz atbzVar, String str) {
        amru s;
        this.b = str;
        List arrayList = new ArrayList();
        if (atbzVar == null || !atbzVar.b) {
            aone createBuilder = atbo.a.createBuilder();
            createBuilder.copyOnWrite();
            atbo atboVar = (atbo) createBuilder.instance;
            atboVar.c = 2;
            atboVar.b |= 1;
            createBuilder.ay(f("^(?i)microsoft.*", "^(?i)xbox.*"));
            atbo atboVar2 = (atbo) createBuilder.build();
            if (adyu.bW(str)) {
                aone createBuilder2 = atbo.a.createBuilder();
                createBuilder2.copyOnWrite();
                atbo atboVar3 = (atbo) createBuilder2.instance;
                atboVar3.c = 1;
                atboVar3.b = 1 | atboVar3.b;
                createBuilder2.ay(f("^lge$", "(^476700$|^\\d\\d(lm|ls|pa|pm).*|^global$|^mediabh.*|^mediabp530.*|^tm.*)"));
                createBuilder2.ay(f("^samsung$", "^(bd|ht)$"));
                createBuilder2.ay(f("^vizio$", "^e.*_a0$"));
                createBuilder2.ay(f("^sharp$", "^(le650u|le657e|le65xx|le747e|le757e|le757u|le857e)$"));
                createBuilder2.ay(f("^funai$", "^philips$"));
                createBuilder2.ay(f("^(tivo|tivo_comhem)$", "^series4$"));
                if ("k".equals(str)) {
                    createBuilder2.ay(f("^Amazon$", "^.*$"));
                    createBuilder2.ay(f("^Element$", "^(EL4KAMZ4317|EL4KAMZ5017|EL4KAMZ5517|EL4KAMZ6517|EL4KAMZ4317T|EL4KAMZ5017T|EL4KAMZ5517T|EL4KAMZ6517T)$"));
                    createBuilder2.ay(f("^Westinghouse$", "^(WA43UFA1001|WA50UFA1001|WA55UFA1001|WA65UFA1001|WA43UFT1001|WA50UFT1001|WA55UFT1001|WA65UFT1001)$"));
                    createBuilder2.ay(f("^Toshiba$", "^(49LF421U19|43LF421U19|32LF221U19|49LF421C19|43LF421C19|32LF221C19|43LF621U19|50LF621U19|55LF621U19|43LF621C19|50LF621C19|55LF621C19|43LF711U20|50LF711U20|55LF711U20|43LF711C20|50LF711C20|55LF711C20)$"));
                    createBuilder2.ay(f("^Insignia$", "^(NS-43DF710NA19|NS-50DF710NA19|NS-55DF710NA19|NS-43DF710CA19|NS-50DF710CA19|NS-55DF710CA19|NS-24DF310NA19|NS-32DF310NA19|NS-39DF510NA19|NS-24DF310CA19|NS-32DF310CA19|NS-39DF510CA19)$"));
                    createBuilder2.ay(f("^Grundig$", "^(43 GUW 7060|43 GUB 7060|43 GUT 7060|43 GUB 7062|43 GUB 7065|43 GUB 7066|43 GUT 7099|43 GUB 7067|43 GUT 7077|43 VLX 7020|43 VLX 7010|49 GUW 7060|49 GUT 7060|49 GUB 7060|49 GUB 7062|49 GUB 7065|49 GUB 7066|49 GUT 7099|49 GUB 7067|49 GUT 7077|49 VLX 7020|49 VLX 7010|55 GUW 7060|55 GUT 7060|55 GUB 7060|55 GUB 7062|55 GUB 7065|55 GUB 7066|55 GUT 7099|55 GUB 7067|55 GUT 7077|55 VLX 7020|55 VLX 7010|65 GUB 7066|65 GUB 7060|65 GUW 7060|65 GUT 7060|65 GUB 7062|65 GUB 7065|65 GUT 7077|65 VLX 7020|65 VLX 7010|55 GOB 9099 OLED|65 GOB 9099 OLED|55 GOB 9089 OLED|65 GOB 9089 OLED|32 GFB 6062|32 GFB 6065|32 GFB 6066|32 GFB 6067|32 GFB 6060|32 GFW 6060|32 VLE 6020|32 GFB 6064|32 VLE 6010|40 GFB 6065|40 GFB 6062|40 GFB 6066|40 GFB 6067|40 GFB 6060|40 GFW 6060|40 VLE 6020|40 GFB 6064|40 VLE 6010|43 GFB 6060|43 GFB 6065|43 GFB 6062|43 GFB 6066|43 GFB 6067|43 GFW 6060|43 VLE 6020|43 GFB 6064|43 VLE 6010|43UHDEGA|49UHDEGA|55UHDEGA|55UHDNGA|65UHDNGA|55UHDOGA|65UHDOGA|32FHDCGA|40FHDCGA|43FHDCGA)$"));
                    createBuilder2.ay(f("^(Onida)$", "^(32HIF|43FIF)$"));
                    createBuilder2.ay(f("^(Anker)$", "^AK-D3000111$"));
                    createBuilder2.ay(f("^(JVC)$", "^(LT-40CF890|LT-49CF890|LT-55CF890)$"));
                }
                if ("up".equals(str)) {
                    createBuilder2.az(f("^(?i)microsoft.*", "^(?i)xbox\\sone.*"));
                    createBuilder2.az(f("^(?i)roku.*", ".*"));
                    createBuilder2.az(f("^(?i)apple.*", ".*"));
                    createBuilder2.az(f("^(?i)lg.*", "(?i)(^\\d\\d\\w[km]\\w{2,7}$|^oled\\d\\d\\w[89]\\w{0,3}$)"));
                    createBuilder2.az(f("^(?i)samsung.*", "(?i)(\\bU\\w{1}\\d{2}R\\w{1}\\d{4}\\b|\\bQ\\w{1}\\d{2}\\w{1}\\d{2,3}R\\w{1}\\b)"));
                    createBuilder2.az(f("^(?i)hisense.*", "(?i)(^hu.*f$)"));
                    createBuilder2.ay(f("^(?i)samsung.*", "(?i)(^(?!(UN32M4))(\\bU\\w{1}(\\d{2})[KM].*\\b))"));
                    createBuilder2.ay(f("^(?i)sony.*", "(?i)(blu-ray disc player|Sony_KD-.*)"));
                    createBuilder2.ay(f("^(?i)echostar.*", "(?i)(\\bXiP\\d{3}\\b)"));
                }
                s = amru.s((atbo) createBuilder2.build(), atboVar2);
            } else {
                s = amru.r(atboVar2);
            }
            this.a = s;
        } else {
            List list = atbzVar.c;
            this.a = Collections.unmodifiableList(true != list.isEmpty() ? list : arrayList);
        }
        this.c = new apt((char[]) null);
    }

    private final boolean d(acza aczaVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            atbn atbnVar = (atbn) it.next();
            apt aptVar = this.c;
            atbnVar.getClass();
            int cR = amkq.cR(atbnVar.c);
            if (cR != 0 && cR != 1) {
                int i = aczaVar.d;
                int cR2 = amkq.cR(atbnVar.c);
                if (cR2 == 0) {
                    cR2 = 1;
                }
                if (i != cR2) {
                    continue;
                }
            }
            if (aptVar.e(aczaVar.a, atbnVar.d) && aptVar.e(aczaVar.b, atbnVar.e) && aptVar.e(aczaVar.c, atbnVar.f)) {
                return true;
            }
        }
        return false;
    }

    private final atbo e(int i) {
        for (atbo atboVar : this.a) {
            int cQ = amkq.cQ(atboVar.c);
            if (cQ == 0) {
                cQ = 1;
            }
            if (cQ == i) {
                return atboVar;
            }
        }
        return null;
    }

    private static final atbn f(String str, String str2) {
        aone createBuilder = atbn.a.createBuilder();
        createBuilder.copyOnWrite();
        atbn atbnVar = (atbn) createBuilder.instance;
        atbnVar.c = 2;
        atbnVar.b |= 1;
        createBuilder.copyOnWrite();
        atbn atbnVar2 = (atbn) createBuilder.instance;
        atbnVar2.b = 2 | atbnVar2.b;
        atbnVar2.d = str;
        createBuilder.copyOnWrite();
        atbn atbnVar3 = (atbn) createBuilder.instance;
        atbnVar3.b |= 4;
        atbnVar3.e = str2;
        return (atbn) createBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(int i, acza aczaVar) {
        atbo e = e(i);
        if (e == null || e.d.size() == 0) {
            return true;
        }
        return d(aczaVar, e.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(int i, acza aczaVar) {
        atbo e = e(i);
        if (e == null || e.e.size() == 0) {
            return false;
        }
        return d(aczaVar, e.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(int i, acza aczaVar) {
        return !b(i, aczaVar) && a(i, aczaVar);
    }
}
