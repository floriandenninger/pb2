package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mom {
    public final CharSequence a;
    public final CharSequence b;
    public boolean c;

    public mom(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = TextUtils.equals(charSequence, charSequence2);
    }
}
