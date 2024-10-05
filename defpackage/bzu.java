package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bzu extends abf {
    private static final String g = ajbh.S("WorkContinuationImpl");
    public final caj a;
    public final String b;
    public final List c;
    public final List d;
    public boolean e;
    public final int f;
    private final List h;
    private bzd i;

    public bzu(caj cajVar, String str, int i, List list) {
        this(cajVar, str, i, list, null);
    }

    public static Set e() {
        return new HashSet();
    }

    public final bzd d() {
        if (!this.e) {
            cdt cdtVar = new cdt(this);
            this.a.i.a(cdtVar);
            this.i = cdtVar.a;
        } else {
            ajbh.X();
            ajbh.W(g, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.d)), new Throwable[0]);
        }
        return this.i;
    }

    public bzu(caj cajVar, String str, int i, List list, byte[] bArr) {
        this.a = cajVar;
        this.b = str;
        this.f = i;
        this.c = list;
        this.d = new ArrayList(list.size());
        this.h = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String a = ((bzj) list.get(i2)).a();
            this.d.add(a);
            this.h.add(a);
        }
    }
}
