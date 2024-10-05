package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.libraries.youtube.livechat.ui.common.WrappedLinearLayoutManager;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatRecyclerView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jbe extends ahus implements View.OnClickListener, fnp {
    private jbd A;
    private boolean B;
    private final aiqn C;
    private final aeqh D;
    public final azrw a;
    public final Context b;
    public final ajgq c;
    public final sxw d;
    public final azrw e;
    public final boolean f;
    public boolean g;
    public LiveChatRecyclerView h;
    public ViewGroup i;
    public jbb j;
    public ajwf k;
    public OrientationEventListener l;
    public final sqq m;
    private final azrw n;
    private final ajoy o;
    private final ajvb p;
    private final abhc q;
    private final ayqd r;
    private final abiy s;
    private final int t;
    private final int u;
    private final int v;
    private aboy w;
    private RelativeLayout x;
    private ViewGroup y;
    private ViewGroup z;

    public jbe(Context context, azrw azrwVar, ajvb ajvbVar, azrw azrwVar2, ajoy ajoyVar, abhc abhcVar, aiqn aiqnVar, aeqh aeqhVar, abiy abiyVar, ayqd ayqdVar, sqq sqqVar, ajgq ajgqVar, sxw sxwVar, azrw azrwVar3, byte[] bArr, byte[] bArr2) {
        super(context);
        this.b = context;
        this.a = azrwVar;
        this.n = azrwVar2;
        this.p = ajvbVar;
        this.o = ajoyVar;
        this.q = abhcVar;
        this.C = aiqnVar;
        this.D = aeqhVar;
        this.r = ayqdVar;
        this.s = abiyVar;
        this.m = sqqVar;
        this.c = ajgqVar;
        this.d = sxwVar;
        this.e = azrwVar3;
        this.j = jbc.a();
        this.f = abiyVar.a.d;
        this.t = context.getResources().getDimensionPixelSize(R.dimen.live_chat_overlay_action_panel_collapsed_width);
        this.v = context.getResources().getDimensionPixelSize(R.dimen.live_chat_overlay_conversation_list_width);
        this.u = context.getResources().getDimensionPixelSize(R.dimen.live_chat_overlay_banner_container_width);
    }

    private final void m(View view, int i) {
        yny.z(view, yny.x(Math.min(i, ((Integer) yjk.R(this.b).first).intValue())), ViewGroup.LayoutParams.class);
    }

    private final void n() {
        this.B = true;
        kX();
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ View a(Context context) {
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, R.layout.live_chat_overlay, null);
        this.i = viewGroup;
        this.h = (LiveChatRecyclerView) viewGroup.findViewById(R.id.conversation_list);
        this.x = (RelativeLayout) this.i.findViewById(R.id.live_chat_overlay_frame);
        this.z = (ViewGroup) this.i.findViewById(R.id.live_chat_banner_container);
        this.y = (ViewGroup) this.i.findViewById(R.id.live_chat_action_panel);
        if (this.w == null) {
            this.w = this.C.b(this.i, true, ((abht) this.a.get()).p);
        }
        this.h.setOnClickListener(this);
        this.h.af(new WrappedLinearLayoutManager());
        this.A = new jbd(this, this.p, this.o, ((abht) this.a.get()).p, this.s);
        jba jbaVar = new jba(this, context);
        this.l = jbaVar;
        jbaVar.enable();
        return this.i;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        if (this.B) {
            jbc a = this.j.a();
            if (a.b && a.c != null) {
                abht abhtVar = (abht) this.a.get();
                ((abhh) this.n.get()).a = abhtVar;
                abhtVar.w(this.A);
                abhtVar.v(a.c);
                aboy aboyVar = this.w;
                if (aboyVar != null) {
                    this.q.c(aboyVar);
                }
                abhf abhfVar = abhtVar.k;
                abnz b = this.D.b(viewGroup);
                b.r = true;
                abhtVar.k.b(b);
            }
            if (this.f) {
                i();
            }
            e();
            this.B = false;
        }
    }

    public final void e() {
        m(this.y, this.t);
        m(this.z, this.u);
        m(this.h, this.v);
    }

    public final void f(boolean z) {
        this.j.b(z);
        if (z) {
            n();
        } else {
            kV();
            ((abht) this.a.get()).r();
        }
        Y();
    }

    public final void i() {
        RelativeLayout relativeLayout = this.x;
        if (relativeLayout != null) {
            relativeLayout.setAlpha(true != this.g ? 1.0f : 0.3f);
        }
    }

    public final void j(boolean z) {
        this.j.b(z);
    }

    public final boolean k() {
        return this.j.a().b;
    }

    @Override // defpackage.fnp
    public final boolean mY(fhg fhgVar) {
        return fkc.d(fhgVar) && fhgVar.b() && !fhgVar.g() && !fhgVar.e();
    }

    @Override // defpackage.fnp
    public final void nH(fhg fhgVar) {
        this.j.c(fhgVar);
        if (!mY(fhgVar) || !this.j.a().b) {
            kV();
        } else {
            n();
        }
        Y();
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        if (this.s.a()) {
            return false;
        }
        jbc a = this.j.a();
        return a.b && a.c != null && mY(a.a);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.r.c(fnh.a);
    }
}
