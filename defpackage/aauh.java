package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aauh implements aauk {
    private final appp a;
    private List b;

    public aauh(appp apppVar) {
        apppVar.getClass();
        this.a = apppVar;
    }

    @Override // defpackage.aauk
    public final CharSequence a() {
        aqyg aqygVar;
        appp apppVar = this.a;
        if ((apppVar.b & 32) != 0) {
            aqygVar = apppVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.aauk
    public final CharSequence b() {
        aqyg aqygVar;
        appp apppVar = this.a;
        if ((apppVar.b & 2) != 0) {
            aqygVar = apppVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.aauk
    public final String c() {
        return this.a.g;
    }

    @Override // defpackage.aauk
    public final String d() {
        return this.a.d;
    }

    @Override // defpackage.aauk
    public final List e(aahd aahdVar) {
        if (this.b == null) {
            this.b = new ArrayList();
            Iterator it = this.a.i.iterator();
            while (it.hasNext()) {
                this.b.add(aahk.a((aqyg) it.next(), aahdVar, false));
            }
        }
        return this.b;
    }

    @Override // defpackage.aauk
    public final boolean f() {
        return this.a.h;
    }

    @Override // defpackage.aauk
    public final boolean g() {
        return this.a.e;
    }

    @Override // defpackage.aauk
    public final CharSequence h(int i) {
        aqyg aqygVar;
        if (i - 1 != 0) {
            return "";
        }
        appp apppVar = this.a;
        if ((apppVar.b & 512) != 0) {
            aqygVar = apppVar.j;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }
}
