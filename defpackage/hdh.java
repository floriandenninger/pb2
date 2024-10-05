package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hdh {
    public final View a;
    public final View b;
    public final hgh c;

    public hdh(View view) {
        this.a = view;
        this.b = view.findViewById(R.id.green_screen_media_item_thumbnail_border);
        View findViewById = view.findViewById(R.id.loading_spinner);
        this.c = findViewById == null ? null : new hgh(findViewById);
    }

    public final void a() {
        View view = this.b;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void b() {
        hgh hghVar = this.c;
        if (hghVar != null) {
            hghVar.a();
        }
    }
}
