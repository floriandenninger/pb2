package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sus {
    final List a = new ArrayList();
    private final sxd b;

    public sus(sxd sxdVar) {
        this.b = sxdVar;
    }

    private final synchronized void d(int i, Context context) {
        for (suv suvVar : this.a) {
            suvVar.b.d(suvVar.a.d(suvVar.c, i, context, suvVar.d, suvVar.e));
        }
    }

    public final void a(Configuration configuration, Context context) {
        int i = configuration.orientation;
        int i2 = 2;
        if (i == 1) {
            i2 = 4;
        } else if (i != 2) {
            i2 = 1;
        }
        aone createBuilder = awoo.a.createBuilder();
        createBuilder.copyOnWrite();
        awoo awooVar = (awoo) createBuilder.instance;
        awooVar.c = i2 - 1;
        awooVar.b = 1 | awooVar.b;
        awoo awooVar2 = (awoo) createBuilder.build();
        d(i2, context);
        this.b.c("/device/orientation", awooVar2.toByteArray(), false);
    }

    public final synchronized void b(suv suvVar) {
        this.a.add(suvVar);
    }

    public final synchronized void c(suv suvVar) {
        this.a.remove(suvVar);
    }
}
