package defpackage;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axll extends AbstractList {
    deg a;
    ddz[] b;
    dfm c;
    dfu d;
    private SoftReference[] e;
    private List f;
    private int[] h;
    private Map g = new HashMap();
    private int i = -1;

    public axll(long j, deg degVar, ddz... ddzVarArr) {
        this.c = null;
        this.d = null;
        this.a = degVar;
        this.b = ddzVarArr;
        for (dfm dfmVar : axnc.b(degVar, "moov[0]/trak")) {
            if (dfmVar.n().a == j) {
                this.c = dfmVar;
            }
        }
        if (this.c == null) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("This MP4 does not contain track ");
            sb.append(j);
            throw new RuntimeException(sb.toString());
        }
        for (dfu dfuVar : axnc.b(degVar, "moov[0]/mvex[0]/trex")) {
            if (dfuVar.a == this.c.n().a) {
                this.d = dfuVar;
            }
        }
        this.e = (SoftReference[]) Array.newInstance((Class<?>) SoftReference.class, size());
        if (this.f != null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.j(dfs.class).iterator();
        while (it.hasNext()) {
            for (dfw dfwVar : ((dfs) it.next()).j(dfw.class)) {
                if (dfwVar.l().a == this.c.n().a) {
                    arrayList.add(dfwVar);
                }
            }
        }
        ddz[] ddzVarArr2 = this.b;
        this.f = arrayList;
        this.h = new int[arrayList.size()];
        int i = 1;
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.h[i2] = i;
            List i3 = ((dfw) this.f.get(i2)).i();
            int i4 = 0;
            for (int i5 = 0; i5 < i3.size(); i5++) {
                deb debVar = (deb) i3.get(i5);
                if (debVar instanceof dfz) {
                    i4 += awxt.g(((dfz) debVar).k());
                }
            }
            i += i4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [deg] */
    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        long j;
        axlb axlbVar;
        SoftReference softReference = this.e[i];
        if (softReference != null && (axlbVar = (axlb) softReference.get()) != null) {
            return axlbVar;
        }
        int i2 = i + 1;
        int length = this.h.length;
        do {
            length--;
        } while (i2 - this.h[length] < 0);
        dfw dfwVar = (dfw) this.f.get(length);
        int i3 = i2 - this.h[length];
        dfs dfsVar = (dfs) dfwVar.m;
        int i4 = 0;
        for (deb debVar : dfwVar.i()) {
            if (debVar instanceof dfz) {
                dfz dfzVar = (dfz) debVar;
                int i5 = i3 - i4;
                if (dfzVar.c.size() < i5) {
                    i4 += dfzVar.c.size();
                } else {
                    List list = dfzVar.c;
                    dfx l = dfwVar.l();
                    boolean p = dfzVar.p();
                    int r = l.r() & 16;
                    long j2 = 0;
                    if (p) {
                        j = 0;
                    } else if (r != 0) {
                        j = l.d;
                    } else {
                        dfu dfuVar = this.d;
                        if (dfuVar != null) {
                            j = dfuVar.c;
                        } else {
                            throw new RuntimeException("File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size.");
                        }
                    }
                    SoftReference softReference2 = (SoftReference) this.g.get(dfzVar);
                    ByteBuffer byteBuffer = softReference2 != null ? (ByteBuffer) softReference2.get() : null;
                    if (byteBuffer == null) {
                        dfs dfsVar2 = dfsVar;
                        if ((l.r() & 1) != 0) {
                            j2 = l.b;
                            dfsVar2 = dfsVar.m;
                        }
                        if (dfzVar.l()) {
                            j2 += dfzVar.a;
                        }
                        Iterator it = list.iterator();
                        int i6 = 0;
                        while (it.hasNext()) {
                            i6 = p ? (int) (i6 + ((dfy) it.next()).b) : (int) (i6 + j);
                        }
                        try {
                            byteBuffer = dfsVar2.h(j2, i6);
                            this.g.put(dfzVar, new SoftReference(byteBuffer));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    int i7 = 0;
                    for (int i8 = 0; i8 < i5; i8++) {
                        i7 = (int) (p ? i7 + ((dfy) list.get(i8)).b : i7 + j);
                    }
                    if (p) {
                        j = ((dfy) list.get(i5)).b;
                    }
                    axlk axlkVar = new axlk(j, byteBuffer, i7);
                    this.e[i] = new SoftReference(axlkVar);
                    return axlkVar;
                }
            }
        }
        throw new RuntimeException("Couldn't find sample in the traf I was looking");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        Iterator it = this.a.j(dfs.class).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            for (dfw dfwVar : ((dfs) it.next()).j(dfw.class)) {
                if (dfwVar.l().a == this.c.n().a) {
                    i2 = (int) (i2 + ((dfz) dfwVar.j(dfz.class).get(0)).k());
                }
            }
        }
        int length = this.b.length;
        this.i = i2;
        return i2;
    }
}
