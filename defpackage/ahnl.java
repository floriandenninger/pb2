package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahnl {
    public final aahd a;
    private final Context b;
    private final ajjz c;
    private final ViewGroup d;

    public ahnl(Context context, ajjz ajjzVar, ViewGroup viewGroup, aahd aahdVar) {
        this.b = context;
        this.c = ajjzVar;
        this.d = viewGroup;
        this.a = aahdVar;
    }

    public final float a(int i) {
        return this.b.getResources().getDimension(i);
    }

    public final View b(int i) {
        return LayoutInflater.from(this.b).inflate(i, this.d, false);
    }

    public final void c(View view, avgg avggVar, aqyg aqygVar, aqyg aqygVar2, final apxf apxfVar) {
        ImageView imageView = (ImageView) view.findViewById(R.id.thumbnail);
        ajju b = this.c.c().b();
        b.c(false);
        this.c.k(imageView, avggVar, b.a());
        ((TextView) view.findViewById(R.id.title)).setText(ajcq.b(aqygVar));
        ((TextView) view.findViewById(R.id.metadata)).setText(ajcq.b(aqygVar2));
        view.setOnClickListener(new View.OnClickListener() { // from class: ahnk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ahnl ahnlVar = ahnl.this;
                ahnlVar.a.c(apxfVar, null);
            }
        });
    }
}
