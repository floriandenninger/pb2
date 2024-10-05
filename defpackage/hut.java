package defpackage;

import android.view.View;
import android.widget.Button;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hut implements View.OnClickListener, hxg, zva {
    public View a;
    public ChooseFilterView b;
    public Button c;
    public boolean d;
    public float e;
    public hus f;
    public acra g;

    @Override // defpackage.hxg
    public final float a() {
        if (this.d) {
            return this.e;
        }
        return 0.0f;
    }

    @Override // defpackage.hxg
    public final float b() {
        if (this.d) {
            return 0.0f;
        }
        return this.e;
    }

    @Override // defpackage.hxg
    public final View c() {
        return this.a;
    }

    public final void d() {
        if (this.d) {
            gfw.z(this);
            this.d = false;
        }
    }

    @Override // defpackage.hxg
    public final void e() {
    }

    @Override // defpackage.hxg
    public final void f() {
    }

    @Override // defpackage.zva
    public final void g() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.c) {
            this.f.h();
            this.g.I(3, new acqx(acsb.c(36856)), null);
        }
    }
}
