package com.google.android.libraries.youtube.innertube.model.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aamk;
import defpackage.aapa;
import defpackage.aapb;
import defpackage.amsx;
import defpackage.amvs;
import defpackage.anaf;
import defpackage.aobq;
import defpackage.aone;
import defpackage.aonu;
import defpackage.aonw;
import defpackage.aoyp;
import defpackage.aoyv;
import defpackage.apca;
import defpackage.apdl;
import defpackage.apee;
import defpackage.apgk;
import defpackage.aqdn;
import defpackage.aqdp;
import defpackage.aqhw;
import defpackage.aqif;
import defpackage.aqiq;
import defpackage.aqqa;
import defpackage.aqux;
import defpackage.aquz;
import defpackage.asnd;
import defpackage.assy;
import defpackage.astb;
import defpackage.asyn;
import defpackage.atfo;
import defpackage.atmw;
import defpackage.atxt;
import defpackage.atyi;
import defpackage.atyr;
import defpackage.aumk;
import defpackage.auys;
import defpackage.avzh;
import defpackage.awaz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlayerConfigModel implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final float[] a = {0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    public static final PlayerConfigModel b;
    private static final atyi k;
    public final atyi c;
    public Set d;
    public Set e;
    public Set f;
    public boolean h;
    private Set l;
    private Set m;
    private asnd n;
    public boolean g = false;
    public boolean i = false;
    public boolean j = true;

    static {
        atyi atyiVar = atyi.a;
        k = atyiVar;
        b = new PlayerConfigModel(atyiVar);
        CREATOR = new aamk(12);
    }

    public PlayerConfigModel(atyi atyiVar) {
        atyiVar.getClass();
        this.c = atyiVar;
    }

    public final int A() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        int i = aquzVar.s;
        if (i != 0) {
            return i;
        }
        return 2;
    }

    public final int B() {
        aqdn aqdnVar = this.c.d;
        if (aqdnVar == null) {
            aqdnVar = aqdn.a;
        }
        aqqa aqqaVar = aqdnVar.c;
        if (aqqaVar == null) {
            aqqaVar = aqqa.a;
        }
        return aqqaVar.d;
    }

    public final int C() {
        apdl apdlVar = this.c.j;
        if (apdlVar == null) {
            apdlVar = apdl.a;
        }
        int i = apdlVar.g;
        if (i != 0) {
            return i;
        }
        return 2000;
    }

    public final int D() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        int i = aquzVar.A;
        if (i != 0) {
            return i;
        }
        return 389;
    }

    public final long E(int i) {
        aonu aonuVar;
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        int i2 = aquzVar.l;
        if (i2 == 0) {
            i2 = 25000;
        }
        long j = i2;
        atyi atyiVar = this.c;
        if ((atyiVar.b & 2) != 0) {
            aquz aquzVar2 = atyiVar.e;
            if (aquzVar2 == null) {
                aquzVar2 = aquz.b;
            }
            aonuVar = aquzVar2.aN;
        } else {
            aonuVar = null;
        }
        if (aonuVar != null && !aonuVar.isEmpty() && i < aonuVar.size()) {
            j = ((Integer) aonuVar.get(i)).intValue();
        }
        return j * 1000;
    }

    public final long F() {
        atyi atyiVar = this.c;
        if ((atyiVar.b & 128) == 0) {
            return 0L;
        }
        atxt atxtVar = atyiVar.g;
        if (atxtVar == null) {
            atxtVar = atxt.a;
        }
        if ((atxtVar.b & 4) == 0) {
            atxt atxtVar2 = this.c.g;
            if (atxtVar2 == null) {
                atxtVar2 = atxt.a;
            }
            return atxtVar2.c * 1000.0f;
        }
        atxt atxtVar3 = this.c.g;
        if (atxtVar3 == null) {
            atxtVar3 = atxt.a;
        }
        avzh avzhVar = atxtVar3.d;
        if (avzhVar == null) {
            avzhVar = avzh.a;
        }
        return avzhVar.b;
    }

    public final long G() {
        atxt atxtVar = this.c.g;
        if (atxtVar == null) {
            atxtVar = atxt.a;
        }
        return atxtVar.g;
    }

    public final long H() {
        atxt atxtVar = this.c.g;
        if (atxtVar == null) {
            atxtVar = atxt.a;
        }
        return atxtVar.f;
    }

    public final long I() {
        auys auysVar = this.c.p;
        if (auysVar == null) {
            auysVar = auys.a;
        }
        long j = auysVar.b;
        if (j != 0) {
            return j;
        }
        return -1L;
    }

    public final long J() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        int i = aquzVar.bc;
        if (i != 0) {
            return i;
        }
        return 2000L;
    }

    public final long K() {
        aqif aqifVar = this.c.z;
        if (aqifVar == null) {
            aqifVar = aqif.b;
        }
        long j = aqifVar.d;
        if (j != 0) {
            return j;
        }
        return Long.MAX_VALUE;
    }

    public final PlayerConfigModel L(String str) {
        aone builder = this.c.toBuilder();
        aquz aquzVar = ((atyi) builder.instance).e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        aone builder2 = aquzVar.toBuilder();
        builder2.ae(str);
        builder.copyOnWrite();
        atyi atyiVar = (atyi) builder.instance;
        aquz aquzVar2 = (aquz) builder2.build();
        aquzVar2.getClass();
        atyiVar.e = aquzVar2;
        atyiVar.b |= 2;
        return new PlayerConfigModel((atyi) builder.build());
    }

    public final PlayerConfigModel M() {
        aone builder = this.c.toBuilder();
        builder.copyOnWrite();
        atyi atyiVar = (atyi) builder.instance;
        atyiVar.e = null;
        atyiVar.b &= -3;
        return new PlayerConfigModel((atyi) builder.build());
    }

    public final aoyp N() {
        aoyp aoypVar = this.c.E;
        return aoypVar == null ? aoyp.a : aoypVar;
    }

    public final aqdn O() {
        aqdn aqdnVar = this.c.d;
        return aqdnVar == null ? aqdn.a : aqdnVar;
    }

    public final synchronized asnd P() {
        if (this.n == null) {
            asnd asndVar = this.c.n;
            if (asndVar == null) {
                asndVar = asnd.a;
            }
            this.n = asndVar;
        }
        return this.n;
    }

    public final assy Q() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        assy b2 = assy.b(aquzVar.ai);
        return b2 == null ? assy.LIVE_ONLY_PEG_STRATEGY_UNKNOWN : b2;
    }

    public final atmw R() {
        aqdp aqdpVar = O().h;
        if (aqdpVar == null) {
            aqdpVar = aqdp.a;
        }
        atmw atmwVar = aqdpVar.c;
        return atmwVar == null ? atmw.a : atmwVar;
    }

    public final Long S() {
        asyn asynVar = this.c.f119J;
        if (asynVar == null) {
            asynVar = asyn.a;
        }
        if ((asynVar.b & 2) == 0) {
            return null;
        }
        asyn asynVar2 = this.c.f119J;
        if (asynVar2 == null) {
            asynVar2 = asyn.a;
        }
        return Long.valueOf(asynVar2.d);
    }

    public final Long T() {
        asyn asynVar = this.c.f119J;
        if (asynVar == null) {
            asynVar = asyn.a;
        }
        if ((asynVar.b & 1) == 0) {
            return null;
        }
        asyn asynVar2 = this.c.f119J;
        if (asynVar2 == null) {
            asynVar2 = asyn.a;
        }
        return Long.valueOf(asynVar2.c);
    }

    public final String U() {
        atyi atyiVar = this.c;
        if ((atyiVar.c & 1) == 0) {
            return "";
        }
        awaz awazVar = atyiVar.v;
        if (awazVar == null) {
            awazVar = awaz.a;
        }
        return awazVar.k;
    }

    public final synchronized Set W() {
        if (this.l == null) {
            aquz aquzVar = this.c.e;
            if (aquzVar == null) {
                aquzVar = aquz.b;
            }
            this.l = amsx.p(aquzVar.Z);
        }
        return this.l;
    }

    public final synchronized Set X() {
        Set p;
        if (this.m == null) {
            aquz aquzVar = this.c.e;
            if (aquzVar == null) {
                aquzVar = aquz.b;
            }
            if (aquzVar.ao.size() == 0) {
                p = amvs.a;
            } else {
                aquz aquzVar2 = this.c.e;
                if (aquzVar2 == null) {
                    aquzVar2 = aquz.b;
                }
                p = amsx.p(aquzVar2.ao);
            }
            this.m = p;
        }
        return this.m;
    }

    public final boolean Y() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.ab;
    }

    public final boolean Z() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.z;
    }

    public final double a() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.bs;
    }

    public final boolean aA() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.f;
    }

    public final boolean aB(aqux aquxVar) {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        if (aquzVar.bd.size() == 0) {
            return false;
        }
        aquz aquzVar2 = this.c.e;
        if (aquzVar2 == null) {
            aquzVar2 = aquz.b;
        }
        return new aonw(aquzVar2.bd, aquz.a).contains(aquxVar);
    }

    public final boolean aC() {
        apca apcaVar = this.c.w;
        if (apcaVar == null) {
            apcaVar = apca.a;
        }
        return apcaVar.d;
    }

    public final boolean aD() {
        apca apcaVar = this.c.w;
        if (apcaVar == null) {
            apcaVar = apca.a;
        }
        return apcaVar.c;
    }

    public final boolean aE() {
        atyi atyiVar = this.c;
        if ((atyiVar.c & 1) == 0) {
            return false;
        }
        awaz awazVar = atyiVar.v;
        if (awazVar == null) {
            awazVar = awaz.a;
        }
        return awazVar.f;
    }

    public final boolean aF() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.R;
    }

    public final boolean aG() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        if (!aquzVar.H) {
            return false;
        }
        aquz aquzVar2 = this.c.e;
        if (aquzVar2 == null) {
            aquzVar2 = aquz.b;
        }
        return aquzVar2.N;
    }

    public final boolean aH() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.P;
    }

    public final boolean aI() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.aj;
    }

    public final boolean aJ() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.ar;
    }

    public final boolean aK() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.L;
    }

    public final boolean aL() {
        aoyv aoyvVar = this.c.o;
        if (aoyvVar == null) {
            aoyvVar = aoyv.a;
        }
        return aoyvVar.b;
    }

    public final boolean aM() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.S;
    }

    public final boolean aN() {
        aumk aumkVar = this.c.D;
        if (aumkVar == null) {
            aumkVar = aumk.a;
        }
        return aumkVar.m;
    }

    public final boolean aO() {
        apgk apgkVar = this.c.f;
        if (apgkVar == null) {
            apgkVar = apgk.a;
        }
        return apgkVar.c;
    }

    public final boolean aP() {
        aqdn aqdnVar = this.c.d;
        if (aqdnVar == null) {
            aqdnVar = aqdn.a;
        }
        aqqa aqqaVar = aqdnVar.c;
        if (aqqaVar == null) {
            aqqaVar = aqqa.a;
        }
        return aqqaVar.h;
    }

    public final boolean aQ() {
        apgk apgkVar = this.c.f;
        if (apgkVar == null) {
            apgkVar = apgk.a;
        }
        return apgkVar.d;
    }

    public final boolean aR() {
        apgk apgkVar = this.c.f;
        if (apgkVar == null) {
            apgkVar = apgk.a;
        }
        return apgkVar.e;
    }

    public final boolean aS() {
        apdl apdlVar = this.c.j;
        if (apdlVar == null) {
            apdlVar = apdl.a;
        }
        return apdlVar.f;
    }

    public final boolean aT() {
        aqif aqifVar = this.c.z;
        if (aqifVar == null) {
            aqifVar = aqif.b;
        }
        return aqifVar.f;
    }

    public final boolean aU() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.C;
    }

    public final boolean aV() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.M;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aW() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.U;
    }

    public final boolean aX() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.aV;
    }

    public final boolean aY() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.ah;
    }

    public final boolean aZ() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.aq;
    }

    public final boolean aa() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.V;
    }

    public final boolean ab() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.aW;
    }

    public final boolean ac() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.W;
    }

    public final boolean ad() {
        atyi atyiVar = this.c;
        if ((atyiVar.b & 8192) == 0) {
            return false;
        }
        apdl apdlVar = atyiVar.j;
        if (apdlVar == null) {
            apdlVar = apdl.a;
        }
        return apdlVar.n;
    }

    public final boolean ae() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.bb;
    }

    public final boolean af() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.aX;
    }

    public final boolean ag() {
        aqif aqifVar = this.c.z;
        if (aqifVar == null) {
            aqifVar = aqif.b;
        }
        return aqifVar.g;
    }

    public final boolean ah() {
        apgk apgkVar = this.c.f;
        if (apgkVar == null) {
            apgkVar = apgk.a;
        }
        return apgkVar.f;
    }

    public final boolean ai() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.ac;
    }

    public final boolean aj() {
        aqhw aqhwVar = this.c.I;
        if (aqhwVar == null) {
            aqhwVar = aqhw.a;
        }
        return aqhwVar.c;
    }

    public final boolean ak() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.aO;
    }

    public final boolean al() {
        atyi atyiVar = this.c;
        if ((atyiVar.c & 1) == 0) {
            return false;
        }
        awaz awazVar = atyiVar.v;
        if (awazVar == null) {
            awazVar = awaz.a;
        }
        return awazVar.b;
    }

    public final boolean am() {
        atyi atyiVar = this.c;
        if ((atyiVar.c & 1) == 0) {
            return false;
        }
        awaz awazVar = atyiVar.v;
        if (awazVar == null) {
            awazVar = awaz.a;
        }
        return awazVar.j;
    }

    public final boolean an() {
        atyi atyiVar = this.c;
        if ((atyiVar.c & 1) == 0) {
            return false;
        }
        awaz awazVar = atyiVar.v;
        if (awazVar == null) {
            awazVar = awaz.a;
        }
        return awazVar.h;
    }

    public final boolean ao() {
        atxt atxtVar = this.c.g;
        if (atxtVar == null) {
            atxtVar = atxt.a;
        }
        return atxtVar.e;
    }

    public final boolean ap() {
        aqdp aqdpVar = O().h;
        if (aqdpVar == null) {
            aqdpVar = aqdp.a;
        }
        return aqdpVar.b;
    }

    public final boolean aq() {
        atyi atyiVar = this.c;
        if ((atyiVar.c & 1) == 0) {
            return false;
        }
        awaz awazVar = atyiVar.v;
        if (awazVar == null) {
            awazVar = awaz.a;
        }
        return awazVar.d;
    }

    public final boolean ar() {
        return !this.h && O().j;
    }

    public final boolean as(aapb aapbVar) {
        atyi atyiVar = this.c;
        if ((atyiVar.b & 2) == 0) {
            return false;
        }
        aapa aapaVar = aapa.DEFAULT;
        aquz aquzVar = atyiVar.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        int bM = aobq.bM(aquzVar.aA);
        if (bM == 0) {
            bM = 1;
        }
        int i = bM - 1;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return false;
                }
                return aapbVar.a();
            }
            if (aapbVar != aapb.RECTANGULAR_2D && aapbVar != aapb.RECTANGULAR_3D && aapbVar != aapb.NOOP) {
                return false;
            }
        }
        return true;
    }

    public final boolean at() {
        aqdn aqdnVar = this.c.d;
        if (aqdnVar == null) {
            aqdnVar = aqdn.a;
        }
        return (aqdnVar.b & 1024) != 0;
    }

    public final boolean au() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.h;
    }

    public final boolean av() {
        apca apcaVar = this.c.w;
        if (apcaVar == null) {
            apcaVar = apca.a;
        }
        return apcaVar.b;
    }

    public final boolean aw() {
        apca apcaVar = this.c.w;
        if (apcaVar == null) {
            apcaVar = apca.a;
        }
        return apcaVar.e;
    }

    public final boolean ax() {
        atyi atyiVar = this.c;
        if ((atyiVar.c & 262144) == 0) {
            return false;
        }
        aqhw aqhwVar = atyiVar.I;
        if (aqhwVar == null) {
            aqhwVar = aqhw.a;
        }
        return aqhwVar.b;
    }

    public final boolean ay() {
        atyr atyrVar = this.c.K;
        if (atyrVar == null) {
            atyrVar = atyr.a;
        }
        return atyrVar.b;
    }

    public final boolean az() {
        atyr atyrVar = this.c.K;
        if (atyrVar == null) {
            atyrVar = atyr.a;
        }
        return atyrVar.c;
    }

    public final float b() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        float f = aquzVar.m;
        if (f != 0.0f) {
            return f;
        }
        return 0.7f;
    }

    public final boolean ba() {
        apee apeeVar = this.c.A;
        if (apeeVar == null) {
            apeeVar = apee.a;
        }
        return apeeVar.b;
    }

    public final boolean bb() {
        aumk aumkVar = this.c.D;
        if (aumkVar == null) {
            aumkVar = aumk.a;
        }
        return aumkVar.j;
    }

    public final byte[] bc() {
        return this.c.toByteArray();
    }

    public final float bd() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        float f = aquzVar.au;
        if (f != 0.0f) {
            return f;
        }
        return 0.5f;
    }

    public final int be() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        int i = aquzVar.av;
        if (i != 0) {
            return i;
        }
        return 12;
    }

    public final int bf(int i) {
        atyi atyiVar = this.c;
        if ((atyiVar.b & 2) == 0) {
            return i;
        }
        aquz aquzVar = atyiVar.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        int by = anaf.by(aquzVar.at);
        if (by == 0) {
            return 1;
        }
        return by;
    }

    public final float c() {
        atyi atyiVar = this.c;
        if ((atyiVar.b & 64) == 0) {
            return 1.0f;
        }
        apgk apgkVar = atyiVar.f;
        if (apgkVar == null) {
            apgkVar = apgk.a;
        }
        return Math.min(1.0f, (float) Math.pow(10.0d, (-apgkVar.b) / 20.0f));
    }

    public final float d() {
        atyi atyiVar = this.c;
        if ((atyiVar.b & 8192) != 0) {
            apdl apdlVar = atyiVar.j;
            if (apdlVar == null) {
                apdlVar = apdl.a;
            }
            if ((apdlVar.b & 2048) != 0) {
                apdl apdlVar2 = this.c.j;
                if (apdlVar2 == null) {
                    apdlVar2 = apdl.a;
                }
                return apdlVar2.l;
            }
        }
        return e();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e() {
        atyi atyiVar = this.c;
        if ((atyiVar.b & 8192) == 0) {
            return 0.85f;
        }
        apdl apdlVar = atyiVar.j;
        if (apdlVar == null) {
            apdlVar = apdl.a;
        }
        return apdlVar.k;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof PlayerConfigModel) && this.c.equals(((PlayerConfigModel) obj).c);
    }

    public final float f() {
        aqdn aqdnVar = this.c.d;
        if (aqdnVar == null) {
            aqdnVar = aqdn.a;
        }
        aqqa aqqaVar = aqdnVar.c;
        if (aqqaVar == null) {
            aqqaVar = aqqa.a;
        }
        return aqqaVar.e;
    }

    public final int g() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        int i = aquzVar.B;
        if (i != 0) {
            return i;
        }
        return 38;
    }

    public final int h() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        int i = aquzVar.n;
        if (i != 0) {
            return i;
        }
        return 50;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final int i() {
        aumk aumkVar = this.c.D;
        if (aumkVar == null) {
            aumkVar = aumk.a;
        }
        return aumkVar.k;
    }

    public final int j() {
        astb astbVar = this.c.G;
        if (astbVar == null) {
            astbVar = astb.a;
        }
        double d = astbVar.e;
        if (d > 0.0d) {
            return (int) (d * 1000.0d);
        }
        return 40000;
    }

    public final int k() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.ay;
    }

    public final int l() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.T;
    }

    public final int m() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        int i = aquzVar.o;
        if (i != 0) {
            return i;
        }
        return 8000;
    }

    public final int n() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.y;
    }

    public final int o() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        int i = aquzVar.p;
        if (i != 0) {
            return i;
        }
        return 8000;
    }

    public final int p() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.aw;
    }

    public final int q() {
        aqdn aqdnVar = this.c.d;
        if (aqdnVar == null) {
            aqdnVar = aqdn.a;
        }
        aqqa aqqaVar = aqdnVar.c;
        if (aqqaVar == null) {
            aqqaVar = aqqa.a;
        }
        int i = aqqaVar.b;
        if (i != 0) {
            return i;
        }
        return 120000;
    }

    public final int r() {
        aqdn aqdnVar = this.c.d;
        if (aqdnVar == null) {
            aqdnVar = aqdn.a;
        }
        aqqa aqqaVar = aqdnVar.c;
        if (aqqaVar == null) {
            aqqaVar = aqqa.a;
        }
        return aqqaVar.g;
    }

    public final int s() {
        aqiq aqiqVar = this.c.u;
        if (aqiqVar == null) {
            aqiqVar = aqiq.a;
        }
        return aqiqVar.b;
    }

    public final int t() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        int i = aquzVar.v;
        if (i > 0) {
            return i;
        }
        return 2500;
    }

    public final String toString() {
        int hashCode = this.c.hashCode();
        StringBuilder sb = new StringBuilder(29);
        sb.append("PlayerConfigModel@");
        sb.append(hashCode);
        return sb.toString();
    }

    public final int u() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return aquzVar.ae;
    }

    public final int v() {
        aqdn aqdnVar = this.c.d;
        if (aqdnVar == null) {
            aqdnVar = aqdn.a;
        }
        aqqa aqqaVar = aqdnVar.c;
        if (aqqaVar == null) {
            aqqaVar = aqqa.a;
        }
        int i = aqqaVar.c;
        if (i != 0) {
            return i;
        }
        return 120000;
    }

    public final int w() {
        aqdn aqdnVar = this.c.d;
        if (aqdnVar == null) {
            aqdnVar = aqdn.a;
        }
        aqqa aqqaVar = aqdnVar.c;
        if (aqqaVar == null) {
            aqqaVar = aqqa.a;
        }
        return aqqaVar.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(bc());
    }

    public final int x() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        int i = aquzVar.w;
        if (i > 0) {
            return i;
        }
        return 5000;
    }

    public final int y() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        int i = aquzVar.D;
        if (i != 0) {
            return i;
        }
        return 3;
    }

    public final int z() {
        aquz aquzVar = this.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        int i = aquzVar.q;
        if (i != 0) {
            return i;
        }
        return 1;
    }

    public final List V() {
        atyi atyiVar = this.c;
        if ((atyiVar.c & 64) == 0) {
            return Collections.emptyList();
        }
        aqif aqifVar = atyiVar.z;
        if (aqifVar == null) {
            aqifVar = aqif.b;
        }
        aonw aonwVar = new aonw(aqifVar.e, aqif.a);
        ArrayList arrayList = new ArrayList(aonwVar.size());
        Iterator<E> it = aonwVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((atfo) it.next()).n));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
