package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xqg implements View.OnClickListener, ypd {
    public final View a;
    public final vh b;
    public final acra c;
    public xqf d;
    public Map e;
    boolean f;
    public final ajun g;
    private final Context h;
    private final ajvb i;
    private final ajpd j;
    private final akbu k;
    private final ajoy l;

    public xqg(Context context, ajvb ajvbVar, ajoy ajoyVar, View view, akbu akbuVar, acra acraVar, ajun ajunVar, ypa ypaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ajvbVar.getClass();
        view.getClass();
        akbuVar.getClass();
        acraVar.getClass();
        ajunVar.getClass();
        ajpd ajpdVar = new ajpd();
        vh vhVar = new vh(context);
        this.h = context;
        this.i = ajvbVar;
        this.a = view;
        this.k = akbuVar;
        this.c = acraVar;
        this.g = ajunVar;
        this.l = ajoyVar;
        this.j = ajpdVar;
        this.b = vhVar;
        view.setVisibility(8);
        if (ypaVar != null) {
            ypaVar.g(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ajos, java.lang.Object] */
    public final void a(final auwh auwhVar) {
        String str;
        arej arejVar;
        this.b.k();
        this.j.clear();
        this.a.setTag(R.id.sort_menu_anchor_model, auwhVar);
        if (auwhVar == null || auwhVar.c.size() <= 0) {
            this.a.setVisibility(8);
            return;
        }
        if (!this.f) {
            this.f = true;
            this.b.f = (int) this.h.getResources().getDimension(R.dimen.sort_menu_width);
            this.b.z();
            this.a.setOnClickListener(this);
            this.g.o();
        }
        ajoa e = this.l.e(this.i.get());
        e.h(this.j);
        e.a.b(new ajol() { // from class: xqe
            @Override // defpackage.ajol
            public final void a(ajok ajokVar, ajng ajngVar, int i) {
                xqg xqgVar = xqg.this;
                auwh auwhVar2 = auwhVar;
                ajokVar.f("sortFilterMenu", xqgVar.b);
                ajokVar.f("sortFilterMenuModel", auwhVar2);
                ajokVar.f("sortFilterContinuationHandler", xqgVar.d);
                ajokVar.f("sortFilterEndpointArgsKey", xqgVar.e);
                ajokVar.a(xqgVar.c);
            }
        });
        this.b.e(e);
        this.a.setVisibility(0);
        View view = this.a;
        if ((auwhVar.b & 4) != 0) {
            aott aottVar = auwhVar.f;
            if (aottVar == null) {
                aottVar = aott.a;
            }
            aots aotsVar = aottVar.c;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            str = aotsVar.c;
        } else {
            str = null;
        }
        view.setContentDescription(str);
        arel arelVar = auwhVar.g;
        if (arelVar == null) {
            arelVar = arel.a;
        }
        if (arelVar.b == 102716411) {
            akbu akbuVar = this.k;
            arel arelVar2 = auwhVar.g;
            if (arelVar2 == null) {
                arelVar2 = arel.a;
            }
            if (arelVar2.b == 102716411) {
                arejVar = (arej) arelVar2.c;
            } else {
                arejVar = arej.a;
            }
            akbuVar.b(arejVar, this.a, auwhVar, this.c);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{xrn.class};
        }
        if (i == 0) {
            CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint = (CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint) ((xrn) obj).h();
            if ((commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.b & 16) == 0 || !commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.g) {
                return null;
            }
            xqf xqfVar = this.d;
            aqan aqanVar = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c;
            if (aqanVar == null) {
                aqanVar = aqan.a;
            }
            aulm aulmVar = aqanVar.c;
            if (aulmVar == null) {
                aulmVar = aulm.a;
            }
            xqfVar.a(ahbj.o(aulmVar));
            auwh auwhVar = (auwh) this.a.getTag(R.id.sort_menu_anchor_model);
            this.b.w(0);
            int i2 = 0;
            while (i2 < auwhVar.c.size()) {
                this.g.p((auwg) auwhVar.c.get(i2), i2 == 0);
                i2++;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.j.clear();
        auwh auwhVar = (auwh) this.a.getTag(R.id.sort_menu_anchor_model);
        if (auwhVar != null) {
            int i = -1;
            for (int i2 = 0; i2 < auwhVar.c.size(); i2++) {
                auwg auwgVar = (auwg) auwhVar.c.get(i2);
                this.j.add(auwgVar);
                if (true == auwgVar.g) {
                    i = i2;
                }
            }
            vh vhVar = this.b;
            vhVar.j = 8388661;
            vhVar.l = this.a;
            vhVar.s();
            if (i > 0) {
                this.b.w(i);
            }
        }
    }
}
