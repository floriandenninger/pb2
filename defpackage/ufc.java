package defpackage;

import android.graphics.Path;
import android.util.Property;
import com.google.android.libraries.onegoogle.account.disc.RingView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ufc extends Property {
    public ufc(Class cls) {
        super(cls, "ringThickness");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((RingView) obj).d);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        RingView ringView = (RingView) obj;
        int intValue = ((Integer) obj2).intValue();
        if (intValue == ringView.d) {
            return;
        }
        amkq.O(ringView.b != -1, "setRingThickness should be called before setCurrThickness");
        amkq.O(ringView.c != -1, "setRingRadius should be called before setCurrThickness");
        ringView.d = intValue;
        int i = ringView.c;
        int i2 = ringView.b;
        ringView.a.reset();
        ringView.a.addCircle(ringView.getWidth() / 2, ringView.getHeight() / 2, (i - i2) + intValue, Path.Direction.CW);
        ringView.invalidate();
    }
}
