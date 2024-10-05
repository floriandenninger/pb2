package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jnr implements ypd {
    public final Context a;
    public final anib b;
    public final jnm c;
    public final aaqz d;
    public final afsy e;
    public final Object f = new Object();
    public anhy g;

    public jnr(Context context, anib anibVar, jnm jnmVar, aaqz aaqzVar, afsy afsyVar) {
        this.a = context;
        this.b = anibVar;
        this.c = jnmVar;
        this.d = aaqzVar;
        this.e = afsyVar;
    }

    public final anhy a() {
        anhy anhyVar;
        synchronized (this.f) {
            if (this.g == null) {
                this.g = anfq.i(this.b.submit(new Callable() { // from class: jnq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        jnr jnrVar = jnr.this;
                        yjk.e();
                        try {
                            return (aqzg) aonm.parseFrom(aqzg.a, jnrVar.a.getResources().openRawResource(R.raw.downloads_platform_persistent_android_fut), aomw.b());
                        } catch (IOException e) {
                            zga.d("Could not load persisted framework update transport", e);
                            return aqzg.a;
                        }
                    }
                }), new anfz() { // from class: jnn
                    @Override // defpackage.anfz
                    public final anhy a(Object obj) {
                        final jnr jnrVar = jnr.this;
                        final aqzg aqzgVar = (aqzg) obj;
                        final jnm jnmVar = jnrVar.c;
                        Runnable runnable = new Runnable() { // from class: jnp
                            @Override // java.lang.Runnable
                            public final void run() {
                                jnr jnrVar2 = jnr.this;
                                jnrVar2.d.a(jnrVar2.e.c(), aqzgVar, null);
                            }
                        };
                        final aqty a = aako.a(aqzgVar);
                        if (a == null) {
                            return jnmVar.c.submit(runnable, aqzgVar);
                        }
                        return anfq.i(jnmVar.c.submit(runnable, aqzgVar), new aeds(aci.c(new aeu() { // from class: jnj
                            @Override // defpackage.aeu
                            public final Object a(final aes aesVar) {
                                final jnm jnmVar2 = jnm.this;
                                aqty aqtyVar = a;
                                final aqzg aqzgVar2 = aqzgVar;
                                for (aquf aqufVar : aqtyVar.d) {
                                    if (aqufVar.c.equals("Egl0aGVtZS1zZXQgSygB")) {
                                        aqug aqugVar = aqufVar.f;
                                        if (aqugVar == null) {
                                            aqugVar = aqug.a;
                                        }
                                        byte[] a2 = aakn.a(aqugVar.toByteString());
                                        if (a2 != null) {
                                            try {
                                                jnmVar2.e = (avfb) aonm.parseFrom(avfb.a, a2, aomw.b());
                                            } catch (aoob unused) {
                                                zga.b("Could not parse persisted ThemeSetEntity");
                                                aesVar.c(aqzgVar2);
                                            }
                                            avfb avfbVar = jnmVar2.e;
                                            if (avfbVar != null) {
                                                jnmVar2.d = new String[Collections.unmodifiableMap(avfbVar.d).size()];
                                                Collections.unmodifiableMap(jnmVar2.e.d).values().toArray(jnmVar2.d);
                                                final String str = jnmVar2.e.c;
                                                final Runnable runnable2 = new Runnable() { // from class: jnl
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        aes.this.c(aqzgVar2);
                                                    }
                                                };
                                                final int i = 1;
                                                final int i2 = 0;
                                                jnmVar2.a.put(str, jnmVar2.b.a("Egl0aGVtZS1zZXQgSygB").ab(azre.b(jnmVar2.c)).L(iub.i).i(aypg.LATEST).A(jif.h).A(jif.i).p(new aiin(aesVar, 1)).X(new ayrs() { // from class: jnk
                                                    @Override // defpackage.ayrs
                                                    public final void a(Object obj2) {
                                                        if (i2 == 0) {
                                                            jnm jnmVar3 = jnmVar2;
                                                            String str2 = str;
                                                            Runnable runnable3 = runnable2;
                                                            if (((avfb) obj2).c.equals(str2)) {
                                                                jnmVar3.b(str2, runnable3);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        jnmVar2.b(str, runnable2);
                                                    }
                                                }));
                                                String[] strArr = jnmVar2.d;
                                                int length = strArr.length;
                                                while (i2 < length) {
                                                    final String str2 = strArr[i2];
                                                    jnmVar2.a.put(str2, jnmVar2.b.a(str2).ab(azre.b(jnmVar2.c)).L(iub.i).ax(new ayrs() { // from class: jnk
                                                        @Override // defpackage.ayrs
                                                        public final void a(Object obj2) {
                                                            if (i == 0) {
                                                                jnm jnmVar3 = jnmVar2;
                                                                String str22 = str2;
                                                                Runnable runnable3 = runnable2;
                                                                if (((avfb) obj2).c.equals(str22)) {
                                                                    jnmVar3.b(str22, runnable3);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            jnmVar2.b(str2, runnable2);
                                                        }
                                                    }));
                                                    i2++;
                                                }
                                            }
                                        }
                                    }
                                }
                                return null;
                            }
                        }), 1), jnmVar.c);
                    }
                }, this.b);
            }
            anhyVar = this.g;
        }
        return anhyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(zfi zfiVar) {
        try {
            ammv.j((aqzg) a().get(5000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            e = e;
            zfiVar.a(e);
        } catch (ExecutionException e2) {
            e = e2;
            zfiVar.a(e);
        } catch (TimeoutException e3) {
            this.c.a(amlr.a);
            zfiVar.a(e3);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afto.class};
        }
        if (i == 0) {
            this.b.execute(new Runnable() { // from class: jno
                @Override // java.lang.Runnable
                public final void run() {
                    jnr jnrVar = jnr.this;
                    synchronized (jnrVar.f) {
                        anhy anhyVar = jnrVar.g;
                        if (anhyVar != null) {
                            anhyVar.cancel(false);
                        }
                        jnrVar.g = null;
                    }
                }
            });
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
