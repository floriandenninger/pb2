package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.libraries.video.media.VideoMetaData;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.channels.Channels;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class how extends hpa {
    public final String c;
    public Bitmap f;
    public WeakReference g;
    private final Context l;
    private axet m;
    private File n;
    private ShortsVideoMetadata o;
    private String p;
    private axev q;
    public final HashSet a = new HashSet();
    public final Object b = new Object();
    public final List d = new ArrayList();
    public final Deque e = new ArrayDeque();
    public String h = "";
    public int i = -1;

    public how(String str, Context context, String str2) {
        this.c = str;
        this.l = context;
        this.k = str2;
    }

    private final String L() {
        if (this.h.isEmpty()) {
            synchronized (this.b) {
                this.h = bamb.a("'composed_video'_yyyyMMdd_HHmmssSSS'.mp4'").a(baju.c());
                z();
            }
        }
        return this.h;
    }

    private final void M() {
        synchronized (this.b) {
            for (axey axeyVar : this.e) {
                File l = l(axeyVar.e);
                if (l.exists()) {
                    l.delete();
                }
                File l2 = l(axeyVar.h);
                if (l2.exists()) {
                    l2.delete();
                }
            }
            this.e.clear();
        }
    }

    public static how a(Context context, String str) {
        return new how("DraftProject", context, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0199, code lost:
    
        if (r9 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x019b, code lost:
    
        r2 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a3, code lost:
    
        if (r2.length() == 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a5, code lost:
    
        "RestoreInstanceState for project: ".concat(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a8, code lost:
    
        r11 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01aa, code lost:
    
        monitor-enter(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ab, code lost:
    
        r1.o = (com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata) r9.getParcelable("SHORTS_PROJECT_COMPOSED_VIDEO_KEY");
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b5, code lost:
    
        r2 = defpackage.axey.a;
        r4 = defpackage.aomw.b();
        r5 = r9.getParcelable("SHORTS_PROJECT_REDO_STACK_KEY");
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c3, code lost:
    
        if ((r5 instanceof android.os.Bundle) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c5, code lost:
    
        r5 = (android.os.Bundle) r5;
        r5.setClassLoader(com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse.class.getClassLoader());
        r5 = r5.getParcelableArrayList("protoparsers");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d9, code lost:
    
        r6 = new java.util.ArrayList(r5.size());
        r5 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ea, code lost:
    
        if (r5.hasNext() == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ec, code lost:
    
        r6.add(defpackage.amkq.ci((com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse) r5.next(), r2, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01fa, code lost:
    
        r1.e.clear();
        r1.e.addAll(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x020a, code lost:
    
        if (r9.containsKey("SHORTS_PROJECT_AUDIO_TRACK_KEY") == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x020c, code lost:
    
        r2 = (defpackage.axet) defpackage.amkq.cj(r9, "SHORTS_PROJECT_AUDIO_TRACK_KEY", defpackage.axet.a, defpackage.aomw.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x021a, code lost:
    
        if (r2 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x021c, code lost:
    
        r1.m = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d7, code lost:
    
        r5 = (java.util.ArrayList) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x021f, code lost:
    
        r1.e.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017c, code lost:
    
        r11 = new defpackage.aonw(r11.f, defpackage.axeu.a).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018d, code lost:
    
        if (r11.hasNext() == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018f, code lost:
    
        super.x((defpackage.autl) r11.next());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.how b(java.lang.String r8, android.os.Bundle r9, android.content.Context r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.how.b(java.lang.String, android.os.Bundle, android.content.Context, java.lang.String):how");
    }

    public static axet h(ShortsCreationSelectedTrack shortsCreationSelectedTrack) {
        aone createBuilder = axet.a.createBuilder();
        String k = shortsCreationSelectedTrack.k();
        createBuilder.copyOnWrite();
        axet axetVar = (axet) createBuilder.instance;
        axetVar.b |= 1;
        axetVar.c = k;
        avgg h = shortsCreationSelectedTrack.h();
        String j = shortsCreationSelectedTrack.j();
        if (h != null && j != null) {
            aone createBuilder2 = axes.a.createBuilder();
            createBuilder2.copyOnWrite();
            axes axesVar = (axes) createBuilder2.instance;
            axesVar.d = h;
            axesVar.b |= 2;
            createBuilder2.copyOnWrite();
            axes axesVar2 = (axes) createBuilder2.instance;
            axesVar2.b |= 1;
            axesVar2.c = j;
            createBuilder.copyOnWrite();
            axet axetVar2 = (axet) createBuilder.instance;
            axes axesVar3 = (axes) createBuilder2.build();
            axesVar3.getClass();
            axetVar2.e = axesVar3;
            axetVar2.b |= 4;
        }
        aone createBuilder3 = axex.a.createBuilder();
        long a = shortsCreationSelectedTrack.a();
        createBuilder3.copyOnWrite();
        axex axexVar = (axex) createBuilder3.instance;
        axexVar.b |= 1;
        axexVar.c = (int) a;
        axex axexVar2 = (axex) createBuilder3.build();
        String i = shortsCreationSelectedTrack.i();
        if (i != null) {
            createBuilder.copyOnWrite();
            axet axetVar3 = (axet) createBuilder.instance;
            axetVar3.b |= 8;
            axetVar3.f = i;
        }
        apxf f = shortsCreationSelectedTrack.f();
        if (f != null) {
            createBuilder.copyOnWrite();
            axet axetVar4 = (axet) createBuilder.instance;
            axetVar4.g = f;
            axetVar4.b |= 16;
        }
        createBuilder.copyOnWrite();
        axet axetVar5 = (axet) createBuilder.instance;
        axexVar2.getClass();
        axetVar5.d = axexVar2;
        axetVar5.b |= 2;
        return (axet) createBuilder.build();
    }

    public final void A() {
        WeakReference weakReference = this.g;
        hov hovVar = weakReference != null ? (hov) weakReference.get() : null;
        if (hovVar != null) {
            synchronized (this.b) {
                int i = this.i;
                if (i != -1) {
                    hovVar.b(i);
                }
            }
        }
    }

    public final void B() {
        this.f = null;
        WeakReference weakReference = this.g;
        hov hovVar = weakReference != null ? (hov) weakReference.get() : null;
        if (hovVar != null) {
            synchronized (this.b) {
                int[] iArr = new int[this.d.size()];
                for (int i = 0; i < this.d.size(); i++) {
                    axex axexVar = ((axey) this.d.get(i)).f;
                    if (axexVar == null) {
                        axexVar = axex.a;
                    }
                    iArr[i] = axexVar.d;
                }
                hovVar.a(iArr);
                hovVar.d(D());
                hovVar.c(C());
            }
        }
    }

    public final boolean C() {
        return !this.e.isEmpty();
    }

    public final boolean D() {
        return !this.d.isEmpty();
    }

    @Override // defpackage.hpa
    public final boolean E() {
        return e().h();
    }

    public final boolean F() {
        return this.f != null;
    }

    public final void G(boolean z) {
        String str;
        if (F()) {
            return;
        }
        if (!this.d.isEmpty() && (((axey) amkq.bj(this.d)).b & 16) != 0) {
            File l = l(((axey) amkq.bj(this.d)).h);
            try {
                try {
                    str = l.getCanonicalPath();
                    try {
                        String canonicalPath = l.getCanonicalPath();
                        if (!l.exists()) {
                            String valueOf = String.valueOf(canonicalPath);
                            throw new FileNotFoundException(valueOf.length() != 0 ? "File not found at ".concat(valueOf) : new String("File not found at "));
                        }
                        Bitmap decodeFile = BitmapFactory.decodeFile(canonicalPath);
                        if (decodeFile != null) {
                            this.f = decodeFile;
                            this.a.remove(str);
                        } else {
                            String valueOf2 = String.valueOf(canonicalPath);
                            throw new IOException(valueOf2.length() != 0 ? "Could not decode bitmap file at ".concat(valueOf2) : new String("Could not decode bitmap file at "));
                        }
                    } catch (IOException e) {
                        e = e;
                        this.f = null;
                        if (z && str != null && this.a.add(str)) {
                            zga.f("ShortsProject", "IOException when loading align overlay image", e);
                            afsi.c(2, 6, "[ShortsCreation][Android][ProjectState]IOException when decoding align overlay image", e);
                        }
                    }
                } catch (OutOfMemoryError e2) {
                    this.f = null;
                    zga.f("ShortsProject", "Out of memory when loading align overlay image", e2);
                    afsi.c(2, 6, "[ShortsCreation][Android][ProjectState]Out of memory when decoding align overlay image", e2);
                }
            } catch (IOException e3) {
                e = e3;
                str = null;
            }
        } else {
            this.f = null;
        }
    }

    @Override // defpackage.hpa
    public final ammv c() {
        return ammv.i(this.m);
    }

    @Override // defpackage.hpa
    public final ammv d() {
        ShortsVideoMetadata shortsVideoMetadata;
        Context context;
        synchronized (this.b) {
            File j = j(L());
            if (j.exists()) {
                ShortsVideoMetadata shortsVideoMetadata2 = this.o;
                if (shortsVideoMetadata2 != null) {
                    shortsVideoMetadata = shortsVideoMetadata2;
                } else {
                    if (!j.delete()) {
                        String valueOf = String.valueOf(j);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                        sb.append("Failed to delete composed video ");
                        sb.append(valueOf);
                        String sb2 = sb.toString();
                        zga.b(sb2);
                        String valueOf2 = String.valueOf(sb2);
                        afsi.b(2, 6, valueOf2.length() != 0 ? "[ShortsCreation][Android][ProjectState]".concat(valueOf2) : new String("[ShortsCreation][Android][ProjectState]"));
                    }
                    this.h = "";
                    j = j(L());
                }
            }
            File file = j;
            if (this.d.isEmpty()) {
                afsi.b(2, 6, "[ShortsCreation][Android][ProjectState]No segments found");
                shortsVideoMetadata = null;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    arrayList.add(l(((axey) it.next()).e));
                }
                try {
                    context = this.l;
                } catch (vuy e) {
                    e = e;
                    shortsVideoMetadata = null;
                }
                try {
                    if (arrayList.size() <= 0) {
                        throw new vuy("Fewer than one segment to merge");
                    }
                    try {
                        axkz axkzVar = new axkz();
                        axlc[] axlcVarArr = new axlc[arrayList.size()];
                        axlc[] axlcVarArr2 = new axlc[arrayList.size()];
                        for (int i = 0; i < arrayList.size(); i++) {
                            axkv g = vtw.g(context, Uri.fromFile((File) arrayList.get(i)));
                            try {
                                det a = new ddz(g, vug.b).a();
                                if (a != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    try {
                                        for (dfm dfmVar : a.j(dfm.class)) {
                                            int size = arrayList2.size();
                                            StringBuilder sb3 = new StringBuilder(17);
                                            sb3.append("track-");
                                            sb3.append(size);
                                            arrayList2.add(new axla(sb3.toString(), dfmVar, new ddz[0]));
                                        }
                                        axlc s = vlu.s(arrayList2);
                                        axlc r = vlu.r(arrayList2, "soun");
                                        axlcVarArr[i] = s;
                                        axlcVarArr2[i] = r;
                                    } catch (Exception e2) {
                                        Log.e("Mp4VideoMerger", "createMp4Track failed", e2);
                                        throw new vuy(e2);
                                    }
                                } else {
                                    throw new vuy("Failed to get video movie box");
                                }
                            } catch (IOException e3) {
                                g.close();
                                throw e3;
                            }
                        }
                        axkzVar.b(new axlp(axlcVarArr));
                        axkzVar.b(new axlp(axlcVarArr2));
                        try {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    ((axku) new axlf().c(axkzVar)).k(Channels.newChannel(fileOutputStream));
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e4) {
                                        Log.w("Mp4VideoMerger", "Failed to close output stream. Ignoring and attempting to move on.", e4);
                                    }
                                    vvd vvdVar = new vvd();
                                    axlc s2 = vlu.s(axkzVar.d);
                                    vvdVar.a = Uri.fromFile(file);
                                    vvdVar.b = false;
                                    vvdVar.d = (int) Math.round(s2.j().f);
                                    vvdVar.e = (int) Math.round(s2.j().g);
                                    vvdVar.f = vlu.q(s2.j().e);
                                    double micros = TimeUnit.SECONDS.toMicros(s2.a());
                                    double d = s2.j().b;
                                    Double.isNaN(micros);
                                    Double.isNaN(d);
                                    vvdVar.h = Math.round(micros / d);
                                    vvdVar.i = new long[]{0};
                                    try {
                                        VideoMetaData a2 = vvdVar.a();
                                        int i2 = a2.d;
                                        int i3 = a2.e;
                                        int i4 = a2.f % 180;
                                        int i5 = i4 == 90 ? i2 : i3;
                                        if (i4 == 90) {
                                            i2 = i3;
                                        }
                                        double d2 = a2.g;
                                        Double.isNaN(d2);
                                        long round = Math.round(d2 / 1000.0d);
                                        hfs e5 = ShortsVideoMetadata.e();
                                        e5.c(Uri.fromFile(file));
                                        e5.e(i2);
                                        e5.b(i5);
                                        e5.d(round);
                                        shortsVideoMetadata = e5.a();
                                        this.o = shortsVideoMetadata;
                                    } catch (IOException e6) {
                                        throw new vuy(e6, null);
                                    }
                                } catch (Exception e7) {
                                    Log.e("Mp4VideoMerger", "DefaultMp4Builder failed", e7);
                                    throw new vuy(e7);
                                }
                            } catch (FileNotFoundException e8) {
                                e = e8;
                                throw new vuy(e);
                            }
                        } catch (FileNotFoundException e9) {
                            e = e9;
                            throw new vuy(e);
                        }
                    } catch (IOException e10) {
                        throw new vuy(e10);
                    }
                } catch (vuy e11) {
                    e = e11;
                    zga.d("Failed to merge segments", e);
                    afsi.c(2, 6, "[ShortsCreation][Android][ProjectState]Failed to merge segments", e);
                    return ammv.i(shortsVideoMetadata);
                }
            }
        }
        return ammv.i(shortsVideoMetadata);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ammv e() {
        return ammv.i(this.q);
    }

    @Override // defpackage.hpa
    public final ammv f() {
        return ammv.i(this.p);
    }

    public final amru g() {
        return amru.o(this.d);
    }

    public final File i() {
        long currentTimeMillis = System.currentTimeMillis();
        File n = n();
        if (!n.exists()) {
            n.mkdirs();
        }
        File file = null;
        if (!n.isDirectory() || !n.canWrite()) {
            String valueOf = String.valueOf(n);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Output directory not accessible: ");
            sb.append(valueOf);
            zga.b(sb.toString());
        } else {
            try {
                file = new File(String.valueOf(wcy.Q(currentTimeMillis)).concat(".mp4"));
            } catch (Exception unused) {
            }
        }
        this.n = file;
        return m();
    }

    public final File j(String str) {
        File file = new File(I(this.l), "composed_videos");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str);
    }

    public final File k() {
        if (this.d.isEmpty() || (((axey) amkq.bj(this.d)).b & 1) == 0) {
            return null;
        }
        return l(((axey) amkq.bj(this.d)).e);
    }

    public final File l(String str) {
        return new File(n(), str);
    }

    public final File m() {
        File file = this.n;
        if (file == null) {
            return null;
        }
        return l(file.toString());
    }

    @Override // defpackage.hpa
    public final File n() {
        return new File(I(this.l), this.c);
    }

    @Override // defpackage.hpa
    public final String o() {
        return this.c;
    }

    @Override // defpackage.hpa
    public final void p() {
        M();
        B();
    }

    @Override // defpackage.hpa
    public final void q() {
        M();
    }

    @Override // defpackage.hpa
    public final void r(ShortsCreationSelectedTrack shortsCreationSelectedTrack) {
        synchronized (this.b) {
            this.m = h(shortsCreationSelectedTrack);
            z();
        }
    }

    public final void t(zog zogVar, avwj avwjVar, aqqz aqqzVar, boolean z) {
        this.n.getClass();
        synchronized (this.b) {
            M();
            aone createBuilder = axey.a.createBuilder();
            File file = this.n;
            if (file != null) {
                String file2 = file.toString();
                createBuilder.copyOnWrite();
                axey axeyVar = (axey) createBuilder.instance;
                file2.getClass();
                axeyVar.b |= 1;
                axeyVar.e = file2;
            }
            aone createBuilder2 = axex.a.createBuilder();
            createBuilder2.copyOnWrite();
            axex axexVar = (axex) createBuilder2.instance;
            axexVar.b |= 1;
            axexVar.c = 0;
            int i = (int) zogVar.c;
            createBuilder2.copyOnWrite();
            axex axexVar2 = (axex) createBuilder2.instance;
            axexVar2.b |= 2;
            axexVar2.d = i;
            axex axexVar3 = (axex) createBuilder2.build();
            createBuilder.copyOnWrite();
            axey axeyVar2 = (axey) createBuilder.instance;
            axexVar3.getClass();
            axeyVar2.f = axexVar3;
            axeyVar2.b |= 2;
            if (z) {
                int size = this.d.size();
                StringBuilder sb = new StringBuilder(30);
                sb.append("align_overlay_image");
                sb.append(size);
                String sb2 = sb.toString();
                createBuilder.copyOnWrite();
                axey axeyVar3 = (axey) createBuilder.instance;
                sb2.getClass();
                axeyVar3.b |= 16;
                axeyVar3.h = sb2;
            }
            if (avwjVar != null) {
                createBuilder.copyOnWrite();
                axey axeyVar4 = (axey) createBuilder.instance;
                axeyVar4.d = avwjVar;
                axeyVar4.c = 3;
            }
            if (aqqzVar != null) {
                createBuilder.copyOnWrite();
                axey axeyVar5 = (axey) createBuilder.instance;
                axeyVar5.g = aqqzVar;
                axeyVar5.b |= 8;
            }
            this.d.add((axey) createBuilder.build());
            this.n = null;
            z();
            B();
        }
    }

    @Override // defpackage.hpa
    public final void u(String str) {
        synchronized (this.b) {
            this.p = str;
            z();
        }
    }

    public final void v() {
        File m = m();
        if (m != null) {
            if (m.exists()) {
                m.delete();
            }
            this.n = null;
        }
    }

    @Override // defpackage.hpa
    public final void w(Bundle bundle) {
        super.w(bundle);
        bundle.putParcelable("SHORTS_PROJECT_COMPOSED_VIDEO_KEY", this.o);
        axet axetVar = this.m;
        if (axetVar != null) {
            amkq.cn(bundle, "SHORTS_PROJECT_AUDIO_TRACK_KEY", axetVar);
        }
        ArrayList arrayList = new ArrayList(this.e);
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(amkq.cl((aooy) it.next()));
        }
        bundle2.putParcelableArrayList("protoparsers", arrayList2);
        bundle.putParcelable("SHORTS_PROJECT_REDO_STACK_KEY", bundle2);
    }

    @Override // defpackage.hpa
    public final void x(autl autlVar) {
        super.x(autlVar);
        z();
    }

    @Override // defpackage.hpa
    public final void y() {
        synchronized (this.b) {
            if (this.m == null) {
                return;
            }
            this.m = null;
            z();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01c0 A[Catch: all -> 0x01f5, TRY_LEAVE, TryCatch #4 {, blocks: (B:5:0x0004, B:7:0x0011, B:8:0x0020, B:10:0x0037, B:11:0x003d, B:13:0x0046, B:15:0x0055, B:16:0x005b, B:17:0x0060, B:19:0x0080, B:20:0x0094, B:21:0x009a, B:23:0x00a0, B:25:0x00b8, B:27:0x00be, B:30:0x00c6, B:32:0x00ca, B:33:0x00d9, B:35:0x00dd, B:36:0x00ec, B:38:0x00f0, B:40:0x00ff, B:42:0x010b, B:44:0x0111, B:45:0x0114, B:47:0x0119, B:49:0x0121, B:51:0x0128, B:53:0x0145, B:55:0x0154, B:57:0x015b, B:64:0x0160, B:58:0x0167, B:59:0x01f3, B:66:0x0131, B:71:0x013d, B:68:0x018a, B:69:0x01a2, B:74:0x0171, B:75:0x0189, B:78:0x01af, B:81:0x01ba, B:83:0x01c0, B:85:0x01c7, B:91:0x01cc, B:86:0x01d3, B:88:0x01db), top: B:4:0x0004, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01db A[Catch: all -> 0x01f5, TryCatch #4 {, blocks: (B:5:0x0004, B:7:0x0011, B:8:0x0020, B:10:0x0037, B:11:0x003d, B:13:0x0046, B:15:0x0055, B:16:0x005b, B:17:0x0060, B:19:0x0080, B:20:0x0094, B:21:0x009a, B:23:0x00a0, B:25:0x00b8, B:27:0x00be, B:30:0x00c6, B:32:0x00ca, B:33:0x00d9, B:35:0x00dd, B:36:0x00ec, B:38:0x00f0, B:40:0x00ff, B:42:0x010b, B:44:0x0111, B:45:0x0114, B:47:0x0119, B:49:0x0121, B:51:0x0128, B:53:0x0145, B:55:0x0154, B:57:0x015b, B:64:0x0160, B:58:0x0167, B:59:0x01f3, B:66:0x0131, B:71:0x013d, B:68:0x018a, B:69:0x01a2, B:74:0x0171, B:75:0x0189, B:78:0x01af, B:81:0x01ba, B:83:0x01c0, B:85:0x01c7, B:91:0x01cc, B:86:0x01d3, B:88:0x01db), top: B:4:0x0004, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z() {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.how.z():void");
    }

    public final void s(axev axevVar) {
        synchronized (this.b) {
            if (axevVar == null) {
                if (this.q == null) {
                    return;
                }
            }
            this.q = axevVar;
            z();
        }
    }
}
