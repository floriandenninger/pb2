package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lzt implements lzq {
    public final cfz a = new cfz();
    public final apxf b;

    public lzt(apxf apxfVar) {
        this.b = apxfVar;
    }

    @Override // defpackage.lzq
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.lzq
    public final void b() {
        this.a.j();
    }

    @Override // defpackage.lzq
    public final void c(final ImageView imageView, final aahd aahdVar) {
        imageView.setClickable(true);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: lzr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lzt lztVar = lzt.this;
                aahd aahdVar2 = aahdVar;
                ImageView imageView2 = imageView;
                apxf apxfVar = lztVar.b;
                if (apxfVar != null) {
                    aahdVar2.a(apxfVar);
                }
                imageView2.animate().alpha(0.0f).setDuration(500L).setListener(new lzs(lztVar, imageView2));
            }
        });
    }
}
