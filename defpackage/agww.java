package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteFullException;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agww {
    public final Context a;
    public final aifk b;
    public final aais c;
    public final azrw d;
    private final shf e;
    private final agzx f;
    private final aaea g;
    private final abds h;
    private final abdt i;
    private final aght j;
    private final azrw k;
    private final aadw l;
    private final ajoy m;

    public agww(Context context, shf shfVar, agzx agzxVar, aadw aadwVar, aaea aaeaVar, abds abdsVar, abdt abdtVar, aght aghtVar, ajoy ajoyVar, azrw azrwVar, aifk aifkVar, aais aaisVar, azrw azrwVar2, byte[] bArr) {
        this.a = context;
        this.e = shfVar;
        this.f = agzxVar;
        this.l = aadwVar;
        this.g = aaeaVar;
        this.h = abdsVar;
        this.i = abdtVar;
        this.j = aghtVar;
        this.m = ajoyVar;
        this.k = azrwVar;
        this.b = aifkVar;
        this.c = aaisVar;
        this.d = azrwVar2;
    }

    public static String b(String str) {
        return aalt.f(119, str);
    }

    public static String c(String str) {
        return aalt.f(120, str);
    }

    public static final void e(String str, String str2, String str3, aeek aeekVar, agnm agnmVar, long j, agjd agjdVar, String str4, afhd afhdVar, afhd afhdVar2, agsm agsmVar) {
        long b;
        if (agnmVar.i()) {
            afhdVar2.c(j);
            return;
        }
        long b2 = agnmVar.b() - agnmVar.d;
        if (str4 != null) {
            agej b3 = ((agof) agsmVar.c.get()).a().b();
            if (b3 == null) {
                b = 0;
            } else {
                File e = b3.e(str4);
                b = e == null ? agsmVar.b() : agsmVar.c(e);
            }
        } else {
            b = agsmVar.b();
        }
        if (b <= b2) {
            throw new agtx(b2);
        }
        String.format(Locale.US, "[Offline] pudl task[%s] start stream<%d> uri<%s> download", str2, Integer.valueOf(agnmVar.a()), agnmVar.b.d);
        if (str4 != null) {
            agjdVar.h(str, agnmVar.a(), str4);
        }
        try {
            aeekVar.b(agnmVar.b, 0L, j, str3, afhdVar, afhdVar2);
        } catch (atp e2) {
            if (e2.d == 403) {
                throw new agws();
            }
            throw e2;
        }
    }

    public static final void f(String str, String str2, PlayerResponseModel playerResponseModel, agil agilVar, long j, aapf aapfVar) {
        if (agilVar.p(str2) == null) {
            throw agug.a("Video not found in database", null, agnf.FAILED_UNKNOWN, atqs.OFFLINE_VIDEO_NOT_FOUND_IN_DATABASE);
        }
        try {
            if (agilVar.G(str2, playerResponseModel, j, true, aapfVar)) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53);
            sb.append("[Offline] pudl task[");
            sb.append(str);
            sb.append("] failed to save player response.");
            zga.b(sb.toString());
            throw agug.b("Fail to save playerResponse", null, agnf.FAILED_UNKNOWN, atqs.OFFLINE_DATABASE_ERROR);
        } catch (SQLiteFullException e) {
            throw agug.b("Error trying to write to local disk.", e, agnf.DISK_IO_ERROR, atqs.OFFLINE_DATABASE_ERROR);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.agil r7, defpackage.agmn r8, defpackage.agnz r9) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agww.g(agil, agmn, agnz):void");
    }

    public static final void j(String str, PlayerResponseModel playerResponseModel) {
        if (!agzx.i(playerResponseModel)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60);
            sb.append("[Offline] pudl task[");
            sb.append(str);
            sb.append("] received actionable playability error.");
            zga.l(sb.toString());
            throw agug.a("Playability error", null, agnf.CANNOT_OFFLINE, atqs.NOT_PLAYABLE);
        }
        if (agzx.h(playerResponseModel)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 51);
        sb2.append("[Offline] pudl task[");
        sb2.append(str);
        sb2.append("] received offline state error.");
        zga.b(sb2.toString());
        throw agug.a("Offline state error", null, agnf.CANNOT_OFFLINE, atqs.NOT_OFFLINABLE);
    }

    private final FormatStreamModel k(FormatStreamModel formatStreamModel, VideoStreamingData videoStreamingData) {
        FormatStreamModel h = videoStreamingData.h(formatStreamModel.e(), formatStreamModel.w());
        if (h != null) {
            return this.f.a(h);
        }
        return null;
    }

    private final agnm l(agnm agnmVar, FormatStreamModel formatStreamModel, agjd agjdVar, String str) {
        if (agnmVar != null) {
            FormatStreamModel formatStreamModel2 = agnmVar.b;
            if (formatStreamModel == null || formatStreamModel.j() != formatStreamModel2.j() || formatStreamModel.k() != formatStreamModel2.k() || formatStreamModel.e() != formatStreamModel2.e() || !TextUtils.equals(formatStreamModel.w(), formatStreamModel2.w())) {
                agjdVar.d(str, agnmVar.a());
                agnmVar = null;
            }
        }
        if (formatStreamModel == null) {
            return agnmVar;
        }
        if (agnmVar == null) {
            boolean contains = aaoq.b().contains(Integer.valueOf(formatStreamModel.e()));
            long c = this.e.c();
            agnl e = agnm.e();
            e.d(formatStreamModel);
            e.b(contains);
            e.c(0L);
            e.g(0);
            e.h(c);
            agnm a = e.a();
            agjdVar.e(a);
            return a;
        }
        agnl d = agnmVar.d();
        d.d(formatStreamModel);
        return d.a();
    }

    public final agug a(IOException iOException) {
        if (iOException instanceof aeep) {
            return agug.b("Error network timed out", iOException, agnf.NETWORK_READ_ERROR, atqs.OFFLINE_NETWORK_ERROR);
        }
        if ((iOException instanceof atn) || (iOException instanceof SocketTimeoutException)) {
            return agug.b("Error reading from network", iOException, agnf.NETWORK_READ_ERROR, atqs.OFFLINE_NETWORK_ERROR);
        }
        if ((iOException instanceof bfo) || (iOException instanceof phs)) {
            aaea aaeaVar = this.g;
            if (aaeaVar != null && aaeaVar.a() != null && (aaeaVar.a().b & 512) != 0) {
                atph atphVar = aaeaVar.a().g;
                if (atphVar == null) {
                    atphVar = atph.a;
                }
                if (atphVar.x) {
                    return agug.a("Error trying to read from or write to local disk.", iOException, agnf.DISK_IO_ERROR, atqs.OFFLINE_DISK_ERROR);
                }
            }
            return agug.b("Error trying to read from or write to local disk.", iOException, agnf.DISK_IO_ERROR, atqs.OFFLINE_DISK_ERROR);
        }
        if (iOException instanceof phh) {
            aaea aaeaVar2 = this.g;
            if (aaeaVar2 != null && aaeaVar2.a() != null && (aaeaVar2.a().b & 512) != 0) {
                atph atphVar2 = aaeaVar2.a().g;
                if (atphVar2 == null) {
                    atphVar2 = atph.a;
                }
                if (atphVar2.y) {
                    return agug.a("Error trying to read from or write to local disk.", iOException, agnf.DISK_IO_ERROR, atqs.OFFLINE_DISK_ERROR);
                }
            }
            return agug.b("Error trying to read from or write to local disk.", iOException, agnf.DISK_IO_ERROR, atqs.OFFLINE_DISK_ERROR);
        }
        if (iOException instanceof agtx) {
            return agug.b("Out of storage error.", iOException, agnf.NO_STORAGE_ERROR, atqs.NO_OFFLINE_STORAGE);
        }
        if (iOException instanceof agua) {
            return ((agua) iOException).a();
        }
        if (iOException instanceof phe) {
            aaea aaeaVar3 = this.g;
            if (aaeaVar3 != null && aaeaVar3.a() != null && (aaeaVar3.a().b & 512) != 0) {
                atph atphVar3 = aaeaVar3.a().g;
                if (atphVar3 == null) {
                    atphVar3 = atph.a;
                }
                if (atphVar3.z) {
                    return agug.a("Error trying to read from or write to local disk.", iOException, agnf.DISK_IO_ERROR, atqs.OFFLINE_DISK_ERROR);
                }
            }
            return agug.b("Error trying to read from or write to local disk.", iOException, agnf.DISK_IO_ERROR, atqs.OFFLINE_DISK_ERROR);
        }
        zga.d("[Offline] unknown pudl error", iOException);
        return agug.b("Error trying to download video for offline.", iOException, agnf.DISK_IO_ERROR, atqs.OFFLINE_DISK_ERROR);
    }

    public final void d(String str, String str2, agil agilVar, ague agueVar) {
        atoy n = agzr.n(this.l);
        if (n != null && n.b) {
            try {
                abdu b = this.i.b();
                b.v(str2);
                b.k();
                WatchNextResponseModel d = this.h.d(b);
                if (agilVar.p(str2) == null) {
                    throw agug.a("Video not found in database", null, agnf.FAILED_UNKNOWN, atqs.OFFLINE_VIDEO_NOT_FOUND_IN_DATABASE);
                }
                try {
                    if (agilVar.I(str2, d)) {
                        agup a = aguq.a(15);
                        a.f(str);
                        ((agur) agueVar).p(a.a());
                        return;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55);
                    sb.append("[Offline] pudl task[");
                    sb.append(str);
                    sb.append("] failed to save watchNextResponse.");
                    zga.b(sb.toString());
                    throw agug.b("Fail to save watchNextResponse", null, agnf.FAILED_UNKNOWN, atqs.OFFLINE_DATABASE_ERROR);
                } catch (SQLiteFullException e) {
                    throw agug.b("Error trying to write to local disk.", e, agnf.DISK_IO_ERROR, atqs.OFFLINE_DATABASE_ERROR);
                }
            } catch (aasx e2) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 60);
                sb2.append("[Offline] pudl task[");
                sb2.append(str);
                sb2.append("] failed to retrieve watch next response");
                zga.d(sb2.toString(), e2);
                throw agug.b("Cannot retrieve watch next response from the server.", e2, agnf.NETWORK_READ_ERROR, atqs.OFFLINE_NETWORK_ERROR);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v31 com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel, still in use, count: 2, list:
          (r2v31 com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel) from 0x003f: IF  (r2v31 com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel) == (null com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel)  -> B:68:0x0057 A[HIDDEN]
          (r2v31 com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel) from 0x0043: PHI (r2v30 com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel) = 
          (r2v29 com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel)
          (r2v31 com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel)
         binds: [B:67:0x0042, B:15:0x003f] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.agnn h(int r17, int r18, java.lang.String r19, java.lang.String r20, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r21, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r22, defpackage.agjd r23) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agww.h(int, int, java.lang.String, java.lang.String, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, agjd):agnn");
    }

    public final PlayerResponseModel i(String str, byte[] bArr, agnz agnzVar, int i) {
        try {
            return this.f.l(str, i, bArr);
        } catch (aasx e) {
            String str2 = agnzVar.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
            sb.append("[Offline] pudl task[");
            sb.append(str2);
            sb.append("] failed to retrieve player response");
            zga.d(sb.toString(), e);
            throw agug.b("Cannot retrieve player response from the server.", e, agnf.NETWORK_READ_ERROR, atqs.OFFLINE_NETWORK_ERROR);
        }
    }
}
