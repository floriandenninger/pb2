package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eig implements aaha {
    private final Activity a;
    private final afsy b;
    private final ajcx c;

    public eig(Activity activity, afsy afsyVar, ajcx ajcxVar) {
        this.a = activity;
        this.b = afsyVar;
        this.c = ajcxVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar != null && (this.b.c() instanceof AccountIdentity)) {
            AccountIdentity accountIdentity = (AccountIdentity) this.b.c();
            if (accountIdentity.w()) {
                this.c.e(this.a, Uri.parse("https://accounts.google.com/AccountChooser").buildUpon().appendQueryParameter("hl", Locale.getDefault().getLanguage()).appendQueryParameter("continue", String.format("https://myaccount.google.com/?pageId=%s&utm_source=YouTubeAndroid&utm_medium=act&hl=%s", accountIdentity.e(), Locale.getDefault().getLanguage())).appendQueryParameter("Email", accountIdentity.a()).build());
            } else {
                this.a.startActivityForResult(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", accountIdentity.a()).putExtra("extra.screenId", 217), 0);
            }
        }
    }
}
