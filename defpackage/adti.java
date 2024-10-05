package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adti {
    public final Context a;
    public final akbz b;
    public final acqz c;
    public akcb d;

    public adti(Context context, akbz akbzVar, acqz acqzVar) {
        this.a = context;
        this.b = akbzVar;
        this.c = acqzVar;
    }

    public final void a() {
        b(this.a.getString(R.string.mdx_tv_signin_error_snackbar_message), acrb.MDX_TV_SIGN_IN_SNACKBAR_CANCELED);
    }

    public final void b(String str, acrb acrbVar) {
        akbz akbzVar = this.b;
        akca m = akbzVar.m();
        m.k(str);
        m.m(null, null);
        m.l(new adth(this, acrbVar));
        m.j(false);
        akbzVar.o(m.b());
    }
}
