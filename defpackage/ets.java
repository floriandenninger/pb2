package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ets implements ajom {
    private final fve a;
    private final ImageView b;

    public ets(Context context, fvf fvfVar, ViewGroup viewGroup) {
        ImageView imageView = (ImageView) LayoutInflater.from(context).inflate(R.layout.subscription_notification_options_button, viewGroup, false);
        this.b = imageView;
        this.a = fvfVar.a(imageView);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a.b(null, null);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        this.a.b((avae) obj, ajokVar.a);
    }
}
