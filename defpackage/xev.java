package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xev {
    public final String a;
    public final apac b;
    public final int c;
    public final amru d;
    public final amru e;
    public final amru f;
    public final amrz g;
    public final ammv h;
    public final ammv i;
    public final ammv j;
    public final xcp k;

    public xev(String str, apac apacVar, int i, amru amruVar, amru amruVar2, amru amruVar3, amrz amrzVar, ammv ammvVar, ammv ammvVar2, ammv ammvVar3, xcp xcpVar) {
        if (str == null) {
            throw new NullPointerException("Null layoutId");
        }
        this.a = str;
        if (apacVar != null) {
            this.b = apacVar;
            this.c = i;
            if (amruVar != null) {
                this.d = amruVar;
                if (amruVar2 != null) {
                    this.e = amruVar2;
                    if (amruVar3 != null) {
                        this.f = amruVar3;
                        this.g = amrzVar;
                        this.h = ammvVar;
                        this.i = ammvVar2;
                        this.j = ammvVar3;
                        this.k = xcpVar;
                        return;
                    }
                    throw new NullPointerException("Null layoutExitMuteTriggers");
                }
                throw new NullPointerException("Null layoutExitSkipTriggers");
            }
            throw new NullPointerException("Null layoutExitNormalTriggers");
        }
        throw new NullPointerException("Null layoutType");
    }

    public static int a(xce xceVar) {
        xce xceVar2 = xce.VIDEO_ENDED;
        int ordinal = xceVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        switch (ordinal) {
            case 3:
            case 8:
                return 2;
            case 4:
                return 3;
            case 5:
            case 6:
            case 7:
                return 0;
            default:
                return 1;
        }
    }

    public static xev b(String str, apac apacVar, int i, xcp xcpVar) {
        return new xev(str, apacVar, i, amru.q(), amru.q(), amru.q(), amvo.b, amlr.a, amlr.a, amlr.a, xcpVar);
    }

    public static xev c(String str, apac apacVar, int i, ammv ammvVar, xcp xcpVar) {
        return new xev(str, apacVar, i, amru.q(), amru.q(), amru.q(), amvo.b, ammvVar, amlr.a, amlr.a, xcpVar);
    }

    public static xev d(String str, apac apacVar, int i, amru amruVar, amru amruVar2, amru amruVar3, ammv ammvVar, ammv ammvVar2, xcp xcpVar) {
        return new xev(str, apacVar, i, amruVar, amruVar2, amruVar3, amvo.b, ammvVar, ammvVar2, amlr.a, xcpVar);
    }

    public static xev h(String str, apac apacVar, amru amruVar, ammv ammvVar, xcp xcpVar) {
        return new xev(str, apacVar, 1, amruVar, amru.q(), amru.q(), amvo.b, amlr.a, ammvVar, amlr.a, xcpVar);
    }

    public static xev i(String str, apac apacVar, amru amruVar, amru amruVar2, amru amruVar3, ammv ammvVar, ammv ammvVar2, ammv ammvVar3, xcp xcpVar) {
        return new xev(str, apacVar, 1, amruVar, amruVar2, amruVar3, amvo.b, ammvVar, ammvVar2, ammvVar3, xcpVar);
    }

    public final Object e(Class cls) {
        return this.k.c(cls);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xev) {
            xev xevVar = (xev) obj;
            if (this.a.equals(xevVar.a) && this.b.equals(xevVar.b) && this.c == xevVar.c && amkq.aV(this.d, xevVar.d) && amkq.aV(this.e, xevVar.e) && amkq.aV(this.f, xevVar.f) && this.g.equals(xevVar.g) && this.h.equals(xevVar.h) && this.i.equals(xevVar.i) && this.j.equals(xevVar.j) && this.k.equals(xevVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(Class cls) {
        return this.k.d(cls);
    }

    public final boolean g(apac apacVar, Class... clsArr) {
        List asList = Arrays.asList(clsArr);
        if (apacVar != this.b) {
            return false;
        }
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            if (!this.k.d((Class) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    public final String toString() {
        return "Layout[layoutType=" + this.b.name() + ", managerLayer=" + this.c + ", layoutExitNormalTriggers=" + this.d + ", layoutExitSkipTriggers=" + this.e + ", layoutExitMuteTriggers=" + this.f + ", clientMetadata=" + this.k + "]";
    }

    public xev() {
    }
}
