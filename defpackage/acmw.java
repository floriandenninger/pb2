package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.webrtc.DataChannel;
import org.webrtc.VideoTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acmw implements acne {
    public final Context a;
    public final Handler b;
    public final abrn c;
    public acmv e;
    public abtl f;
    public baqd g;
    public VideoTrack h;
    public String i;
    public final Set d = new HashSet();
    private long j = -1;

    public acmw(Context context, Handler handler, abrn abrnVar) {
        this.a = context;
        this.b = handler;
        this.c = abrnVar;
    }

    @Override // org.webrtc.DataChannel.Observer
    public final void onBufferedAmountChange(long j) {
    }

    @Override // org.webrtc.DataChannel.Observer
    public final void onMessage(DataChannel.Buffer buffer) {
        acmv acmvVar;
        String str;
        byte[] bArr = new byte[buffer.a.remaining()];
        buffer.a.get(bArr);
        try {
            aofr aofrVar = (aofr) aonm.parseFrom(aofr.a, bArr, aomw.b());
            for (aofv aofvVar : aofrVar.b) {
                aofw aofwVar = aofvVar.b;
                if (aofwVar == null) {
                    aofwVar = aofw.a;
                }
                long j = aofwVar.b;
                if (this.j < j) {
                    boolean z = false;
                    for (aofq aofqVar : aofvVar.c) {
                        Set set = this.d;
                        aofs aofsVar = aofqVar.c;
                        if (aofsVar == null) {
                            aofsVar = aofs.a;
                        }
                        z |= set.add(acni.b(aofsVar.b));
                    }
                    Iterator it = aofvVar.d.iterator();
                    while (it.hasNext()) {
                        z |= this.d.remove(acni.b(((aofu) it.next()).b));
                    }
                    this.j = j;
                    if (z && (acmvVar = this.e) != null && ((acnd) acmvVar).y != null && (str = ((acnd) acmvVar).q) != null) {
                        ((acnd) acmvVar).q = acni.c(str, aofvVar);
                        ((acnd) acmvVar).a(true);
                    }
                }
            }
            for (aoft aoftVar : aofrVar.c) {
                aols aolsVar = aoftVar.b;
                if (aolsVar != null && aolsVar.b.equals("type.googleapis.com/youtube_live.CostreamMessage")) {
                    aols aolsVar2 = aoftVar.b;
                    if (aolsVar2 == null) {
                        aolsVar2 = aols.a;
                    }
                    final axkp axkpVar = (axkp) aonm.parseFrom(axkp.a, aolsVar2.c, aomw.b());
                    if (this.f != null && axkpVar.b != null) {
                        this.b.post(new Runnable() { // from class: acms
                            @Override // java.lang.Runnable
                            public final void run() {
                                acmw acmwVar = acmw.this;
                                axkp axkpVar2 = axkpVar;
                                Object obj = acmwVar.f;
                                aoqa aoqaVar = axkpVar2.b;
                                if (aoqaVar == null) {
                                    aoqaVar = aoqa.a;
                                }
                                long j2 = aoqaVar.b;
                                if (acfm.b((ce) obj)) {
                                    acif acifVar = (acif) obj;
                                    int c = (int) (j2 - (acifVar.aj.c() / 1000));
                                    if (c > 0) {
                                        acifVar.aN();
                                        acifVar.aq.b(c);
                                        acifVar.aq.c = new acid(acifVar);
                                    }
                                }
                            }
                        });
                    }
                }
            }
        } catch (aoob e) {
            String valueOf = String.valueOf(e.getMessage());
            zga.h("ParticipantMediaStreamMgr", valueOf.length() != 0 ? "Didn't find PushNotification proto in DataChannel buffer: ".concat(valueOf) : new String("Didn't find PushNotification proto in DataChannel buffer: "));
        }
    }

    @Override // org.webrtc.DataChannel.Observer
    public final void onStateChange() {
    }
}
