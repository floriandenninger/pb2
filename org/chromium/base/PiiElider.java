package org.chromium.base;

import android.text.TextUtils;
import defpackage.ayeq;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class PiiElider {
    private static final Pattern a = Pattern.compile("(\\b|^)(((((http|https|Http|Https|rtsp|Rtsp)://(([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,64}(:([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,25})?@)?)?(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(:\\d{1,5})?)|([a-zA-Z][a-zA-Z0-9+.-]+://((([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))+))))(/(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))*)?(\\b|$)");
    private static final Pattern b = Pattern.compile("\\sat\\sorg\\.chromium\\.[^ ]+.");
    private static final String[] c;
    private static final String[] d;

    static {
        Pattern.compile("([0-9a-fA-F]{2}[-:]+){5}[0-9a-fA-F]{2}");
        Pattern.compile("\\[\\w*:CONSOLE.*\\].*");
        c = new String[]{"org.chromium.", "com.google."};
        d = new String[]{"android.accessibilityservice", "android.accounts", "android.animation", "android.annotation", "android.app", "android.appwidget", "android.bluetooth", "android.content", "android.database", "android.databinding", "android.drm", "android.gesture", "android.graphics", "android.hardware", "android.inputmethodservice", "android.location", "android.media", "android.mtp", "android.net", "android.nfc", "android.opengl", "android.os", "android.preference", "android.print", "android.printservice", "android.provider", "android.renderscript", "android.sax", "android.security", "android.service", "android.speech", "android.support", "android.system", "android.telecom", "android.telephony", "android.test", "android.text", "android.transition", "android.util", "android.view", "android.webkit", "android.widget", "com.android.", "dalvik.", "java.", "javax.", "org.apache.", "org.json.", "org.w3c.dom.", "org.xml.", "org.xmlpull."};
    }

    public static String a(String str) {
        int lastIndexOf;
        if (b.matcher(str).find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        Matcher matcher = a.matcher(sb);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            String substring = sb.substring(start, end);
            String[] strArr = c;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < 2) {
                    if (substring.startsWith(strArr[i2])) {
                        break;
                    }
                    i2++;
                } else {
                    String[] strArr2 = d;
                    int length2 = strArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < 51) {
                            if (substring.startsWith(strArr2[i3])) {
                                break;
                            }
                            i3++;
                        } else if (!b(substring) && ((lastIndexOf = substring.lastIndexOf(".")) == -1 || !b(substring.substring(0, lastIndexOf)))) {
                            sb.replace(start, end, "HTTP://WEBADDRESS.ELIDED");
                            i = start + 24;
                            matcher = a.matcher(sb);
                        }
                    }
                }
            }
            i = end;
        }
        return sb.toString();
    }

    private static boolean b(String str) {
        try {
            Class.forName(str, false, ayeq.a.getClassLoader());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String sanitizeStacktrace(String str) {
        String[] split = str.split("\\n");
        split[0] = a(split[0]);
        for (int i = 1; i < split.length; i++) {
            if (split[i].startsWith("Caused by:")) {
                split[i] = a(split[i]);
            }
        }
        return TextUtils.join("\n", split);
    }
}
