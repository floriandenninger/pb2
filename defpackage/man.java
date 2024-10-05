package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class man implements lzq {
    public final apxf a;
    private final Drawable b;

    public man(Drawable drawable, apxf apxfVar) {
        this.b = drawable;
        this.a = apxfVar;
    }

    @Override // defpackage.lzq
    public final Drawable a() {
        return this.b;
    }

    @Override // defpackage.lzq
    public final void b() {
    }

    @Override // defpackage.lzq
    public final void c(ImageView imageView, final aahd aahdVar) {
        if (this.a != null) {
            imageView.setClickable(true);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: mam
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    man manVar = man.this;
                    aahd aahdVar2 = aahdVar;
                    apxf apxfVar = manVar.a;
                    if (apxfVar != null) {
                        aahdVar2.a(apxfVar);
                    }
                }
            });
        } else {
            imageView.setClickable(false);
        }
    }
}
