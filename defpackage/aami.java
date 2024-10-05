package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aami {
    public final List a;
    private avgg b;

    public aami() {
        this.b = null;
        this.a = Collections.emptyList();
    }

    public aami(List list) {
        this.b = null;
        this.a = list;
    }

    public final aamh a() {
        if (!f()) {
            return null;
        }
        return (aamh) this.a.get(r0.size() - 1);
    }

    public final aamh b(int i, int i2) {
        aamh aamhVar = null;
        if (f() && i >= 0 && i2 >= 0) {
            int i3 = 0;
            for (aamh aamhVar2 : this.a) {
                int i4 = i - aamhVar2.a;
                int i5 = i2 - aamhVar2.b;
                int i6 = (i4 * i4) + (i5 * i5);
                if (aamhVar == null || i6 < i3) {
                    aamhVar = aamhVar2;
                    i3 = i6;
                }
            }
        }
        return aamhVar;
    }

    public final aamh c(int i) {
        if (!f()) {
            return null;
        }
        if (i <= 0) {
            return d();
        }
        for (aamh aamhVar : this.a) {
            if (aamhVar.a >= i) {
                return aamhVar;
            }
        }
        return a();
    }

    public final aamh d() {
        if (f()) {
            return (aamh) this.a.get(0);
        }
        return null;
    }

    public final avgg e() {
        if (this.b == null) {
            aong aongVar = (aong) avgg.a.createBuilder();
            int size = this.a.size();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    aone createBuilder = avgf.a.createBuilder();
                    int i2 = ((aamh) this.a.get(i)).a;
                    createBuilder.copyOnWrite();
                    avgf avgfVar = (avgf) createBuilder.instance;
                    avgfVar.b |= 2;
                    avgfVar.d = i2;
                    int i3 = ((aamh) this.a.get(i)).b;
                    createBuilder.copyOnWrite();
                    avgf avgfVar2 = (avgf) createBuilder.instance;
                    avgfVar2.b |= 4;
                    avgfVar2.e = i3;
                    String uri = ((aamh) this.a.get(i)).a().toString();
                    createBuilder.copyOnWrite();
                    avgf avgfVar3 = (avgf) createBuilder.instance;
                    uri.getClass();
                    avgfVar3.b |= 1;
                    avgfVar3.c = uri;
                    aongVar.cB(createBuilder);
                }
            }
            this.b = (avgg) aongVar.build();
        }
        return this.b;
    }

    public final boolean f() {
        return this.a.size() > 0;
    }

    public aami(avgg avggVar) {
        this.b = avggVar;
        if (avggVar != null) {
            this.a = new ArrayList(avggVar.c.size());
            Iterator it = avggVar.c.iterator();
            while (it.hasNext()) {
                this.a.add(new aamh((avgf) it.next()));
            }
            return;
        }
        this.a = Collections.emptyList();
    }

    public aami(Uri... uriArr) {
        this.a = new ArrayList();
        for (int i = 0; i <= 0; i++) {
            this.a.add(new aamh(uriArr[i], 0, 0));
        }
        this.b = null;
    }
}
