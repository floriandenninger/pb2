package defpackage;

import android.util.Property;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahes extends Property {
    public ahes(Class cls) {
        super(cls, "countDownProgress");
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        return ((ahet) obj).b;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        ahet ahetVar = (ahet) obj;
        Long l = (Long) obj2;
        ahetVar.b = l;
        ahetVar.c.b.n(l.longValue(), ahetVar.a);
        ahetVar.c.d.d(new aheo(TimeUnit.MILLISECONDS.toSeconds(l.longValue()), TimeUnit.MILLISECONDS.toSeconds(ahetVar.a)));
        if (l.longValue() == ahetVar.a) {
            ahetVar.c.q(true);
        }
    }
}
