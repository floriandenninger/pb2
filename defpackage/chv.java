package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chv extends chk {
    private final cji e;
    private final Path f;

    public chv(List list) {
        super(list);
        this.e = new cji();
        this.f = new Path();
    }

    @Override // defpackage.chk
    public final /* bridge */ /* synthetic */ Object f(clt cltVar, float f) {
        cji cjiVar = (cji) cltVar.b;
        cji cjiVar2 = (cji) cltVar.c;
        cji cjiVar3 = this.e;
        if (cjiVar3.b == null) {
            cjiVar3.b = new PointF();
        }
        boolean z = true;
        if (!cjiVar.c && !cjiVar2.c) {
            z = false;
        }
        cjiVar3.c = z;
        if (cjiVar.a.size() != cjiVar2.a.size()) {
            int size = cjiVar.a.size();
            int size2 = cjiVar2.a.size();
            StringBuilder sb = new StringBuilder(93);
            sb.append("Curves must have the same number of control points. Shape 1: ");
            sb.append(size);
            sb.append("\tShape 2: ");
            sb.append(size2);
            cll.a(sb.toString());
        }
        int min = Math.min(cjiVar.a.size(), cjiVar2.a.size());
        if (cjiVar3.a.size() < min) {
            for (int size3 = cjiVar3.a.size(); size3 < min; size3++) {
                cjiVar3.a.add(new cic());
            }
        } else if (cjiVar3.a.size() > min) {
            int size4 = cjiVar3.a.size();
            while (true) {
                size4--;
                if (size4 < min) {
                    break;
                }
                cjiVar3.a.remove(r4.size() - 1);
            }
        }
        PointF pointF = cjiVar.b;
        PointF pointF2 = cjiVar2.b;
        float c = cln.c(pointF.x, pointF2.x, f);
        float c2 = cln.c(pointF.y, pointF2.y, f);
        if (cjiVar3.b == null) {
            cjiVar3.b = new PointF();
        }
        cjiVar3.b.set(c, c2);
        int size5 = cjiVar3.a.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                cic cicVar = (cic) cjiVar.a.get(size5);
                cic cicVar2 = (cic) cjiVar2.a.get(size5);
                PointF pointF3 = cicVar.a;
                PointF pointF4 = cicVar.b;
                PointF pointF5 = cicVar.c;
                PointF pointF6 = cicVar2.a;
                PointF pointF7 = cicVar2.b;
                PointF pointF8 = cicVar2.c;
                ((cic) cjiVar3.a.get(size5)).a.set(cln.c(pointF3.x, pointF6.x, f), cln.c(pointF3.y, pointF6.y, f));
                ((cic) cjiVar3.a.get(size5)).b.set(cln.c(pointF4.x, pointF7.x, f), cln.c(pointF4.y, pointF7.y, f));
                ((cic) cjiVar3.a.get(size5)).c.set(cln.c(pointF5.x, pointF8.x, f), cln.c(pointF5.y, pointF8.y, f));
            } else {
                cln.g(this.e, this.f);
                return this.f;
            }
        }
    }
}
