package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amxl extends amyc {
    public amxl(Class cls) {
        super("group_by", cls, true);
    }

    @Override // defpackage.amyc
    public final void a(Iterator it, amyb amybVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                amybVar.a(this.a, next);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String str = this.a;
            sb.append(']');
            amybVar.a(str, sb.toString());
        }
    }
}
