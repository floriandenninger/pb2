package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acdw implements ComponentCallbacks {
    public azrw a;
    public azrw b;
    public final Context c;
    public final View d;
    public final RecyclerView e;
    public final WindowManager f;
    public final WindowManager.LayoutParams g;
    public final abht h;
    public final acra i;
    public final ajvb j;
    public final ajut k;
    public final ajjs l;
    public final ajsd m;
    public final ajgq n;
    public final sxw o;
    public final azrw p;
    public final abiy q;
    public acdv r;
    public ajwf s;
    public ajce t;
    public boolean u;
    public final sqq v;
    public final axze w;

    public acdw(Context context, zaw zawVar, acra acraVar, ajut ajutVar, ajjs ajjsVar, abht abhtVar, ajsd ajsdVar, sqq sqqVar, ajgq ajgqVar, sxw sxwVar, azrw azrwVar, abiy abiyVar, axze axzeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = context;
        this.i = acraVar;
        this.p = azrwVar;
        zawVar.getClass();
        ajutVar.getClass();
        this.k = ajutVar;
        this.l = ajjsVar;
        this.h = abhtVar;
        this.m = ajsdVar;
        this.v = sqqVar;
        this.n = ajgqVar;
        this.o = sxwVar;
        this.q = abiyVar;
        this.w = axzeVar;
        this.f = (WindowManager) context.getSystemService("window");
        View inflate = LayoutInflater.from(context).inflate(R.layout.live_chat_window, (ViewGroup) null);
        this.d = inflate;
        this.e = (RecyclerView) inflate.findViewById(R.id.conversation_list);
        this.j = new acds(this);
        WindowManager.LayoutParams ct = adyu.ct();
        this.g = ct;
        ct.flags |= 16;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.screencast_live_chat_window_alpha, typedValue, true);
        ct.alpha = typedValue.getFloat();
        d();
        context.registerComponentCallbacks(this);
    }

    private final void d() {
        Resources resources = this.c.getResources();
        int integer = resources.getInteger(R.integer.screencast_live_chat_width_percent);
        int integer2 = resources.getInteger(R.integer.screencast_live_chat_height_percent);
        int N = yjk.N(this.c);
        int L = yjk.L(this.c);
        this.g.width = (N * integer) / 100;
        this.g.height = (L * integer2) / 100;
    }

    public final void a() {
        if (this.d.getParent() != null) {
            this.f.removeView(this.d);
        }
        this.t = null;
        this.c.unregisterComponentCallbacks(this);
    }

    public final void b() {
        if (this.u) {
            this.u = false;
            if (this.t != null) {
                this.h.C();
            }
        }
    }

    public final void c() {
        if (!this.u || this.d.getParent() == null) {
            return;
        }
        this.f.updateViewLayout(this.d, this.g);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        d();
        c();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
