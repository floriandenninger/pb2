package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import com.google.android.apps.youtube.app.settings.SettingsActivity;
import com.google.android.youtube.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class trp {
    public final Context a;

    public trp() {
    }

    public trp(Context context, byte[] bArr) {
        this.a = context;
    }

    public trp(Context context, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = context.getApplicationContext();
    }

    public trp(Context context, byte[] bArr, char[] cArr) {
        this.a = context;
    }

    public trp(Context context, byte[] bArr, short[] sArr) {
        this();
        this.a = context;
    }

    public trp(Context context, char[] cArr) {
        this.a = context;
    }

    public trp(Context context, int[] iArr) {
        this.a = context;
    }

    public trp(Context context, short[] sArr) {
        this.a = context;
    }

    public static apmh g(String str) {
        aone createBuilder = apmh.a.createBuilder();
        aong aongVar = (aong) apmg.a.createBuilder();
        aqyg g = ajcq.g(str);
        aongVar.copyOnWrite();
        apmg apmgVar = (apmg) aongVar.instance;
        g.getClass();
        apmgVar.i = g;
        apmgVar.b |= 256;
        apmg apmgVar2 = (apmg) aongVar.build();
        createBuilder.copyOnWrite();
        apmh apmhVar = (apmh) createBuilder.instance;
        apmgVar2.getClass();
        apmhVar.c = apmgVar2;
        apmhVar.b |= 1;
        return (apmh) createBuilder.build();
    }

    public static final boolean i(vxh vxhVar, FileOutputStream fileOutputStream) {
        try {
            vxhVar.c().a().k(fileOutputStream.getChannel());
            return true;
        } catch (IOException e) {
            afsi.c(2, 24, "Failed to remux the media file", e);
            return false;
        }
    }

    public static final void n(Context context, dwf dwfVar) {
        new Thread(new dvu(context, dwfVar)).start();
    }

    private final ywz q() {
        amrg amrgVar = new amrg();
        amrgVar.d(this.a.getString(R.string.off), evp.BACKGROUND_AUDIO_POLICY_OFF);
        amrgVar.d(this.a.getString(R.string.on_if_hh), evp.BACKGROUND_AUDIO_POLICY_ON_IF_HEADPHONES);
        amrgVar.d(this.a.getString(R.string.on), evp.BACKGROUND_AUDIO_POLICY_ON);
        return new ywz(this.a.getString(R.string.background_audio_policy_default), evp.BACKGROUND_AUDIO_POLICY_UNSPECIFIED, amrgVar.b());
    }

    public final int a(String str) {
        return this.a.checkCallingOrSelfPermission(str);
    }

    public final int b(String str, String str2) {
        return this.a.getPackageManager().checkPermission(str, str2);
    }

    public final ApplicationInfo c(String str, int i) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo d(String str, int i) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public final boolean e() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return oba.X(this.a);
        }
        if (!oba.aa() || (nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.a.getPackageManager().isInstantApp(nameForUid);
    }

    public final Intent f() {
        return new Intent(this.a, (Class<?>) SettingsActivity.class);
    }

    public final boolean h(File file, long j, long j2, FileOutputStream fileOutputStream) {
        fileOutputStream.getClass();
        return i(vxh.f(this.a, Uri.fromFile(file), j, j2), fileOutputStream);
    }

    public final CharSequence j(int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.a.getString(i));
        spannableStringBuilder.setSpan(new TextAppearanceSpan(this.a, R.style.TextAppearance_YouTube_Body1), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final CharSequence k(int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.a.getString(i));
        spannableStringBuilder.setSpan(new TextAppearanceSpan(this.a, R.style.TextAppearance_YouTube_Subhead), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final evp l(String str) {
        return (evp) q().a.apply(str);
    }

    public final String m(evp evpVar) {
        return (String) q().b.apply(evpVar);
    }

    public final void o(String str, long j) {
        try {
            Context context = this.a;
            dwf dwfVar = new dwf();
            dwfVar.a = str;
            dwfVar.b = true;
            dwfVar.f = true;
            dwfVar.e = TimeUnit.MILLISECONDS.toSeconds(j);
            n(context, dwfVar);
        } catch (Exception e) {
            Log.e("GoogleConversionReporter", "Error sending ping", e);
        }
    }

    public final boolean p() {
        return abp.c(this.a);
    }

    public trp(Context context, byte[] bArr, byte[] bArr2) {
        Context applicationContext = context.getApplicationContext();
        qip.an(applicationContext);
        this.a = applicationContext;
    }

    public trp(Context context) {
        this.a = context.getApplicationContext();
    }
}
