package defpackage;

import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jxt implements ykl {
    final /* synthetic */ jxu a;

    public jxt(jxu jxuVar) {
        this.a = jxuVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        String str = (String) obj;
        List list = (List) obj2;
        if (this.a.o.isCancelled() || !str.equals(this.a.m)) {
            return;
        }
        Iterator it = list.iterator();
        long j = 2147483647L;
        while (it.hasNext()) {
            agnu agnuVar = ((agnv) it.next()).j;
            long X = mcy.X(agnuVar, this.a.f);
            if (agnuVar != null && X < j && mcy.ah(agnuVar)) {
                j = X;
            }
        }
        if (j == 2147483647L || j == 0) {
            return;
        }
        jxu jxuVar = this.a;
        jql jqlVar = new jql(R.attr.ytTextDisabled, mcy.ae(jxuVar.q.a, j, false));
        whu.I(jxuVar.h, false);
        whu.G(jxuVar.g, jqlVar.c[0]);
        jxuVar.g.setTextColor(wbs.W(jxuVar.a, jqlVar.a).orElse(0));
        jxuVar.g.setTypeface(jxuVar.h.getTypeface(), 0);
    }
}
