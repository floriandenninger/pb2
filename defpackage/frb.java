package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class frb extends fqz {
    public fqy d;
    private final ImageView e;

    public frb(View view, ajjz ajjzVar, fqy fqyVar) {
        super(view, ajjzVar, fqyVar);
        view.setVisibility(8);
        this.e = (ImageView) view.findViewById(R.id.image);
        view.setOnClickListener(new View.OnClickListener() { // from class: fra
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fqy fqyVar2;
                frb frbVar = frb.this;
                Object obj = frbVar.c;
                if (obj != null) {
                    aoyu aoyuVar = (aoyu) obj;
                    if ((aoyuVar.b & 4) == 0 || (fqyVar2 = frbVar.d) == null) {
                        return;
                    }
                    apxf apxfVar = aoyuVar.e;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    fqyVar2.a(obj, amru.r(apxfVar));
                }
            }
        });
        h();
    }

    private final void h() {
        Object obj = this.c;
        boolean z = false;
        if (obj != null && (((aoyu) obj).b & 4) != 0 && this.d != null) {
            z = true;
        }
        e(z);
    }

    public final void a(aoyu aoyuVar, acra acraVar) {
        if (acraVar != null) {
            acraVar.u(new acqx(aoyuVar.g), null);
        }
        this.c = aoyuVar;
        this.a.setVisibility(0);
        if ((aoyuVar.b & 2) == 0) {
            this.a.setVisibility(8);
            return;
        }
        ajjz ajjzVar = this.b;
        ImageView imageView = this.e;
        avgg avggVar = aoyuVar.d;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.k(imageView, avggVar, f(R.drawable.quantum_ic_expand_more_grey600_18));
        if (this.e.getBackground() != null && (this.e.getBackground().getCurrent() instanceof GradientDrawable)) {
            GradientDrawable gradientDrawable = (GradientDrawable) this.e.getBackground().getCurrent().mutate();
            gradientDrawable.setColor(aoyuVar.c);
            this.e.setBackground(gradientDrawable);
        }
        h();
    }

    @Override // defpackage.fqz
    public final void b(fqy fqyVar) {
        this.d = fqyVar;
        h();
    }

    @Override // defpackage.fqz
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        throw null;
    }

    @Override // defpackage.fqz
    public final void d() {
        super.d();
        this.e.setImageDrawable(null);
    }

    public final void g(aoyu aoyuVar, acra acraVar, aahd aahdVar) {
        if ((aoyuVar.b & 8) != 0) {
            apxf apxfVar = aoyuVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
        a(aoyuVar, acraVar);
    }
}
