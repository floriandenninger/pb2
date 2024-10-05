package defpackage;

import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrs implements adrq {
    public final ce a;
    public final acra b;
    public wdk c;
    private final wdm d;
    private final ajjz e;
    private final afsy f;
    private final adsq g;
    private boolean h = true;
    private View i;
    private ImageView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private View n;

    public adrs(ce ceVar, wdm wdmVar, ajjz ajjzVar, afsy afsyVar, adsq adsqVar, acra acraVar) {
        this.a = ceVar;
        this.d = wdmVar;
        this.e = ajjzVar;
        this.f = afsyVar;
        this.g = adsqVar;
        this.b = acraVar;
        acraVar.d(acsb.b(36382), null, null);
    }

    @Override // defpackage.adrq
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.mdx_tvsignin_account_chooser_fragment, viewGroup, false);
        final int i2 = 1;
        inflate.findViewById(R.id.cancel_button).setOnClickListener(new View.OnClickListener(this) { // from class: adrr
            public final /* synthetic */ adrs a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                if (i3 == 0) {
                    adrs adrsVar = this.a;
                    adrsVar.b.I(3, new acqx(acsb.c(36381)), null);
                    wdk wdkVar = adrsVar.c;
                    wdkVar.getClass();
                    adrsVar.f(wdkVar.b);
                    return;
                }
                if (i3 == 1) {
                    adrs adrsVar2 = this.a;
                    adrsVar2.b.I(3, new acqx(acsb.c(36380)), null);
                    ((TvSignInActivity) adrsVar2.a.C()).finish();
                } else if (i3 == 2) {
                    adrs adrsVar3 = this.a;
                    adrsVar3.b.I(3, new acqx(acsb.c(36384)), null);
                    adrsVar3.e();
                } else {
                    adrs adrsVar4 = this.a;
                    adrsVar4.b.I(3, new acqx(acsb.c(36383)), null);
                    adrsVar4.e();
                }
            }
        });
        this.i = inflate.findViewById(R.id.profile);
        this.j = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.k = (TextView) inflate.findViewById(R.id.name);
        this.l = (TextView) inflate.findViewById(R.id.email);
        TextView textView = (TextView) inflate.findViewById(R.id.continue_as_button);
        this.m = textView;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: adrr
            public final /* synthetic */ adrs a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                if (i3 == 0) {
                    adrs adrsVar = this.a;
                    adrsVar.b.I(3, new acqx(acsb.c(36381)), null);
                    wdk wdkVar = adrsVar.c;
                    wdkVar.getClass();
                    adrsVar.f(wdkVar.b);
                    return;
                }
                if (i3 == 1) {
                    adrs adrsVar2 = this.a;
                    adrsVar2.b.I(3, new acqx(acsb.c(36380)), null);
                    ((TvSignInActivity) adrsVar2.a.C()).finish();
                } else if (i3 == 2) {
                    adrs adrsVar3 = this.a;
                    adrsVar3.b.I(3, new acqx(acsb.c(36384)), null);
                    adrsVar3.e();
                } else {
                    adrs adrsVar4 = this.a;
                    adrsVar4.b.I(3, new acqx(acsb.c(36383)), null);
                    adrsVar4.e();
                }
            }
        });
        final int i3 = 2;
        inflate.findViewById(R.id.switch_accounts_button).setOnClickListener(new View.OnClickListener(this) { // from class: adrr
            public final /* synthetic */ adrs a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                if (i32 == 0) {
                    adrs adrsVar = this.a;
                    adrsVar.b.I(3, new acqx(acsb.c(36381)), null);
                    wdk wdkVar = adrsVar.c;
                    wdkVar.getClass();
                    adrsVar.f(wdkVar.b);
                    return;
                }
                if (i32 == 1) {
                    adrs adrsVar2 = this.a;
                    adrsVar2.b.I(3, new acqx(acsb.c(36380)), null);
                    ((TvSignInActivity) adrsVar2.a.C()).finish();
                } else if (i32 == 2) {
                    adrs adrsVar3 = this.a;
                    adrsVar3.b.I(3, new acqx(acsb.c(36384)), null);
                    adrsVar3.e();
                } else {
                    adrs adrsVar4 = this.a;
                    adrsVar4.b.I(3, new acqx(acsb.c(36383)), null);
                    adrsVar4.e();
                }
            }
        });
        View findViewById = inflate.findViewById(R.id.sign_in_button);
        this.n = findViewById;
        final int i4 = 3;
        findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: adrr
            public final /* synthetic */ adrs a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i4;
                if (i32 == 0) {
                    adrs adrsVar = this.a;
                    adrsVar.b.I(3, new acqx(acsb.c(36381)), null);
                    wdk wdkVar = adrsVar.c;
                    wdkVar.getClass();
                    adrsVar.f(wdkVar.b);
                    return;
                }
                if (i32 == 1) {
                    adrs adrsVar2 = this.a;
                    adrsVar2.b.I(3, new acqx(acsb.c(36380)), null);
                    ((TvSignInActivity) adrsVar2.a.C()).finish();
                } else if (i32 == 2) {
                    adrs adrsVar3 = this.a;
                    adrsVar3.b.I(3, new acqx(acsb.c(36384)), null);
                    adrsVar3.e();
                } else {
                    adrs adrsVar4 = this.a;
                    adrsVar4.b.I(3, new acqx(acsb.c(36383)), null);
                    adrsVar4.e();
                }
            }
        });
        return inflate;
    }

    @Override // defpackage.adrq
    public final void b(boolean z, ScreenId screenId, boolean z2) {
        if (z && !z2) {
            this.g.a(screenId, "canceled");
        }
        this.b.n(new acqx(acsb.c(36380)));
        if (!this.f.t() || this.d.a() == null) {
            this.i.setVisibility(8);
            this.n.setVisibility(0);
            this.b.n(new acqx(acsb.c(36383)));
            return;
        }
        this.c = this.d.a();
        this.i.setVisibility(0);
        this.n.setVisibility(8);
        Spanned spanned = this.c.d;
        this.k.setText(spanned);
        this.l.setText(this.c.b);
        aami aamiVar = this.c.e;
        if (aamiVar != null) {
            this.e.h(this.j, aamiVar.e());
        }
        this.m.setText(this.a.qX().getString(R.string.mdx_tvsignin_account_chooser_continue_as, spanned));
        this.b.n(new acqx(acsb.c(36381)));
        this.b.n(new acqx(acsb.c(36384)));
    }

    @Override // defpackage.adrq
    public final void c(Intent intent) {
        String stringExtra = intent.getStringExtra("authAccount");
        stringExtra.getClass();
        f(stringExtra);
    }

    @Override // defpackage.adrq
    public final boolean d() {
        return this.h;
    }

    public final void e() {
        this.a.startActivityForResult(Build.VERSION.SDK_INT >= 23 ? AccountManager.newChooseAccountIntent(null, null, new String[]{"com.google"}, null, null, null, null) : AccountManager.newChooseAccountIntent(null, null, new String[]{"com.google"}, false, null, null, null, null), 1);
    }

    public final void f(String str) {
        this.h = false;
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountEmail", str);
        adyu.cb((TvSignInActivity) this.a.C(), TvSignInActivity.class, 1, bundle);
    }
}
