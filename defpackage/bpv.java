package defpackage;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpv {
    public final bpu a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Uri f;
    public boolean g;
    public int h;
    public boolean i;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public Bundle q;
    bou r;
    private int s;
    private IntentSender t;
    private Map v;
    public final ArrayList j = new ArrayList();
    public int p = -1;
    private List u = new ArrayList();

    public bpv(bpu bpuVar, String str, String str2) {
        this.a = bpuVar;
        this.b = str;
        this.c = str2;
    }

    public final int a() {
        if (!k() || bpw.d()) {
            return this.s;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dd, code lost:
    
        if (r4.hasNext() == false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.bou r13) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpv.b(bou):int");
    }

    public final bpd c() {
        bpu bpuVar = this.a;
        bpw.c();
        return bpuVar.a;
    }

    public final List d() {
        return Collections.unmodifiableList(this.u);
    }

    public final void e(int i) {
        bpc bpcVar;
        bpc bpcVar2;
        bpw.c();
        bpp a = bpw.a();
        int min = Math.min(this.o, Math.max(0, i));
        if (this != a.s || (bpcVar2 = a.t) == null) {
            if (a.w.isEmpty() || (bpcVar = (bpc) a.w.get(this.c)) == null) {
                return;
            }
            bpcVar.b(min);
            return;
        }
        bpcVar2.b(min);
    }

    public final void f(int i) {
        bpc bpcVar;
        bpc bpcVar2;
        bpw.c();
        if (i != 0) {
            bpp a = bpw.a();
            if (this != a.s || (bpcVar2 = a.t) == null) {
                if (a.w.isEmpty() || (bpcVar = (bpc) a.w.get(this.c)) == null) {
                    return;
                }
                bpcVar.c(i);
                return;
            }
            bpcVar2.c(i);
        }
    }

    public final void g() {
        bpw.c();
        bpw.a().j(this, 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(Collection collection) {
        this.u.clear();
        if (this.v == null) {
            this.v = new adz();
        }
        this.v.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            boy boyVar = (boy) it.next();
            bpv b = this.a.b(boyVar.a.n());
            if (b != null) {
                this.v.put(b.c, boyVar);
                int i = boyVar.b;
                if (i == 2 || i == 3) {
                    this.u.add(b);
                }
            }
        }
        bpw.a().m.a(259, this);
    }

    public final boolean i() {
        bpw.c();
        return bpw.a().d() == this;
    }

    public final boolean j() {
        if (i() || this.m == 3) {
            return true;
        }
        return TextUtils.equals(c().f.a(), "android") && o("android.media.intent.category.LIVE_AUDIO") && !o("android.media.intent.category.LIVE_VIDEO");
    }

    public final boolean k() {
        return d().size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        return this.r != null && this.g;
    }

    public final boolean m() {
        bpw.c();
        return bpw.a().e() == this;
    }

    public final boolean o(String str) {
        bpw.c();
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            if (((IntentFilter) this.j.get(i)).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouter.RouteInfo{ uniqueId=" + this.c + ", name=" + this.d + ", description=" + this.e + ", iconUri=" + this.f + ", enabled=" + this.g + ", connectionState=" + this.h + ", canDisconnect=" + this.i + ", playbackType=" + this.k + ", playbackStream=" + this.l + ", deviceType=" + this.m + ", volumeHandling=" + this.s + ", volume=" + this.n + ", volumeMax=" + this.o + ", presentationDisplayId=" + this.p + ", extras=" + this.q + ", settingsIntent=" + this.t + ", providerPackageName=" + this.a.c());
        if (k()) {
            sb.append(", members=[");
            int size = this.u.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.u.get(i) != this) {
                    sb.append(((bpv) this.u.get(i)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }

    public final boolean n(bph bphVar) {
        if (bphVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        bpw.c();
        ArrayList<IntentFilter> arrayList = this.j;
        bphVar.c();
        if (bphVar.c.isEmpty()) {
            return false;
        }
        for (IntentFilter intentFilter : arrayList) {
            if (intentFilter != null) {
                Iterator it = bphVar.c.iterator();
                while (it.hasNext()) {
                    if (intentFilter.hasCategory((String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
