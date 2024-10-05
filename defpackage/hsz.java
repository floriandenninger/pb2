package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hsz implements zfi {
    public boolean a;
    private final View b;
    private final acra c;
    private final acsc d;
    private boolean e;
    private boolean f = true;

    public hsz(View view, acra acraVar, acsc acscVar) {
        this.b = view;
        acraVar.getClass();
        this.c = acraVar;
        this.d = acscVar;
    }

    private final void d() {
        View view = this.b;
        if (view == null) {
            return;
        }
        boolean z = this.e && this.f;
        view.setEnabled(z);
        this.b.setVisibility(true != z ? 4 : 0);
    }

    @Override // defpackage.zfi
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.b == null) {
            return;
        }
        if (!this.e) {
            acsc acscVar = this.d;
            if (acscVar != null) {
                this.c.n(new acqx(acscVar));
            }
            this.e = true;
        }
        d();
        if (this.a) {
            int i = true != bool.booleanValue() ? 8 : 0;
            View view = this.b;
            if (view == null || view.findViewById(R.id.reel_camera_effect_new_indicator) == null) {
                return;
            }
            this.b.findViewById(R.id.reel_camera_effect_new_indicator).setVisibility(i);
        }
    }

    public final void b() {
        this.f = false;
        d();
    }

    public final void c() {
        this.f = true;
        d();
    }
}
