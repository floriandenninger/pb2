package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hiw implements View.OnClickListener, ajom {
    public final ida a;
    public final hjs b;
    public final ImageView c;
    private final hik d;
    private final ayqi e;
    private final hrv f;
    private final View g;
    private ayqx h;

    public hiw(ida idaVar, hjs hjsVar, hik hikVar, ayqi ayqiVar, hrv hrvVar, ViewGroup viewGroup) {
        this.a = idaVar;
        this.b = hjsVar;
        this.d = hikVar;
        this.e = ayqiVar;
        this.f = hrvVar;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.add_button_layout, viewGroup, false);
        this.g = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.add_text_button);
        this.c = imageView;
        imageView.setOnClickListener(this);
        hrvVar.q();
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.g;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ayrz.c((AtomicReference) this.h);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        this.h = this.d.b().ab(this.e).ax(new hit(this, 2));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.c) {
            this.f.q();
            this.b.b().L(gsv.e).ak(1L).au(false).y(new hit(this, 1)).U();
            this.b.c();
            this.a.c().L(gsv.f).ak(1L).au(false).y(new hit(this, 0)).U();
        }
    }
}
