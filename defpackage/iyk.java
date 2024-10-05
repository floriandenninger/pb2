package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iyk {
    public final aypy a;
    public final int b;
    public final int c;
    public final iyj d;
    public final amnv e;
    public int f;
    public int g;
    public int h;
    public int i;
    private final azrh j;
    private final Context k;
    private final ViewGroup l;
    private final View m;
    private final View n;
    private final View o;
    private final int p;
    private int q;

    public iyk(Context context, oqk oqkVar, yqw yqwVar, ViewGroup viewGroup, int i, int i2, int i3, iyj iyjVar, amnv amnvVar, Optional optional, byte[] bArr, byte[] bArr2) {
        azrh e = azrh.e();
        this.j = e;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.k = context;
        this.b = i;
        this.c = i2;
        this.l = viewGroup;
        this.m = viewGroup.findViewById(i);
        this.n = viewGroup.findViewById(i3);
        this.o = viewGroup.findViewById(i2);
        this.d = iyjVar;
        this.e = amnvVar;
        this.p = yjk.K(context.getResources().getDisplayMetrics(), 320);
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: iyf
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                iyk.this.f(view.getWidth(), false);
            }
        });
        this.q = ((Integer) optional.map(iur.h).orElse(0)).intValue();
        this.a = aypy.m(e.B(), oqkVar.a.B(), new ayro() { // from class: iyg
            @Override // defpackage.ayro
            public final Object a(Object obj, Object obj2) {
                iyk iykVar = iyk.this;
                ammw ammwVar = (ammw) obj;
                iykVar.f = ((Integer) ammwVar.a).intValue();
                iykVar.i = ((Integer) obj2).intValue();
                return (Boolean) ammwVar.b;
            }
        });
        yqwVar.f(new Callable() { // from class: iyi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final iyk iykVar = iyk.this;
                return iykVar.a.ax(new ayrs() { // from class: iyh
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        iyk iykVar2 = iyk.this;
                        Boolean bool = (Boolean) obj;
                        if (((Optional) iykVar2.e.get()).isPresent()) {
                            iykVar2.e();
                            if (bool.booleanValue()) {
                                PanelsConfiguration panelsConfiguration = (PanelsConfiguration) ((Optional) iykVar2.e.get()).get();
                                if (panelsConfiguration.d()) {
                                    iykVar2.d.h(panelsConfiguration.a, iykVar2.b);
                                    iykVar2.d.h((PanelDescriptor) panelsConfiguration.b.orElse(null), iykVar2.c);
                                } else {
                                    iykVar2.d.j(iykVar2.b);
                                    iykVar2.d.h(panelsConfiguration.a, iykVar2.c);
                                }
                            }
                            if (iykVar2.i()) {
                                iykVar2.d.k(iykVar2.b, iykVar2.g);
                            }
                            if (iykVar2.h()) {
                                iykVar2.d.k(iykVar2.c, iykVar2.h);
                            }
                        }
                    }
                });
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Context context, ce ceVar, int i) {
        int i2;
        if (ceVar instanceof gka) {
            float K = yjk.K(context.getResources().getDisplayMetrics(), 720);
            float f = i;
            if (f < K) {
                i2 = 0;
            } else {
                double d = f - K;
                Double.isNaN(d);
                i2 = (int) (d / 2.0d);
            }
            ((gka) ceVar).aV(i2);
        }
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("active_panel_on_single_panel_mode_key", this.q);
        return bundle;
    }

    public final void c() {
        f(this.l.getWidth(), true);
    }

    public final void d() {
        this.q = 2;
        if (h()) {
            return;
        }
        e();
    }

    public final void e() {
        int i;
        if (this.q == 0) {
            if (((Optional) this.e.get()).isPresent()) {
                i = ((PanelsConfiguration) ((Optional) this.e.get()).get()).d() ? 1 : 2;
            } else {
                i = 0;
            }
            this.q = i;
        }
        int i2 = this.f;
        int i3 = this.i;
        if (!g()) {
            i3 = (!g() && ((Optional) this.e.get()).isPresent() && ((PanelsConfiguration) ((Optional) this.e.get()).get()).d() && this.q == 1) ? i2 : 0;
        } else if (i3 <= 0) {
            i3 = this.p;
        }
        ammw a = ammw.a(Integer.valueOf(i3), Integer.valueOf(i2 - i3));
        this.g = ((Integer) a.a).intValue();
        this.h = ((Integer) a.b).intValue();
        if (g()) {
            this.m.setVisibility(0);
            yny.z(this.m, yny.x(this.g), ViewGroup.LayoutParams.class);
            this.n.setVisibility(0);
            this.o.setVisibility(0);
        } else {
            if (this.q == 1) {
                this.m.setVisibility(0);
                yny.z(this.m, yny.x(this.g), ViewGroup.LayoutParams.class);
                this.o.setVisibility(8);
            } else {
                this.m.setVisibility(8);
                this.o.setVisibility(0);
            }
            this.n.setVisibility(8);
        }
        this.d.i();
    }

    public final void f(int i, boolean z) {
        this.j.c(ammw.a(Integer.valueOf(i), Boolean.valueOf(z)));
    }

    public final boolean g() {
        return ((Optional) this.e.get()).isPresent() && ((PanelsConfiguration) ((Optional) this.e.get()).get()).d() && this.f >= yjk.K(this.k.getResources().getDisplayMetrics(), 640);
    }

    public final boolean h() {
        return this.o.getVisibility() == 0;
    }

    public final boolean i() {
        return this.m.getVisibility() == 0;
    }

    public final boolean j() {
        if (!((Optional) this.e.get()).isPresent()) {
            return false;
        }
        PanelsConfiguration panelsConfiguration = (PanelsConfiguration) ((Optional) this.e.get()).get();
        if (g() || !panelsConfiguration.d() || this.m.getVisibility() != 8) {
            return false;
        }
        this.q = 1;
        e();
        return true;
    }
}
