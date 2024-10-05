package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lcp {
    public final ImageView a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final View e;
    public akef f;
    final /* synthetic */ lcq g;

    public lcp(lcq lcqVar, View view) {
        this.g = lcqVar;
        this.e = view;
        this.a = (ImageView) view.findViewById(R.id.search_type_icon);
        this.b = (TextView) view.findViewById(R.id.text);
        this.c = (ImageView) view.findViewById(R.id.edit_suggestion);
        this.d = (ImageView) view.findViewById(R.id.thumbnail);
    }
}
