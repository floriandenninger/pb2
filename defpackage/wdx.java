package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wdx implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ UploadPhotoEndpointOuterClass$UploadPhotoEndpoint b;
    final /* synthetic */ wdy c;

    public wdx(wdy wdyVar, String str, UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint) {
        this.c = wdyVar;
        this.a = str;
        this.b = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            wdy wdyVar = this.c;
            wdz wdzVar = wdyVar.b;
            Uri uri = wdyVar.aj;
            String str = this.a;
            String str2 = wdyVar.ak;
            yjk.e();
            if (!wdzVar.d.t()) {
                throw new wdu("Must be signed in to upload");
            }
            try {
                wdr a = wdr.a(wdzVar.b.getContentResolver(), uri);
                awzx awzxVar = new awzx();
                if (str2 != null && !str2.isEmpty()) {
                    awzxVar.e("X-YouTube-ChannelId", str2);
                }
                awzxVar.e("Content-Type", "application/json-rpc; charset=utf-8");
                afsx c = wdzVar.d.c();
                if (!(c instanceof AccountIdentity)) {
                    throw new wdu("Sign in with AccountIdentity required");
                }
                aftg d = wdzVar.c.d((AccountIdentity) c);
                if (!d.g()) {
                    throw new wdu("Could not fetch auth token");
                }
                Pair b = d.b();
                awzxVar.e((String) b.first, (String) b.second);
                try {
                    axac axacVar = new axac(new BufferedInputStream(wdzVar.b.getContentResolver().openInputStream(a.a)), a.c);
                    axaq a2 = axar.a();
                    a2.a = 600L;
                    a2.b = a.b;
                    axam a3 = wdzVar.e.a(str, awzxVar, axacVar, null, a2.a());
                    try {
                        try {
                            axap axapVar = (axap) a3.a().get();
                            if (axapVar.b()) {
                                throw new cng(axapVar.a);
                            }
                            if (!axapVar.a()) {
                                throw new cng();
                            }
                            awzy awzyVar = axapVar.b;
                            int i = awzyVar.a;
                            if (i >= 0) {
                                awzx awzxVar2 = awzyVar.b;
                                awzxVar2.getClass();
                                try {
                                    InputStream inputStream = awzyVar.c;
                                    if (inputStream == null) {
                                        throw new cng();
                                    }
                                    byte[] c2 = anbt.c(inputStream);
                                    if (i != 200) {
                                        throw new cno(wdz.a(i, awzxVar2, c2));
                                    }
                                    try {
                                        wdyVar.al = new JSONObject(new String(c2, wdz.a)).getString("encryptedBlobId");
                                        this.c.d.execute(new wdv(this));
                                        return;
                                    } catch (JSONException unused) {
                                        throw new cnj(wdz.a(200, awzxVar2, c2));
                                    }
                                } catch (IOException unused2) {
                                    throw new cng();
                                }
                            }
                            throw new cng();
                        } catch (InterruptedException e) {
                            a3.f();
                            throw e;
                        } catch (ExecutionException e2) {
                            if (e2.getCause() != null) {
                                throw new cng(e2.getCause());
                            }
                            throw new cng();
                        }
                    } catch (cng e3) {
                        e = e3;
                        throw new wdu(e);
                    } catch (cnj e4) {
                        e = e4;
                        throw new wdu(e);
                    } catch (cno e5) {
                        e = e5;
                        throw new wdu(e);
                    }
                } catch (FileNotFoundException e6) {
                    throw new wdu(e6);
                }
            } catch (IOException e7) {
                throw new wdu(e7);
            }
        } catch (Exception e8) {
            if (e8 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            this.c.d.execute(new wdw(this, e8));
        }
    }
}
