package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ffs {
    public final afsy a;
    public final azrw b;
    public final wcf c;
    private final akrh d;

    public ffs(wcf wcfVar, afsy afsyVar, akrh akrhVar, azrw azrwVar) {
        wcfVar.getClass();
        this.c = wcfVar;
        afsyVar.getClass();
        this.a = afsyVar;
        akrhVar.getClass();
        this.d = akrhVar;
        azrwVar.getClass();
        this.b = azrwVar;
    }

    public final void a(final Activity activity, String str) {
        activity.getClass();
        if (true == TextUtils.isEmpty(str)) {
            str = "yt_android_default";
        }
        final Uri parse = Uri.parse(activity.getResources().getString(R.string.youtube_help_uri));
        final Bitmap Q = yjk.Q(activity);
        final String str2 = str;
        this.d.c(str, new akrg() { // from class: ffq
            @Override // defpackage.akrg
            public final void a(Bundle bundle) {
                ffs ffsVar = ffs.this;
                Bitmap bitmap = Q;
                String str3 = str2;
                Uri uri = parse;
                Activity activity2 = activity;
                qwk qwkVar = (qwk) ffsVar.b.get();
                qwkVar.e(new ffr(bundle));
                if (bitmap != null) {
                    qwkVar.d(bitmap);
                }
                if (!ffsVar.a.t()) {
                    qwkVar.c();
                }
                GoogleHelp b = GoogleHelp.b(str3);
                b.u = true;
                b.q = uri;
                b.c(qwkVar.a(), activity2.getCacheDir());
                if (ffsVar.a.t()) {
                    b.c = ffsVar.c.b(ffsVar.a.c());
                }
                new qyy(activity2).a(b.a());
            }
        });
    }
}
