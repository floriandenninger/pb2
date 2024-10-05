package defpackage;

import android.R;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajzb extends wv {
    public static final /* synthetic */ int v = 0;
    public final ImageView t;
    public final ajsa u;

    public ajzb(ajza ajzaVar, View view, ajsa ajsaVar) {
        super(view);
        this.u = ajsaVar;
        Context context = view.getContext();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
        view.setOnClickListener(ajzaVar);
        this.t = (ImageView) view.findViewById(com.google.android.youtube.R.id.emoji);
    }
}
