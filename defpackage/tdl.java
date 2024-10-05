package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
import com.google.lens.sdk.PendingIntentConsumer;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tdl extends edf implements ServiceConnection, tdf {
    public final Executor a;
    public final Context b;
    public final tde c;
    public int d;
    public int e;
    public edo f;
    public edn g;
    public int h;
    public edd i;
    public ede j;
    private final Executor k;
    private final tda l;

    public tdl(Context context, tde tdeVar, tda tdaVar) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(pkr.c);
        this.a = new ruj(new Handler(Looper.getMainLooper()), 2);
        this.d = 1;
        this.h = 1;
        this.b = context;
        this.c = tdeVar;
        this.l = tdaVar;
        this.k = newSingleThreadExecutor;
    }

    private static boolean n(int i) {
        return i == 6 || i == 7 || i == 8;
    }

    private static boolean o(int i) {
        return i == 5;
    }

    @Override // defpackage.edg
    public final void a(final byte[] bArr, final SystemParcelableWrapper systemParcelableWrapper) {
        this.a.execute(new Runnable() { // from class: tdk
            @Override // java.lang.Runnable
            public final void run() {
                tdl tdlVar = tdl.this;
                byte[] bArr2 = bArr;
                SystemParcelableWrapper systemParcelableWrapper2 = systemParcelableWrapper;
                int i = tdlVar.d;
                if (i == 4 || i == 5) {
                    try {
                        eds edsVar = (eds) aonm.parseFrom(eds.a, bArr2, aomw.b());
                        int e = esv.e(edsVar.b);
                        if (e != 0 && e == 240) {
                            edp edpVar = (edp) edsVar.pX(edl.a);
                            tdlVar.e = edpVar.b;
                            edo edoVar = edpVar.c;
                            if (edoVar == null) {
                                edoVar = edo.a;
                            }
                            tdlVar.f = edoVar;
                            edn ednVar = edpVar.d;
                            if (ednVar == null) {
                                ednVar = edn.a;
                            }
                            tdlVar.g = ednVar;
                            int i2 = edpVar.e;
                            tdlVar.h = 2;
                            tdlVar.i(5);
                            return;
                        }
                        int e2 = esv.e(edsVar.b);
                        if (e2 != 0 && e2 == 310) {
                            ((Bundle) systemParcelableWrapper2.a).getLong("session_id");
                            return;
                        }
                        tde tdeVar = tdlVar.c;
                        int e3 = esv.e(edsVar.b);
                        if (e3 != 0 && e3 == 268) {
                            Parcelable parcelable = systemParcelableWrapper2.a;
                            if (parcelable instanceof PendingIntent) {
                                PendingIntent pendingIntent = (PendingIntent) parcelable;
                                ((tdd) tdeVar).a.d();
                                PendingIntentConsumer pendingIntentConsumer = ((tdd) tdeVar).b;
                                if (pendingIntentConsumer != null) {
                                    pendingIntentConsumer.onReceivedPendingIntent(pendingIntent);
                                    return;
                                } else {
                                    Log.e("LensServiceBridge", "PendingIntentConsumer cannot be null");
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } catch (aoob e4) {
                        Log.e("LensServiceConnImpl", "Unable to parse the protobuf.", e4);
                        tdlVar.h = 11;
                        tdlVar.i(8);
                        return;
                    }
                }
                Log.w("LensServiceConnImpl", "ServiceEvent received after connection disposed.");
            }
        });
    }

    @Override // defpackage.tdf
    public final int b() {
        rwh.U();
        rwh.V(l(), "Attempted to use lensServiceSession before ready.");
        return this.e;
    }

    @Override // defpackage.tdf
    public final void c(byte[] bArr, SystemParcelableWrapper systemParcelableWrapper) {
        rwh.U();
        rwh.V(f(), "Attempted to use lensServiceSession before ready.");
        ede edeVar = this.j;
        rwh.W(edeVar);
        Parcel pn = edeVar.pn();
        pn.writeByteArray(bArr);
        ecr.g(pn, systemParcelableWrapper);
        edeVar.pq(2, pn);
    }

    @Override // defpackage.tdf
    public final void d() {
        rwh.U();
        rwh.V(f(), "Attempted to handover when not ready.");
        aong aongVar = (aong) edi.a.createBuilder();
        aongVar.copyOnWrite();
        edi ediVar = (edi) aongVar.instance;
        ediVar.c = 99;
        ediVar.b |= 1;
        aonk aonkVar = edq.a;
        aone createBuilder = edr.a.createBuilder();
        createBuilder.copyOnWrite();
        edr edrVar = (edr) createBuilder.instance;
        edrVar.b |= 1;
        edrVar.c = true;
        aongVar.e(aonkVar, (edr) createBuilder.build());
        edi ediVar2 = (edi) aongVar.build();
        try {
            ede edeVar = this.j;
            rwh.W(edeVar);
            edeVar.a(ediVar2.toByteArray());
        } catch (RemoteException | SecurityException e) {
            Log.e("LensServiceConnImpl", "Unable to stop Lens service session.", e);
        }
        this.h = 12;
        i(8);
    }

    @Override // defpackage.tdf
    public final boolean e() {
        rwh.U();
        return n(this.d);
    }

    @Override // defpackage.tdf
    public final boolean f() {
        rwh.U();
        return o(this.d);
    }

    @Override // defpackage.tdf
    public final int g() {
        rwh.U();
        boolean z = true;
        if (!f() && !e()) {
            z = false;
        }
        rwh.V(z, "Attempted to use ServerFlags before ready or dead.");
        return this.h;
    }

    public final void h() {
        rwh.U();
        if (this.j == null) {
            this.h = 11;
            i(7);
        } else {
            this.h = 11;
            i(8);
        }
    }

    public final void i(int i) {
        rwh.U();
        String.format("Transitioning from state %s to %s.", Integer.valueOf(this.d), Integer.valueOf(i));
        int i2 = this.d;
        this.d = i;
        if (o(i) && !o(i2)) {
            tde tdeVar = this.c;
            rwh.U();
            ((tdd) tdeVar).b();
        }
        if (!n(i) || n(i2)) {
            return;
        }
        tde tdeVar2 = this.c;
        rwh.U();
        ((tdd) tdeVar2).b();
    }

    public final boolean j() {
        return this.d == 2;
    }

    public final boolean k() {
        int i = this.d;
        return i == 3 || i == 4 || i == 5 || i == 7 || i == 8;
    }

    public final boolean l() {
        int i = this.d;
        return i == 5 || i == 8;
    }

    public final void m() {
        rwh.U();
        if (j() || k()) {
            return;
        }
        i(2);
        this.l.a(new tcx() { // from class: tdg
            @Override // defpackage.tcx
            public final void a(tdm tdmVar) {
                tdl tdlVar = tdl.this;
                int T = rwh.T(tdmVar.e);
                if (T == 0 || T != 2) {
                    int T2 = rwh.T(tdmVar.e);
                    if (T2 == 0) {
                        T2 = 1;
                    }
                    tdlVar.h = T2;
                    tdlVar.i(6);
                    return;
                }
                Intent intent = new Intent("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
                intent.setPackage("com.google.android.googlequicksearchbox");
                try {
                    if (!tdlVar.b.bindService(intent, tdlVar, 65)) {
                        Log.e("LensServiceConnImpl", "Unable to bind Lens service.");
                        tdlVar.h = 11;
                        tdlVar.i(7);
                        return;
                    }
                    tdlVar.i(3);
                } catch (SecurityException e) {
                    Log.e("LensServiceConnImpl", "Unable to bind Lens service due to security exception.", e);
                    tdlVar.h = 11;
                    tdlVar.i(7);
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        final edd eddVar;
        rwh.U();
        if (iBinder == null) {
            eddVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
            if (queryLocalInterface instanceof edd) {
                eddVar = (edd) queryLocalInterface;
            } else {
                eddVar = new edd(iBinder);
            }
        }
        this.i = eddVar;
        this.k.execute(new Runnable() { // from class: tdi
            @Override // java.lang.Runnable
            public final void run() {
                final tdl tdlVar = tdl.this;
                edd eddVar2 = eddVar;
                try {
                    Parcel pn = eddVar2.pn();
                    pn.writeString("LENS_SERVICE_SESSION");
                    ecr.i(pn, tdlVar);
                    final ede edeVar = null;
                    pn.writeByteArray(null);
                    Parcel po = eddVar2.po(1, pn);
                    IBinder readStrongBinder = po.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
                        if (queryLocalInterface2 instanceof ede) {
                            edeVar = (ede) queryLocalInterface2;
                        } else {
                            edeVar = new ede(readStrongBinder);
                        }
                    }
                    po.recycle();
                    tdlVar.a.execute(new Runnable() { // from class: tdj
                        @Override // java.lang.Runnable
                        public final void run() {
                            tdl tdlVar2 = tdl.this;
                            ede edeVar2 = edeVar;
                            rwh.U();
                            if (tdlVar2.i == null) {
                                Log.w("LensServiceConnImpl", "The service is no longer bound.");
                                tdlVar2.h();
                                return;
                            }
                            try {
                                tdlVar2.j = edeVar2;
                                if (tdlVar2.j == null) {
                                    Log.e("LensServiceConnImpl", "Failed to create a Lens service session.");
                                    tdlVar2.h = 11;
                                    tdlVar2.i(7);
                                    return;
                                }
                                tdlVar2.i(4);
                                aong aongVar = (aong) edi.a.createBuilder();
                                aongVar.copyOnWrite();
                                edi ediVar = (edi) aongVar.instance;
                                ediVar.c = 98;
                                ediVar.b |= 1;
                                edi ediVar2 = (edi) aongVar.build();
                                aong aongVar2 = (aong) edi.a.createBuilder();
                                aongVar2.copyOnWrite();
                                edi ediVar3 = (edi) aongVar2.instance;
                                ediVar3.c = 348;
                                ediVar3.b |= 1;
                                aonk aonkVar = edj.a;
                                aone createBuilder = edk.a.createBuilder();
                                createBuilder.copyOnWrite();
                                edk edkVar = (edk) createBuilder.instance;
                                edkVar.b |= 1;
                                edkVar.c = 2;
                                aongVar2.e(aonkVar, (edk) createBuilder.build());
                                edi ediVar4 = (edi) aongVar2.build();
                                ede edeVar3 = tdlVar2.j;
                                rwh.W(edeVar3);
                                edeVar3.a(ediVar2.toByteArray());
                                ede edeVar4 = tdlVar2.j;
                                rwh.W(edeVar4);
                                edeVar4.a(ediVar4.toByteArray());
                            } catch (RemoteException e) {
                                Log.w("LensServiceConnImpl", "Failed to call client event callbacks.", e);
                                tdlVar2.h();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    Log.w("LensServiceConnImpl", "Failed to create a Lens service session.", e);
                    tdlVar.a.execute(new Runnable() { // from class: tdh
                        @Override // java.lang.Runnable
                        public final void run() {
                            tdl.this.h();
                        }
                    });
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        rwh.U();
        this.h = 11;
        i(7);
    }
}
