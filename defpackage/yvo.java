package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class yvo {
    private final yvn a;
    private final cnk b;
    private boolean c;
    public final String d;
    public final boolean e;
    public cnn f;
    public Collection g;
    public boolean h;
    public boolean i;
    public final int j;

    public yvo(int i, String str, cnk cnkVar) {
        this(i, str, yvn.NORMAL, cnkVar, false);
    }

    public cnq d(cnq cnqVar) {
        return cnqVar;
    }

    public Map f() {
        return Collections.emptyMap();
    }

    public boolean h() {
        return false;
    }

    public yvn i() {
        return this.a;
    }

    public Optional j() {
        return Optional.empty();
    }

    public final Object k(Class cls) {
        Collection collection = this.g;
        if (collection == null) {
            return null;
        }
        for (Object obj : collection) {
            if (cls.isAssignableFrom(obj.getClass())) {
                return obj;
            }
        }
        return null;
    }

    public String l() {
        return m();
    }

    public cnn la() {
        return this.f;
    }

    public String lb() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public String m() {
        return this.d;
    }

    public void n() {
        this.c = true;
    }

    public void o(cnq cnqVar) {
        cnk cnkVar = this.b;
        if (cnkVar != null) {
            cnkVar.kY(cnqVar);
        }
    }

    public final void p(Object obj) {
        Collection collection = this.g;
        if (collection == null) {
            return;
        }
        collection.remove(obj);
    }

    public boolean q() {
        return this.c;
    }

    public abstract cnm qk(cnh cnhVar);

    public abstract void ql(Object obj);

    public byte[] qm() {
        return null;
    }

    public final void r(Object obj) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        this.g.add(obj);
    }

    public final void s() {
        this.i = true;
    }

    public yvo(int i, String str, yvn yvnVar, cnk cnkVar, boolean z) {
        this.f = new cne(2500, 1, 1.0f);
        this.h = true;
        this.i = false;
        this.j = i;
        this.d = str;
        this.a = yvnVar;
        this.b = cnkVar;
        this.e = z;
    }
}
