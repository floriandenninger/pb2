package defpackage;

import J.N;
import android.util.Printer;
import com.google.cardboard.sdk.R;
import org.chromium.base.EarlyTraceEvent;
import org.chromium.base.TraceEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class baee implements Printer {
    private String a;

    public void a(String str) {
        boolean z;
        boolean z2;
        boolean d = EarlyTraceEvent.d();
        z = TraceEvent.a;
        if (z || d) {
            StringBuilder sb = new StringBuilder();
            sb.append("Looper.dispatch: ");
            int indexOf = str.indexOf(40, 18);
            int indexOf2 = indexOf == -1 ? -1 : str.indexOf(41, indexOf);
            sb.append(indexOf2 != -1 ? str.substring(indexOf + 1, indexOf2) : "");
            sb.append("(");
            int indexOf3 = str.indexOf(R.styleable.AppCompatTheme_windowMinWidthMinor, 18);
            int indexOf4 = indexOf3 == -1 ? -1 : str.indexOf(58, indexOf3);
            if (indexOf4 == -1) {
                indexOf4 = str.length();
            }
            sb.append(indexOf3 != -1 ? str.substring(indexOf3 + 2, indexOf4) : "");
            sb.append(")");
            this.a = sb.toString();
            z2 = TraceEvent.a;
            if (z2) {
                N.M_y76mct(this.a);
            } else {
                EarlyTraceEvent.a(this.a, true);
            }
        }
    }

    public void b(String str) {
        boolean z;
        boolean z2;
        boolean d = EarlyTraceEvent.d();
        z = TraceEvent.a;
        if ((z || d) && this.a != null) {
            z2 = TraceEvent.a;
            if (z2) {
                N.MLJecZJ9(this.a);
            } else {
                EarlyTraceEvent.c(this.a, true);
            }
        }
        this.a = null;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">")) {
            a(str);
        } else {
            b(str);
        }
    }
}
