package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xwh extends ajpc {
    public final xos a;
    public final yal b;
    private final View c;
    private final Context d;
    private final ViewGroup e;
    private final xwe f;

    public xwh(Context context, xos xosVar, xwe xweVar, yal yalVar) {
        this.d = context;
        this.a = xosVar;
        this.f = xweVar;
        yalVar.getClass();
        this.b = yalVar;
        View inflate = View.inflate(context, R.layout.comment_poll, null);
        this.c = inflate;
        this.e = (ViewGroup) inflate.findViewById(R.id.comment_poll_list);
    }

    public static final void f(aong aongVar, ajok ajokVar) {
        if (aongVar != null) {
            aone createBuilder = aupf.a.createBuilder();
            String k = ajokVar.a.k();
            createBuilder.copyOnWrite();
            aupf aupfVar = (aupf) createBuilder.instance;
            k.getClass();
            aupfVar.b |= 1;
            aupfVar.c = k;
            aongVar.e(aupg.b, (aupf) createBuilder.build());
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.f.e(this.e);
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        boolean z;
        audq audqVar = (audq) obj;
        xpa xpaVar = (xpa) ajokVar.c("commentThreadMutator");
        xpaVar.getClass();
        int i = 0;
        while (true) {
            if (i >= audqVar.f.size()) {
                z = false;
                break;
            } else {
                if (((audo) audqVar.f.get(i)).d) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        int i2 = 0;
        while (i2 < audqVar.f.size()) {
            aone builder = ((audo) audqVar.f.get(i2)).toBuilder();
            audo audoVar = (audo) builder.instance;
            if ((audoVar.b & 128) != 0) {
                apxf apxfVar = audoVar.i;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aong aongVar = (aong) apxfVar.toBuilder();
                f(aongVar, ajokVar);
                builder.copyOnWrite();
                audo audoVar2 = (audo) builder.instance;
                apxf apxfVar2 = (apxf) aongVar.build();
                apxfVar2.getClass();
                audoVar2.i = apxfVar2;
                audoVar2.b |= 128;
            }
            audo audoVar3 = (audo) builder.instance;
            if ((audoVar3.b & 256) != 0) {
                apxf apxfVar3 = audoVar3.j;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                aong aongVar2 = (aong) apxfVar3.toBuilder();
                f(aongVar2, ajokVar);
                builder.copyOnWrite();
                audo audoVar4 = (audo) builder.instance;
                apxf apxfVar4 = (apxf) aongVar2.build();
                apxfVar4.getClass();
                audoVar4.j = apxfVar4;
                audoVar4.b |= 256;
            }
            audo audoVar5 = (audo) builder.instance;
            if ((audoVar5.b & 8) != 0) {
                apxf apxfVar5 = audoVar5.e;
                if (apxfVar5 == null) {
                    apxfVar5 = apxf.a;
                }
                aong aongVar3 = (aong) apxfVar5.toBuilder();
                f(aongVar3, ajokVar);
                builder.copyOnWrite();
                audo audoVar6 = (audo) builder.instance;
                apxf apxfVar6 = (apxf) aongVar3.build();
                apxfVar6.getClass();
                audoVar6.e = apxfVar6;
                audoVar6.b |= 8;
            }
            ajok d = this.f.d(ajokVar);
            d.f("has_voted", Boolean.valueOf(z));
            d.f("is_last_item", Boolean.valueOf(i2 == audqVar.f.size() + (-1)));
            View c = this.f.c(d, (audo) builder.build());
            this.e.addView(c);
            c.setOnClickListener(new xwg(this, xpaVar, audqVar, builder, ajokVar));
            i2++;
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((audq) obj).g.I();
    }
}
