package androidx.work.impl;

import android.content.Context;
import defpackage.btk;
import defpackage.btl;
import defpackage.bzv;
import defpackage.bzw;
import defpackage.cae;
import defpackage.caf;
import defpackage.cag;
import defpackage.cah;
import defpackage.ccq;
import defpackage.ccw;
import defpackage.cdb;
import defpackage.cdo;
import defpackage.jq;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class WorkDatabase extends btl {
    private static final long i = TimeUnit.DAYS.toMillis(1);

    public static WorkDatabase q(Context context, Executor executor, boolean z) {
        btk f;
        if (z) {
            f = new btk(context, WorkDatabase.class, null);
            f.d = true;
        } else {
            f = jq.f(context, WorkDatabase.class, cah.b());
            f.c = new bzv(context);
        }
        f.b = executor;
        bzw bzwVar = new bzw();
        if (f.a == null) {
            f.a = new ArrayList();
        }
        f.a.add(bzwVar);
        f.b(cag.a);
        f.b(new cae(context, 2, 3));
        f.b(cag.b);
        f.b(cag.c);
        f.b(new cae(context, 5, 6));
        f.b(cag.d);
        f.b(cag.e);
        f.b(cag.f);
        f.b(new caf(context));
        f.b(new cae(context, 10, 11));
        f.b(cag.g);
        f.e = false;
        f.f = true;
        return (WorkDatabase) f.a();
    }

    public static String s() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - i) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract cdb r();

    public abstract ccq t();

    public abstract ccw u();

    public abstract cdo v();

    public abstract cdo w();

    public abstract cdo x();

    public abstract cdo y();
}
