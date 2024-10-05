package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amnm {
    public final ammd a;
    public final boolean b;
    public final amnl c;
    public final int d;

    public amnm(amnl amnlVar) {
        this(amnlVar, false, amma.a, Integer.MAX_VALUE);
    }

    public amnm(amnl amnlVar, boolean z, ammd ammdVar, int i) {
        this.c = amnlVar;
        this.b = z;
        this.a = ammdVar;
        this.d = i;
    }

    public static amnm b(char c) {
        return new amnm(new amnd(new amlx(c)));
    }

    public static amnm c(String str) {
        amkq.F(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return b(str.charAt(0));
        }
        return new amnm(new amnf(str));
    }

    public static amnm d(String str) {
        int i = ammx.a;
        ammo ammoVar = new ammo(Pattern.compile(str));
        amkq.J(!ammoVar.a("").a.matches(), "The pattern may not match the empty string: %s", ammoVar);
        return new amnm(new amnh(ammoVar));
    }

    public final amnm a() {
        return new amnm(this.c, true, this.a, this.d);
    }

    public final amnm e() {
        ammc ammcVar = ammc.b;
        ammcVar.getClass();
        return new amnm(this.c, this.b, ammcVar, this.d);
    }

    public final Iterable f(CharSequence charSequence) {
        charSequence.getClass();
        return new amnk(this, charSequence);
    }

    public final Iterator g(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public final List h(CharSequence charSequence) {
        charSequence.getClass();
        Iterator g = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add((String) g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
