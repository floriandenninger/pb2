package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ldn extends ajpc {
    ajpc a;
    private final FrameLayout b;
    private ajpc c;
    private ajpc d;
    private ajpc e;
    private ajpc f;
    private ajpc g;
    private final oiy h;
    private final oiy i;
    private final oiy j;

    public ldn(Context context, oiy oiyVar, oiy oiyVar2, oiy oiyVar3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.j = oiyVar;
        this.h = oiyVar2;
        this.i = oiyVar3;
        this.b = new FrameLayout(context);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ajpc ajpcVar = this.a;
        if (ajpcVar != null) {
            ajpcVar.b(ajosVar);
        }
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        ajpc ajpcVar;
        aptm aptmVar = (aptm) obj;
        if (ajokVar.c("clarify_box_in_metadata_highlights") == Boolean.TRUE) {
            int aw = anaf.aw(aptmVar.i);
            if (aw != 0 && aw == 4) {
                if (this.g == null) {
                    this.g = this.i.e(this.b);
                }
                ajpcVar = this.g;
            } else {
                int aw2 = anaf.aw(aptmVar.i);
                if (aw2 != 0 && aw2 == 3) {
                    if (this.d == null) {
                        this.d = this.h.d(R.layout.clarification_metadata_highlights_item_medium, this.b);
                    }
                    ajpcVar = this.d;
                } else {
                    if (this.c == null) {
                        this.c = this.j.f(R.layout.clarification_metadata_highlights_item_small, this.b);
                    }
                    ajpcVar = this.c;
                }
            }
        } else {
            int aw3 = anaf.aw(aptmVar.i);
            if (aw3 != 0 && aw3 == 4) {
                if (this.g == null) {
                    this.g = this.i.e(this.b);
                }
                ajpcVar = this.g;
            } else {
                int aw4 = anaf.aw(aptmVar.i);
                if (aw4 != 0 && aw4 == 3) {
                    if (this.f == null) {
                        this.f = this.h.d(R.layout.clarification_item_medium, this.b);
                    }
                    ajpcVar = this.f;
                } else {
                    if (this.e == null) {
                        this.e = this.j.f(R.layout.clarification_item_small, this.b);
                    }
                    ajpcVar = this.e;
                }
            }
        }
        this.a = ajpcVar;
        this.b.removeAllViews();
        this.b.addView(this.a.a());
        this.a.oB(ajokVar, aptmVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aptm) obj).m.I();
    }
}
