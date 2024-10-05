package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xgh {
    public final String a;
    public final ammw b;
    public final int c;
    public final amru d;
    public final amru e;
    public final amru f;
    public final xcp g;
    public final Optional h;

    public xgh(String str, ammw ammwVar, int i, amru amruVar, amru amruVar2, amru amruVar3, xcp xcpVar, Optional optional) {
        if (str == null) {
            throw new NullPointerException("Null slotId");
        }
        this.a = str;
        this.b = ammwVar;
        this.c = i;
        if (amruVar != null) {
            this.d = amruVar;
            if (amruVar2 != null) {
                this.e = amruVar2;
                if (amruVar3 != null) {
                    this.f = amruVar3;
                    this.g = xcpVar;
                    this.h = optional;
                    return;
                }
                throw new NullPointerException("Null slotExpirationTriggers");
            }
            throw new NullPointerException("Null slotFulfillmentTriggers");
        }
        throw new NullPointerException("Null slotEntryTriggers");
    }

    public static xgh b(String str, apae apaeVar, int i, xcp xcpVar) {
        return new xgh(str, ammw.a(apaeVar, 1), i, amru.q(), amru.q(), amru.q(), xcpVar, Optional.empty());
    }

    public static xgh i(String str, apae apaeVar, int i, xcp xcpVar) {
        return new xgh(str, ammw.a(apaeVar, Integer.valueOf(i)), 3, amru.q(), amru.q(), amru.q(), xcpVar, Optional.empty());
    }

    public static xgh j(String str, apae apaeVar, amru amruVar, amru amruVar2, amru amruVar3, xcp xcpVar) {
        return new xgh(str, ammw.a(apaeVar, 1), 1, amruVar, amruVar2, amruVar3, xcpVar, Optional.empty());
    }

    public final int a() {
        return ((Integer) this.b.b).intValue();
    }

    public final apae c() {
        return (apae) this.b.a;
    }

    public final Object d(Class cls) {
        return this.g.c(cls);
    }

    public final boolean e(Class cls) {
        return this.g.d(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xgh)) {
            return false;
        }
        xgh xghVar = (xgh) obj;
        return TextUtils.equals(xghVar.a, this.a) && amkq.b(xghVar.b, this.b) && xghVar.c == this.c && amkq.b(xghVar.d, this.d) && amkq.b(xghVar.e, this.e) && amkq.b(xghVar.f, this.f) && amkq.b(xghVar.g, this.g) && amkq.b(xghVar.h, this.h);
    }

    public final boolean f(Class... clsArr) {
        Iterator it = Arrays.asList(clsArr).iterator();
        while (it.hasNext()) {
            if (!e((Class) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(apae apaeVar, List list) {
        if (apaeVar != c()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.g.d((Class) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean h(apae apaeVar, Class... clsArr) {
        return g(apaeVar, Arrays.asList(clsArr));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, this.f, this.g, this.h});
    }

    public final String toString() {
        return "Slot[slotType=" + c().name() + ", slotPhysicalPosition=" + a() + ", managerLayer=" + this.c + ", slotEntryTriggers=" + this.d + ", slotFulfillmentTriggers=" + this.e + ", slotExpirationTriggers=" + this.f + ", clientMetadata=" + this.g + "]";
    }

    public xgh() {
    }
}
