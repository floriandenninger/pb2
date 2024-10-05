package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.mediapipe.framework.Graph;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.PacketCallback;
import com.google.mediapipe.framework.PacketCreator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zqg implements zqs, zqb {
    private final zsd A;
    private final zsf B;
    private final zpi C;
    public final zqc a;
    public final zqk b;
    public final Graph c;
    public final PacketCreator d;
    public Bitmap g;
    public aogg h;
    public PacketCallback i;
    public List j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final zse n;
    public zrj o;
    public zrp p;
    private final zqf q;
    private final boolean r;
    private arz u;
    private arz v;
    private zpe w;
    private FilterMapTable$FilterDescriptor x;
    private String y;
    private long z;
    private final float[] s = new float[16];
    private final ArrayList t = new ArrayList();
    public final Set e = Collections.newSetFromMap(new HashMap());
    public final Set f = new HashSet();

    public zqg(zqc zqcVar, zqk zqkVar, long j, zqf zqfVar, zpi zpiVar, boolean z) {
        zqcVar.getClass();
        this.a = zqcVar;
        zqcVar.c = this;
        zqkVar.getClass();
        this.b = zqkVar;
        this.q = zqfVar;
        this.C = zpiVar;
        this.r = z;
        Graph i = i();
        this.c = i;
        this.d = new PacketCreator(i);
        if (i != null && j != 0) {
            try {
                i.g(j);
            } catch (MediaPipeException unused) {
            }
        }
        this.x = new FilterMapTable$FilterDescriptor("NORMAL", "", false, true);
        this.y = "NORMAL";
        this.m = true;
        this.n = new zse();
        this.A = new zsd();
        this.B = new zsf();
    }

    static final Graph i() {
        try {
            return new Graph();
        } catch (UnsatisfiedLinkError unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020a  */
    @Override // defpackage.aogg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.mediapipe.framework.TextureFrame r19) {
        /*
            Method dump skipped, instructions count: 1183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zqg.a(com.google.mediapipe.framework.TextureFrame):void");
    }

    @Override // defpackage.zqb
    public final void b() {
        this.b.k();
    }

    @Override // defpackage.aogh
    public final void c(aogg aoggVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(List list) {
        List list2 = this.j;
        if (list2 == null) {
            list.getClass();
            this.j = list;
            list.size();
        } else if (list2.size() != list.size()) {
            zga.c("KazooProcessor", "KazooProcessor does not support adding or removing effects at runtime.");
        }
        this.b.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor, Map map) {
        this.x = filterMapTable$FilterDescriptor;
        for (Map.Entry entry : map.entrySet()) {
            zqc zqcVar = this.a;
            String str = (String) entry.getKey();
            float floatValue = ((Float) entry.getValue()).floatValue();
            axef a = axeg.a();
            a.copyOnWrite();
            axeg.c((axeg) a.instance, str);
            a.copyOnWrite();
            axeg.d((axeg) a.instance, floatValue);
            axeg axegVar = (axeg) a.build();
            axcl a2 = axcq.a();
            a2.copyOnWrite();
            ((axcq) a2.instance).D(axegVar);
            zqcVar.a.add((axcq) a2.build());
        }
        this.b.k();
    }

    @Override // defpackage.zqs
    public final void f() {
        this.a.c = null;
        try {
            this.c.d();
        } catch (MediaPipeException unused) {
        }
        try {
            this.c.j();
        } catch (MediaPipeException unused2) {
        }
        zpw.i(this.w);
        this.w = null;
        zpw.j(this.u);
        this.u = null;
        zpw.j(this.v);
        this.v = null;
        this.c.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(this.j, (String) it.next());
            if (a != null) {
                this.e.add(a);
            }
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        List list = this.j;
        return (list == null || list.isEmpty()) ? false : true;
    }
}
