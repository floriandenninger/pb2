package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kdy extends ahus {
    View a;
    View b;
    public String c;
    public final adlt d;
    public final Set e;
    public final Set f;
    private boolean g;
    private boolean h;
    private final Handler i;

    public kdy(Context context, adlt adltVar) {
        super(context);
        this.i = new Handler(Looper.getMainLooper());
        this.d = adltVar;
        this.e = Collections.newSetFromMap(new WeakHashMap());
        this.f = Collections.newSetFromMap(new WeakHashMap());
    }

    private final void k() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((ahew) it.next()).a(this.g);
        }
    }

    @Override // defpackage.ahuy
    public final View a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.mdx_autoplay_overlay, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.cancel);
        this.a = findViewById;
        final int i = 1;
        findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: kdw
            public final /* synthetic */ kdy a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i != 0) {
                    kdy kdyVar = this.a;
                    adlm g = kdyVar.d.g();
                    if (g != null) {
                        g.E();
                        kdyVar.g(true);
                        return;
                    }
                    return;
                }
                kdy kdyVar2 = this.a;
                adlm g2 = kdyVar2.d.g();
                String str = kdyVar2.c;
                if (g2 == null || ammx.e(str)) {
                    return;
                }
                adld c = adle.c();
                c.f(str);
                g2.M(c.a());
                kdyVar2.kV();
            }
        });
        View findViewById2 = inflate.findViewById(R.id.play_now);
        this.b = findViewById2;
        final int i2 = 0;
        findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: kdw
            public final /* synthetic */ kdy a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 != 0) {
                    kdy kdyVar = this.a;
                    adlm g = kdyVar.d.g();
                    if (g != null) {
                        g.E();
                        kdyVar.g(true);
                        return;
                    }
                    return;
                }
                kdy kdyVar2 = this.a;
                adlm g2 = kdyVar2.d.g();
                String str = kdyVar2.c;
                if (g2 == null || ammx.e(str)) {
                    return;
                }
                adld c = adle.c();
                c.f(str);
                g2.M(c.a());
                kdyVar2.kV();
            }
        });
        return inflate;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final void d(Context context, View view) {
    }

    public final void g(boolean z) {
        if (this.h == z) {
            return;
        }
        this.h = z;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ahev) it.next()).G(z);
        }
    }

    @Override // defpackage.ahus
    public final void kV() {
        super.kV();
        if (this.g) {
            this.g = false;
            k();
        }
    }

    @Override // defpackage.ahus
    public final void kX() {
        super.kX();
        if (this.g) {
            return;
        }
        this.g = true;
        k();
        this.i.postDelayed(new Runnable() { // from class: kdx
            @Override // java.lang.Runnable
            public final void run() {
                kdy kdyVar = kdy.this;
                View view = kdyVar.a;
                if (view != null) {
                    view.requestFocus();
                    kdyVar.a.sendAccessibilityEvent(8);
                }
            }
        }, 300L);
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return true;
    }
}
