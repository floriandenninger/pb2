package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ett implements ajom {
    private final TextView a;
    private final fvl b;
    private final acra c;

    public ett(Context context, nmc nmcVar, acra acraVar, ViewGroup viewGroup, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.subscription_notification_toggle_button, viewGroup, false);
        this.a = textView;
        this.b = nmcVar.c(textView);
        this.c = acraVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b.h(null, this.c);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        this.b.h((avaa) obj, this.c);
    }
}
