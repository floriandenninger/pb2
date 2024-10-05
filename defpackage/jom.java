package defpackage;

import com.google.android.libraries.ar.faceviewer.runtime.ExperienceJni;
import com.google.android.libraries.ar.faceviewer.runtime.NativeCallback;
import io.grpc.Status;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jom implements anfz {
    private final /* synthetic */ int r;
    public static final /* synthetic */ jom q = new jom(16);
    public static final /* synthetic */ jom p = new jom(15);
    public static final /* synthetic */ jom o = new jom(14);
    public static final /* synthetic */ jom n = new jom(13);
    public static final /* synthetic */ jom m = new jom(12);
    public static final /* synthetic */ jom l = new jom(11);
    public static final /* synthetic */ jom k = new jom(10);
    public static final /* synthetic */ jom j = new jom(9);
    public static final /* synthetic */ jom i = new jom(8);
    public static final /* synthetic */ jom h = new jom(7);
    public static final /* synthetic */ jom g = new jom(6);
    public static final /* synthetic */ jom f = new jom(5);
    public static final /* synthetic */ jom e = new jom(4);
    public static final /* synthetic */ jom d = new jom(3);
    public static final /* synthetic */ jom c = new jom(2);
    public static final /* synthetic */ jom b = new jom(1);
    public static final /* synthetic */ jom a = new jom(0);

    public /* synthetic */ jom(int i2) {
        this.r = i2;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        Object obj2;
        switch (this.r) {
            case 0:
                if (((aswn) obj) != null) {
                    return anaf.O(agou.a);
                }
                return anaf.O(agou.b);
            case 1:
                throw new cng(new IOException("Root cause assumed to be IOException", (TimeoutException) obj));
            case 2:
                cnm cnmVar = (cnm) obj;
                if (cnmVar == null || (obj2 = cnmVar.a) == null) {
                    return anaf.N(new IllegalStateException("Response was null. This should not have happened."));
                }
                cnq cnqVar = cnmVar.c;
                if (cnqVar != null) {
                    return anaf.N(cnqVar);
                }
                return anaf.O((aorx) obj2);
            case 3:
                Throwable th = (Throwable) obj;
                Status m2 = rwh.m(th);
                if (m2 == null || (m2.getCode() != Status.Code.NOT_FOUND && m2.getCode() != Status.Code.ABORTED)) {
                    throw rwh.l(th);
                }
                return anaf.O(amlr.a);
            case 4:
                throw rwh.l((Throwable) obj);
            case 5:
                final sde sdeVar = (sde) obj;
                return aci.c(new aeu() { // from class: sdc
                    @Override // defpackage.aeu
                    public final Object a(aes aesVar) {
                        ExperienceJni experienceJni = sde.this.a;
                        experienceJni.nativePreloadAllItems(experienceJni.b, NativeCallback.a(scy.a(aesVar)));
                        return "Experience.preloadAllItems";
                    }
                });
            case 6:
                qnx qnxVar = (qnx) obj;
                int a2 = qnxVar.a();
                if (a2 == 17 || a2 == 31003) {
                    return anhv.a;
                }
                throw qnxVar;
            case 7:
                tkj a3 = tkl.a();
                a3.a = tkk.UNABLE_TO_UPDATE_GROUP_METADATA_ERROR;
                a3.c = (IOException) obj;
                return anaf.N(a3.a());
            case 8:
                return anhv.a;
            case 9:
                return anhv.a;
            case 10:
                return anhv.a;
            case 11:
                tkv tkvVar = (tkv) obj;
                if (tkvVar == null) {
                    tkvVar = tkv.a;
                }
                return anaf.O(tkvVar);
            case 12:
                tlc a4 = tlc.a(((tlh) obj).d);
                if (a4 == null) {
                    a4 = tlc.NONE;
                }
                return anaf.O(a4);
            case 13:
                trg trgVar = new trg();
                if (!((Boolean) obj).booleanValue()) {
                    throw new IOException("failed to save sharedFilesMetadata", trgVar);
                }
                throw trgVar;
            case 14:
                return anaf.O(null);
            case 15:
                return anaf.N(new IllegalStateException());
            case 16:
                return anaf.N(new IllegalStateException());
            case 17:
                throw ((Exception) obj);
            case 18:
                throw ((Exception) obj);
            case 19:
                throw ((Exception) obj);
            default:
                throw ((Exception) obj);
        }
    }
}
