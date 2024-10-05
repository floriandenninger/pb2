package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import youtube.client.blocks.runtime.java.NativeBindingRouter;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ammr {
    public final String b;

    public ammr(ammr ammrVar) {
        this.b = ammrVar.b;
    }

    public ammr(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        this.b = sb.toString();
    }

    public ammr(String str, byte[] bArr, byte[] bArr2) {
        this.b = str;
    }

    public ammr(String str, byte[] bArr, char[] cArr) {
        this.b = str;
    }

    public ammr(String str, char[] cArr, byte[] bArr) {
        this.b = str;
    }

    public ammr(String str, int[] iArr) {
        this.b = str;
    }

    public static ammr b(String str) {
        return new ammr(str);
    }

    public static final CharSequence g(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static ammr q(pth pthVar) {
        String str;
        pthVar.H(2);
        int i = pthVar.i();
        int i2 = i >> 1;
        int i3 = (pthVar.i() >> 3) | ((i & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7) {
            str = "dvhe";
        } else if (i2 == 8) {
            str = "hev1";
        } else {
            if (i2 != 9) {
                return null;
            }
            str = "avc3";
        }
        String str2 = i3 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str.length() + 24 + str2.length());
        sb.append(str);
        sb.append(".0");
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        return new ammr(sb.toString(), (byte[]) null, (char[]) null);
    }

    private static String r(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", str2.length() != 0 ? "Unable to format ".concat(str2) : new String("Unable to format "), e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(str2.length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    private static int s(int i) {
        amkq.E(i >= 0);
        return (int) TimeUnit.DAYS.toSeconds(i);
    }

    private static int t(int i) {
        amkq.E(true);
        return (int) TimeUnit.HOURS.toMillis(i);
    }

    private static aone u(int i) {
        aone createBuilder = atby.a.createBuilder();
        createBuilder.copyOnWrite();
        atby atbyVar = (atby) createBuilder.instance;
        atbyVar.e = 2;
        atbyVar.b |= 1;
        y(createBuilder, 3);
        aone createBuilder2 = atbs.a.createBuilder();
        createBuilder2.copyOnWrite();
        atbs atbsVar = (atbs) createBuilder2.instance;
        atbsVar.c = 3;
        atbsVar.b |= 1;
        int i2 = i + 1;
        createBuilder.aA(z(i2 + i2, 7));
        createBuilder2.copyOnWrite();
        atbs atbsVar2 = (atbs) createBuilder2.instance;
        atby atbyVar2 = (atby) createBuilder.build();
        atbyVar2.getClass();
        atbsVar2.d = atbyVar2;
        atbsVar2.b |= 2;
        return createBuilder2;
    }

    private static void v(aone aoneVar) {
        aone createBuilder = atbu.a.createBuilder();
        int t = t(18);
        createBuilder.copyOnWrite();
        atbu atbuVar = (atbu) createBuilder.instance;
        atbuVar.b |= 1;
        atbuVar.c = t;
        int t2 = t(24);
        createBuilder.copyOnWrite();
        atbu atbuVar2 = (atbu) createBuilder.instance;
        atbuVar2.b |= 2;
        atbuVar2.d = t2;
        atbu atbuVar3 = (atbu) createBuilder.build();
        aone createBuilder2 = atbw.b.createBuilder();
        createBuilder2.copyOnWrite();
        atbw atbwVar = (atbw) createBuilder2.instance;
        atbuVar3.getClass();
        aony aonyVar = atbwVar.d;
        if (!aonyVar.c()) {
            atbwVar.d = aonm.mutableCopy(aonyVar);
        }
        atbwVar.d.add(atbuVar3);
        atbw atbwVar2 = (atbw) createBuilder2.build();
        atby atbyVar = ((atbs) aoneVar.instance).d;
        if (atbyVar == null) {
            atbyVar = atby.a;
        }
        aone builder = atbyVar.toBuilder();
        builder.copyOnWrite();
        ((atby) builder.instance).i = atby.emptyProtobufList();
        builder.aB(atbwVar2);
        aoneVar.copyOnWrite();
        atbs atbsVar = (atbs) aoneVar.instance;
        atby atbyVar2 = (atby) builder.build();
        atbyVar2.getClass();
        atbsVar.d = atbyVar2;
        atbsVar.b |= 2;
    }

    private static void w(aone aoneVar) {
        aone createBuilder = atbw.b.createBuilder();
        createBuilder.aC(atay.DAY_OF_WEEK_SATURDAY);
        createBuilder.aC(atay.DAY_OF_WEEK_SUNDAY);
        atbw atbwVar = (atbw) createBuilder.build();
        atby atbyVar = ((atbs) aoneVar.instance).d;
        if (atbyVar == null) {
            atbyVar = atby.a;
        }
        aone builder = atbyVar.toBuilder();
        builder.copyOnWrite();
        ((atby) builder.instance).i = atby.emptyProtobufList();
        builder.aB(atbwVar);
        aoneVar.copyOnWrite();
        atbs atbsVar = (atbs) aoneVar.instance;
        atby atbyVar2 = (atby) builder.build();
        atbyVar2.getClass();
        atbsVar.d = atbyVar2;
        atbsVar.b |= 2;
    }

    private static void x(aone aoneVar, int i, int i2, int i3) {
        aoneVar.copyOnWrite();
        atbs atbsVar = (atbs) aoneVar.instance;
        atbs atbsVar2 = atbs.a;
        atbsVar.c = 1;
        atbsVar.b |= 1;
        aone createBuilder = atby.a.createBuilder();
        createBuilder.copyOnWrite();
        atby atbyVar = (atby) createBuilder.instance;
        atbyVar.e = 2;
        atbyVar.b = 1 | atbyVar.b;
        y(createBuilder, i);
        createBuilder.aA(z(i2, i3));
        aoneVar.copyOnWrite();
        atbs atbsVar3 = (atbs) aoneVar.instance;
        atby atbyVar2 = (atby) createBuilder.build();
        atbyVar2.getClass();
        atbsVar3.d = atbyVar2;
        atbsVar3.b |= 2;
    }

    private static void y(aone aoneVar, int i) {
        aone createBuilder = atbv.a.createBuilder();
        createBuilder.copyOnWrite();
        atbv atbvVar = (atbv) createBuilder.instance;
        atbvVar.c = i - 1;
        atbvVar.b |= 1;
        aone createBuilder2 = atbu.a.createBuilder();
        createBuilder2.copyOnWrite();
        atbu atbuVar = (atbu) createBuilder2.instance;
        atbuVar.b |= 1;
        atbuVar.c = 0;
        createBuilder2.copyOnWrite();
        atbu atbuVar2 = (atbu) createBuilder2.instance;
        atbuVar2.b |= 2;
        atbuVar2.d = 0;
        createBuilder.copyOnWrite();
        atbv atbvVar2 = (atbv) createBuilder.instance;
        atbu atbuVar3 = (atbu) createBuilder2.build();
        atbuVar3.getClass();
        atbvVar2.d = atbuVar3;
        atbvVar2.b |= 2;
        aoneVar.copyOnWrite();
        atby atbyVar = (atby) aoneVar.instance;
        atbv atbvVar3 = (atbv) createBuilder.build();
        atby atbyVar2 = atby.a;
        atbvVar3.getClass();
        aony aonyVar = atbyVar.c;
        if (!aonyVar.c()) {
            atbyVar.c = aonm.mutableCopy(aonyVar);
        }
        atbyVar.c.add(atbvVar3);
    }

    private static atbt z(int i, int i2) {
        aone createBuilder = atbt.a.createBuilder();
        createBuilder.copyOnWrite();
        atbt atbtVar = (atbt) createBuilder.instance;
        atbtVar.c = 1;
        atbtVar.b |= 1;
        aone createBuilder2 = atbu.a.createBuilder();
        createBuilder2.copyOnWrite();
        atbu atbuVar = (atbu) createBuilder2.instance;
        atbuVar.b = 1 | atbuVar.b;
        atbuVar.c = i;
        createBuilder2.copyOnWrite();
        atbu atbuVar2 = (atbu) createBuilder2.instance;
        atbuVar2.b |= 2;
        atbuVar2.d = i;
        createBuilder.copyOnWrite();
        atbt atbtVar2 = (atbt) createBuilder.instance;
        atbu atbuVar3 = (atbu) createBuilder2.build();
        atbuVar3.getClass();
        atbtVar2.d = atbuVar3;
        atbtVar2.b |= 2;
        int s = s(i2);
        createBuilder.copyOnWrite();
        atbt atbtVar3 = (atbt) createBuilder.instance;
        atbtVar3.b |= 4;
        atbtVar3.e = s;
        return (atbt) createBuilder.build();
    }

    public void a(Appendable appendable, Iterator it) {
        if (it.hasNext()) {
            appendable.append(g(it.next()));
            while (it.hasNext()) {
                appendable.append(this.b);
                appendable.append(g(it.next()));
            }
        }
    }

    public final ammr c() {
        return new ammp(this, this);
    }

    public final String d(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        f(sb, it);
        return sb.toString();
    }

    public final String e(Object obj, Object obj2, Object... objArr) {
        return d(new ammq(objArr, obj, obj2));
    }

    public final void f(StringBuilder sb, Iterator it) {
        try {
            a(sb, it);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void h(String str) {
        Log.e("SetupLibrary", this.b.concat(str));
    }

    public final void i(String str, Throwable th) {
        Log.e("SetupLibrary", this.b.concat(str), th);
    }

    public final void j(String str) {
        Log.w("SetupLibrary", this.b.concat(str));
    }

    public final void k(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", r(this.b, str, objArr));
        }
    }

    public final void l(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", r(this.b, str, objArr), th);
        }
    }

    public final void m(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", r(this.b, str, objArr));
        }
    }

    public final List n() {
        if (adyu.bW(this.b)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        aone createBuilder = atbr.a.createBuilder();
        createBuilder.copyOnWrite();
        atbr atbrVar = (atbr) createBuilder.instance;
        atbrVar.c = 1;
        atbrVar.b |= 1;
        createBuilder.copyOnWrite();
        atbr atbrVar2 = (atbr) createBuilder.instance;
        atbrVar2.b |= 2;
        atbrVar2.d = 150;
        createBuilder.copyOnWrite();
        atbr atbrVar3 = (atbr) createBuilder.instance;
        atbrVar3.b |= 8;
        atbrVar3.f = 10;
        createBuilder.copyOnWrite();
        atbr atbrVar4 = (atbr) createBuilder.instance;
        atbrVar4.b |= 16;
        atbrVar4.g = 1500;
        int s = s(7);
        createBuilder.copyOnWrite();
        atbr atbrVar5 = (atbr) createBuilder.instance;
        atbrVar5.b |= 4;
        atbrVar5.e = s;
        arrayList.add((atbr) createBuilder.build());
        aone createBuilder2 = atbr.a.createBuilder();
        createBuilder2.copyOnWrite();
        atbr atbrVar6 = (atbr) createBuilder2.instance;
        atbrVar6.c = 3;
        atbrVar6.b = 1 | atbrVar6.b;
        createBuilder2.copyOnWrite();
        atbr atbrVar7 = (atbr) createBuilder2.instance;
        atbrVar7.b |= 2;
        atbrVar7.d = 200;
        createBuilder2.copyOnWrite();
        atbr atbrVar8 = (atbr) createBuilder2.instance;
        atbrVar8.b |= 8;
        atbrVar8.f = 5;
        createBuilder2.copyOnWrite();
        atbr atbrVar9 = (atbr) createBuilder2.instance;
        atbrVar9.b |= 16;
        atbrVar9.g = 3000;
        int s2 = s(44);
        createBuilder2.copyOnWrite();
        atbr atbrVar10 = (atbr) createBuilder2.instance;
        atbrVar10.b |= 4;
        atbrVar10.e = s2;
        arrayList.add((atbr) createBuilder2.build());
        return arrayList;
    }

    public final List o() {
        int i;
        int i2;
        if (adyu.bW(this.b)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < 5) {
            if (i3 == 0) {
                i3 = 0;
                i = 0;
                i2 = 3;
            } else {
                i = i3;
                i2 = 4;
            }
            int pow = i3 == 0 ? 0 : (int) (Math.pow(2.0d, i3 - 1) * 30.0d);
            int i4 = i3 + i3;
            aone createBuilder = atbs.a.createBuilder();
            x(createBuilder, i2, i4, pow);
            v(createBuilder);
            arrayList.add((atbs) createBuilder.build());
            aone createBuilder2 = atbs.a.createBuilder();
            x(createBuilder2, i2, i4, pow);
            w(createBuilder2);
            arrayList.add((atbs) createBuilder2.build());
            i3 = i + 1;
            int i5 = (i3 + i3) - 1;
            aone createBuilder3 = atbs.a.createBuilder();
            x(createBuilder3, 3, i5, 7);
            v(createBuilder3);
            arrayList.add((atbs) createBuilder3.build());
            aone createBuilder4 = atbs.a.createBuilder();
            x(createBuilder4, 3, i5, 7);
            w(createBuilder4);
            arrayList.add((atbs) createBuilder4.build());
            aone u = u(i);
            v(u);
            arrayList.add((atbs) u.build());
            aone u2 = u(i);
            w(u2);
            arrayList.add((atbs) u2.build());
        }
        return arrayList;
    }

    public final boolean p() {
        if (amsx.w("com.android.vending", "com.google.android.GoogleCamera", "com.google.android.GoogleCameraEng", "com.google.android.apps.docs", "com.google.android.apps.docs.editors.docs", "com.google.android.apps.docs.editors.sheets", "com.google.android.apps.docs.editors.slides", "com.google.android.apps.geo.food.omniapp.nomni", "com.google.android.apps.gmm", "com.google.android.apps.gmm.ads.label.testing.app", "com.google.android.apps.gmm.search.map.testing.app", "com.google.android.apps.googlecamera.fishfood", "com.google.android.apps.jamkiosk", "com.google.android.apps.messaging", "com.google.android.apps.tasks", "com.google.android.apps.tasks.ui.scuba", "com.google.android.apps.work.clouddpc", "com.google.android.apps.work.clouddpc.arc", "com.google.android.apps.youtube.creator", "com.google.android.apps.youtube.kids", "com.google.android.apps.youtube.mango", "com.google.android.apps.youtube.music", "com.google.android.apps.youtube.unplugged", "com.google.android.apps.youtube.vr", "com.google.android.apps.youtube.vr.oculus", "com.google.android.gms", "com.google.android.googlequicksearchbox", "com.google.android.inputmethod.latin", "com.google.android.inputmethod.latin.canary", "com.google.android.inputmethod.latin.dev", "com.google.android.play.games", "com.google.android.youtube", "com.google.android.youtube.tv", "com.google.intelligence.sense.ambientmusic.functional.emulator", "com.google.intelligence.sense.ambientmusic.history.functional").contains(this.b)) {
            return true;
        }
        return amsx.w("com.google.android.apps.accessibility.reveal", "com.google.android.apps.adwords", "com.google.android.apps.adwords.devel", "com.google.android.apps.adwords.dogfood", "com.google.android.apps.adwords.fishfood", "com.google.android.apps.adwords.nightly", "com.google.android.apps.diagnosticstool", "com.google.android.apps.dragonfly", "com.google.android.apps.gmm.home.cards.yourexplore", "com.google.android.apps.internal.admobsdk.mediumtest.stability", "com.google.android.apps.nbu.paisa.user.integration.home", "com.google.android.apps.nbu.paisa.user.integration.homescreen", "com.google.android.apps.nbu.paisa.user.integration.microapp", "com.google.android.apps.nbu.paisa.user.integration.qrcode", "com.google.android.flutter.testing.integrationtest.skeleton", "com.google.android.libraries.performance.primes.sample.profiling.application", "com.google.android.marvin.talkback", "com.google.android.street").contains(this.b);
    }

    public ammr(rto rtoVar) {
        this.b = rtoVar.a;
        amru.o(rtoVar.b);
        amru.o(rtoVar.c);
    }

    public ammr(Context context) {
        this.b = context.getPackageName();
    }

    public ammr() {
        this("debug.properties.can_override", (int[]) null);
    }

    public ammr(int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(i, 35719, iArr, 0);
        int i3 = iArr[0];
        byte[] bArr = new byte[i3];
        int[] iArr2 = new int[1];
        GLES20.glGetActiveUniform(i, i2, i3, iArr2, 0, new int[1], 0, new int[1], 0, bArr, 0);
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            if (bArr[i4] == 0) {
                i3 = i4;
                break;
            }
            i4++;
        }
        String str = new String(bArr, 0, i3);
        this.b = str;
        GLES20.glGetUniformLocation(i, str);
        wcy.F("Initializing uniform");
    }

    public ammr(String str, String str2) {
        str.getClass();
        this.b = str;
        str2.getClass();
    }

    public ammr(String str, char[] cArr) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.b = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public ammr(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder(str.length() + 3);
        sb.append("[");
        sb.append(str);
        sb.append("] ");
        this.b = sb.toString();
    }

    public ammr(String str) {
        str.getClass();
        this.b = str;
    }

    public ammr(String str, short[] sArr) {
        this.b = str;
        NativeBindingRouter nativeBindingRouter = NativeBindingRouter.a;
        aong aongVar = (aong) awkg.a.createBuilder();
        aone createBuilder = awlx.a.createBuilder();
        createBuilder.copyOnWrite();
        awlx awlxVar = (awlx) createBuilder.instance;
        str.getClass();
        awlxVar.b |= 2;
        awlxVar.c = str;
        aongVar.copyOnWrite();
        awkg awkgVar = (awkg) aongVar.instance;
        awlx awlxVar2 = (awlx) createBuilder.build();
        awlxVar2.getClass();
        awkgVar.c = awlxVar2;
        awkgVar.b = 18;
        nativeBindingRouter.nativeCallSyncBinding(((awkg) aongVar.build()).toByteArray());
        basa.a.c.put(str, this);
    }
}
