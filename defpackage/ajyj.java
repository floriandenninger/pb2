package defpackage;

import android.R;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajyj extends wv {
    public static final /* synthetic */ int w = 0;
    public final ImageView t;
    public final ajyi u;
    public final ajsa v;

    public ajyj(ajyi ajyiVar, View view, ajsa ajsaVar) {
        super(view);
        this.u = ajyiVar;
        this.v = ajsaVar;
        Context context = view.getContext();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
        view.setOnClickListener(ajyiVar);
        this.t = (ImageView) view.findViewById(com.google.android.youtube.R.id.emoji);
    }
}
