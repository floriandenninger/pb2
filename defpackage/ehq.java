package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.FileObserver;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.apps.youtube.app.extensions.appindexing.WatchVideoIndexer;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ehq implements egn {
    azrw A;
    azrw B;
    azrw C;
    azrw D;
    azrw E;
    azrw F;
    azrw G;
    azrw H;
    azrw I;

    /* renamed from: J, reason: collision with root package name */
    azrw f211J;
    azrw K;
    azrw L;
    azrw M;
    azrw N;
    azrw O;
    azrw P;
    azrw Q;
    azrw R;
    azrw S;
    azrw T;
    azrw U;
    azrw V;
    azrw W;
    azrw X;
    azrw Y;
    azrw Z;
    ScheduledExecutorService a;
    azrw aA;
    azrw aB;
    azrw aC;
    azrw aD;
    azrw aE;
    azrw aF;
    azrw aG;
    azrw aH;
    azrw aI;
    azrw aJ;
    azrw aK;
    azrw aL;
    azrw aM;
    azrw aN;
    azrw aO;
    azrw aP;
    azrw aQ;
    azrw aR;
    azrw aS;
    azrw aT;
    azrw aU;
    azrw aV;
    azrw aW;
    azrw aX;
    azrw aY;
    azrw aZ;
    azrw aa;
    azrw ab;
    azrw ac;
    azrw ad;
    azrw ae;
    azrw af;
    azrw ag;
    azrw ah;
    azrw ai;
    azrw aj;
    azrw ak;
    azrw al;
    azrw am;
    azrw an;
    azrw ao;
    azrw ap;
    azrw aq;
    azrw ar;
    azrw as;
    azrw at;
    azrw au;
    azrw av;
    azrw aw;
    azrw ax;
    azrw ay;
    azrw az;
    ayqi b;
    azrw ba;
    azrw bb;
    azrw bc;
    azrw bd;
    azrw be;
    axpg bf;
    axpg bg;
    axpg bh;
    axpg bi;
    axpg bj;
    axpg bk;
    axpg bl;
    axpg bm;
    axpg bn;
    axpg bo;
    axpg bp;
    axpg bq;
    azrw br;
    public FileObserver bs;
    public ynz bu;
    aadw bv;
    SharedPreferences c;
    eni d;
    shf e;
    Application f;
    yxx g;
    aabt h;
    anhy i;
    azrw j;
    azrw k;
    azrw l;
    azrw m;
    azrw n;
    azrw o;
    azrw p;
    azrw q;
    azrw r;
    azrw s;
    azrw t;
    azrw u;
    azrw v;
    azrw w;
    azrw x;
    azrw y;
    azrw z;
    public final azrr bt = azrr.ab();
    private final azrj bw = azrj.W();

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0993, code lost:
    
        if (r2 == 1) goto L169;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05ca  */
    @Override // defpackage.egn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 2492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehq.a():void");
    }

    public final apdm b() {
        atej atejVar = this.bv.b().k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        apdm apdmVar = atejVar.p;
        return apdmVar == null ? apdm.a : apdmVar;
    }

    public final void c(Boolean bool, Throwable th) {
        long h;
        String str;
        ynz ynzVar = this.bu;
        if (ynzVar == null) {
            h = Build.VERSION.SDK_INT >= 24 ? Process.getStartElapsedRealtime() : SystemClock.elapsedRealtime();
        } else {
            h = ynzVar.h();
        }
        acsy acsyVar = (acsy) this.n.get();
        yys yysVar = this.d.b;
        String[] strArr = acua.a;
        if (yysVar.a) {
            TimeUnit.MILLISECONDS.toMicros(h);
            List<yyr> list = yysVar.c;
            asmn asmnVar = asmn.LATENCY_ACTION_STARTUP;
            acsyVar.s(asmnVar, h);
            aone createBuilder = asmb.a.createBuilder();
            createBuilder.copyOnWrite();
            asmb asmbVar = (asmb) createBuilder.instance;
            asmbVar.e = asmnVar.bO;
            asmbVar.b |= 1;
            createBuilder.copyOnWrite();
            asmb asmbVar2 = (asmb) createBuilder.instance;
            asmbVar2.b |= 16;
            asmbVar2.h = "cold";
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            createBuilder.copyOnWrite();
            asmb asmbVar3 = (asmb) createBuilder.instance;
            asmbVar3.c |= 256;
            asmbVar3.t = availableProcessors;
            String str2 = Build.VERSION.SDK;
            createBuilder.copyOnWrite();
            asmb asmbVar4 = (asmb) createBuilder.instance;
            str2.getClass();
            asmbVar4.c |= 512;
            asmbVar4.u = str2;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                createBuilder.copyOnWrite();
                asmb asmbVar5 = (asmb) createBuilder.instance;
                asmbVar5.b |= 32;
                asmbVar5.i = booleanValue;
            }
            if (th != null) {
                createBuilder.copyOnWrite();
                asmb asmbVar6 = (asmb) createBuilder.instance;
                asmbVar6.v = 1;
                asmbVar6.c |= 16384;
                afsi.c(2, 18, "SS wait for schedulers", th);
            }
            acsyVar.o(asmnVar, (asmb) createBuilder.build());
            ArrayList arrayList = new ArrayList(256);
            int i = 0;
            for (yyr yyrVar : list) {
                yyo[] yyoVarArr = yyrVar.a;
                for (int i2 = 0; i2 < 2; i2++) {
                    yyoVarArr[i2].d(arrayList);
                }
                yyo[] yyoVarArr2 = yyrVar.a;
                int i3 = 0;
                for (int i4 = 0; i4 < 2; i4++) {
                    i3 += yyoVarArr2[i4].a();
                }
                i += i3;
                Iterator it = yyrVar.b.iterator();
                while (it.hasNext()) {
                    afsi.c(2, 18, "SS non fatal error", (Throwable) it.next());
                }
            }
            if (i > 0) {
                afsi.b(1, 18, "SS tasks after noMoreTasksAreLikely");
            }
            whl whlVar = yysVar.m;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                yyp yypVar = (yyp) arrayList.get(i5);
                String str3 = yypVar.b;
                if (str3 != null) {
                    acsyVar.q(asmnVar, acua.a(str3, yypVar.d, yypVar.e));
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AtomicReference atomicReference = ((yyr) it2.next()).c;
                yyx yyxVar = atomicReference != null ? (yyx) atomicReference.get() : null;
                if (yyxVar != null) {
                    acsyVar.q(asmnVar, acua.a(acua.b(yyxVar), yyxVar, null));
                }
            }
            for (yyx yyxVar2 : yysVar.h) {
                acsyVar.q(asmnVar, acua.a(acua.b(yyxVar2), yyxVar2, null));
            }
            for (yyp yypVar2 : yysVar.g) {
                if (yypVar2.c != -1) {
                    str = acua.a[yypVar2.c];
                } else {
                    str = yypVar2.b;
                }
                acsyVar.q(asmnVar, acua.a(str, yypVar2.d, yypVar2.e));
            }
        }
        yys yysVar2 = this.d.b;
        yyw yywVar = yysVar2.f;
        Iterator it3 = ynh.a.iterator();
        while (it3.hasNext()) {
            ((ynh) it3.next()).b.a.remove(yywVar);
        }
        yyw yywVar2 = yysVar2.f;
        Iterator it4 = yng.a.iterator();
        if (it4.hasNext()) {
            throw null;
        }
        nbq nbqVar = yysVar2.l;
        if (nbqVar != null) {
            nbqVar.c();
        }
        if (yysVar2.b) {
            return;
        }
        Iterator it5 = yysVar2.c.iterator();
        while (it5.hasNext()) {
            yyo[] yyoVarArr3 = ((yyr) it5.next()).a;
            for (int i6 = 0; i6 < 2; i6++) {
                yyoVarArr3[i6].f();
            }
        }
        yysVar2.c.clear();
        whl whlVar2 = yysVar2.m;
    }

    public final void d() {
        boolean z;
        yjk.f();
        try {
            z = ((Boolean) this.i.get(500L, TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            z = false;
        }
        ((fay) this.an.get()).b(((edx) this.f).c(), ((edx) this.f).b(), z, ((Boolean) this.aY.get()).booleanValue());
        ypa ypaVar = (ypa) this.z.get();
        Iterator it = ((Set) this.L.get()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            few fewVar = (few) it.next();
            if (fewVar.c()) {
                fewVar.b((actg) this.M.get());
                ynz a = fewVar.a();
                this.bu = a;
                if (a != null) {
                    ypaVar.f(a);
                    break;
                }
            }
        }
        aarh b = this.h.b();
        ypaVar.f(new fdd(b.k));
        ypaVar.f(new fdv(b.l));
        ypaVar.f(new fdz(b.m));
        ((acso) this.j.get()).f();
        this.bw.sh();
    }

    public final void e(boolean z) {
        if (z) {
            ((Executor) this.aW.get()).execute(new ehg(this, 12));
        } else {
            this.aI.get();
        }
    }

    public final void f(boolean z) {
        ((akpv) this.ab.get()).c(z, this.ax);
    }

    public final void h() {
        boolean z;
        yjk.f();
        try {
            z = ((Boolean) this.i.get(500L, TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            z = false;
        }
        ((fay) this.an.get()).b(((edx) this.f).c(), ((edx) this.f).b(), z, ((Boolean) this.aY.get()).booleanValue());
    }

    public final void i(boolean z) {
        File[] listFiles;
        if (z && (listFiles = ((File) this.aR.get()).listFiles()) != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        ((akey) this.bh.get()).d();
        ((WatchVideoIndexer) this.bi.get()).g();
    }
}
