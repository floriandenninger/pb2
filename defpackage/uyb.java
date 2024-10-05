package defpackage;

import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uyb {
    private final uyd a = new uyd();

    public final boolean a(CharSequence charSequence, uxz uxzVar) {
        String str = uxzVar.a;
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = this.a.a(str).matcher(charSequence);
        return matcher.lookingAt() && matcher.matches();
    }
}
