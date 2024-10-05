package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class esw implements ajom {
    private final Context a;
    private final View b;

    public esw(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context).inflate(R.layout.channel_list_sub_menu_divider, (ViewGroup) null);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        yny.B(this.b, this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_divider_container_width), this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_divider_container_height));
    }
}
