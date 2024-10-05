package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;

/* compiled from: PG */
/* loaded from: classes3.dex */
class mtl extends ajpc {
    protected final Context a;
    protected final ajjz b;
    protected final ajut c;
    protected final View d;
    protected final ImageView e;
    protected final TextView f;

    public mtl(Context context, ajjz ajjzVar, ajut ajutVar, int i) {
        this.a = context;
        this.b = ajjzVar;
        this.c = ajutVar;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        this.d = inflate;
        this.e = (ImageView) inflate.findViewById(R.id.reel_shelf_creation_button);
        this.f = (TextView) inflate.findViewById(R.id.reel_shelf_creation_title);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public void b(ajos ajosVar) {
        this.b.e(this.e);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) obj).h.I();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajpc
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(ajok ajokVar, ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) {
        aqyg aqygVar;
        int intValue;
        int dimensionPixelSize;
        ajut ajutVar = this.c;
        arfs arfsVar = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.d;
        if (arfsVar == null) {
            arfsVar = arfs.a;
        }
        arfr b = arfr.b(arfsVar.c);
        if (b == null) {
            b = arfr.UNKNOWN;
        }
        this.e.setImageResource(ajutVar.a(b));
        if ((reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.b & 8) != 0 && (intValue = ((Integer) ajokVar.d("avatar_size", 0)).intValue()) > (dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.reel_portrait_item_circle_channel_thumbnail_padding))) {
            int i = intValue - dimensionPixelSize;
            this.e.getLayoutParams().width = i;
            this.e.getLayoutParams().height = i;
        }
        TextView textView = this.f;
        String str = null;
        if ((reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.b & 4) != 0) {
            aqygVar = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.f;
        aott aottVar = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.g;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        if ((aottVar.b & 1) != 0) {
            aott aottVar2 = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.g;
            if (aottVar2 == null) {
                aottVar2 = aott.a;
            }
            aots aotsVar = aottVar2.c;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            str = aotsVar.c;
        }
        textView2.setContentDescription(str);
    }
}
