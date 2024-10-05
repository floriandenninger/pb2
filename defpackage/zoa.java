package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class zoa implements View.OnClickListener {
    public final View a;
    private final Context b;
    private final znh c;
    private final acra d;
    private final asht e;

    public zoa(Context context, znh znhVar, View view, acra acraVar, asht ashtVar) {
        context.getClass();
        this.b = context;
        znhVar.getClass();
        this.c = znhVar;
        view.getClass();
        this.a = view;
        view.setOnClickListener(this);
        d();
        acraVar.getClass();
        this.d = acraVar;
        this.e = ashtVar;
    }

    private final asie f() {
        aone createBuilder = asie.a.createBuilder();
        int i = 1 != this.c.g() ? 3 : 2;
        createBuilder.copyOnWrite();
        asie asieVar = (asie) createBuilder.instance;
        asieVar.c = i - 1;
        asieVar.b |= 1;
        return (asie) createBuilder.build();
    }

    protected Drawable a() {
        return ((ImageView) this.a).getDrawable();
    }

    protected View b() {
        return this.a;
    }

    protected acsc c() {
        return acsb.c(18045);
    }

    protected void d() {
        if (this.c.g() == 0) {
            this.a.setContentDescription(this.b.getString(R.string.upload_edit_camera_switch_to_front_button));
        } else {
            this.a.setContentDescription(this.b.getString(R.string.upload_edit_camera_switch_to_back_button));
        }
    }

    public final void e() {
        if (this.c.J()) {
            Object a = a();
            if (a instanceof Animatable) {
                ((Animatable) a).start();
            } else {
                b().animate().rotationBy(-180.0f).start();
            }
            znh znhVar = this.c;
            znhVar.D(znhVar.g() ^ 1);
            d();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        asht ashtVar;
        if (view == this.a) {
            e();
            acra acraVar = this.d;
            acqx acqxVar = new acqx(c());
            asht ashtVar2 = this.e;
            if (ashtVar2 == null) {
                aone createBuilder = asht.a.createBuilder();
                aone createBuilder2 = asil.a.createBuilder();
                asie f = f();
                createBuilder2.copyOnWrite();
                asil asilVar = (asil) createBuilder2.instance;
                f.getClass();
                asilVar.h = f;
                asilVar.b |= 128;
                asil asilVar2 = (asil) createBuilder2.build();
                createBuilder.copyOnWrite();
                asht ashtVar3 = (asht) createBuilder.instance;
                asilVar2.getClass();
                ashtVar3.B = asilVar2;
                ashtVar3.c = 262144 | ashtVar3.c;
                ashtVar = (asht) createBuilder.build();
            } else {
                aone builder = ashtVar2.toBuilder();
                asil asilVar3 = this.e.B;
                if (asilVar3 == null) {
                    asilVar3 = asil.a;
                }
                aone builder2 = asilVar3.toBuilder();
                asie f2 = f();
                builder2.copyOnWrite();
                asil asilVar4 = (asil) builder2.instance;
                f2.getClass();
                asilVar4.h = f2;
                asilVar4.b |= 128;
                asil asilVar5 = (asil) builder2.build();
                builder.copyOnWrite();
                asht ashtVar4 = (asht) builder.instance;
                asilVar5.getClass();
                ashtVar4.B = asilVar5;
                ashtVar4.c = 262144 | ashtVar4.c;
                ashtVar = (asht) builder.build();
            }
            acraVar.I(3, acqxVar, ashtVar);
        }
    }
}
