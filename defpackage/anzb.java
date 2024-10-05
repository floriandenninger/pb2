package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anzb extends Exception {
    public anzb(String str) {
        super(str);
        if (str == null) {
            return;
        }
        str.toLowerCase(Locale.US);
    }
}
