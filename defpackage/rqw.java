package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rqw {
    public Object c;
    private final Context d;
    private final BarcodeDetectorOptions i;
    public final Object a = new Object();
    private boolean g = false;
    private boolean h = false;
    public final String b = "BarcodeNativeHandle";
    private final String e = "com.google.android.gms.vision.dynamite.barcode";
    private final String f = "barcode";

    public rqw(Context context, BarcodeDetectorOptions barcodeDetectorOptions) {
        this.d = context;
        this.i = barcodeDetectorOptions;
        a();
    }

    public final Object a() {
        qvu qvuVar;
        rqv rqvVar;
        synchronized (this.a) {
            Object obj = this.c;
            if (obj != null) {
                return obj;
            }
            rqu rquVar = null;
            try {
                qvuVar = qvu.e(this.d, qvu.c, this.e);
            } catch (qvq unused) {
                String format = String.format("%s.%s", "com.google.android.gms.vision", this.f);
                try {
                    qvuVar = qvu.e(this.d, qvu.a, format);
                } catch (qvq e) {
                    Object[] objArr = {format};
                    if (Log.isLoggable("Vision", 6)) {
                        String format2 = String.format("Error loading optional module %s", objArr);
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(format2).length() + 2 + String.valueOf(valueOf).length());
                        sb.append(format2);
                        sb.append(": ");
                        sb.append(valueOf);
                        Log.e("Vision", sb.toString());
                    }
                    if (!this.g) {
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", "barcode");
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.d.sendBroadcast(intent);
                        this.g = true;
                    }
                    qvuVar = null;
                }
            }
            if (qvuVar != null) {
                try {
                    Context context = this.d;
                    IBinder d = qvuVar.d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                    if (d == null) {
                        rqvVar = null;
                    } else {
                        IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                        if (queryLocalInterface instanceof rqv) {
                            rqvVar = (rqv) queryLocalInterface;
                        } else {
                            rqvVar = new rqv(d);
                        }
                    }
                    if (rqvVar != null) {
                        qvf a = qve.a(context);
                        BarcodeDetectorOptions barcodeDetectorOptions = this.i;
                        Parcel pn = rqvVar.pn();
                        ecr.i(pn, a);
                        ecr.g(pn, barcodeDetectorOptions);
                        Parcel po = rqvVar.po(1, pn);
                        IBinder readStrongBinder = po.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                            if (queryLocalInterface2 instanceof rqu) {
                                rquVar = (rqu) queryLocalInterface2;
                            } else {
                                rquVar = new rqu(readStrongBinder);
                            }
                        }
                        po.recycle();
                    }
                    this.c = rquVar;
                } catch (RemoteException | qvq e2) {
                    Log.e(this.b, "Error creating remote native handle", e2);
                }
            }
            if (this.h) {
                if (this.c != null) {
                    Log.w(this.b, "Native handle is now available.");
                }
            } else if (this.c == null) {
                Log.w(this.b, "Native handle not yet available. Reverting to no-op handle.");
                this.h = true;
            }
            return this.c;
        }
    }

    public final boolean b() {
        return a() != null;
    }
}
