package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lto implements ajuo {
    public final ajti a;
    private final Context b;

    @Deprecated
    private int c;
    private final Set d = Collections.newSetFromMap(new HashMap());
    private final arcy e;
    private int f;

    public lto(Activity activity, yqw yqwVar, arcz arczVar, ajti ajtiVar) {
        arcy arcyVar;
        this.c = 0;
        this.b = activity.getApplicationContext();
        this.a = ajtiVar;
        if ((arczVar.b & 1024) != 0) {
            arcyVar = arczVar.g;
            if (arcyVar == null) {
                arcyVar = arcy.a;
            }
        } else {
            arcyVar = null;
        }
        this.e = arcyVar;
        this.c = arczVar.e;
        d(a());
        int i = arczVar.b;
        if ((i & 1024) == 0 || (i & 64) == 0) {
            yqwVar.f(new Callable() { // from class: ltn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final lto ltoVar = lto.this;
                    return ltoVar.a.b.X(new ayrs() { // from class: ltm
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            lto.this.d(((Integer) obj).intValue());
                        }
                    });
                }
            });
        }
    }

    public static Integer c(Context context) {
        return Integer.valueOf(context.getResources().getInteger(R.integer.grid_shelf_num_columns));
    }

    @Override // defpackage.ajuo
    public final ajti b() {
        return this.a;
    }

    public final void d(int i) {
        amkq.E(i > 0);
        if (this.f == i) {
            return;
        }
        this.f = i;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((ajsy) it.next()).a(i);
        }
    }

    @Override // defpackage.ajuo
    public final void e(ajsy ajsyVar) {
        this.d.add(ajsyVar);
    }

    @Override // defpackage.ajuo
    public final void f(ajsy ajsyVar) {
        this.d.remove(ajsyVar);
    }

    @Override // defpackage.ajuo
    public final int a() {
        Context context;
        if (this.e == null || (context = this.b) == null) {
            int i = this.c;
            return i > 0 ? i : this.a.a();
        }
        int i2 = context.getResources().getConfiguration().orientation;
        boolean aa = yjk.aa(this.b);
        if (i2 != 2) {
            arcy arcyVar = this.e;
            return aa ? arcyVar.c : arcyVar.b;
        }
        arcy arcyVar2 = this.e;
        return aa ? arcyVar2.e : arcyVar2.d;
    }
}
