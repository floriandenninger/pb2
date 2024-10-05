package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sgy implements sgw {
    final /* synthetic */ Pattern a;

    public sgy(Pattern pattern) {
        this.a = pattern;
    }

    @Override // defpackage.sgw
    public final boolean a(String str) {
        return this.a.matcher(str).find();
    }
}
