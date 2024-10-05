package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aldd extends albk {
    public final ScheduledExecutorService a;
    public final akxw b;
    public final akwm c;
    public final akyb e;
    public final akxh f;
    final Map g;
    final akxu h;
    public final axze i;
    private final afsy k;

    public aldd(aaea aaeaVar, ScheduledExecutorService scheduledExecutorService, axze axzeVar, afsy afsyVar, akwm akwmVar, akxw akxwVar, akyb akybVar, akxh akxhVar, alep alepVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(aaeaVar, avtr.UPLOAD_PROCESSOR_TYPE_FEEDBACK, akybVar, axzeVar, alepVar, null, null, null);
        this.g = new HashMap();
        aldb aldbVar = new aldb(this);
        this.h = aldbVar;
        this.a = scheduledExecutorService;
        this.i = axzeVar;
        this.k = afsyVar;
        this.c = akwmVar;
        this.b = akxwVar;
        this.e = akybVar;
        this.f = akxhVar;
        akxwVar.a(aldbVar);
    }

    @Override // defpackage.aldq
    public final akyq a(akzs akzsVar) {
        return null;
    }

    @Override // defpackage.aldq
    public final akzp b(akzs akzsVar) {
        akzp akzpVar = akzsVar.aa;
        return akzpVar == null ? akzp.a : akzpVar;
    }

    @Override // defpackage.albk
    public final anhy c(final String str, akwm akwmVar, final akzs akzsVar) {
        TimeUnit timeUnit = TimeUnit.HOURS;
        ScheduledExecutorService scheduledExecutorService = this.a;
        final afsx d = (akzsVar.b & 1) != 0 ? this.k.d(akzsVar.e) : null;
        if (d == null) {
            d = afsw.a;
        }
        return ambh.a(new ambg() { // from class: alcz
            @Override // defpackage.ambg
            public final Object a(ambf ambfVar) {
                final aldd alddVar = aldd.this;
                afsx afsxVar = d;
                String str2 = str;
                akzs akzsVar2 = akzsVar;
                final String str3 = akzsVar2.Y;
                String str4 = akzsVar2.X;
                synchronized (alddVar.g) {
                    ambfVar.a(new Runnable() { // from class: alda
                        @Override // java.lang.Runnable
                        public final void run() {
                            aldd alddVar2 = aldd.this;
                            String str5 = str3;
                            synchronized (alddVar2.g) {
                                alddVar2.g.remove(str5);
                            }
                        }
                    }, alddVar.a);
                    if (alddVar.g.containsKey(str3)) {
                        ambf ambfVar2 = (ambf) ((Pair) alddVar.g.get(str3)).second;
                        String valueOf = String.valueOf(str3);
                        ambfVar2.c(new IllegalStateException(valueOf.length() != 0 ? "Another polling request has been added for video id ".concat(valueOf) : new String("Another polling request has been added for video id ")));
                    }
                    alddVar.g.put(str3, new Pair(str2, ambfVar));
                    alddVar.b.b(afsxVar, null, str3, str4);
                }
                return "Polling for feedback on background thread";
            }
        }, timeUnit, scheduledExecutorService);
    }

    @Override // defpackage.aldq
    public final ayro e() {
        return albr.h;
    }

    @Override // defpackage.aldq
    public final String f() {
        return "UploadFeedbackTask";
    }

    @Override // defpackage.aldq
    public final boolean h() {
        return false;
    }

    @Override // defpackage.albk
    public final boolean i(akzs akzsVar) {
        akzq akzqVar = akzq.UNKNOWN_UPLOAD;
        akzq a = akzq.a(akzsVar.l);
        if (a == null) {
            a = akzq.UNKNOWN_UPLOAD;
        }
        int ordinal = a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        akzp akzpVar = akzsVar.N;
                        if (akzpVar == null) {
                            akzpVar = akzp.a;
                        }
                        int l = akwg.l(akzpVar.c);
                        if (l == 0 || l != 2) {
                            return false;
                        }
                    } else if (ordinal != 4) {
                        if (ordinal != 5) {
                            return false;
                        }
                    }
                }
            }
            akzp akzpVar2 = akzsVar.M;
            if (akzpVar2 == null) {
                akzpVar2 = akzp.a;
            }
            int l2 = akwg.l(akzpVar2.c);
            if (l2 == 0 || l2 != 2) {
                return false;
            }
        }
        return (akzsVar.c & 524288) != 0;
    }

    public final void s(String str, akzp akzpVar) {
        synchronized (this.g) {
            Pair pair = (Pair) this.g.remove(str);
            if (pair == null) {
                return;
            }
            ((ambf) pair.second).b(t(akzpVar, true));
        }
    }
}
