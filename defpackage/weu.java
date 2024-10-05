package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.libraries.youtube.account.identity.C$AutoValue_AccountIdentity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AccountsListRenderer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class weu extends ajpc implements wgi {
    public final Context a;
    public final Resources b;
    public final wed c;
    public final View d;
    public final TextView e;
    public final TextView f;
    private AccountIdentity g;
    private final ajyf h;
    private final Handler i;
    private final wgj j;
    private final wgv k;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final TextView o;
    private Long p;

    public weu(Context context, wgj wgjVar, Activity activity, ajyg ajygVar, Handler handler, wed wedVar, wgv wgvVar, ViewGroup viewGroup) {
        this.a = context;
        this.b = activity.getResources();
        this.c = wedVar;
        this.i = handler;
        this.j = wgjVar;
        this.k = wgvVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.modal_unicorn_password_auth_layout, viewGroup, false);
        this.d = inflate;
        inflate.findViewById(R.id.close_button).setOnClickListener(new wel(wedVar, 2));
        this.l = (TextView) inflate.findViewById(R.id.title);
        this.m = (TextView) inflate.findViewById(R.id.description);
        this.e = (TextView) inflate.findViewById(R.id.password_title);
        TextView textView = (TextView) inflate.findViewById(R.id.password_field);
        this.n = textView;
        this.o = (TextView) inflate.findViewById(R.id.account_email_field);
        this.f = (TextView) inflate.findViewById(R.id.error_message_field);
        ajyf a = ajygVar.a((TextView) inflate.findViewById(R.id.confirm_button));
        this.h = a;
        a.c = new ajyc() { // from class: wes
            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                weu.this.f();
            }
        };
        textView.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: wep
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i, KeyEvent keyEvent) {
                weu weuVar = weu.this;
                if (i != 6) {
                    return false;
                }
                weuVar.f();
                return true;
            }
        });
    }

    private final void m() {
        this.e.setTextColor(wbs.W(this.a, R.attr.ytThemedBlue).orElse(0));
        this.n.setText("");
        whu.I(this.f, false);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        m();
        whu.I(this.f, false);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        final aqws aqwsVar = (aqws) obj;
        aulq aulqVar = aqwsVar.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aova aovaVar = (aova) aulqVar.pX(AccountsListRenderer.accountItemRenderer);
        apud apudVar = aqwsVar.c;
        if (apudVar == null) {
            apudVar = apud.b;
        }
        this.g = AccountIdentity.m(apudVar);
        if ((aqwsVar.b & 8) == 0) {
            this.d.setVisibility(0);
        } else {
            this.p = Long.valueOf(aqwsVar.e);
            ynm.k(anfq.h(this.k.d.a(), new wgs(((C$AutoValue_AccountIdentity) this.g).a, 2), angq.a), angq.a, new ynk() { // from class: weq
                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    weu.this.d.setVisibility(0);
                }
            }, new ynl() { // from class: wer
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj2) {
                    weu weuVar = weu.this;
                    aqws aqwsVar2 = aqwsVar;
                    Long l = (Long) obj2;
                    if (l == null || aqwsVar2.e != l.longValue()) {
                        weuVar.d.setVisibility(0);
                    } else {
                        weuVar.c.j(1);
                    }
                }
            });
        }
        TextView textView = this.l;
        aqyg aqygVar = aovaVar.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.m;
        aqyg aqygVar2 = aovaVar.e;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        aong aongVar = (aong) apmg.a.createBuilder();
        aong aongVar2 = (aong) aqyg.a.createBuilder();
        aongVar2.copyOnWrite();
        aqyg aqygVar3 = (aqyg) aongVar2.instance;
        aqygVar3.b |= 1;
        aqygVar3.d = "Confirm";
        aqyg aqygVar4 = (aqyg) aongVar2.build();
        aongVar.copyOnWrite();
        apmg apmgVar = (apmg) aongVar.instance;
        aqygVar4.getClass();
        apmgVar.i = aqygVar4;
        apmgVar.b |= 256;
        aongVar.copyOnWrite();
        apmg apmgVar2 = (apmg) aongVar.instance;
        apmgVar2.d = 2;
        apmgVar2.c = 1;
        this.h.b((apmg) aongVar.build(), null);
        m();
        TextView textView3 = this.o;
        aqyg aqygVar5 = aovaVar.e;
        if (aqygVar5 == null) {
            aqygVar5 = aqyg.a;
        }
        textView3.setText(ajcq.b(aqygVar5));
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }

    public final void f() {
        String charSequence = this.n.getText().toString();
        if (charSequence.length() > 0) {
            this.j.a(charSequence, this.g, this);
        }
        this.n.setText("");
    }

    @Override // defpackage.wgi
    public final void g() {
        this.c.j(2);
    }

    @Override // defpackage.wgi
    public final void h() {
        this.i.post(new Runnable() { // from class: wet
            @Override // java.lang.Runnable
            public final void run() {
                weu weuVar = weu.this;
                weuVar.e.setTextColor(wbs.W(weuVar.a, R.attr.ytBrandRed).orElse(0));
                whu.G(weuVar.f, weuVar.b.getString(R.string.retry_password));
            }
        });
    }

    @Override // defpackage.wgi
    public final void j() {
    }

    @Override // defpackage.wgi
    public final void k() {
        this.c.j(1);
        Long l = this.p;
        if (l != null) {
            ynm.i(this.k.d.b(new wgt(((C$AutoValue_AccountIdentity) this.g).a, l.longValue(), 0), angq.a), llr.i);
        }
    }
}
