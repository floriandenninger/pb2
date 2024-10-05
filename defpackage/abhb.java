package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abhb extends ajpc {
    public final TextView a;
    private final ajyf b;

    public abhb(Context context, ajyg ajygVar) {
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.live_chat_default_button, (ViewGroup) null, false);
        this.a = textView;
        this.b = ajygVar.a(textView);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b.a(null, null, null);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        HashMap hashMap = new HashMap(ajokVar.e());
        this.b.a((apmg) obj, ajokVar.a, hashMap);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apmg) obj).t.I();
    }

    public abhb(ajyg ajygVar, TextView textView) {
        this.a = textView;
        this.b = ajygVar.a(textView);
    }
}
