package defpackage;

import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.research.xeno.effect.Control;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hkq implements zoq {
    public boolean a = false;
    float b = 0.0f;
    public float c = 0.0f;
    public String d = "";
    public final HashMap e = new HashMap();
    public FilterMapTable$FilterDescriptor f;
    public hkp g;
    public hko h;
    public boolean i;
    public vgz j;

    @Override // defpackage.zoq
    public final void a() {
        d();
        f();
        e();
        h();
        g();
        c();
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = this.f;
        if (filterMapTable$FilterDescriptor == null || !this.a) {
            return;
        }
        filterMapTable$FilterDescriptor.b("affine_viewfinder_transform");
    }

    public final void c() {
        hko hkoVar = this.h;
        if (hkoVar == null || !this.i) {
            return;
        }
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = this.f;
        final boolean z = filterMapTable$FilterDescriptor != null && filterMapTable$FilterDescriptor.f("retouch_intensity");
        final hkt hktVar = (hkt) hkoVar;
        hktVar.f.runOnUiThread(new Runnable() { // from class: hks
            @Override // java.lang.Runnable
            public final void run() {
                hkt.this.a.setVisibility(true != z ? 8 : 0);
            }
        });
        hko hkoVar2 = this.h;
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor2 = this.f;
        hkt hktVar2 = (hkt) hkoVar2;
        hktVar2.l = filterMapTable$FilterDescriptor2 != null && filterMapTable$FilterDescriptor2.f("relight_intensity");
        hktVar2.c();
    }

    public final void d() {
        Control b;
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = this.f;
        if (filterMapTable$FilterDescriptor == null || (b = filterMapTable$FilterDescriptor.b("green_screen_enabled")) == null) {
            return;
        }
        Control.nativeSetBoolValue(b.a.a, this.a);
    }

    public final void e() {
        hkp hkpVar = this.g;
        if (hkpVar != null) {
            FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = this.f;
            final boolean z = false;
            if (filterMapTable$FilterDescriptor != null && filterMapTable$FilterDescriptor.f("green_screen_enabled") && this.f.f("green_screen_bg_img_path")) {
                z = true;
            }
            final het hetVar = (het) hkpVar;
            if (hetVar.e && ((z && hetVar.d.getVisibility() == 8) || (!z && hetVar.d.getVisibility() == 0))) {
                hfq a = hetVar.s.a(acsb.c(127070));
                a.h(z);
                a.g();
            }
            hetVar.g.runOnUiThread(new Runnable() { // from class: heq
                @Override // java.lang.Runnable
                public final void run() {
                    het.this.d.setVisibility(true != z ? 8 : 0);
                }
            });
        }
    }

    public final void f() {
        Control b;
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = this.f;
        if (filterMapTable$FilterDescriptor == null || (b = filterMapTable$FilterDescriptor.b("green_screen_bg_img_path")) == null) {
            return;
        }
        Control.nativeSetStringValue(b.c.a, this.d);
    }

    public final void g() {
        Control b;
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = this.f;
        if (filterMapTable$FilterDescriptor == null || (b = filterMapTable$FilterDescriptor.b("relight_intensity")) == null) {
            return;
        }
        b.b.a(this.c);
    }

    public final void h() {
        Control b;
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = this.f;
        if (filterMapTable$FilterDescriptor == null || !this.i || (b = filterMapTable$FilterDescriptor.b("retouch_intensity")) == null) {
            return;
        }
        b.b.a(this.b);
    }

    public final void b(String str) {
        if (str != null) {
            this.d = str;
            if (!this.e.containsKey(str)) {
                HashMap hashMap = this.e;
                hashMap.put(this.d, Integer.valueOf(hashMap.size()));
            }
        } else {
            this.d = "";
        }
        f();
    }
}
