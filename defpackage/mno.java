package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mno extends ajpc {
    public final aahd a;
    public apsl b;
    private final View c;
    private final TextView d;
    private final ImageView e;

    public mno(Context context, aahd aahdVar) {
        aahdVar.getClass();
        this.a = aahdVar;
        View inflate = View.inflate(context, R.layout.content_view_privacy_link, null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.privacy_text);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.privacy_link_button);
        this.e = imageView;
        imageView.setOnClickListener(new mnn(this));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        CharSequence charSequence;
        aqyg aqygVar;
        apsl apslVar = (apsl) obj;
        this.b = apslVar;
        int i = apslVar.b & 1;
        if (i != 0) {
            if (i != 0) {
                aqygVar = apslVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            charSequence = ajcq.b(aqygVar);
        } else {
            charSequence = "";
        }
        this.d.setText(charSequence);
        this.e.setContentDescription(charSequence);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }
}
