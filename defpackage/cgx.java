package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgx implements cgy, cgv {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List d = new ArrayList();
    private final cje e;

    public cgx(cje cjeVar) {
        this.e = cjeVar;
    }

    private final void a(Path.Op op) {
        this.b.reset();
        this.a.reset();
        int size = this.d.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            }
            cgy cgyVar = (cgy) this.d.get(size);
            if (cgyVar instanceof cgp) {
                cgp cgpVar = (cgp) cgyVar;
                List j = cgpVar.j();
                int size2 = j.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        Path i = ((cgy) j.get(size2)).i();
                        i.transform(cgpVar.h());
                        this.b.addPath(i);
                    }
                }
            } else {
                this.b.addPath(cgyVar.i());
            }
        }
        cgy cgyVar2 = (cgy) this.d.get(0);
        if (cgyVar2 instanceof cgp) {
            cgp cgpVar2 = (cgp) cgyVar2;
            List j2 = cgpVar2.j();
            for (int i2 = 0; i2 < j2.size(); i2++) {
                Path i3 = ((cgy) j2.get(i2)).i();
                i3.transform(cgpVar2.h());
                this.a.addPath(i3);
            }
        } else {
            this.a.set(cgyVar2.i());
        }
        this.c.op(this.a, this.b, op);
    }

    @Override // defpackage.cgo
    public final void f(List list, List list2) {
        for (int i = 0; i < this.d.size(); i++) {
            ((cgy) this.d.get(i)).f(list, list2);
        }
    }

    @Override // defpackage.cgo
    public final String g() {
        throw null;
    }

    @Override // defpackage.cgv
    public final void h(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            cgo cgoVar = (cgo) listIterator.previous();
            if (cgoVar instanceof cgy) {
                this.d.add((cgy) cgoVar);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.cgy
    public final Path i() {
        this.c.reset();
        cje cjeVar = this.e;
        if (cjeVar.a) {
            return this.c;
        }
        int i = cjeVar.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                this.c.addPath(((cgy) this.d.get(i3)).i());
            }
        } else if (i2 == 1) {
            a(Path.Op.UNION);
        } else if (i2 == 2) {
            a(Path.Op.REVERSE_DIFFERENCE);
        } else if (i2 == 3) {
            a(Path.Op.INTERSECT);
        } else if (i2 == 4) {
            a(Path.Op.XOR);
        }
        return this.c;
    }
}
