package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afjz {
    private static final Pattern a = Pattern.compile("[\\.$]");

    @Deprecated
    public static String a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        int min = Math.min(10, stackTraceElementArr.length);
        for (int i = 1; i < min; i++) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            String b = b(stackTraceElement.getClassName(), stackTraceElement.getMethodName());
            String num = Integer.toString(stackTraceElement.getLineNumber());
            String[] split = a.split(b);
            for (int i2 = 0; i2 < split.length; i2++) {
                if (split[i2].length() > 4) {
                    split[i2] = split[i2].substring(0, 4);
                }
            }
            sb.append(b(split));
            sb.append(".");
            sb.append(num);
            if (i != min - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }

    private static String b(String... strArr) {
        return TextUtils.join(".", strArr);
    }
}
