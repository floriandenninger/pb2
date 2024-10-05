package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoad implements aoag {
    private final String a;
    private final aoae b;

    public aoad(Set set, aoae aoaeVar) {
        this.a = b(set);
        this.b = aoaeVar;
    }

    private static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aoaf aoafVar = (aoaf) it.next();
            sb.append(aoafVar.a);
            sb.append('/');
            sb.append(aoafVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.aoag
    public final String a() {
        if (this.b.a().isEmpty()) {
            return this.a;
        }
        String str = this.a;
        String b = b(this.b.a());
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(b).length());
        sb.append(str);
        sb.append(' ');
        sb.append(b);
        return sb.toString();
    }
}
