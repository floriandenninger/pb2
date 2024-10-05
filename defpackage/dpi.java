package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dpi extends dpk implements Cloneable, dji, div {
    private static final AtomicInteger k = new AtomicInteger(0);
    public dpi a;
    public boolean b;
    public dpj c;
    public Map d;
    public final String e;
    public final int f = k.getAndIncrement();
    public int g;
    public List h;
    public String i;
    public final String j;

    /* JADX INFO: Access modifiers changed from: protected */
    public dpi(String str) {
        this.e = str;
        this.j = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map b(dpi dpiVar) {
        HashMap hashMap = new HashMap();
        if (dpiVar == null) {
            return hashMap;
        }
        List list = dpiVar.h;
        if (list == null) {
            String valueOf = String.valueOf(dpiVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Children of current section ");
            sb.append(valueOf);
            sb.append(" is null!");
            throw new IllegalStateException(sb.toString());
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dpi dpiVar2 = (dpi) list.get(i);
            hashMap.put(dpiVar2.i, new hx(dpiVar2, Integer.valueOf(i)));
        }
        return hashMap;
    }

    public static void c(dpi dpiVar) {
        dpiVar.b = true;
        dpi dpiVar2 = dpiVar.a;
        if (dpiVar2 != null) {
            c(dpiVar2);
        }
    }

    public dpi a(boolean z) {
        try {
            dpi dpiVar = (dpi) super.clone();
            if (!z) {
                if (dpiVar.h != null) {
                    dpiVar.h = new ArrayList();
                }
                dpiVar.g = 0;
                dpiVar.b = false;
                dpiVar.d = null;
            }
            return dpiVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean d(dpi dpiVar) {
        throw null;
    }

    @Override // defpackage.div
    public /* bridge */ /* synthetic */ boolean f(Object obj) {
        throw null;
    }

    @Override // defpackage.dji
    public final dix l() {
        return this;
    }
}
