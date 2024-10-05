package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akgq {
    public avae a = null;
    public avai b;
    public Set c;
    public avai d;
    public Set e;
    public avai f;
    public Set g;
    public boolean h;
    private avai[] i;
    private avaj[] j;

    public final CharSequence a() {
        avae avaeVar = this.a;
        if (avaeVar == null) {
            return null;
        }
        apmh apmhVar = avaeVar.i;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) == 0) {
            return null;
        }
        apmh apmhVar2 = this.a.i;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmg apmgVar = apmhVar2.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        aqyg aqygVar = apmgVar.i;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return ajcq.b(aqygVar);
    }

    public final CharSequence b() {
        avae avaeVar = this.a;
        if (avaeVar == null) {
            return null;
        }
        apmh apmhVar = avaeVar.h;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) == 0) {
            return null;
        }
        apmh apmhVar2 = this.a.h;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmg apmgVar = apmhVar2.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        aqyg aqygVar = apmgVar.i;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return ajcq.b(aqygVar);
    }

    public final avai[] c() {
        avai avaiVar;
        if (this.i == null) {
            this.i = new avai[this.a.c.size()];
            for (int i = 0; i < this.a.c.size(); i++) {
                avaf avafVar = (avaf) this.a.c.get(i);
                if (avafVar.b == 119719473) {
                    avaiVar = (avai) avafVar.c;
                } else {
                    avaiVar = avai.a;
                }
                this.i[i] = avaiVar;
            }
        }
        return this.i;
    }

    public final avaj[] d() {
        avaj avajVar;
        if (this.j == null) {
            this.j = new avaj[this.a.d.size()];
            for (int i = 0; i < this.a.d.size(); i++) {
                avag avagVar = (avag) this.a.d.get(i);
                if (avagVar.b == 94522740) {
                    avajVar = (avaj) avagVar.c;
                } else {
                    avajVar = avaj.a;
                }
                this.j[i] = avajVar;
            }
        }
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akgq)) {
            return false;
        }
        akgq akgqVar = (akgq) obj;
        if (amkq.b(akgqVar.a, this.a) && akgqVar.e.equals(this.e) && amkq.b(akgqVar.d, this.d) && amkq.b(akgqVar.b, this.b) && akgqVar.c.equals(this.c) && amkq.b(akgqVar.f, this.f)) {
            Set set = akgqVar.g;
            if (set == null && this.g == null) {
                return true;
            }
            if (set == null) {
                this.g.getClass();
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a.toByteArray())), Integer.valueOf(Arrays.hashCode(this.d.toByteArray())), this.e, this.c, Integer.valueOf(Arrays.hashCode(this.b.toByteArray())), Integer.valueOf(Arrays.hashCode(this.f.toByteArray())), this.g});
    }
}
