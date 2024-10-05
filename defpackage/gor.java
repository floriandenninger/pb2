package defpackage;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import android.util.Pair;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gor implements NfcAdapter.OnNdefPushCompleteCallback, NfcAdapter.CreateNdefMessageCallback {
    public final azrw a;
    private final Executor b;

    public gor(azrw azrwVar, Executor executor) {
        this.a = azrwVar;
        this.b = executor;
    }

    @Override // android.nfc.NfcAdapter.CreateNdefMessageCallback
    public final NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        FutureTask futureTask = new FutureTask(new goq(this));
        this.b.execute(futureTask);
        try {
            Pair pair = (Pair) futureTask.get();
            String str = (String) pair.first;
            if (str != null) {
                return new NdefMessage(new NdefRecord[]{new NdefRecord((short) 3, wbs.ao(str, "", -1, ((Long) pair.second).longValue() / 1000).toString().getBytes(), new byte[0], new byte[0])});
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // android.nfc.NfcAdapter.OnNdefPushCompleteCallback
    public final void onNdefPushComplete(NfcEvent nfcEvent) {
        zga.g("NFC push completed");
    }
}
