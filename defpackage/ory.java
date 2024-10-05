package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.NumberPicker;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ory extends FrameLayout {
    private final NumberPicker a;
    private final NumberPicker b;
    private List c;
    private List d;

    public ory(Context context) {
        super(context, null, 0);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        inflate(context, R.layout.watch_break_frequency_picker, this);
        this.a = (NumberPicker) findViewById(R.id.hours_picker);
        this.b = (NumberPicker) findViewById(R.id.minutes_picker);
    }

    private static void f(NumberPicker numberPicker, List list) {
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(((amvj) list).c - 1);
        ammk e = aner.a.e();
        list.getClass();
        numberPicker.setDisplayedValues((String[]) amkq.bo(new ammi(e, list), String.class));
    }

    public final int a() {
        return ((Integer) this.c.get(this.a.getValue())).intValue();
    }

    public final int b() {
        return ((Integer) this.d.get(this.b.getValue())).intValue();
    }

    public final void c(int i) {
        List list = this.c;
        Integer valueOf = Integer.valueOf(i);
        amkq.E(list.contains(valueOf));
        this.a.setValue(this.c.indexOf(valueOf));
    }

    public final void d(int i) {
        List list = this.d;
        Integer valueOf = Integer.valueOf(i);
        amkq.E(list.contains(valueOf));
        this.b.setValue(this.d.indexOf(valueOf));
    }

    public final void e(List list, List list2) {
        amkq.E(!list.isEmpty());
        amkq.E(!list2.isEmpty());
        this.c = list;
        this.d = list2;
        f(this.a, list);
        f(this.b, this.d);
    }
}
