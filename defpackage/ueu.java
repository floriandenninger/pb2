package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ueu {
    public final /* synthetic */ uew a;

    public /* synthetic */ ueu(uew uewVar) {
        this.a = uewVar;
    }

    public final ues a(Object obj) {
        uey ueyVar;
        uew uewVar = this.a;
        if (tyo.ab(obj).a) {
            if (uew.a == null) {
                uew.a = new uey(uev.a, uewVar.b.getString(R.string.og_google_one_account_a11y));
            }
            ueyVar = uew.a;
        } else {
            ueyVar = null;
        }
        return new ues(ueyVar);
    }
}
