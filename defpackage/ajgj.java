package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.JSControllerInitializationMode;
import com.google.android.libraries.youtube.blocks.BlocksRuntimeProxy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ajgj {
    public static final /* synthetic */ int a = 0;

    static {
        int i = ajgk.a;
    }

    public static float a(ajhe ajheVar) {
        return ajheVar.f60J;
    }

    public static int b(ajhe ajheVar) {
        return ajheVar.E;
    }

    public static syd c(sye syeVar) {
        return new ajdr(syeVar);
    }

    public static ajhe d(ajgq ajgqVar) {
        return ajgqVar.a();
    }

    public static ammv e() {
        return ammv.i(BlocksRuntimeProxy.createContainerLoader());
    }

    public static ammy f(final aaea aaeaVar) {
        return new ammy() { // from class: ajgi
            @Override // defpackage.ammy
            public final boolean a(Object obj) {
                aaea aaeaVar2 = aaea.this;
                Integer num = (Integer) obj;
                int i = ajgj.a;
                aswb aswbVar = aaeaVar2.a().e;
                if (aswbVar == null) {
                    aswbVar = aswb.a;
                }
                return aswbVar.aW.contains(num);
            }
        };
    }

    public static boolean g(ajhe ajheVar) {
        return ajheVar.L;
    }

    public static boolean h(ajhe ajheVar) {
        return ajheVar.G;
    }

    public static boolean i(ajhe ajheVar) {
        return ajheVar.M;
    }

    public static boolean j(ajhe ajheVar) {
        return ajheVar.x;
    }

    public static boolean k(ajhe ajheVar) {
        return ajheVar.n;
    }

    public static boolean l(ajhe ajheVar) {
        return ajheVar.A;
    }

    public static boolean m(ajhe ajheVar) {
        return ajheVar.s;
    }

    public static boolean n(ajhe ajheVar) {
        return ajheVar.D;
    }

    public static boolean o(ajhe ajheVar) {
        return ajheVar.d == 2;
    }

    public static boolean p(ajhe ajheVar) {
        return ajheVar.m;
    }

    public static amml q(final aadw aadwVar) {
        return new amml() { // from class: ajgh
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                aadw aadwVar2 = aadw.this;
                Integer num = (Integer) obj;
                int i = ajgj.a;
                aulu auluVar = aadwVar2.b().l;
                if (auluVar == null) {
                    auluVar = aulu.a;
                }
                aulr aulrVar = auluVar.H;
                if (aulrVar == null) {
                    aulrVar = aulr.a;
                }
                for (auls aulsVar : aulrVar.b) {
                    if (aulsVar.b == num.intValue()) {
                        awny awnyVar = aulsVar.c;
                        return awnyVar == null ? awny.a : awnyVar;
                    }
                }
                return null;
            }
        };
    }

    public static boolean r(aadw aadwVar) {
        aulu auluVar = aadwVar.b().l;
        if (auluVar == null) {
            auluVar = aulu.a;
        }
        return auluVar.w;
    }

    public static boolean s(aadw aadwVar) {
        aulu auluVar = aadwVar.b().l;
        if (auluVar == null) {
            auluVar = aulu.a;
        }
        return auluVar.x;
    }

    public static boolean t(aadw aadwVar) {
        aulu auluVar = aadwVar.b().l;
        if (auluVar == null) {
            auluVar = aulu.a;
        }
        return auluVar.A;
    }

    public static szc u(sxd sxdVar, Context context, String str) {
        return new svz(sxdVar, str, context);
    }

    public static boolean v(aadw aadwVar) {
        aulu auluVar = aadwVar.b().l;
        if (auluVar == null) {
            auluVar = aulu.a;
        }
        return auluVar.l;
    }

    public static String w() {
        String str = awur.a.b;
        return str.isEmpty() ? "10.0.2.2" : str;
    }

    public static ajkn x(axpg axpgVar) {
        return new ajkn(axpgVar, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static sng y(aadw aadwVar, axzf axzfVar) {
        Boolean bool;
        Boolean bool2;
        JSControllerInitializationMode jSControllerInitializationMode = JSControllerInitializationMode.DEFAULT;
        aulu auluVar = aadwVar.b().l;
        if (auluVar == null) {
            auluVar = aulu.a;
        }
        String str = auluVar.m;
        if ("default".equals(str)) {
            jSControllerInitializationMode = JSControllerInitializationMode.DEFAULT;
        } else if ("eager_context_initialization".equals(str)) {
            jSControllerInitializationMode = JSControllerInitializationMode.EAGER_CONTEXT_INITIALIZATION;
        } else if ("eager_module_loading".equals(str)) {
            jSControllerInitializationMode = JSControllerInitializationMode.EAGER_MODULE_LOADING;
        }
        snf snfVar = new snf();
        snfVar.b(JSControllerInitializationMode.DEFAULT);
        snfVar.a(false);
        snfVar.d(5);
        snfVar.c(false);
        snfVar.b(jSControllerInitializationMode);
        aqvj aqvjVar = axzfVar.a.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45359737L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45359737L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45359737L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        snfVar.c(bool.booleanValue());
        aulu auluVar2 = aadwVar.b().l;
        if (auluVar2 == null) {
            auluVar2 = aulu.a;
        }
        if ((auluVar2.e & 1024) != 0) {
            aulu auluVar3 = aadwVar.b().l;
            if (auluVar3 == null) {
                auluVar3 = aulu.a;
            }
            snfVar.a(auluVar3.I);
        }
        aulu auluVar4 = aadwVar.b().l;
        if (auluVar4 == null) {
            auluVar4 = aulu.a;
        }
        if ((auluVar4.e & 2048) != 0) {
            aulu auluVar5 = aadwVar.b().l;
            if (auluVar5 == null) {
                auluVar5 = aulu.a;
            }
            snfVar.d(auluVar5.f125J);
        }
        JSControllerInitializationMode jSControllerInitializationMode2 = snfVar.a;
        if (jSControllerInitializationMode2 == null || (bool2 = snfVar.b) == null || snfVar.c == null || snfVar.d == null) {
            StringBuilder sb = new StringBuilder();
            if (snfVar.a == null) {
                sb.append(" initializationMode");
            }
            if (snfVar.b == null) {
                sb.append(" enableVmContextLru");
            }
            if (snfVar.c == null) {
                sb.append(" vmContextLruSize");
            }
            if (snfVar.d == null) {
                sb.append(" shouldLockVmIsolate");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new sng(jSControllerInitializationMode2, bool2.booleanValue(), snfVar.c.intValue(), snfVar.d.booleanValue());
    }

    public static aoae z() {
        return new aoae((byte[]) null, (char[]) null);
    }
}
