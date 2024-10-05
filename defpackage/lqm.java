package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.NumberPicker;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lqm extends FrameLayout {
    public final NumberPicker a;
    public List b;

    public lqm(Context context) {
        super(context, null, 0);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        inflate(context, R.layout.setting_time_picker, this);
        this.a = (NumberPicker) findViewById(R.id.time_picker);
    }

    public final int a() {
        return this.a.getValue();
    }

    public final void b(String str) {
        if (this.b.contains(str)) {
            this.a.setValue(this.b.indexOf(str));
        }
    }

    public final void c(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.b = list;
        NumberPicker numberPicker = this.a;
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(list.size() - 1);
        numberPicker.setDisplayedValues((String[]) amkq.bo(list, String.class));
    }
}
