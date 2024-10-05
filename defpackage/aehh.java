package defpackage;

import com.google.android.libraries.youtube.media.player.scripted.jni.NativeSupport;
import j$.util.function.Function;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aehh implements affm {
    public final affp a;
    private final afix b;
    private final afeu c;
    private final Function d;

    public aehh(afix afixVar, afeu afeuVar, Function function, affp affpVar) {
        this.b = afixVar;
        this.c = afeuVar;
        this.d = function;
        this.a = affpVar;
    }

    @Override // defpackage.affm
    public final aegi a(aegh aeghVar) {
        aehc aehcVar = (aehc) this.d.apply(aeghVar.b);
        afix afixVar = this.b;
        afeu afeuVar = this.c;
        afiv a = afiw.a(aehcVar.b);
        a.a = aeghVar.b;
        a.g = ammv.j(aeghVar.c);
        a.h = aehcVar.a;
        a.d = aehcVar.c;
        byte[] nativeRetainObjectReference = NativeSupport.nativeRetainObjectReference(new aehj(afixVar, afeuVar, a.a(), Executors.newFixedThreadPool(12), new Function() { // from class: aehg
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                affp affpVar = aehh.this.a;
                String str = ((aehk) obj).g;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
                sb.append("new NetworkClientCallbackNativeHandler(");
                sb.append(str);
                sb.append(")");
                afjh a2 = affpVar.a(sb.toString().getBytes());
                if (a2 == null) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25);
                    sb2.append("Instance \"");
                    sb2.append(str);
                    sb2.append("\" is not valid.");
                    throw new IllegalArgumentException(sb2.toString());
                }
                return new affl(a2, null);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }));
        aone createBuilder = aegi.a.createBuilder();
        aomf x = aomf.x(nativeRetainObjectReference);
        createBuilder.copyOnWrite();
        aegi aegiVar = (aegi) createBuilder.instance;
        aegiVar.b |= 1;
        aegiVar.c = x;
        return (aegi) createBuilder.build();
    }

    @Override // defpackage.affm
    public final aehe b(aehd aehdVar) {
        NativeSupport.nativeReleaseObjectReference(aehdVar.b.I());
        return aehe.a;
    }
}
