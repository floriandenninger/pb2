package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ldd implements ajom {
    public final Context a;
    private final aahd b;

    public ldd(Context context, aahd aahdVar) {
        this.a = context;
        aahdVar.getClass();
        this.b = aahdVar;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final CharSequence d(CharSequence charSequence, CharSequence charSequence2, apxf apxfVar, String str) {
        if (charSequence2 == null) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence2);
        spannableString.setSpan(new ldc(this, this.b, apxfVar, str), 0, charSequence2.length(), 33);
        return charSequence == null ? spannableString : TextUtils.concat(charSequence, " ", spannableString);
    }
}
