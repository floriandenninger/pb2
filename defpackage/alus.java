package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.youtube.api.service.YouTubeService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alus extends alvm {
    final /* synthetic */ YouTubeService a;
    private final opn b;

    public alus(YouTubeService youTubeService, opn opnVar, byte[] bArr, byte[] bArr2) {
        this.a = youTubeService;
        this.b = opnVar;
    }

    @Override // defpackage.alvm
    public final void a(aluz aluzVar, int i, String str, String str2, String str3) {
        if (i < 1000) {
            YouTubeService.a(aluzVar, 9);
            return;
        }
        YouTubeService youTubeService = this.a;
        int callingUid = Binder.getCallingUid();
        if (!TextUtils.isEmpty(str)) {
            rag a = rac.a(youTubeService);
            String[] packagesForUid = a.a.getPackageManager().getPackagesForUid(callingUid);
            if (packagesForUid == null) {
                aloh s = aloh.s(a.a);
                if (s != null) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putInt("uid", callingUid);
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            try {
                                Bundle call = s.a.getContentResolver().call(raf.a, "getAppPackageForUid", (String) null, bundle);
                                if (call != null) {
                                    String string = call.getString("result");
                                    if (string != null) {
                                        packagesForUid = new String[]{string};
                                    }
                                } else {
                                    throw new RemoteException();
                                }
                            } catch (IllegalArgumentException unused) {
                                aloh.q();
                                throw new RemoteException("IAE: Content provider unavailable. Likely GmsCore down.");
                            } catch (SecurityException unused2) {
                                aloh.q();
                                throw new RemoteException("SecurityException: Content provider unavailable. Likely framework issue.");
                            }
                        } finally {
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    } catch (RemoteException e) {
                        Log.e("InstantAppsPMW", "Error getting app package for UID", e);
                    }
                }
                packagesForUid = null;
            }
            if (str != null && packagesForUid != null) {
                for (String str4 : packagesForUid) {
                    if (str.equals(str4)) {
                        YouTubeService youTubeService2 = this.a;
                        aluv aluvVar = new aluv(youTubeService2, youTubeService2.a, str, aluzVar, this.b, null, null, null, null, null);
                        String b = alvw.b(i);
                        str2.getClass();
                        str3.getClass();
                        otb.n(aluvVar, aluvVar.c, aluvVar.b, str3, aluvVar.d, str2, b, aluv.a.contains(aluvVar.d), 2);
                        return;
                    }
                }
            }
        }
        YouTubeService.a(aluzVar, 2);
    }
}
