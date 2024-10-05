package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class esg {
    public final View a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final ftm f;
    public final fvd g;
    public final eqw h;
    public final ajyf i;
    public final TextView j;
    public final View k;
    final /* synthetic */ esi l;

    public esg(esi esiVar, View view) {
        this.l = esiVar;
        this.a = view;
        this.b = (TextView) view.findViewById(R.id.channel_title);
        this.c = (TextView) view.findViewById(R.id.channel_handle);
        this.d = (TextView) view.findViewById(R.id.channel_subtitle);
        this.e = (ImageView) view.findViewById(R.id.profile_editor_icon);
        TextView textView = (TextView) view.findViewById(R.id.subscribe_button);
        this.j = textView;
        View findViewById = view.findViewById(R.id.subscription_notification_view);
        this.k = findViewById;
        TextView textView2 = (TextView) view.findViewById(R.id.sponsor_button);
        TextView textView3 = (TextView) view.findViewById(R.id.purchase_button);
        fvd b = esiVar.p.b(findViewById);
        this.g = b;
        this.f = esiVar.j.a(textView, b);
        this.h = textView2 == null ? null : esiVar.q.d(textView2);
        this.i = textView3 != null ? esiVar.n.a(textView3) : null;
    }
}
