package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.onegoogle.actions.SimpleActionView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ugq extends wv {
    public final ImageView t;
    public final TextView u;
    public final int v;
    public final ujx w;
    public final SimpleActionView x;

    public ugq(Context context, ujx ujxVar, ViewGroup viewGroup, ugp ugpVar) {
        super(LayoutInflater.from(context).inflate(R.layout.action_list_item, viewGroup, false));
        View view = this.a;
        this.x = (SimpleActionView) view;
        this.w = ujxVar;
        this.t = (ImageView) view.findViewById(R.id.icon);
        TextView textView = (TextView) this.a.findViewById(R.id.text);
        this.u = textView;
        this.v = ugpVar.a;
        textView.setTextColor(ugpVar.b);
    }
}
