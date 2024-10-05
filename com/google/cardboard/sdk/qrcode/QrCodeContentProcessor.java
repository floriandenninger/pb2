package com.google.cardboard.sdk.qrcode;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.cardboard.sdk.R;
import com.google.cardboard.sdk.qrcode.CardboardParamsUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class QrCodeContentProcessor {
    private static final String TAG = "QrCodeContentProcessor";
    public static final /* synthetic */ int a = 0;
    private final Listener listener;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface Listener {
        void onQrCodeSaved(boolean z);
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class ProcessAndSaveQrCodeTask extends AsyncTask {
        private final Context context;

        public ProcessAndSaveQrCodeTask(Context context) {
            this.context = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public CardboardParamsUtils.UriToParamsStatus doInBackground(Barcode... barcodeArr) {
            return QrCodeContentProcessor.getParamsFromQrCode(barcodeArr[0], new UrlFactory());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(CardboardParamsUtils.UriToParamsStatus uriToParamsStatus) {
            super.onPostExecute((ProcessAndSaveQrCodeTask) uriToParamsStatus);
            int i = uriToParamsStatus.statusCode;
            boolean z = false;
            if (i == 1) {
                int i2 = QrCodeContentProcessor.a;
                String.valueOf(R.string.invalid_qr_code);
                Toast.makeText(this.context, R.string.invalid_qr_code, 1).show();
            } else if (i == 2) {
                int i3 = QrCodeContentProcessor.a;
                String.valueOf(R.string.connection_error);
                Toast.makeText(this.context, R.string.connection_error, 1).show();
            } else {
                byte[] bArr = uriToParamsStatus.params;
                if (bArr != null) {
                    z = CardboardParamsUtils.writeDeviceParams(bArr, this.context);
                    int i4 = QrCodeContentProcessor.a;
                }
            }
            QrCodeContentProcessor.this.listener.onQrCodeSaved(z);
        }
    }

    public QrCodeContentProcessor(Listener listener) {
        this.listener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CardboardParamsUtils.UriToParamsStatus getParamsFromQrCode(Barcode barcode, UrlFactory urlFactory) {
        int i = barcode.d;
        if (i == 7 || i == 8) {
            return CardboardParamsUtils.getParamsFromUriString(barcode.b, urlFactory);
        }
        String str = TAG;
        int i2 = barcode.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Invalid QR code format: ");
        sb.append(i2);
        Log.e(str, sb.toString());
        return CardboardParamsUtils.UriToParamsStatus.error(1);
    }

    public void processAndSaveQrCode(Barcode barcode, Context context) {
        new ProcessAndSaveQrCodeTask(context).execute(barcode);
    }
}
