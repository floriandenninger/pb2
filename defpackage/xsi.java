package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xsi implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ ImageView b;
    final /* synthetic */ xsk c;

    public xsi(xsk xskVar, int i, ImageView imageView) {
        this.c = xskVar;
        this.a = i;
        this.b = imageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xsk xskVar = this.c;
        int i = xskVar.b;
        int i2 = this.a;
        if (i == i2) {
            i2 = 0;
        }
        xskVar.b = i2;
        xskVar.a();
        xsk xskVar2 = this.c;
        this.b.setImageDrawable(((ImageView) xskVar2.c.getChildAt(xskVar2.b).findViewById(R.id.filter_thumbnail)).getDrawable());
    }
}
