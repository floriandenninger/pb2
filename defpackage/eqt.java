package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eqt implements eqg {
    public final ci a;
    public final zaw b;
    public final aavf c;
    public final Handler d;
    public final Executor e;
    public final Executor f;
    public EditText h;
    public AlertDialog i;
    public aprv j;
    public TextWatcher k;
    public aakv l;
    private final afsy o;
    private final aahv p;
    private final ajck q;
    private final azrw r;
    private View s;
    private TextInputLayout t;
    private LinearLayout u;
    private Drawable v;
    private ayqx w;
    public final zik g = zik.a(geo.b);
    public Runnable m = null;
    public anhy n = null;

    public eqt(ci ciVar, zaw zawVar, afsy afsyVar, aahv aahvVar, ajrv ajrvVar, azrw azrwVar, aavf aavfVar, Handler handler, Executor executor, Executor executor2) {
        this.a = ciVar;
        this.b = zawVar;
        this.o = afsyVar;
        this.p = aahvVar;
        this.q = ajrvVar;
        this.r = azrwVar;
        this.c = aavfVar;
        this.d = handler;
        this.e = executor;
        this.f = executor2;
    }

    private final void g() {
        this.t.v(null);
    }

    @Override // defpackage.eqg
    public final void a(aprv aprvVar) {
        if (this.i == null) {
            this.k = new eqn(this);
            this.l = this.p.a(this.o.c());
            View inflate = LayoutInflater.from(this.a).inflate(R.layout.channel_profile_handle_editor, (ViewGroup) null);
            this.s = inflate;
            TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.handle_edit_layout);
            this.t = textInputLayout;
            textInputLayout.J("@");
            TextView textView = (TextView) this.t.findViewById(R.id.textinput_prefix_text);
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            textView.setGravity(17);
            this.t.q(-1);
            this.v = new tjr(this.a.getResources().getDimension(R.dimen.channel_edit_handle_progress_radius), this.a.getResources().getDimensionPixelSize(R.dimen.channel_edit_handle_progress_stroke_width), 0, new int[]{wbs.Q(this.a, R.attr.ytIconActiveOther)});
            this.t.w(true);
            this.t.y(ColorStateList.valueOf(wbs.Q(this.a, R.attr.ytErrorIndicator)));
            this.h = (EditText) this.t.findViewById(R.id.handle_edit);
            this.u = (LinearLayout) this.s.findViewById(R.id.info_items_layout);
            AlertDialog create = new AlertDialog.Builder(this.a).setView(this.s).setPositiveButton(this.a.getString(android.R.string.ok), (DialogInterface.OnClickListener) null).setNegativeButton(this.a.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).create();
            this.i = create;
            create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: eqi
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    final eqt eqtVar = eqt.this;
                    eqtVar.h.addTextChangedListener(eqtVar.k);
                    eqtVar.i.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: eqj
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            final eqt eqtVar2 = eqt.this;
                            final String obj = eqtVar2.h.getText().toString();
                            if (obj.equals(eqtVar2.j.c)) {
                                eqtVar2.i.dismiss();
                                return;
                            }
                            aavf aavfVar = eqtVar2.c;
                            String str = eqtVar2.j.e;
                            aauy aauyVar = new aauy(aavfVar.f, aavfVar.a, null, null, null);
                            ((aava) aauyVar).c = str;
                            aauyVar.a = obj;
                            ynm.n(eqtVar2.a, eqtVar2.c.a(aauyVar), new zfi() { // from class: eqk
                                @Override // defpackage.zfi
                                public final void a(Object obj2) {
                                    eqt eqtVar3 = eqt.this;
                                    eqtVar3.b.d(eqtVar3.j.h);
                                }
                            }, new zfi() { // from class: eql
                                @Override // defpackage.zfi
                                public final void a(Object obj2) {
                                    eqt eqtVar3 = eqt.this;
                                    eqtVar3.g.b(obj);
                                    eqtVar3.i.dismiss();
                                }
                            });
                        }
                    });
                    eqtVar.h.selectAll();
                    whu.J(eqtVar.h);
                }
            });
            this.i.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: eqh
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    eqt eqtVar = eqt.this;
                    eqtVar.e();
                    eqtVar.h.removeTextChangedListener(eqtVar.k);
                    eqtVar.d();
                }
            });
        }
        e();
        this.j = aprvVar;
        TextInputLayout textInputLayout2 = this.t;
        aqyg aqygVar = aprvVar.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        textInputLayout2.B(ajcq.b(aqygVar));
        this.h.setText(this.j.c);
        this.t.p(null);
        g();
        this.u.removeAllViews();
        for (aprx aprxVar : this.j.j) {
            etp etpVar = (etp) this.r.get();
            new ajok();
            etpVar.d(aprxVar);
            this.u.addView(etpVar.a);
        }
        if (this.j.j.size() > 0) {
            this.u.setVisibility(0);
        } else {
            this.u.setVisibility(8);
        }
        this.w = this.l.i(this.j.f).ab(ayqr.a()).ax(new ayrs() { // from class: eqm
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                eqt eqtVar = eqt.this;
                ammv ammvVar = (ammv) obj;
                if (ammvVar.h() && (ammvVar.c() instanceof apqd)) {
                    apqd apqdVar = (apqd) ammvVar.c();
                    if ((apqdVar.b.b & 2) != 0) {
                        String handleEdit = apqdVar.getHandleEdit();
                        eqtVar.h.setText(handleEdit);
                        eqtVar.h.setSelection(handleEdit.length());
                        String d = apqdVar.d();
                        d.getClass();
                        amkq.O(!d.isEmpty(), "key cannot be empty");
                        aone createBuilder = apqe.a.createBuilder();
                        createBuilder.copyOnWrite();
                        apqe apqeVar = (apqe) createBuilder.instance;
                        apqeVar.b |= 1;
                        apqeVar.c = d;
                        byte[] c = new apqb(createBuilder).b().c();
                        aone createBuilder2 = aqua.a.createBuilder();
                        alwe b = alwf.b();
                        b.d(2);
                        alwi b2 = b.b();
                        createBuilder2.copyOnWrite();
                        aqua aquaVar = (aqua) createBuilder2.instance;
                        b2.getClass();
                        aquaVar.d = b2;
                        aquaVar.b = 2 | aquaVar.b;
                        aqua aquaVar2 = (aqua) createBuilder2.build();
                        aalc c2 = eqtVar.l.c();
                        c2.i(apqdVar.d(), aquaVar2, c);
                        c2.b().Q();
                    }
                }
            }
        });
        this.i.show();
        Window window = this.i.getWindow();
        if (window != null) {
            window.setLayout((int) this.a.getResources().getDimension(R.dimen.channel_edit_dialog_width), -2);
        }
    }

    @Override // defpackage.eqg
    public final void b(ero eroVar) {
        this.g.c(eroVar);
    }

    @Override // defpackage.eqg
    public final void c(ero eroVar) {
        this.g.d(eroVar);
    }

    public final void d() {
        Runnable runnable = this.m;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.m = null;
        }
        anhy anhyVar = this.n;
        if (anhyVar != null) {
            anhyVar.cancel(true);
            this.n = null;
        }
    }

    public final void e() {
        Object obj = this.w;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.w = null;
        }
    }

    public final void f(eqs eqsVar) {
        int i = eqsVar.b - 1;
        if (i != 0) {
            if (i == 1) {
                this.t.p(null);
                g();
                this.i.getButton(-1).setEnabled(false);
                return;
            } else if (i == 2) {
                this.t.p(this.v);
                g();
                this.i.getButton(-1).setEnabled(false);
                return;
            } else if (i != 3) {
                this.t.p(null);
                Spanned c = ajcq.c(eqsVar.a, this.q);
                ((TextView) this.t.findViewById(R.id.textinput_error)).setMovementMethod(LinkMovementMethod.getInstance());
                this.t.v(c);
                this.i.getButton(-1).setEnabled(false);
                return;
            }
        }
        this.t.p(null);
        g();
        this.i.getButton(-1).setEnabled(true);
    }
}
