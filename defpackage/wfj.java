package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.protos.youtube.api.innertube.AccountsListRenderer;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;
import com.google.protos.youtube.api.innertube.PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wfj extends ajpc implements wgc {
    public final Context a;
    public final wed b;
    public final Handler c;
    public final ce d;
    public final wgd e;
    private final Resources f;
    private final afsy g;
    private final wdm h;
    private final weh i;
    private final wfs j;
    private final FrameLayout k;

    public wfj(Context context, afsy afsyVar, wdm wdmVar, weh wehVar, Activity activity, Handler handler, wft wftVar, wed wedVar, ce ceVar) {
        this.a = context;
        this.f = activity.getResources();
        this.g = afsyVar;
        this.h = wdmVar;
        this.i = wehVar;
        this.b = wedVar;
        this.d = ceVar;
        this.c = handler;
        FrameLayout frameLayout = new FrameLayout(context);
        this.k = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.j = wftVar.a(wedVar, frameLayout);
        this.e = new wgf(ceVar, aih.h(context), this);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.k;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.j.b(ajosVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        final PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer = (PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer) obj;
        aulq aulqVar = passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.c;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        final PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer = (PasswordAuthRendererOuterClass$PasswordAuthRenderer) aulqVar.pX(PasswordAuthRendererOuterClass$PasswordAuthRenderer.passwordAuthRenderer);
        this.j.n(passwordAuthRendererOuterClass$PasswordAuthRenderer);
        this.k.addView(this.j.f);
        if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 1024) != 0) {
            int i = passwordAuthRendererOuterClass$PasswordAuthRenderer.m;
        }
        weh wehVar = this.i;
        int aV = anaf.aV(passwordAuthRendererOuterClass$PasswordAuthRenderer.m);
        if (aV == 0) {
            aV = 1;
        }
        anhy a = wehVar.a(aV);
        if (a != null) {
            ynm.k(a, angq.a, new ynk() { // from class: wff
                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    wfj.this.b.j(1);
                }
            }, new ynl() { // from class: wfg
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj2) {
                    final wfj wfjVar = wfj.this;
                    final PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer2 = passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer;
                    final PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer2 = passwordAuthRendererOuterClass$PasswordAuthRenderer;
                    final AccountIdentity accountIdentity = (AccountIdentity) obj2;
                    wfjVar.c.post(new Runnable() { // from class: wfh
                        @Override // java.lang.Runnable
                        public final void run() {
                            wfj.this.f(passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer2, accountIdentity, passwordAuthRendererOuterClass$PasswordAuthRenderer2);
                        }
                    });
                }
            });
        } else {
            f(passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer, null, passwordAuthRendererOuterClass$PasswordAuthRenderer);
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }

    public final void f(PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer, AccountIdentity accountIdentity, PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer) {
        aova aovaVar;
        String str;
        String obj;
        if (accountIdentity == null) {
            if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 256) != 0) {
                apud apudVar = passwordAuthRendererOuterClass$PasswordAuthRenderer.k;
                if (apudVar == null) {
                    apudVar = apud.b;
                }
                accountIdentity = AccountIdentity.m(apudVar);
            } else {
                accountIdentity = (AccountIdentity) this.g.c();
            }
        }
        wdk b = this.h.b(accountIdentity);
        if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 512) != 0) {
            aulq aulqVar = passwordAuthRendererOuterClass$PasswordAuthRenderer.l;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            aovaVar = (aova) aulqVar.pX(AccountsListRenderer.accountItemRenderer);
        } else {
            aovaVar = null;
        }
        if (aovaVar != null) {
            aqyg aqygVar = aovaVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            str = ajcq.b(aqygVar).toString();
        } else {
            str = b.b;
        }
        if (abv.a(this.a).b() == 0 || whl.a(this.a)) {
            if ((passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.b & 2) != 0) {
                aqyg aqygVar2 = passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.d;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                obj = ajcq.b(aqygVar2).toString();
            } else {
                aqyg aqygVar3 = passwordAuthRendererOuterClass$PasswordAuthRenderer.c;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
                obj = ajcq.b(aqygVar3).toString();
            }
            final aby abyVar = new aby();
            abyVar.a = obj;
            abyVar.b = str;
            if ((passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.b & 4) != 0 && passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.e && whl.a(this.a)) {
                abyVar.d = true;
            } else {
                abyVar.c = this.f.getString(R.string.cancel);
            }
            this.e.a(abyVar.a());
            wfs wfsVar = this.j;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: wfe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wfj.this.e.a(abyVar.a());
                }
            };
            wfsVar.e.setImageResource(com.google.android.youtube.R.drawable.quantum_ic_fingerprint_grey600_48);
            wfsVar.e.setOnClickListener(onClickListener);
            wfsVar.e.setVisibility(0);
            TextView textView = wfsVar.h;
            textView.setPadding(textView.getPaddingLeft(), wfsVar.h.getPaddingTop(), wfsVar.b.getDimensionPixelSize(com.google.android.youtube.R.dimen.biometric_icon_size), wfsVar.h.getPaddingBottom());
        }
    }
}
