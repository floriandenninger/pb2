package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kjs implements kod {
    final /* synthetic */ kjw a;

    public kjs(kjw kjwVar) {
        this.a = kjwVar;
    }

    @Override // defpackage.kod
    public final void a(View view) {
        final kjw kjwVar = this.a;
        if (kjwVar.h != null) {
            return;
        }
        final ImageView imageView = (ImageView) view.findViewById(R.id.fullscreen_button);
        kjwVar.h = new yzr(imageView, imageView.getResources().getInteger(R.integer.fade_duration_fast), 8);
        kjwVar.h.h(new zch() { // from class: kjq
            @Override // defpackage.zch
            public final void nE(int i, yzr yzrVar) {
                kjw kjwVar2 = kjw.this;
                kjt kjtVar = kjwVar2.g;
                if (kjtVar == null || kjwVar2.d) {
                    return;
                }
                if (i == 0) {
                    kjtVar.f(false);
                } else if (i == 2 || i == 1) {
                    kjtVar.f(true);
                }
            }
        });
        final kjp kjpVar = kjwVar.e;
        kjpVar.e = imageView;
        jw.M(imageView, new kjn());
        imageView.setOnClickListener(new View.OnClickListener() { // from class: kjk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                kjp kjpVar2 = kjp.this;
                ImageView imageView2 = imageView;
                Boolean bool = kjpVar2.a.aR() ? (Boolean) kjpVar2.a.aO() : null;
                if (bool == null || !bool.booleanValue()) {
                    kjpVar2.c.I(3, new acqx(acsb.c(54319)), null);
                }
                ((nnc) kjpVar2.d.get()).p(!imageView2.isSelected());
            }
        });
        kjpVar.a.B().ax(new ayrs() { // from class: kjm
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                kjp kjpVar2 = kjp.this;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ImageView imageView2 = kjpVar2.e;
                if (imageView2 == null) {
                    return;
                }
                imageView2.setContentDescription(imageView2.getContext().getString(booleanValue ? R.string.accessibility_exit_fullscreen : R.string.accessibility_enter_fullscreen));
                kjpVar2.e.setSelected(booleanValue);
                kjpVar2.e.sendAccessibilityEvent(16384);
            }
        });
        aypy B = aypy.m(kjpVar.a, kjpVar.b, epc.t).B();
        imageView.getClass();
        B.ax(new ayrs() { // from class: kjl
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                imageView.setImageResource(((Integer) obj).intValue());
            }
        });
        if (kjwVar.f) {
            kjwVar.a();
        }
    }
}
