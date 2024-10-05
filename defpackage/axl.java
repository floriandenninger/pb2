package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axl {
    public final pms a;
    public final amru b;
    public final long c;
    public final axk d;
    public final Uri e;
    public final String f;
    public final axk g;
    public final axn h;

    public axl(pms pmsVar, List list, axm axmVar, List list2, String str, long j) {
        pse.e(!list.isEmpty());
        this.a = pmsVar;
        this.b = amru.o(list);
        if (list2 == null) {
            Collections.emptyList();
        } else {
            Collections.unmodifiableList(list2);
        }
        this.d = axmVar.a;
        this.c = pts.s(0L, 1000000L, 1L);
        this.e = Uri.parse(((axi) list.get(0)).a);
        long j2 = axmVar.c;
        axk axkVar = j2 <= 0 ? null : new axk(null, axmVar.b, j2);
        this.g = axkVar;
        this.f = str;
        this.h = axkVar == null ? new axn(new axk(null, 0L, j)) : null;
    }
}
