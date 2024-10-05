package defpackage;

import java.util.concurrent.TimeUnit;
import youtube.client.blocks.runtime.java.NativeBindingRouter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class basg extends barx {
    public final basf a;

    public basg(basf basfVar) {
        this.a = basfVar;
    }

    @Override // defpackage.barx
    public final anhy a(int i, byte[] bArr) {
        if (i == 879513754) {
            awmh awmhVar = (awmh) aonm.parseFrom(awmh.a, bArr);
            basf basfVar = this.a;
            aoms aomsVar = awmhVar.b;
            if (aomsVar == null) {
                aomsVar = aoms.a;
            }
            return anfq.i(basfVar.c.schedule(gip.p, aoqx.a(aomsVar), TimeUnit.MILLISECONDS), ufj.s, angq.a);
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("No method found with identifier: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.barx
    public final void b(int i, byte[] bArr) {
        if (i == -1743061909) {
            awmd awmdVar = (awmd) aonm.parseFrom(awmd.a, bArr);
            final byte[] bArr2 = null;
            final ammr ammrVar = new ammr(awmdVar.c, (short[]) null);
            basf basfVar = this.a;
            aoms aomsVar = ((awmk) aonm.parseFrom(awmk.a, awmdVar.d)).b;
            if (aomsVar == null) {
                aomsVar = aoms.a;
            }
            long a = aoqx.a(aomsVar);
            amkq.a(new Runnable(bArr2) { // from class: ylw
                @Override // java.lang.Runnable
                public final void run() {
                    ammr ammrVar2 = ammr.this;
                    try {
                        awml awmlVar = awml.a;
                        NativeBindingRouter nativeBindingRouter = NativeBindingRouter.a;
                        String str = ammrVar2.b;
                        aomf byteString = awmlVar.toByteString();
                        try {
                            aong aongVar = (aong) awkg.a.createBuilder();
                            aone createBuilder = awly.a.createBuilder();
                            createBuilder.copyOnWrite();
                            awly awlyVar = (awly) createBuilder.instance;
                            str.getClass();
                            awlyVar.b |= 1;
                            awlyVar.c = str;
                            createBuilder.copyOnWrite();
                            awly awlyVar2 = (awly) createBuilder.instance;
                            awlyVar2.b |= 2;
                            awlyVar2.d = byteString;
                            aongVar.copyOnWrite();
                            awkg awkgVar = (awkg) aongVar.instance;
                            awly awlyVar3 = (awly) createBuilder.build();
                            awlyVar3.getClass();
                            awkgVar.c = awlyVar3;
                            awkgVar.b = 11;
                            boolean z = ((awlz) aonm.parseFrom(awlz.a, nativeBindingRouter.nativeCallSyncBinding(((awkg) aongVar.build()).toByteArray()), aomw.b())).b;
                        } catch (aoob e) {
                            throw new bars(e);
                        }
                    } catch (aoob e2) {
                        throw new IllegalStateException(e2);
                    }
                }
            }, a, a, TimeUnit.MILLISECONDS, basfVar.d, basfVar.c);
            return;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("No method found with identifier: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.barx
    public final void c() {
    }

    @Override // defpackage.barx
    public final byte[] d(int i, byte[] bArr) {
        StringBuilder sb = new StringBuilder(44);
        sb.append("No method found with identifier: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.barx
    public final void e(int i) {
        StringBuilder sb = new StringBuilder(44);
        sb.append("No method found with identifier: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.barx
    public final anhy f(int i) {
        StringBuilder sb = new StringBuilder(44);
        sb.append("No method found with identifier: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
