package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mml implements ajom {
    public final View a;
    public apxf b;
    private final mmj c;
    private final mmj d;

    public mml(Context context, ajjs ajjsVar, final aahd aahdVar, ftn ftnVar, ajuw ajuwVar, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_channel_recommendation_card, viewGroup, false);
        this.a = inflate;
        this.c = new mmj(context, ajjsVar, ftnVar, ajuwVar, inflate, R.id.centered_card_view_stub);
        this.d = new mmj(context, ajjsVar, ftnVar, ajuwVar, inflate, R.id.left_align_card_view_stub);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: mmg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mml mmlVar = mml.this;
                aahd aahdVar2 = aahdVar;
                apxf apxfVar = mmlVar.b;
                if (apxfVar != null) {
                    aahdVar2.c(apxfVar, null);
                }
            }
        });
        inflate.setTag(R.id.offset_adjuster_tag, new fyc() { // from class: mmh
            @Override // defpackage.fyc
            public final void a(Rect rect) {
                mml mmlVar = mml.this;
                rect.left -= mmlVar.a.getPaddingLeft();
                rect.top -= mmlVar.a.getPaddingTop();
                rect.right -= mmlVar.a.getPaddingRight();
                rect.bottom -= mmlVar.a.getPaddingBottom();
            }
        });
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.b();
        this.d.b();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqbh aqbhVar = (aqbh) obj;
        apxf apxfVar = aqbhVar.h;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        this.b = apxfVar;
        aqbg aqbgVar = aqbhVar.i;
        if (aqbgVar == null) {
            aqbgVar = aqbg.a;
        }
        int aw = aobq.aw(aqbgVar.b);
        if (aw == 0 || aw != 4) {
            this.c.c(aqbhVar, ajokVar);
            this.d.a();
        } else {
            this.d.c(aqbhVar, ajokVar);
            this.c.a();
        }
    }
}
