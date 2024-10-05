package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gby {
    public final aahd a;
    private final akbw b;
    private final ajut c;
    private final ajrv d;

    public gby(akbw akbwVar, ajut ajutVar, aahd aahdVar, ajrv ajrvVar) {
        this.b = akbwVar;
        this.c = ajutVar;
        this.a = aahdVar;
        this.d = ajrvVar;
    }

    public static Map a(atcf atcfVar, Map map, boolean z) {
        Map i = acrc.i(atcfVar, z);
        if (map != null) {
            i.putAll(map);
        }
        return i;
    }

    private final View.OnClickListener c(final apmg apmgVar, final atcf atcfVar, final Map map) {
        if (apmgVar == null) {
            return null;
        }
        int i = apmgVar.b;
        if ((i & 8192) == 0 && (i & 16384) == 0) {
            return null;
        }
        return new View.OnClickListener() { // from class: gbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gby gbyVar = gby.this;
                apmg apmgVar2 = apmgVar;
                atcf atcfVar2 = atcfVar;
                Map map2 = map;
                int i2 = apmgVar2.b;
                if ((i2 & 8192) != 0) {
                    boolean z = !((i2 & 16384) != 0);
                    aahd aahdVar = gbyVar.a;
                    apxf apxfVar = apmgVar2.n;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, gby.a(atcfVar2, map2, z));
                }
                if ((apmgVar2.b & 16384) != 0) {
                    aahd aahdVar2 = gbyVar.a;
                    apxf apxfVar2 = apmgVar2.o;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    aahdVar2.c(apxfVar2, gby.a(atcfVar2, map2, false));
                }
            }
        };
    }

    private static apmg d(atce atceVar) {
        if (atceVar == null || (atceVar.b & 1) == 0) {
            return null;
        }
        apmg apmgVar = atceVar.c;
        return apmgVar == null ? apmg.a : apmgVar;
    }

    public final akbx b(atcf atcfVar, Map map) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        atce atceVar = atcfVar.f;
        if (atceVar == null) {
            atceVar = atce.a;
        }
        apmg d = d(atceVar);
        atce atceVar2 = atcfVar.g;
        if (atceVar2 == null) {
            atceVar2 = atce.a;
        }
        apmg d2 = d(atceVar2);
        akbx m = this.b.m();
        m.i(!atcfVar.m);
        m.g(!atcfVar.k);
        if ((atcfVar.b & 2048) != 0) {
            aqygVar = atcfVar.l;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        m.c = ajcq.b(aqygVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < atcfVar.e.size(); i++) {
            if (i > 0) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            spannableStringBuilder.append((CharSequence) ajcq.c((aqyg) atcfVar.e.get(i), this.d));
        }
        m.d = spannableStringBuilder;
        if (d == null || (d.b & 256) == 0) {
            aqygVar2 = null;
        } else {
            aqygVar2 = d.i;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        }
        akbx b = m.b(ajcq.b(aqygVar2), c(d, atcfVar, map), d);
        if (d2 == null || (d2.b & 256) == 0) {
            aqygVar3 = null;
        } else {
            aqygVar3 = d2.i;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        }
        akbx c = b.c(ajcq.b(aqygVar3), c(d2, atcfVar, null));
        c.i = d2;
        if ((atcfVar.b & 1) != 0) {
            avgg avggVar = atcfVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            c.h(0);
            c.j = avggVar;
            c.k = Optional.empty();
        }
        if ((atcfVar.b & 2) != 0) {
            ajut ajutVar = this.c;
            arfs arfsVar = atcfVar.d;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b2 = arfr.b(arfsVar.c);
            if (b2 == null) {
                b2 = arfr.UNKNOWN;
            }
            c.e(ajutVar.a(b2));
        }
        return c;
    }
}
