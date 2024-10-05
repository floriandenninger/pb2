package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ilk {
    private final int a;
    private TextView b;
    private String c;
    private long d;

    public ilk(int i) {
        this.a = i;
    }

    public final void a(View view) {
        if (this.b == null) {
            TextView textView = (TextView) view.findViewById(this.a);
            this.b = textView;
            String str = this.c;
            if (str != null) {
                textView.setText(str);
            }
        }
    }

    public final void b(long j) {
        this.d++;
        String format = String.format(Locale.US, "%.2fs #%d", Float.valueOf(((float) j) / 1000.0f), Long.valueOf(this.d));
        this.c = format;
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(format);
        }
    }
}
