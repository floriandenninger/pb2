package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uad implements uaa {
    private final tzz a;
    private final Context b;
    private final twn c;

    public uad(Context context, twn twnVar, tzz tzzVar) {
        this.b = context;
        this.c = twnVar;
        this.a = tzzVar;
    }

    @Override // defpackage.uaa
    public final String a() {
        return this.b.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0).getString("reg_id", null);
    }

    @Override // defpackage.uaa
    public final synchronized String b() {
        String f;
        uqq.i();
        twn twnVar = this.c;
        String str = twnVar.b;
        try {
            f = this.a.b(uae.a(this.b, this.a, twnVar)).f(str, "");
            if (TextUtils.isEmpty(f)) {
                throw new uab();
            }
            if (!f.equals(a())) {
                tzk.e("FirebaseManagerImpl", "New registration ID doesn't match the previously stored one.", new Object[0]);
                this.b.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0).edit().putString("reg_id", f).commit();
            }
        } catch (IOException e) {
            e = e;
            tzk.g("FirebaseManagerImpl", "Exception during register with IID.", new Object[0]);
            throw new uab(e);
        } catch (AssertionError e2) {
            e = e2;
            tzk.g("FirebaseManagerImpl", "Exception during register with IID.", new Object[0]);
            throw new uab(e);
        } catch (NullPointerException e3) {
            e = e3;
            tzk.g("FirebaseManagerImpl", "Exception during register with IID.", new Object[0]);
            throw new uab(e);
        }
        return f;
    }
}
