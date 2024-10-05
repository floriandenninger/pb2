package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzg {
    public final Context a;
    public final aahd b;
    public final aaea d;
    public ViewGroup f;
    public final List c = new ArrayList();
    public final Map e = new HashMap();

    public mzg(Context context, aahd aahdVar, aaea aaeaVar) {
        this.a = context;
        this.b = aahdVar;
        this.d = aaeaVar;
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (mzf mzfVar : this.c) {
            mzc mzcVar = mzfVar.a;
            aqzc aqzcVar = mzfVar.b;
            if (!(mzcVar instanceof myi)) {
                aone createBuilder = dxd.a.createBuilder();
                aone createBuilder2 = dxf.a.createBuilder();
                String f = mzcVar.f();
                createBuilder2.copyOnWrite();
                dxf dxfVar = (dxf) createBuilder2.instance;
                f.getClass();
                dxfVar.b |= 1;
                dxfVar.c = f;
                createBuilder.copyOnWrite();
                dxd dxdVar = (dxd) createBuilder.instance;
                dxf dxfVar2 = (dxf) createBuilder2.build();
                dxfVar2.getClass();
                dxdVar.d = dxfVar2;
                dxdVar.c = 4;
                String str = aqzcVar.d;
                createBuilder.copyOnWrite();
                dxd dxdVar2 = (dxd) createBuilder.instance;
                str.getClass();
                dxdVar2.b |= 1;
                dxdVar2.e = str;
                boolean h = mzcVar.h();
                createBuilder.copyOnWrite();
                dxd dxdVar3 = (dxd) createBuilder.instance;
                dxdVar3.b |= 2;
                dxdVar3.f = h;
                arrayList.add((dxd) createBuilder.build());
            }
        }
        return arrayList;
    }
}
