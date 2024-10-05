package defpackage;

import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jut implements Runnable {
    public final /* synthetic */ juy a;
    public final /* synthetic */ ykl b;
    private final /* synthetic */ int c;

    public /* synthetic */ jut(juy juyVar, ykl yklVar, int i) {
        this.c = i;
        this.a = juyVar;
        this.b = yklVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Collection emptyList;
        final Collection emptyList2;
        if (this.c == 0) {
            juy juyVar = this.a;
            final ykl yklVar = this.b;
            if (juyVar.a.h()) {
                emptyList = ((agof) juyVar.b.get()).a().m().j();
            } else {
                emptyList = Collections.emptyList();
            }
            final int i = 0;
            juyVar.c.execute(new Runnable() { // from class: jus
                @Override // java.lang.Runnable
                public final void run() {
                    if (i != 0) {
                        yklVar.b(null, emptyList);
                    } else {
                        yklVar.b(null, emptyList);
                    }
                }
            });
            return;
        }
        juy juyVar2 = this.a;
        final ykl yklVar2 = this.b;
        if (juyVar2.a.j()) {
            emptyList2 = juyVar2.a().j();
        } else {
            emptyList2 = Collections.emptyList();
        }
        final int i2 = 1;
        juyVar2.c.execute(new Runnable() { // from class: jus
            @Override // java.lang.Runnable
            public final void run() {
                if (i2 != 0) {
                    yklVar2.b(null, emptyList2);
                } else {
                    yklVar2.b(null, emptyList2);
                }
            }
        });
    }
}
