package defpackage;

import com.google.android.libraries.youtube.net.retries.NetworkRetryControllerProdContainerRegistrar;
import j$.util.Optional;
import j$.util.function.Supplier;
import youtube.client.blocks.runtime.java.NativeBindingRouter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afwc implements afwa {
    public final Object a = new Object();
    public barv b;

    public afwc(ajoy ajoyVar, NetworkRetryControllerProdContainerRegistrar networkRetryControllerProdContainerRegistrar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        networkRetryControllerProdContainerRegistrar.a.get();
        this.b = null;
        final ghx ghxVar = new ghx(14);
        ((aagh) ajoyVar.a.get()).b().Y(new ayrv() { // from class: xmy
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                return Supplier.this;
            }
        }).ax(new ayrs() { // from class: afwb
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                afwc afwcVar = afwc.this;
                Supplier supplier = (Supplier) obj;
                synchronized (afwcVar.a) {
                    barv barvVar = afwcVar.b;
                    if (barvVar != null) {
                        synchronized (barvVar.d) {
                            int i = barvVar.e;
                            int i2 = i - 1;
                            if (i == 0) {
                                throw null;
                            }
                            if (i2 == 0) {
                                barvVar.e = 3;
                            } else {
                                if (i2 == 1) {
                                    throw new IllegalStateException("This client has been moved and cannot be used.");
                                }
                                if (i2 == 2) {
                                    throw new IllegalStateException("This client has been released and cannot be used.");
                                }
                            }
                        }
                        NativeBindingRouter nativeBindingRouter = barvVar.a;
                        String str = barvVar.b;
                        aong aongVar = (aong) awkg.a.createBuilder();
                        aone createBuilder = awlt.a.createBuilder();
                        createBuilder.copyOnWrite();
                        awlt awltVar = (awlt) createBuilder.instance;
                        awltVar.b |= 1;
                        awltVar.c = str;
                        aongVar.copyOnWrite();
                        awkg awkgVar = (awkg) aongVar.instance;
                        awlt awltVar2 = (awlt) createBuilder.build();
                        awltVar2.getClass();
                        awkgVar.c = awltVar2;
                        awkgVar.b = 3;
                        nativeBindingRouter.nativeCallSyncBinding(((awkg) aongVar.build()).toByteArray());
                    }
                    bart bartVar = (bart) supplier.get();
                    NativeBindingRouter nativeBindingRouter2 = bartVar.b;
                    String str2 = bartVar.a;
                    Optional empty = Optional.empty();
                    try {
                        aone createBuilder2 = awla.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        awla awlaVar = (awla) createBuilder2.instance;
                        awlaVar.b |= 4;
                        awlaVar.e = 382339480;
                        createBuilder2.copyOnWrite();
                        awla awlaVar2 = (awla) createBuilder2.instance;
                        str2.getClass();
                        awlaVar2.b = 2 | awlaVar2.b;
                        awlaVar2.d = str2;
                        if (empty.isPresent()) {
                            String str3 = (String) empty.get();
                            createBuilder2.copyOnWrite();
                            awla awlaVar3 = (awla) createBuilder2.instance;
                            awlaVar3.b |= 1;
                            awlaVar3.c = str3;
                        }
                        aong aongVar2 = (aong) awkg.a.createBuilder();
                        aongVar2.copyOnWrite();
                        awkg awkgVar2 = (awkg) aongVar2.instance;
                        awla awlaVar4 = (awla) createBuilder2.build();
                        awlaVar4.getClass();
                        awkgVar2.c = awlaVar4;
                        awkgVar2.b = 1;
                        awlb awlbVar = (awlb) aonm.parseFrom(awlb.a, nativeBindingRouter2.nativeCallSyncBinding(((awkg) aongVar2.build()).toByteArray()), aomw.b());
                        barw barwVar = new barw(awlbVar.c, awlbVar.b);
                        NativeBindingRouter nativeBindingRouter3 = bartVar.b;
                        String str4 = barwVar.a;
                        String str5 = barwVar.b;
                        String str6 = bartVar.a;
                        afwcVar.b = new barv(nativeBindingRouter3, str4, str5);
                    } catch (aoob e) {
                        throw new bars(e);
                    }
                }
            }
        });
    }

    @Override // defpackage.afwa
    public final barv a() {
        barv barvVar;
        synchronized (this.a) {
            barvVar = this.b;
            if (barvVar == null) {
                throw new IllegalStateException("Datapush failed to provide a block");
            }
        }
        return barvVar;
    }
}
