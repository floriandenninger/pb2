package defpackage;

import j$.util.DesugarTimeZone;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tjy {
    private static final TimeZone a;
    private final shf b;
    private volatile long c;

    static {
        int i = anbf.b;
        a = DesugarTimeZone.getTimeZone("America/Los_Angeles");
    }

    public tjy(shf shfVar) {
        new HashSet();
        this.b = shfVar;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(a);
        gregorianCalendar.setTimeInMillis(shfVar.c());
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        this.c = gregorianCalendar.getTimeInMillis();
    }
}
