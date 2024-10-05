package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akle implements ajom {
    public aklk a;
    public int b;
    private final View c;
    private final TextView d;
    private final ImageView e;

    public akle(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.share_bottom_sheet_item, (ViewGroup) null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.list_item_text);
        this.e = (ImageView) inflate.findViewById(R.id.list_item_icon_primary);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: akld
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i;
                akle akleVar = akle.this;
                aklk aklkVar = akleVar.a;
                if (aklkVar == null || (i = akleVar.b) == -1) {
                    return;
                }
                aklkVar.f(i);
            }
        });
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        uyw uywVar = (uyw) obj;
        this.d.setText(uywVar.c);
        this.e.setImageDrawable(uywVar.e);
        this.a = (aklk) ajokVar.c("LISTENER_CONTEXT_DECORATOR_KEY");
        this.b = ajokVar.b("position", -1);
    }
}
