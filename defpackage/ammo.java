package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ammo extends ammg implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern a;

    public ammo(Pattern pattern) {
        pattern.getClass();
        this.a = pattern;
    }

    @Override // defpackage.ammg
    public final ammf a(CharSequence charSequence) {
        return new ammf(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }
}
