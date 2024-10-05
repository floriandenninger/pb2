package defpackage;

import android.media.MediaDrm;
import android.media.ResourceBusyException;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper$DrmProvisionException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afeu {
    private final ysy a;
    private final shf b;
    private final afhs c;

    public afeu(afhs afhsVar, ysy ysyVar, shf shfVar) {
        this.c = afhsVar;
        this.a = ysyVar;
        this.b = shfVar;
    }

    public static afih a(Exception exc, long j, afif afifVar, String str, String str2, boolean z) {
        String str3;
        Exception exc2;
        Exception exc3 = (!(exc instanceof azi) || (exc2 = (Exception) exc.getCause()) == null) ? exc : exc2;
        if (exc3 instanceof aeqe) {
            aeqe aeqeVar = (aeqe) exc3;
            aeqf aeqfVar = aeqeVar.a;
            Throwable cause = aeqeVar.getCause();
            boolean z2 = aeqeVar.c;
            afih afihVar = new afih(afif.DRM, "", j, aeqeVar);
            if (aeqfVar != null) {
                afie afieVar = new afie("auth", j);
                afieVar.a = afif.DRM;
                afieVar.c = aeqeVar;
                afieVar.d = aeqfVar;
                return afieVar.a();
            }
            if (cause instanceof cnq) {
                return aedn.q(j, cause, z2, afihVar);
            }
            if (!(cause instanceof aasx)) {
                return afihVar;
            }
            Throwable cause2 = cause.getCause();
            return !(cause2 instanceof cnq) ? afihVar : aedn.q(j, cause2, z2, afihVar);
        }
        if (exc3 instanceof WidevineHelper$DrmProvisionException) {
            Throwable cause3 = exc3.getCause();
            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                String valueOf = String.valueOf(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                return new afih(afif.DRM, "provision", j, valueOf.length() != 0 ? "info.".concat(valueOf) : new String("info."));
            }
            return new afih(afif.DRM, "provision", j, cause3);
        }
        if (exc3 instanceof MediaDrm.MediaDrmStateException) {
            String diagnosticInfo = ((MediaDrm.MediaDrmStateException) exc3).getDiagnosticInfo();
            String str4 = true != z ? "d." : "init;d.";
            afif afifVar2 = afif.DRM;
            String valueOf2 = String.valueOf(diagnosticInfo);
            return new afih(afifVar2, "unavailable", j, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), exc3, null);
        }
        if (exc3 instanceof ResourceBusyException) {
            return new afih(afif.DRM, "unavailable", j, true != z ? null : "init", exc3, null);
        }
        if (!str.equals("unimplemented") || str2 == null) {
            afie afieVar2 = new afie(str, j);
            afieVar2.c = exc3;
            afieVar2.b = str2;
            afieVar2.a = afifVar;
            return afieVar2.a();
        }
        if (exc3.getCause() != null) {
            String valueOf3 = String.valueOf(afhm.a(exc3.getCause()));
            str3 = valueOf3.length() != 0 ? ";exception.".concat(valueOf3) : new String(";exception.");
        } else {
            str3 = "";
        }
        afif afifVar3 = afif.DRM;
        String valueOf4 = String.valueOf(str3);
        return new afih(afifVar3, "unimplemented", j, valueOf4.length() != 0 ? str2.concat(valueOf4) : new String(str2));
    }

    public static afih d(afif afifVar, aeew aeewVar, VideoStreamingData videoStreamingData, long j) {
        String f = afhm.f(aeewVar, true, 6);
        if (videoStreamingData != null) {
            if (videoStreamingData.o.isEmpty() && videoStreamingData.p.isEmpty()) {
                f = String.valueOf(f).concat(";c.invalidStreamingData");
            } else {
                String str = videoStreamingData.k != null ? "1" : "0";
                String bL = adyu.bL(videoStreamingData.D());
                String p = VideoStreamingData.p(videoStreamingData.o);
                String p2 = VideoStreamingData.p(videoStreamingData.p);
                int length = String.valueOf(f).length();
                int length2 = str.length();
                StringBuilder sb = new StringBuilder(length + 21 + length2 + bL.length() + String.valueOf(p).length() + String.valueOf(p2).length());
                sb.append(f);
                sb.append(";mani.");
                sb.append(str);
                sb.append(";o.");
                sb.append(bL);
                sb.append(";prog.");
                sb.append(p);
                sb.append(";adap.");
                sb.append(p2);
                f = sb.toString();
            }
        }
        afie afieVar = new afie("fmt.noneavailable", j);
        afieVar.b = f;
        afieVar.a = afifVar;
        return afieVar.a();
    }

    private final boolean f(VideoStreamingData videoStreamingData) {
        if (videoStreamingData == null) {
            return false;
        }
        long d = this.b.d();
        return !videoStreamingData.A(d) && d - videoStreamingData.f < TimeUnit.SECONDS.toMillis((long) this.c.g());
    }

    public final afih b(IOException iOException) {
        return c(afif.DEFAULT, iOException, null, null, null, 0L, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x010a, code lost:
    
        if ((r17 instanceof defpackage.pnr) != false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.afih c(defpackage.afif r16, java.io.IOException r17, defpackage.bbi r18, defpackage.bbn r19, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r20, long r21, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afeu.c(afif, java.io.IOException, bbi, bbn, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, long, boolean, boolean):afih");
    }

    public final boolean e(atp atpVar, VideoStreamingData videoStreamingData) {
        int i = atpVar.d;
        return ((i != 400 && i != 410 && i != 416 && i != 403 && i != 404) || videoStreamingData == null || f(videoStreamingData)) ? false : true;
    }
}
