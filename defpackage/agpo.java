package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agpo {
    protected final agsn a;
    public final String b;
    public final Object c = new Object();
    public Pair d;

    public agpo(agsn agsnVar, String str) {
        agsnVar.getClass();
        this.a = agsnVar;
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Pair a() {
        List emptyList = Collections.emptyList();
        if (!"PPSV".equals(this.b) || TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(this.b)) {
                agni e = this.a.i().e(this.b);
                r2 = e != null ? e.a : null;
                if (r2 != null) {
                    emptyList = this.a.i().l(this.b);
                }
            }
        } else {
            agnv e2 = !TextUtils.isEmpty(null) ? this.a.m().e(null) : null;
            if (e2 != null) {
                emptyList = Collections.singletonList(e2);
            }
        }
        return b(r2, emptyList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Pair b(agng agngVar, List list) {
        Pair pair;
        synchronized (this.c) {
            pair = new Pair(agngVar, list);
            this.d = pair;
        }
        return pair;
    }

    public final List c() {
        List list;
        synchronized (this.c) {
            Pair pair = this.d;
            if (pair == null) {
                pair = a();
            }
            list = (List) pair.second;
        }
        return list;
    }

    public final List d() {
        ArrayList arrayList;
        synchronized (this.c) {
            arrayList = new ArrayList();
            Iterator it = c().iterator();
            while (it.hasNext()) {
                arrayList.add(((agnv) it.next()).a);
            }
        }
        return arrayList;
    }

    public boolean e() {
        throw null;
    }
}
