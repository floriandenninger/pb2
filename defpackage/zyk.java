package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zyk implements alaf, vtz {
    private static final long a = TimeUnit.SECONDS.toMillis(10);
    private final Context b;
    private final akzz c;
    private final vsy d;
    private final alae e;
    private long f = -1;
    private final String g;
    private final aadw h;

    public zyk(int i, Uri uri, Context context, aadw aadwVar, axze axzeVar, alae alaeVar, akzk akzkVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        uri.getClass();
        this.b = context;
        this.h = aadwVar;
        this.e = alaeVar;
        amkq.E("goog-edited-video".equals(uri.getScheme()));
        Uri parse = Uri.parse(uri.getQueryParameter("videoFileUri"));
        this.g = uri.getQueryParameter("videoEffectsStateFilePath");
        try {
            vuv a2 = vuw.a();
            a2.c(false);
            a2.b(true);
            VideoMetaData b = vux.b(context, parse, a2.a());
            vsx vsxVar = new vsx();
            vsxVar.a = b;
            vsy a3 = vsxVar.a();
            this.d = a3;
            amkq.E("goog-edited-video".equals(uri.getScheme()));
            String queryParameter = uri.getQueryParameter("trimStartUs");
            String queryParameter2 = uri.getQueryParameter("trimEndUs");
            if (queryParameter != null && queryParameter2 != null) {
                a3.D(Long.parseLong(queryParameter));
                a3.C(Long.parseLong(queryParameter2));
            }
            String queryParameter3 = uri.getQueryParameter("filter");
            if (queryParameter3 != null) {
                a3.B(queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("muted");
            if (queryParameter4 != null) {
                a3.v(Boolean.parseBoolean(queryParameter4));
            }
            String queryParameter5 = uri.getQueryParameter("audioSwapSourceUri");
            if (queryParameter5 != null) {
                a3.x(Uri.parse(queryParameter5));
                a3.y(Float.parseFloat(uri.getQueryParameter("audioSwapVolume")));
                a3.w(Long.parseLong(uri.getQueryParameter("audioSwapOffsetUs")));
                String queryParameter6 = uri.getQueryParameter("audioSwapDurationUs");
                if (queryParameter6 != null && !queryParameter6.isEmpty()) {
                    long parseLong = Long.parseLong(queryParameter6);
                    EditableVideoEdits editableVideoEdits = a3.a;
                    if (editableVideoEdits.k != parseLong) {
                        editableVideoEdits.k = parseLong;
                        a3.t(7);
                    }
                }
            }
            String queryParameter7 = uri.getQueryParameter("cropTop");
            String queryParameter8 = uri.getQueryParameter("cropBottom");
            String queryParameter9 = uri.getQueryParameter("cropLeft");
            String queryParameter10 = uri.getQueryParameter("cropRight");
            double d = 0.0d;
            a3.A(queryParameter7 == null ? 0.0d : Double.parseDouble(queryParameter7), queryParameter8 == null ? 0.0d : Double.parseDouble(queryParameter8));
            double parseDouble = queryParameter9 == null ? 0.0d : Double.parseDouble(queryParameter9);
            if (queryParameter10 != null) {
                d = Double.parseDouble(queryParameter10);
            }
            a3.z(parseDouble, d);
            this.c = akzz.a(i, parse, context, axzeVar);
        } catch (IOException e) {
            zga.d("Unable to re-create the previously serialized EditableVideo", e);
            throw new FileNotFoundException("Unable to render video");
        }
    }

    public static Uri.Builder c(String str) {
        return new Uri.Builder().scheme("goog-edited-video").authority("generated").appendQueryParameter("videoFileUri", str);
    }

    public static Uri d(vsy vsyVar) {
        return e(vsyVar, vsyVar.b.a);
    }

    public static Uri e(vsy vsyVar, Uri uri) {
        vsyVar.getClass();
        uri.getClass();
        Uri.Builder c = c(uri.toString());
        i(vsyVar, c);
        return c.build();
    }

    public static Long h(Uri uri) {
        String queryParameter = uri.getQueryParameter("trimStartUs");
        String queryParameter2 = uri.getQueryParameter("trimEndUs");
        if (queryParameter == null || queryParameter2 == null) {
            return null;
        }
        return Long.valueOf((Long.parseLong(queryParameter2) - Long.parseLong(queryParameter)) / 1000);
    }

    public static void i(vsy vsyVar, Uri.Builder builder) {
        if (vsyVar.K()) {
            builder.appendQueryParameter("trimStartUs", Long.toString(vsyVar.n())).appendQueryParameter("trimEndUs", Long.toString(vsyVar.l()));
        }
        if (vsyVar.I()) {
            builder.appendQueryParameter("filter", vsyVar.p());
        }
        if (vsyVar.F()) {
            builder.appendQueryParameter("muted", Boolean.toString(vsyVar.F()));
        } else if (vsyVar.G()) {
            builder.appendQueryParameter("audioSwapSourceUri", vsyVar.o().toString()).appendQueryParameter("audioSwapVolume", Float.toString(vsyVar.e())).appendQueryParameter("audioSwapOffsetUs", Long.toString(vsyVar.g()));
        }
        if (vsyVar.H()) {
            builder.appendQueryParameter("cropTop", Double.toString(vsyVar.d())).appendQueryParameter("cropBottom", Double.toString(vsyVar.a())).appendQueryParameter("cropLeft", Double.toString(vsyVar.b())).appendQueryParameter("cropRight", Double.toString(vsyVar.c()));
        }
    }

    private final boolean m() {
        return this.d.G() || this.d.K() || this.d.F();
    }

    @Override // defpackage.vtz
    public final void a(double d) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.e != null) {
            long j = this.f;
            if (j == -1 || Math.abs(j - currentTimeMillis) >= 500) {
                this.e.a(d);
                this.f = currentTimeMillis;
            }
        }
    }

    @Override // defpackage.alaf
    public final Bitmap b(Point point) {
        if (!this.d.K()) {
            return this.c.b(point);
        }
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        vuq vuqVar = new vuq();
        VideoMetaData videoMetaData = this.d.b;
        float k = videoMetaData.k();
        float j = videoMetaData.j();
        float min = Math.min(point.x / k, point.y / j);
        vxz vxzVar = new vxz(this.b, videoMetaData, (int) (k * min), (int) (j * min), priorityBlockingQueue, vut.a, vum.b, vuqVar);
        vxzVar.start();
        try {
            try {
                long j2 = a;
                if (vxzVar.a.await(j2, TimeUnit.MILLISECONDS)) {
                    if (vxzVar.b instanceof IOException) {
                        throw new IOException(vxzVar.b);
                    }
                    if (!(vxzVar.b instanceof vxt)) {
                        if (vxzVar.b != null) {
                            String valueOf = String.valueOf(vxzVar.b);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                            sb.append("Unexpected initialization exception ");
                            sb.append(valueOf);
                            throw new AssertionError(sb.toString());
                        }
                    } else {
                        throw new vxt(vxzVar.b);
                    }
                }
                long n = this.d.n();
                long l = this.d.l();
                VideoMetaData videoMetaData2 = this.d.b;
                int g = videoMetaData2.g(n);
                int c = videoMetaData2.c(n);
                if (c != -1 && videoMetaData2.l(c) <= l) {
                    g = c;
                }
                vxx vxxVar = new vxx(g);
                priorityBlockingQueue.add(vxxVar);
                vxxVar.c.await(j2, TimeUnit.MILLISECONDS);
                return vxxVar.d;
            } finally {
                vxzVar.a();
            }
        } catch (IOException | AssertionError | InterruptedException | vxt e) {
            zga.d("Error while extracting thumbnail", e);
            vxzVar.a();
            return null;
        }
    }

    @Override // defpackage.alaf
    public final alad f(File file) {
        boolean z;
        vxh g;
        aseb a2 = aaec.a(this.h);
        nbm nbmVar = new nbm();
        if (a2.s) {
            z = true;
        } else {
            this.b.getApplicationContext();
            z = false;
        }
        nbmVar.a = z;
        if (!m()) {
            return this.c.f(file);
        }
        if (this.d.F()) {
            Context context = this.b;
            vsy vsyVar = this.d;
            g = new vxh(context, null, vsyVar.b.a, vsyVar.n(), this.d.l(), null, 0.0f, 0L, null, nbmVar, true, 0L, null);
        } else if (this.d.o() != null) {
            Context context2 = this.b;
            vsy vsyVar2 = this.d;
            g = new vxh(context2, file, vsyVar2.b.a, vsyVar2.n(), this.d.l(), this.d.o(), this.d.e(), this.d.g(), this, nbmVar, false, this.d.a.k, null);
        } else {
            Context context3 = this.b;
            vsy vsyVar3 = this.d;
            g = vxh.g(context3, vsyVar3.b.a, vsyVar3.n(), this.d.l(), nbmVar);
        }
        vxk vxkVar = new vxk(g.c());
        return new alad(vxkVar, vxkVar.b);
    }

    @Override // defpackage.alaf
    public final void j() {
        this.c.j();
    }

    @Override // defpackage.alaf
    public final boolean k() {
        return (this.d.K() || this.d.G()) ? false : true;
    }

    @Override // defpackage.alaf
    public final boolean l() {
        return !m() && this.c.l();
    }

    @Override // defpackage.alaf
    public final avuc g(String str, String str2) {
        double d;
        double d2;
        double d3;
        double d4;
        int i;
        byte[] bArr = new byte[0];
        String str3 = this.g;
        if (str3 != null) {
            File file = new File(str3);
            if (file.exists()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr2);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (IOException e) {
                    zga.d("Error reading video effects state file", e);
                }
            }
        }
        String p = this.d.p();
        long k = this.d.k() - this.d.m();
        double d5 = this.d.d();
        double a2 = this.d.a();
        double b = this.d.b();
        double c = this.d.c();
        amkq.E(d5 >= 0.0d);
        amkq.E(a2 >= 0.0d);
        amkq.E(b >= 0.0d);
        amkq.E(c >= 0.0d);
        amkq.E(d5 + a2 < 1.0d);
        amkq.E(b + c < 1.0d);
        str.getClass();
        if (FilterMapTable$FilterDescriptor.h(p) && (bArr == null || bArr.length == 0)) {
            d = c;
            i = 1;
            d2 = b;
            d3 = a2;
            d4 = d5;
            if (!wcy.J(d5, a2, d2, d)) {
                aone createBuilder = aumz.a.createBuilder();
                createBuilder.copyOnWrite();
                aumz aumzVar = (aumz) createBuilder.instance;
                aumzVar.b |= 1;
                aumzVar.c = str;
                aumz aumzVar2 = (aumz) createBuilder.build();
                aone createBuilder2 = avuc.a.createBuilder();
                createBuilder2.copyOnWrite();
                avuc avucVar = (avuc) createBuilder2.instance;
                aumzVar2.getClass();
                avucVar.c = aumzVar2;
                avucVar.b |= 1;
                return (avuc) createBuilder2.build();
            }
        } else {
            d = c;
            d2 = b;
            d3 = a2;
            d4 = d5;
            i = 1;
        }
        aone createBuilder3 = aumz.a.createBuilder();
        createBuilder3.copyOnWrite();
        aumz aumzVar3 = (aumz) createBuilder3.instance;
        aumzVar3.b |= i;
        aumzVar3.c = str;
        aumz aumzVar4 = (aumz) createBuilder3.build();
        aone createBuilder4 = aqqh.a.createBuilder();
        createBuilder4.copyOnWrite();
        aqqh aqqhVar = (aqqh) createBuilder4.instance;
        aumzVar4.getClass();
        aqqhVar.c = aumzVar4;
        aqqhVar.b = 2;
        aqqh aqqhVar2 = (aqqh) createBuilder4.build();
        aone createBuilder5 = aqqg.a.createBuilder();
        createBuilder5.copyOnWrite();
        aqqg aqqgVar = (aqqg) createBuilder5.instance;
        aqqhVar2.getClass();
        aqqgVar.c = aqqhVar2;
        aqqgVar.b |= i;
        createBuilder5.copyOnWrite();
        aqqg aqqgVar2 = (aqqg) createBuilder5.instance;
        aqqgVar2.d = i;
        aqqgVar2.b |= 2;
        aone createBuilder6 = aqqi.a.createBuilder();
        createBuilder6.copyOnWrite();
        aqqi aqqiVar = (aqqi) createBuilder6.instance;
        aqqiVar.b |= i;
        aqqiVar.c = 0;
        createBuilder6.copyOnWrite();
        aqqi aqqiVar2 = (aqqi) createBuilder6.instance;
        aqqiVar2.b |= 2;
        aqqiVar2.d = (int) k;
        createBuilder5.copyOnWrite();
        aqqg aqqgVar3 = (aqqg) createBuilder5.instance;
        aqqi aqqiVar3 = (aqqi) createBuilder6.build();
        aqqiVar3.getClass();
        aqqgVar3.e = aqqiVar3;
        aqqgVar3.b |= 8;
        aone createBuilder7 = aqqf.a.createBuilder();
        createBuilder7.copyOnWrite();
        aqqf aqqfVar = (aqqf) createBuilder7.instance;
        aqqfVar.c = 13;
        aqqfVar.b |= i;
        aone createBuilder8 = aqqc.a.createBuilder();
        createBuilder8.copyOnWrite();
        aqqc aqqcVar = (aqqc) createBuilder8.instance;
        aqqcVar.b |= i;
        aqqcVar.c = p;
        if (bArr != null) {
            aomf x = aomf.x(bArr);
            createBuilder8.copyOnWrite();
            aqqc aqqcVar2 = (aqqc) createBuilder8.instance;
            aqqcVar2.b |= 2;
            aqqcVar2.d = x;
        }
        aone createBuilder9 = aqqe.a.createBuilder();
        createBuilder9.copyOnWrite();
        aqqe aqqeVar = (aqqe) createBuilder9.instance;
        aqqc aqqcVar3 = (aqqc) createBuilder8.build();
        aqqcVar3.getClass();
        aqqeVar.c = aqqcVar3;
        aqqeVar.b = 2;
        createBuilder7.copyOnWrite();
        aqqf aqqfVar2 = (aqqf) createBuilder7.instance;
        aqqe aqqeVar2 = (aqqe) createBuilder9.build();
        aqqeVar2.getClass();
        aqqfVar2.d = aqqeVar2;
        aqqfVar2.b |= 2;
        createBuilder5.copyOnWrite();
        ((aqqg) createBuilder5.instance).f = aqqg.emptyProtobufList();
        createBuilder5.copyOnWrite();
        aqqg aqqgVar4 = (aqqg) createBuilder5.instance;
        aqqf aqqfVar3 = (aqqf) createBuilder7.build();
        aqqfVar3.getClass();
        aony aonyVar = aqqgVar4.f;
        if (!aonyVar.c()) {
            aqqgVar4.f = aonm.mutableCopy(aonyVar);
        }
        aqqgVar4.f.add(aqqfVar3);
        if (wcy.J(d4, d3, d2, d)) {
            aone createBuilder10 = aqqb.a.createBuilder();
            createBuilder10.copyOnWrite();
            aqqb aqqbVar = (aqqb) createBuilder10.instance;
            aqqbVar.b |= i;
            aqqbVar.c = d4;
            createBuilder10.copyOnWrite();
            aqqb aqqbVar2 = (aqqb) createBuilder10.instance;
            aqqbVar2.b |= 2;
            aqqbVar2.d = d3;
            createBuilder10.copyOnWrite();
            aqqb aqqbVar3 = (aqqb) createBuilder10.instance;
            aqqbVar3.b |= 4;
            aqqbVar3.e = d2;
            createBuilder10.copyOnWrite();
            aqqb aqqbVar4 = (aqqb) createBuilder10.instance;
            aqqbVar4.b |= 8;
            aqqbVar4.f = d;
            createBuilder5.copyOnWrite();
            aqqg aqqgVar5 = (aqqg) createBuilder5.instance;
            aqqb aqqbVar5 = (aqqb) createBuilder10.build();
            aqqbVar5.getClass();
            aqqgVar5.g = aqqbVar5;
            aqqgVar5.b |= 16;
        }
        aone createBuilder11 = aqqj.a.createBuilder();
        createBuilder11.copyOnWrite();
        aqqj aqqjVar = (aqqj) createBuilder11.instance;
        aqqg aqqgVar6 = (aqqg) createBuilder5.build();
        aqqgVar6.getClass();
        aqqjVar.a();
        aqqjVar.b.add(aqqgVar6);
        aqqj aqqjVar2 = (aqqj) createBuilder11.build();
        aone createBuilder12 = avuc.a.createBuilder();
        createBuilder12.copyOnWrite();
        avuc avucVar2 = (avuc) createBuilder12.instance;
        aqqjVar2.getClass();
        avucVar2.d = aqqjVar2;
        avucVar2.b |= 2;
        return (avuc) createBuilder12.build();
    }
}
