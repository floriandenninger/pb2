package defpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ryk extends ryq {
    private final SimpleDateFormat d;
    private final Calendar e;

    public ryk() {
        super("h", "MMM d ha", 5);
        Calendar a = run.a();
        this.e = a;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ha");
        this.d = simpleDateFormat;
        simpleDateFormat.setCalendar(a);
    }

    @Override // defpackage.ryq
    public final String a(Date date) {
        this.e.setTime(date);
        if (this.e.get(11) == 12) {
            return this.d.format(date);
        }
        return super.a(date);
    }
}
