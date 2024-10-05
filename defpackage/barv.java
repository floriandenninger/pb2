package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import youtube.client.blocks.runtime.java.JavaRuntime;
import youtube.client.blocks.runtime.java.NativeBindingRouter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class barv {
    public final NativeBindingRouter a;
    public final String b;
    public final String c;
    public int e = 1;
    public final Object d = new Object();

    public barv(NativeBindingRouter nativeBindingRouter, String str, String str2) {
        this.a = nativeBindingRouter;
        this.b = str;
        this.c = str2;
    }

    public final anhy a(int i, aooy aooyVar, final aopf aopfVar) {
        NativeBindingRouter nativeBindingRouter = this.a;
        String str = this.c;
        aomf byteString = aooyVar.toByteString();
        SettableFuture f = SettableFuture.f();
        aong aongVar = (aong) awkf.a.createBuilder();
        aone createBuilder = awkh.a.createBuilder();
        createBuilder.copyOnWrite();
        awkh awkhVar = (awkh) createBuilder.instance;
        awkhVar.b |= 2;
        awkhVar.c = str;
        createBuilder.copyOnWrite();
        awkh awkhVar2 = (awkh) createBuilder.instance;
        awkhVar2.b |= 4;
        awkhVar2.d = i;
        createBuilder.copyOnWrite();
        awkh awkhVar3 = (awkh) createBuilder.instance;
        byteString.getClass();
        awkhVar3.b |= 8;
        awkhVar3.e = byteString;
        aongVar.copyOnWrite();
        awkf awkfVar = (awkf) aongVar.instance;
        awkh awkhVar4 = (awkh) createBuilder.build();
        awkhVar4.getClass();
        awkfVar.c = awkhVar4;
        awkfVar.b = 2;
        nativeBindingRouter.nativeCallAsyncBinding(((awkf) aongVar.build()).toByteArray(), f);
        return anfq.i(anfq.i(f, ufj.r, angq.a), new anfz() { // from class: baru
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                return anaf.O(aopf.this.j((byte[]) obj));
            }
        }, angq.a);
    }

    public final void c() {
        barx a = JavaRuntime.a.a(this.c);
        if (a instanceof basj) {
            aype aypeVar = ((basj) a).a;
        }
    }

    public final void b() {
        synchronized (this.d) {
            int i = this.e;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    throw new IllegalStateException("This client has been moved and cannot be used.");
                }
                if (i2 == 2) {
                    throw new IllegalStateException("This client has been released and cannot be used.");
                }
            }
        }
    }
}
