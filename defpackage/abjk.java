package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abjk {
    public String a = null;
    public Pattern b = null;

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.a = null;
            this.b = null;
        } else {
            if (str.equals(this.a)) {
                return;
            }
            this.a = str;
            try {
                String valueOf = String.valueOf(str.replaceAll("([^a-zA-Z0-9 ])", "\\\\$1").replace(" ", "([\\uFEFF\\s])*"));
                this.b = Pattern.compile(valueOf.length() != 0 ? "(@|#){1}".concat(valueOf) : new String("(@|#){1}"));
            } catch (PatternSyntaxException e) {
                zga.d("LiveChatAccountNameProvider failed pattern", e);
            }
        }
    }
}
