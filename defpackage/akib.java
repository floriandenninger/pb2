package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akib extends ajsu implements akii, aklo {
    private final Context a;
    private final ajjz b;
    private final ajpd c;
    private final aahd d;
    private final ajut e;
    private final SharedPreferences f;
    private final List g;
    private final aqyg h;

    public akib(avmi avmiVar, Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, SharedPreferences sharedPreferences) {
        this.a = context;
        this.b = ajjzVar;
        this.d = aahdVar;
        this.e = ajutVar;
        sharedPreferences.getClass();
        this.f = sharedPreferences;
        ajpd ajpdVar = new ajpd();
        this.c = ajpdVar;
        this.g = new ArrayList();
        aqyg aqygVar = null;
        if (System.currentTimeMillis() - sharedPreferences.getLong("share_panel_promo_last_dismissed_millis", 0L) > avmiVar.g) {
            ajpdVar.add(avmiVar);
            this.h = null;
        } else {
            if ((avmiVar.b & 8) != 0 && (aqygVar = avmiVar.f) == null) {
                aqygVar = aqyg.a;
            }
            this.h = aqygVar;
        }
    }

    @Override // defpackage.akii
    public final void b(List list) {
        for (Object obj : list) {
            if (obj != this && (obj instanceof aklo)) {
                this.g.add((aklo) obj);
            }
        }
        if (this.h != null) {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                ((aklo) it.next()).d(this.h);
            }
        }
    }

    @Override // defpackage.akii
    public final void c(ajos ajosVar) {
        ajosVar.f(avmi.class, new akln(this.a, this.b, this.d, this.e, this));
    }

    @Override // defpackage.aklo
    public final void d(aqyg aqygVar) {
        this.c.clear();
        this.f.edit().putLong("share_panel_promo_last_dismissed_millis", System.currentTimeMillis()).apply();
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((aklo) it.next()).d(aqygVar);
        }
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.c;
    }
}
