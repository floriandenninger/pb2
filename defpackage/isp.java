package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class isp extends ajpc {
    public final aahd a;
    private final ajjz b;
    private final ImageView c;
    private final ImageButton d;
    private final View e;
    private final afph f;

    public isp(Context context, aahd aahdVar, ajjz ajjzVar) {
        this.b = ajjzVar;
        this.a = aahdVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.metadataeditor_native_thumbnail_view, (ViewGroup) null);
        this.e = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.mde_video_thumbnail);
        this.c = imageView;
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.mde_edit_thumbnail_button);
        this.d = imageButton;
        Drawable drawable = context.getDrawable(R.drawable.yt_outline_pencil_black_24);
        if (drawable != null) {
            imageButton.setImageDrawable(new afov(context, new zau(context).b(drawable, wbs.Q(context, R.attr.ytOverlayIconActiveOther))));
        }
        this.f = new afph(context, imageView, ajjzVar);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b.e(this.c);
        this.d.setOnClickListener(null);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        avgg avggVar;
        final aszh aszhVar = (aszh) obj;
        afph afphVar = this.f;
        if ((aszhVar.b & 512) != 0) {
            avggVar = aszhVar.f;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = avgg.a;
        }
        afphVar.a(avggVar);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: iso
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                isp ispVar = isp.this;
                aszh aszhVar2 = aszhVar;
                aone createBuilder = aqqm.a.createBuilder();
                aong aongVar = (aong) aulq.a.createBuilder();
                aongVar.e(aszi.a, aszhVar2);
                createBuilder.copyOnWrite();
                aqqm aqqmVar = (aqqm) createBuilder.instance;
                aulq aulqVar = (aulq) aongVar.build();
                aulqVar.getClass();
                aqqmVar.d = aulqVar;
                aqqmVar.c |= 8;
                aqqm aqqmVar2 = (aqqm) createBuilder.build();
                aahd aahdVar = ispVar.a;
                aong aongVar2 = (aong) apxf.a.createBuilder();
                aongVar2.e(aqqm.b, aqqmVar2);
                aahdVar.a((apxf) aongVar2.build());
            }
        });
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }
}
