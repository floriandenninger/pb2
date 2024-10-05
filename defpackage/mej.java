package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mej {
    public final ajjz a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;

    /* JADX INFO: Access modifiers changed from: protected */
    public mej(Context context, View view, ajjz ajjzVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.shopping_companion_product_view, (ViewGroup) view, false);
        this.b = inflate;
        this.d = (TextView) inflate.findViewById(R.id.price);
        this.c = (TextView) inflate.findViewById(R.id.description);
        this.e = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.a = ajjzVar;
    }
}
