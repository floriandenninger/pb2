package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class rqt extends rqm {
    private final rqw c;

    private rqt() {
        throw new IllegalStateException("Default constructor called");
    }

    @Override // defpackage.rqm
    public final SparseArray a(rqo rqoVar) {
        Barcode[] barcodeArr;
        FrameMetadataParcel frameMetadataParcel = new FrameMetadataParcel();
        rqn rqnVar = rqoVar.a;
        frameMetadataParcel.a = rqnVar.a;
        frameMetadataParcel.b = rqnVar.b;
        frameMetadataParcel.e = rqnVar.e;
        frameMetadataParcel.c = rqnVar.c;
        frameMetadataParcel.d = rqnVar.d;
        ByteBuffer byteBuffer = rqoVar.b;
        rqw rqwVar = this.c;
        qip.an(byteBuffer);
        if (rqwVar.b()) {
            try {
                qvf a = qve.a(byteBuffer);
                Object a2 = rqwVar.a();
                qip.an(a2);
                Parcel pn = ((ecp) a2).pn();
                ecr.i(pn, a);
                ecr.g(pn, frameMetadataParcel);
                Parcel po = ((ecp) a2).po(1, pn);
                Barcode[] barcodeArr2 = (Barcode[]) po.createTypedArray(Barcode.CREATOR);
                po.recycle();
                barcodeArr = barcodeArr2;
            } catch (RemoteException e) {
                Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
                barcodeArr = new Barcode[0];
            }
        } else {
            barcodeArr = new Barcode[0];
        }
        SparseArray sparseArray = new SparseArray(barcodeArr.length);
        for (Barcode barcode : barcodeArr) {
            sparseArray.append(barcode.b.hashCode(), barcode);
        }
        return sparseArray;
    }

    @Override // defpackage.rqm
    public final void b() {
        synchronized (this.a) {
            rqq rqqVar = this.b;
            if (rqqVar != null) {
                rqqVar.a();
                this.b = null;
            }
        }
        rqw rqwVar = this.c;
        synchronized (rqwVar.a) {
            if (rqwVar.c == null) {
                return;
            }
            try {
                if (rqwVar.b()) {
                    Object a = rqwVar.a();
                    qip.an(a);
                    ((ecp) a).pp(3, ((ecp) a).pn());
                }
            } catch (RemoteException e) {
                Log.e(rqwVar.b, "Could not finalize native handle", e);
            }
        }
    }

    @Override // defpackage.rqm
    public final boolean c() {
        return this.c.b();
    }

    public rqt(rqw rqwVar) {
        this.c = rqwVar;
    }
}
