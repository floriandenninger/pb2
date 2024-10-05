package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sxc {
    public static final sxc a = a().a();
    public final View b;
    public final Integer c;
    public final Integer d;
    public final szf e;
    public final ayry f;
    public final float g;
    public final boolean h;
    public final Map i;
    public final wh j;
    public final boolean k;
    public final boolean l;
    public final StringBuilder m;
    public final WeakReference n;
    public final WeakReference o;
    public final syg p;
    public final amru q;
    public final sxj r;
    public final String s;
    public final String t;
    public final syb u;
    public final boolean v;
    public final AtomicReference w;
    public final ajzj x;

    public sxc() {
    }

    public sxc(View view, Integer num, Integer num2, szf szfVar, ayry ayryVar, float f, boolean z, Map map, ajzj ajzjVar, wh whVar, boolean z2, boolean z3, StringBuilder sb, WeakReference weakReference, WeakReference weakReference2, syg sygVar, amru amruVar, sxj sxjVar, String str, String str2, syb sybVar, boolean z4, AtomicReference atomicReference) {
        this.b = view;
        this.c = num;
        this.d = num2;
        this.e = szfVar;
        this.f = ayryVar;
        this.g = f;
        this.h = z;
        this.i = map;
        this.x = ajzjVar;
        this.j = whVar;
        this.k = z2;
        this.l = z3;
        this.m = sb;
        this.n = weakReference;
        this.o = weakReference2;
        this.p = sygVar;
        this.q = amruVar;
        this.r = sxjVar;
        this.s = str;
        this.t = str2;
        this.u = sybVar;
        this.v = z4;
        this.w = atomicReference;
    }

    public static sxb a() {
        sxb sxbVar = new sxb();
        sxbVar.b(true);
        sxbVar.h = false;
        sxbVar.e(false);
        sxbVar.f(true);
        sxbVar.d = szf.b;
        sxbVar.i = new StringBuilder();
        sxbVar.c(0.0f);
        sxbVar.b(false);
        return sxbVar;
    }

    public final syg b() {
        syb sybVar = this.u;
        return sybVar != null ? sybVar.d : this.p;
    }

    public final awpj c() {
        WeakReference weakReference = this.n;
        if (weakReference == null) {
            return null;
        }
        return (awpj) weakReference.get();
    }

    public final boolean d() {
        syb sybVar = this.u;
        return sybVar != null ? sybVar.e : this.k;
    }

    public final sxb e() {
        return new sxb(this);
    }

    public final boolean equals(Object obj) {
        Map map;
        ajzj ajzjVar;
        wh whVar;
        StringBuilder sb;
        WeakReference weakReference;
        WeakReference weakReference2;
        syg sygVar;
        amru amruVar;
        sxj sxjVar;
        String str;
        String str2;
        syb sybVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sxc) {
            sxc sxcVar = (sxc) obj;
            View view = this.b;
            if (view != null ? view.equals(sxcVar.b) : sxcVar.b == null) {
                Integer num = this.c;
                if (num != null ? num.equals(sxcVar.c) : sxcVar.c == null) {
                    Integer num2 = this.d;
                    if (num2 != null ? num2.equals(sxcVar.d) : sxcVar.d == null) {
                        szf szfVar = this.e;
                        if (szfVar != null ? szfVar.equals(sxcVar.e) : sxcVar.e == null) {
                            ayry ayryVar = this.f;
                            if (ayryVar != null ? ayryVar.equals(sxcVar.f) : sxcVar.f == null) {
                                if (Float.floatToIntBits(this.g) == Float.floatToIntBits(sxcVar.g) && this.h == sxcVar.h && ((map = this.i) != null ? map.equals(sxcVar.i) : sxcVar.i == null) && ((ajzjVar = this.x) != null ? ajzjVar.equals(sxcVar.x) : sxcVar.x == null) && ((whVar = this.j) != null ? whVar.equals(sxcVar.j) : sxcVar.j == null) && this.k == sxcVar.k && this.l == sxcVar.l && ((sb = this.m) != null ? sb.equals(sxcVar.m) : sxcVar.m == null) && ((weakReference = this.n) != null ? weakReference.equals(sxcVar.n) : sxcVar.n == null) && ((weakReference2 = this.o) != null ? weakReference2.equals(sxcVar.o) : sxcVar.o == null) && ((sygVar = this.p) != null ? sygVar.equals(sxcVar.p) : sxcVar.p == null) && ((amruVar = this.q) != null ? amkq.aV(amruVar, sxcVar.q) : sxcVar.q == null) && ((sxjVar = this.r) != null ? sxjVar.equals(sxcVar.r) : sxcVar.r == null) && ((str = this.s) != null ? str.equals(sxcVar.s) : sxcVar.s == null) && ((str2 = this.t) != null ? str2.equals(sxcVar.t) : sxcVar.t == null) && ((sybVar = this.u) != null ? sybVar.equals(sxcVar.u) : sxcVar.u == null) && this.v == sxcVar.v) {
                                    AtomicReference atomicReference = this.w;
                                    AtomicReference atomicReference2 = sxcVar.w;
                                    if (atomicReference != null ? atomicReference.equals(atomicReference2) : atomicReference2 == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        float f = this.g;
        boolean z = this.h;
        String valueOf6 = String.valueOf(this.i);
        String valueOf7 = String.valueOf(this.x);
        String valueOf8 = String.valueOf(this.j);
        boolean z2 = this.k;
        boolean z3 = this.l;
        String valueOf9 = String.valueOf(this.m);
        String valueOf10 = String.valueOf(this.n);
        String valueOf11 = String.valueOf(this.o);
        String valueOf12 = String.valueOf(this.p);
        String valueOf13 = String.valueOf(this.q);
        String valueOf14 = String.valueOf(this.r);
        String str = this.s;
        String str2 = this.t;
        String valueOf15 = String.valueOf(this.u);
        boolean z4 = this.v;
        String valueOf16 = String.valueOf(this.w);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = "null".length();
        int length10 = String.valueOf(valueOf9).length();
        int length11 = String.valueOf(valueOf10).length();
        int length12 = String.valueOf(valueOf11).length();
        int length13 = String.valueOf(valueOf12).length();
        int length14 = String.valueOf(valueOf13).length();
        int length15 = String.valueOf(valueOf14).length();
        int length16 = String.valueOf(str).length();
        int length17 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 674 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + String.valueOf(valueOf15).length() + String.valueOf(valueOf16).length());
        sb.append("ConversionContext{container=");
        sb.append(valueOf);
        sb.append(", widthConstraint=");
        sb.append(valueOf2);
        sb.append(", heightConstraint=");
        sb.append(valueOf3);
        sb.append(", templateLoggerFactory=");
        sb.append(valueOf4);
        sb.append(", rootDisposableContainer=");
        sb.append(valueOf5);
        sb.append(", imagePrefetchRangeRatio=");
        sb.append(f);
        sb.append(", useDynamicPropsForStylePropertiesInternal=");
        sb.append(z);
        sb.append(", dynamicPropsMap=");
        sb.append(valueOf6);
        sb.append(", horizontalCollectionTouchInterceptor=");
        sb.append(valueOf7);
        sb.append(", horizontalCollectionSwipeProtector=");
        sb.append(valueOf8);
        sb.append(", useIncrementalMountOnChildrenInternal=");
        sb.append(z2);
        sb.append(", useLegacyVisibleInternal=");
        sb.append(z3);
        sb.append(", recyclerBinderConfiguration=");
        sb.append("null");
        sb.append(", pathBuilder=");
        sb.append(valueOf9);
        sb.append(", loggingNodeInternal=");
        sb.append(valueOf10);
        sb.append(", parentLoggingNodeInternal=");
        sb.append(valueOf11);
        sb.append(", elementsInteractionLoggerInternal=");
        sb.append(valueOf12);
        sb.append(", globalCommandDataDecorators=");
        sb.append(valueOf13);
        sb.append(", decoratingElementBuilder=");
        sb.append(valueOf14);
        sb.append(", debugId=");
        sb.append(str);
        sb.append(", treeDebugId=");
        sb.append(str2);
        sb.append(", elementsConfig=");
        sb.append(valueOf15);
        sb.append(", couldOverlapWithElementsConfig=");
        sb.append(z4);
        sb.append(", scrollStrategyListenerHolder=");
        sb.append(valueOf16);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        View view = this.b;
        int hashCode = ((view == null ? 0 : view.hashCode()) ^ 1000003) * 1000003;
        Integer num = this.c;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.d;
        int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        szf szfVar = this.e;
        int hashCode4 = (hashCode3 ^ (szfVar == null ? 0 : szfVar.hashCode())) * 1000003;
        ayry ayryVar = this.f;
        int hashCode5 = (((((hashCode4 ^ (ayryVar == null ? 0 : ayryVar.hashCode())) * 1000003) ^ Float.floatToIntBits(this.g)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003;
        Map map = this.i;
        int hashCode6 = (hashCode5 ^ (map == null ? 0 : map.hashCode())) * 1000003;
        ajzj ajzjVar = this.x;
        int hashCode7 = (hashCode6 ^ (ajzjVar == null ? 0 : ajzjVar.hashCode())) * 1000003;
        wh whVar = this.j;
        int hashCode8 = (((((hashCode7 ^ (whVar == null ? 0 : whVar.hashCode())) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * (-721379959);
        StringBuilder sb = this.m;
        int hashCode9 = (hashCode8 ^ (sb == null ? 0 : sb.hashCode())) * 1000003;
        WeakReference weakReference = this.n;
        int hashCode10 = (hashCode9 ^ (weakReference == null ? 0 : weakReference.hashCode())) * 1000003;
        WeakReference weakReference2 = this.o;
        int hashCode11 = (hashCode10 ^ (weakReference2 == null ? 0 : weakReference2.hashCode())) * 1000003;
        syg sygVar = this.p;
        int hashCode12 = (hashCode11 ^ (sygVar == null ? 0 : sygVar.hashCode())) * 1000003;
        amru amruVar = this.q;
        int hashCode13 = (hashCode12 ^ (amruVar == null ? 0 : amruVar.hashCode())) * 1000003;
        sxj sxjVar = this.r;
        int hashCode14 = (hashCode13 ^ (sxjVar == null ? 0 : sxjVar.hashCode())) * 1000003;
        String str = this.s;
        int hashCode15 = (hashCode14 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.t;
        int hashCode16 = (hashCode15 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        syb sybVar = this.u;
        int hashCode17 = (((hashCode16 ^ (sybVar == null ? 0 : sybVar.hashCode())) * 1000003) ^ (true == this.v ? 1231 : 1237)) * 1000003;
        AtomicReference atomicReference = this.w;
        return hashCode17 ^ (atomicReference != null ? atomicReference.hashCode() : 0);
    }
}
