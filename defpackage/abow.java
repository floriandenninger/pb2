package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.Editable;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowTooltipCommandOuterClass;
import com.google.protos.youtube.api.innertube.TooltipRendererOuterClass;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abow implements DialogInterface.OnDismissListener, abjl, abjm, abju, ypd {
    public final abol a;
    public final EditText b;
    public final aahd d;
    public final akcy e;
    public final abiy f;
    public abjl g;
    public boolean h;
    public boolean i;
    private final Context j;
    private final Activity k;
    private final Dialog l;
    private final abjv m;
    private final abge n;
    private final abgd o;
    private asqx q;
    private Editable r;
    private boolean s;
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    private final Handler p = new Handler();
    private boolean t = false;

    public abow(Context context, abgd abgdVar, azrw azrwVar, Activity activity, abjv abjvVar, ypa ypaVar, aahd aahdVar, abge abgeVar, abom abomVar, akcy akcyVar, abiy abiyVar) {
        this.j = context;
        this.o = abgdVar;
        this.k = activity;
        this.m = abjvVar;
        this.d = aahdVar;
        this.n = abgeVar;
        this.e = akcyVar;
        this.f = abiyVar;
        Dialog dialog = new Dialog(context, R.style.action_panel_dialog_theme);
        this.l = dialog;
        dialog.setOnDismissListener(this);
        View inflate = LayoutInflater.from(context).inflate(R.layout.live_chat_action_panel_dialog, (ViewGroup) null, false);
        inflate.findViewById(R.id.action_panel_dialog).setOnClickListener(new View.OnClickListener() { // from class: abos
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                abow.this.a();
            }
        });
        acra acraVar = ((abht) azrwVar.get()).p;
        Context context2 = (Context) abomVar.a.get();
        context2.getClass();
        ajjz ajjzVar = (ajjz) abomVar.b.get();
        ajjzVar.getClass();
        ((ajvb) abomVar.c.get()).getClass();
        ajut ajutVar = (ajut) abomVar.d.get();
        ajutVar.getClass();
        aahd aahdVar2 = (aahd) abomVar.e.get();
        aahdVar2.getClass();
        abjr abjrVar = (abjr) abomVar.f.get();
        abjrVar.getClass();
        ((abjk) abomVar.g.get()).getClass();
        abji abjiVar = (abji) abomVar.h.get();
        abjiVar.getClass();
        ajsa ajsaVar = (ajsa) abomVar.i.get();
        ajsaVar.getClass();
        acpk acpkVar = (acpk) abomVar.j.get();
        acpkVar.getClass();
        zim zimVar = (zim) abomVar.k.get();
        zimVar.getClass();
        aoae aoaeVar = (aoae) abomVar.l.get();
        aoaeVar.getClass();
        akcy akcyVar2 = (akcy) abomVar.m.get();
        akcyVar2.getClass();
        axze axzeVar = (axze) abomVar.n.get();
        axzeVar.getClass();
        ((adyu) abomVar.o.get()).getClass();
        advq advqVar = (advq) abomVar.p.get();
        advqVar.getClass();
        inflate.getClass();
        abol abolVar = new abol(context2, ajjzVar, ajutVar, aahdVar2, abjrVar, abjiVar, ajsaVar, acpkVar, zimVar, aoaeVar, akcyVar2, axzeVar, advqVar, inflate, true, true, acraVar, null, null, null, null, null, null);
        this.a = abolVar;
        akcyVar.g(inflate);
        this.b = abolVar.r();
        dialog.setContentView(abolVar.w);
        abolVar.s = true;
        abolVar.t = true;
        abolVar.q = this;
        ypaVar.g(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.e.f();
        if (this.k.isFinishing() || this.k.isDestroyed() || !this.l.isShowing()) {
            return;
        }
        this.l.dismiss();
        this.m.a(this);
    }

    @Override // defpackage.abju
    public final int b() {
        return 2;
    }

    @Override // defpackage.abju
    public final void c() {
        a();
    }

    @Override // defpackage.abjl
    public final void d() {
        if (this.k.isFinishing() || this.k.isDestroyed() || !this.l.isShowing()) {
            return;
        }
        this.l.dismiss();
    }

    @Override // defpackage.abjl
    public final void f(asrh asrhVar) {
        if (this.g != null) {
            a();
            this.g.f(asrhVar);
        }
    }

    @Override // defpackage.abjl
    public final void g(CharSequence charSequence) {
        if (this.g != null) {
            a();
            this.g.g(charSequence);
        }
    }

    @Override // defpackage.abjl
    public final void h(apxf apxfVar) {
        if (this.g != null) {
            a();
            this.g.h(apxfVar);
        }
    }

    @Override // defpackage.abju
    public final void i() {
        boolean z = this.s;
        Window window = this.l.getWindow();
        if (window == null) {
            Log.e(getClass().getSimpleName(), "Dialog.getWindow() is null.");
        } else {
            window.setLayout(-1, -2);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            window.setSoftInputMode((true != z ? 5 : 3) | 16);
            TypedValue typedValue = new TypedValue();
            if (!this.j.getTheme().resolveAttribute(android.R.attr.backgroundDimAmount, typedValue, true) || typedValue.type != 4) {
                attributes.dimAmount = 0.5f;
            } else {
                attributes.dimAmount = typedValue.getFloat();
            }
            window.setAttributes(attributes);
        }
        this.l.show();
        if (this.q != null) {
            this.a.e();
            this.a.d(this.q);
        }
        Editable editable = this.r;
        if (editable != null) {
            this.b.setText(editable);
            this.b.setSelection(this.r.length());
        }
        if (this.s) {
            this.a.I();
        } else {
            this.b.requestFocus();
        }
        asqx asqxVar = this.q;
        if (asqxVar.b == 121323709) {
            asqf asqfVar = (asqf) asqxVar.c;
            if ((asqfVar.b & 128) != 0) {
                apxf apxfVar = asqfVar.j;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                if (this.t) {
                    return;
                }
                this.t = true;
                if (apxfVar.pY(ShowTooltipCommandOuterClass.showTooltipCommand)) {
                    auum auumVar = (auum) apxfVar.pX(ShowTooltipCommandOuterClass.showTooltipCommand);
                    aulq aulqVar = auumVar.c;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    if (aulqVar.pY(TooltipRendererOuterClass.tooltipRenderer)) {
                        aulq aulqVar2 = auumVar.c;
                        if (aulqVar2 == null) {
                            aulqVar2 = aulq.a;
                        }
                        final avhy avhyVar = (avhy) aulqVar2.pX(TooltipRendererOuterClass.tooltipRenderer);
                        if ("live-chat-message-input".equals(avhyVar.d)) {
                            this.p.postDelayed(new Runnable() { // from class: abot
                                @Override // java.lang.Runnable
                                public final void run() {
                                    abow abowVar = abow.this;
                                    avhy avhyVar2 = avhyVar;
                                    akcy akcyVar = abowVar.e;
                                    akci k = akcyVar.k(avhyVar2);
                                    k.a = abowVar.a.r();
                                    k.l();
                                    akcyVar.c(k.a());
                                }
                            }, 500L);
                            if (zev.e(this.j)) {
                                this.a.r().setAccessibilityDelegate(new abou(this, avhyVar));
                                return;
                            }
                            return;
                        }
                    }
                }
                this.n.a(amru.r(apxfVar), this.o, true);
            }
        }
    }

    public final void j() {
        this.t = false;
        this.a.r().setAccessibilityDelegate(null);
    }

    public final void k(asqx asqxVar, Editable editable, boolean z, boolean z2) {
        this.h = z2;
        this.q = asqxVar;
        this.r = editable;
        this.s = z;
        this.m.b(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahcx.class};
        }
        if (i == 0) {
            ahcx ahcxVar = (ahcx) obj;
            if (ahcxVar.d() != aigf.FULLSCREEN && ahcxVar.d() != aigf.DEFAULT) {
                a();
            }
            boolean z = ahcxVar.d() == aigf.FULLSCREEN;
            if (this.f.a() || this.h == z) {
                return null;
            }
            a();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((abov) it.next()).a(this.a.h());
        }
        this.m.a(this);
    }

    @Override // defpackage.abjl
    public final void e(apmg apmgVar) {
        int i = apmgVar.b;
        if ((32768 & i) == 0) {
            if ((i & 512) != 0) {
                whu.L(this.j, apmgVar.j, 0);
            }
        } else {
            aahd aahdVar = this.d;
            apxf apxfVar = apmgVar.p;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.a(apxfVar);
        }
    }
}
