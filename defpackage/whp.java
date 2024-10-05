package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.youtube.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class whp implements ajom {
    public final Activity a;
    public final ysy b;
    public final zbi c;
    public final afsy d;
    public final wkk e;
    public final wiz f;
    public final aatg g;
    public final acra h;
    public final aftn i;
    public ajcx j;
    final ajou k;
    private final ajjz l;
    private final View m;
    private final View n;
    private final TextView o;
    private final TextView p;
    private final TextView q;
    private final TextView r;
    private final ImageView s;
    private final ImageView t;
    private final ajjv u;
    private final View v;
    private final LinearLayout w;
    private final ajut x;
    private final akpq y;

    public whp(Activity activity, aftn aftnVar, ajjz ajjzVar, ysy ysyVar, afsy afsyVar, azrw azrwVar, zbi zbiVar, wkk wkkVar, wiz wizVar, aatg aatgVar, akpq akpqVar, ajut ajutVar, acqz acqzVar, byte[] bArr) {
        aftnVar.getClass();
        this.k = new ajou(azrwVar);
        this.a = activity;
        ajjzVar.getClass();
        this.l = ajjzVar;
        ysyVar.getClass();
        this.b = ysyVar;
        zbiVar.getClass();
        this.c = zbiVar;
        this.d = afsyVar;
        this.e = wkkVar;
        this.f = wizVar;
        this.g = aatgVar;
        this.y = akpqVar;
        this.x = ajutVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.active_account_header, (ViewGroup) null);
        this.m = inflate;
        this.s = (ImageView) inflate.findViewById(R.id.account_thumbnail);
        this.o = (TextView) inflate.findViewById(R.id.account_name);
        this.p = (TextView) inflate.findViewById(R.id.email);
        TextView textView = (TextView) inflate.findViewById(R.id.manage_account);
        this.q = textView;
        this.t = (ImageView) inflate.findViewById(R.id.switch_account);
        this.r = (TextView) inflate.findViewById(R.id.status_text);
        this.n = inflate.findViewById(R.id.separator);
        this.w = (LinearLayout) inflate.findViewById(R.id.compact_links);
        ajju b = ajjzVar.c().b();
        b.b(R.drawable.missing_avatar);
        this.u = b.a();
        this.v = inflate.findViewById(R.id.account_container);
        this.i = aftnVar;
        textView.setOnClickListener(new whm(this, 1));
        this.h = acqzVar.mM();
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.m;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    public final void d() {
        if (this.d.c() instanceof AccountIdentity) {
            AccountIdentity accountIdentity = (AccountIdentity) this.d.c();
            if (accountIdentity.w()) {
                this.j.e(this.a, Uri.parse("https://accounts.google.com/AccountChooser").buildUpon().appendQueryParameter("hl", Locale.getDefault().getLanguage()).appendQueryParameter("continue", String.format("https://myaccount.google.com/?pageId=%s&utm_source=YouTubeAndroid&utm_medium=act&hl=%s", accountIdentity.e(), Locale.getDefault().getLanguage())).appendQueryParameter("Email", accountIdentity.a()).build());
            } else {
                this.a.startActivityForResult(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", accountIdentity.a()), 0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ajom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oB(defpackage.ajok r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whp.oB(ajok, java.lang.Object):void");
    }
}
