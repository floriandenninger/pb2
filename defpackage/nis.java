package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MetadataRowContainerRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nis extends ajpc {
    private final Context a;
    private final View b;
    private final ViewGroup c;
    private final int d;
    private final akht e;

    public nis(Context context, akht akhtVar, byte[] bArr, byte[] bArr2) {
        this.a = context;
        this.e = akhtVar;
        this.d = context.getResources().getDimensionPixelSize(R.dimen.rich_metadata_row_space_size);
        View inflate = LayoutInflater.from(context).inflate(R.layout.rich_metadata_row, (ViewGroup) null, false);
        this.b = inflate;
        this.c = (ViewGroup) inflate.findViewById(R.id.rich_metadata_row_container);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.removeAllViews();
    }

    @Override // defpackage.ajpc
    protected final /* synthetic */ void d(ajok ajokVar, Object obj) {
        for (aulq aulqVar : ((ateh) obj).b) {
            if (aulqVar.pY(MetadataRowContainerRendererOuterClass.richMetadataRenderer)) {
                ateg ategVar = (ateg) aulqVar.pX(MetadataRowContainerRendererOuterClass.richMetadataRenderer);
                akht akhtVar = this.e;
                int ck = anaf.ck(ategVar.c);
                int i = ck == 0 ? 1 : ck;
                ViewGroup viewGroup = this.c;
                Context context = (Context) ((axqs) akhtVar.a).a;
                context.getClass();
                ajjz ajjzVar = (ajjz) akhtVar.c.get();
                ajjzVar.getClass();
                ajut ajutVar = (ajut) akhtVar.d.get();
                ajutVar.getClass();
                aahd aahdVar = (aahd) akhtVar.b.get();
                aahdVar.getClass();
                ajoy ajoyVar = (ajoy) akhtVar.e.get();
                ajoyVar.getClass();
                viewGroup.getClass();
                nir nirVar = new nir(context, ajjzVar, ajutVar, aahdVar, ajoyVar, i, viewGroup, null, null, null, null);
                nirVar.oB(ajokVar, ategVar);
                if (this.c.getChildCount() > 0) {
                    ViewGroup viewGroup2 = this.c;
                    Space space = new Space(this.a);
                    int i2 = this.d;
                    space.setLayoutParams(new LinearLayout.LayoutParams(i2, i2));
                    viewGroup2.addView(space);
                }
                this.c.addView(nirVar.a);
            }
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }
}
